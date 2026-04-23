package org.netbeans.lib.awtextra;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager2;
import java.io.Serializable;

public class AbsoluteLayout implements LayoutManager2, Serializable {
    private Nodo inicio;

    private static class Nodo {
        Component componente;
        AbsoluteConstraints constraints;
        Nodo siguiente;

        Nodo(Component componente, AbsoluteConstraints constraints) {
            this.componente = componente;
            this.constraints = constraints;
        }
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        if (inicio == null) {
            return;
        }
        if (inicio.componente == comp) {
            inicio = inicio.siguiente;
            return;
        }
        Nodo actual = inicio;
        while (actual.siguiente != null) {
            if (actual.siguiente.componente == comp) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return calculateLayoutSize(parent, true);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return calculateLayoutSize(parent, false);
    }

    @Override
    public void layoutContainer(Container parent) {
        for (Component comp : parent.getComponents()) {
            AbsoluteConstraints ac = buscar(comp);
            if (ac == null) {
                continue;
            }
            Dimension pref = comp.getPreferredSize();
            int width = ac.width == -1 ? pref.width : ac.width;
            int height = ac.height == -1 ? pref.height : ac.height;
            comp.setBounds(ac.x, ac.y, width, height);
        }
    }

    @Override
    public void addLayoutComponent(Component comp, Object constraint) {
        AbsoluteConstraints valor;
        if (constraint instanceof AbsoluteConstraints) {
            valor = (AbsoluteConstraints) constraint;
        } else {
            valor = new AbsoluteConstraints(0, 0, -1, -1);
        }
        guardar(comp, valor);
    }

    @Override
    public Dimension maximumLayoutSize(Container target) {
        return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Override
    public float getLayoutAlignmentX(Container target) {
        return 0.0f;
    }

    @Override
    public float getLayoutAlignmentY(Container target) {
        return 0.0f;
    }

    @Override
    public void invalidateLayout(Container target) {
    }

    private void guardar(Component comp, AbsoluteConstraints constraints) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.componente == comp) {
                actual.constraints = constraints;
                return;
            }
            actual = actual.siguiente;
        }
        Nodo nuevo = new Nodo(comp, constraints);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    private AbsoluteConstraints buscar(Component comp) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.componente == comp) {
                return actual.constraints;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    private Dimension calculateLayoutSize(Container parent, boolean preferred) {
        int maxWidth = 0;
        int maxHeight = 0;
        for (Component comp : parent.getComponents()) {
            AbsoluteConstraints ac = buscar(comp);
            if (ac == null) {
                continue;
            }
            Dimension size = preferred ? comp.getPreferredSize() : comp.getMinimumSize();
            int width = ac.width == -1 ? size.width : ac.width;
            int height = ac.height == -1 ? size.height : ac.height;
            if (ac.x + width > maxWidth) {
                maxWidth = ac.x + width;
            }
            if (ac.y + height > maxHeight) {
                maxHeight = ac.y + height;
            }
        }
        return new Dimension(maxWidth, maxHeight);
    }
}

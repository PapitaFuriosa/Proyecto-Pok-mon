package org.netbeans.lib.awtextra;

import java.awt.Point;
import java.awt.Dimension;
import java.io.Serializable;

public class AbsoluteConstraints implements Serializable {
    public int x;
    public int y;
    public int width;
    public int height;

    public AbsoluteConstraints(int x, int y) {
        this(x, y, -1, -1);
    }

    public AbsoluteConstraints(Point pos) {
        this(pos.x, pos.y);
    }

    public AbsoluteConstraints(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public AbsoluteConstraints(Point pos, Dimension size) {
        this(pos.x, pos.y, size.width, size.height);
    }
}
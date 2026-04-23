/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Labels.Label_Selecc_Pokemon;

import Labels.Label_Info.Informacion;
import Labels.Label_pelea.Pelea;
import Labels.Labels_Torneo.Torneo;
import com.mycompany.main.FabricaPokemon;
import com.mycompany.main.Jugador;
import com.mycompany.main.Pokemon;
import javax.swing.JOptionPane;

public class Seleccion_Pokemon extends javax.swing.JFrame {

    String nombre;

    public Seleccion_Pokemon() {
        initComponents();
        configurarVista();
    }

    public Seleccion_Pokemon(String nombreGuardado) {
        initComponents();
        this.nombre = nombreGuardado;
        configurarVista();
    }

    private void configurarVista() {
        setTitle("Seleccion de Pokemon");
        setLocationRelativeTo(null);
    }

    private Pokemon crearPokemon(String nombrePokemon) {
        return FabricaPokemon.crearPokemon(nombrePokemon);
    }

    private void cargarEquipoCpu(Jugador cpu) {
        java.util.Random random = new java.util.Random();
        int opcion1 = random.nextInt(10);
        int opcion2 = random.nextInt(10);
        while (opcion2 == opcion1) {
            opcion2 = random.nextInt(10);
        }
        int opcion3 = random.nextInt(10);
        while (opcion3 == opcion1 || opcion3 == opcion2) {
            opcion3 = random.nextInt(10);
        }
        int opcion4 = random.nextInt(10);
        while (opcion4 == opcion1 || opcion4 == opcion2 || opcion4 == opcion3) {
            opcion4 = random.nextInt(10);
        }

        cpu.agregarPokemon(crearPokemonPorIndice(opcion1));
        cpu.agregarPokemon(crearPokemonPorIndice(opcion2));
        cpu.agregarPokemon(crearPokemonPorIndice(opcion3));
        cpu.agregarPokemon(crearPokemonPorIndice(opcion4));
    }

    private Pokemon crearPokemonPorIndice(int indice) {
        switch (indice) {
            case 0:
                return crearPokemon("Charmander");
            case 1:
                return crearPokemon("Squirtle");
            case 2:
                return crearPokemon("Pidgey");
            case 3:
                return crearPokemon("Pikachu");
            case 4:
                return crearPokemon("Sandshrew");
            case 5:
                return crearPokemon("Diglett");
            case 6:
                return crearPokemon("Ponyta");
            case 7:
                return crearPokemon("Psyduck");
            case 8:
                return crearPokemon("Spearow");
            default:
                return crearPokemon("Jolteon");
        }
    }

    private String nombreCpuRandom() {
        int opcion = new java.util.Random().nextInt(10);
        if (opcion == 0) {
            return "AshBot";
        }
        if (opcion == 1) {
            return "Gary.exe";
        }
        if (opcion == 2) {
            return "Team Rocket";
        }
        if (opcion == 3) {
            return "Red AI";
        }
        if (opcion == 4) {
            return "Blue CPU";
        }
        if (opcion == 5) {
            return "Dark Trainer";
        }
        if (opcion == 6) {
            return "Elite Bot";
        }
        if (opcion == 7) {
            return "Master AI";
        }
        if (opcion == 8) {
            return "Rival X";
        }
        return "CPU Legend";
    }

    private Jugador crearJugadorDesdeSeleccion() {
        String nombreJugador = this.nombre;

        if (nombreJugador == null || nombreJugador.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese su nombre.");
            return null;
        }

        String p1 = cbPokemon1.getSelectedItem().toString();
        String p2 = cbPokemon2.getSelectedItem().toString();
        String p3 = cbPokemon3.getSelectedItem().toString();
        String p4 = cbPokemon4.getSelectedItem().toString();

        if (p1.equals("Pokemon 1") || p2.equals("Pokemon 2") || p3.equals("Pokemon 3") || p4.equals("Pokemon 4")) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar los 4 Pokemon.");
            return null;
        }

        if (p1.equals(p2) || p1.equals(p3) || p1.equals(p4) || p2.equals(p3) || p2.equals(p4) || p3.equals(p4)) {
            JOptionPane.showMessageDialog(this, "No puede repetir Pokemon.");
            return null;
        }

        Jugador jugadorLocal = new Jugador(nombreJugador);
        jugadorLocal.agregarPokemon(crearPokemon(p1));
        jugadorLocal.agregarPokemon(crearPokemon(p2));
        jugadorLocal.agregarPokemon(crearPokemon(p3));
        jugadorLocal.agregarPokemon(crearPokemon(p4));
        return jugadorLocal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        Panelbase = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        iconoPikachu = new javax.swing.JLabel();
        iconoCharmander = new javax.swing.JLabel();
        iconoSquirtle = new javax.swing.JLabel();
        iconoPidgey = new javax.swing.JLabel();
        iconoDiglett = new javax.swing.JLabel();
        iconoPsyduck = new javax.swing.JLabel();
        iconoShuffle = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbPokemon1 = new javax.swing.JComboBox<>();
        cbPokemon3 = new javax.swing.JComboBox<>();
        cbPokemon2 = new javax.swing.JComboBox<>();
        cbPokemon4 = new javax.swing.JComboBox<>();
        btnBatalla = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblNota = new javax.swing.JLabel();
        lblPikachu = new javax.swing.JLabel();
        lblCharmander = new javax.swing.JLabel();
        lblSquirtle = new javax.swing.JLabel();
        lblPidgey = new javax.swing.JLabel();
        lblDiglett = new javax.swing.JLabel();
        lblPsyduck = new javax.swing.JLabel();
        lblShuflle = new javax.swing.JLabel();
        btnTorneo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panelbase.setBackground(new java.awt.Color(255, 248, 220));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("\u00A1Selecciona tus pokemons!");

        iconoPikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pikachu (1).png"))); // NOI18N

        iconoCharmander.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jugar.png"))); // NOI18N

        iconoSquirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/chirrido.png"))); // NOI18N

        iconoPidgey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pidgey (1).png"))); // NOI18N

        iconoDiglett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar (3).png"))); // NOI18N

        iconoPsyduck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/psyduck (1).png"))); // NOI18N

        iconoShuffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/avatar (2).png"))); // NOI18N

        cbPokemon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokemon 1", "Charmander", "Squirtle", "Pidgey", "Pikachu", "Sandshrew", "Diglett", "Ponyta", "Psyduck", "Spearow", "Jolteon" }));
        cbPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPokemon1ActionPerformed(evt);
            }
        });

        cbPokemon3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokemon 3", "Charmander", "Squirtle", "Pidgey", "Pikachu", "Sandshrew", "Diglett", "Ponyta", "Psyduck", "Spearow", "Jolteon" }));
        cbPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPokemon3ActionPerformed(evt);
            }
        });

        cbPokemon2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokemon 2", "Charmander", "Squirtle", "Pidgey", "Pikachu", "Sandshrew", "Diglett", "Ponyta", "Psyduck", "Spearow", "Jolteon" }));
        cbPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPokemon2ActionPerformed(evt);
            }
        });

        cbPokemon4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pokemon 4", "Charmander", "Squirtle", "Pidgey", "Pikachu", "Sandshrew", "Diglett", "Ponyta", "Psyduck", "Spearow", "Jolteon" }));
        cbPokemon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPokemon4ActionPerformed(evt);
            }
        });

        btnBatalla.setText("Empieza la batalla");
        btnBatalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBatallaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBatallaMouseExited(evt);
            }
        });
        btnBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatallaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblNota.setText("Nota: no se puede repetir pokemones");

        lblPikachu.setForeground(new java.awt.Color(51, 0, 51));
        lblPikachu.setText("Pikachu");

        lblCharmander.setForeground(new java.awt.Color(51, 0, 51));
        lblCharmander.setText("Charmander");

        lblSquirtle.setForeground(new java.awt.Color(51, 0, 51));
        lblSquirtle.setText("Squirtle");

        lblPidgey.setForeground(new java.awt.Color(51, 0, 51));
        lblPidgey.setText("Pidgey");

        lblDiglett.setForeground(new java.awt.Color(51, 0, 51));
        lblDiglett.setText("Diglett");

        lblPsyduck.setForeground(new java.awt.Color(51, 0, 51));
        lblPsyduck.setText("Psyduck");

        lblShuflle.setForeground(new java.awt.Color(51, 0, 51));
        lblShuflle.setText("Shuffle");

        btnTorneo.setText("Torneo");
        btnTorneo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTorneoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTorneoMouseExited(evt);
            }
        });
        btnTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelbaseLayout = new javax.swing.GroupLayout(Panelbase);
        Panelbase.setLayout(PanelbaseLayout);
        PanelbaseLayout.setHorizontalGroup(
            PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbaseLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addComponent(lblPikachu)
                        .addGap(23, 23, 23)
                        .addComponent(lblCharmander))
                    .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelbaseLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblPidgey)
                            .addGap(58, 58, 58)
                            .addComponent(lblDiglett))
                        .addGroup(PanelbaseLayout.createSequentialGroup()
                            .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(iconoPikachu, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                .addComponent(iconoPidgey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelbaseLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(iconoDiglett))
                                .addGroup(PanelbaseLayout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(iconoCharmander))
                                .addGroup(PanelbaseLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PanelbaseLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(lblShuflle))
                                        .addComponent(iconoShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(52, 52, 52)
                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPsyduck)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoSquirtle)
                            .addComponent(iconoPsyduck)
                            .addComponent(jLabel10))
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelbaseLayout.createSequentialGroup()
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelbaseLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelbaseLayout.createSequentialGroup()
                                        .addGap(278, 278, 278)
                                        .addComponent(cbPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPokemon2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPokemon4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbaseLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbaseLayout.createSequentialGroup()
                                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNota)
                                        .addGap(108, 108, 108))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbaseLayout.createSequentialGroup()
                                        .addComponent(btnTorneo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBatalla)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalir)
                                        .addGap(27, 27, 27))))))
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblSquirtle)
                        .addContainerGap())))
        );
        PanelbaseLayout.setVerticalGroup(
            PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelbaseLayout.createSequentialGroup()
                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(iconoPikachu)
                                .addComponent(iconoCharmander))
                            .addComponent(iconoSquirtle)))
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNota)
                        .addGap(78, 78, 78)
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbaseLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPokemon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160))
                    .addGroup(PanelbaseLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPikachu)
                            .addComponent(lblCharmander)
                            .addComponent(lblSquirtle))
                        .addGap(41, 41, 41)
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(iconoDiglett, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(iconoPidgey)
                                    .addComponent(iconoPsyduck)))
                            .addComponent(jLabel11))
                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelbaseLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBatalla)
                                    .addComponent(btnTorneo)
                                    .addComponent(btnSalir))
                                .addGap(51, 51, 51))
                            .addGroup(PanelbaseLayout.createSequentialGroup()
                                .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelbaseLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblPidgey)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel10))
                                    .addGroup(PanelbaseLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(PanelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPsyduck)
                                            .addComponent(lblDiglett))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(iconoShuffle)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblShuflle)
                                .addContainerGap(12, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatallaActionPerformed
        Jugador jugadorLocal = crearJugadorDesdeSeleccion();
        if (jugadorLocal == null) {
            return;
        }

        Jugador cpu = new Jugador(nombreCpuRandom());
        cargarEquipoCpu(cpu);

        Pelea pelea = new Pelea(jugadorLocal, cpu);
        pelea.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBatallaActionPerformed

    private void cbPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPokemon1ActionPerformed
    }//GEN-LAST:event_cbPokemon1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Informacion informacion = nombre != null && !nombre.trim().isEmpty() ? new Informacion(nombre) : new Informacion();
        informacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPokemon2ActionPerformed
    }//GEN-LAST:event_cbPokemon2ActionPerformed

    private void cbPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPokemon3ActionPerformed
    }//GEN-LAST:event_cbPokemon3ActionPerformed

    private void cbPokemon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPokemon4ActionPerformed
    }//GEN-LAST:event_cbPokemon4ActionPerformed

    private void btnBatallaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatallaMouseEntered
        btnBatalla.setBackground(new java.awt.Color(210, 195, 150));
    }//GEN-LAST:event_btnBatallaMouseEntered

    private void btnBatallaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatallaMouseExited
        btnBatalla.setBackground(new java.awt.Color(220, 220, 220));
    }//GEN-LAST:event_btnBatallaMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new java.awt.Color(210, 195, 150));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new java.awt.Color(220, 220, 220));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnTorneoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTorneoMouseEntered
        btnTorneo.setBackground(new java.awt.Color(210, 195, 150));
    }//GEN-LAST:event_btnTorneoMouseEntered

    private void btnTorneoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTorneoMouseExited
        btnTorneo.setBackground(new java.awt.Color(220, 220, 220));
    }//GEN-LAST:event_btnTorneoMouseExited

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
        Jugador jugadorLocal = crearJugadorDesdeSeleccion();
        if (jugadorLocal == null) {
            return;
        }

        Torneo torneo = new Torneo(jugadorLocal);
        torneo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTorneoActionPerformed

    public static void main(String args[]) {
        try {
        } catch (Exception ex) {
        }

        java.awt.EventQueue.invokeLater(() -> new Seleccion_Pokemon().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panelbase;
    private javax.swing.JButton btnBatalla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JComboBox<String> cbPokemon1;
    private javax.swing.JComboBox<String> cbPokemon2;
    private javax.swing.JComboBox<String> cbPokemon3;
    private javax.swing.JComboBox<String> cbPokemon4;
    private javax.swing.JLabel iconoCharmander;
    private javax.swing.JLabel iconoDiglett;
    private javax.swing.JLabel iconoPidgey;
    private javax.swing.JLabel iconoPikachu;
    private javax.swing.JLabel iconoPsyduck;
    private javax.swing.JLabel iconoShuffle;
    private javax.swing.JLabel iconoSquirtle;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCharmander;
    private javax.swing.JLabel lblDiglett;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblPidgey;
    private javax.swing.JLabel lblPikachu;
    private javax.swing.JLabel lblPsyduck;
    private javax.swing.JLabel lblShuflle;
    private javax.swing.JLabel lblSquirtle;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}

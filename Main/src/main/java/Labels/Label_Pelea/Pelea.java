/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Labels.Label_pelea;

import Labels.Label_Selecc_Pokemon.Seleccion_Pokemon;

import com.mycompany.main.Batalla;
import com.mycompany.main.Jugador;
import com.mycompany.main.Pokemon;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;

public class Pelea extends javax.swing.JFrame {

    private Jugador jugador;
    private Jugador cpu;

    private boolean jugadorDefendio = false;
    private boolean jugadorDefensaEspecialActiva = false;
    private boolean cpuDefendio = false;
    private boolean cpuDefensaEspecialActiva = false;

    public Pelea(Jugador jugador, Jugador cpu) {
        initComponents();
        this.jugador = jugador;
        this.cpu = cpu;
        configurarVista();
        actualizarPantalla();
        escribirResumen("La batalla empieza entre " + jugador.nombre + " y " + cpu.nombre + ".");
    }

    private void configurarVista() {
        setTitle("Batalla Pokemon 1 vs 1");
        setLocationRelativeTo(null);

        txtPreview.setEditable(false);
        txtPreview.setLineWrap(true);
        txtPreview.setWrapStyleWord(true);

        lblimagenpokemonjugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagenpokemonjugador.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagenpokemonjugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblimagenpokemonjugador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblimagenpokemonjugador.setForeground(Color.WHITE);

        lblimagencpu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagencpu.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagencpu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblimagencpu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lblimagencpu.setForeground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        BtnAtacar = new javax.swing.JButton();
        BtnDefender = new javax.swing.JButton();
        BtnAtaqueEspecial = new javax.swing.JButton();
        BtnDefensaEspecial = new javax.swing.JButton();
        BtnHuir = new javax.swing.JButton();
        barraVidaJugador = new javax.swing.JProgressBar();
        lblPokemonJugador = new javax.swing.JLabel();
        lblPokemonCpu = new javax.swing.JLabel();
        lblNombreJugador = new javax.swing.JLabel();
        lblNombreCpu = new javax.swing.JLabel();
        lblContAtaque = new javax.swing.JLabel();
        lblContDefensa = new javax.swing.JLabel();
        lblimagenpokemonjugador = new javax.swing.JLabel();
        lblimagencpu = new javax.swing.JLabel();
        PanelTextoBatalla = new javax.swing.JPanel();
        txtPreview = new javax.swing.JTextArea();
        barraVidaCpu = new javax.swing.JProgressBar();
        lblfondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5445, 627, -1, -1));

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1083, Short.MAX_VALUE)
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );

        jLayeredPane4.setLayer(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jLayeredPane3.setLayer(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3918, 627, -1, -1));

        jButton2.setText("jButton2");

        jLayeredPane7.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap())
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLayeredPane1.add(jLayeredPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2748, 374, -1, -1));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1247, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );

        jLayeredPane8.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jLayeredPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1483, 60, -1, -1));

        BtnAtacar.setText("Atacar");
        BtnAtacar.addActionListener(this::BtnAtacarActionPerformed);
        jLayeredPane1.add(BtnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        BtnDefender.setText("Defender");
        BtnDefender.addActionListener(this::BtnDefenderActionPerformed);
        jLayeredPane1.add(BtnDefender, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, -1, -1));

        BtnAtaqueEspecial.setText("Ataque especial");
        BtnAtaqueEspecial.addActionListener(this::BtnAtaqueEspecialActionPerformed);
        jLayeredPane1.add(BtnAtaqueEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, -1, -1));

        BtnDefensaEspecial.setText("Defensa especial");
        BtnDefensaEspecial.addActionListener(this::BtnDefensaEspecialActionPerformed);
        jLayeredPane1.add(BtnDefensaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 530, -1, -1));

        BtnHuir.setText("Huir");
        BtnHuir.addActionListener(this::BtnHuirActionPerformed);
        jLayeredPane1.add(BtnHuir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        barraVidaJugador.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaJugador.setStringPainted(true);
        jLayeredPane1.add(barraVidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 20));

        lblPokemonJugador.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPokemonJugador.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.add(lblPokemonJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        lblPokemonCpu.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPokemonCpu.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.add(lblPokemonCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        lblNombreJugador.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNombreJugador.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreJugador.setText("   .");
        jLayeredPane1.add(lblNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        lblNombreCpu.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblNombreCpu.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCpu.setText(".");
        jLayeredPane1.add(lblNombreCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, -1));

        lblContAtaque.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblContAtaque.setForeground(new java.awt.Color(255, 255, 255));
        lblContAtaque.setText("0/3");
        jLayeredPane1.add(lblContAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        lblContDefensa.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblContDefensa.setForeground(new java.awt.Color(255, 255, 255));
        lblContDefensa.setText("0/3");
        jLayeredPane1.add(lblContDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        lblimagenpokemonjugador.setText("jLabel1");
        jLayeredPane1.add(lblimagenpokemonjugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        lblimagencpu.setText("jLabel2");
        jLayeredPane1.add(lblimagencpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, -1, -1));

        txtPreview.setColumns(20);
        txtPreview.setRows(5);
        txtPreview.setText("Aqui se muestra el resumen del turno en la vista previa.");

        javax.swing.GroupLayout PanelTextoBatallaLayout = new javax.swing.GroupLayout(PanelTextoBatalla);
        PanelTextoBatalla.setLayout(PanelTextoBatallaLayout);
        PanelTextoBatallaLayout.setHorizontalGroup(
            PanelTextoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextoBatallaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        PanelTextoBatallaLayout.setVerticalGroup(
            PanelTextoBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPreview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jLayeredPane1.add(PanelTextoBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 960, -1));

        barraVidaCpu.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaCpu.setStringPainted(true);
        jLayeredPane1.add(barraVidaCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, -1, 20));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon-arena-v0-pe2kotypoztd1.png"))); // NOI18N
        jLayeredPane1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1020, 540));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, -104, 960, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDefensaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefensaEspecialActionPerformed
        Pokemon pj = jugador.getPokemonActual();
        if (pj == null) {
            return;
        }

        if (!pj.puedeUsarDefensaEspecial()) {
            escribirResumen("Todavia no puedes usar defensa especial. Necesitas 2 defensas normales.");
            return;
        }

        pj.consumirDefensaEspecial();
        jugadorDefensaEspecialActiva = true;
        jugadorDefendio = false;

        escribirResumen(pj.nombre + " activo defensa especial.");
        actualizarPantalla();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }
    }//GEN-LAST:event_BtnDefensaEspecialActionPerformed

    private void BtnHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHuirActionPerformed
        escribirResumen(jugador.nombre + " huyo del combate.");
        Seleccion_Pokemon seleccion = new Seleccion_Pokemon(jugador.nombre);
        seleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnHuirActionPerformed

    private void BtnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtacarActionPerformed
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        int defensaCpuActual = obtenerDefensaCpu();
        pj.aumentarAtaqueNormal();

        int danio = pj.ataque - (defensaCpuActual / 2);
        if (danio < 8) {
            danio = 8;
        }

        pc.recibirDanio(danio);
        String mensaje = pj.nombre + " uso ataque normal e hizo " + danio + " de daño.";

        if (!pc.vivo()) {
            mensaje += "\n" + pc.nombre + " fue derrotado.";
            cpu.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }

        escribirResumen(mensaje);
        actualizarPantalla();
        revisarGanador();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }
    }//GEN-LAST:event_BtnAtacarActionPerformed

    private void BtnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtaqueEspecialActionPerformed
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        if (!pj.puedeUsarAtaqueEspecial()) {
            escribirResumen("Todavia no puedes usar ataque especial. Necesitas 2 ataques normales.");
            return;
        }

        int defensaCpuActual = obtenerDefensaCpu();
        pj.consumirAtaqueEspecial();

        int danio = pj.ataqueEspecial - (defensaCpuActual / 2);
        if (danio < 12) {
            danio = 12;
        }

        pc.recibirDanio(danio);
        String mensaje = pj.nombre + " uso ataque especial e hizo " + danio + " de daño.";

        if (!pc.vivo()) {
            mensaje += "\n" + pc.nombre + " fue derrotado.";
            cpu.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }

        escribirResumen(mensaje);
        actualizarPantalla();
        revisarGanador();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }
    }//GEN-LAST:event_BtnAtaqueEspecialActionPerformed

    private void BtnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefenderActionPerformed
        Pokemon pj = jugador.getPokemonActual();

        if (pj == null) {
            return;
        }

        pj.aumentarDefensaNormal();
        jugadorDefendio = true;
        jugadorDefensaEspecialActiva = false;

        escribirResumen(pj.nombre + " uso defensa normal.");
        actualizarPantalla();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }
    }//GEN-LAST:event_BtnDefenderActionPerformed

    public static void main(String args[]) {
        try {
        } catch (Exception ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtacar;
    private javax.swing.JButton BtnAtaqueEspecial;
    private javax.swing.JButton BtnDefender;
    private javax.swing.JButton BtnDefensaEspecial;
    private javax.swing.JButton BtnHuir;
    private javax.swing.JPanel PanelTextoBatalla;
    private javax.swing.JProgressBar barraVidaCpu;
    private javax.swing.JProgressBar barraVidaJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLabel lblContAtaque;
    private javax.swing.JLabel lblContDefensa;
    private javax.swing.JLabel lblNombreCpu;
    private javax.swing.JLabel lblNombreJugador;
    private javax.swing.JLabel lblPokemonCpu;
    private javax.swing.JLabel lblPokemonJugador;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblimagencpu;
    private javax.swing.JLabel lblimagenpokemonjugador;
    private javax.swing.JTextArea txtPreview;
    // End of variables declaration//GEN-END:variables

    private int obtenerDefensaCpu() {
        Pokemon pc = cpu.getPokemonActual();

        if (pc == null) {
            return 0;
        }

        int defensa = pc.defensa;

        if (cpuDefensaEspecialActiva) {
            defensa = pc.defensaEspecial + 15;
            cpuDefensaEspecialActiva = false;
        } else if (cpuDefendio) {
            defensa = pc.defensa + 10;
            cpuDefendio = false;
        }

        return defensa;
    }

    private void actualizarPantalla() {
        lblNombreJugador.setText(jugador.nombre);
        lblNombreCpu.setText(cpu.nombre);

        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        actualizarPanelJugador(pj);
        actualizarPanelCpu(pc);
    }

    private void actualizarPanelJugador(Pokemon pj) {
        if (pj != null) {
            lblPokemonJugador.setText(pj.nombre);
            barraVidaJugador.setMaximum(pj.vidaMaxima);
            barraVidaJugador.setValue(pj.vida);
            barraVidaJugador.setString(pj.vida + " / " + pj.vidaMaxima);
            actualizarColorBarra(barraVidaJugador, pj.vida, pj.vidaMaxima);

            lblContAtaque.setText("Ataques: " + pj.contadorAtaquesNormales + "/2");
            lblContDefensa.setText("Defensas: " + pj.contadorDefensasNormales + "/2");
            lblimagenpokemonjugador.setIcon(cargarIconoPokemon(pj.nombre, true));
            lblimagenpokemonjugador.setText("");
        } else {
            lblPokemonJugador.setText("Sin Pokemon");
            barraVidaJugador.setMaximum(100);
            barraVidaJugador.setValue(0);
            barraVidaJugador.setString("0 / 0");
            barraVidaJugador.setForeground(Color.RED);
            lblContAtaque.setText("Ataques: 0/2");
            lblContDefensa.setText("Defensas: 0/2");
            lblimagenpokemonjugador.setIcon(null);
            lblimagenpokemonjugador.setText("Sin Pokemon");
        }
    }

    private void actualizarPanelCpu(Pokemon pc) {
        if (pc != null) {
            lblPokemonCpu.setText(pc.nombre);
            barraVidaCpu.setMaximum(pc.vidaMaxima);
            barraVidaCpu.setValue(pc.vida);
            barraVidaCpu.setString(pc.vida + " / " + pc.vidaMaxima);
            actualizarColorBarra(barraVidaCpu, pc.vida, pc.vidaMaxima);
            lblimagencpu.setIcon(cargarIconoPokemon(pc.nombre, false));
            lblimagencpu.setText("");
        } else {
            lblPokemonCpu.setText("Sin Pokemon");
            barraVidaCpu.setMaximum(100);
            barraVidaCpu.setValue(0);
            barraVidaCpu.setString("0 / 0");
            barraVidaCpu.setForeground(Color.RED);
            lblimagencpu.setIcon(null);
            lblimagencpu.setText("Sin Pokemon");
        }
    }

    private void actualizarColorBarra(javax.swing.JProgressBar barra, int vidaActual, int vidaMaxima) {
        double porcentaje = vidaMaxima == 0 ? 0 : (double) vidaActual / vidaMaxima;

        if (porcentaje > 0.5) {
            barra.setForeground(new Color(0, 230, 64));
        } else if (porcentaje > 0.25) {
            barra.setForeground(Color.YELLOW);
        } else {
            barra.setForeground(Color.RED);
        }
    }

    private void revisarGanador() {
        if (!jugador.tienePokemonesVivos()) {
            escribirResumen("Gano " + cpu.nombre + ".");
            deshabilitarBotones();
            return;
        }

        if (!cpu.tienePokemonesVivos()) {
            escribirResumen("Gano " + jugador.nombre + ".");
            deshabilitarBotones();
        }
    }

    private void turnoCpu() {
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        int defensaJugadorActual = pj.defensa;

        if (jugadorDefensaEspecialActiva) {
            defensaJugadorActual = pj.getDefensaEspecialContra(pc.tipo);
            jugadorDefensaEspecialActiva = false;
        } else if (jugadorDefendio) {
            defensaJugadorActual = pj.defensa + 10;
            jugadorDefendio = false;
        }

        int ataqueBase = pc.getAtaqueContra(pj.tipo, false);
        int ataqueEspecialBase = pc.getAtaqueContra(pj.tipo, true);
        int danioNormal = Batalla.calcularDanio(ataqueBase, defensaJugadorActual);
        int danioEspecial = Batalla.calcularDanio(ataqueEspecialBase, defensaJugadorActual);
        String mensajeCpu;

        if (pc.puedeUsarAtaqueEspecial() && danioEspecial >= pj.vida) {
            pc.consumirAtaqueEspecial();
            pj.recibirDanio(danioEspecial);
            mensajeCpu = pc.nombre + " uso ataque especial e hizo " + danioEspecial + " de daño.";
        } else if (danioNormal >= pj.vida) {
            pc.aumentarAtaqueNormal();
            pj.recibirDanio(danioNormal);
            mensajeCpu = pc.nombre + " ataco e hizo " + danioNormal + " de daño.";
        } else if (pj.esFuerteContra(pc.tipo) && pc.puedeUsarDefensaEspecial()) {
            pc.consumirDefensaEspecial();
            cpuDefensaEspecialActiva = true;
            cpuDefendio = false;
            mensajeCpu = pc.nombre + " activo defensa especial.";
        } else if (pc.vida <= (pc.vidaMaxima / 3)) {
            pc.aumentarDefensaNormal();
            cpuDefendio = true;
            cpuDefensaEspecialActiva = false;
            mensajeCpu = pc.nombre + " uso defensa normal.";
        } else if (pc.esFuerteContra(pj.tipo) && pc.puedeUsarAtaqueEspecial()) {
            pc.consumirAtaqueEspecial();
            pj.recibirDanio(danioEspecial);
            mensajeCpu = pc.nombre + " uso ataque especial e hizo " + danioEspecial + " de daño.";
        } else {
            pc.aumentarAtaqueNormal();
            pj.recibirDanio(danioNormal);
            mensajeCpu = pc.nombre + " ataco e hizo " + danioNormal + " de daño.";
        }

        if (!pj.vivo()) {
            mensajeCpu += "\n" + pj.nombre + " fue derrotado.";
            jugador.pasarSiguientePokemon();
            jugadorDefendio = false;
            jugadorDefensaEspecialActiva = false;
        }

        escribirResumen(txtPreview.getText() + "\n" + mensajeCpu);
        actualizarPantalla();
        revisarGanador();
    }

    private void escribirResumen(String texto) {
        Batalla.reiniciar();
        for (String linea : texto.split("\\n")) {
            Batalla.push(linea);
        }
        txtPreview.setText(Batalla.obtenerHistorial());
        txtPreview.setCaretPosition(0);
    }

    private void deshabilitarBotones() {
        BtnAtacar.setEnabled(false);
        BtnDefender.setEnabled(false);
        BtnAtaqueEspecial.setEnabled(false);
        BtnDefensaEspecial.setEnabled(false);
        BtnHuir.setEnabled(false);
    }

    private javax.swing.ImageIcon cargarIconoPokemon(String nombrePokemon, boolean jugadorLocal) {
        String ruta = obtenerRutaIcono(nombrePokemon);
        URL url = ruta != null ? buscarRecurso(ruta) : null;

        if (url == null) {
            String respaldo = jugadorLocal ? "/icons/avatar (3).png" : "/icons/avatar (2).png";
            url = buscarRecurso(respaldo);
        }

        if (url == null) {
            return null;
        }

        Image imagen = new ImageIcon(url).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        return new ImageIcon(imagen);
    }
    private String obtenerRutaIcono(String nombrePokemon) {
        if ("Charmander".equals(nombrePokemon)) {
            return "/icons/charmander.png";
        } else if ("Squirtle".equals(nombrePokemon)) {
            return "/icons/squirtle.png";
        } else if ("Pidgey".equals(nombrePokemon)) {
            return "/icons/pidgey.png";
        } else if ("Pikachu".equals(nombrePokemon)) {
            return "/icons/pikachu.png";
        } else if ("Ponyta".equals(nombrePokemon)) {
            return "/icons/ponyta.png";
        } else if ("Psyduck".equals(nombrePokemon)) {
            return "/icons/psyduck.png";
        } else if ("Spearow".equals(nombrePokemon)) {
            return "/icons/spearow.png";
        } else if ("Jolteon".equals(nombrePokemon)) {
            return "/icons/Jolteon.png";
        }
        return null;
    }

    private URL buscarRecurso(String ruta) {
        URL url = getClass().getResource(ruta);
        if (url != null) {
            return url;
        }

        String relativa = ruta.startsWith("/") ? ruta.substring(1) : ruta;
        File archivoResources = new File("src/main/resources", relativa);
        if (archivoResources.exists()) {
            try {
                return archivoResources.toURI().toURL();
            } catch (java.net.MalformedURLException ex) {
                return null;
            }
        }

        File archivoJava = new File("src/main/java", relativa);
        if (archivoJava.exists()) {
            try {
                return archivoJava.toURI().toURL();
            } catch (java.net.MalformedURLException ex) {
                return null;
            }
        }

        return null;
    }
}

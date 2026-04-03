/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Labels.Label_pelea;

import com.mycompany.main.Jugador;
import com.mycompany.main.Pokemon;
import javax.swing.JOptionPane;

public class Pelea extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pelea.class.getName());

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
        actualizarPantalla();
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
        barraVidaCpu = new javax.swing.JProgressBar();
        lblPokemonJugador = new javax.swing.JLabel();
        lblPokemonCpu = new javax.swing.JLabel();
        lblNombreJugador = new javax.swing.JLabel();
        lblNombreCpu = new javax.swing.JLabel();
        lblContAtaque = new javax.swing.JLabel();
        lblContDefensa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jLayeredPane1.add(barraVidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, 20));

        barraVidaCpu.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaCpu.setStringPainted(true);
        jLayeredPane1.add(barraVidaCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, 20));

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
        jLayeredPane1.add(lblContAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        lblContDefensa.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblContDefensa.setForeground(new java.awt.Color(255, 255, 255));
        lblContDefensa.setText("0/3");
        jLayeredPane1.add(lblContDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon-arena-v0-pe2kotypoztd1.png"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1020, 540));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, -104, 960, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDefensaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefensaEspecialActionPerformed
        // TODO add your handling code here:
        Pokemon pj = jugador.getPokemonActual();

        if (pj == null) {
            return;
        }

        if (!pj.puedeUsarDefensaEspecial()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todavía no puedes usar defensa especial. Necesitas 3 defensas normales.");
            return;
        }

        pj.consumirDefensaEspecial();
        jugadorDefensaEspecialActiva = true;
        jugadorDefendio = false;

        javax.swing.JOptionPane.showMessageDialog(this, pj.nombre + " activó defensa especial.");

        actualizarPantalla();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }

    }//GEN-LAST:event_BtnDefensaEspecialActionPerformed

    private void BtnHuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHuirActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(this, jugador.nombre + " ha huido del combate.");
        this.dispose();

    }//GEN-LAST:event_BtnHuirActionPerformed

    private void BtnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtacarActionPerformed
        // TODO add your handling code here:
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        int defensaCpu = obtenerDefensaCpu();

        pj.aumentarAtaqueNormal();

        int danio = pj.ataque - (defensaCpu / 2);
        if (danio < 8) {
            danio = 8;
        }

        pc.recibirDanio(danio);

        javax.swing.JOptionPane.showMessageDialog(this, pj.nombre + " usó ataque normal e hizo " + danio + " de daño.");

        if (!pc.vivo()) {
            javax.swing.JOptionPane.showMessageDialog(this, pc.nombre + " fue derrotado.");
            cpu.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }

        actualizarPantalla();
        revisarGanador();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }

    }//GEN-LAST:event_BtnAtacarActionPerformed

    private void BtnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtaqueEspecialActionPerformed
        // TODO add your handling code here:
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        if (!pj.puedeUsarAtaqueEspecial()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todavía no puedes usar ataque especial. Necesitas 3 ataques normales.");
            return;
        }

        int defensaCpu = obtenerDefensaCpu();

        pj.consumirAtaqueEspecial();

        int danio = pj.ataqueEspecial - (defensaCpu / 2);
        if (danio < 12) {
            danio = 12;
        }

        pc.recibirDanio(danio);

        javax.swing.JOptionPane.showMessageDialog(this, pj.nombre + " usó ataque especial e hizo " + danio + " de daño.");

        if (!pc.vivo()) {
            javax.swing.JOptionPane.showMessageDialog(this, pc.nombre + " fue derrotado.");
            cpu.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }

        actualizarPantalla();
        revisarGanador();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }

    }//GEN-LAST:event_BtnAtaqueEspecialActionPerformed

    private void BtnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefenderActionPerformed
        // TODO add your handling code here:
        Pokemon pj = jugador.getPokemonActual();

        if (pj == null) {
            return;
        }

        pj.aumentarDefensaNormal();
        jugadorDefendio = true;
        jugadorDefensaEspecialActiva = false;

        javax.swing.JOptionPane.showMessageDialog(this, pj.nombre + " usó defensa normal.");

        actualizarPantalla();

        if (jugador.tienePokemonesVivos() && cpu.tienePokemonesVivos()) {
            turnoCpu();
        }


    }//GEN-LAST:event_BtnDefenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtacar;
    private javax.swing.JButton BtnAtaqueEspecial;
    private javax.swing.JButton BtnDefender;
    private javax.swing.JButton BtnDefensaEspecial;
    private javax.swing.JButton BtnHuir;
    private javax.swing.JProgressBar barraVidaCpu;
    private javax.swing.JProgressBar barraVidaJugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
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

        if (pj != null) {
            lblPokemonJugador.setText(pj.nombre);

            barraVidaJugador.setMaximum(pj.vidaMaxima);
            barraVidaJugador.setValue(pj.vida);
            barraVidaJugador.setString(pj.vida + " / " + pj.vidaMaxima);

            double porcentaje = (double) pj.vida / pj.vidaMaxima;

            if (porcentaje > 0.5) {
                barraVidaJugador.setForeground(java.awt.Color.GREEN);
            } else if (porcentaje > 0.25) {
                barraVidaJugador.setForeground(java.awt.Color.YELLOW);
            } else {
                barraVidaJugador.setForeground(java.awt.Color.RED);
            }

            lblContAtaque.setText("Ataques: " + pj.contadorAtaquesNormales + "/3");
            lblContDefensa.setText("Defensas: " + pj.contadorDefensasNormales + "/3");
        } else {
            lblPokemonJugador.setText("Sin Pokémon");
            barraVidaJugador.setMaximum(100);
            barraVidaJugador.setValue(0);
            barraVidaJugador.setString("0 / 0");
            barraVidaJugador.setForeground(java.awt.Color.RED);

            lblContAtaque.setText("Ataques: 0/3");
            lblContDefensa.setText("Defensas: 0/3");
        }

        if (pc != null) {
            lblPokemonCpu.setText(pc.nombre);

            barraVidaCpu.setMaximum(pc.vidaMaxima);
            barraVidaCpu.setValue(pc.vida);
            barraVidaCpu.setString(pc.vida + " / " + pc.vidaMaxima);

            double porcentaje = (double) pc.vida / pc.vidaMaxima;

            if (porcentaje > 0.5) {
                barraVidaCpu.setForeground(java.awt.Color.GREEN);
            } else if (porcentaje > 0.25) {
                barraVidaCpu.setForeground(java.awt.Color.YELLOW);
            } else {
                barraVidaCpu.setForeground(java.awt.Color.RED);
            }
        } else {
            lblPokemonCpu.setText("Sin Pokémon");
            barraVidaCpu.setMaximum(100);
            barraVidaCpu.setValue(0);
            barraVidaCpu.setString("0 / 0");
            barraVidaCpu.setForeground(java.awt.Color.RED);
        }
    }

    private void revisarGanador() {
        if (!jugador.tienePokemonesVivos()) {
            JOptionPane.showMessageDialog(this, "Ganó " + cpu.nombre);
            BtnAtacar.setEnabled(false);
            BtnDefender.setEnabled(false);
            BtnAtaqueEspecial.setEnabled(false);
            BtnDefensaEspecial.setEnabled(false);
            BtnHuir.setEnabled(false);
            return;
        }

        if (!cpu.tienePokemonesVivos()) {
            JOptionPane.showMessageDialog(this, "Ganó " + jugador.nombre);
            BtnAtacar.setEnabled(false);
            BtnDefender.setEnabled(false);
            BtnAtaqueEspecial.setEnabled(false);
            BtnDefensaEspecial.setEnabled(false);
            BtnHuir.setEnabled(false);
        }
    }

    private void turnoCpu() {
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpu.getPokemonActual();

        if (pj == null || pc == null) {
            return;
        }

        java.util.Random random = new java.util.Random();
        int accion = random.nextInt(4);

        int defensaJugador = pj.defensa;

        if (jugadorDefensaEspecialActiva) {
            defensaJugador = pj.defensaEspecial + 15;
            jugadorDefensaEspecialActiva = false;
        } else if (jugadorDefendio) {
            defensaJugador = pj.defensa + 10;
            jugadorDefendio = false;
        }

        if (accion == 0) {
            pc.aumentarAtaqueNormal();

            int danio = pc.ataque - defensaJugador;
            if (danio < 1) {
                danio = 1;
            }

            pj.recibirDanio(danio);

            JOptionPane.showMessageDialog(this, pc.nombre + " atacó e hizo " + danio + " de daño.");
        } else if (accion == 1) {
            if (pc.puedeUsarAtaqueEspecial()) {
                pc.consumirAtaqueEspecial();

                int danio = pc.ataqueEspecial - defensaJugador;
                if (danio < 1) {
                    danio = 1;
                }

                pj.recibirDanio(danio);

                JOptionPane.showMessageDialog(this, pc.nombre + " usó ataque especial e hizo " + danio + " de daño.");
            } else {
                pc.aumentarAtaqueNormal();

                int danio = pc.ataque - defensaJugador;
                if (danio < 1) {
                    danio = 1;
                }

                pj.recibirDanio(danio);

                JOptionPane.showMessageDialog(this, pc.nombre + " no tenía especial. Atacó e hizo " + danio + " de daño.");
            }
        } else if (accion == 2) {
            pc.aumentarDefensaNormal();
            cpuDefendio = true;
            cpuDefensaEspecialActiva = false;

            JOptionPane.showMessageDialog(this, pc.nombre + " usó defensa normal.");
        } else {
            if (pc.puedeUsarDefensaEspecial()) {
                pc.consumirDefensaEspecial();
                cpuDefensaEspecialActiva = true;
                cpuDefendio = false;

                JOptionPane.showMessageDialog(this, pc.nombre + " activó defensa especial.");
            } else {
                pc.aumentarDefensaNormal();
                cpuDefendio = true;
                cpuDefensaEspecialActiva = false;

                JOptionPane.showMessageDialog(this, pc.nombre + " no tenía defensa especial. Usó defensa normal.");
            }
        }

        if (!pj.vivo()) {
            JOptionPane.showMessageDialog(this, pj.nombre + " fue derrotado.");
            jugador.pasarSiguientePokemon();
            jugadorDefendio = false;
            jugadorDefensaEspecialActiva = false;
        }

        actualizarPantalla();
        revisarGanador();
    }
}

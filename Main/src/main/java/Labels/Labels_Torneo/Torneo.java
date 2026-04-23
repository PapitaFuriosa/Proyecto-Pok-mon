/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Labels.Labels_Torneo;

import Labels.Label_Selecc_Pokemon.Seleccion_Pokemon;
import com.mycompany.main.Batalla;
import com.mycompany.main.Jugador;
import com.mycompany.main.Pokemon;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class Torneo extends javax.swing.JFrame {

    private final com.mycompany.main.Torneo torneoLogica;
    private final Jugador jugador;
    private Jugador cpuActual;

    private boolean jugadorDefendio = false;
    private boolean jugadorDefensaEspecialActiva = false;
    private boolean cpuDefendio = false;
    private boolean cpuDefensaEspecialActiva = false;
    private boolean peleaActiva = false;

    private JLabel lblPokemonJugadorInfo;
    private JLabel lblPokemonCpuInfo;
    private JLabel lblNombreJugadorInfo;
    private JLabel lblNombreCpuInfo;
    private JLabel lblContAtaqueInfo;
    private JLabel lblContDefensaInfo;
    private BracketPanel bracketPanel;

    public Torneo() {
        this(crearJugadorDemo("Jugador"));
    }

    public Torneo(Jugador jugador) {
        initComponents();
        this.jugador = jugador;
        this.torneoLogica = new com.mycompany.main.Torneo(jugador);
        configurarVista();
        prepararSiguienteBatalla();
        actualizarTodo();
        escribirResumen("El torneo ya esta listo. Presiona 'Iniciar siguiente batalla' para jugar tu llave.");
    }

    private Clip musicaFondo;

    private void iniciarMusica() {
        try {
            if (musicaFondo != null && musicaFondo.isRunning()) {
                return;
            }

            InputStream audioSrc = getClass().getResourceAsStream("/sound/battle.wav");

            if (audioSrc == null) {
                System.out.println("No se encontró el sonido");
                return;
            }

            BufferedInputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            musicaFondo = AudioSystem.getClip();
            musicaFondo.open(audioStream);
            musicaFondo.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void detenerMusica() {

        if (musicaFondo != null) {
            musicaFondo.stop();
            musicaFondo.close();
            musicaFondo = null;
        }
    }

    private void reproducirSonido(String ruta) {
        try {
            InputStream audioSrc = getClass().getResourceAsStream(ruta);

            if (audioSrc == null) {
                System.out.println("No se encontró el sonido: " + ruta);
                return;
            }

            BufferedInputStream bufferedIn = new BufferedInputStream(audioSrc);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(bufferedIn);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPreview = new javax.swing.JPanel();
        lblproximabatlla = new javax.swing.JLabel();
        lblPreviewTitulo = new javax.swing.JLabel();
        btnPreviewIniciar = new javax.swing.JButton();
        btnAtacar = new javax.swing.JButton();
        btnDefender = new javax.swing.JButton();
        btnAtaqueEspecial = new javax.swing.JButton();
        btnDefensaEsepcial = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        scrollPreview = new javax.swing.JScrollPane();
        txtPreview = new javax.swing.JTextArea();
        PanelLlaves = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        barraVidaCpu = new javax.swing.JProgressBar();
        barraVidaCpu1 = new javax.swing.JProgressBar();
        lblimagenpokemonjugador = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();
        lblimagencpu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPreview.setBackground(new java.awt.Color(255, 248, 220));

        lblproximabatlla.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblproximabatlla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblproximabatlla.setText("preview");

        lblPreviewTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPreviewTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreviewTitulo.setText("Modo Toreno - Cuartos de final");

        btnPreviewIniciar.setText("Iniciar siguiente batalla");
        btnPreviewIniciar.setEnabled(false);
        btnPreviewIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarBatalla(evt);
            }
        });

        btnAtacar.setText("Atacar");
        btnAtacar.setEnabled(false);
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });

        btnDefender.setText("Defender");
        btnDefender.setEnabled(false);
        btnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefenderActionPerformed(evt);
            }
        });

        btnAtaqueEspecial.setText("Ataque especial");
        btnAtaqueEspecial.setEnabled(false);
        btnAtaqueEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueEspecialActionPerformed(evt);
            }
        });

        btnDefensaEsepcial.setText("Defensa especial");
        btnDefensaEsepcial.setEnabled(false);
        btnDefensaEsepcial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaEsepcialActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir del torneo");
        btnSalir.setEnabled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtPreview.setColumns(20);
        txtPreview.setRows(5);
        txtPreview.setText("Aqui se muestra el resumen del turno en la vista previa.");
        scrollPreview.setViewportView(txtPreview);

        javax.swing.GroupLayout PanelLlavesLayout = new javax.swing.GroupLayout(PanelLlaves);
        PanelLlaves.setLayout(PanelLlavesLayout);
        PanelLlavesLayout.setHorizontalGroup(
            PanelLlavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLlavesLayout.setVerticalGroup(
            PanelLlavesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        barraVidaCpu.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaCpu.setStringPainted(true);

        barraVidaCpu1.setBackground(new java.awt.Color(102, 255, 102));
        barraVidaCpu1.setStringPainted(true);

        lblimagenpokemonjugador.setText("jLabel1");

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokémon-arena-v0-pe2kotypoztd1.png"))); // NOI18N
        lblfondo.setText(" ");

        lblimagencpu.setText("jLabel2");

        jLayeredPane1.setLayer(barraVidaCpu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(barraVidaCpu1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblimagenpokemonjugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblfondo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblimagencpu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(barraVidaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(344, 344, 344)
                            .addComponent(barraVidaCpu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(lblimagenpokemonjugador)
                            .addGap(533, 533, 533)
                            .addComponent(lblimagencpu))
                        .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(barraVidaCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(barraVidaCpu1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(110, 110, 110)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblimagenpokemonjugador)
                                .addComponent(lblimagencpu)))
                        .addComponent(lblfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelPreviewLayout = new javax.swing.GroupLayout(panelPreview);
        panelPreview.setLayout(panelPreviewLayout);
        panelPreviewLayout.setHorizontalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblproximabatlla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPreviewTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1209, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPreviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelLlaves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addGap(60, 60, 60))
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnPreviewIniciar)
                .addGap(18, 18, 18)
                .addComponent(btnAtacar)
                .addGap(18, 18, 18)
                .addComponent(btnDefender)
                .addGap(18, 18, 18)
                .addComponent(btnAtaqueEspecial)
                .addGap(18, 18, 18)
                .addComponent(btnDefensaEsepcial)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(477, Short.MAX_VALUE))
            .addComponent(scrollPreview, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelPreviewLayout.setVerticalGroup(
            panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPreviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPreviewTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblproximabatlla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelLlaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPreview, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPreviewIniciar)
                    .addComponent(btnAtacar)
                    .addComponent(btnDefender)
                    .addComponent(btnAtaqueEspecial)
                    .addComponent(btnDefensaEsepcial)
                    .addComponent(btnSalir))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPreview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPreview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarBatalla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarBatalla
        if (torneoLogica.isTorneoTerminado() || cpuActual == null) {
            return;
        }

        iniciarMusica();
        peleaActiva = true;
        jugadorDefendio = false;
        jugadorDefensaEspecialActiva = false;
        cpuDefendio = false;
        cpuDefensaEspecialActiva = false;
        habilitarControlesBatalla(true);
        btnPreviewIniciar.setEnabled(false);
        btnSalir.setEnabled(true);
        escribirResumen("Empieza la batalla de " + torneoLogica.getTextoRonda() + " contra " + cpuActual.nombre + ".");
        actualizarTodo();
    }//GEN-LAST:event_btnIniciarBatalla

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
        if (!peleaActiva) {
            return;
        }
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpuActual.getPokemonActual();
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
        String mensaje = pj.nombre + " uso ataque normal e hizo " + danio + " de daño.";
        if (!pc.vivo()) {
            mensaje += "`n" + pc.nombre + " fue derrotado.";
            cpuActual.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }
        escribirResumen(mensaje);
        actualizarTodo();
        if (!resolverFinDeBatalla()) {
            turnoCpu();
        }
    }//GEN-LAST:event_btnAtacarActionPerformed
    private void btnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefenderActionPerformed
        if (!peleaActiva) {
            return;
        }
        Pokemon pj = jugador.getPokemonActual();
        if (pj == null) {
            return;
        }
        pj.aumentarDefensaNormal();
        jugadorDefendio = true;
        jugadorDefensaEspecialActiva = false;
        escribirResumen(pj.nombre + " uso defensa normal.");
        actualizarTodo();
        if (!resolverFinDeBatalla()) {
            turnoCpu();
        }
    }//GEN-LAST:event_btnDefenderActionPerformed

    private void btnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialActionPerformed
        if (!peleaActiva) {
            return;
        }
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpuActual.getPokemonActual();
        if (pj == null || pc == null) {
            return;
        }
        if (!pj.puedeUsarAtaqueEspecial()) {
            escribirResumen("Todavia no puedes usar ataque especial. Necesitas 2 ataques normales.");
            return;
        }
        int defensaCpu = obtenerDefensaCpu();
        pj.consumirAtaqueEspecial();
        int danio = pj.ataqueEspecial - (defensaCpu / 2);
        if (danio < 12) {
            danio = 12;
        }
        pc.recibirDanio(danio);
        String mensaje = pj.nombre + " uso ataque especial e hizo " + danio + " de daño.";
        if (!pc.vivo()) {
            mensaje += "`n" + pc.nombre + " fue derrotado.";
            cpuActual.pasarSiguientePokemon();
            cpuDefendio = false;
            cpuDefensaEspecialActiva = false;
        }
        escribirResumen(mensaje);
        actualizarTodo();
        if (!resolverFinDeBatalla()) {
            turnoCpu();
        }
    }//GEN-LAST:event_btnAtaqueEspecialActionPerformed

    private void btnDefensaEsepcialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaEsepcialActionPerformed
        if (!peleaActiva) {
            return;
        }
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
        actualizarTodo();
        if (!resolverFinDeBatalla()) {
            turnoCpu();
        }
    }//GEN-LAST:event_btnDefensaEsepcialActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        detenerMusica();
        if (!torneoLogica.isTorneoTerminado()) {
            torneoLogica.cerrarTorneoPorHuida();
        }
        Seleccion_Pokemon seleccion = new Seleccion_Pokemon(jugador.nombre);
        seleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void configurarVista() {
        setTitle("Torneo Pokemon");

        txtPreview.setEditable(false);
        txtPreview.setLineWrap(true);
        txtPreview.setWrapStyleWord(true);

        PanelLlaves.removeAll();
        PanelLlaves.setOpaque(false);
        PanelLlaves.setLayout(new BorderLayout());
        PanelLlaves.setPreferredSize(new java.awt.Dimension(1120, 330));
        PanelLlaves.setMinimumSize(new java.awt.Dimension(1120, 330));

        bracketPanel = new BracketPanel();
        bracketPanel.setOpaque(false);
        bracketPanel.setPreferredSize(new java.awt.Dimension(1120, 330));
        PanelLlaves.add(bracketPanel, BorderLayout.CENTER);

        jLayeredPane1.removeAll();
        jLayeredPane1.setLayout(null);
        jLayeredPane1.setOpaque(false);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1020, 540));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1020, 540));

        lblfondo.setBounds(0, 0, 1020, 540);
        barraVidaCpu.setBounds(220, 70, 165, 22);
        barraVidaCpu1.setBounds(710, 70, 165, 22);
        lblimagenpokemonjugador.setBounds(120, 180, 180, 180);
        lblimagencpu.setBounds(720, 180, 180, 180);

        lblimagenpokemonjugador.setHorizontalAlignment(SwingConstants.CENTER);
        lblimagenpokemonjugador.setVerticalAlignment(SwingConstants.CENTER);
        lblimagenpokemonjugador.setHorizontalTextPosition(SwingConstants.CENTER);
        lblimagenpokemonjugador.setVerticalTextPosition(SwingConstants.BOTTOM);
        lblimagenpokemonjugador.setForeground(Color.WHITE);

        lblimagencpu.setHorizontalAlignment(SwingConstants.CENTER);
        lblimagencpu.setVerticalAlignment(SwingConstants.CENTER);
        lblimagencpu.setHorizontalTextPosition(SwingConstants.CENTER);
        lblimagencpu.setVerticalTextPosition(SwingConstants.BOTTOM);
        lblimagencpu.setForeground(Color.WHITE);

        lblPokemonJugadorInfo = crearLabel("Pokemon jugador", Font.BOLD | Font.ITALIC, 18, 120, 34, 340, 30);
        lblPokemonCpuInfo = crearLabel("Pokemon rival", Font.BOLD | Font.ITALIC, 18, 610, 34, 340, 30);
        lblNombreJugadorInfo = crearLabel(jugador.nombre, Font.BOLD, 18, 160, 365, 240, 28);
        lblNombreCpuInfo = crearLabel("CPU", Font.BOLD, 18, 670, 365, 240, 28);
        lblContAtaqueInfo = crearLabel("Ataques: 0/2", Font.BOLD, 16, 155, 405, 180, 28);
        lblContDefensaInfo = crearLabel("Defensas: 0/2", Font.BOLD, 16, 680, 405, 190, 28);

        jLayeredPane1.add(lblfondo, Integer.valueOf(0));
        jLayeredPane1.add(barraVidaCpu, Integer.valueOf(2));
        jLayeredPane1.add(barraVidaCpu1, Integer.valueOf(2));
        jLayeredPane1.add(lblimagenpokemonjugador, Integer.valueOf(2));
        jLayeredPane1.add(lblimagencpu, Integer.valueOf(2));
        jLayeredPane1.add(lblPokemonJugadorInfo, Integer.valueOf(2));
        jLayeredPane1.add(lblPokemonCpuInfo, Integer.valueOf(2));
        jLayeredPane1.add(lblNombreJugadorInfo, Integer.valueOf(2));
        jLayeredPane1.add(lblNombreCpuInfo, Integer.valueOf(2));
        jLayeredPane1.add(lblContAtaqueInfo, Integer.valueOf(2));
        jLayeredPane1.add(lblContDefensaInfo, Integer.valueOf(2));

        panelPreview.setPreferredSize(new java.awt.Dimension(1220, 1120));
        javax.swing.JScrollPane scrollGeneral = new javax.swing.JScrollPane(panelPreview);
        scrollGeneral.setBorder(null);
        scrollGeneral.getVerticalScrollBar().setUnitIncrement(18);
        setContentPane(scrollGeneral);

        PanelLlaves.revalidate();
        PanelLlaves.repaint();
        jLayeredPane1.revalidate();
        jLayeredPane1.repaint();
        panelPreview.revalidate();
        panelPreview.repaint();

        habilitarControlesBatalla(false);
        btnPreviewIniciar.setEnabled(!torneoLogica.isTorneoTerminado());
        btnSalir.setEnabled(true);
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    private JLabel crearLabel(String texto, int estilo, int tamanio, int x, int y, int ancho, int alto) {
        JLabel label = new JLabel(texto, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Segoe UI", estilo, tamanio));
        label.setBounds(x, y, ancho, alto);
        return label;
    }

    private void prepararSiguienteBatalla() {
        cpuActual = torneoLogica.getOponenteActual();
        jugadorDefendio = false;
        jugadorDefensaEspecialActiva = false;
        cpuDefendio = false;
        cpuDefensaEspecialActiva = false;
        peleaActiva = false;
        habilitarControlesBatalla(false);
        btnPreviewIniciar.setEnabled(!torneoLogica.isTorneoTerminado() && cpuActual != null);
    }

    private int obtenerDefensaCpu() {
        Pokemon pc = cpuActual != null ? cpuActual.getPokemonActual() : null;
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

    private void turnoCpu() {
        Pokemon pj = jugador.getPokemonActual();
        Pokemon pc = cpuActual.getPokemonActual();
        if (pj == null || pc == null) {
            return;
        }

        int defensaJugador = pj.defensa;

        if (jugadorDefensaEspecialActiva) {
            defensaJugador = pj.getDefensaEspecialContra(pc.tipo);
            jugadorDefensaEspecialActiva = false;
        } else if (jugadorDefendio) {
            defensaJugador = pj.defensa + 10;
            jugadorDefendio = false;
        }

        int ataqueBase = pc.getAtaqueContra(pj.tipo, false);
        int ataqueEspecialBase = pc.getAtaqueContra(pj.tipo, true);
        int danioNormal = Batalla.calcularDanio(ataqueBase, defensaJugador);
        int danioEspecial = Batalla.calcularDanio(ataqueEspecialBase, defensaJugador);
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
            mensajeCpu = pc.nombre + " uso ataque especial e hizo " + danioEspecial + " de daño±o.";
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
        actualizarTodo();
        resolverFinDeBatalla();
    }

    private boolean resolverFinDeBatalla() {
        if (!jugador.tienePokemonesVivos()) {

            detenerMusica();
            reproducirSonido("/sound/derrota.wav");

            peleaActiva = false;
            habilitarControlesBatalla(false);
            torneoLogica.registrarDerrotaJugador();
            actualizarTodo();
            escribirResumen("Perdiste el torneo. Campeon: " + torneoLogica.getNombreCampeon());
            btnPreviewIniciar.setEnabled(false);
            return true;
        }

        if (cpuActual != null && !cpuActual.tienePokemonesVivos()) {

            detenerMusica();
            reproducirSonido("/sound/win.wav");

            peleaActiva = false;
            habilitarControlesBatalla(false);
            torneoLogica.registrarVictoriaJugador();
            actualizarTodo();

            if (torneoLogica.isTorneoTerminado()) {
                escribirResumen("Ganaste el torneo. Eres el campeon Pokemon.");
                btnPreviewIniciar.setEnabled(false);
            } else {
                escribirResumen("Ganaste esta ronda. La llave se actualizo y ya puedes iniciar la siguiente batalla.");
                prepararSiguienteBatalla();
                actualizarTodo();
            }
            return true;
        }

        return false;
    }

    private void actualizarTodo() {
        lblPreviewTitulo.setText("Modo Torneo - " + torneoLogica.getTextoRonda());
        if (torneoLogica.isTorneoTerminado()) {
            lblproximabatlla.setText("Campeon del torneo: " + torneoLogica.getNombreCampeon());
        } else if (cpuActual != null) {
            lblproximabatlla.setText("Proxima batalla: " + torneoLogica.getNombreJugador() + " vs " + cpuActual.nombre);
        } else {
            lblproximabatlla.setText("Esperando siguiente batalla");
        }
        actualizarPokemonJugador();
        actualizarPokemonCpu();
        if (bracketPanel != null) {
            bracketPanel.repaint();
        }
    }

    private void actualizarPokemonJugador() {
        Pokemon pj = jugador.getPokemonActual();
        lblNombreJugadorInfo.setText(jugador.nombre);
        if (pj == null) {
            lblPokemonJugadorInfo.setText("Sin Pokemon");
            lblimagenpokemonjugador.setIcon(null);
            lblimagenpokemonjugador.setText("");
            barraVidaCpu.setMaximum(100);
            barraVidaCpu.setValue(0);
            barraVidaCpu.setString("0 / 0");
            barraVidaCpu.setForeground(Color.RED);
            lblContAtaqueInfo.setText("Ataques: 0/2");
            return;
        }
        lblPokemonJugadorInfo.setText(pj.nombre);
        lblimagenpokemonjugador.setIcon(cargarIconoPokemon(pj.nombre, true));
        lblimagenpokemonjugador.setText(lblimagenpokemonjugador.getIcon() == null ? pj.nombre : "");
        barraVidaCpu.setMaximum(pj.vidaMaxima);
        barraVidaCpu.setValue(pj.vida);
        barraVidaCpu.setString(pj.vida + " / " + pj.vidaMaxima);
        actualizarColorBarra(barraVidaCpu, pj.vida, pj.vidaMaxima);
        lblContAtaqueInfo.setText("Ataques: " + pj.contadorAtaquesNormales + "/2");
    }

    private void actualizarPokemonCpu() {
        lblNombreCpuInfo.setText(cpuActual != null ? cpuActual.nombre : "Sin rival");
        Pokemon pc = cpuActual != null ? cpuActual.getPokemonActual() : null;
        if (pc == null) {
            lblPokemonCpuInfo.setText("Sin Pokemon");
            lblimagencpu.setIcon(null);
            lblimagencpu.setText("");
            barraVidaCpu1.setMaximum(100);
            barraVidaCpu1.setValue(0);
            barraVidaCpu1.setString("0 / 0");
            barraVidaCpu1.setForeground(Color.RED);
            lblContDefensaInfo.setText("Defensas: 0/2");
            return;
        }
        lblPokemonCpuInfo.setText(pc.nombre);
        lblimagencpu.setIcon(cargarIconoPokemon(pc.nombre, false));
        lblimagencpu.setText(lblimagencpu.getIcon() == null ? pc.nombre : "");
        barraVidaCpu1.setMaximum(pc.vidaMaxima);
        barraVidaCpu1.setValue(pc.vida);
        barraVidaCpu1.setString(pc.vida + " / " + pc.vidaMaxima);
        actualizarColorBarra(barraVidaCpu1, pc.vida, pc.vidaMaxima);
        lblContDefensaInfo.setText("Defensas: " + pc.contadorDefensasNormales + "/2");
    }

    private void actualizarColorBarra(javax.swing.JProgressBar barra, int vida, int vidaMaxima) {
        double porcentaje = vidaMaxima == 0 ? 0 : (double) vida / vidaMaxima;
        if (porcentaje > 0.5) {
            barra.setForeground(new Color(0, 230, 64));
        } else if (porcentaje > 0.25) {
            barra.setForeground(Color.YELLOW);
        } else {
            barra.setForeground(Color.RED);
        }
    }

    private void habilitarControlesBatalla(boolean habilitar) {
        btnAtacar.setEnabled(habilitar);
        btnDefender.setEnabled(habilitar);
        btnAtaqueEspecial.setEnabled(habilitar);
        btnDefensaEsepcial.setEnabled(habilitar);
    }

    private void escribirResumen(String texto) {
        Batalla.reiniciar();
        for (String linea : texto.split("\\n")) {
            Batalla.push(linea);
        }
        txtPreview.setText(Batalla.obtenerHistorial());
        txtPreview.setCaretPosition(0);
    }

    private ImageIcon cargarIconoPokemon(String nombrePokemon, boolean jugadorLocal) {
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

    private static Jugador crearJugadorDemo(String nombre) {
        Jugador demo = new Jugador(nombre);
        demo.agregarPokemon(com.mycompany.main.FabricaPokemon.crearPokemon("Charmander"));
        demo.agregarPokemon(com.mycompany.main.FabricaPokemon.crearPokemon("Squirtle"));
        demo.agregarPokemon(com.mycompany.main.FabricaPokemon.crearPokemon("Pikachu"));
        demo.agregarPokemon(com.mycompany.main.FabricaPokemon.crearPokemon("Jolteon"));
        return demo;
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

    public static void main(String args[]) {
        try {
        } catch (Exception ex) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Torneo().setVisible(true);
            }
        });
    }

    private class BracketPanel extends JPanel {

        private final Font fontBox = new Font("Segoe UI", Font.BOLD, 12);
        private final Font fontTitle = new Font("Segoe UI", Font.BOLD, 16);

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int width = getWidth();
            int boxW = 130;
            int boxH = 24;
            int startX = 18;
            int rightX = width - boxW - 18;
            int y1 = 24;
            int y2 = 58;
            int y3 = 100;
            int y4 = 134;
            int y5 = 176;
            int y6 = 210;
            int y7 = 252;
            int y8 = 286;
            com.mycompany.main.ArbolTorneo arbol = torneoLogica.getArbol();
            String participante1 = arbol.getHoja1().getNombreVisible();
            String participante2 = arbol.getHoja2().getNombreVisible();
            String participante3 = arbol.getHoja3().getNombreVisible();
            String participante4 = arbol.getHoja4().getNombreVisible();
            String participante5 = arbol.getHoja5().getNombreVisible();
            String participante6 = arbol.getHoja6().getNombreVisible();
            String participante7 = arbol.getHoja7().getNombreVisible();
            String participante8 = arbol.getHoja8().getNombreVisible();
            String cuarto1 = arbol.getCuarto1().getNombreVisible();
            String cuarto2 = arbol.getCuarto2().getNombreVisible();
            String cuarto3 = arbol.getCuarto3().getNombreVisible();
            String cuarto4 = arbol.getCuarto4().getNombreVisible();
            String semi1 = arbol.getSemi1().getNombreVisible();
            String semi2 = arbol.getSemi2().getNombreVisible();
            String campeon = arbol.getRaiz().getNombreVisible();
            g2.setColor(Color.WHITE);
            g2.setFont(fontTitle);
            g2.drawString("Llave del torneo", width / 2 - 60, 18);
            dibujarCaja(g2, startX, y1, boxW, boxH, participante1, esNombreActivo(participante1));
            dibujarCaja(g2, startX, y2, boxW, boxH, participante2, esNombreActivo(participante2));
            dibujarCaja(g2, startX, y3, boxW, boxH, participante3, esNombreActivo(participante3));
            dibujarCaja(g2, startX, y4, boxW, boxH, participante4, esNombreActivo(participante4));
            dibujarCaja(g2, rightX, y5, boxW, boxH, participante5, esNombreActivo(participante5));
            dibujarCaja(g2, rightX, y6, boxW, boxH, participante6, esNombreActivo(participante6));
            dibujarCaja(g2, rightX, y7, boxW, boxH, participante7, esNombreActivo(participante7));
            dibujarCaja(g2, rightX, y8, boxW, boxH, participante8, esNombreActivo(participante8));
            int xQfLeft = 210;
            int xSfLeft = 360;
            int xCenter = width / 2 - 65;
            int xQfRight = width - 340;
            int xSfRight = width - 490;
            int yQfLeft1 = 41;
            int yQfLeft2 = 117;
            int yQfRight1 = 193;
            int yQfRight2 = 269;
            int ySf1 = 78;
            int ySf2 = 230;
            int yFinal = 154;
            dibujarCaja(g2, xQfLeft, yQfLeft1, boxW, boxH, cuarto1, esGanador(cuarto1));
            dibujarCaja(g2, xQfLeft, yQfLeft2, boxW, boxH, cuarto2, esGanador(cuarto2));
            dibujarCaja(g2, xQfRight, yQfRight1, boxW, boxH, cuarto3, esGanador(cuarto3));
            dibujarCaja(g2, xQfRight, yQfRight2, boxW, boxH, cuarto4, esGanador(cuarto4));
            dibujarCaja(g2, xSfLeft, ySf1, boxW, boxH, semi1, esGanador(semi1));
            dibujarCaja(g2, xSfRight, ySf2, boxW, boxH, semi2, esGanador(semi2));
            dibujarCaja(g2, xCenter, yFinal, boxW, boxH, campeon, arbol.getRaiz().ganador != null);
            g2.setStroke(new BasicStroke(4f));
            dibujarConexion(g2, startX + boxW, y1 + 12, xQfLeft, yQfLeft1 + 12, cuarto1, participante1, participante2);
            dibujarConexion(g2, startX + boxW, y2 + 12, xQfLeft, yQfLeft1 + 12, cuarto1, participante1, participante2);
            dibujarConexion(g2, startX + boxW, y3 + 12, xQfLeft, yQfLeft2 + 12, cuarto2, participante3, participante4);
            dibujarConexion(g2, startX + boxW, y4 + 12, xQfLeft, yQfLeft2 + 12, cuarto2, participante3, participante4);
            dibujarConexion(g2, xQfLeft + boxW, yQfLeft1 + 12, xSfLeft, ySf1 + 12, semi1, cuarto1, cuarto2);
            dibujarConexion(g2, xQfLeft + boxW, yQfLeft2 + 12, xSfLeft, ySf1 + 12, semi1, cuarto1, cuarto2);
            dibujarConexion(g2, rightX, y5 + 12, xQfRight + boxW, yQfRight1 + 12, cuarto3, participante5, participante6);
            dibujarConexion(g2, rightX, y6 + 12, xQfRight + boxW, yQfRight1 + 12, cuarto3, participante5, participante6);
            dibujarConexion(g2, rightX, y7 + 12, xQfRight + boxW, yQfRight2 + 12, cuarto4, participante7, participante8);
            dibujarConexion(g2, rightX, y8 + 12, xQfRight + boxW, yQfRight2 + 12, cuarto4, participante7, participante8);
            dibujarConexion(g2, xSfRight, ySf2 + 12, xQfRight, yQfRight1 + 12, semi2, cuarto3, cuarto4);
            dibujarConexion(g2, xSfRight, ySf2 + 12, xQfRight, yQfRight2 + 12, semi2, cuarto3, cuarto4);
            dibujarConexion(g2, xSfLeft + boxW, ySf1 + 12, xCenter, yFinal + 12, campeon, semi1, semi2);
            dibujarConexion(g2, xCenter + boxW, yFinal + 12, xSfRight, ySf2 + 12, campeon, semi1, semi2);
            g2.dispose();
        }

        private void dibujarCaja(Graphics2D g2, int x, int y, int w, int h, String texto, boolean ganador) {
            g2.setColor(ganador ? new Color(66, 133, 244) : new Color(255, 255, 255, 230));
            g2.fillRoundRect(x, y, w, h, 12, 12);
            g2.setColor(new Color(210, 210, 210));
            g2.drawRoundRect(x, y, w, h, 12, 12);
            g2.setColor(ganador ? Color.WHITE : new Color(44, 62, 80));
            g2.setFont(fontBox);
            String valor = texto == null ? "Pendiente" : texto;
            if (valor.length() > 16) {
                valor = valor.substring(0, 15) + ".";
            }
            g2.drawString(valor, x + 8, y + 16);
        }

        private void dibujarConexion(Graphics2D g2, int x1, int y1, int x2, int y2, String ganador, String nombreA, String nombreB) {
            boolean activa = ganador != null && (ganador.equals(nombreA) || ganador.equals(nombreB));
            g2.setColor(activa ? new Color(66, 133, 244) : new Color(190, 190, 190));
            int mitad = (x1 + x2) / 2;
            g2.drawLine(x1, y1, mitad, y1);
            g2.drawLine(mitad, y1, mitad, y2);
            g2.drawLine(mitad, y2, x2, y2);
        }

        private boolean esNombreActivo(String nombre) {
            if (nombre == null) {
                return false;
            }
            com.mycompany.main.ArbolTorneo arbol = torneoLogica.getArbol();
            return nombre.equals(arbol.getCuarto1().getNombreVisible())
                    || nombre.equals(arbol.getCuarto2().getNombreVisible())
                    || nombre.equals(arbol.getCuarto3().getNombreVisible())
                    || nombre.equals(arbol.getCuarto4().getNombreVisible())
                    || nombre.equals(arbol.getSemi1().getNombreVisible())
                    || nombre.equals(arbol.getSemi2().getNombreVisible())
                    || nombre.equals(arbol.getRaiz().getNombreVisible())
                    || nombre.equals(torneoLogica.getNombreJugador());
        }

        private boolean esGanador(String nombre) {
            return nombre != null && !"Pendiente".equals(nombre);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLlaves;
    private javax.swing.JProgressBar barraVidaCpu;
    private javax.swing.JProgressBar barraVidaCpu1;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnAtaqueEspecial;
    private javax.swing.JButton btnDefender;
    private javax.swing.JButton btnDefensaEsepcial;
    private javax.swing.JButton btnPreviewIniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblPreviewTitulo;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblimagencpu;
    private javax.swing.JLabel lblimagenpokemonjugador;
    private javax.swing.JLabel lblproximabatlla;
    private javax.swing.JPanel panelPreview;
    private javax.swing.JScrollPane scrollPreview;
    private javax.swing.JTextArea txtPreview;
    // End of variables declaration//GEN-END:variables
}

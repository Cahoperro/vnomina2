package vnomina;

import java.awt.Color;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author cahoperro
 */
public class MeterHoras extends javax.swing.JFrame {

    Principal Obj;
    private String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int diaSem;
    private double horas, nocturnas, festivas, radio, radioB, arma, vacaciones;
    MeterHoras meteHora;
    // Constructor de la ventana meter horas

    public MeterHoras(Principal Obj) {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.Obj = Obj;
        Obj.principal.diaActual = 0;
        mostrar();
        String key;
        Iterator iterator = Obj.principal.claves.keySet().iterator();
        while (iterator.hasNext()) {
            key = iterator.next().toString();
            selectorClave.addItem(key);
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeterHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        btnAdelante = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        txtServicio1 = new javax.swing.JTextField();
        txtEntrada1 = new javax.swing.JTextField();
        txtSalida1 = new javax.swing.JTextField();
        txtServicio2 = new javax.swing.JTextField();
        txtEntrada2 = new javax.swing.JTextField();
        txtSalida2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        checkRadio = new javax.swing.JCheckBox();
        checkArma = new javax.swing.JCheckBox();
        optBasica = new javax.swing.JRadioButton();
        checkVacaciones = new javax.swing.JCheckBox();
        checkFestivo = new javax.swing.JCheckBox();
        optPortuaria = new javax.swing.JRadioButton();
        btnGuardarClave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBorrarClave = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        selectorClave = new javax.swing.JComboBox();
        lblFestividad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir horarios");
        setName("MeterHoras"); // NOI18N
        setPreferredSize(new java.awt.Dimension(530, 430));
        setResizable(false);

        btnAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/Button_Next.png"))); // NOI18N
        btnAdelante.setToolTipText("Ir un dia adelante");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/Button_Back.png"))); // NOI18N
        btnAtras.setToolTipText("Ir un dia atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        lblFecha.setText("Ninguna fecha seleccionada");

        txtServicio1.setColumns(15);
        txtServicio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        txtEntrada1.setColumns(4);
        txtEntrada1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        txtSalida1.setColumns(4);
        txtSalida1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        txtServicio2.setColumns(15);
        txtServicio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        txtEntrada2.setColumns(4);
        txtEntrada2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        txtSalida2.setColumns(4);
        txtSalida2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pulsarTecla(evt);
            }
        });

        jLabel2.setText("Servicio");

        jLabel3.setText("Entrada");

        jLabel4.setText("Salida");

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        checkRadio.setText("Radioscopia");
        checkRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkRadioStateChanged(evt);
            }
        });

        checkArma.setText("Arma");

        grupoRadio.add(optBasica);
        optBasica.setSelected(true);
        optBasica.setText("Basica");
        optBasica.setEnabled(false);

        checkVacaciones.setText("Vacaciones");
        checkVacaciones.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkVacacionesItemStateChanged(evt);
            }
        });

        checkFestivo.setText("Festivo");

        grupoRadio.add(optPortuaria);
        optPortuaria.setText("A. portuaria");
        optPortuaria.setToolTipText("");
        optPortuaria.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkArma)
                    .addComponent(checkRadio)
                    .addComponent(optBasica)
                    .addComponent(checkVacaciones)
                    .addComponent(checkFestivo)
                    .addComponent(optPortuaria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkVacaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkFestivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkArma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optBasica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optPortuaria)
                .addGap(25, 25, 25))
        );

        btnGuardarClave.setText("Guardar clave");
        btnGuardarClave.setPreferredSize(new java.awt.Dimension(120, 25));
        btnGuardarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarClaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Clave servicio");

        btnBorrarClave.setText("Borrar clave");
        btnBorrarClave.setPreferredSize(new java.awt.Dimension(120, 25));
        btnBorrarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClaveActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 25));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        selectorClave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------" }));
        selectorClave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorClaveItemStateChanged(evt);
            }
        });

        lblFestividad.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblFestividad.setForeground(new java.awt.Color(205, 46, 46));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectorClave, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtServicio2)
                                            .addComponent(txtServicio1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(lblFestividad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdelante)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdelante)
                    .addComponent(btnAtras)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtServicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblFestividad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnGuardarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectorClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        insertar();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        atras();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        adelante();
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        insertar();
        for (int i = 0; i < Obj.principal.mes[Obj.principal.mesActual].getN(); i++) {
            Obj.principal.diaActual = i;
            Obj.principal.mes[Obj.principal.mesActual].dia[i].calHoras(Obj.principal);
            horas += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempHoras();
            nocturnas += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempNocturnas();
            festivas += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempFestivas();
            radio += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempRadio();
            radioB += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempRadioB();

            if (Obj.principal.mes[Obj.principal.mesActual].dia[i].isArma()) {
                arma += Obj.principal.mes[Obj.principal.mesActual].dia[i].getTempHoras();
            }
            if (arma > Principal.horasJornadaMensual) {
                arma = Principal.horasJornadaMensual;
            }

        }

        // Limitar el numero de decimales a 2
        horas = (Math.floor(horas * 100) / 100);
        nocturnas = (Math.floor(nocturnas * 100) / 100);
        festivas = (Math.floor(festivas * 100) / 100);
        radio = (Math.floor(radio * 100) / 100);
        radioB = (Math.floor(radioB * 100) / 100);
        arma = (Math.floor(arma * 100) / 100);
        vacaciones = (Math.floor(vacaciones * 100) / 100);

        // Introducir las horas en el Objeto principal
        Obj.principal.mes[Obj.principal.mesActual].setHorasMes(horas);
        Obj.principal.mes[Obj.principal.mesActual].setHorasNocturnas(nocturnas);
        Obj.principal.mes[Obj.principal.mesActual].setHorasFestivas(festivas);
        Obj.principal.mes[Obj.principal.mesActual].setHorasRadio(radio);
        Obj.principal.mes[Obj.principal.mesActual].setHorasRadioB(radioB);
        Obj.principal.mes[Obj.principal.mesActual].setHorasArma(arma);
        Obj.principal.mes[Obj.principal.mesActual].setHorasVacaciones(vacaciones);

        Obj.recuperarDatos();
        Obj.mostrarResultado();
        Obj.calcular();
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnGuardarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarClaveActionPerformed

        String p = JOptionPane.showInputDialog("Introduce la clave a guardar");
        if (Obj.principal.claves.get(p) != null) {
            int g = JOptionPane.showConfirmDialog(null,
                    "La clave (" + p + ") ya existe"
                    + " ¿Quieres sobreescribirla?");
            if (g == 0) {
                selectorClave.removeItem(p);
                guardarClave(p);
            }
        } else {
            guardarClave(p);
        }
    }//GEN-LAST:event_btnGuardarClaveActionPerformed

    private void checkRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkRadioStateChanged

        if (checkRadio.isSelected()) {
            optBasica.setEnabled(true);
            optPortuaria.setEnabled(true);
        } else {
            optBasica.setEnabled(false);
            optPortuaria.setEnabled(false);
        }
    }//GEN-LAST:event_checkRadioStateChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClaveActionPerformed

        if (!"------".equals(selectorClave.getSelectedItem().toString())) {
            int g = JOptionPane.showConfirmDialog(null,
                    "Se va ha borrar la clave " + selectorClave.getSelectedItem().toString()
                    + " ¿continuar?");
            if (g == 0) {
                Obj.principal.claves.remove(selectorClave.getSelectedItem().toString());
                selectorClave.removeItem(selectorClave.getSelectedItem().toString());
                selectorClave.setSelectedIndex(0);
                limpiar();
            }
        }
    }//GEN-LAST:event_btnBorrarClaveActionPerformed

    private void selectorClaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorClaveItemStateChanged

        if (!"------".equals(selectorClave.getSelectedItem().toString())) {
            Dias clave = Obj.principal.claves.get(selectorClave.getSelectedItem().toString());
            ponerRojo();
            txtServicio1.setText(clave.getServicio1());
            txtServicio2.setText(clave.getServicio2());
            txtSalida1.setText(clave.getSalida1());
            txtSalida2.setText(clave.getSalida2());
            txtEntrada1.setText(clave.getEntrada1());
            txtEntrada2.setText(clave.getEntrada2());
            checkArma.setSelected(clave.isArma());
            checkRadio.setSelected(clave.isRadioscopia());
            optPortuaria.setSelected(clave.isRadio());
            optBasica.setSelected(clave.isRadioB());
        }
    }//GEN-LAST:event_selectorClaveItemStateChanged

    private void pulsarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pulsarTecla
        ponerRojo();

    }//GEN-LAST:event_pulsarTecla

    private void checkVacacionesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkVacacionesItemStateChanged
        if (checkVacaciones.isSelected()) {
            txtServicio1.setText("Vacaciones");
            txtServicio2.setText("");
            txtSalida2.setText("");
            txtEntrada1.setText("");
            txtEntrada2.setText("");
            txtSalida1.setText("");
        }
    }//GEN-LAST:event_checkVacacionesItemStateChanged

    private void adelante() {
        if (Obj.principal.diaActual >= Obj.principal.mes[Obj.principal.mesActual].getN() - 1) {
            Obj.principal.diaActual = -1;
        }
        Obj.principal.diaActual++;
        mostrar();
        selectorClave.setSelectedIndex(0);
    }

    private void atras() {
        if (Obj.principal.diaActual < 1) {
            Obj.principal.diaActual = Obj.principal.mes[Obj.principal.mesActual].getN();
        }
        Obj.principal.diaActual--;
        mostrar();
        selectorClave.setSelectedIndex(0);
    }

    private void mostrar() {
        String diaSemana = "";
        switch (Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getDiaSemana()) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
        }
        ponerNegro();

        lblFecha.setText(diaSemana + " " + (Obj.principal.diaActual + 1) + " de " + nombreMeses[Obj.principal.mesActual]);
        lblFestividad.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getFestividad());
        txtServicio1.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getServicio1());
        txtServicio2.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getServicio2());
        txtSalida1.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getSalida1());
        txtSalida2.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getSalida2());
        txtEntrada1.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getEntrada1());
        txtEntrada2.setText(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].getEntrada2());
        checkArma.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isArma());
        checkFestivo.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isFestivo());
        checkRadio.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isRadioscopia());
        optPortuaria.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isRadio());
        optBasica.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isRadioB());
        checkVacaciones.setSelected(Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].isVacaciones());
    }

    public void insertar() {

        boolean valido = true;

        Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setServicio1(txtServicio1.getText());
        Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setServicio2(txtServicio2.getText());

        String ent1 = txtEntrada1.getText().replace('.', ':');
        if (validar(ent1)) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setEntrada1(ent1);
        } else {
            txtEntrada1.requestFocus();
            txtEntrada1.selectAll();
            valido = false;
        }

        String ent2 = txtEntrada2.getText().replace('.', ':');
        if (validar(ent2)) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setEntrada2(ent2);
        } else {
            txtEntrada2.requestFocus();
            txtEntrada2.selectAll();
            valido = false;
        }

        String sal1 = txtSalida1.getText().replace('.', ':');
        if (validar(sal1)) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setSalida1(sal1);
        } else {
            txtSalida1.requestFocus();
            txtSalida1.selectAll();
            valido = false;
        }

        String sal2 = txtSalida2.getText().replace('.', ':');
        if (validar(sal2)) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setSalida2(sal2);
        } else {
            txtSalida2.requestFocus();
            txtSalida2.selectAll();
            valido = false;
        }

        if (checkVacaciones.isSelected()) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setVacaciones(true);
        } else {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setVacaciones(false);
        }

        if (checkArma.isSelected()) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setArma(true);
        } else {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setArma(false);
        }
        if (checkFestivo.isSelected()) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setFestivo(true);
        } else {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setFestivo(false);
        }

        if (checkRadio.isSelected()) {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadioscopia(true);

            if (optBasica.isSelected()) {
                Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadioB(true);
            } else {
                Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadioB(false);
            }
            if (optPortuaria.isSelected()) {
                Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadio(true);
            } else {
                Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadio(false);
            }
        } else {
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadioscopia(false);
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadio(false);
            Obj.principal.mes[Obj.principal.mesActual].dia[Obj.principal.diaActual].setRadioB(false);
        }

        if (Obj.principal.diaActual < Obj.principal.mes[Obj.principal.mesActual].getN() - 1) {
            Obj.principal.diaActual++;
        }
        if (valido) {

            mostrar();

            selectorClave.setSelectedIndex(0);
            Obj.principal.guardado = false;
        }
    }

    private void ponerRojo() {
        txtServicio1.setForeground(Color.red);
        txtServicio2.setForeground(Color.red);
        txtSalida1.setForeground(Color.red);
        txtSalida2.setForeground(Color.red);
        txtEntrada1.setForeground(Color.red);
        txtEntrada2.setForeground(Color.red);
    }

    private void ponerNegro() {
        txtServicio1.setForeground(Color.BLACK);
        txtServicio2.setForeground(Color.BLACK);
        txtSalida1.setForeground(Color.BLACK);
        txtSalida2.setForeground(Color.BLACK);
        txtEntrada1.setForeground(Color.BLACK);
        txtEntrada2.setForeground(Color.BLACK);
    }

    void limpiar() {

        txtServicio1.setText("");
        txtServicio2.setText("");
        txtSalida1.setText("");
        txtSalida2.setText("");
        txtEntrada1.setText("");
        txtEntrada2.setText("");
        checkArma.setSelected(false);
        checkRadio.setSelected(false);
        checkVacaciones.setSelected(false);
        selectorClave.setSelectedIndex(0);
    }

    private void guardarClave(String p) {
        Dias tem = new Dias();
        tem.setServicio1(txtServicio1.getText());
        tem.setServicio2(txtServicio2.getText());
        tem.setEntrada1(txtEntrada1.getText());
        tem.setEntrada2(txtEntrada2.getText());
        tem.setSalida1(txtSalida1.getText());
        tem.setSalida2(txtSalida2.getText());

        if (checkVacaciones.isSelected()) {
            tem.setVacaciones(true);
        } else {
            tem.setVacaciones(false);
        }
        if (checkArma.isSelected()) {
            tem.setArma(true);
        } else {
            tem.setArma(false);
        }

        if (checkRadio.isSelected()) {
            tem.setRadioscopia(true);
        } else {
            tem.setRadioscopia(false);
        }

        if (optBasica.isSelected()) {
            tem.setRadioB(true);
        } else {
            tem.setRadioB(false);
        }
        if (optPortuaria.isSelected()) {
            tem.setRadio(true);
        } else {
            tem.setRadio(false);
        }
        if (!"".equals(p)) {
            Obj.principal.claves.put(p, tem);
            selectorClave.addItem(p);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Tienes que escribir una clave",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private boolean validar(String hora) {
        boolean res = true;
        int h = 0;
        int m = 0;
        if (!"".equals(hora)) {
            String[] temp = hora.split(":");
            if (temp.length < 2) {
                res = false;
            }
            try {
                h = Integer.parseInt(temp[0]);
                m = Integer.parseInt(temp[1]);
            } catch (NumberFormatException ex) {
                res = false;
            }
            if (h < 0 || h > 23) {
                res = false;
            }
            if (m < 0 || m > 59) {
                res = false;
            }
        }
        return res;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrarClave;
    private javax.swing.JButton btnGuardarClave;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox checkArma;
    private javax.swing.JCheckBox checkFestivo;
    private javax.swing.JCheckBox checkRadio;
    private javax.swing.JCheckBox checkVacaciones;
    private javax.swing.ButtonGroup grupoRadio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFestividad;
    private javax.swing.JRadioButton optBasica;
    private javax.swing.JRadioButton optPortuaria;
    private javax.swing.JComboBox selectorClave;
    private javax.swing.JTextField txtEntrada1;
    private javax.swing.JTextField txtEntrada2;
    private javax.swing.JTextField txtSalida1;
    private javax.swing.JTextField txtSalida2;
    private javax.swing.JTextField txtServicio1;
    private javax.swing.JTextField txtServicio2;
    // End of variables declaration//GEN-END:variables

}

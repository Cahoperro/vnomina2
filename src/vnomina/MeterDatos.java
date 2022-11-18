package vnomina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author cahoperro
 */
public class MeterDatos extends javax.swing.JFrame implements Runnable {

    Principal inicio;
    Thread hilo;

    /**
     * Creates new form MeterDatos
     */
    public MeterDatos(Principal init) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        lblInfo.setVisible(false);
        this.inicio = init;

        if (inicio.principal != null) {
            txtAntiguedad.setText("" + inicio.principal.datos.getAntiguedad());
            txtHoraArma.setText("" + inicio.principal.datos.getHoraArma());
            txtHoraExtra.setText("" + inicio.principal.datos.getHoraExtra());
            txtHoraFestiva.setText("" + inicio.principal.datos.getHoraFestiva());
            txtHoraNocturna.setText("" + inicio.principal.datos.getHoraNocturna());
            txtHorasConvenio.setText("" + inicio.principal.datos.getHorasConvenio());
            txtKilometraje.setText("" + inicio.principal.datos.getKilometraje());
            txtNochebuena.setText("" + inicio.principal.datos.getNochebuena());
            txtPeligrosidad.setText("" + inicio.principal.datos.getPeligro());
            txtQuinquenio.setText("" + inicio.principal.datos.getQuinquenio());
            txtRadio.setText("" + inicio.principal.datos.getRadio());
            txtRadioBasica.setText("" + inicio.principal.datos.getRadioBasica());
            txtSalarioBase.setText("" + inicio.principal.datos.getSalarioBase());
            txtTransporte.setText("" + inicio.principal.datos.getTransporte());
            txtTrienio.setText("" + inicio.principal.datos.getTrienio());
            txtVestuario.setText("" + inicio.principal.datos.getVestuario());
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MeterDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeterDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeterDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeterDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAntiguedad = new javax.swing.JTextField();
        txtSalarioBase = new javax.swing.JTextField();
        txtTransporte = new javax.swing.JTextField();
        txtVestuario = new javax.swing.JTextField();
        txtPeligrosidad = new javax.swing.JTextField();
        txtTrienio = new javax.swing.JTextField();
        txtQuinquenio = new javax.swing.JTextField();
        txtHoraNocturna = new javax.swing.JTextField();
        txtHoraExtra = new javax.swing.JTextField();
        txtHoraFestiva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtRadioBasica = new javax.swing.JTextField();
        txtKilometraje = new javax.swing.JTextField();
        txtHoraArma = new javax.swing.JTextField();
        txtRadio = new javax.swing.JTextField();
        txtNochebuena = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnObtenerDatos = new javax.swing.JButton();
        txtHorasConvenio = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Introducir datos");
        setName("MeterDatos"); // NOI18N
        setPreferredSize(new java.awt.Dimension(460, 390));
        setResizable(false);

        txtAntiguedad.setColumns(6);

        txtSalarioBase.setColumns(6);

        txtTransporte.setColumns(6);

        txtVestuario.setColumns(6);

        txtPeligrosidad.setColumns(6);

        txtTrienio.setColumns(6);

        txtQuinquenio.setColumns(6);

        txtHoraNocturna.setColumns(6);

        txtHoraExtra.setColumns(6);

        txtHoraFestiva.setColumns(6);

        jLabel1.setText("Jornada %");

        jLabel2.setText("Años antiguedad");

        jLabel3.setText("Salario base");

        jLabel4.setText("Plus transporte");

        jLabel5.setText("Plus vestuario");

        jLabel6.setText("Plus peligrosidad");

        jLabel7.setText("Trienio");

        jLabel8.setText("Quinquenio");

        jLabel9.setText("Hora nocturna");

        jLabel10.setText("Hora festiva");

        jLabel11.setText("Hora extra");

        btnAceptar.setText("Aceptar");
        btnAceptar.setPreferredSize(new java.awt.Dimension(70, 25));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(70, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtRadioBasica.setColumns(6);

        txtKilometraje.setColumns(6);

        txtHoraArma.setColumns(6);

        txtRadio.setColumns(6);

        txtNochebuena.setColumns(6);

        jLabel12.setText("Hora arma");

        jLabel13.setText("Nochebuena/vieja");

        jLabel14.setText("Kilometraje");

        jLabel15.setText("Radioscopia basica");

        jLabel16.setText("Radioscopia A.port");

        btnObtenerDatos.setText("Obtener datos");
        btnObtenerDatos.setToolTipText("Obtener los datos desde internet");
        btnObtenerDatos.setPreferredSize(new java.awt.Dimension(70, 25));
        btnObtenerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerDatosActionPerformed(evt);
            }
        });

        txtHorasConvenio.setColumns(6);

        lblInfo.setForeground(java.awt.Color.red);
        lblInfo.setText("Hay errores o falta algún dato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnObtenerDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHorasConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTrienio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuinquenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraFestiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNochebuena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRadioBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)))
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraNocturna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraFestiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraArma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNochebuena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRadioBasica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTrienio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuinquenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHorasConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lblInfo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObtenerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObtenerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerDatosActionPerformed
        btnObtenerDatos.setText("Espera...");
        if (hilo == null) {
            hilo = new Thread(this);
            hilo.start();
        }
    }//GEN-LAST:event_btnObtenerDatosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    @Override
    public void run() {
        String[] datos = new String[14];
        String[] temp = new String[2];
        try {

            URL pagina = new URL("http://chapuzas.comocreartuweb.es/documentos/datos.txt");
            HttpURLConnection con = (HttpURLConnection) pagina.openConnection();
            con.connect();
            InputStreamReader in = new InputStreamReader((InputStream) con.getContent());
            BufferedReader buff = new BufferedReader(in);

            for (int i = 0; i < 14; i++) {
                temp = buff.readLine().split(" ");
                datos[i] = temp[1];
            }
            txtSalarioBase.setText(datos[0]);
            txtTransporte.setText(datos[1]);
            txtVestuario.setText(datos[2]);
            txtPeligrosidad.setText(datos[3]);
            txtTrienio.setText(datos[4]);
            txtQuinquenio.setText(datos[5]);
            txtHoraNocturna.setText(datos[6]);
            txtHoraFestiva.setText(datos[7]);
            txtHoraArma.setText(datos[8]);
            txtNochebuena.setText(datos[9]);
            txtKilometraje.setText(datos[10]);
            txtRadio.setText(datos[11]);
            txtRadioBasica.setText(datos[12]);
            txtHorasConvenio.setText(datos[13]);
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,
                    "Chungo, Ha fallado la conexion",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            btnObtenerDatos.setText("Obtener datos");
            hilo = null;
        }
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (inicio.principal.datos == null) {
            try {
                inicio.d.setAntiguedad(Integer.parseInt(txtAntiguedad.getText()));
                inicio.d.setHoraArma(Double.parseDouble(txtHoraArma.getText().replace(',', '.')));
                inicio.d.setHoraExtra(Double.parseDouble(txtHoraExtra.getText().replace(',', '.')));
                inicio.d.setHoraFestiva(Double.parseDouble(txtHoraFestiva.getText().replace(',', '.')));
                inicio.d.setHoraNocturna(Double.parseDouble(txtHoraNocturna.getText().replace(',', '.')));
                inicio.d.setHorasConvenio(Double.parseDouble(txtHorasConvenio.getText().replace(',', '.')));
                inicio.d.setKilometraje(Double.parseDouble(txtKilometraje.getText().replace(',', '.')));
                inicio.d.setNochebuena(Double.parseDouble(txtNochebuena.getText().replace(',', '.')));
                inicio.d.setPeligro(Double.parseDouble(txtPeligrosidad.getText().replace(',', '.')));
                inicio.d.setQuinquenio(Double.parseDouble(txtQuinquenio.getText().replace(',', '.')));
                inicio.d.setRadio(Double.parseDouble(txtRadio.getText().replace(',', '.')));
                inicio.d.setRadioBasica(Double.parseDouble(txtRadioBasica.getText().replace(',', '.')));
                inicio.d.setSalarioBase(Double.parseDouble(txtSalarioBase.getText().replace(',', '.')));
                inicio.d.setTransporte(Double.parseDouble(txtTransporte.getText().replace(',', '.')));
                inicio.d.setTrienio(Double.parseDouble(txtTrienio.getText().replace(',', '.')));
                inicio.d.setVestuario(Double.parseDouble(txtVestuario.getText().replace(',', '.')));
                inicio.mostrarTitulo();
               

                this.dispose();
            } catch (NumberFormatException ex) {
                lblInfo.setVisible(true);
            }
        } else {
            try {
                inicio.principal.datos.setAntiguedad(Integer.parseInt(txtAntiguedad.getText()));
                inicio.principal.datos.setHoraArma(Double.parseDouble(txtHoraArma.getText().replace(',', '.')));
                inicio.principal.datos.setHoraExtra(Double.parseDouble(txtHoraExtra.getText().replace(',', '.')));
                inicio.principal.datos.setHoraFestiva(Double.parseDouble(txtHoraFestiva.getText().replace(',', '.')));
                inicio.principal.datos.setHoraNocturna(Double.parseDouble(txtHoraNocturna.getText().replace(',', '.')));
                inicio.principal.datos.setHorasConvenio(Double.parseDouble(txtHorasConvenio.getText().replace(',', '.')));
                inicio.principal.datos.setKilometraje(Double.parseDouble(txtKilometraje.getText().replace(',', '.')));
                inicio.principal.datos.setNochebuena(Double.parseDouble(txtNochebuena.getText().replace(',', '.')));
                inicio.principal.datos.setPeligro(Double.parseDouble(txtPeligrosidad.getText().replace(',', '.')));
                inicio.principal.datos.setQuinquenio(Double.parseDouble(txtQuinquenio.getText().replace(',', '.')));
                inicio.principal.datos.setRadio(Double.parseDouble(txtRadio.getText().replace(',', '.')));
                inicio.principal.datos.setRadioBasica(Double.parseDouble(txtRadioBasica.getText().replace(',', '.')));
                inicio.principal.datos.setSalarioBase(Double.parseDouble(txtSalarioBase.getText().replace(',', '.')));
                inicio.principal.datos.setTransporte(Double.parseDouble(txtTransporte.getText().replace(',', '.')));
                inicio.principal.datos.setTrienio(Double.parseDouble(txtTrienio.getText().replace(',', '.')));
                inicio.principal.datos.setVestuario(Double.parseDouble(txtVestuario.getText().replace(',', '.')));
                inicio.mostrarTitulo();

                this.dispose();
            } catch (NumberFormatException ex) {
                lblInfo.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnObtenerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtAntiguedad;
    private javax.swing.JTextField txtHoraArma;
    private javax.swing.JTextField txtHoraExtra;
    private javax.swing.JTextField txtHoraFestiva;
    private javax.swing.JTextField txtHoraNocturna;
    private javax.swing.JTextField txtHorasConvenio;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextField txtNochebuena;
    private javax.swing.JTextField txtPeligrosidad;
    private javax.swing.JTextField txtQuinquenio;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtRadioBasica;
    private javax.swing.JTextField txtSalarioBase;
    private javax.swing.JTextField txtTransporte;
    private javax.swing.JTextField txtTrienio;
    private javax.swing.JTextField txtVestuario;
    // End of variables declaration//GEN-END:variables
}

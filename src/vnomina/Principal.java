package vnomina;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author cahoperro
 */
public class Principal extends javax.swing.JFrame {

    String version = "Vnomina 2023";
    int anio;
    Objeto principal;
    Datos d;
    MeterDatos meteDato;
    MeterHoras meteHora;
    String fichero, textomes;
    double horas, horasFestivas, horasNocturnas, horasRadio, horasRadioB, horasArma;
    double salarioBase, antiguedad, tAntiguedad, festivos, nocturnos, pPeligrosidad;
    double horasVacaciones, pPagasExtras, horasExtra, pTransporte, pVestuario;
    double cComunes, desempleo, fp, tAportaciones, tDevengado, tDeducir, tExtra, liquido;
    double vExtra, vNocturna, vFestiva, vRadio, vRadioB, vArma, tArma;
    double vNochebuena, vQuinquenio, vTrienio, vKilometro, horasConvenio;
    double dCcomunes, dHorasExtra, IRPF, tIrpf, JefeEquipo, tNochebuena;
    double tHorasRadio, tHorasRadioB;

    /**
     * Creates new form Principal
     */
    public Principal() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        setTitle(version);
        if (screenSize.height > 600) {
            setSize(1000, 650);
        } else {
            setExtendedState(MAXIMIZED_BOTH);
        }
        this.addWindowListener(new EscuchaVentana(this));
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        chkBuena.setVisible(false);
        chkVieja.setVisible(false);
        selectorMes.setEnabled(false);
        btnCalcular.setEnabled(false);
        TableCellRenderer renderer = new RenderCelda();
        tabla.setDefaultRenderer(Object.class, renderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        barra = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMeterHoras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarComo = new javax.swing.JButton();
        btnCambioDatos = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnAcerca = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        selectorMes = new javax.swing.JComboBox();
        panelGeneral = new javax.swing.JTabbedPane();
        javax.swing.JPanel panelNomina = new javax.swing.JPanel();
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
        jLabel12 = new javax.swing.JLabel();
        lblSalarioBase = new javax.swing.JLabel();
        lblHorasExtras = new javax.swing.JLabel();
        lblAntiguedad = new javax.swing.JLabel();
        lblFestivos = new javax.swing.JLabel();
        lblPeligrosidad = new javax.swing.JLabel();
        lblNocturnidad = new javax.swing.JLabel();
        lblPagas = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblVestuario = new javax.swing.JLabel();
        lblTotalDevengado = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblComunes = new javax.swing.JLabel();
        lblDesempleo = new javax.swing.JLabel();
        lblFP = new javax.swing.JLabel();
        lblTolalAportaciones = new javax.swing.JLabel();
        lblIrpf = new javax.swing.JLabel();
        lblTotalDeducir = new javax.swing.JLabel();
        lblLiquido = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIrpf = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        radioQuinquenios = new javax.swing.JRadioButton();
        radioTrienio = new javax.swing.JRadioButton();
        chkPagas = new javax.swing.JCheckBox();
        chkBuena = new javax.swing.JCheckBox();
        chkJefeEquipo = new javax.swing.JCheckBox();
        chkVieja = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        lblArma = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblRadio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblRestantes = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTendencia = new javax.swing.JLabel();
        panelHoras = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vnomina");
        setName("principal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 550));

        barra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        barra.setFloatable(false);
        barra.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        barra.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/abrir.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        barra.add(btnAbrir);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/cerrar.png"))); // NOI18N
        btnCerrar.setToolTipText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        barra.add(btnCerrar);

        btnMeterHoras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/modificar.png"))); // NOI18N
        btnMeterHoras.setToolTipText("Meter horarios");
        btnMeterHoras.setFocusable(false);
        btnMeterHoras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMeterHoras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMeterHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeterHorasActionPerformed(evt);
            }
        });
        barra.add(btnMeterHoras);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/guardar.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        barra.add(btnGuardar);

        btnGuardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/guardarComo.png"))); // NOI18N
        btnGuardarComo.setToolTipText("Guardar como");
        btnGuardarComo.setFocusable(false);
        btnGuardarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComoActionPerformed(evt);
            }
        });
        barra.add(btnGuardarComo);

        btnCambioDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/cambio.png"))); // NOI18N
        btnCambioDatos.setToolTipText("Cambiar los datos iniciales");
        btnCambioDatos.setFocusable(false);
        btnCambioDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambioDatos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCambioDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioDatosActionPerformed(evt);
            }
        });
        barra.add(btnCambioDatos);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/imprimir.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        barra.add(btnImprimir);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/ayuda.png"))); // NOI18N
        btnAyuda.setToolTipText("Ayuda");
        btnAyuda.setFocusable(false);
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        barra.add(btnAyuda);

        btnAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vnomina/Images/acerca.png"))); // NOI18N
        btnAcerca.setToolTipText("Acerca de");
        btnAcerca.setFocusable(false);
        btnAcerca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcerca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        barra.add(btnAcerca);

        lblInfo.setFont(new java.awt.Font("DejaVu Sans", 3, 16)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 0, 255));
        lblInfo.setText("Ningun documento abierto");

        selectorMes.setMaximumRowCount(12);
        selectorMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        selectorMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorMesItemStateChanged(evt);
            }
        });

        panelGeneral.setPreferredSize(new java.awt.Dimension(900, 440));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("PERCEPCIONES SALARIALES:");

        jLabel2.setText("Salario base");

        jLabel3.setText("Horas extras");

        jLabel4.setText("Antiguedad");

        jLabel5.setText("Plus festivos");

        jLabel6.setText("Plus peligrosidad");

        jLabel7.setText("Plus nocturnidad");

        jLabel8.setText("P.P.Pagas extras");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setText("PERCEPCIONES NO SALARIALES:");

        jLabel10.setText("Plus transporte");

        jLabel11.setText("Plus vestuario");

        jLabel12.setText("Total devengado");

        lblSalarioBase.setText("0.0");

        lblHorasExtras.setText("0.0");

        lblAntiguedad.setText("0.0");

        lblFestivos.setText("0.0");

        lblPeligrosidad.setText("0.0");

        lblNocturnidad.setText("0.0");

        lblPagas.setText("0.0");

        lblTransporte.setText("0.0");

        lblVestuario.setText("0.0");

        lblTotalDevengado.setText("0.0");

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel23.setText("DEDUCCIONES:");

        jLabel24.setText("C.comunes");

        jLabel25.setText("Base accidente");

        jLabel26.setText("No usado");

        jLabel27.setText("Total aportaciones");

        jLabel28.setText("IRPF");

        jLabel29.setText("Total a deducir");

        jLabel30.setText("Liquido a percibir");

        lblComunes.setText("0.0");

        lblDesempleo.setText("0.0");

        lblFP.setText("0.0");

        lblTolalAportaciones.setText("0.0");

        lblIrpf.setText("0.0");

        lblTotalDeducir.setText("0.0");

        lblLiquido.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblLiquido.setForeground(new java.awt.Color(0, 51, 51));
        lblLiquido.setText("0.0 €");

        jLabel13.setText("Introduce el IRPF");

        txtIrpf.setColumns(3);

        btnCalcular.setText("Calcular");
        btnCalcular.setPreferredSize(new java.awt.Dimension(120, 30));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        grupo.add(radioQuinquenios);
        radioQuinquenios.setSelected(true);
        radioQuinquenios.setText("Quinquenios");

        grupo.add(radioTrienio);
        radioTrienio.setText("Trienios");

        chkPagas.setSelected(true);
        chkPagas.setText("Prorrateo P.extras");

        chkBuena.setText("Nochebuena");

        chkJefeEquipo.setText("Responsable de equipo");

        chkVieja.setText("Nochevieja");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioQuinquenios)
                    .addComponent(radioTrienio)
                    .addComponent(chkPagas)
                    .addComponent(chkBuena)
                    .addComponent(chkJefeEquipo)
                    .addComponent(chkVieja))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(radioQuinquenios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioTrienio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkPagas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkJefeEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkBuena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkVieja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setText("Plus arma");

        lblArma.setText("0.0");

        lbl.setText("Plus radioscopia");

        lblRadio.setText("0.0");

        jLabel15.setText("Horas restantes del año:");

        lblRestantes.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblRestantes.setText("0");

        jLabel16.setText("Tendencia mensual:");

        lblTendencia.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblTendencia.setText("0");

        javax.swing.GroupLayout panelNominaLayout = new javax.swing.GroupLayout(panelNomina);
        panelNomina.setLayout(panelNominaLayout);
        panelNominaLayout.setHorizontalGroup(
            panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNominaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNominaLayout.createSequentialGroup()
                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelNominaLayout.createSequentialGroup()
                                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(63, 63, 63)
                                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNocturnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPeligrosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblFestivos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblPagas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblArma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblTotalDevengado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblVestuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(15, 484, Short.MAX_VALUE))
                                    .addGroup(panelNominaLayout.createSequentialGroup()
                                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelNominaLayout.createSequentialGroup()
                                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel14))
                                                .addGap(110, 110, 110)
                                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel24)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel27)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel16))
                                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelNominaLayout.createSequentialGroup()
                                                        .addGap(34, 34, 34)
                                                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblComunes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblDesempleo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblFP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblTolalAportaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lblTotalDeducir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(panelNominaLayout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblTendencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jLabel9))
                                        .addGap(0, 207, Short.MAX_VALUE)))
                                .addComponent(jLabel30))
                            .addGroup(panelNominaLayout.createSequentialGroup()
                                .addComponent(lbl)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNominaLayout.createSequentialGroup()
                                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelNominaLayout.createSequentialGroup()
                                        .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addGap(41, 41, 41))
                            .addComponent(lblLiquido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        panelNominaLayout.setVerticalGroup(
            panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNominaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel24)
                            .addComponent(lblComunes)
                            .addComponent(lblSalarioBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel25)
                            .addComponent(lblDesempleo)
                            .addComponent(lblHorasExtras))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel26)
                            .addComponent(lblFP)
                            .addComponent(lblAntiguedad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel27)
                            .addComponent(lblTolalAportaciones)
                            .addComponent(lblFestivos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel28)
                            .addComponent(lblIrpf)
                            .addComponent(lblPeligrosidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel29)
                            .addComponent(lblTotalDeducir)
                            .addComponent(lblNocturnidad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblPagas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(lblArma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(lblRadio))
                        .addGap(19, 19, 19)))
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtIrpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(panelNominaLayout.createSequentialGroup()
                        .addComponent(lblTransporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNominaLayout.createSequentialGroup()
                                .addComponent(lblVestuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotalDevengado))
                            .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLiquido)
                                .addComponent(jLabel30)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(lblRestantes)
                    .addComponent(jLabel16)
                    .addComponent(lblTendencia))
                .addGap(20, 20, 20))
        );

        panelGeneral.addTab("Mostrar nomina", panelNomina);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "F", "Dia", "Servicio 1", "Ent", "Sal", "Servicio 2", "Ent", "Sal", "Horas", "Nocturnas", "Festivas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setColumnSelectionAllowed(true);
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla.getColumnModel().getColumn(0).setMaxWidth(20);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(35);
            tabla.getColumnModel().getColumn(1).setMaxWidth(35);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(170);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(170);
        }

        javax.swing.GroupLayout panelHorasLayout = new javax.swing.GroupLayout(panelHoras);
        panelHoras.setLayout(panelHorasLayout);
        panelHorasLayout.setHorizontalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHorasLayout.setVerticalGroup(
            panelHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        panelGeneral.addTab("Mostrar horarios", panelHoras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblInfo)
                        .addComponent(selectorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        // Creacion de un archivo nuevo
        if (principal == null) {
            String p = JOptionPane.showInputDialog("Introduce el año");
            try {
                anio = Integer.parseInt(p);
                meteDato = new MeterDatos(this);
                d = new Datos();
                principal = new Objeto(d, anio);
                selectorMes.setEnabled(true);
                btnCalcular.setEnabled(true);
            } catch (NumberFormatException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Cierra el archivo abierto antes de crear uno nuevo",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnMeterHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeterHorasActionPerformed

        // Crear instancia MeterHoras para introducir horarios
        if (principal != null) {
            meteHora = new MeterHoras(this);
        }

    }//GEN-LAST:event_btnMeterHorasActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed

        // Codigo de abrir archivo
        if (principal == null) {
            JFileChooser selector = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos chp", "chp");
            selector.setFileFilter(filtro);
            try {
                if (selector.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    fichero = selector.getSelectedFile().toString();
                    FileInputStream fis = new FileInputStream(fichero);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    //El método readObject() recupera el objeto
                    principal = (Objeto) ois.readObject();
                    ois.close();
                    anio = principal.anio;
                    selectorMes.setSelectedIndex(principal.mesActual);
                    selectorMes.setEnabled(true);
                    btnCalcular.setEnabled(true);
                    File f1 = new File(fichero);
                    this.setTitle(version + " - " + f1.getName());
                    recuperarDatos();
                    mostrarTitulo();
                    mostrarResultado();
                    calcular();
                    principal.guardado = true;
                }
            } catch (HeadlessException | IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                        "Error al abrir el archivo",
                        "Aviso",
                        JOptionPane.ERROR_MESSAGE);
                fichero = null;
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Ya hay un archivo abierto",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        //codigo cerrar archivo
        if (principal != null) {
            if (!principal.guardado) {
                int g = JOptionPane.showConfirmDialog(null, "¿Quieres guardar antes de cerrar?");
                if (g == 0) {
                    guardar();
                    principal = null;
                    fichero = null;
                    reiniciar();
                } else if (g == 1) {
                    principal = null;
                    fichero = null;
                    reiniciar();
                }
            } else {
                principal = null;
                fichero = null;
                reiniciar();
            }
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        //codigo guardar
        if (principal != null) {
            if (fichero == null) {
                guardarComo();
            } else {
                guardar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComoActionPerformed

        //codigo guardar como
        if (principal != null) {
            guardarComo();
        }
    }//GEN-LAST:event_btnGuardarComoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // Codigo de imprimir
        int a = panelGeneral.getSelectedIndex();
        Imprimir imp;
        try {
            if (a == 0) {
                imp = new Imprimir(this);
            } else if (a == 1) {
                tabla.print();
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Error al imprimir, " + ex.getMessage(),
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {
            imp = null;
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // Codigo de ayuda
        UtilNavegador.abrirURL("http://www.chapuzas.comocreartuweb.es/ayuda/index.html");
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        AcercaDe acercaDe = new AcercaDe(version);
    }//GEN-LAST:event_btnAcercaActionPerformed

    private void selectorMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorMesItemStateChanged

        if (selectorMes.getSelectedIndex() == 11) {
            chkBuena.setVisible(true);
            chkVieja.setVisible(true);
        } else {
            chkBuena.setVisible(false);
            chkVieja.setVisible(false);
        }
        principal.mesActual = selectorMes.getSelectedIndex();
        mostrarTitulo();
        recuperarDatos();
        mostrarResultado();
        calcular();
    }//GEN-LAST:event_selectorMesItemStateChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        // Calcular todos los totales
        calcular();
    }//GEN-LAST:event_btnCalcularActionPerformed
    public void recuperarDatos() {
        horasConvenio = principal.datos.getHorasConvenio();
        salarioBase = principal.datos.getSalarioBase();
        antiguedad = principal.datos.getAntiguedad();
        pPeligrosidad = principal.datos.getPeligro();
        pTransporte = principal.datos.getTransporte();
        pVestuario = principal.datos.getVestuario();
        vExtra = principal.datos.getHoraExtra();
        vFestiva = principal.datos.getHoraFestiva();
        vNocturna = principal.datos.getHoraNocturna();
        vRadio = principal.datos.getRadio();
        vRadioB = principal.datos.getRadioBasica();
        vArma = principal.datos.getHoraArma();
        vNochebuena = principal.datos.getNochebuena();
        vQuinquenio = principal.datos.getQuinquenio();
        vTrienio = principal.datos.getTrienio();
        vKilometro = principal.datos.getKilometraje();
        horas = principal.mes[principal.mesActual].getHorasMes();
        horasFestivas = principal.mes[principal.mesActual].getHorasFestivas();
        horasNocturnas = principal.mes[principal.mesActual].getHorasNocturnas();
        horasRadio = principal.mes[principal.mesActual].getHorasRadio();
        horasRadioB = principal.mes[principal.mesActual].getHorasRadioB();
        horasArma = principal.mes[principal.mesActual].getHorasArma();
        horasVacaciones = principal.mes[principal.mesActual].getHorasVacaciones();
        IRPF = principal.mes[principal.mesActual].getIrpf();
        tIrpf = principal.mes[principal.mesActual].gettIrpf();
        dCcomunes = principal.mes[principal.mesActual].getcComunes();
        tDevengado = principal.mes[principal.mesActual].getTotalDevengado();
        tDeducir = principal.mes[principal.mesActual].getTotalDeducir();
        tExtra = principal.mes[principal.mesActual].getExtras();
        fp = principal.mes[principal.mesActual].getFp();
        desempleo = principal.mes[principal.mesActual].getDesempleo();
        tAportaciones = principal.mes[principal.mesActual].gettAportaciones();
        festivos = principal.mes[principal.mesActual].getTotalFestivos();
        nocturnos = principal.mes[principal.mesActual].getTotalNocturnidad();
        liquido = principal.mes[principal.mesActual].getLiquido();
        chkPagas.setSelected(principal.mes[principal.mesActual].isPorrateo());
        chkBuena.setSelected(principal.mes[principal.mesActual].isNochebuena());
        chkVieja.setSelected(principal.mes[principal.mesActual].isNochevieja());
        chkJefeEquipo.setSelected(principal.mes[principal.mesActual].isJefeEquipo());
        if (principal.mes[principal.mesActual].isTrienios()) {
            radioTrienio.setSelected(true);
        } else {
            radioQuinquenios.setSelected(true);
        }
    }

    private void insertarDatos() {
        principal.mes[principal.mesActual].setIrpf(IRPF);
        principal.mes[principal.mesActual].setcComunes(dCcomunes);
        principal.mes[principal.mesActual].setTotalDevengado(tDevengado);
        principal.mes[principal.mesActual].setTotalDeducir(tDeducir);
        principal.mes[principal.mesActual].setFp(fp);
        principal.mes[principal.mesActual].setDesempleo(desempleo);
        principal.mes[principal.mesActual].settAportaciones(tAportaciones);
        principal.mes[principal.mesActual].setTotalFestivos(festivos);
        principal.mes[principal.mesActual].setTotalNocturnidad(nocturnos);
        principal.mes[principal.mesActual].setLiquido(liquido);
        principal.mes[principal.mesActual].settIrpf(tIrpf);
        principal.mes[principal.mesActual].setExtras(tExtra);

        if (chkPagas.isSelected()) {
            principal.mes[principal.mesActual].setPorrateo(true);
        } else {
            principal.mes[principal.mesActual].setPorrateo(false);
        }
        if (chkBuena.isSelected()) {
            principal.mes[principal.mesActual].setNochebuena(true);
        } else {
            principal.mes[principal.mesActual].setNochebuena(false);
        }
        if (chkVieja.isSelected()) {
            principal.mes[principal.mesActual].setNochevieja(true);
        } else {
            principal.mes[principal.mesActual].setNochevieja(false);
        }
        if (chkJefeEquipo.isSelected()) {
            principal.mes[principal.mesActual].setJefeEquipo(true);
        } else {
            principal.mes[principal.mesActual].setJefeEquipo(false);
        }
        if (radioTrienio.isSelected()) {
            principal.mes[principal.mesActual].setTrienios(true);
        } else {
            principal.mes[principal.mesActual].setTrienios(false);
        }

    }
    private void btnCambioDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioDatosActionPerformed
        // Cambiar los datos iniciales del año
        if (principal != null) {
            meteDato = new MeterDatos(this);
        }
    }//GEN-LAST:event_btnCambioDatosActionPerformed
    public void guardarComo() {
        JFileChooser selector = new JFileChooser();
        try {
            if (selector.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                fichero = selector.getSelectedFile().toString();
                File fl = new File(fichero + ".chp");

                if (fl.exists()) {
                    int g = JOptionPane.showConfirmDialog(null, "El archivo " + fl.getName() + " ya existe, ¿sobreescribir?");
                    if (g == 0) {
                        proceder();
                    }
                } else {
                    proceder();
                }
            }
        } catch (HeadlessException | IOException e) {
            fichero = null;
            JOptionPane.showMessageDialog(null,
                    "Error al guardar el archivo",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void guardar() {

        try {
            if (!fichero.contains(".chp")) {
                fichero = fichero + ".chp";
            }
            FileOutputStream fs = new FileOutputStream(fichero);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(principal);
            os.close();
            principal.guardado = true;
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al guardar el archivo",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void proceder() throws FileNotFoundException, IOException {
        //Creamos el archivo
        FileOutputStream fs = new FileOutputStream(fichero + ".chp");
        //Esta clase tiene el método writeObject() que necesitamos
        ObjectOutputStream os = new ObjectOutputStream(fs);
        //El método writeObject() serializa el objeto y lo escribe en el archivo
        os.writeObject(principal);
        //Hay que cerrar siempre el archivo
        os.close();
        File f1 = new File(fichero);
        this.setTitle(version + " - " + f1.getName() + ".chp");
        principal.guardado = true;
    }

    public void calcular() {
        Calculo cal = new Calculo(this);
        try {
            tIrpf = Double.parseDouble(txtIrpf.getText());

            if (chkJefeEquipo.isSelected()) {
                JefeEquipo = salarioBase / 10;
            } else {
                JefeEquipo = 0;
            }

            if (chkBuena.isSelected() && chkVieja.isSelected()) {
                tNochebuena = vNochebuena * 2;
            } else if (!chkBuena.isSelected() && !chkVieja.isSelected()) {
                tNochebuena = 0;
            } else {
                tNochebuena = vNochebuena;
            }

            if (radioQuinquenios.isSelected()) {
                tAntiguedad = (Math.floor(antiguedad / 5)) * vQuinquenio;
            } else {
                tAntiguedad = (Math.floor(antiguedad / 3)) * vTrienio;
            }
            // comprobar que esta marcado el prorrateo de pagas extras
            if (chkPagas.isSelected()) {
                
                pPagasExtras = ((salarioBase + tAntiguedad + pPeligrosidad) * 3) / 12;
            } else {
                pPagasExtras = 0;
            }
            cal.calcular();
            principal.guardado = false;
            insertarDatos();
            recuperarDatos();
            mostrarResultado();
        } catch (NumberFormatException e) {
            txtIrpf.setText("¿Irpf?");
            txtIrpf.requestFocus();
            txtIrpf.selectAll();
        }
    }

    public void mostrarTitulo() {
        int texto = anio;
        textomes = selectorMes.getSelectedItem().toString();
        lblInfo.setText(textomes + " de " + texto);
    }

    public void mostrarResultado() {
        lblSalarioBase.setText("" + salarioBase);
        lblPeligrosidad.setText("" + pPeligrosidad);
        lblTransporte.setText("" + pTransporte);
        lblVestuario.setText("" + pVestuario);
        lblComunes.setText("" + dCcomunes);
        lblDesempleo.setText("" + desempleo);
        lblFP.setText("" + fp);
        lblTolalAportaciones.setText("" + tAportaciones);
        lblIrpf.setText("" + IRPF);
        lblTotalDevengado.setText("" + tDevengado);
        lblTotalDeducir.setText("" + tDeducir);
        lblLiquido.setText("" + liquido + " €");
        lblPagas.setText("" + pPagasExtras);
        lblFestivos.setText("" + festivos);
        lblNocturnidad.setText("" + nocturnos);
        lblAntiguedad.setText("" + tAntiguedad);
        lblHorasExtras.setText("" + tExtra);
        lblArma.setText("" + tArma);
        lblRadio.setText("" + ((Math.floor(tHorasRadio + tHorasRadioB) * 100) / 100));
        txtIrpf.setText("" + tIrpf);
        double horasAnio = 0;
        for (int i = 0; i < 12; i++) {
            horasAnio += principal.mes[i].getHorasMes();
        }
        lblRestantes.setText("" + (Math.floor((horasConvenio - horasAnio) * 10)) / 10 );
       
        double tendencia = 0;
        //double diferencia;
        for (int i = 0; i < (selectorMes.getSelectedIndex() + 1); i++) {
            tendencia += (principal.mes[i].getHorasMes() - 162);
        }
        
        tendencia = (Math.floor(tendencia * 10)) / 10;
        if (tendencia < 0) {
            lblTendencia.setForeground(Color.red);
            lblTendencia.setText("" + tendencia);
        } else {
            lblTendencia.setForeground(Color.BLACK);
            lblTendencia.setText("" + tendencia);
        }

        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 11; j++) {
                tabla.setValueAt(null, i, j);
            }
        }
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.lightGray);
        for (int i = 0; i < principal.mes[principal.mesActual].getN(); i++) {
            tabla.setValueAt(i + 1, i, 1);

            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getServicio1(), i, 2);
            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getEntrada1(), i, 3);
            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getSalida1(), i, 4);
            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getServicio2(), i, 5);
            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getEntrada2(), i, 6);
            tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getSalida2(), i, 7);

            if (principal.mes[principal.mesActual].dia[i].isFestivo()) {
                tabla.setValueAt(" ", i, 0);
            } else {
                tabla.setValueAt("", i, 0);
            }

            if (principal.mes[principal.mesActual].dia[i].getTempHoras() == 0) {
                tabla.setValueAt(null, i, 8);
            } else {
                tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getTempHoras(), i, 8);
            }
            if (principal.mes[principal.mesActual].dia[i].getTempNocturnas() == 0) {
                tabla.setValueAt(null, i, 9);
            } else {
                tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getTempNocturnas(), i, 9);
            }
            if (principal.mes[principal.mesActual].dia[i].getTempFestivas() == 0) {
                tabla.setValueAt(null, i, 10);
            } else {
                tabla.setValueAt(principal.mes[principal.mesActual].dia[i].getTempFestivas(), i, 10);
            }
        }
        tabla.setValueAt("Totales ", principal.mes[principal.mesActual].getN(), 7);
        double sumaHoras = (principal.mes[principal.mesActual].getHorasMes())
                + (principal.mes[principal.mesActual].getHorasVacaciones());
        tabla.setValueAt(sumaHoras, principal.mes[principal.mesActual].getN(), 8);
        tabla.setValueAt(principal.mes[principal.mesActual].getHorasNocturnas(), principal.mes[principal.mesActual].getN(), 9);
        tabla.setValueAt(principal.mes[principal.mesActual].getHorasFestivas(), principal.mes[principal.mesActual].getN(), 10);
    }

    private void reiniciar() {
        lblSalarioBase.setText("0.0");
        lblPeligrosidad.setText("0.0");
        lblTransporte.setText("0.0");
        lblVestuario.setText("0.0");
        lblAntiguedad.setText("0.0");
        lblComunes.setText("0.0");
        lblDesempleo.setText("0.0");
        lblFP.setText("0.0");
        lblFestivos.setText("0.0");
        lblHorasExtras.setText("0.0");
        lblInfo.setText("Ningun documento abierto");
        lblIrpf.setText("0.0");
        lblLiquido.setText("0.0");
        lblNocturnidad.setText("0.0");
        lblPagas.setText("0.0");
        lblTolalAportaciones.setText("0.0");
        lblTotalDeducir.setText("0.0");
        lblTotalDevengado.setText("0.0");
        lblArma.setText("0.0");
        lblRadio.setText("0.0");
        lblRestantes.setText("0");
        lblTendencia.setText("0");
        lblTendencia.setForeground(Color.BLACK);
        txtIrpf.setText("");
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < 11; j++) {
                tabla.setValueAt(null, i, j);
            }
        }
        selectorMes.setEnabled(false);
        btnCalcular.setEnabled(false);
        this.setTitle(version);
    }

    public void cerrar() {
        this.setVisible(false);
        this.dispose();
        System.exit(0);
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Principal inicio = new Principal();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barra;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCambioDatos;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarComo;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMeterHoras;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chkBuena;
    private javax.swing.JCheckBox chkJefeEquipo;
    private javax.swing.JCheckBox chkPagas;
    private javax.swing.JCheckBox chkVieja;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblAntiguedad;
    private javax.swing.JLabel lblArma;
    private javax.swing.JLabel lblComunes;
    private javax.swing.JLabel lblDesempleo;
    private javax.swing.JLabel lblFP;
    private javax.swing.JLabel lblFestivos;
    private javax.swing.JLabel lblHorasExtras;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblIrpf;
    private javax.swing.JLabel lblLiquido;
    private javax.swing.JLabel lblNocturnidad;
    private javax.swing.JLabel lblPagas;
    private javax.swing.JLabel lblPeligrosidad;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblRestantes;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTendencia;
    private javax.swing.JLabel lblTolalAportaciones;
    private javax.swing.JLabel lblTotalDeducir;
    private javax.swing.JLabel lblTotalDevengado;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JLabel lblVestuario;
    private javax.swing.JTabbedPane panelGeneral;
    private javax.swing.JPanel panelHoras;
    private javax.swing.JRadioButton radioQuinquenios;
    private javax.swing.JRadioButton radioTrienio;
    private javax.swing.JComboBox selectorMes;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtIrpf;
    // End of variables declaration//GEN-END:variables
}

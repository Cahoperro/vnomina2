package vnomina;

import java.awt.print.PrinterException;

/**
 *
 * @author cahoperro
 */
public class Imprimir extends javax.swing.JFrame {

    Principal Obj;

    public Imprimir(Principal Obj) throws PrinterException {
        this.Obj = Obj;
        initComponents();
        table.setValueAt("Salario base", 1, 0);
        table.setValueAt(Obj.salarioBase, 1, 1);
        table.setValueAt("Horas extra", 2, 0);
        table.setValueAt(Obj.horasExtra, 2, 1);
        table.setValueAt("Antiguedad", 3, 0);
        table.setValueAt(Obj.tAntiguedad, 3, 1);
        table.setValueAt("Plus festivos", 4, 0);
        table.setValueAt(Obj.festivos, 4, 1);
        table.setValueAt("Plus peligrosidad", 5, 0);
        table.setValueAt(Obj.pPeligrosidad, 5, 1);
        table.setValueAt("Plus nocturnidad", 6, 0);
        table.setValueAt(Obj.nocturnos, 6, 1);
        table.setValueAt("P.pagas extra", 7, 0);
        table.setValueAt(Obj.pPagasExtras, 7, 1);
        table.setValueAt("PLus arma", 8, 0);
        table.setValueAt(Obj.tArma, 8, 1);
        table.setValueAt("T. Radioscopia", 9, 0);
        table.setValueAt(((Math.floor(Obj.tHorasRadio + Obj.tHorasRadioB) * 100) / 100), 9, 1);
        table.setValueAt("Plus transporte", 1, 2);
        table.setValueAt(Obj.pTransporte, 1, 3);
        table.setValueAt("Plus vestuario", 2, 2);
        table.setValueAt(Obj.pVestuario, 2, 3);
        table.setValueAt("Total devengado", 3, 2);
        table.setValueAt(Obj.tDevengado, 3, 3);
        table.setValueAt("C.comunes", 1, 4);
        table.setValueAt(Obj.dCcomunes, 1, 5);
        table.setValueAt("Desempleo", 2, 4);
        table.setValueAt(Obj.desempleo, 2, 5);
        table.setValueAt("F.profesional", 3, 4);
        table.setValueAt(Obj.fp, 3, 5);
        table.setValueAt("Total aportaciones", 4, 4);
        table.setValueAt(Obj.tAportaciones, 4, 5);
        table.setValueAt("IRPF", 5, 4);
        table.setValueAt(Obj.IRPF, 5, 5);
        table.setValueAt("Total deducir", 6, 4);
        table.setValueAt(Obj.tDeducir, 6, 5);
        table.setValueAt("Liquido a percibir", 9, 4);
        table.setValueAt(Obj.liquido, 9, 5);
        table.print();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 282));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Percepciones salariales", "", "Percepciones no salariales", "", "Deducciones", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(1).setMaxWidth(70);
        table.getColumnModel().getColumn(3).setMaxWidth(70);
        table.getColumnModel().getColumn(5).setMaxWidth(70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}

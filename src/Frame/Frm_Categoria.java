/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frame;

import DataAccessObject.CategoriaDAO;
import TransferObject.CategoriaDTO;
import BusinessObject.Categoria;
import JTable.EventAction;
import JTable.ModelAction;
import JTable.Table;
import JTable.TableCellAction;
import Message.Message;
import Notification.Notification;
import java.awt.Dimension;

import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author cesarcunyarache
 */
public class Frm_Categoria extends javax.swing.JPanel {

    CategoriaDTO categoria;
    EventAction eventAction;
    int clic_tabla = 0;
    int id = 0;
    Categoria ctr;
    DefaultTableModel df;
    CategoriaDAO categ = new CategoriaDAO();
    JFrame frame;
    Notification mensaje;
    Notification mensajeError;

    public Frm_Categoria(JFrame frame) {
        initComponents();
        this.setMaximumSize(new Dimension(1230, 840));
        table1.fixTable(jScrollPane3);
        this.frame = frame;
        ctr = new Categoria(frame);
        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 2) {
                    return true;
                }
                if (column == 3) {
                    return false;
                }

                return false;

            }
        };

        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_categoria = new Components.TextField();
        btn_agregar = new Components.ButtonShadow();
        btn_actualizar = new Components.ButtonShadow();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new JTable.Table();
        btn_reset = new Components.ButtonShadow();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_categoria.setLabelText("Categoria");
        txt_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_categoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 266, -1));

        btn_agregar.setBackground(new java.awt.Color(51, 51, 51));
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.setRound(20);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 110, -1));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 0));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("✓");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 40, 40));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(table1);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 630, 200));

        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/actualizar.png"))); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1019, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        if (!txt_categoria.getText().isEmpty()) {
            ctr.crear(txt_categoria.getText());
            limpiar();
            init();
        } else {
            mensajeError = new Notification("Algo salio mal",
                    frame, Notification.Type.WARNING, Notification.Location.TOP_RIGHT);
        }

    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        if (!txt_categoria.getText().isEmpty()) {
            ctr.actualizar(id, txt_categoria.getText());
            limpiar();
            init();
        } else {
            mensajeError = new Notification("Algo salio mal",
                    frame, Notification.Type.WARNING, Notification.Location.TOP_RIGHT);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       limpiar();
        init();
       
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_categoriaActionPerformed

    public void init() {
        eventAction = new EventAction<CategoriaDTO>() {
            @Override
            public void delete(CategoriaDTO ca) {
                if (showMessage("Eliminar Categoria : " + ca.getCategoria())) {

                    clic_tabla = table1.getSelectedRow();
                    int id = (int) (table1.getValueAt(clic_tabla, 0));
                    ctr.eliminar(id);
                    llenarTabla(eventAction);

                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(CategoriaDTO ca) {
                if (showMessage("Actualizar Categoria : " + ca.getCategoria())) {

                    clic_tabla = table1.getSelectedRow();
                    String catego = String.valueOf(table1.getValueAt(clic_tabla, 1));
                    id = Integer.parseInt(String.valueOf(table1.getValueAt(clic_tabla, 0)));
                    txt_categoria.setText(catego);

                    System.out.println("User click OK");

                } else {
                    System.out.println("User click Cancel");
                }
            }
        };

        llenarTabla(eventAction);
    }

    public void llenarTabla(EventAction eventAction) {

        df.setColumnCount(0);
        df.setRowCount(0);

        String[] cabezera = {"ID", "Categoria", "Accion"};
        df.setColumnIdentifiers(cabezera);
        ModelAction model;
        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<CategoriaDTO> lista = new ArrayList<>();
        lista = categ.Read();

        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                CategoriaDTO c = lista.get(i);

                datos[0] = c.getId();
                datos[1] = c.getCategoria();
                datos[2] = model = new ModelAction<CategoriaDTO>(c, eventAction);

                df.addRow(datos);
            }

            table1.setModel(df);

        }
    }

    private boolean showMessage(String message) {
        Message obj = new Message(frame, true);
        obj.showMessage(message);
        return obj.isOk();
    }
    
    public void limpiar(){
        txt_categoria.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonShadow btn_actualizar;
    private Components.ButtonShadow btn_agregar;
    private Components.ButtonShadow btn_reset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private JTable.Table table1;
    private Components.TextField txt_categoria;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frame;

import BusinessObject.Empleados;
import BusinessObject.Usuario;
import JTable.EventAction;
import JTable.ModelAction;
import Message.Message;
import Notification.Notification;
import TransferObject.EmpleadoDTO;
import TransferObject.Encriptacion;
import TransferObject.UsuariosDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesarcunyarache
 */
public class Frm_Usuarios extends javax.swing.JPanel {

    JFrame frame;
    Usuario ctr;
    DefaultTableModel df;
    EventAction eventAction;
    Notification mensaje;
    Notification mensajeError;
    Encriptacion encriptar;
    int id;
    public Frm_Usuarios(JFrame frame) {
        initComponents();
        this.frame = frame;
        encriptar = new Encriptacion();
        ctr = new Usuario(frame);
        table1.fixTable(jScrollPane1);
        df = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 5) {
                    return true;
                }
                if (column == 6) {
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
        txt_usuario = new Components.TextFieldSuggestion();
        jLabel5 = new javax.swing.JLabel();
        txt_contraseña = new Components.TextFieldSuggestion();
        jLabel6 = new javax.swing.JLabel();
        txt_idEmpleado = new Components.TextFieldSuggestion();
        jLabel7 = new javax.swing.JLabel();
        txt_tipo = new Components.TextFieldSuggestion();
        jLabel8 = new javax.swing.JLabel();
        btn_actualizar = new Components.ButtonShadow();
        btn_agregar = new Components.ButtonShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new JTable.Table();
        btn_reset = new Components.ButtonShadow();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 260, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 60, 30));
        jPanel1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 260, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 30));
        jPanel1.add(txt_idEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 260, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID empleado");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 90, 30));
        jPanel1.add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 260, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo de usuario");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 110, 30));

        btn_actualizar.setBackground(new java.awt.Color(0, 153, 0));
        btn_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizar.setText("✓");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 40, 40));

        btn_agregar.setBackground(new java.awt.Color(51, 51, 51));
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 110, -1));

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
        jScrollPane1.setViewportView(table1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 770, 200));

        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/actualizar.png"))); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        try {

            if(!txt_usuario.getText().isEmpty() && !txt_contraseña.getText().isEmpty()
                    && !txt_tipo.getText().isEmpty() && !txt_idEmpleado.getText().isEmpty()){
                
                ctr.Modificar(id, txt_usuario.getText(), encriptar.ecnode(txt_contraseña.getText()), txt_tipo.getText(), Integer.parseInt(txt_idEmpleado.getText()));
                limpiar();
                init();
               
            } else {
                mensajeError = new Notification("Uno o más campos vacios",
                    frame, Notification.Type.WARNING, Notification.Location.TOP_RIGHT);
            }

            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        try {
            if(!txt_usuario.getText().isEmpty() && !txt_contraseña.getText().isEmpty()
                    && !txt_tipo.getText().isEmpty() && !txt_idEmpleado.getText().isEmpty()){
                
                ctr.insertar(txt_usuario.getText(), encriptar.ecnode(txt_contraseña.getText()), txt_tipo.getText(), Integer.parseInt(txt_idEmpleado.getText()));
                limpiar();
                init();
            } else {
                mensajeError = new Notification("Uno o más campos vacios",
                    frame, Notification.Type.WARNING, Notification.Location.TOP_RIGHT);
            }
           

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        init();
    }//GEN-LAST:event_jPanel1KeyTyped

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        limpiar();
        init();

    }//GEN-LAST:event_btn_resetActionPerformed

    public void init() {

        eventAction = new EventAction<UsuariosDTO>() {
            @Override
            public void delete(UsuariosDTO aux) {
                if (showMessage("Eliminar Usuario : " + aux.getUsuario())) {

                    id = (int) (table1.getValueAt(table1.getSelectedRow(), 0));
                    ctr.Eliminar(id);
                    llenarTabla(eventAction);

                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(UsuariosDTO aux) {
                if (showMessage("Actualizar Usuario : " + aux.getUsuario())) {
                    try {

                        
                        String user = (String) (table1.getValueAt(table1.getSelectedRow(), 1));
                        id = (int) (table1.getValueAt(table1.getSelectedRow(), 0));
                        UsuariosDTO var = ctr.Buscar(user);

                        if (var != null) {
                            txt_usuario.setText(var.getUsuario());
                            txt_contraseña.setText(encriptar.deecnode(var.getContraseña()));
                            txt_tipo.setText(var.getTipo());
                            txt_idEmpleado.setText(String.valueOf(var.getIdEmpleado()));
                            
                            System.out.println("User click OK");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }

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

        String[] cabezera = {"ID ", "Usuario", "Contraseña", "Tipo", "ID Empleado", "Accion"};
        df.setColumnIdentifiers(cabezera);
        ModelAction model;
        Object[] datos = new Object[df.getColumnCount()];

        ArrayList<UsuariosDTO> lista = new ArrayList<>();
        lista = ctr.lista();

        if (lista != null) {

            for (int i = 0; i < lista.size(); i++) {
                UsuariosDTO u = lista.get(i);

                datos[0] = u.getIdUsuario();
                datos[1] = u.getUsuario();
                datos[2] = u.getContraseña();
                datos[3] = u.getTipo();
                datos[4] = u.getIdEmpleado(); 
                datos[5] = model = new ModelAction<UsuariosDTO>(u, eventAction);

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
    
    public void limpiar (){
        txt_usuario.setText("");
        txt_contraseña.setText("");
        txt_tipo.setText("");
        txt_idEmpleado.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ButtonShadow btn_actualizar;
    private Components.ButtonShadow btn_agregar;
    private Components.ButtonShadow btn_reset;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private JTable.Table table1;
    private Components.TextFieldSuggestion txt_contraseña;
    private Components.TextFieldSuggestion txt_idEmpleado;
    private Components.TextFieldSuggestion txt_tipo;
    private Components.TextFieldSuggestion txt_usuario;
    // End of variables declaration//GEN-END:variables
}

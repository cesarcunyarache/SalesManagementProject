/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;
import AppPackage.AnimationClass;
import BusinessObject.Empleados;
import BusinessObject.Usuario;
import DataAccessObject.ProductosDAO;
import TransferObject.EmpleadoDTO;
import TransferObject.ProductoDTO;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import TransferObject.Slide;
import TransferObject.UsuariosDTO;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;
import table.TableCustom;

/**
 *
 * @author cesarcunyarache
 */
public class Frm_Panel extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    AnimationClass ac = new AnimationClass();
    Animator animator;
    Slide slide = new Slide();
    Empleados ctr = new Empleados(this);
    ProductoDTO producto;
    ProductosDAO consulta = new ProductosDAO();
    Frm_Clientes clientes;
    Frm_Categoria categoria;
    Frm_Productos pro;
    Frm_Ventas ventas;
    Frm_Empleados empleados;
    Frm_Usuarios usuarios;
    Frm_Informacion informacion;
    Frm_Correos correo;
    Frm_Grafico grafico;
    UsuariosDTO usuario;
    EmpleadoDTO empleado;
    boolean admin = false;

    public Frm_Panel(UsuariosDTO usuario) {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        clientes = new Frm_Clientes(this);
        categoria = new Frm_Categoria(this);
        pro = new Frm_Productos(this);
        ventas = new Frm_Ventas(this);
        empleados = new Frm_Empleados(this);
        usuarios = new Frm_Usuarios(this);
        EmpleadoDTO emp = ctr.Buscar(usuario.getIdEmpleado());
        informacion = new Frm_Informacion(emp, this);
        if (usuario.getTipo().equals("Administrador")) {
            admin = true;
        } else if (usuario.getTipo().equals("Personal")) {
            admin = false;
            System.out.println("Personal");
        }
        correo  = new Frm_Correos(this);
        grafico = new Frm_Grafico(this);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(ventas);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        ventas.reset();
        setColor(btn_ventas);

    }

//    @Override
//    public Image getIconImage(){
//        Image value = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/icons8-grocery-shelf-100.png"));
//        return value;
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenú = new com.k33ptoo.components.KGradientPanel();
        Menu = new com.k33ptoo.components.KGradientPanel();
        btn_graficos = new Components.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        btn_correo = new Components.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        btn_perfil = new Components.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        btn_usuarios = new Components.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        btn_ventas = new Components.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        btn_clientes = new Components.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        btn_categoria = new Components.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        btn_productos = new Components.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        btn_salir = new Components.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        btn_empleados = new Components.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JDesktopPane();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenú.setkBorderRadius(0);
        jPanelMenú.setkEndColor(new java.awt.Color(255, 255, 255));
        jPanelMenú.setkStartColor(new java.awt.Color(255, 255, 255));
        jPanelMenú.setOpaque(false);
        jPanelMenú.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setkBorderRadius(0);
        Menu.setkEndColor(new java.awt.Color(51, 51, 51));
        Menu.setkStartColor(new java.awt.Color(51, 51, 51));
        Menu.setOpaque(false);
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_graficos.setBackground(new java.awt.Color(51, 51, 51));
        btn_graficos.setRoundBottomLeft(20);
        btn_graficos.setRoundBottomRight(20);
        btn_graficos.setRoundTopLeft(20);
        btn_graficos.setRoundTopRight(20);
        btn_graficos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_graficosMousePressed(evt);
            }
        });
        btn_graficos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/chart-histogram.png"))); // NOI18N
        jLabel14.setText("Gráficos");
        jLabel14.setIconTextGap(20);
        btn_graficos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_graficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 150, 40));

        btn_correo.setBackground(new java.awt.Color(51, 51, 51));
        btn_correo.setRoundBottomLeft(20);
        btn_correo.setRoundBottomRight(20);
        btn_correo.setRoundTopLeft(20);
        btn_correo.setRoundTopRight(20);
        btn_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_correoMousePressed(evt);
            }
        });
        btn_correo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/envelope (1).png"))); // NOI18N
        jLabel13.setText("Correos");
        jLabel13.setIconTextGap(20);
        btn_correo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 150, 40));

        btn_perfil.setBackground(new java.awt.Color(51, 51, 51));
        btn_perfil.setRoundBottomLeft(20);
        btn_perfil.setRoundBottomRight(20);
        btn_perfil.setRoundTopLeft(20);
        btn_perfil.setRoundTopRight(20);
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_perfilMousePressed(evt);
            }
        });
        btn_perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user (1).png"))); // NOI18N
        jLabel2.setText("Perfil");
        jLabel2.setIconTextGap(20);
        btn_perfil.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        Menu.add(btn_perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 45));

        btn_usuarios.setBackground(new java.awt.Color(51, 51, 51));
        btn_usuarios.setRoundBottomLeft(20);
        btn_usuarios.setRoundBottomRight(20);
        btn_usuarios.setRoundTopLeft(20);
        btn_usuarios.setRoundTopRight(20);
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usuariosMousePressed(evt);
            }
        });
        btn_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/users.png"))); // NOI18N
        jLabel12.setText("Usuarios");
        jLabel12.setIconTextGap(20);
        btn_usuarios.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 150, 40));

        btn_ventas.setBackground(new java.awt.Color(51, 51, 51));
        btn_ventas.setRoundBottomLeft(20);
        btn_ventas.setRoundBottomRight(20);
        btn_ventas.setRoundTopLeft(20);
        btn_ventas.setRoundTopRight(20);
        btn_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ventasMousePressed(evt);
            }
        });
        btn_ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ventas.png"))); // NOI18N
        jLabel6.setText("Ventas");
        jLabel6.setIconTextGap(20);
        btn_ventas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, 40));

        btn_clientes.setBackground(new java.awt.Color(51, 51, 51));
        btn_clientes.setRoundBottomLeft(20);
        btn_clientes.setRoundBottomRight(20);
        btn_clientes.setRoundTopLeft(20);
        btn_clientes.setRoundTopRight(20);
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clientesMousePressed(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/address-book.png"))); // NOI18N
        jLabel5.setText("Clientes");
        jLabel5.setIconTextGap(20);
        btn_clientes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 40));

        btn_categoria.setBackground(new java.awt.Color(51, 51, 51));
        btn_categoria.setRoundBottomLeft(20);
        btn_categoria.setRoundBottomRight(20);
        btn_categoria.setRoundTopLeft(20);
        btn_categoria.setRoundTopRight(20);
        btn_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_categoriaMousePressed(evt);
            }
        });
        btn_categoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jLabel4.setText("Categoria");
        jLabel4.setIconTextGap(20);
        btn_categoria.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        btn_productos.setBackground(new java.awt.Color(51, 51, 51));
        btn_productos.setRoundBottomLeft(20);
        btn_productos.setRoundBottomRight(20);
        btn_productos.setRoundTopLeft(20);
        btn_productos.setRoundTopRight(20);
        btn_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_productosMousePressed(evt);
            }
        });
        btn_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/boxes.png"))); // NOI18N
        jLabel1.setText("Productos");
        jLabel1.setIconTextGap(20);
        btn_productos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 45));

        btn_salir.setBackground(new java.awt.Color(51, 51, 51));
        btn_salir.setRoundBottomLeft(20);
        btn_salir.setRoundBottomRight(20);
        btn_salir.setRoundTopLeft(20);
        btn_salir.setRoundTopRight(20);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_salirMousePressed(evt);
            }
        });
        btn_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exit (1)_1.png"))); // NOI18N
        jLabel7.setText("Salir");
        jLabel7.setIconTextGap(20);
        btn_salir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        Menu.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, 150, 40));

        btn_empleados.setBackground(new java.awt.Color(51, 51, 51));
        btn_empleados.setRoundBottomLeft(20);
        btn_empleados.setRoundBottomRight(20);
        btn_empleados.setRoundTopLeft(20);
        btn_empleados.setRoundTopRight(20);
        btn_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_empleadosMousePressed(evt);
            }
        });
        btn_empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/users-alt (1).png"))); // NOI18N
        jLabel8.setText("Empleados");
        jLabel8.setIconTextGap(20);
        btn_empleados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Menu.add(btn_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu-hamburguesa (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        Menu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 40));

        jPanelMenú.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 910));

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setOpaque(false);
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(203, 400));
        PanelPrincipal.setLayout(new java.awt.BorderLayout());
        jPanelMenú.add(PanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 1230, 880));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menu-hamburguesa (2).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanelMenú.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        getContentPane().add(jPanelMenú, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        for(double i =0.0; i<=1.0; i+=0.1){
//            String val = i + "F";
//            float f = Float.valueOf(val);
//            this.setOpacity(f);
//            try{
//                Thread.sleep(20);
//            }catch (Exception e){
//                
//            }
//        }


    }//GEN-LAST:event_formWindowOpened

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked

        if (animator != null && animator.isRunning()) {
            animator.stop();
        }
        Point clickPoint = evt.getPoint();
        Dimension d = new Dimension(-200, 620);

        animator = PropertySetter.createAnimator(500, Menu, "location", Menu.getLocation(), new Point(-200, 0));
        //  To refresh or repaint graphics
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });
        animator.setResolution(8);
        animator.start();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void btn_productosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_productosMousePressed
        PanelPrincipal.removeAll();
        PanelPrincipal.add(pro);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_productos);
        resetColor(new JPanel[]{btn_perfil, btn_categoria, btn_clientes, btn_ventas, btn_empleados, btn_usuarios, btn_salir, btn_correo, btn_graficos});

    }//GEN-LAST:event_btn_productosMousePressed

    private void btn_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMousePressed
        PanelPrincipal.removeAll();
        PanelPrincipal.add(clientes);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_clientes);
        resetColor(new JPanel[]{btn_perfil, btn_productos, btn_categoria, btn_ventas, btn_empleados, btn_usuarios, btn_salir, btn_correo, btn_graficos});
    }//GEN-LAST:event_btn_clientesMousePressed

    private void btn_ventasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ventasMousePressed
        PanelPrincipal.removeAll();
        PanelPrincipal.add(ventas);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        ventas.reset();
        setColor(btn_ventas);
        resetColor(new JPanel[]{btn_perfil, btn_productos, btn_categoria, btn_clientes, btn_empleados, btn_usuarios, btn_salir, btn_correo, btn_graficos});

    }//GEN-LAST:event_btn_ventasMousePressed

    private void btn_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMousePressed
        setVisible(false);
    }//GEN-LAST:event_btn_salirMousePressed

    private void btn_categoriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_categoriaMousePressed

        PanelPrincipal.removeAll();
        PanelPrincipal.add(categoria);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_categoria);
        resetColor(new JPanel[]{btn_perfil, btn_productos, btn_ventas, btn_clientes, btn_empleados, btn_usuarios, btn_salir, btn_correo, btn_graficos});

    }//GEN-LAST:event_btn_categoriaMousePressed

    private void btn_empleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMousePressed
        if (admin) {
            PanelPrincipal.removeAll();
            PanelPrincipal.add(empleados);
            PanelPrincipal.revalidate();
            PanelPrincipal.repaint();
            setColor(btn_empleados);
            resetColor(new JPanel[]{btn_perfil, btn_productos, btn_categoria, btn_clientes, btn_ventas, btn_usuarios, btn_salir, btn_correo, btn_graficos});
        }
    }//GEN-LAST:event_btn_empleadosMousePressed

    private void btn_usuariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuariosMousePressed
        if (admin) {
            PanelPrincipal.removeAll();
            PanelPrincipal.add(usuarios);
            PanelPrincipal.revalidate();
            PanelPrincipal.repaint();
            setColor(btn_usuarios);
            resetColor(new JPanel[]{btn_perfil, btn_productos, btn_categoria, btn_clientes, btn_ventas, btn_empleados, btn_salir, btn_correo, btn_graficos});
        }

    }//GEN-LAST:event_btn_usuariosMousePressed

    private void btn_perfilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMousePressed
        PanelPrincipal.removeAll();
        PanelPrincipal.add(informacion);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_perfil);
        resetColor(new JPanel[]{btn_productos, btn_categoria, btn_clientes, btn_ventas, btn_empleados, btn_usuarios, btn_salir, btn_correo,btn_graficos});
    }//GEN-LAST:event_btn_perfilMousePressed

    private void btn_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_correoMousePressed
        if (admin) {
        PanelPrincipal.removeAll();
        PanelPrincipal.add(correo);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_correo);
        correo.iniciar();
        resetColor(new JPanel[]{btn_productos, btn_categoria, btn_clientes, btn_ventas, btn_empleados, btn_usuarios, btn_salir, btn_perfil,btn_graficos});
        
        }
    }//GEN-LAST:event_btn_correoMousePressed

    private void btn_graficosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_graficosMousePressed
        if (admin) {
        PanelPrincipal.removeAll();
        PanelPrincipal.add(grafico);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
        setColor(btn_graficos);
        resetColor(new JPanel[]{btn_productos, btn_categoria, btn_clientes, btn_ventas, btn_empleados, btn_usuarios, btn_salir, btn_perfil, btn_correo});
        
        }
    }//GEN-LAST:event_btn_graficosMousePressed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
     if (animator != null && animator.isRunning()) {
            animator.stop();
        }
        Point clickPoint = evt.getPoint();
        Dimension d = new Dimension(-200, 620);

        animator = PropertySetter.createAnimator(500, Menu, "location", Menu.getLocation(), new Point(0, 0));
        //  To refresh or repaint graphics
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });
        animator.setResolution(8);
        animator.start();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(89, 89, 89));
    }

    private void resetColor(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(51, 51, 51));

        }

    }

    private void setImageLabel(JLabel label, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
    }

    /**
     * @param args the command linearguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frm_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frm_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frm_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frm_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//
//                //new Panel().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KGradientPanel Menu;
    private javax.swing.JDesktopPane PanelPrincipal;
    private Components.PanelRound btn_categoria;
    private Components.PanelRound btn_clientes;
    private Components.PanelRound btn_correo;
    private Components.PanelRound btn_empleados;
    private Components.PanelRound btn_graficos;
    private Components.PanelRound btn_perfil;
    private Components.PanelRound btn_productos;
    private Components.PanelRound btn_salir;
    private Components.PanelRound btn_usuarios;
    private Components.PanelRound btn_ventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel jPanelMenú;
    // End of variables declaration//GEN-END:variables
}

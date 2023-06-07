/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frame;

import BusinessObject.Detalle;
import DataSource.Conexion;
import Graphic.ModelChart;
import TransferObject.DatabaseConnection;
import TransferObject.ModelData;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author cesarcunyarache
 */
public class Frm_Grafico extends javax.swing.JPanel {

   Conexion con ;
   Detalle detalle;
    public Frm_Grafico(JFrame frame) {
        initComponents();
        detalle = new Detalle(frame);
        con = new Conexion();
        chart.setTitle("Gráfico");
        chart.addLegend("Total de Ventas", Color.decode("#0093E9"), Color.decode("#80D0C7"));
        chart.addLegend("Cantidad", Color.decode("#e65c00"), Color.decode("#F9D423"));
        chart.addLegend("Importes", Color.decode("#F4D03F"), Color.decode("#16A085"));
          llenarGrafico();
        
        
    }

//    private void setData() {
//        try {
//            List<ModelData> lists = new ArrayList<>();
////            DatabaseConnection.getInstance().connectToDatabase();
//            String sql = "SELECT date_format(fecha, \"%d\") AS Dia, SUM(v.total) as Total, SUM(d.cantidad) as Cantidad, SUM(d.importe) as Importe FROM Ventas v, DetalleVentas d Group by v.fecha ORDER BY fecha DESC LIMIT 7;";
//            PreparedStatement p = con.getConection().prepareStatement(sql);
//            ResultSet r = p.executeQuery();
//            while (r.next()) {
//                String month = r.getString("Dia");
//                double amount = r.getDouble("Total");
//                int cost = r.getInt("Cantidad");
//                double profit = r.getDouble("Importe");
//                lists.add(new ModelData(month, amount, cost, profit));
//            }
//            r.close();
//            p.close();
//            //  Add Data to chart
//            for (int i = lists.size() - 1; i >= 0; i--) {
//                ModelData d = lists.get(i);
//                chart.addData(new ModelChart(d.getMonth(), new double[]{d.getAmount(), d.getCost(), d.getProfit()}));
//            }
//            //  Start to show data with animation
//            chart.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    
    public void llenarGrafico(){
        try {
         ArrayList<ModelData> lists= detalle.Grafico();
         for (int i = lists.size() - 1; i >= 0; i--) {
                ModelData d = lists.get(i);
                chart.addData(new ModelChart(d.getMonth(), new double[]{d.getAmount(), d.getCost(), d.getProfit()}));
            }
           
            chart.start();
        } catch(Exception e){
            System.out.println(e);
            
        }
    }

    private void test() {
        chart.clear();
        chart.addData(new ModelChart("January", new double[]{500, 50, 100}));
        chart.addData(new ModelChart("February", new double[]{600, 300, 150}));
        chart.addData(new ModelChart("March", new double[]{200, 50, 900}));
        chart.addData(new ModelChart("April", new double[]{480, 700, 100}));
        chart.addData(new ModelChart("May", new double[]{350, 540, 500}));
        chart.addData(new ModelChart("June", new double[]{450, 800, 100}));
        chart.start();
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
        chart = new Graphic.CurveLineChart();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chart.setForeground(new java.awt.Color(0, 0, 0));
        chart.setFillColor(true);
        jPanel1.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 770, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Graphic.CurveLineChart chart;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

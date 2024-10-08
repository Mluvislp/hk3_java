/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.UI;

import com.edusys.DAO.KhoaHocDAO;
import com.edusys.DAO.ThongKeDAO;
import com.edusys.uitls.XImage;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class BieuDoDoanhThu extends javax.swing.JFrame {

    /**
     * Creates new form BieuDoDoanhThu
     */
    public BieuDoDoanhThu() {
        initComponents();
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

        pnlBackGround = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        pnlBieuDo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlBackGround.setBackground(new java.awt.Color(255, 255, 255));

        lblNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNam.setText("Năm:");

        cboNam.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        pnlBieuDo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlBieuDoLayout = new javax.swing.GroupLayout(pnlBieuDo);
        pnlBieuDo.setLayout(pnlBieuDoLayout);
        pnlBieuDoLayout.setHorizontalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBieuDoLayout.setVerticalGroup(
            pnlBieuDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBackGroundLayout = new javax.swing.GroupLayout(pnlBackGround);
        pnlBackGround.setLayout(pnlBackGroundLayout);
        pnlBackGroundLayout.setHorizontalGroup(
            pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBackGroundLayout.createSequentialGroup()
                        .addComponent(lblNam)
                        .addGap(18, 18, 18)
                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 374, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBackGroundLayout.setVerticalGroup(
            pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNam)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlBieuDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        // TODO add your handling code here:
        hienBieuDo();
    }//GEN-LAST:event_cboNamActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BieuDoDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BieuDoDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BieuDoDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BieuDoDoanhThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BieuDoDoanhThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel lblNam;
    private javax.swing.JPanel pnlBackGround;
    private javax.swing.JPanel pnlBieuDo;
    // End of variables declaration//GEN-END:variables

    KhoaHocDAO khdao = new KhoaHocDAO();
    ThongKeDAO dao = new ThongKeDAO();
    private void fillComboBoxNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();;
        List<Integer> list = khdao.selectYears();
        for(Integer year : list){
            model.addElement(year);
        }
    }

    private void init() {
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        fillComboBoxNam();
        hienBieuDo();
    }

    private void hienBieuDo(){
        int nam = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = dao.getDoanhThu(nam);
        double hptn = 0;
        double hpcn = 0;
        double hptb = 0;
        for (Object[] row : list) {
            double temp1 = Double.parseDouble(row[4].toString());
            double temp2 = Double.parseDouble(row[5].toString());
            double temp3 = Double.parseDouble(row[6].toString());
            hptn += temp1;
            hpcn += temp2 ;
            hptb += temp3;
        } 
        
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        dcd.setValue(hptn, "Học Phí", "HP Thấp Nhất");
        dcd.setValue(hpcn, "Học Phí", "HP Cao Nhất");
        dcd.setValue(hptb, "Học Phí", "HP Trung Bình");
        
        JFreeChart jchart = ChartFactory.createBarChart3D("Học phí biểu đồ", "Học phí thống kê", "Học phí", dcd, PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot plots = jchart.getCategoryPlot();
        plots.setRangeGridlinePaint(Color.BLACK);
        
        
//        ChartFrame chartFrm = new ChartFrame("Học phí biểu đồ", jchart, true);
//        chartFrm.setVisible(true);
//        chartFrm.setSize(500, 400);
        
        ChartPanel chartPanel = new ChartPanel(jchart);
        chartPanel.setSize(976, 528);
        pnlBieuDo.removeAll();
        pnlBieuDo.add(chartPanel);
        pnlBieuDo.updateUI();
    }
}

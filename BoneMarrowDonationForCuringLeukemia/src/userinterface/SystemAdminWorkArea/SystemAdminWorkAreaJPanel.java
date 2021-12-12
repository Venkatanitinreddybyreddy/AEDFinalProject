/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

/**
 *
 * @author nitin
 */

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Magic.Design.MyJLabel;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.getWindowAncestor;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    boolean a= true;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EcoSystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);    
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        
        if(numberbool == 1){
            
            h1.setBackground(new Color(70,55,37));
            h2.setBackground(new Color(216,99,1));        
        }
        else{
            h1.setBackground(new Color(216,99,1));
            h2.setBackground(new Color(70,55,37));   
        }  
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        BtnManageNetwork = new javax.swing.JLabel();
        BtnManageEnterprise = new javax.swing.JLabel();
        BtnManageAuthentication = new javax.swing.JLabel();
        lblStatistics = new javax.swing.JLabel();
        panelSysadminWorkContainer = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1150, 720));
        setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(15, 29, 52));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.GridLayout(1, 0));

        BtnManageNetwork.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageNetwork.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageNetwork.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageNetwork.setText("Manage Network");
        BtnManageNetwork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageNetworkMouseClicked(evt);
            }
        });
        Header.add(BtnManageNetwork);

        BtnManageEnterprise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageEnterprise.setText("Manage Enterprise");
        BtnManageEnterprise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageEnterpriseMouseClicked(evt);
            }
        });
        Header.add(BtnManageEnterprise);

        BtnManageAuthentication.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnManageAuthentication.setForeground(new java.awt.Color(255, 255, 255));
        BtnManageAuthentication.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnManageAuthentication.setText("Manage Authentication");
        BtnManageAuthentication.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnManageAuthentication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnManageAuthenticationMouseClicked(evt);
            }
        });
        Header.add(BtnManageAuthentication);

        lblStatistics.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblStatistics.setForeground(new java.awt.Color(255, 255, 255));
        lblStatistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatistics.setText("Statistics");
        lblStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStatisticsMouseClicked(evt);
            }
        });
        Header.add(lblStatistics);

        add(Header, java.awt.BorderLayout.PAGE_START);

        panelSysadminWorkContainer.setBackground(new java.awt.Color(241, 250, 238));
        panelSysadminWorkContainer.setLayout(new java.awt.CardLayout());
        add(panelSysadminWorkContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnManageNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageNetworkMouseClicked
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetwork = new ManageNetworkJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageNetworkJPanel",manageNetwork);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageNetworkMouseClicked

    private void BtnManageEnterpriseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageEnterpriseMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterprise = new ManageEnterpriseJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageEnterpriseMouseClicked

    private void BtnManageAuthenticationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnManageAuthenticationMouseClicked
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEntAuth = new ManageEnterpriseAdminJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("ManageEnterpriseAdminJPanel",manageEntAuth);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_BtnManageAuthenticationMouseClicked

    private void lblStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatisticsMouseClicked
// TODO add your handling code here:
        StatisticsJPanel statistics = new StatisticsJPanel(panelSysadminWorkContainer,ecosystem);
        panelSysadminWorkContainer.add("Statistics",statistics);
        CardLayout layout = (CardLayout) panelSysadminWorkContainer.getLayout();
        layout.next(panelSysadminWorkContainer);
    }//GEN-LAST:event_lblStatisticsMouseClicked
      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnManageAuthentication;
    private javax.swing.JLabel BtnManageEnterprise;
    private javax.swing.JLabel BtnManageNetwork;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel lblStatistics;
    private javax.swing.JPanel panelSysadminWorkContainer;
    // End of variables declaration//GEN-END:variables
}

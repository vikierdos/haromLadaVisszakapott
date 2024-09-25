package main;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HaromLada extends javax.swing.JFrame {
    public boolean kincs = true; //hogy minden kattintáskor ne állítsa true-ra   
    public String arany;
    public String ezustKinccssel;
    public String bronz;
    
    public HaromLada() throws IOException {
        initComponents();
        
        InputStream is = HaromLada.class.getClassLoader().getResourceAsStream("docs/szoveg.txt");
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(is));
        ezustKinccssel = bf.readLine();
        arany = bf.readLine();
        bronz = bf.readLine();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bronz_btn = new javax.swing.JButton();
        arany_btn = new javax.swing.JButton();
        ezust_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Három Láda");
        setResizable(false);

        bronz_btn.setBackground(new java.awt.Color(204, 51, 0));
        bronz_btn.setText("Az arany láda hazudik");
        bronz_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bronz_btnMouseClicked(evt);
            }
        });

        arany_btn.setBackground(new java.awt.Color(255, 204, 102));
        arany_btn.setText("Én rejtem a kincset");
        arany_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arany_btnMouseClicked(evt);
            }
        });

        ezust_btn.setBackground(new java.awt.Color(204, 204, 204));
        ezust_btn.setText("Nem én rejtem a kincset");
        ezust_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ezust_btnMouseClicked(evt);
            }
        });

        jLabel1.setText("Az egyik ládában kincset találsz.");

        jLabel2.setText("Válaszd ki, hogy szerinted melyikben!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(arany_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ezust_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(bronz_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ezust_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arany_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bronz_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arany_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arany_btnMouseClicked
        if(!(bronz_btn.getText().equals("Újraindít"))){    
        aranyBronzGomb(arany);
        }
    }//GEN-LAST:event_arany_btnMouseClicked

    private void aranyBronzGomb(String txt) throws HeadlessException {
        JOptionPane.showMessageDialog(null, txt, ":(", JOptionPane.ERROR_MESSAGE);
        ujrainditInterface();
    }

    private void ezust_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ezust_btnMouseClicked
        if(!(bronz_btn.getText().equals("Újraindít"))){
            ezustGomb(ezustKinccssel);
        }else{
            
        }
    }//GEN-LAST:event_ezust_btnMouseClicked

    private void ezustGomb( String txt) throws HeadlessException {
        
            int kiiras = JOptionPane.showConfirmDialog(null, txt, ":)", JOptionPane.YES_NO_OPTION);
            if(kiiras == JOptionPane.YES_OPTION){
            kincs = false;
            }
            
        ujrainditInterface();
    }

    private void bronz_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bronz_btnMouseClicked
            //        JOptionPane.showMessageDialog(null, "Nem bennem van a kincs, de igazat mondtam!", ":(", JOptionPane.ERROR_MESSAGE);
            //        ujrainditInterface();
        if(!(bronz_btn.getText().equals("Újraindít"))){
           aranyBronzGomb(bronz);
        }
            
    }//GEN-LAST:event_bronz_btnMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HaromLada().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(HaromLada.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void ujrainditInterface(){
        bronz_btn.setText("Újraindít");
        arany_btn.setText("");
        arany_btn.setEnabled(false);
        ezust_btn.setText("");
        ezust_btn.setEnabled(false);
    }
    
    public void megjelenesInterface(){
        bronz_btn.setText("Az arany láda hazudik");
        arany_btn.setText("Én rejtem a kincset");
        arany_btn.setEnabled(true);
        ezust_btn.setText("Nem én rejtem a kincset");
        ezust_btn.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arany_btn;
    private javax.swing.JButton bronz_btn;
    private javax.swing.JButton ezust_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

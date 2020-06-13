
package com.all_files;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/**
 *
 * @author radhe
 */

@Component("cal")
public class Calculator extends javax.swing.JFrame{
@Autowired
private PrintRecipt print;    
private Map<String,Double> map;
@Autowired
private DefaultListModel lmdl;
@Autowired
private InfixEval evl;
private String number;
private double result;
private int flag ;
private String holder_name;
   
 
    public Calculator() {
        initComponents();
        this.setVisible(true);
        this.setTitle("Calulator");
        setLocation(100, 100);
        map = new LinkedHashMap<String,Double>();
        init(0);
    }

    private void init(int val){
        flag = val;
    }
    private void initR(int val){
        result = val;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonSZ = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonpluse = new javax.swing.JButton();
        jButtonDZ = new javax.swing.JButton();
        jButtonEqu = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonMul = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtonAC = new javax.swing.JButton();
        jButtonDEL = new javax.swing.JButton();
        jButtonCLR = new javax.swing.JButton();
        jButtonb1 = new javax.swing.JButton();
        jButtonb2 = new javax.swing.JButton();
        jButtonpow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAmt = new javax.swing.JList<>();
        jTextFieldDisplay = new javax.swing.JTextField();
        jButtonAddAmount = new javax.swing.JButton();
        jLabelTAmount = new javax.swing.JLabel();
        jButtonPrint = new javax.swing.JButton();
        operation = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonSZ.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonSZ.setText("0");
        jButtonSZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSZActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonpluse.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonpluse.setText("+");
        jButtonpluse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpluseActionPerformed(evt);
            }
        });

        jButtonDZ.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonDZ.setText("00");
        jButtonDZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDZActionPerformed(evt);
            }
        });

        jButtonEqu.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonEqu.setText("=");
        jButtonEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquActionPerformed(evt);
            }
        });

        jButtonDiv.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonMul.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonMul.setText("*");
        jButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMulActionPerformed(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButtonDot.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonDot.setText(".");
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButtonAC.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonAC.setText("AC");
        jButtonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonACActionPerformed(evt);
            }
        });

        jButtonDEL.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonDEL.setText("DEL");
        jButtonDEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELActionPerformed(evt);
            }
        });

        jButtonCLR.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonCLR.setText("CLR");
        jButtonCLR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLRActionPerformed(evt);
            }
        });

        jButtonb1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonb1.setText("(");
        jButtonb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonb1ActionPerformed(evt);
            }
        });

        jButtonb2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonb2.setText(")");
        jButtonb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonb2ActionPerformed(evt);
            }
        });

        jButtonpow.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButtonpow.setText("^");
        jButtonpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSZ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDZ, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpow, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCLR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonpluse, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonb1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonb2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonpluse, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonb2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jButtonCLR, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonDEL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonpow, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonMinus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonEqu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jListAmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListAmtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListAmt);

        jTextFieldDisplay.setEditable(false);
        jTextFieldDisplay.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N

        jButtonAddAmount.setText("ADD AMOUNT");
        jButtonAddAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAmountActionPerformed(evt);
            }
        });

        jLabelTAmount.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        jButtonPrint.setText("PRINT ");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        operation.setEditable(false);
        operation.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAddAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(jButtonPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAddAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jButtonPrint))
                    .addComponent(jTextFieldDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTAmount)
                    .addComponent(operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAmountActionPerformed
        try{
            
            
            if(jTextFieldDisplay.getText().length()>0)
            {
              String msg = JOptionPane.showInputDialog(this,"Reasonable payment amount for ?");  
              double val = Double.parseDouble(jTextFieldDisplay.getText()); 
               jTextFieldDisplay.setText("");
              jListAmt.setModel(lmdl);
              lmdl.addElement(val);
              map.put(msg, val);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonAddAmountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("1");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("2");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("3");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("4");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("5");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      try
        {
            number = jTextFieldDisplay.getText().concat("6");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("7");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("8");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       try
        {
            number = jTextFieldDisplay.getText().concat("9");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonSZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSZActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("0");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSZActionPerformed

    private void jButtonDZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDZActionPerformed
        try
        {
            number = jTextFieldDisplay.getText().concat("00");
            jTextFieldDisplay.setText(number);
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDZActionPerformed

    private void jButtonpluseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpluseActionPerformed
       try
       {
           number = jTextFieldDisplay.getText();
           if(flag == 0 && !number.contains("("))
           {
               initR(0);
               result+=Double.parseDouble(number);
               operation.setText("+");
               jLabelTAmount.setText(result+"");
               jTextFieldDisplay.setText("");
               init(1);
           }
           else if(number.length()>0 && !number.contains("("))
           {
               checkOperation();
               operation.setText("+");
           }
           else
               jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat("+"));
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_jButtonpluseActionPerformed

    private void jButtonEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquActionPerformed
       try
       {
           number = jTextFieldDisplay.getText();
           if(number.length()>0 && !number.contains("("))
           {
               checkOperation();
               jTextFieldDisplay.setText(result+"");
               jLabelTAmount.setText("");
               operation.setText("");
               initR(0);
               init(0);
           }
           else
           {
              
               evl.setExpresion(jTextFieldDisplay.getText());
	       jTextFieldDisplay.setText(evl.evalExpresion()+"");
               evl.resetStack();
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this, e.getMessage());
       }
    }//GEN-LAST:event_jButtonEquActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        try{
            number = jTextFieldDisplay.getText();
           if(flag == 0 && !number.contains("("))
           {
               initR(0);
               result=Double.parseDouble(number);
               operation.setText("/");
               jLabelTAmount.setText(result+"");
               jTextFieldDisplay.setText("");
               init(1);
           }
           else if(number.length()>0 && !number.contains("("))
           {
               checkOperation();   
               operation.setText("/");
           }
           else
               jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat("/"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMulActionPerformed
        try{
            number = jTextFieldDisplay.getText();
           if(flag == 0 && !number.contains("("))
           {
               initR(0);
               result=Double.parseDouble(number);
               operation.setText("*");
               jLabelTAmount.setText(result+"");
               jTextFieldDisplay.setText("");
               init(1);
           }
           else if(number.length()>0 && !number.contains("("))
           {
               checkOperation();            
               operation.setText("*");
           }
           else
               jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat("*"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonMulActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        try{
            number = jTextFieldDisplay.getText();
           if(number.length()==0)
               jTextFieldDisplay.setText("-");
          else if(flag == 0 && !number.contains("("))
           {
               initR(0);
               result=Double.parseDouble(number);
               operation.setText("-");
               jLabelTAmount.setText(result+"");
               jTextFieldDisplay.setText("");
               init(1);
           }
           else if(number.length()>0 && !number.contains("("))
           {
               checkOperation();
               operation.setText("-");
           }
           else
               jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat("-"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        try
        {
            number = jTextFieldDisplay.getText();
            if(number.contains(".")==false && number.length()>0){
              jTextFieldDisplay.setText(number.concat("."));     
            }
            
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButtonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonACActionPerformed
        try
        {
            initR(0);
            init(0);
            number = "";
            jTextFieldDisplay.setText("");
            jListAmt.setModel(lmdl);
            lmdl.clear();
            operation.setText("");
            jLabelTAmount.setText("");
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonACActionPerformed

    private void jListAmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListAmtMouseClicked
      
        try
        {
            int i=jListAmt.getSelectedIndex();
            int dicision = JOptionPane.showConfirmDialog(this, "if we want to remove ? : ");
            int p = 0;
            
            if(dicision == 0)
            {
                for(String k : map.keySet())
              {
                if(p++ == i){
                    map.remove(k);
                    jListAmt.setModel(lmdl);
                    lmdl.remove(i);
                }
              }
            }
            
            System.out.print(""+map);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error:"+e.getMessage());
        }
      
    }//GEN-LAST:event_jListAmtMouseClicked

    private void jButtonDELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELActionPerformed
    try {
        if(jTextFieldDisplay.getText().length()>0)
        jTextFieldDisplay.setText(jTextFieldDisplay.getText(0,jTextFieldDisplay.getText().length()-1));
    } catch (BadLocationException ex) {
        Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButtonDELActionPerformed

    private void jButtonCLRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLRActionPerformed
        jTextFieldDisplay.setText("");
    }//GEN-LAST:event_jButtonCLRActionPerformed

    private void jButtonb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonb1ActionPerformed
        try{
            
            jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat("("));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonb1ActionPerformed

    private void jButtonb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonb2ActionPerformed
         try{
            
            jTextFieldDisplay.setText(jTextFieldDisplay.getText().concat(")"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonb2ActionPerformed

    private void jButtonpowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpowActionPerformed
        try{
            number = jTextFieldDisplay.getText();
           if(flag == 0)
           {
               initR(0);
               result=Double.parseDouble(number);
               operation.setText("^");
               jLabelTAmount.setText(result+"");
               jTextFieldDisplay.setText("");
               init(1);
           }
           else if(number.length()>0)
           {
               checkOperation();
               operation.setText("^");
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonpowActionPerformed
    
    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try
        {
            holder_name = JOptionPane.showInputDialog("Enter the reciept holder name ?");
            
            if(holder_name!=null)
            {
                
               if(map.size()>0)
               {
                   print.setVisible(true);
                   print.setDate();   
                   print.setHolder(holder_name);
                   print.setTableModel();
                   double total =0;
                   for(String i : map.keySet())
                   {
                       print.setTableRow(i,map.get(i).toString());
                       total+=Double.parseDouble(map.get(i).toString());
                   }
                   print.setTableRow("TOTAL",total+"");
                   print.setRecieveAmt(total+"");
               }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

  
    private void checkOperation()
    {
        if(operation.getText().equalsIgnoreCase("+"))
            addNumber();
        if(operation.getText().equalsIgnoreCase("-"))
            subNumber();
        if(operation.getText().equalsIgnoreCase("*"))
            mulNumber();
        if(operation.getText().equalsIgnoreCase("/"))
            divNumber();
        if(operation.getText().equalsIgnoreCase("^"))
            calPow();
    }
    
    private void calPow()
    {
        try
        {
            
         result=Math.pow(result, Double.parseDouble(number));
         jLabelTAmount.setText(result+"");
         jTextFieldDisplay.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void addNumber()
    {
        try
        {
            
         result+=Double.parseDouble(number);
         jLabelTAmount.setText(result+"");
         jTextFieldDisplay.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void subNumber()
    {
        try
        {
            
         result-=Double.parseDouble(number);
         jLabelTAmount.setText(result+"");
         jTextFieldDisplay.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void mulNumber()
    {
        try
        {
            
         result*=Double.parseDouble(number);
         jLabelTAmount.setText(result+"");
         jTextFieldDisplay.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    private void divNumber()
    {
        try
        {
            
         result/=Double.parseDouble(number);
         jLabelTAmount.setText(result+"");
         jTextFieldDisplay.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAC;
    private javax.swing.JButton jButtonAddAmount;
    private javax.swing.JButton jButtonCLR;
    private javax.swing.JButton jButtonDEL;
    private javax.swing.JButton jButtonDZ;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonEqu;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMul;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonSZ;
    private javax.swing.JButton jButtonb1;
    private javax.swing.JButton jButtonb2;
    private javax.swing.JButton jButtonpluse;
    private javax.swing.JButton jButtonpow;
    private javax.swing.JLabel jLabelTAmount;
    private javax.swing.JList<String> jListAmt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDisplay;
    private javax.swing.JTextField operation;
    // End of variables declaration//GEN-END:variables


    
    
}

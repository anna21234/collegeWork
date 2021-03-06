/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopProjectFinal;

import javax.swing.JOptionPane;

/**
 *
 * @author x17432284
 */
public class OrderGUI extends javax.swing.JFrame {
    
    CoffeeShop cof;
    
    //array of objects
    CoffeeShop arr[] = new CoffeeShop[10];
    
    int Count = 0;
    
    Double total;
    String Drink;
    String Sugar;
    String Milk;
    Double MilkCost;
    Double SugarCost;
    Double DrinkCost;
    String TeaType;
    Double TeaTypeCost;
    String CoffeeType;
    Double CoffeeTypeCost;
    String Type;

    /**
     * Creates new form OrderGUI
     */
    public OrderGUI() {
        initComponents();
        //sets what is supposed to be visible and what is supposed to be hidden at the start
        SugarChoiceLbl.setVisible(false);
        SugarChoiceTf.setVisible(false);
        MilkChoiceLbl.setVisible(false);
        MilkChoiceTf.setVisible(false);
        TeaTypeLbl.setVisible(false);
        CoffeeTypeLbl.setVisible(false);
        BlackRad.setVisible(false);
        GreenRad.setVisible(false);
        FruitRad.setVisible(false);
        DecafRad.setVisible(false);
        StrongRad.setVisible(false);
        WeakRad.setVisible(false);
        CompleteOrderBtn.setVisible(false);
        NextBtn.setVisible(false);
        TotalCostLbl.setVisible(false);
        TotalCostTf.setVisible(false);
        PrintBtn.setVisible(false);
        regBtn.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        MilkChoice1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CoffeeBtn = new javax.swing.JButton();
        TeaBtn = new javax.swing.JButton();
        SugarChoiceLbl = new javax.swing.JLabel();
        SugarChoiceTf = new javax.swing.JTextField();
        MilkChoiceLbl = new javax.swing.JLabel();
        MilkChoiceTf = new javax.swing.JTextField();
        TeaTypeLbl = new javax.swing.JLabel();
        CoffeeTypeLbl = new javax.swing.JLabel();
        BlackRad = new javax.swing.JRadioButton();
        DecafRad = new javax.swing.JRadioButton();
        GreenRad = new javax.swing.JRadioButton();
        StrongRad = new javax.swing.JRadioButton();
        WeakRad = new javax.swing.JRadioButton();
        FruitRad = new javax.swing.JRadioButton();
        CompleteOrderBtn = new javax.swing.JButton();
        NextBtn = new javax.swing.JButton();
        TotalCostLbl = new javax.swing.JLabel();
        TotalCostTf = new javax.swing.JTextField();
        PrintBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel4.setText("Milk (answer yes or no)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Order");

        CoffeeBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        CoffeeBtn.setText("Coffee");
        CoffeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoffeeBtnActionPerformed(evt);
            }
        });

        TeaBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        TeaBtn.setText("Tea");
        TeaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeaBtnActionPerformed(evt);
            }
        });

        SugarChoiceLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        SugarChoiceLbl.setText("Sugar (answer yes or no)");

        MilkChoiceLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        MilkChoiceLbl.setText("Milk (answer yes or no)");

        TeaTypeLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        TeaTypeLbl.setText("Tea Type");

        CoffeeTypeLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        CoffeeTypeLbl.setText("Coffee Type ");

        BlackRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        BlackRad.setText("Black");
        BlackRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlackRadActionPerformed(evt);
            }
        });

        DecafRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        DecafRad.setText("Decaf");
        DecafRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecafRadActionPerformed(evt);
            }
        });

        GreenRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        GreenRad.setText("Green");
        GreenRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreenRadActionPerformed(evt);
            }
        });

        StrongRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        StrongRad.setText("Strong");
        StrongRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrongRadActionPerformed(evt);
            }
        });

        WeakRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        WeakRad.setText("Weak");
        WeakRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeakRadActionPerformed(evt);
            }
        });

        FruitRad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        FruitRad.setText("Fruit");
        FruitRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FruitRadActionPerformed(evt);
            }
        });

        CompleteOrderBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        CompleteOrderBtn.setText("Complete Order");
        CompleteOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteOrderBtnActionPerformed(evt);
            }
        });

        NextBtn.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        NextBtn.setText("Next");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });

        TotalCostLbl.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        TotalCostLbl.setText("Total Cost");

        TotalCostTf.setEditable(false);

        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        regBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regBtn.setText("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SugarChoiceLbl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(MilkChoiceLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MilkChoiceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TeaTypeLbl)
                                        .addGap(46, 46, 46)
                                        .addComponent(BlackRad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CoffeeTypeLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(DecafRad)))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StrongRad)
                                    .addComponent(GreenRad))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FruitRad)
                                    .addComponent(WeakRad)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(CompleteOrderBtn))
                            .addComponent(SugarChoiceTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CoffeeBtn)
                                .addGap(69, 69, 69)
                                .addComponent(TeaBtn)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(TotalCostLbl)
                                .addGap(49, 49, 49)
                                .addComponent(TotalCostTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regBtn)
                                    .addComponent(NextBtn))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeaBtn)
                    .addComponent(CoffeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SugarChoiceLbl)
                    .addComponent(SugarChoiceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MilkChoiceLbl)
                    .addComponent(MilkChoiceTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeaTypeLbl)
                    .addComponent(BlackRad)
                    .addComponent(GreenRad)
                    .addComponent(FruitRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoffeeTypeLbl)
                    .addComponent(DecafRad)
                    .addComponent(StrongRad)
                    .addComponent(WeakRad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CompleteOrderBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextBtn)
                    .addComponent(TotalCostLbl)
                    .addComponent(TotalCostTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrintBtn)
                    .addComponent(regBtn))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoffeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoffeeBtnActionPerformed
        // TODO add your handling code here:
        
        //updates the visible - not visible fields
        SugarChoiceLbl.setVisible(true);
        SugarChoiceTf.setVisible(true);
        MilkChoiceLbl.setVisible(true);
        MilkChoiceTf.setVisible(true);
        TeaTypeLbl.setVisible(false);
        CoffeeTypeLbl.setVisible(true);
        BlackRad.setVisible(false);
        GreenRad.setVisible(false);
        FruitRad.setVisible(false);
        DecafRad.setVisible(true);
        StrongRad.setVisible(true);
        WeakRad.setVisible(true);
        CompleteOrderBtn.setVisible(true);
        NextBtn.setVisible(false);
        TotalCostLbl.setVisible(false);
        TotalCostTf.setVisible(false);
        regBtn.setVisible(false);
        
        Drink = "Coffee";
        DrinkCost=2.0;
        cof = new Coffee();
        
        
    }//GEN-LAST:event_CoffeeBtnActionPerformed

    private void TeaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeaBtnActionPerformed
        // TODO add your handling code here:
        
        //updates visible - not visisble fields
        SugarChoiceLbl.setVisible(true);
        SugarChoiceTf.setVisible(true);
        MilkChoiceLbl.setVisible(true);
        MilkChoiceTf.setVisible(true);
        TeaTypeLbl.setVisible(true);
        CoffeeTypeLbl.setVisible(false);
        BlackRad.setVisible(true);
        GreenRad.setVisible(true);
        FruitRad.setVisible(true);
        DecafRad.setVisible(false);
        StrongRad.setVisible(false);
        WeakRad.setVisible(false);
        CompleteOrderBtn.setVisible(true);
        NextBtn.setVisible(false);
        TotalCostLbl.setVisible(false);
        TotalCostTf.setVisible(false);
        
        Drink = "Tea";
        DrinkCost=1.0;
        cof = new Tea();
    }//GEN-LAST:event_TeaBtnActionPerformed

    private void CompleteOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteOrderBtnActionPerformed
        // TODO add your handling code here:
        
        //updates visible - not visible fields
        NextBtn.setVisible(true);
        regBtn.setVisible(true);
        TotalCostLbl.setVisible(true);
        TotalCostTf.setVisible(true);
        
        
        //gets the text inputted from the user
        Sugar = SugarChoiceTf.getText();
        Milk = MilkChoiceTf.getText();
        
        
        cof.setSugar(Sugar);
        cof.setMilk(Milk);
        
        cof.setDrink(Drink);
        cof.setDrinkCost(DrinkCost);
        
        
        //computes the total cost based on the inputs and choices from the user
        cof.computeTotalCost();
        Double total = cof.getTotal();
        TotalCostTf.setText(Double.toString(total));
        
        if (cof instanceof Tea){
            cof = new Tea();
            Sugar = SugarChoiceTf.getText();
            Milk = MilkChoiceTf.getText();
            cof.setSugar(Sugar);
            cof.setMilk(Milk);
            ((Tea)cof).setTeaType(TeaType);
        
            cof.setDrink(Drink);
            cof.setDrinkCost(DrinkCost);
            
            arr[Count] = cof;
            Count++;
        
        }
        if (cof instanceof Coffee){
            cof = new Coffee();
            Sugar = SugarChoiceTf.getText();
            Milk = MilkChoiceTf.getText();
            cof.setSugar(Sugar);
            cof.setMilk(Milk);
            ((Coffee)cof).setCoffeeType(CoffeeType);
        
            cof.setDrink(Drink);
            cof.setDrinkCost(DrinkCost);
            
            arr[Count] = cof;
            Count++;
        
        }
        
    }//GEN-LAST:event_CompleteOrderBtnActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        // TODO add your handling code here:
        
        //closes current GUI, sends the values from the input fields to the InvoiceGUI and opens the InvoiceGUI
        InvoiceGUI newGUI = new InvoiceGUI();
        newGUI.setTextFieldText(TotalCostTf.getText());
        newGUI.setTextFieldText2(Drink);
        newGUI.setTextFieldText3(SugarChoiceTf.getText());
        newGUI.setTextFieldText4(MilkChoiceTf.getText());
        newGUI.setTextFieldText5(Type);
        OrderGUI.this.setVisible(false);
        newGUI.setVisible(true);
        
        
        
    }//GEN-LAST:event_NextBtnActionPerformed

    private void BlackRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlackRadActionPerformed
        // TODO add your handling code here:
        
        //Sets the tea type based on the choice user made
         if (BlackRad.isSelected()) {
            GreenRad.setSelected(false);
            FruitRad.setSelected(false);
        }
         TeaType = "Black";
         ((Tea)cof).setTeaType(TeaType);
         Type = "Black";
    }//GEN-LAST:event_BlackRadActionPerformed

    private void GreenRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreenRadActionPerformed
        // TODO add your handling code here:
         //Sets the tea type based on the choice user made
        if (GreenRad.isSelected()) {
            BlackRad.setSelected(false);
            FruitRad.setSelected(false);
        }
        TeaType = "Green";
        ((Tea)cof).setTeaType(TeaType);
        Type = "Green";
    }//GEN-LAST:event_GreenRadActionPerformed

    private void FruitRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FruitRadActionPerformed
        // TODO add your handling code here:
         //Sets the tea type based on the choice user made
        if (FruitRad.isSelected()) {
            GreenRad.setSelected(false);
            BlackRad.setSelected(false);
        }
        TeaType = "Fruit";
        ((Tea)cof).setTeaType(TeaType);
        Type = "Fruit";
    }//GEN-LAST:event_FruitRadActionPerformed

    private void DecafRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecafRadActionPerformed
        // TODO add your handling code here:
         //Sets the coffee type based on the choice user made
        if (DecafRad.isSelected()) {
            StrongRad.setSelected(false);
            WeakRad.setSelected(false);
        }
        CoffeeType = "Decaf";
        ((Coffee)cof).setCoffeeType(CoffeeType);
        Type = "Decaf";
    }//GEN-LAST:event_DecafRadActionPerformed

    private void StrongRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrongRadActionPerformed
        // TODO add your handling code here:
        //Sets the coffee type based on the choice user made
        if (StrongRad.isSelected()) {
            DecafRad.setSelected(false);
            WeakRad.setSelected(false);
        }
        CoffeeType = "Strong";
        ((Coffee)cof).setCoffeeType(CoffeeType);
        Type = "Strong";
    }//GEN-LAST:event_StrongRadActionPerformed

    private void WeakRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeakRadActionPerformed
        // TODO add your handling code here:
        //Sets the coffee type based on the choice user made
        if (WeakRad.isSelected()) {
            StrongRad.setSelected(false);
            DecafRad.setSelected(false);
        }
        CoffeeType = "Weak";
        ((Coffee)cof).setCoffeeType(CoffeeType);
        Type = "Weak";
    }//GEN-LAST:event_WeakRadActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
        for(int i =0; i<Count; i = i+1){
            JOptionPane.showMessageDialog(null, arr[i].printDetails());
        }
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
        
        //moves to the registering gui
        this.setVisible(false);
        toRegisterGUI reg = new toRegisterGUI();
       reg.setVisible(true);
    }//GEN-LAST:event_regBtnActionPerformed

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
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new OrderGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BlackRad;
    private javax.swing.JButton CoffeeBtn;
    private javax.swing.JLabel CoffeeTypeLbl;
    private javax.swing.JButton CompleteOrderBtn;
    private javax.swing.JRadioButton DecafRad;
    private javax.swing.JRadioButton FruitRad;
    private javax.swing.JRadioButton GreenRad;
    private javax.swing.JTextField MilkChoice1;
    private javax.swing.JLabel MilkChoiceLbl;
    private javax.swing.JTextField MilkChoiceTf;
    private javax.swing.JButton NextBtn;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JRadioButton StrongRad;
    private javax.swing.JLabel SugarChoiceLbl;
    private javax.swing.JTextField SugarChoiceTf;
    private javax.swing.JButton TeaBtn;
    private javax.swing.JLabel TeaTypeLbl;
    private javax.swing.JLabel TotalCostLbl;
    private javax.swing.JTextField TotalCostTf;
    private javax.swing.JRadioButton WeakRad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton regBtn;
    // End of variables declaration//GEN-END:variables
}

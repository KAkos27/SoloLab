package halalab;

import java.util.Random;

public class HalaLab extends javax.swing.JFrame {
    //asd
    int mentes = 1;
    boolean gombTilto = true;
    int ugyesseg = 6;
    int eletero = 12;
    int szerencse = 6;
    int arany = 0;

    public HalaLab() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpJatek = new javax.swing.JTabbedPane();
        pnKalandlap = new javax.swing.JPanel();
        pnStatok = new javax.swing.JPanel();
        lblEletero = new javax.swing.JLabel();
        lblUgyesseg = new javax.swing.JLabel();
        tbtUgyesseg = new javax.swing.JToggleButton();
        tbtEletero = new javax.swing.JToggleButton();
        tbtSzerencse = new javax.swing.JToggleButton();
        lblSzerencse = new javax.swing.JLabel();
        tbtArany = new javax.swing.JToggleButton();
        lblArany = new javax.swing.JLabel();
        pnKalandor = new javax.swing.JPanel();
        lblKalandorKep = new javax.swing.JLabel();
        pnElso = new javax.swing.JPanel();
        lblElsoKep = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taElso = new javax.swing.JTextArea();
        tbt66 = new javax.swing.JToggleButton();
        tbt270 = new javax.swing.JToggleButton();
        pn270 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta270 = new javax.swing.JTextArea();
        tbt66270 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        pn66 = new javax.swing.JPanel();
        lbl66 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta66 = new javax.swing.JTextArea();
        tbt56 = new javax.swing.JToggleButton();
        tbt293 = new javax.swing.JToggleButton();
        btKalandlap = new javax.swing.JButton();
        btJatek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnKalandlap.setDoubleBuffered(false);
        pnKalandlap.setEnabled(false);

        pnStatok.setBorder(javax.swing.BorderFactory.createTitledBorder("Statok:"));

        lblEletero.setText("12");

        lblUgyesseg.setText("6");

        tbtUgyesseg.setText("ÜGYESSÉG:");
        tbtUgyesseg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtUgyessegActionPerformed(evt);
            }
        });

        tbtEletero.setText("ÉLETERŐ:");
        tbtEletero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtEleteroActionPerformed(evt);
            }
        });

        tbtSzerencse.setText("SZERENCSE:");
        tbtSzerencse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSzerencseActionPerformed(evt);
            }
        });

        lblSzerencse.setText("6");

        tbtArany.setSelected(true);
        tbtArany.setText("ARANY:");
        tbtArany.setEnabled(false);

        lblArany.setText("0");

        javax.swing.GroupLayout pnStatokLayout = new javax.swing.GroupLayout(pnStatok);
        pnStatok.setLayout(pnStatokLayout);
        pnStatokLayout.setHorizontalGroup(
            pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbtSzerencse)
                    .addComponent(tbtEletero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtUgyesseg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbtArany))
                .addGap(31, 31, 31)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEletero)
                    .addComponent(lblSzerencse)
                    .addComponent(lblUgyesseg)
                    .addComponent(lblArany, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnStatokLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbtArany, tbtEletero, tbtSzerencse, tbtUgyesseg});

        pnStatokLayout.setVerticalGroup(
            pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatokLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUgyesseg)
                    .addComponent(tbtUgyesseg))
                .addGap(33, 33, 33)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEletero)
                    .addComponent(tbtEletero))
                .addGap(34, 34, 34)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSzerencse)
                    .addComponent(tbtSzerencse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnStatokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtArany)
                    .addComponent(lblArany, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pnKalandor.setBorder(javax.swing.BorderFactory.createTitledBorder("Roberto a Kalandor:"));

        lblKalandorKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/karakter.png"))); // NOI18N

        javax.swing.GroupLayout pnKalandorLayout = new javax.swing.GroupLayout(pnKalandor);
        pnKalandor.setLayout(pnKalandorLayout);
        pnKalandorLayout.setHorizontalGroup(
            pnKalandorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKalandorKep, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnKalandorLayout.setVerticalGroup(
            pnKalandorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnKalandorLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(lblKalandorKep, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnKalandlapLayout = new javax.swing.GroupLayout(pnKalandlap);
        pnKalandlap.setLayout(pnKalandlapLayout);
        pnKalandlapLayout.setHorizontalGroup(
            pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandlapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnKalandor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        pnKalandlapLayout.setVerticalGroup(
            pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnKalandlapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnKalandlapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnStatok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnKalandor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        tpJatek.addTab("Kalandlap", pnKalandlap);

        lblElsoKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/1. oldal.png"))); // NOI18N

        taElso.setEditable(false);
        taElso.setColumns(20);
        taElso.setLineWrap(true);
        taElso.setRows(5);
        taElso.setText("Miután öt percet haladtál lassan az alagútban, egy kőasztalhoz érsz, amely a bal oldali fal mellett áll. Hat doboz van rajta, egyikükre a te neved festették. Ha kiakarod nyitni a dobozt, lapozz a 270-re. Ha inkább tovább haladsz észak felé, lapozz a 66-ra.");
        taElso.setWrapStyleWord(true);
        jScrollPane1.setViewportView(taElso);

        tbt66.setText("66.");
        tbt66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt66ActionPerformed(evt);
            }
        });

        tbt270.setText("270.");
        tbt270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt270ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnElsoLayout = new javax.swing.GroupLayout(pnElso);
        pnElso.setLayout(pnElsoLayout);
        pnElsoLayout.setHorizontalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElsoKep)
                .addGap(18, 18, 18)
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnElsoLayout.createSequentialGroup()
                        .addComponent(tbt66, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tbt270, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnElsoLayout.setVerticalGroup(
            pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnElsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbt270)
                    .addComponent(tbt66))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnElsoLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(lblElsoKep))
        );

        tpJatek.addTab("Játék", pnElso);

        ta270.setEditable(false);
        ta270.setColumns(20);
        ta270.setLineWrap(true);
        ta270.setRows(5);
        ta270.setText("A doboz teteje könnyedén nyílik. Benne két aranypénzt találsz, és egy üzenetet, amely egy kis pergamenen neked szól. Előbb zsebre vágod az aranyakat, aztán elolvasod az üzenetet: - „Jól tetted. Legalább volt annyi eszed, hogy megállj és elfogadd az ajándékot. Most azt tanácsolom neked, hogy keress és használj különféle tárgyakat, ha sikerrel akarsz áthaladni Halállabirintusomon.” Azaláírás Szukumvit. Megjegyzed a tanácsot, apródarabokra téped a pergament, és tovább mészészak felé. Lapozz a 66-ra.");
        ta270.setWrapStyleWord(true);
        jScrollPane3.setViewportView(ta270);

        tbt66270.setText("66.");
        tbt66270.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbt66270ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/270. oldal 1.png"))); // NOI18N

        javax.swing.GroupLayout pn270Layout = new javax.swing.GroupLayout(pn270);
        pn270.setLayout(pn270Layout);
        pn270Layout.setHorizontalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn270Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbt66270, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        pn270Layout.setVerticalGroup(
            pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn270Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn270Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tbt66270))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab4", pn270);

        lbl66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/66. oldal.png"))); // NOI18N

        ta66.setEditable(false);
        ta66.setColumns(20);
        ta66.setLineWrap(true);
        ta66.setRows(5);
        ta66.setText("Néhány perc gyaloglás után egy elágazáshoz érsz az alagútban. Egy, a falra festett fehér nyíl nyugatfelé mutat. A földön nedves lábnyomok jelzik, merre haladtak az előtted járók. Nehéz biztosan megmondani, de úgy tűnik, hogy három közülük a nyíl irányába halad, míg egyikük úgy döntött, hogy keletnek megy. Ha nyugat felé kívánsz menni, lapozz a 293-ra. Ha keletnek, lapozz a 56-re.");
        ta66.setWrapStyleWord(true);
        jScrollPane2.setViewportView(ta66);

        tbt56.setText("56.");

        tbt293.setText("293.");

        javax.swing.GroupLayout pn66Layout = new javax.swing.GroupLayout(pn66);
        pn66.setLayout(pn66Layout);
        pn66Layout.setHorizontalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn66Layout.createSequentialGroup()
                .addComponent(lbl66)
                .addGap(25, 25, 25)
                .addGroup(pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn66Layout.createSequentialGroup()
                        .addComponent(tbt56, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tbt293, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn66Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tbt293, tbt56});

        pn66Layout.setVerticalGroup(
            pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn66Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl66, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pn66Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pn66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbt56)
                    .addComponent(tbt293))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpJatek.addTab("tab3", pn66);

        getContentPane().add(tpJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -36, 510, 370));

        btKalandlap.setText("KALANDLAP");
        btKalandlap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKalandlapActionPerformed(evt);
            }
        });
        getContentPane().add(btKalandlap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        btJatek.setText("JÁTÉK");
        btJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJatekActionPerformed(evt);
            }
        });
        getContentPane().add(btJatek, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btKalandlapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKalandlapActionPerformed
        mentes = tpJatek.getSelectedIndex();
        gombTilto = true;
        tpJatek.setSelectedIndex(0);

        gombTiltas();

    }//GEN-LAST:event_btKalandlapActionPerformed

    private void btJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJatekActionPerformed
        tpJatek.setSelectedIndex(mentes);
        gombTilto = false;

        gombTiltas();
    }//GEN-LAST:event_btJatekActionPerformed

    private void tbt66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt66ActionPerformed
        tpJatek.setSelectedIndex(3);
    }//GEN-LAST:event_tbt66ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        gombTiltas();
    }//GEN-LAST:event_formWindowOpened

    private void tbt270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt270ActionPerformed
        tpJatek.setSelectedIndex(2);
        arany += 2;
        lblArany.setText(arany + "");
    }//GEN-LAST:event_tbt270ActionPerformed

    private void tbtUgyessegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtUgyessegActionPerformed
        int dobas = statKiiras(7);

        ugyesseg = dobas + ugyesseg;
        lblUgyesseg.setText(ugyesseg + "");
        tbtUgyesseg.setEnabled(false);
    }//GEN-LAST:event_tbtUgyessegActionPerformed

    private void tbtEleteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtEleteroActionPerformed
        int dobas = statKiiras(13);

        eletero += dobas;
        lblEletero.setText(eletero + "");
        tbtEletero.setEnabled(false);
    }//GEN-LAST:event_tbtEleteroActionPerformed

    private void tbtSzerencseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSzerencseActionPerformed
        int dobas = statKiiras(7);

        szerencse += dobas;
        lblSzerencse.setText(szerencse + "");
        tbtSzerencse.setEnabled(false);
    }//GEN-LAST:event_tbtSzerencseActionPerformed

    private void tbt66270ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbt66270ActionPerformed
        tpJatek.setSelectedIndex(3);
    }//GEN-LAST:event_tbt66270ActionPerformed
    public int statKiiras(int max) {
        Random rand = new Random();
        int dobas = rand.nextInt(max);
        if (max == 7) {
            while (dobas == 0) {
                dobas = rand.nextInt(max);
            }
            return dobas;
        } else if (max == 13) {
            while (dobas < 2) {
                dobas = rand.nextInt(max);
            }
            return dobas;
        }
        return 0;
    }

    private void gombTiltas() {
        if (gombTilto == true) {
            btJatek.setEnabled(true);
            btKalandlap.setEnabled(false);
        } else if (gombTilto == false) {
            btJatek.setEnabled(false);
            btKalandlap.setEnabled(true);
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalaLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalaLab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btJatek;
    private javax.swing.JButton btKalandlap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lblArany;
    private javax.swing.JLabel lblEletero;
    private javax.swing.JLabel lblElsoKep;
    private javax.swing.JLabel lblKalandorKep;
    private javax.swing.JLabel lblSzerencse;
    private javax.swing.JLabel lblUgyesseg;
    private javax.swing.JPanel pn270;
    private javax.swing.JPanel pn66;
    private javax.swing.JPanel pnElso;
    private javax.swing.JPanel pnKalandlap;
    private javax.swing.JPanel pnKalandor;
    private javax.swing.JPanel pnStatok;
    private javax.swing.JTextArea ta270;
    private javax.swing.JTextArea ta66;
    private javax.swing.JTextArea taElso;
    private javax.swing.JToggleButton tbt270;
    private javax.swing.JToggleButton tbt293;
    private javax.swing.JToggleButton tbt56;
    private javax.swing.JToggleButton tbt66;
    private javax.swing.JToggleButton tbt66270;
    private javax.swing.JToggleButton tbtArany;
    private javax.swing.JToggleButton tbtEletero;
    private javax.swing.JToggleButton tbtSzerencse;
    private javax.swing.JToggleButton tbtUgyesseg;
    private javax.swing.JTabbedPane tpJatek;
    // End of variables declaration//GEN-END:variables
}

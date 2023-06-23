
package Visao;

import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;


public class Index extends javax.swing.JFrame implements InternalFrameListener{

    boolean flagListar_frame = false;
    boolean flagCadastrar_frame = false;
    
    public Index() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaoContato = new javax.swing.JMenu();
        botaoInternoCadstro = new javax.swing.JMenuItem();
        botaoInternoLista = new javax.swing.JMenuItem();
        botaoSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDA");

        javax.swing.GroupLayout painel_principalLayout = new javax.swing.GroupLayout(painel_principal);
        painel_principal.setLayout(painel_principalLayout);
        painel_principalLayout.setHorizontalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        painel_principalLayout.setVerticalGroup(
            painel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        botaoContato.setText("CONTATOS");

        botaoInternoCadstro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        botaoInternoCadstro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/inserir.png"))); // NOI18N
        botaoInternoCadstro.setText("<html><u>C</u>adastrar");
        botaoInternoCadstro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInternoCadstroActionPerformed(evt);
            }
        });
        botaoContato.add(botaoInternoCadstro);

        botaoInternoLista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        botaoInternoLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/listar.png"))); // NOI18N
        botaoInternoLista.setText("<html><u>L</u>istar Contatos");
        botaoInternoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInternoListaActionPerformed(evt);
            }
        });
        botaoContato.add(botaoInternoLista);

        jMenuBar1.add(botaoContato);

        botaoSair.setText("SAIR");
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(botaoSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInternoCadstroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInternoCadstroActionPerformed
        // TODO add your handling code here:
        if (!flagCadastrar_frame) {
            Cadastrar_frame CF = new Cadastrar_frame();
            painel_principal.add(CF);
            CF.setVisible(true);

            flagCadastrar_frame = true;
            CF.addInternalFrameListener(this);

            CF.setLocation((painel_principal.getSize().width - CF.getSize().width)/2, (painel_principal.getSize().height - CF.getSize().height)/2);
        }
        
    }//GEN-LAST:event_botaoInternoCadstroActionPerformed

    private void botaoSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseClicked
        int rSair = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (rSair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_botaoSairMouseClicked

    private void botaoInternoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInternoListaActionPerformed
        // TODO add your handling code here:
        if (!flagListar_frame) {
            Listar_frame LF = new Listar_frame();
            painel_principal.add(LF);
            LF.setVisible(true);

            flagListar_frame = true;
            LF.addInternalFrameListener(this);

            LF.setLocation((painel_principal.getSize().width - LF.getSize().width)/2, (painel_principal.getSize().height - LF.getSize().height)/2);
        }
        
    }//GEN-LAST:event_botaoInternoListaActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu botaoContato;
    private javax.swing.JMenuItem botaoInternoCadstro;
    private javax.swing.JMenuItem botaoInternoLista;
    private javax.swing.JMenu botaoSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane painel_principal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if (e.getInternalFrame() instanceof Cadastrar_frame) {
            flagCadastrar_frame = false;
        }else
        if (e.getInternalFrame() instanceof Listar_frame) {
            flagListar_frame = false;
        }
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
    }
}

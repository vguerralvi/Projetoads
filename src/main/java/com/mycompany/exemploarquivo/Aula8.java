/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.exemploarquivo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 0022216
 */
public class Aula8 extends javax.swing.JInternalFrame {
    
    public static class roda implements Runnable{
        @Override
        public void run() {
            for (;;) {
                try {
                    Thread.sleep(7000);
                    //System.out.println("User "+user);
                    if(user.error>=3){
                        //user.setActive();
                        //user.setError(0);
                        System.out.println("User "+user);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Aula8.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    static User user;

    class User{
        String user;
        char[] pass;
        int error;

        public User(String user, char[] pass, int error) {
            this.user = user;
            this.pass = pass;
            this.error = error;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public char[] getPass() {
            return pass;
        }
        
        public String getPass_2() {
            int tam = pass.length;
            String r="";
            //System.out.println("-------");
            for (int i = 0; i < tam; i++) {
                r += pass[i];
                //System.out.println(r);
            }
            //System.out.println("XXXXX");
            return r;
        }

        public void setPass(char[] pass) {
            this.pass = pass;
        }

        public int getError() {
            return error;
        }

        public void setError(int error) {
            this.error = error;
        }
        
        public int getActive(){
            if(this.error>=3)
                return 0;
            else
                return 1;
        }
        
        public void setActive(){
            this.error=0;
        }

        @Override
        public String toString() {
            return "User{" + "user=" + user + ", pass=" + getPass_2() + ", error=" + error + '}';
        }
 
        
        
    }
    
    /**
     * Creates new form Aula8
     */
    public Aula8() {
        initComponents();
        char[] senhaSecreta = {'e','3','r','4','T','%','y','6'};
        user = new User("user",senhaSecreta,0);
        
        Thread t;
        roda r;
        r=new roda();
        t=new Thread(r);
        t.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnValidaUser = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnValidaSenha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser_1 = new javax.swing.JTextField();
        pwdPass_1 = new javax.swing.JPasswordField();
        btnOk_1 = new javax.swing.JButton();
        btnCancelar_1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser_2 = new javax.swing.JTextField();
        pwdPass_2 = new javax.swing.JPasswordField();
        btnOk_2 = new javax.swing.JButton();
        btnCancelar_2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUser_3 = new javax.swing.JTextField();
        pwdPass_3 = new javax.swing.JPasswordField();
        btnOk_3 = new javax.swing.JButton();
        btnCancelar_3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbEmpresa = new javax.swing.JComboBox<>();
        btnValidaEmpresa = new javax.swing.JButton();
        bntLimpaCombo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnValidaUser.setText("IF");
        btnValidaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidaUserActionPerformed(evt);
            }
        });

        jLabel1.setText("digite user e clique no botão");

        jLabel2.setText("digite 123 e clique no botão");

        btnValidaSenha.setText("IF");
        btnValidaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidaSenhaActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuário");

        jLabel4.setText("Senha");

        txtUser_1.setText("user");

        pwdPass_1.setText("e3r4T%y6");

        btnOk_1.setBackground(new java.awt.Color(0, 0, 204));
        btnOk_1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk_1.setForeground(new java.awt.Color(255, 255, 255));
        btnOk_1.setText("Ok");
        btnOk_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_1ActionPerformed(evt);
            }
        });

        btnCancelar_1.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar_1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar_1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_1.setText("Cancelar");
        btnCancelar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Login1");

        jLabel6.setText("Usuário");

        jLabel7.setText("Senha");

        txtUser_2.setText("user");

        pwdPass_2.setText("e3r4T%y6");

        btnOk_2.setBackground(new java.awt.Color(0, 0, 204));
        btnOk_2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk_2.setForeground(new java.awt.Color(255, 255, 255));
        btnOk_2.setText("Ok");
        btnOk_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_2ActionPerformed(evt);
            }
        });

        btnCancelar_2.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar_2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar_2.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_2.setText("Cancelar");
        btnCancelar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_2ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("Login2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tesla", "IBM", "nVidia", "Apple", "Google" }));

        jLabel9.setText("Empresa");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setText("Usuário");

        jLabel11.setText("Senha");

        txtUser_3.setText("user");

        pwdPass_3.setText("e3r4T%y6");

        btnOk_3.setBackground(new java.awt.Color(0, 0, 204));
        btnOk_3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOk_3.setForeground(new java.awt.Color(255, 255, 255));
        btnOk_3.setText("Ok");
        btnOk_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk_3ActionPerformed(evt);
            }
        });

        btnCancelar_3.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar_3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar_3.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar_3.setText("Cancelar");
        btnCancelar_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar_3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setText("Login3");

        jLabel13.setText("selecione Google e clique no botão");

        cmbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "IBM", "Google", "Apple", "Meta" }));

        btnValidaEmpresa.setText("IF do ComboBox");
        btnValidaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidaEmpresaActionPerformed(evt);
            }
        });

        bntLimpaCombo.setText("limpa ComboBox");
        bntLimpaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpaComboActionPerformed(evt);
            }
        });

        jButton1.setText("Desbloquear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEmpresa.setText("OK");
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnValidaEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnValidaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnValidaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addComponent(bntLimpaCombo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdPass_1)
                            .addComponent(txtUser_1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnOk_1)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar_1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtUser_2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pwdPass_2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk_2)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar_2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEmpresa)
                        .addGap(111, 111, 111)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdPass_3)
                            .addComponent(txtUser_3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk_3)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelar_3)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtUser_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(pwdPass_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnOk_3)
                                            .addComponent(btnCancelar_3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(txtUser_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(pwdPass_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnOk_2)
                                            .addComponent(btnCancelar_2))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEmpresa)))
                                .addGap(0, 42, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5)
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtUser_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pwdPass_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnOk_1)
                                    .addComponent(btnCancelar_1)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnValidaUser)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnValidaSenha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(cmbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnValidaEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bntLimpaCombo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidaUserActionPerformed
        // TODO add your handling code here:
        String digitou = jTextField1.getText();
        
        if(digitou.equals("user")){
            JOptionPane.showMessageDialog(
                    this, 
                    "Você digitou user");
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Você não digitou user", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnValidaUserActionPerformed

    private void btnValidaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidaSenhaActionPerformed
        // TODO add your handling code here:
        char[] senha = jPasswordField1.getPassword();
        char[] senhaSecreta = {'1','2','3'};
        int result;
        result = Arrays.compare(senha,senhaSecreta);
        
        if(result==0){
            JOptionPane.showMessageDialog(
                    this, 
                    "Você digitou 123");
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Você não digitou 123", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_btnValidaSenhaActionPerformed

    private void btnCancelar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_1ActionPerformed
        // TODO add your handling code here:
        txtUser_1.setText("");
        pwdPass_1.setText("");
    }//GEN-LAST:event_btnCancelar_1ActionPerformed

    private void btnCancelar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_2ActionPerformed

    private void btnCancelar_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelar_3ActionPerformed

    private void btnValidaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidaEmpresaActionPerformed
        // TODO add your handling code here:
        Object empresa = cmbEmpresa.getSelectedItem();
        Object empresaCerta = "Google";
        
        if(empresa.equals(empresaCerta)){
         JOptionPane.showMessageDialog(
                    this, 
                    "Você escolheu Google");
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Você não escolheu Google", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnValidaEmpresaActionPerformed

    private void bntLimpaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpaComboActionPerformed
        // TODO add your handling code here:
        cmbEmpresa.setSelectedIndex(0);
    }//GEN-LAST:event_bntLimpaComboActionPerformed

    private void btnOk_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_1ActionPerformed
        String user = txtUser_1.getText();
        String userSecreto = "user";
        char[] senha = pwdPass_1.getPassword();
        char[] senhaSecreta = {'e','3','r','4','T','%','y','6'};
        
        int result;
        result = Arrays.compare(senha,senhaSecreta);
  
        if( (user.equals(userSecreto)) && (result==0) ){ 
            this.dispose();
            BemVindo tela = new BemVindo();
            Menu.area.add(tela);
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Verifique seu usuário e senha", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOk_1ActionPerformed

    private void btnOk_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_3ActionPerformed
        System.out.println("Ativo "+user.getActive());
        if(user.getActive()==0){
            JOptionPane.showMessageDialog(
                    this, 
                    "Conta Bloqueda", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String userDigitado = txtUser_3.getText();
        char[] senha = pwdPass_3.getPassword();

        int result;
        result = Arrays.compare(senha,user.getPass());
  
        if( (userDigitado.equals(user.user)) && (result==0) ){ 
            this.dispose();
            BemVindo tela = new BemVindo();
            Menu.area.add(tela);
            tela.setVisible(true);
            user.setError(0);
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Verifique seu usuário e senha", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
            user.setError(user.getError()+1);
        }
        
        if(user.getError()>=3){
            
            JOptionPane.showMessageDialog(
                    this, 
                    "Conta BLOQUEADA Temporariamente", 
                    "Titulo", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnOk_3ActionPerformed

    private void btnOk_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk_2ActionPerformed
        // TODO add your handling code here:
        
        String user = txtUser_1.getText();
        String userSecreto = "user";
        
        char[] senha = pwdPass_1.getPassword();
        char[] senhaSecreta = {'e','3','r','4','T','%','y','6'};
        
        int result;
        result = Arrays.compare(senha,senhaSecreta);
        
        String empresa = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        //String empresa = (String) jComboBox1.getSelectedItem();
        String empresaSecreta = "IBM";
  
        if( (user.equals(userSecreto)) && (result==0) && empresa.equals(empresaSecreta)){ 
            this.dispose();
            BemVindo tela = new BemVindo();
            Menu.area.add(tela);
            tela.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(
                    this, 
                    "Verifique seu usuário e senha", 
                    "Titulo", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOk_2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //desbloquear
        user.setActive();
        user.setError(0);
        
        System.out.println("User "+user);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        String user = txtUser_1.getText();
        String userSecreto = "user";
        
        char[] senha = pwdPass_1.getPassword();
        char[] senhaSecreta = {'e','3','r','4','T','%','y','6'};
        
        int result;
        result = Arrays.compare(senha,senhaSecreta);
        
        String empresa = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
        String empresaSecreta = "IBM";
  
        if(empresa.equals(empresaSecreta)){
            if( (user.equals(userSecreto)) && (result==0)){ 
                this.dispose();
                BemVindo tela = new BemVindo();
                Menu.area.add(tela);
                tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(
                        this, 
                        "Verifique seu usuário e senha", 
                        "Titulo", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(
                this, 
                "Verifique a Empresa", 
                "Titulo", 
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEmpresaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntLimpaCombo;
    private javax.swing.JButton btnCancelar_1;
    private javax.swing.JButton btnCancelar_2;
    private javax.swing.JButton btnCancelar_3;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnOk_1;
    private javax.swing.JButton btnOk_2;
    private javax.swing.JButton btnOk_3;
    private javax.swing.JButton btnValidaEmpresa;
    private javax.swing.JButton btnValidaSenha;
    private javax.swing.JButton btnValidaUser;
    private javax.swing.JComboBox<String> cmbEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPasswordField pwdPass_1;
    private javax.swing.JPasswordField pwdPass_2;
    private javax.swing.JPasswordField pwdPass_3;
    private javax.swing.JTextField txtUser_1;
    private javax.swing.JTextField txtUser_2;
    private javax.swing.JTextField txtUser_3;
    // End of variables declaration//GEN-END:variables
}








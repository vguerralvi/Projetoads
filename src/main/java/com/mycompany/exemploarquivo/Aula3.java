/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.exemploarquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author marcelojtelles
 */
public class Aula3 extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Aula3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Contar Linhas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("123456");

        jButton3.setText("Troca vizinha X LETRAS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setText("ABC");

        jTextField3.setText("7");

        jButton4.setText("Troca E por X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Troca pela VIZINHA");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Exemplo RESET");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Troca Letra por chave 1 e 2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton8.setText("Troca Letra por TODAS chaves");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Teste");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Vizinha Anterior");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField4.setText("ZADKGZ UNZ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(51, 51, 51)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(238, 238, 238)
                                .addComponent(jButton9)))
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 237, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(41, 41, 41)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int linhas=0;
        try {
            FileReader reader = new FileReader("passwords.txt");
            BufferedReader leitor = new BufferedReader(reader);
            while(leitor.readLine()!=null)
                linhas++;
        } catch (IOException ex) {
            System.out.println("Erro :"+ex.getMessage());
        }
        System.out.println("Temos "+linhas+" linhas no arquivo");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String valor;
            FileReader reader = new FileReader("passwords.txt");
            BufferedReader leitor = new BufferedReader(reader);
		String busca = jTextField1.getText();
                valor = leitor.readLine();
                while(valor!=null){
                    if(busca.equals(valor)){
                            System.out.println("Achou"); 
                            break;
                    }
                    valor = leitor.readLine();
                }
                 
        } catch (IOException ex) {
            System.out.println("Erro :"+ex.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //letras permitidas
        Character[] associated = new Character[26];
        for (int i = 0; i<26;i++){
            associated[i]=(char)(i+65);
        }
        for (int i = 0; i < 26; i++) {
            System.out.println(associated[i]);
        }
    
        Character charPos;
        int pos=0;
        String result="";
        int key=Integer.parseInt(jTextField3.getText());
        String message = jTextField2.getText();
        for (int i=0;i<message.length();i++){
            charPos=message.charAt(i);
            for (int j=0; j<associated.length;j++){
                //System.out.print(charPos+" ");
                //System.out.println(associated[j]);
                if(charPos.equals(associated[j])){
                    //System.out.print("=================");
                    pos=j+key;
                    if(pos>=26){
                        //System.out.println("k "+key);
                        //System.out.println("j "+j);
                        pos-=26;
                    }
                    result=result+associated[pos];
                }
            }
        }
        System.out.println("String original: " + message);
        System.out.println("String modificada: " + result);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Declaração da string
        String nome = "FEEVALE";

        // Substituição da letra 'E' por 'X'
        String novoNome = nome.replace('E', 'X');

        // Exibição do resultado
        System.out.println("String original: " + nome);
        System.out.println("String modificada: " + novoNome);


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Declaração da string
        String nome = "FEEVALE";

        // Substituição de cada letra pela sua vizinha no alfabeto
        char[] caracteres = nome.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            
            // Determinar o novo caractere
            char novoChar;
            if (c == 'z') {
                novoChar = 'a';
            } else if (c == 'Z') {
                novoChar = 'A';
            } else {
                novoChar = (char) (c + 1);
            }

            // Substituir o caractere no array
            caracteres[i] = novoChar;
        }

        String novoNome = new String(caracteres);

        // Exibição do resultado
        System.out.println("String original: " + nome);
        System.out.println("String modificada: " + novoNome);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         String novoNome = substituirPorVizinho("FEEVALE", 6);

        // Exibição do resultado
        System.out.println("String original: " + "FEEVALE");
        System.out.println("String modificada: " + novoNome);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String chave1 = troca(jTextField2.getText(),1);
        String chave2 = troca(jTextField2.getText(),2);
        jTextArea1.append(chave1);
        jTextArea1.append("\n");
        jTextArea1.append(chave2);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String chavex;
        for (int i = 1; i <= 26; i++) {
            chavex = troca(jTextField2.getText(),i);
            jTextArea1.append(chavex);
            jTextArea1.append("\n");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         // Declaração da string 
        String nome = jTextField2.getText();
        // Substituição de cada letra pela sua vizinha no alfabeto 
        char[] caracteres = nome.toCharArray(); 
        for (int i = 0; i < caracteres.length; i++) { 
            char c = caracteres[i]; 
            // Determinar o novo caractere 
            char novoChar; 
            if (c == 'z') { 
                novoChar = 'b'; 
            } else if (c == 'Z') { 
                novoChar = 'B'; 
            } else if (c == 'y') { 
                novoChar = 'a'; 
            } else if (c == 'Y') { 
                novoChar = 'A'; 
            }
            else { 
                novoChar = (char) (c + 2); 
            } 
            // Substituir o caractere no array 
            caracteres[i] = novoChar; 
        } 
        String novoNome = new String(caracteres); 
        // Exibição do resultado 
        jTextArea1.append("String original: " + nome); 
        jTextArea1.append("\n");
        jTextArea1.append("String modificada: " + novoNome); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String digitou;
        digitou = jTextField2.getText(); //ABC
        for (int i = 0; i < digitou.length(); i++) {
            System.out.println("Letra "+digitou.charAt(i));
            for (int j = 0; j < 26; j++) {
                char k = (char)(65+j);
                char k2 = (char)(65 - 1 + j);
                if(k2<65)
                    k2=(char)(k2+26);
                if(digitou.charAt(i)==k)
                    System.out.println("Trocar por "+k2); 
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public static String troca(String message,int key ){
        //letras permitidas
        Character[] associated = new Character[26];
        for (int i = 0; i<26;i++){
            associated[i]=(char)(i+65);
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.println(associated[i]);
        }
        Character charPos;
        int pos=0;
        String result="";
        for (int i=0;i<message.length();i++){
            charPos=message.charAt(i);
            for (int j=0; j<associated.length;j++){
                //System.out.print(charPos+" ");
                //System.out.println(associated[j]);
                if(charPos.equals(associated[j])){
                    //System.out.print("=================");
                    pos=j+key;
                    if(pos>=26){
                        //System.out.println("k "+key);
                        //System.out.println("j "+j);
                        pos-=26;
                    }
                    result=result+associated[pos];
                }
            }
        }
        return result;
    }
    public static String substituirPorVizinho(String input, int quantidade) {
        char[] caracteres = input.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            
            // Ignorar caracteres não alfabéticos
            if (!Character.isLetter(c)) {
                continue;
            }

            // Determinar o novo caractere
            char novoChar = c;
            for (int j = 0; j < quantidade; j++) {
                if (novoChar == 'z') {
                    novoChar = 'a';
                } else if (novoChar == 'Z') {
                    novoChar = 'A';
                } else {
                    novoChar = (char) (novoChar + 1);
                }
            }

            // Substituir o caractere no array
            caracteres[i] = novoChar;
        }

        return new String(caracteres);
    }
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
            java.util.logging.Logger.getLogger(Aula3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aula3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aula3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aula3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aula3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

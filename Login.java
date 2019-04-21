package snist;

import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame 
{
  public Login() 
{
     
   initComponents();

    @SuppressWarnings("unchecked")

  //GEN-BEGIN:initComponents
  
  private void initComponents() 
     {
     
        jPanel1 = new javax.swing.JPanel();

        jlabelimg = new javax.swing.JLabel();
 
       jPanelloginbx = new javax.swing.JPanel();
  
      jLabellgn = new javax.swing.JLabel();
 
       jLabelpwd = new javax.swing.JLabel();
  
      jTextField1 = new javax.swing.JTextField();
   
     jTextField2 = new javax.swing.JTextField();
   
     jButtonlgn = new javax.swing.JButton();
   
     jPanel2 = new javax.swing.JPanel();
    
    jScrollPane1 = new javax.swing.JScrollPane();
   
     jTextArea1 = new javax.swing.JTextArea();
 
       LOGOUT = new javax.swing.JButton();
   
     jPanelaccsbx = new javax.swing.JPanel();
  
      Attendance = new javax.swing.JButton();
 
       assgnmts = new javax.swing.JButton();
    
    marks = new javax.swing.JButton();

        jButton1 = new javax.swing.JButton();
 
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
    getContentPane().setLayout(new java.awt.CardLayout());
 
      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
      
  jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    
    jPanel1.setNextFocusableComponent(jButtonlgn);
    
    jPanel1.setPreferredSize(new java.awt.Dimension(600, 525));
  
      jlabelimg.setFont(new java.awt.Font("Tahoma", 1, 24)); 

jlabelimg.setIcon(newjavax.swing.ImageIcon(getClass().getResource("/snist/simg5694c71250529.jpg"))); 

       jPanelloginbx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

  jLabellgn.setText("Login");
  
  jLabelpwd.setText("password");
 
   jTextField1.addActionListener(new java.awt.event.ActionListener() 
{
   public void actionPerformed(java.awt.event.ActionEvent evt) 
         {
         jTextField1ActionPerformed(evt);
   
         }
      });

 
  jTextField2.addActionListener(new java.awt.event.ActionListener() 
{
  
          public void actionPerformed(java.awt.event.ActionEvent evt) 
                  {
                             jTextField2ActionPerformed(evt);
                      }
 });

 
  jButtonlgn.setText("Login");
  
  jButtonlgn.addActionListener(new java.awt.event.ActionListener() 
{
    public void actionPerformed(java.awt.event.ActionEvent evt)
 {
  jButtonlgnActionPerformed(evt);  
  }
});
      
 javax.swing.GroupLayout jPanelloginbxLayout = new javax.swing.GroupLayout(jPanelloginbx);
       
 jPanelloginbx.setLayout(jPanelloginbxLayout);

jPanelloginbxLayout.setHorizontalGroup(

  jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGrouP(jPanelloginbxLayout.createSequentialGroup()
.addGroup(jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanelloginbxLayout.createSequentialGroup() .addGap(21,21,21).addGroup(jPanelloginbxLayout.createParallelGroup
(javax.swing.GroupLayout.Alignment.LEADING, false) .addComponent(jLabelpwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) .addComponent(jLabellgn, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
.addGroup(jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 .addGroup(jPanelloginbxLayout.createSequentialGroup().addGap(18, 18, 18)
 .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101,javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelloginbxLayout.createSequentialGroup() .addGap(18, 18, 18) .addComponent
(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
 .addGroup(jPanelloginbxLayout.createSequentialGroup()   

             .addGap(64, 64, 64)
                        .addComponent(jButtonlgn)))
                .addContainerGap(548, Short.MAX_VALUE))
        );
  

      jPanelloginbxLayout.setVerticalGroup(
            jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelloginbxLayout.createSequentialGroup().addGap(22, 22, 22)
   .addGroup(jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
    .addComponent(jLabellgn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE) .addComponent(jTextField1, 
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap
(javax.swing.LayoutStyle.ComponentPlacement.RELATED)            .addGroup(jPanelloginbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)               
.addComponent(jLabelpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jTextField2, 
javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 .addPreferredGap
(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
 .addComponent(jButtonlgn)
 .addContainerGap(17, Short.MAX_VALUE))
 );

   

 
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       

 jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabelimg, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
   .addGap(297, 297, 297)
                .addComponent(jPanelloginbx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(426, 426, 

426))
        );
    

 
   jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup

(jPanel1Layout.createSequentialGroup()
                .addComponent(jlabelimg, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addPreferredGap

(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelloginbx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 

Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

  

      getContentPane().add(jPanel1, "card2");

   
     jPanel2.setPreferredSize(new java.awt.Dimension(1000, 529));
   
     jTextArea1.setColumns(20);
   
     jTextArea1.setRows(5);
  
      jTextArea1.setWrapStyleWord(true);
     
   jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
   
     jScrollPane1.setViewportView(jTextArea1);
   
     LOGOUT.setText("LOGOUT");
 
       LOGOUT.addActionListener(new java.awt.event.ActionListener()
 {
          public void actionPerformed(java.awt.event.ActionEvent evt) 
        {
              LOGOUTActionPerformed(evt);
       }
});

     jPanelaccsbx.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

     Attendance.setText("ATTENDENCE");
     
   Attendance.addActionListener(new java.awt.event.ActionListener() 
{
    public void actionPerformed(java.awt.event.ActionEvent evt) 
                 {
                     AttendanceActionPerformed(evt);
                 }
          });

    assgnmts.setText("ASSIGNNMENTS");

   marks.setText("MARKS");
     
   marks.addActionListener(new java.awt.event.ActionListener() 
    { 
          public void actionPerformed(java.awt.event.ActionEvent evt) {
                marksActionPerformed(evt);
   }
 });
jButton1.setText("PROFILE");
  
      jButton1.addActionListener(new java.awt.event.ActionListener()
      {
     public void actionPerformed(java.awt.event.ActionEvent evt) 
        { 
            jButton1ActionPerformed(evt);
      }
  });
  javax.swing.GroupLayout jPanelaccsbxLayout = new javax.swing.GroupLayout(jPanelaccsbx);
    
    jPanelaccsbx.setLayout(jPanelaccsbxLayout);

        jPanelaccsbxLayout.setHorizontalGroup(
            jPanelaccsbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup
(jPanelaccsbxLayout.createSequentialGroup()
                .addContainerGap()
   .addGroup(jPanelaccsbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, 
false)
  .addComponent(marks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(Attendance, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 .addComponent(assgnmts, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
  );
     

  
 jPanelaccsbxLayout.setVerticalGroup(
            jPanelaccsbxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelaccsbxLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(marks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Attendance)
                .addPreferredGap
(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assgnmts)
                .addContainerGap(113, Short.MAX_VALUE))
 );

     
   javax.swing.GroupLayout 

jPanel2Layout = new javax.swing.GroupLayout(jPanel2);

    jPanel2.setLayout(jPanel2Layout);
    
jPanel2Layout.setHorizontalGroup(

            jPanel2Layout.createParallelGroup

(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
   .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
  .addGroup(jPanel2Layout.createSequentialGroup()
  .addContainerGap()
  .addComponent(jPanelaccsbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
   .addGap(42, 42, 42)
   .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
    .addGroup
(jPanel2Layout.createSequentialGroup()
     .addGap(678, 678, 678)
     .addComponent(LOGOUT)))
     .addContainerGap(714, Short.MAX_VALUE))
   );
      
  



jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
       .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, 
jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanelaccsbx, javax.swing.GroupLayout.PREFERRED_SIZE, 
javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGap(248, 248, 248))
            .addGroup(jPanel2Layout.createSequentialGroup()
          .addGap(16, 16, 16)
                .addComponent(LOGOUT)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, 

javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );


   
     getContentPane().add(jPanel2, "card3");
    pack();
    
}
//GEN-END:initComponents
    

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) 
{
//GEN-FIRST:event_jTextField1ActionPerformed
    s1=jTextField1.getText();
    }

//GEN-LAST:event_jTextField1ActionPerformed

    
  private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) 
       {//GEN-FIRST:event_jTextField2ActionPerformed
      s2=jTextField2.getText();

    }//GEN-LAST:event_jTextField2ActionPerformed

   
private void jButtonlgnActionPerformed(java.awt.event.ActionEvent evt)
 {//GEN-FIRST:event_jButtonlgnActionPerformed
        
       s1=jTextField1.getText();
        s2=jTextField2.getText();
        
    if(("a".equals(s1))&&("1".equals(s2)))
    {    
            JOptionPane.showMessageDialog(null,"logged in as a","",JOptionPane.INFORMATION_MESSAGE);

Panelloginbx.setVisible(false);
   
 jlabelimg.setVisible(false);
    jPanel2.setVisible(true);
  
  jPanelaccsbx.setVisible(true);
  
   getContentPane().nextFocus(); 
  
  }
 
  else if(("b".equals(s1))&&("2".equals(s2)))
   
      {
      
       JOptionPane.showMessageDialog(null,"logged in as b","",JOptionPane.INFORMATION_MESSAGE);
    
       getContentPane().nextFocus();
 
        }
   
  else
 
    {
      JOptionPane.showMessageDialog(null,"invalid id and password","",JOptionPane.ERROR_MESSAGE);
    }
   
 }//GEN-LAST:event_jButtonlgnActionPerformed
  
  private void marksActionPerformed(java.awt.event.ActionEvent evt) 
{//GEN-FIRST:event_marksActionPerformed
      
  s1=jTextField1.getText();
     
   s2=jTextField2.getText();
    
      if("a".equals(s1)){  
 
       String str1 = "\t MARKS:\n\tjava = 58\n\t stld =67\n\t EELE=67 \n\t MFCS=75 \n\tEECE=68 ";
 
      jTextArea1.setText(str1);  
       }
//GEN-LAST:event_marksActionPerformed
 
         else if("b".equals(s1))
       {
    String str1 = "\tjava = 68\n\t stld =88\n\t EELE=77 \n\t MFCS=75 \n\tEECE=78  ";
 
            jTextArea1.setText(str1);    
      
        }
 }
 private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) 
{
//GEN-FIRST:event_AttendanceActionPerformed
       
   String str2= "\tATTENDENCE:\n\toopj=52%\n\tstld=65%\n\tEECE=87%\n\tEELE=67%\n\tFCWE=65%";
    
   jTextArea1.setText(str2);
    }
//GEN-LAST:event_AttendanceActionPerformed
 
  private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) 
{//GEN-FIRST:event_LOGOUTActionPerformed

  jPanel1.setVisible(true);

  jPanel2.setVisible(false);

 JOptionPane.showMessageDialog(null,"logged OFF","",JOptionPane.INFORMATION_MESSAGE);
}
//GEN-LAST:event_LOGOUTActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
 {
//GEN-FIRST:event_jButton1ActionPerformed
     
   String str2= "\t Name: Ajith\n\tRoll no.:580\n\tclass:B\n\tdept:cse";
   
     jTextArea1.setText(str2);

  }//GEN-LAST:event_jButton1ActionPerformed

//GEN-BEGIN:variables
 
   private javax.swing.JButton Attendance;

    private javax.swing.JButton LOGOUT;
  
  private javax.swing.JButton assgnmts;
 
   private javax.swing.JButton jButton1;
  
  private javax.swing.JButton jButtonlgn;
    
private javax.swing.JLabel jLabellgn;
   
 private javax.swing.JLabel jLabelpwd;
  
  private javax.swing.JPanel jPanel1;
   
 private javax.swing.JPanel jPanel2;
  
  private javax.swing.JPanel jPanelaccsbx;
 
   private javax.swing.JPanel jPanelloginbx;
  
  private javax.swing.JScrollPane jScrollPane1;
  
  private javax.swing.JTextArea jTextArea1;
   
 private javax.swing.JTextField jTextField1;
 
   private javax.swing.JTextField jTextField2;
 
   private javax.swing.JLabel jlabelimg;
 
   private javax.swing.JButton marks;
   
 // End of variables declaration
//GEN-END:variables

public String s1;

public String s2;


}
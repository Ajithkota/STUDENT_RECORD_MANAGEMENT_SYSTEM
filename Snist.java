
package snist;

public class SNIST {

    public static void main(String[] args) {

  Student s;
    s= new Student();    
    
    s.name="a";
    s.pwd="1";
       java.awt.EventQueue.invokeLater(() -> {
           new Login().setVisible(true);
       });
    }
    
}
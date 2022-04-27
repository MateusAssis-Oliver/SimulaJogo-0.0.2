import javax.swing.JOptionPane;

public class StdIo {
 
    
    static int lerInt( String i ) {

        try {
            
            int num = Integer.parseInt(i);
            return num;

        }
        catch (NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, "Valor Invalido ", "ERRO", JOptionPane.ERROR_MESSAGE);
            
            return -1;
        }

        

    }


    static String blocoSmsInput( String message ){
        
       String sms =  JOptionPane.showInputDialog(null, message);
        return sms;
    }
    static void blocoSms(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}

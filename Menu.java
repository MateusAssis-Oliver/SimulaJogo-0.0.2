import javax.swing.JOptionPane;

public class Menu {
    
    public static int statMenu(){

        /* Lealt MENU */
       String opc = JOptionPane.showInputDialog(null, " 1 - Cadastrar Times \n 2 – Simular Jogos  \n 3 – Sair \n 4 - Mostar Times ");
        
       /* Valida Opção selecionada */ 
       return StdIo.lerInt(opc);
    }
}

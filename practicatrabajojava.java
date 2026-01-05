import javax.swing.JFrame;
import javax.swing.JOptionPane;
public static pedirNum(){
	String frase=JOptionPane.showInputDialog("Número a alcanzar: ");
        int num=Integer.parseInt(frase);
        // Comprobación para saber si el num a alcanzar es potencia de 2 o potencia en miles
        while (num%2!=0){
            frase=JOptionPane.showInputDialog("Vuelva a introducir el número a alcanzar: ");
            num=Integer.parseInt(frase);
        }
}
public class practicatrabajojava {
    public static void main(String[] args) {
		int num=pedirNum();
        Tablero mi_tablero=new Tablero();
        // Código del archivo adjutando
        JFrame app = new JFrame("Tablero");
		
		String entrada= JOptionPane.showInputDialog("Filas:");
		int filas=Integer.parseInt(entrada);

		String salida=String.format("Has elegido %d filas", filas);
        JOptionPane.showMessageDialog(null, salida);

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setBounds(100, 100, 440, 470);
		app.add(mi_tablero);
		app.setVisible(true);
    }
}



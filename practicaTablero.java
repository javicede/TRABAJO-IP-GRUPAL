import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
public class practicaTablero {
    // El tablero tiene que ser 7x5
    private static int filas=7;
    private static int columnas=5;
    // Dimensiones de cada celda, un cuadrado
    private static int ancho_celda=80;
    private static int altura_celda=80;
    // Además, añadiremos una pequeña distancia entre las celdas
    private static int margen_horizontal=10;
    private static int margen_vertical=10;
    // Objetivo
    private int objetivo;
    // Matriz del juego, las casillas
    private int[][] casillas;
    // Al hacer "click", se elimina la fila y la columna seleccionada
    private int fila_seleccionada=-1;
    private int columna_seleccionada=-1;
    // Por defecto, la selección va a ser falsa
    private boolean selección=false;

    // Constructores
    practicaTablero(int objetivo){
        this.objetivo=objetivo;
        this.casillas=new int[filas][columnas];

        inicializarTablero();
        addMouseListener(new MouseHandler());
    }
    // Empieza el programa con solo las 2 filas de abajo, tienen valores aleatorios
    private void inicializarTablero(){
        Random rand=new Random();
        int[] valores_posibles={2,4,8,16,32};
        for (int f=filas-2;f<filas;f++){
            for(int c=0;c<columnas;c++){
                // Valor al azar
                casillas[f][c]=valores_posibles[rand.nextInt(valores_posibles.length)];
            }
        }
        imprimirTableroConsola();
    }
    public void paintComponent(Graphics g){
    // Falta graficar la tabla y más código
    // Este código fue gracias a Gemini y al trabajo interminable del Sr.Javier JSSAJJDA broma
    }
}


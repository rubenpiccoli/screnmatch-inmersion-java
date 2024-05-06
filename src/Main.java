import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos a la Inmversión en Java");
        //System.out.println("Pelicula Matrix");

        // Declaracion de Variables
        int fehcaDeLanzamiento = 1999;
        double evaluacion=4.5;
        boolean incluidoEnElPlanBasico=true;
        String nombre="Matrix";
        String sinopsis= """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario =  0;

        System.out.println("Pelicula: "+nombre);
        System.out.println("Fecha de Lazamiento: "+fehcaDeLanzamiento);
        System.out.println("Evaluación: "+evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvalucion= (4.5 + 4.8 + 3) / 3 ;
        System.out.println("Media de la Evaluación de Matrix: "+mediaEvalucion);

        if(fehcaDeLanzamiento > 2023){
            System.out.println("Pelicula Popular en el momento");
        }else{
            System.out.println("Pelicula Retro que vale la Pena Ver");
        }
        for (int i = 0; i < 3; i++) {

            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix?");
            Double notaMatrix=teclado.nextDouble();
            mediaEvaluacionUsuario =(mediaEvaluacionUsuario + notaMatrix);
        }
        System.out.println("La media de la pelicula Matrix" +
                " calculada por el usuario es: " + mediaEvaluacionUsuario/3);
    }
}
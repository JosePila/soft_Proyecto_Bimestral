package ec.edu.epn.git.tutoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        /*
        ArrayList<Estudiante> estudiantes = new ArrayList();
        Estudiante est = new Estudiante(0, "valeria", "24/12/1997", "valeria@epn","Estudios Sociales","001");
        Estudiante est1 = new Estudiante(1, "brigitte", "24/02/1990", "brigitte@epn","Estudios Sociales","001");


        estudiantes.add(est);
        estudiantes.add(est1);

        if(menu()== 1)
        {
            if(usuarioRegistrado()) //si esta registrado
            {

                if(est.existeEstudiante(estudiantes, login()[0]) != -1)
                {
                    Examen ex = new Examen();
                    ex.completarExamen();
                    ex.obtenerNota();
                }
                else
                    System.out.println("Usuario no registrado");
            }
        }

         */
    }


    public static String[] login()
    {
        Scanner teclado = new Scanner(System.in);
        String[] valoresEntrada = new String[2];

        System.out.println("\t=================================");
        System.out.println("\t-------------Login---------------");
        System.out.println("Ingrese su nombre");
        valoresEntrada[0]=teclado.nextLine();
        System.out.println("Ingrese su email");
        valoresEntrada[1]=teclado.nextLine();

        return valoresEntrada;
    }

    public static int menu()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\t=================================");
        System.out.println("\t-----------TuAcademy!------------");
        System.out.println("\t------------ M e n u ------------");
        System.out.println("1)Rendir Examen");
        System.out.println("\n2)Agendar una tutoria");

        return 1;
       // "Integer.parseInt(teclado.nextLine());"
    }

    public static boolean usuarioRegistrado()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\t=================================");
        System.out.println("¿Se encuentra usted registrado en TuAcademY?");
        System.out.println("0) Si\n1) No");

        return (teclado.nextInt()==0);
    }
}

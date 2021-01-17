package ec.edu.epn.git.tutoria;

import java.util.Scanner;

public class Curso {
    public String tipo[][];

    public Curso()
    {
        registrarCurso();
    }

    public String[][] getTipo() {
        return tipo;
    }

    public Curso(String materia, String codigo) {
        this.tipo = new String[1][2];
        this.tipo[0][0]= materia;
        this.tipo[0][1]= codigo;
    }


    public void registrarCurso()
    {
        Scanner teclado = new Scanner(System.in);
        String salida="";

        System.out.println("==================================");
        System.out.println("\tBienvenid@ a TuAcademy!\n\tSeleccione un curso para inscribirse");
        System.out.println("1) Estudios Sociales");
        System.out.println("Opción:  ");

        salida="1";
    //teclado.nextLine();
        switch (salida)
        {
            case ("1"):
                this.tipo = new String[1][2];
                this.tipo[0][0]= "Estudios Sociales";
                this.tipo[0][1]= "001";
                break;

        }
    }
    public String consultaTutor(String materia) {
        String tutor ="";
        if (materia.equals("ICR222")) {
            tutor = "Jaime Gonzales";
        }
        return tutor;
    }
}

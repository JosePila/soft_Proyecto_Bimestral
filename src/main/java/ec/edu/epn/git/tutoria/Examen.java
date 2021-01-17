package ec.edu.epn.git.tutoria;

import java.util.Scanner;

public class Examen {
    Pregunta pa;
    String selecciones [];
    public Examen() throws InterruptedException{
        pa = new Pregunta();
        this.selecciones= new String[10];
    }
    public String[] completarExamen(){
        String cadena="",opcion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("\t=================================");
        System.out.println("\t-----Examen Estudios Sociales----");

        for(int i = 0; i<10;i++ ){
            System.out.println("--------------- Pregunta "+(i+1)+" ---------------");
            cadena+= pa.generarPregunta(i);
            System.out.println(cadena);
            cadena ="";
            System.out.println("Respuesta:  ");
            opcion=teclado.nextLine();
            if(pa.validarIngreso(opcion)){
                selecciones[i]=opcion;}
            else{
                System.out.println("\nRespuesta ingresada invalida Ingrese nuevamente\n");
                i=i-1;
            }
        }
        return selecciones;
    }
    public void obtenerNota(){
        int nota;
        nota = pa.validarNota(selecciones);
        System.out.println("\nNota es: "+nota+"/10");
    }
}

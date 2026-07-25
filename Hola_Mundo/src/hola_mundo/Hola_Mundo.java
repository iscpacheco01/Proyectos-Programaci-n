/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

/**
 *
 * @author Javier Isaac Pacheco
 */
public class Hola_Mundo {

    //comentario de una sola linea
    //esto tambien debe ser un comentario
    /*
       Pleca asterisco -> para abrir bloque
       Asterisco pleca -> Para cerrar bloque
       todo lo que este entre ello, se toma como comentario
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //sensible a mayusculas - minusculas
        /*
            Objetivo
        1. Imprimir en la Pantalla
            a.diferentes formas par apoder imprimir en pantalla
            b.caracteres de escape
        2. captura de datos por parte de el usuario.
        */
        
        System.out.println("Hola....como estas!!");
        System.out.println("este es mi primer programa");
        System.out.println("yujuuu...estoy con Java");
        
        System.out.println("");
        System.out.print("Isaac Pacheco ");
        System.out.print("soy el alumno de progra ");
        System.out.print("mucho gusto");
        
        System.out.println("");
        System.out.printf("Esta es la clase de %S \n","programacion");
        //System.out.println("");
        
        System.out.printf("Esta es %S la clase de\n","programacion");
        //System.out.println("");
        
        System.out.printf("%S Esta es la clase de\n","programacion");
        //System.out.println("");
        
        System.out.printf("Hola \n Como \n estas \n en la clase %s\n?","Programacaion");
        System.out.printf("Hola \t Como \t estas \t en la clase %s\t?","Programacaion");
        
        System.out.println("");
        
        //variables
        int tiempo; //tipo Entero
        double promedio; //tipo decimal
        String nombre; //tipo de cadena
        char inicial; //tipo de caracter -> Letra, digitonumerico, simbolo especial
        boolean estado; //tipo de boolean -> true (verdadero) / false (falso)
        
        tiempo = 3;
        nombre = "Isaac";
        inicial = 'I';
        
        System.out.printf("Tu nombre es: %S \n", nombre);
        System.out.printf("%d veces a la semana que recibes la clase \n", tiempo);
        System.out.printf("Te llamare %c inicial", inicial);
        
    }//Fin de la funcion Main
    
}//Fin de la clase hola mundo




//JORGE DANIEL DEL ANGEL BOMBARIDER
//A01410409
//IMT

package spp.jdelangelb.t01.p1;
import java.util.Scanner;

public class SPPJDELANGELBT01P1 {

    public static void main(String[] args) {
        System.out.println("Calculadora de promedios");
        
     //Declaracion de variables 
        int matricula;
        double c1, c2, c3, c4, c5, pro;
        String res;
        
    //Indicar que nececitamos llamar al teclado pa que jale
        Scanner kb = new Scanner (System.in);
                
     //Que empieze el juego
        System.out.println("Introduce tu matricula");  
        matricula = kb.nextInt();
        
        System.out.println("Introduce tu primera calificacion");
        c1 =kb.nextDouble();
        
        System.out.println("Introduce tu segunda calificacion ");
        c2 =kb.nextDouble();
        
        System.out.println("Indroduce tu tercera calificacion");
        c3 =kb.nextDouble();
        
        System.out.println("Introduce tu cuarta calificacion");
        c4 =kb.nextDouble();
        
        System.out.println("Introduce tu quinta calificacion");
        c5=kb.nextDouble();
        
    //Sacamos el promedio
        pro= (c1+c2+c3+c4+c5)/5;
    
    //Condicionales 
    
        if(pro>= 7.0){
            res="Aprobado";
        }
        
        else {
            res="Reprobado";
        }
            
    //Mostramos los resultados
        System.out.println(res + pro);
       
        
        
        
        
        
    }
    
}

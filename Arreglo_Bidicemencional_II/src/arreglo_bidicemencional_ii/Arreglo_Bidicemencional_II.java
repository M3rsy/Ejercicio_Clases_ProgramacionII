package arreglo_bidicemencional_ii;
import java.util.Scanner;
public class Arreglo_Bidicemencional_II {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Scanner otro_entrada = new Scanner (System.in);
        // TODO code application logic here
        int cl=0,cc=0,tnotas=0,localizado=0;
        float p=0.0f;
        String Nomestu="";
        int[][]notas = new int[3][4];
        String[]estudiantes = new String[3];
        //PROCEDIMIENTO DE INGRESO DE ESTUDIANTES
        System.out.println("INGRESANDO ESTUDIANTES AL ARREGLO");
        System.out.println("---------------------------------");
        for (int i=0;i<estudiantes.length;i++){
          cl=cl+1;
          System.out.print("Ingrese el nombre del estudiante "+cl+": ");
          estudiantes[i]=entrada.nextLine();
        }
        
        System.out.println("PROGRAMA DE INGRESO DE NOTAS");
        System.out.println("----------------------------");
        for (int i=0;i<notas.length;i++){
            System.out.println("Ingrese las notas del estudiante "+estudiantes[i]+": ");
            cc=0;
            for (int j=0;j<4;j++){
                cc=cc+1;
                System.out.print("Ingrese la nota "+cc+": ");
                notas[i][j]= entrada.nextInt();
            }
        }
//PROCESO DE CONSULTA DE PROMEDIO DE UN ESTUDIANTE
        System.out.println("CONSULTAR EL PROMEDIO DE UN ESTUDIANTE");
        System.out.println("--------------------------------------");
        System.out.println("Ingrese el nombre del estudiante a consultar: ");
        Nomestu = otro_entrada.nextLine();
        for (int i=0;i<estudiantes.length;i++){
            if (estudiantes[i].equals(Nomestu)){
                localizado = i;
            }
    }
//PROCESO DE CALCULO DE PROMEDIO POR ESTUDIANTE
        cl=0;
        for (int i=0;i<notas.length;i++){
            if (localizado==i){
                cl=cl+1;
                tnotas=0;
                for (int j=0;j<4;j++){
                    tnotas=tnotas+notas[i][j];
                }
                p = tnotas/4;
                System.out.println("El promedio del estudiante "+estudiantes[localizado]+" es de : "+p);
            }
        }
    }
    
}

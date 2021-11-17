package alvaro;
import java.util.Random;

/**
 *
 * @author alvaro
 */
public class Normal {
    public static void main(String[] args) {
        //--------------VARIABLES-----------
    int num1;
    int num2;
    int num3;
    int num4;
    
    //--------------IMPORTADO-----------
    Random numAleatorio = new Random();
    //----------------------------------
    //do{
        num1 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num2 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num3 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num4 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        
        System.out.println(num1+num2+num3+num4);
        
    //}while((num1>=0 || num1<=9) && (num2>=0 || num2<=9) && (num3>=0 || num3<=9) && (num4>=0 || num4<=9));
   
       // ((num1>=0 || num1<=9) && (num2>=0 || num2<=9) && (num3>=0 || num3<=9) && (num4>=0 || num4<=9))
    
    }
    

}

/*

private static void NumerosAleatorios(int num1,int num2, int num3, int num4){
    //variables
        
        
        
    Random numAleatorio = new Random();
        num1 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num2 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num3 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        num4 = numAleatorio.nextInt(9 - 0 + 1) + 0;
        

}
 */
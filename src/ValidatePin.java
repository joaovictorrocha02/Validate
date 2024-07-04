import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        
       //O cliente deve informar um pin bancário válido 
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Insira um pin válido: ");
        int pin = 124500;  //Pin válido
        int num = keyboard.nextInt();
        
        while (num <= 124500){
             
            System.out.println("O pin está correto, sua conta será liberada!");
            num = keyboard.nextInt();
        } 
        
        System.out.println("Tente novamente: ");
       
       
        /*Caso o valor do pin não esteja certo,o loop continuará
        até que o valor do pin esteja correto
        */
        
        
    }
}

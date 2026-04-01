import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        System.out.println("Ingrese texto");
        String texto1 = new Scanner(System.in).nextLine();
        String texto2 = "";
        String texto3 = "";
        //Quitar los espacios del texto
        for (int i=0; i<texto1.length(); i++){
            if (texto1.charAt(i) != ' '){
                texto2 = texto2 + texto1.charAt(i);
            }
        }

        for (int j=texto1.length(); j>=1; j=j-1){
            if (texto1.charAt(j) != ' '){
                texto3 = texto3 + texto1.charAt(j);
                System.out.println(texto3);
            }
        }

        if (texto2.equals(texto3)){
            System.out.println("El texto ("+ texto1 + ") es palindromo");
        }
        else {
            System.out.println("El texto ("+ texto1 + ") no es palindromo");
        }

    }
}

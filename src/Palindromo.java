import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        System.out.println("Ingrese texto");
        String texto1 = new Scanner(System.in).nextLine();
        String texto2 = "";
        String texto3 = "";
        for (int i=0; i<texto1.length(); i++){
            if (texto1.charAt(i) != ' '){
                texto2 = texto2 + texto1.charAt(i);
                System.out.println(texto2);
            }
        }

        for (int j=texto1.length();j<1; j--){
            if (texto1.charAt(j) != ' '){
                texto3 = texto3 + texto1.charAt(j);
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

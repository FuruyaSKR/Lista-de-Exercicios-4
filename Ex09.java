import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex09 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String str = null;
        String c = null;
        String chars ="bcdfghjklmnpqrstvwxyz"
                    + "aeiou";
        String cons = "bcdfghjklmnpqrstvwxyz";

        System.out.println("Qual é o tamanho da senha?");
        int length = entrada.nextInt();

        if(length%2==0) {

            str = new Random().ints(length, 0, chars.length())
                    .mapToObj(i -> "" + chars.charAt(i))
                    .collect(Collectors.joining());
        }
        else {
            str = new Random().ints(length-1, 0, chars.length())
                              .mapToObj(i -> "" + chars.charAt(i))
                              .collect(Collectors.joining());

            c = new Random().ints(1, 0, cons.length())
                    .mapToObj(i -> "" + cons.charAt(i))
                    .collect(Collectors.joining());

            System.out.print(str);
            System.out.print(c);
        }

        System.out.println(str);

        entrada.close();
    }

}
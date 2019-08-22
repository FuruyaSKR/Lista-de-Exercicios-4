import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] a =new int[10];
        int [] b = new int[10];
        int [] c = new int[20];
        System.out.print("Informe os valores do primeiro vetor: \n");
        for(int i= 0; i<10;i++) {
            System.out.print("-->");
            a[i]=entrada.nextInt();
        }
        System.out.print("Informe os valores do segundo vetor: \n");
        for(int i= 0; i<10;i++) {
            System.out.print("-->");
            b[i]=entrada.nextInt();
        }
        for(int i = 0;i<10; i++) {
                c[i*2]=a[i];

        }
        for(int i = 0;i<10; i++) {
            c[i*2+1]=b[i];

    }
        System.out.println("Saida dos valores do terceiro vetor: ");
        for(int i =0;i<20;i++) {

            System.out.println(c[i]);
        }
        entrada.close();
    }

}
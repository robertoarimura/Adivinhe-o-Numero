import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int chute;
        int tentativas = 0;
        int min = 1;
        int max = 100;
        int randomNum = random.nextInt(min, max + 1);

        System.out.print("Adivinhe o número");

        System.out.printf("Adivinhe um número entre %d e %d:\n", min, max);

        do{
            System.out.print("Informe um número: ");
            chute = sc.nextInt();
            tentativas++;
            if(chute < randomNum){
                System.out.println("Muito baixo, tente novamente!");
            }else if (chute > randomNum) {
                System.out.println("Muito alto, tente novamente!");
            }else{
                System.out.println("ACERTOU! O número era: " + randomNum);
                System.out.println("Você tentou " + tentativas + " vezes");
            }
        }while(chute != randomNum);

        System.out.println("Você ganhou!");

        sc.close();
    }
}

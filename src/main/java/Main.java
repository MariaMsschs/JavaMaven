import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite: ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("par");
        }
        else{
            System.out.println("impar");
        }

        System.out.println("Eu amo devops");
    }
}
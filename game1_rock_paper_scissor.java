import java.util.Random;
import java.util.Scanner;
public class game1_rock_paper_scissor {
    public static void main(String[] args){
        Random rand = new Random();
        int c = rand.nextInt(3);
        System.out.println("Make a choice");
        System.out.println("For 'rock' choose 0");
        System.out.println("For 'paper' choose 1");
        System.out.println("For 'scissor' choose 2");
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        System.out.println("\n");
        switch(u){
            case 0->{
                System.out.println("You choosed Rock");
            }
            case 1->{
                System.out.println("You choosed Paper");
            }
            case 2->{
                System.out.println("You choosed Scissor");
            }
            default->{
                System.out.println("Invalid choice");
            }
        }
        // 0->rock
        // 1->paper
        // 2->scissor
        if(c == 0){
            System.out.println("Computer choosed Rock\n");
            if(u == 0){
                System.out.println("It's a draw");
            }
            else if(u == 1){
                System.out.println("yaayyyy!!!!, you won");
            }
            else{
                System.out.println("oops!!!, you lost");
            }
        }
        if(c == 1){
            System.out.println("Computer choosed Paper\n");
            if(u == 0){
                System.out.println("oops!!!, you lost");
            }
            else if(u == 1){
                System.out.println("It's a draw");
            }
            else{
                System.out.println("yaayyyy!!!!, you won");
            }
        }
        if(c == 2){
            System.out.println("Computer choosed Scissor\n");
            if(u == 0){
                System.out.println("yaayyyy!!!!, you won");
            }
            else if(u == 1){
                System.out.println("oops!!!, you lost");
            }
            else{
                System.out.println("It's a draw");
            }
        }
        System.out.println("\nThank you for playing");


    }
}

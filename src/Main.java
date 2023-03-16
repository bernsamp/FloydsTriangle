import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int number = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for Floyd's Triangle:");
        int rows = sc.nextInt();

        System.out.println("Floyd's triangle");
        System.out.println("****************");

        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
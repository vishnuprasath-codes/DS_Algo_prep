/* Write a program to take x and print multiples of x till 1000.

Input:

100

Expected Output:

100

200

300

400

500

600

700

800

900

1000*/
import java.util.Scanner;
public class multiple {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(int i=num;i<=1000; i+=num){
            System.out.println(i);

        }
        input.close();
    }
    
}

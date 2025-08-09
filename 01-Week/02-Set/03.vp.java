/*Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

vishnu

prasath

5

Expected output:

vishnuprasath
vishnuprasath
vishnuprasath
vishnuprasath
vishnuprasath


Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has vishnuprasath printed 5 times. */
import java.util.Scanner;
public class vp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String fname=input.next();
        String lname=input.next();
        int num=input.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(fname+lname);

        }
        input.close();


    }
    
}

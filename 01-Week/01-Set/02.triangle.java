/*Write a program to check whether a triangle can be formed with the given values for the angles.

If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

Input: 45 45 45

Expected Output: 

Triangle cannot be formed

Explanation -> We are getting 3 inputs, that is three angles of triangle, but here the sum of three angles that is 45+45+45 is not equal to 180 so Triangle cannot be formed is the output. */

import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int angle1= input.nextInt();
        int angle2=input.nextInt();
        int angle3=input.nextInt();
        
        if (angle1+angle2+angle3==180){
            System.out.println("triangle can be formed");
        }
        else{
            System.out.println("triange cant be formed");
        }
        input.close();
    }
}

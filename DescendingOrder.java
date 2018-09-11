import java.util.*;
import java.io.*;

class DescendingOrder{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] temp=s.toCharArray();
        Arrays.sort(temp);
        char t;
        int sum=0;
        for(int i=0,j=temp.length-1;i<temp.length/2;i++,j--)
        {
            t=temp[i];
            temp[i]=temp[j];
            temp[j]=t;
        }
        for(int i=0;i<temp.length;i++) {
            if ((temp[i] - '0') % 2 == 0)
                sum += temp[i] - '0';
        }
        System.out.print("Sorted number in non increasing order: " );
        System.out.print(temp);
        System.out.println("");
        System.out.println("Sum of Even numbers: "+ sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.print("False");
    }
}
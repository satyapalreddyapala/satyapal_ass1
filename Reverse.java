import java.util.*;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] s=str.toCharArray();
        char temp;
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        System.out.print(s);
    }
}
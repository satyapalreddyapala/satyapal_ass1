import java.util.Scanner;
class Palindrome{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        Palindrome object=new Palindrome();
        System.out.print(object.PalindromeCheck(inputNumber));
    }
    public String PalindromeCheck(int inputValue)
    {
        int temp=inputValue,reverseValue=0,sum=0;
        while(temp!=0) {
            reverseValue = reverseValue * 10 + temp % 10;
            temp = temp / 10;
        }
        if(inputValue==reverseValue)
        {   temp=inputValue;
            while(temp!=0)
            {   if((temp%10)%2==0)
                    sum+=temp%10;
                temp=temp/10;
            }
            if(sum>25) {
                return (reverseValue + " is a palindrome and the sum of even numbers is greater than 25");
            }
            else
            {
                return (reverseValue + " is a palindrome and the sum of even numbers is less than 25");
            }
        }
        else
        {
            return (inputValue + " is not a palindrome");
        }
    }

}
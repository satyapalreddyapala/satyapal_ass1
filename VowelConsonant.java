import java.io.*;
public class VowelConsonant {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write a word no numerals");
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
            {   switch (s.charAt(i))
            {   case 'a':
                System.out.print(" Vowel ");
                break;
                case 'e':
                    System.out.print(" Vowel ");
                    break;
                case 'i':
                    System.out.print(" Vowel ");
                    break;
                case 'o':
                    System.out.print(" Vowel ");
                    break;
                case 'u':
                    System.out.print(" Vowel ");
                    break;
                default:
                    System.out.print(" Consonant ");
                    break;
            }
            }
            else
            {
                System.out.print("Numeric Content Invalid");
                break;
            }
        }

    }
}
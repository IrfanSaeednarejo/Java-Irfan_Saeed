import java.util.Scanner;
import java.lang.String;
public class EncriptionQSn
{
   static String message = "";
    static String encrypt = "";

    public static void main(String[] args)
    {
        int x = 0;
        do {
            String password = "";

            Scanner sc = new Scanner(System.in);
            System.out.println("1. Send a Secure Message");
            System.out.println("2. View Encrypted Message");
            System.out.println("3. Decrypt Message (Note : Password Protected)");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your message : ");

                    message = sc.next();
                    encrypt = enc(message);
                    break;
                case 2:
                    System.out.print("Encrypted message is : " + encrypt);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the paassword : ");
                    password = sc.next();
                    if ((password).equals("ABC786")) {
                        System.out.println("Decrypted message is : " + message);
                    } else
                        System.out.println("Wrong Password");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invaild input");
            }
        }while(x<=5);



        }



    public static String enc(String message)
    {
        String encrypted = "";
        for(int i = 0; i < message.length(); i++)
        {
         encrypted += Character.toString((char) (message.charAt(i) ^ 8));
        }
        return encrypted;
    }
}

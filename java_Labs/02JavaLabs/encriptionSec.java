import java.util.Scanner;
public class encriptSec

{
   public static int x = 0;
    public static String encrypt = "";
    public static String message ="";

    
    public static void main(String[] args)
    {
        while(encriptSec.x<=5)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Send a message and encrypt it ");
            System.out.println("2. View encrypted message ");
            System.out.println("3. Decrypt the message ");
            System.out.println("4. Exit ");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            System.out.println();

            
            switch (choice)
            {
                case 1:
                    System.out.print("Enter your message : ");
                    encriptSec.message = sc.nextLine();
                    encriptSec.encrypt = input(message);
                    break;

                case 2:

                    System.out.print("Encrypted message : ");
                    System.out.print(encriptSec.encrypt);
                    System.out.println();
                    break;
                case 3:
                    String key = "ABC";
                    System.out.print("Enter the password : ");
                    String password = sc.next();
                    if (password.equals(key))
                    {
                        System.out.println("Decrypted message is : " +(encriptSec. message));
                    } else
                        System.out.println("wrong password");
                    break;
            }
            x++;
        }


    }
    public static String input(String message)
    {

        String encrypt="";
        char c[] = new char[message.length()];
        for(int i = 0; i< message.length(); i++)
        {
            c[i] = (message.charAt(i));
            encrypt += (c[i]<<2);
        }
        return encrypt;
    }
}

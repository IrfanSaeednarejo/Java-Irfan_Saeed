import java.util.Scanner;

class Library {
    String id;
    int pages, price;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library[] books = new Library[5];
        int num;

        System.out.print("How many Book's Records do you want to Enter: ");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            books[i] = new Library();

            System.out.println("\nEnter the Record of Book: " + (i + 1));
            System.out.print("Enter the Id of Book: ");
            books[i].id = scanner.next();
            System.out.print("Enter the number of pages: ");
            books[i].pages = scanner.nextInt();
            System.out.print("Enter the Price of Book: ");
            books[i].price = scanner.nextInt();
        }

        int book1 = books[0].price, book2 = books[0].price, book3 = books[0].price;

        for (int i = 0; i < num; i++) {
            if (books[i].price < book1) {
                book1 = books[i].price;
            } else if (books[i].price < book2) {
                book2 = books[i].price;
            } else if (books[i].price < book3) {
                book3 = books[i].price;
            }
        }

        for (int i = 0; i < num; i++) {
            if (books[i].price == book1) {
                System.out.println("\nBook's id: " + books[i].id);
                System.out.println("Book's Pages: " + books[i].pages);
                System.out.println("Book is the cheapest");
            }
        }
    }
}

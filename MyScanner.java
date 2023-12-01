import java.util.Scanner;

public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                int inputNumber = scanner.nextInt(); // Reads input number, sees if its a integer
                int ProductInt = inputNumber * 3; // multiplies inputNumber by 3
                System.out.println(ProductInt); // Prints out ProductInt
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}


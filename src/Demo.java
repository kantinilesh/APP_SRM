import java.util.Scanner;

class q2 {
    int a;
    int b;

    void input(Scanner sc) {
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
    }

    void display() {
        System.out.println("Sum of a and b: " + (a + b));
    }
}

class q3 extends q2 {
    int c;

    void get_data(Scanner sc) {
        System.out.println("Enter third number:");
        c = sc.nextInt();
    }

    void output() {
        System.out.println("Sum of a, b, and c: " + (a + b + c));
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        q3 aa = new q3();

        aa.input(sc);
        aa.get_data(sc);
        aa.display();
        aa.output();

        sc.close();  // Closing the scanner to prevent resource leak
    }
}

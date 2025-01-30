import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        float weight;
        boolean isSmoker;

        System.out.print("Please enter your name: ");

        name = scanner.nextLine();

        System.out.print("Please enter your age: ");

        age = scanner.nextInt();
        
        System.out.print("How much do you weigh?: ");

        weight = scanner.nextFloat();

        System.out.print("(true or false) Are you currently a smoker/Do you have a history of smoking?: ");

        isSmoker = scanner.nextBoolean();

        System.out.println("Patient Report -\nName: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nSmoker: " + isSmoker);

        scanner.close();
    }
}

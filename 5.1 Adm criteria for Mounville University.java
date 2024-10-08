import java.util.Scanner;

public class MountvilleAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Enter SAT score: ");
        int satScore = scanner.nextInt();

        System.out.print("Are you a valedictorian or salutatorian of a school with 1400 or more students? (yes/no): ");
        boolean isValSal = scanner.next().equalsIgnoreCase("yes");

        boolean isAdmitted = false;

        if (isValSal) {
            isAdmitted = true;
        } else if (gpa >= 4.0 && satScore >= 1100) {
            isAdmitted = true;
        } else if (gpa >= 3.5 && satScore >= 1300) {
            isAdmitted = true;
        } else if (gpa >= 3.0 && satScore >= 1500) {
            isAdmitted = true;
        }

        if (isAdmitted) {
            System.out.println("Congratulations! You are admitted to Mountville University.");
        } else {
            System.out.println("Unfortunately, you do not meet the admission criteria for Mountville University.");
        }
    }
}

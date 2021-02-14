import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int studentAge = 19;
        double atar = 99.95;
        String firstName = "Eric";
        String lastName = "Zhu";
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        boolean hasPerfectAttendance = true;
        System.out.println(firstName + " " + lastName + " is a great person.");
        System.out.println(firstInitial + "" + lastInitial + " is " + studentAge + " years old and has an ATAR of " + atar + ".");
        if (hasPerfectAttendance) {
            System.out.println("They also have perfect attendance.");
        }
        else {
            System.out.println("They are twats and do not have perfect attendance.");
        }
        System.out.println("Do you want to update your age?");
        Scanner input = new Scanner(System.in);
        studentAge = input.nextInt();
        System.out.println(firstName + " " + lastName + " is now " + studentAge);
    }
}

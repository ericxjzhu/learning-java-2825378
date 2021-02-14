public class Main {

    public static void main(String[] args) {
        int studentAge = 19;
        double atar = 99.95;
        char firstInitial = 'E';
        char lastInitial = 'Z';
        boolean hasPerfectAttendance = true;

        System.out.println(firstInitial + "" + lastInitial + " is " + studentAge + " years old and has " + atar + " ATAR.");
        if (hasPerfectAttendance) {
            System.out.println("They also have perfect attendance.");
        }
        else {
            System.out.println("They are twats and do not have perfect attendance.");
        }

    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Course[], Student[]> data = new HashMap<>();

        String userInput;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Apasa 0 pentru iesire din preogram");
            System.out.println("Apasa 1 Afiseaza cursuri");
            System.out.println("Apasa 2 Introduceti un curs nou");
            System.out.println("Apasa 3 Introduceti un student nou si inrolati-l la curs");
            System.out.println("Apasa 4 Cautati un student dupa nume");
            System.out.println("Apasa 5 Afiseaza studentii si cursul la care participa");
        }

            System.out.println("Alege optiunea:");
            userInput = scanner.next();
            switch (userInput){
                case "0":
                    System.exit(0);
                case "1":
                    Course[] curses = new Course[];
                    Student[] students = new Student[];

                    data.put(curses,students);

                case "2":

                case "3":

                case "4":

                case "5":

                default:
                    System.out.println("Ati ales gresit");

        }
}

import java.util.Scanner;

 public class ReadPersonalData{

    static Person readData(Person person){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter first name: ");
        try {
            person.setFirstName(scanner.nextLine());
        }catch (NameUndefinedException e){
            System.out.println(e.getMessage());
        }

        System.out.printf("Enter last name: ");
        try {
            person.setLastName(scanner.nextLine());
        }catch (NameUndefinedException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("Enter your age: ");
        try {

            person.setAge(scanner.nextInt());
            scanner.nextLine();
        }catch (IncorrectAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("Enter pesel: ");
         person.setPesel(scanner.nextInt());
         scanner.nextLine();

         return person;
    }

}

import java.util.Scanner;

 public class ReadPersonalData{

    static Person readData(Person person){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter first name: ");
         person.setFirstName(scanner.nextLine());
        System.out.printf("Enter last name: ");
         person.setLastName(scanner.nextLine());
        System.out.printf("Enter your age: ");
         person.setAge(scanner.nextInt());
         scanner.nextLine();
        System.out.printf("Enter pesel: ");
         person.setPesel(scanner.nextInt());
         scanner.nextLine();

         return person;
    }

}

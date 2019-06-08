public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        ReadPersonalData.readData(person);
        System.out.println(person.toString());


    }
}

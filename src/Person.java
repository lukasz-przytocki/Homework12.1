public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName!=null && firstName.length()>2) {
            this.firstName = firstName;
        }else {
            throw new IncorrectAgeException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName!=null && lastName.length()>2) {
            this.lastName = lastName;
        }else {
            throw new NameUndefinedException();
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        }else{
            throw new IncorrectAgeException();
        }
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return  "First name: " + firstName+ ", Last name: " + lastName + ", age: " +
                age + ", pesel: " + pesel;
    }
}

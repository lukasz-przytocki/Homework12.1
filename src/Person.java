public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public void setFirstName(String firstName) throws NameUndefinedException {
        if(firstName!=null && firstName.length()>2) {
            this.firstName = firstName;
        }else {
            throw new NameUndefinedException("Name should be longer than 2 letters");
        }
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        if(lastName!=null && lastName.length()>2) {
            this.lastName = lastName;
        }else {
            throw new NameUndefinedException("Surname should be longer than 2 letters");
        }
    }

    public void setAge(int age) throws IncorrectAgeException {
        if(age>0) {
            this.age = age;
        }else{
            throw new IncorrectAgeException("Age should be higher than 0!");
        }
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return  "First name: " + firstName+ ", Last name: " + lastName + ", age: " +
                age + " pesel: " + pesel;
    }
}

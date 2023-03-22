import java.util.HashSet;
import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        if (this.name == null) {
            throw new IllegalStateException("Имя не заданo");}
        this.surname = personBuilder.getSurname();
        if (this.name == null) {
            throw new IllegalStateException("Фамилия не задана");}
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }


    public boolean hasAge() {
        HashSet<String> hasAge = new HashSet<>();
        PersonBuilder personBuilder = new PersonBuilder();
        hasAge.add(personBuilder.getAddress());
        if (hasAge.isEmpty() == true) {
            return false;
        } else
            return true;

    }

    public boolean hasAddress() {
        HashSet<String> hasAddress = new HashSet<>();
        PersonBuilder personBuilder = new PersonBuilder();
        hasAddress.add(personBuilder.getAddress());
        if (hasAddress.isEmpty() == true) {
            return false;
        } else
            return true;

    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.surname = this.surname;
        personBuilder.address = this.address;
        personBuilder.age = this.age;
        personBuilder.name = this.name;
        return personBuilder;


    }

    public void happyBirthday() {
        this.age = age;
        int ageHappyBirthday = age + 1;
        System.out.println(ageHappyBirthday);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getAddress());
    }


}

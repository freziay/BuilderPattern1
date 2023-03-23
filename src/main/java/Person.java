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
        if (this.surname == null) {
            throw new IllegalStateException("Фамилия не задана");}
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }


    public boolean hasAge() {
        if (this.age==0){
            return false;
        } else
            return true;
    }

    public boolean hasAddress() {

        if (this.address==null) {
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
        if(age>0) {
            int ageHappyBirthday = age + 1;
            System.out.println(ageHappyBirthday);
        }
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

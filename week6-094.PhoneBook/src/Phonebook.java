import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        personList.add(newPerson);
    }

    public void printAll() {
        for (Person eachPerson : personList) {
            System.out.println(eachPerson);
        }
    }

    public String searchNumber(String name) {
        String searchedNumber = "number not found";
        for (Person eachPerson : personList) {
            if (eachPerson.getName().equals(name)) {
                searchedNumber = eachPerson.getNumber();
            }
        }
        return searchedNumber;
    }
}

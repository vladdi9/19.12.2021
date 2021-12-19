package parsing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(){

    }

    public Person(String surname, String name, String patronymic) {
        this.surname = capitalizeFirst(surname);
        this.name = capitalizeFirst(name);
        this.patronymic = capitalizeFirst(patronymic);
    }

    public String getSurname() {
        return capitalizeFirst(surname);
    }

    public String getName() {
        return capitalizeFirst(name);
    }

    public String getPatronymic() {
        return capitalizeFirst(patronymic);
    }
    //метод который делая только первую букву заглавной
    public String capitalizeFirst(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
}

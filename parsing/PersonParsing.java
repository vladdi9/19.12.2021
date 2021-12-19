package parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.util.Arrays;

public class PersonParsing {
    public static void main(String[] args) {
        String url = "https://veteran-vov.vagsh.mil.ru/vov";
        String selector = "div>ul>li>a[href]";
        Document document = null;

        try {
            document = Jsoup.connect(url).get();
        } catch (IOException e) {
            System.err.println("Check HTTP connection to the url " + url);
        }
        Elements names = document.select(selector);
        System.out.println(names.size());
        Persons persons = new Persons();
        for (Element element:names){
            String html = element.html();
            String name = html.trim();
            String[] strings = name.trim().split("\\s+");
            Arrays.stream(strings).forEach(String::trim);
            if (strings.length > 2)
                persons.addPerson(new Person(strings[0], strings[1], strings[2]));
            System.out.println(html);
        }

        //Person person = new Person("Иванов", "Иван", "Иванович");
        //persons.addPerson(person);
                PersonsRw namesRw = new PersonsRw();
        namesRw.setPersons(persons);

                namesRw.write();
    }
}

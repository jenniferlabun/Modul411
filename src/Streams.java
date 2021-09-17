import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// Streams sind:
// Folge von Elementen, die gewisse Methoden
// ausführen können
public class Streams {
    public static void main(String[] args) {


    List<Person> personen = new ArrayList<>();
    Person al = new Person("Mustermann", "Albert");
    Person li = new Person("Meier", "Lisa");
    Person go = new Person("Mustermann", "Godfried");

    personen.add(al);
    personen.add(li);
    personen.add(go);

    personen.sort(Comparator.comparing(Person::getVorname));
    personen.forEach(val -> System.out.println(val.getVorname()));

    }
}

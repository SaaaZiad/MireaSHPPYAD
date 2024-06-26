import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HumanWorker {
    private final List<Human> humans;
    public HumanWorker(){
        this.humans = new ArrayList<>();
        var h1 = new Human(20, "Nikita", "Denisov", LocalDate.of(2005, Month.FEBRUARY, 25), 81);
        var h2 = new Human(40, "Ivan", "Pupkin", LocalDate.of(1984, Month.FEBRUARY, 17), 65);
        var h3 = new Human(13, "Katerina", "Landysheva", LocalDate.of(2011, Month.JULY, 3), 48);
        var h4 = new Human(70, "Vladislav", "Rakov", LocalDate.of(1954, Month.MARCH, 27), 60);
        var h5 = new Human(66, "Vladislava", "Rakova", LocalDate.of(1958, Month.JANUARY, 1), 49);
        var h6 = new Human(34, "Artem", "Bogomolov", LocalDate.of(1990, Month.NOVEMBER, 20), 140);
        var h7 = new Human(34, "Slava", "Lapov", LocalDate.of(1990, Month.MAY, 9), 80);
        var h8 = new Human(15, "Aleksandr", "Zovkin", LocalDate.of(2009, Month.APRIL, 5), 60);
        var h9 = new Human(18, "Anton", "Checkov", LocalDate.of(2006, Month.SEPTEMBER, 14), 75);
        var h10 = new Human(23, "Maria", "Chernova", LocalDate.of(2001, Month.JUNE, 25), 55);
        this.humans.addAll(List.of(h1,h2,h3,h4,h5,h6,h7,h8,h9,h10));
    }
    public List<Human> getFirstFive(){
        return this.humans.stream().limit(5).collect(Collectors.toList());
    }
    public List<Human> filterByWeight(){
        return this.humans.stream().filter(h-> h.weight < 60).collect(Collectors.toList());
    }
    public List<Human> sortByDate(){
        return this.humans.stream().sorted(Comparator.comparing(h -> h.birthDate)).collect(Collectors.toList());
    }
}


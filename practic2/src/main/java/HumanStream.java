import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HumanStream {
    public static void main(String[] args) {
        var test = new HumanWorker();
        System.out.println("SELECTED");
        test.getFirstFive().forEach(System.out::println);
        System.out.println("SORTED BY DATE");
        test.sortByDate().forEach(System.out::println);
        System.out.println("FILTERED");
        test.filterByWeight().forEach(System.out::println);
    }
}

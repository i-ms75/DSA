import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> arrIntegers=Arrays.asList(100,75,1,1,5,7,20,95,4,3,8);
        Optional<Integer> numOptional=arrIntegers.stream()
                                    .distinct()
                                    .sorted(Comparator.reverseOrder())
                                    .skip(1)
                                    .findFirst();

        numOptional.ifPresentOrElse(
            System.out::println,
            ()-> System.out.println("not enough unique value present")
        );
    }
    
    
}

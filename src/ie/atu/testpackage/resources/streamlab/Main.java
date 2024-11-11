package ie.atu.testpackage.resources.streamlab;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// public class Main {
//     public static void main(String[] args) {

//         System.out.println("\n");

//          List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

//          names.stream()
//          .filter(name -> name.startsWith("A"))
//          .forEach(name -> System.out.println(name));
//     }
// }



//DIY TASK 2


// public class Main {
//     public static void main(String[] args) {

//         System.out.println("\n");

//          List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//          nums.stream()
//          .filter(OLUWABURNA -> OLUWABURNA % 2 == 1)
//          .forEach(OLUWABURNA -> System.out.println(OLUWABURNA));
//     }
// }


//Example

// public class Main {
//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

//         List<String> filteredNames = names.stream()
//                                         .filter(name -> name.length() > 3)
//                                         .sorted()
//                                         .collect(Collectors.toList());

//         filteredNames.forEach(name -> System.out.println(name));
//     }
// }

//DIY TASK 3


public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "grape", "kiwi", "orange", "mango");

        List<String> filteredFruits = fruits.stream()
                        .filter(fruit -> fruit.length() > 5)
                        .map(String::toUpperCase)
                        .sorted()
                        .collect(Collectors.toList());

        filteredFruits.forEach(fruit -> System.out.println(fruit));
    }
}




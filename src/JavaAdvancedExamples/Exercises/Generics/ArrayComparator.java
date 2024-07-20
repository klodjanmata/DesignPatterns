package JavaAdvancedExamples.Exercises.Generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayComparator {

    public static <T> boolean arrayCheck(T[] array1, T[] array2){
        if (array1.length != array2.length) {
            return false;
        }
        // true -> 2 object are the same
        // false -> 2 object are different
        for (int i = 0; i < array1.length; i++) {
            if(! array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static <T extends Number> void sumOfOddAndEven(List<T> numbers){
        Double evenSum = 0d;
        Double oddSum = 0d;
        for (T number : numbers){
            if (number.intValue() % 2 == 0){
                evenSum += number.doubleValue();
            }
            else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("Original numbers: " + numbers);
        System.out.println("Even sum = " + evenSum);
        System.out.println("Odd sum = " + oddSum);
    }

    public static <T> int findTarget(List<T> array,T target){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static <K, V> void printMapValues(Map<K, V> map){
        for (Map.Entry<K, V> entry : map.entrySet()){
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println("<" + key + ", " + value + ">");
        }
    }


    public static void main(String[] args) {
        Integer[] integers1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] integers2 = new Integer[]{1, 2, 3, 4, 5};
        //System.out.println(arrayCheck(integers1, integers2));
        sumOfOddAndEven(List.of(integers1));
        Float[] floats1 = new Float[]{1.5f, 2.6f, 3.4f, 4f, 5f};
        Float[] floats2 = new Float[]{1f, 2f, 3f, 4f, 5f};
        //System.out.println(arrayCheck(floats1, floats2));
        sumOfOddAndEven(List.of(floats1));
        System.out.println("Target element in index: " + findTarget(List.of(integers2), 6));

        System.out.println("////////\n");
        Map<String, Integer> colors = new HashMap<>();
        colors.put("Red", 5);
        colors.put("Blue", 7);
        colors.put("Green", 20);
        printMapValues(colors);

        HashMap<String, String> names = new HashMap<>();
        names.put("John", "Doe");
        names.put("Sam", "Smith");
        names.put("Qazim", "Mulleti");
        printMapValues(names);

    }
}





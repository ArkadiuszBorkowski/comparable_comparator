package cw1;


import java.util.Arrays;
import java.util.Comparator;

public class NumberComparator {
    public static void main(String[] args) {
        Integer numbers[] = {1, 5, 10, 19, 102, 43, 25, 36, 31 , 99,
                         9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111};
        System.out.println("Nieposortowana: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Posortowana rosnąco: ");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
//                if (o1 > o2)
//                    return -1;
//                else if (o1 < o2)
//                    return 1;
//                return 0;
            }
        });

        System.out.println("Posortowana malejąco: ");
        System.out.println(Arrays.toString(numbers));
    }
}

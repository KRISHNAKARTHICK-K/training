import java.util.*;

class arr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(
            Arrays.asList(10, 11, 20, 21, 30, 31, 40, 41)
        );

        int currentIndex = 0;

        for (int searchIndex = 0; searchIndex < list.size(); searchIndex++) {

            if (list.get(searchIndex) % 10 == 1) {

                int temp = list.get(currentIndex);
                list.set(currentIndex, list.get(searchIndex));
                list.set(searchIndex, temp);

                currentIndex++;
            }
        }

        System.out.println(list);
    }
}
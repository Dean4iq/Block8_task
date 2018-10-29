package part1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class CollectonElementsCounter {
    public static void main(String[] args) {
        ArrayList<Integer> baseList = new ArrayList<>();
        HashMap<Integer, Integer> counterMap = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            baseList.add(random.nextInt(10));
        }

        for (Integer numb : baseList) {
            System.out.print(numb + " ");
        }

        System.out.println();

        for (Integer numb : baseList) {
            counterMap.put(numb, counterMap.containsKey(numb) ? counterMap.get(numb) + 1 : 1);
        }

        for (Integer key : counterMap.keySet()) {
            System.out.println(key + " - " + counterMap.get(key));
        }
    }
}

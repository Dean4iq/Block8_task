package part2;

public class CheckCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList<String> customArrayListString = new CustomArrayList<>();

        customArrayListString.add("Some string");
        customArrayListString.add("Another string");
        customArrayListString.add("What is love");
        customArrayListString.add("");
        customArrayListString.add("Baby don't hurt me");

        for (int i = 0; i < customArrayListString.size(); i++){
            System.out.println(customArrayListString.get(i) + " ");
        }

        System.out.println("\n\n==========================\n");

        CustomArrayList<Integer> customArrayListInt = new CustomArrayList<>(10);
        customArrayListInt.add(45);
        customArrayListInt.add(-4522);
        customArrayListInt.add(9457);
        customArrayListInt.add(customArrayListInt.get(0));
        customArrayListInt.add(0);
        customArrayListInt.add(-0);

        for (int i = 0; i < customArrayListInt.size(); i++){
            System.out.println(customArrayListInt.get(i) + " ");
        }
    }
}

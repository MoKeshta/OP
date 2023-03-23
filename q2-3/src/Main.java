public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(13);
        Numbers.add(22);
        Numbers.add(40);
        Numbers.add(532);
        Numbers.add(20);
        Numbers.add(2);
        Numbers.add(0);

        int max = maxFunction(Numbers);
        System.out.println("The Max Number is =" + max);

        System.out.println("Sorted Array Function");
        SortFunction(Numbers);

    }

    public static int maxFunction(ArrayList<Integer> list) {
        int maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maximum < list.get(i)) {
                maximum = list.get(i);
            }

        }
        return maximum;
    }

    public static void SortFunction(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted Array List " + list);

    }
}


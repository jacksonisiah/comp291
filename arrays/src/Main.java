import java.util.*;

public class Main {
    public static void main(String[] args) {
        calcArray();
        reverseArray();
    }

    public static void calcArray() {
        var scan = new Scanner(System.in);
        var weights = new ArrayList<Double>();

        for (int i = 1; i < 6; i++) {
            System.out.printf("Enter weight %s:\n", i);
            var input = scan.nextLine();
            weights.add(Double.parseDouble(input));
        }

        var it = weights.iterator();
        double sum = 0;
        double max = 0.0;
        System.out.print("You entered: ");
        while(it.hasNext()) {
            var i = it.next();
            System.out.printf("%s ", i);
            sum += i;
            if (i > max) {
                max = i;
            }
        }

        System.out.println("\n");
        System.out.printf("Total weight: %s\n", sum);
        System.out.printf("Average weight: %s\n", (sum/weights.size()));
        System.out.printf("Max weight: %s\n", max);
    }

    public static void reverseArray() {
        Scanner scnr = new Scanner(System.in);
        var lol = new ArrayList<Integer>();

        var qty = scnr.nextInt();
        for (int i = 0; i < qty; i++) {
            lol.add(scnr.nextInt());
        }

        Collections.reverse(lol);
        for (Integer integer : lol) System.out.printf("%s,", integer);
        System.out.print("\n");
    }
}
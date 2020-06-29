import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameEnteredByUser;
        List<Keyboard> list = new ArrayList<>();
        Keyboard foundKeyboard;

        list.add(new Keyboard("A4tech", 3200.5F, "black", false, 10, "Membrane"));
        list.add(new Keyboard("Genius", 5800.00f, "silver", false, 5, "Scissor"));
        list.add(new Keyboard("Logitech", 10200.30f, "black", true, 3, "Membrane"));
        list.add(new Keyboard("Defender", 1200.0f, "white", false, 20, "Mechanical"));
        list.add(new Keyboard("Microsoft", 9650.0f, "grey", true, 7, "Scissor"));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("\nEnter keyboard name");
        nameEnteredByUser = scanner.next().trim();
        foundKeyboard = binaryFindKeyboard(list, nameEnteredByUser);
        System.out.println(foundKeyboard);
    }

    static Keyboard binaryFindKeyboard(List<Keyboard> list, String nameEnteredByUser) {
        int left = 0;
        int right = list.size() - 1;
        int middle;
        int index = -1;

        while (left <= right) {
            middle = (left + right) / 2;
            if (list.get(middle).getName().equals(nameEnteredByUser)) {
                index = middle;
                break;
            }
            if (nameEnteredByUser.charAt(0) < list.get(middle).getName().charAt(0)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (index == -1) return null;
        else return list.get(index);

    }
}


import java.util.List;

public class Manager {
    //String nameEnteredByUser;
    String colorEnteredByUser;
    String keyTypeEnteredByUser;
    String lightEnteredByUser;
    int counter = 0;

    Float findOneItemCost(Keyboard k) {
        return k.getAmount() * k.getPrice();
    }

    void binaryFindKeyboard(List<Keyboard> list, String nameEnteredByUser) {
        int left = 0;
        int right = list.size() - 1;
        int middle;
        int index = -1;

        //while (left <= right) {
        //while (list.listIterator().next().getName().toLowerCase().startsWith(nameEnteredByUser,3)){
        while (list.listIterator().hasNext()){
            middle = (left + right) / 2;
            boolean compareName = list.get(middle).getName().regionMatches(true, 0, nameEnteredByUser, 0, 2);
            if (compareName) {
                index = middle;
                //counter++;
                break;
            }
            if (nameEnteredByUser.charAt(0) < list.get(middle).getName().charAt(0)) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (index == -1) {
            System.out.println("Товар не найден");
        } else {
            System.out.println(list.get(index));
        }
    }


//    void findName(Keyboard k) {
//        boolean compareName = nameEnteredByUser.regionMatches(true, 0, k.getName(), 0, 2);
//        if (compareName) {
//            System.out.println(k.toString());
//            counter++;
//        }
//    }

    void showColor(Keyboard k) {
        boolean compareColor = colorEnteredByUser.regionMatches(true, 0, k.getColor(), 0, 4);
        if (compareColor) {
            System.out.println(k.toString());
            counter++;
        }
    }

    void showLight(Keyboard k) {
        boolean light = lightEnteredByUser.trim().toLowerCase().startsWith("y");
        if (light && k.isLight()) {
            System.out.println(k.toString());
            counter++;
        } else if (!light && !k.isLight()) {
            System.out.println(k.toString());
            counter++;
        }
    }

    void showKeyType(Keyboard k) {
        boolean compareKeyType = keyTypeEnteredByUser.regionMatches(true, 0, k.getKeyType(), 0, 4);
        if (compareKeyType) {
            System.out.println(k.toString());
            counter++;
        }
    }

    public void itemNotFound() {
        if (counter == 0) {
            System.out.println("Товар не найден");
        }
    }

    void shellSort(List <Float> list) {
        int increment = list.size() / 2;
        while (increment > 0) {
            for (int i = 0; i < list.size() - increment; i++) {
                int j = i;
                while ((j >= 0) && ((list.get(j)) > list.get(j + increment))) {
                    float temp = list.get(j);
                    list.set(j, list.get(j + increment));
                    list.set(j + increment, temp);
                    j--;
                }
            }
            increment /= 2;
        }
            System.out.println(list);
        }
    }





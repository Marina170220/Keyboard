public class Manager {
    String nameEnteredByUser;
    String colorEnteredByUser;
    String keyTypeEnteredByUser;
    String lightEnteredByUser;
    int counter = 0;

    Double findOneItemCost(Keyboard k) {
        return k.getAmount() * k.getPrice();
    }

    void findName(Keyboard k) {
        boolean compareName = nameEnteredByUser.regionMatches(true, 0, k.getName(), 0, 3);
        if (compareName) {
            System.out.println(k.toString());
            counter++;
        }
    }

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
}




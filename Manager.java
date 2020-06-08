public class Manager {
    String nameEnteredByUser;
    int counter = 0;

    Double findOneItemCost(Keyboard k) {
        return k.getAmount() * k.getPrice();
    }

    void findName(Keyboard k) {
        if (k.getName().toLowerCase().equals(nameEnteredByUser)) {
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




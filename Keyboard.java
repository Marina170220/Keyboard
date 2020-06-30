import java.util.List;

public class Keyboard {
    String name;
    Float price;
    String color;
    boolean light;
    int amount;
    String keyType;

    Keyboard(String name, Float price, String color, boolean light, int amount, String keyType) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.light = light;
        this.amount = amount;
        this.keyType = keyType;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public String getColor() {
        return color;
    }

    public boolean isLight() {
        return light;
    }

    public String getKeyType() {
        return keyType;
    }

    @Override
    public String toString() {
        return "\nKeyboard: " + name +
                ", price: " + price +
                ", color: " + color +
                ", light: " + light +
                ", amount: " + amount +
                ", keyType: " + keyType;
    }
    public static void sortKeyboards (List<Keyboard> list){
            int increment = list.size() / 2;
            while (increment > 0) {
                for (int i = 0; i < list.size() - increment; i++) {
                    int j = i;
                    while ((j >= 0) && ((list.get(j).getPrice()) > list.get(j + increment).getPrice())) {
                        Keyboard temp = list.get(j);
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

//    @Override
//    public int compareTo(Keyboard o) {
//        return name.compareTo(o.getName());
//    }


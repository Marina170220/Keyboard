
public class Keyboard implements Comparable<Keyboard> {
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

    @Override
    public int compareTo(Keyboard o) {
        return name.compareTo(o.getName());
    }
}

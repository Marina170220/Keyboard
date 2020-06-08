public class Keyboard implements Comparable<Keyboard> {
    String name;
    Double price;
    String color;
    boolean light;
    int amount;

    Keyboard(String name, Double price, String color, boolean light, int amount) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.light = light;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", light=" + light +
                ", amount=" + amount +
                '}';
    }

    @Override
    public int compareTo(Keyboard o) {
        return price.compareTo(o.getPrice());
    }
}

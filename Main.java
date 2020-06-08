////Имеется полка с клавиатурами в магазине электроники.
//// Необходимо:
////Заполнить её товарами;
////Подсчитать стоимость всех товаров на полке;
////Найти нужный товар по названию;
////Отсортировать товары по цене.
////
////Параметры товара:
////Цена;
////Цвет;
////Подсветка.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Keyboard> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        Double cost = 0.0;

        list.add(new Keyboard("A4tech", 3200.5, "black", false, 10));
        list.add(new Keyboard("Genius", 5800.00, "silver", false, 5));
        list.add(new Keyboard("Logitech", 10200.30, "black", true, 3));
        list.add(new Keyboard("Defender", 1200.0, "white", false, 20));
        list.add(new Keyboard("Microsoft", 9650.0, "grey", true, 7));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("\nВведите наименование");
        manager.nameEnteredByUser = scanner.next().trim().toLowerCase();

        for (Keyboard k : list) {
            cost += manager.findOneItemCost(k);
            manager.findName(k);
        }
        manager.itemNotFound();
        System.out.println("\nСтоимость всех товаров на полке " + cost);
    }
}

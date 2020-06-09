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
//Нужно добавить возможность показа клавиатур
//с подсветкой/без подсветки
//Показать только белые/черные клавиатуры
//Показать все клавиатуры с выбранным типом клавиш и,
//соответственно, в параметры добавить тип клавиш
//Мембранный, ножничный, механический

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Keyboard> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        Double cost = 0.0;

        list.add(new Keyboard("A4tech", 3200.5, "black", false, 10, "Membrane"));
        list.add(new Keyboard("Genius", 5800.00, "silver", false, 5, "Scissor"));
        list.add(new Keyboard("Logitech", 10200.30, "black", true, 3, "Membrane"));
        list.add(new Keyboard("Defender", 1200.0, "white", false, 20, "Mechanical"));
        list.add(new Keyboard("Microsoft", 9650.0, "grey", true, 7, "Scissor"));

        Collections.sort(list);
        System.out.println(list);
        for (Keyboard k : list) {
            cost += manager.findOneItemCost(k);
        }
        System.out.println("\nTotal cost of all items is " + cost);

        System.out.println("\nEnter a keyboard name");
        manager.nameEnteredByUser = scanner.next().trim();

        for (Keyboard k : list) {
            manager.findName(k);
        }
        manager.itemNotFound();

        System.out.println("\nKeyboard backlight\nY/N");
        manager.lightEnteredByUser = scanner.next();

        manager.counter = 0;
        for (Keyboard k : list) {
            manager.showLight(k);
        }
        manager.itemNotFound();

        System.out.println("\nEnter a keyboard color");
        manager.colorEnteredByUser = scanner.next().trim();

        manager.counter = 0;
        for (Keyboard k : list) {
            manager.showColor(k);
        }
        manager.itemNotFound();

        System.out.println("\nEnter a keyboard type");
        manager.keyTypeEnteredByUser = scanner.next().trim();

        manager.counter = 0;
        for (Keyboard k : list) {
            manager.showKeyType(k);
        }
        manager.itemNotFound();
    }
}

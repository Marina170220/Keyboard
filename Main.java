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
        String parameterEnteredByUser;
        Float cost = 0.0F;
        //List<Float> prices = new ArrayList<>();

        list.add(new Keyboard("A4tech", 3200.5F, "black", false, 10, "Membrane"));
        list.add(new Keyboard("Genius", 5800.00F, "silver", false, 5, "Scissor"));
        list.add(new Keyboard("Logitech", 10200.30F, "black", true, 3, "Membrane"));
        list.add(new Keyboard("Defender", 1200.0F, "white", false, 20, "Mechanical"));
        list.add(new Keyboard("Microsoft", 9650.0F, "grey", true, 7, "Scissor"));
        list.add(new Keyboard("Razer", 10900.00F, "black", true, 3, "Membrane"));
        list.add(new Keyboard("A4tech", 7800.00F, "pink", false, 1, "Scissor"));
        list.add(new Keyboard("Asus", 11300.40F, "black", true, 2, "Scissor"));
        list.add(new Keyboard("Genius", 6350.0F, "silver", false, 7, "Mechanical"));
        list.add(new Keyboard("Lenovo", 1170.0F, "black", false, 15, "Mechanical"));

//        for (Keyboard k: list){
//            prices.add(k.getPrice());
//        }
//        System.out.println(prices);
//        manager.shellSort(prices);


//        Collections.sort(list);
////        System.out.println(list);
        Keyboard.sortKeyboards(list);
        for (Keyboard k : list) {
            cost += manager.findOneItemCost(k);
        }
        System.out.println("\nTotal cost of all items is " + cost);


        for (int i = 0; i < 4; i++) {
            System.out.println("\nChoose parameter\nname\ncolor\nbacklight\ntype");
            parameterEnteredByUser = scanner.next().trim().toLowerCase();

            if (parameterEnteredByUser.contains("nam")) {
                System.out.println("\nChoose keyboard name");
                for (Keyboard k : list) {
                    System.out.println(k.getName());
                }

                manager.binaryFindKeyboard(list, scanner.next().trim().toLowerCase());

                //manager.itemNotFound();

            } else if (parameterEnteredByUser.contains("col")) {
                System.out.println("\nChoose keyboard color");
                for (Keyboard k : list) {
                    System.out.println(k.getColor());
                }

                manager.colorEnteredByUser = scanner.next().trim();

                manager.counter = 0;
                for (Keyboard k : list) {
                    manager.showColor(k);
                }
                manager.itemNotFound();

            } else if (parameterEnteredByUser.contains("ty")) {
                System.out.println("\nChoose a keyboard type");

                System.out.println("\nMembrane\nScissor\nMechanical");

                manager.keyTypeEnteredByUser = scanner.next().trim();

                manager.counter = 0;
                for (Keyboard k : list) {
                    manager.showKeyType(k);
                }
                manager.itemNotFound();

            } else if (parameterEnteredByUser.contains("lig")) {
                System.out.println("\nKeyboard backlight\nY/N");
                manager.lightEnteredByUser = scanner.next();

                manager.counter = 0;
                for (Keyboard k : list) {
                    manager.showLight(k);
                }
                manager.itemNotFound();

            } else if (parameterEnteredByUser.contains("stop")) {
                break;
            }
        }
    }
}




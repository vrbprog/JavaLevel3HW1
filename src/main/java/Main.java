import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] mas;
        mas = new Integer[]{1,2,3,4,5};

        System.out.print("Начальный массив: ");
        for (Integer i: mas) {
            System.out.print(i + ",");
        }

        changeItem(mas,1,3);
        System.out.print("\nРезультирующий массив: ");
        for (Integer i: mas) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("\nЛист из массива: ");
        System.out.println(convertMas(mas));

        Box<Apple> appleBox = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("\nКоробки " + ((appleBox.compareTo(orangeBox) == 0) ? "равны":"не равны") + " по весу");

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        System.out.println("\nВес первой коробки до пересыпания: " + appleBox.getWeight());
        System.out.println("Вес второй коробки до пересыпания: " + appleBox2.getWeight());
        appleBox.poutOver(appleBox2);
        System.out.println("Вес первой коробки после пересыпания: " + appleBox.getWeight());
        System.out.println("Вес второй коробки после пересыпания: " + appleBox2.getWeight());
    }

    public static <T> void  changeItem(T[] mas, int first, int second){
        T var;
        var = mas[first];
        mas[first] = mas[second];
        mas[second] = var;
    }

    public static <T> List<T> convertMas(T[] mas){
        List<T> list = new ArrayList<>();

        list.addAll(Arrays.asList(mas));
        return list;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private List<T> list = new ArrayList<>();

    public Box() {
    }

    public Box(List<T> list) {
        list.addAll(list);
    }

    public void add(T item) {
        list.add(item);
    }

    public List<Fruit> getList() {
        return (List<Fruit>) list;
    }

    public void poutOver(Box<T> another){
        list.addAll((List<T>)another.getList());
        another.getList().clear();
    }

    public double getWeight(){
        if (list.size() != 0) {
            return list.get(0).getWeight() * list.size();
        }
        else return 0;
    }

    @Override
    public int compareTo(Box<?> another) {
        if (Math.abs(getWeight() - another.getWeight()) < 0.0001) {
            return 0;
        } else if (getWeight() < another.getWeight()) {
            return -1;
        } else return 1;
    }
}

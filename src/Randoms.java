import java.util.*;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    public List<Integer> rnd;
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max - min + 1;
        this.rnd = new ArrayList<>();
        this.random = new Random();
        createRnd();

    }

    private void createRnd() {
        for (int i = 0; i < 100; i++) {
            rnd.add(min + random.nextInt(max));

        }


    }

    @Override
    public Iterator<Integer> iterator() {

        return rnd.iterator();
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {

        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }
}

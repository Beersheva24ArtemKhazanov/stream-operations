package telran.stream;
import java.util.Random;

public class StreamTasks {
    public static int[] shuffle(int[] array) {
        return new Random().ints(0, array.length).distinct().limit(array.length)
    .map(i -> array[i]).toArray();
    }
}

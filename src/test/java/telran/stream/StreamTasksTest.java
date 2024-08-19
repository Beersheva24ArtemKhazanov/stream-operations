package telran.stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StreamTasksTest {
    @Test
    void shuffleTest() {
        //TODO
        //testing of method shuffle of StreamTasks class
        int[] array = {1,2,3,4,5,6};
        int[] expected = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(StreamTasks.shuffle(array)));
        System.out.println(Arrays.toString(StreamTasks.shuffle(array)));
        System.out.println(Arrays.toString(StreamTasks.shuffle(array)));
        System.out.println(Arrays.toString(StreamTasks.shuffle(array)));
        // assertArrayEquals(expected, StreamTasks.shuffle(array));
        // assertNotEquals(expected, StreamTasks.shuffle(array));

    }

}

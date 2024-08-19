package telran.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamTasks {
    public static int[] shuffle(int[] array) {
        //TODO
        //only one pipline for getting new array of int's
        //with all numbers from a given array but with different order
        //each method call returns new array in some random order
        // return Arrays.stream(array).boxed().map(n -> array[new Random().nextInt(array.length)]).mapToInt(Integer::intValue).toArray();
        return Arrays.stream(array).boxed().map(i -> {
            int j = new Random().nextInt(array.length);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            return array[i];
        }).mapToInt(Integer::intValue).toArray();
    }
}

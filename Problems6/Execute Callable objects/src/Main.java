import java.util.List;
import java.util.concurrent.*;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        int count = 0;

        try {
            for (int i = items.size() - 1; i >= 0 ; i--) {
                count += items.get(i).get().call();
            }

        } catch (Exception e) {

        }
        return count;
    }

}
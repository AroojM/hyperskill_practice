import java.util.Collection;
import java.util.function.*;
import java.util.stream.*;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream){
        Collection<T> collection = stream.collect(Collectors.toList());
        return () -> collection.stream();
    }

}
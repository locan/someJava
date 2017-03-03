package java8.chapter3;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by luan on 2017/2/24.
 */
@FunctionalInterface
public interface BufferReaderProcessor {
    String process(BufferedReader b) throws IOException;
}

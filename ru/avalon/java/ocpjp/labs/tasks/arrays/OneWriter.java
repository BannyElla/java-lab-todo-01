package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author Ella
 */
public class OneWriter implements ObjectWriter<int[]> {

    @Override
    public void write(int[] object) throws IOException {
        StringBuilder b = new StringBuilder();
        b.append("[");
        for(int i = 0; i < object.length; ++i) {
            b.append(object[i]);
            b.append(",");
        }
        b.setLength(b.length() - 1);
        b.append("]");
        System.out.println(b);
    }

    @Override
    public void close() throws IOException {
        // nothing close
    }
}

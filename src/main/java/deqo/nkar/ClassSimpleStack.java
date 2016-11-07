package deqo.nkar;

import java.util.EmptyStackException;

/**
 * Created by 21505761 on 04/11/2016.
 */
public class ClassSimpleStack implements SimpleStack {

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}

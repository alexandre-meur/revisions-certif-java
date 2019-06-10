package revisions;

import org.junit.Test;

import java.nio.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

/**
 * This is a test file showing how to throw some common RuntimeException. Unlike usual Exception,
 * RuntimeException (and subclasses) do not need a throws statement or a try/catch. If they are not handled,
 * they don't cause compilation errors but runtime errors.
 *
 * @author Alexandre Meur
 */
public class RuntimeExceptionTests {

    /**
     * RuntimeException do not need to be caught. Code belows compile without throws or try/catch
     */
    @Test(expected = RuntimeException.class)
    public void nonCaughtException() {
        throw new RuntimeException("Don't catch me !");
    }

    /**
     * Division by 0
     */
    @Test(expected = ArithmeticException.class)
    public void divisionByZero() {
        System.out.println(2 / 0);
    }

    /**
     * Storing a wrong type in an array
     */
    @Test(expected = ArrayStoreException.class)
    public void wrongTypeInArray() {
        Object[] tab = new String[3];
        tab[0] = new Integer(1);
    }

    /**
     * Putting too much elements in a buffer
     */
    @Test(expected = BufferOverflowException.class)
    public void bufferOverflow() {
        IntBuffer buffer = IntBuffer.allocate(3);

        //putting 4 elements in a size 3 buffer
        for (int i = 1; i <= 4; i++) {
            buffer.put(i);
        }
    }

    /**
     * Getting too much elements from a buffer
     */
    @Test(expected = BufferUnderflowException.class)
    public void bufferUnderflow() {
        IntBuffer buffer = IntBuffer.allocate(3);

        //Inserting 1, 2 and 3
        for (int i = 1; i <= buffer.capacity(); i++) {
            buffer.put(i);
        }
        //trying to get 4 elements when there are only 3
        buffer.rewind();
        for (int i = 1; i <= 4; i++) {
            System.out.println("buffer.get() : " + buffer.get());
        }
    }

    /**
     * Wrong cast
     */
    @Test(expected = ClassCastException.class)
    public void classCastException() {
        Object o = new Integer(1);
        String s = (String) o;
    }

    /**
     * DateTimeException
     */
    @Test(expected = DateTimeException.class)
    public void dateTimeException() {
        LocalDate.parse("2019-99-99");
    }

    /**
     * EmptyStackException
     */
    @Test(expected = EmptyStackException.class)
    public void emptyStackException() {
        Stack<Integer> stack = new Stack<>();

        //Attempting to get something from the empty stack
        stack.pop();
    }

    /**
     * IllegalArgumentException
     */
    enum Numbers {ONE, TWO, THREE}

    @Test(expected = IllegalArgumentException.class)
    public void enumConstantNotPresentException() {
        Numbers.valueOf("FOUR");
    }

    /**
     * IllegalStateException
     */
    @Test(expected = IllegalStateException.class)
    public void illegalStateException() {
        Buffer buffer = IntBuffer.allocate(3);
        //To reset you need a mark() call before
        buffer.reset();
    }

    /**
     * IndexOutOfBoundsException
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsException() {
        int[] tab = {1, 2, 3};
        System.out.println(tab[5]);
    }

    /**
     * NegativeArraySizeException
     */
    @Test(expected = NegativeArraySizeException.class)
    public void negativeArraySizeException() {
        int[] tab = new int[-1];
    }

    /**
     * NoSuchElementException
     */
    @Test(expected = NoSuchElementException.class)
    public void noSuchElementException(){
        List<String> list = new ArrayList<>();
        Iterator iterator = list.iterator();
        //list is empty, there's no next element
        iterator.next();
    }

    /**
     * NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void nullPointerException(){
        List<String> list = null;
        list.add("Not sure that list exists");
    }
}

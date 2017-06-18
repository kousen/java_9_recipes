package collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class ImmutableCollectionsTest {

    private Integer[] intArgs(int n) {
        return IntStream.rangeClosed(1, n)
                .boxed()
                .toArray(Integer[]::new);
    }

    @Test
    public void createImmutableList() throws Exception {
        IntStream.rangeClosed(1, 10)
                .forEach(n -> {
                    List<Integer> intList = List.of(intArgs(n));
                    assertEquals(n, intList.size());
                    assertEquals(1, intList.get(0).intValue());
                    assertEquals(n, intList.get(intList.size() - 1).intValue());
                });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void showImmutabilityAdd() throws Exception {
        List<Integer> intList = List.of(1, 2, 3);
        intList.add(99);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void showImmutabilityClear() throws Exception {
        List<Integer> intList = List.of(1, 2, 3);
        intList.clear();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void showImmutabilityRemove() throws Exception {
        List<Integer> intList = List.of(1, 2, 3);
        intList.remove(0);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void showImmutabilityReplace() throws Exception {
        List<Integer> intList = List.of(1, 2, 3);
        intList.replaceAll(n -> -n);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void showImmutabilitySet() throws Exception {
        List<Integer> intList = List.of(1, 2, 3);
        intList.set(0, 99);
    }

    @Test
    public void areWeImmutableOrArentWe() throws Exception {
        List<Holder> holders = List.of(new Holder(1), new Holder(2));
        assertEquals(1, holders.get(0).getX());

        holders.get(0).setX(4);
        assertEquals(4, holders.get(0).getX());
    }

    @Test
    public void testVarargsList() throws Exception {
        List<Integer> intList = List.of(intArgs(11));
        assertEquals(11, intList.size());
        assertEquals( 1, intList.get(0).intValue());
        assertEquals(11, intList.get(intList.size() - 1).intValue());
    }
}
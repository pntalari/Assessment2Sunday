package CollectionsTests;

import Collections.ArrayLists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListsTest {
    private ArrayLists arrayLists;

    @Before
    public void setup(){
        arrayLists = new ArrayLists();
    }

    @Test
    public void addShitTest1(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        original1.add(7);
        original1.add(7);
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest2(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTest3(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        ArrayList<Integer> actual = arrayLists.addShit(original1, original2);
        Assert.assertEquals(original1, actual);
    }

    @Test
    public void addShitTogetherTest1(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        original1.add(5);
        original1.add(5);
        original1.add(5);
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 29;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest2(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        original2.add(7);
        original2.add(7);
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 14;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addShitTogetherTest3(){
        ArrayList<Integer> original1 = new ArrayList<Integer>();
        ArrayList<Integer> original2 = new ArrayList<Integer>();
        Integer actual = arrayLists.addShitTogether(original1, original2);
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeAllTest1(){
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(5);
        original.add(5);
        original.add(7);
        original.add(7);
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(0);
        original.remove(0);
        original.remove(0);
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest2(){
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(7);
        original.add(5);
        original.add(7);
        original.add(7);
        Integer toRemove = 5;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        original.remove(0);
        original.remove(1);
        Assert.assertEquals(original, actual);
    }

    @Test
    public void removeAllTest3(){
        ArrayList<Integer> original = new ArrayList<Integer>();
        original.add(5);
        original.add(5);
        original.add(5);
        original.add(7);
        original.add(7);
        Integer toRemove = null;
        ArrayList<Integer> actual = arrayLists.removeAll(original, toRemove);
        Assert.assertEquals(original, actual);
    }

}

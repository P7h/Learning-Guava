package org.p7h.learningguava.strings;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test Class and snippets for Splitter Class.
 * Guava Splitter API: http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Splitter.html
 * Guava Splitter Userguide: https://code.google.com/p/guava-libraries/wiki/StringsExplained
 *
 * @author Prashanth Babu.
 */
public class SplitterTest {

    /**
     * Test basic method of Splitter ie splitToList() without any extra decoration.
     */
    @Test
    public void testSplitToList() {
        final String numberList = "One,Two,Three,Four,Five,Six,Seven,Eight,Nine";
        List<String> list = Splitter.on(',')
                .splitToList(numberList);
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(9, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie splitToList() omitting empty strings.
     */
    @Test
    public void testSplitToListOmitEmpty() {
        final String numberList = "One,,Three,Four,Five,Six,Seven,Eight,Nine";
        List<String> list = Splitter.on(',')
                .omitEmptyStrings()
                .splitToList(numberList);
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(8, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie splitToList() trimming strings.
     */
    @Test
    public void testSplitToListTrim() {
        final String numberList = "One,Two,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Splitter.on(',')
                .trimResults()
                .splitToList(numberList);
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(9, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie splitToList() and also include both trimming strings and omitting empty strings.
     */
    @Test
    public void testSplitToListTrimAndOmitEmpty() {
        final String numberList = "One,  ,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Splitter.on(',')
                .omitEmptyStrings()
                .trimResults()
                .splitToList(numberList);
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(8, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie splitToList() and also include both trimming strings and omitting empty strings and finally limit the splitting after reaching the limit specified.
     */
    @Test
    public void testSplitToListTrimAndOmitEmptyAndLimit() {
        final String numberList = "One,  ,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Splitter.on(',')
                .limit(4)
                .omitEmptyStrings()
                .trimResults()
                .splitToList(numberList);
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Three", "Four", "Five,Six,Seven,Eight,   Nine");
        assertEquals(4, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie split() without any extra decoration.
     * split method returns an Iterable, which can be wrapped in a List to get the same effect as the above 4 methods.
     * This was the initial method. splitToList(String) was added in v15.0.
     */
    @Test
    public void testSplit() {
        final String numberList = "One,Two,Three,Four,Five,Six,Seven,Eight,Nine";
        List<String> list = Lists.newArrayList(Splitter.on(',')
                .split(numberList));
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(9, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie split() trimming strings.
     */
    @Test
    public void testSplitTrim() {
        final String numberList = "One,Two,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Lists.newArrayList(Splitter.on(',')
                .trimResults()
                .split(numberList));
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(9, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie split() and also include both trimming strings and omitting empty strings.
     */
    @Test
    public void testSplitTrimAndOmitEmpty() {
        final String numberList = "One,  ,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Lists.newArrayList(Splitter.on(',')
                .omitEmptyStrings()
                .trimResults()
                .split(numberList));
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        assertEquals(8, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test basic method of Splitter ie split() and also include both trimming strings and omitting empty strings and finally limit the splitting after reaching the limit specified.
     */
    @Test
    public void testSplitTrimAndOmitEmptyAndLimit() {
        final String numberList = "One,  ,Three,Four,Five,Six,Seven,Eight,   Nine  ";
        List<String> list = Lists.newArrayList(Splitter.on(',')
                .limit(4)
                .omitEmptyStrings()
                .trimResults()
                .split(numberList));
        Set<String> rolesSet = ImmutableSet.copyOf(list);
        ImmutableSet<String> expectedSet = ImmutableSet.of("One", "Three", "Four", "Five,Six,Seven,Eight,   Nine");
        assertEquals(4, list.size());
        assertTrue(rolesSet.containsAll(expectedSet));
    }

    /**
     * Test Splitter's testSplitToMap().
     * @link(http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Splitter.html#withKeyValueSeparator(char))
     */
    @Test
    public void testSplitToMap() {
        final String progLangAndItsCreatorString = "Scala=Odersky,Go=Pike,C=Ritchie,C++=Stroustrup,Clojure=Hickey";
        Map<String, String> progLangAndItsCreatorMap = Splitter.on(',')
                .withKeyValueSeparator('=')
                .split(progLangAndItsCreatorString);
        assertEquals("Odersky", progLangAndItsCreatorMap.get("Scala"));
    }
}
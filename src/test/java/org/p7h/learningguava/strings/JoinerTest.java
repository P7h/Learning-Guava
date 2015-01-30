package org.p7h.learningguava.strings;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Test Class and snippets for Joiner Class.
 * 
 * <p>See the Guava Splitter User Guide article on <a href=
 * "http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Joiner.html">Joiner</a>.
 *
 * <p>Also check the Guava Splitter User Guide article on <a href=
 * "https://code.google.com/p/guava-libraries/wiki/StringsExplained#Joiner">Joiner</a>.
 *
 * @author Prashanth Babu.
 */
public class JoinerTest {

    /**
     * Test basic method of Joiner ie join() without any extra decoration.
     */
    @Test
    public void testJoin() {
        final List<String> numberList = Lists.newArrayList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");

        final String numbersJoined = Joiner.on(",")
                .join(numberList);
        assertEquals("One,Two,Three,Four,Five,Six,Seven,Eight,Nine", numbersJoined);
    }

    /**
     * Test basic method of Joiner ie join() which also skips nulls.
     */
    @Test
    public void testJoinOmitNulls() {
        final List<String> numberList = Lists.newArrayList("One", null, "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");

        final String numbersJoined = Joiner.on(",")
                .skipNulls()
                .join(numberList);
        assertEquals("One,Three,Four,Five,Six,Seven,Eight,Nine", numbersJoined);
    }

    /**
     * Test basic method of Joiner ie join() which also replaces nulls.
     */
    @Test
    public void testJoinReplaceNulls() {
        final List<String> numberList = Lists.newArrayList("One", null, "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");

        final String numbersJoined = Joiner.on(",")
                .useForNull("WAS_NULL_BEFORE")
                .join(numberList);
        assertEquals("One,WAS_NULL_BEFORE,Three,Four,Five,Six,Seven,Eight,Nine", numbersJoined);
    }

    /**
     * Test basic method of Joiner ie join() from a Map.
     */
    @Test
    public void testJoinFromMap() {
        final Map<String, String> progLangAndItsCreatorMap = ImmutableMap.of("Scala", "Odersky", "Go", "Pike", "C", "Ritchie", "C++", "Stroustrup", "Clojure", "Hickey");
        final String progLangAndItsCreatorString = Joiner.on(",")
                .withKeyValueSeparator("=")
                .join(progLangAndItsCreatorMap);
        assertEquals("Scala=Odersky,Go=Pike,C=Ritchie,C++=Stroustrup,Clojure=Hickey", progLangAndItsCreatorString);
    }

    /**
     * Test basic method of Joiner ie appendTo().
     */
    @Test
    public void testJoinWithStringBuilder() {
         final List<String> numberList = Lists.newArrayList("One", null, "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
         final StringBuilder stringBuilder = new StringBuilder();

        Joiner.on(",")
                .useForNull("-")
                .appendTo(stringBuilder, numberList);
        assertEquals("One,-,Three,Four,Five,Six,Seven,Eight,Nine", stringBuilder.toString());
    }
}
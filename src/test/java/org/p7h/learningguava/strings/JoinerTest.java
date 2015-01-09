package org.p7h.learningguava.strings;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test Class and snippets for Joiner Class.
 * Guava Joiner API: http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Joiner.html
 * Guava Joiner Userguide: https://code.google.com/p/guava-libraries/wiki/StringsExplained
 * @author Prashanth Babu.
 */
public class JoinerTest {

    /**
     * Test basic method of Joiner ie join() without any extra decoration.
     */
    @Test
    public void testJoin() {
        List<String> numberList = Lists.newArrayList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine");

        String joined = Joiner.on(",")
                .join(numberList);
        assertEquals("One,Two,Three,Four,Five,Six,Seven,Eight,Nine", joined);
    }
}
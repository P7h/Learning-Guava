package org.p7h.learningguava.collections;

import com.google.common.collect.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test Class and snippets for BiMap Class.
 *
 * <p>See the Guava BiMap User Guide article on <a href=
 * "http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/collect/BiMap.html">BiMap</a>.
 *
 * <p>Also check the Guava BiMap User Guide article on <a href=
 * "https://code.google.com/p/guava-libraries/wiki/NewCollectionTypesExplained#BiMap">BiMap</a>.
 *
 * @author Prashanth Babu.
 */
public class BiMapTest {

    /**
     * Test basic usage of BiMap.
     */
    @Test
    public void testBiMap() {
        BiMap<String, String> biMapForLanguagesAndInventors = HashBiMap.create();
        biMapForLanguagesAndInventors.put("Scala", "Odersky");
        biMapForLanguagesAndInventors.put("Go", "Pike");
        biMapForLanguagesAndInventors.put("C", "Ritchie");
        biMapForLanguagesAndInventors.put("C++", "Stroustrup");
        biMapForLanguagesAndInventors.put("Clojure", "Hickey");
        BiMap<String, String> biMapForInventorsAndLanguages = biMapForLanguagesAndInventors.inverse();
        assertEquals(biMapForInventorsAndLanguages.size(), biMapForInventorsAndLanguages.size());
        assertEquals("Hickey", biMapForLanguagesAndInventors.get(biMapForInventorsAndLanguages.get("Hickey")));
    }
}
package org.p7h.learningguava.collections;

import com.google.common.collect.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test Class and snippets for Multimap Class.
 *
 * <p>See the Guava Multimap User Guide article on <a href=
 * "http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/collect/Multimap.html">Multimap</a>.
 *
 * <p>Also check the Guava Bimap User Guide article on <a href=
 * "https://code.google.com/p/guava-libraries/wiki/NewCollectionTypesExplained#Multimap">Multimap</a>.
 *
 * @author Prashanth Babu.
 */
public class MultimapTest {

    /**
     * Test basic usage of Multimap.
     */
    @Test
    public void testMultimap() {
        Multimap<String, String> mapForLanguagesAndInventors = ArrayListMultimap.create();
        mapForLanguagesAndInventors.put("Odersky", "Scala");
        mapForLanguagesAndInventors.put("Odersky", "Generics Compiler");
        mapForLanguagesAndInventors.put("Pike", "Go");
        mapForLanguagesAndInventors.put("Ritchie", "C");
        mapForLanguagesAndInventors.put("Stroustrup", "C++");
        mapForLanguagesAndInventors.put("Hickey", "Clojure");
        assertEquals(2, mapForLanguagesAndInventors.get("Odersky").size());
    }

    /**
     * Test basic usage of Multimap and eliminate duplicates.
     */
    @Test
    public void testMultimapSansDups() {
        Multimap<String, String> mapForLanguagesAndInventors = HashMultimap.create();
        mapForLanguagesAndInventors.put("Odersky", "Scala");
        mapForLanguagesAndInventors.put("Odersky", "Generics Compiler");
        mapForLanguagesAndInventors.put("Pike", "Go");
        mapForLanguagesAndInventors.put("Ritchie", "C");
        mapForLanguagesAndInventors.put("Odersky", "Scala");
        mapForLanguagesAndInventors.put("Pike", "Go");
        assertEquals(2, mapForLanguagesAndInventors.get("Odersky").size());
        assertEquals(1, mapForLanguagesAndInventors.get("Pike").size());
    }
}
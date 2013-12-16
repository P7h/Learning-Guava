package org.p7h.learningguava.strings;

import java.util.List;
import java.util.Set;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableSet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test Class and snippets for Splitter Class.
 * Guava Splitter API: http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/base/Splitter.html
 * Guava Splitter Userguide: https://code.google.com/p/guava-libraries/wiki/StringsExplained
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
}

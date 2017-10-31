import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSorterTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMergeSort() {
		int [] kyrz = {3,6,8,2,6,9};
		int [] post = {2,3,6,6,8,9};
		MergeSorter.mergeSort(kyrz, 0, 5);
		assertTrue(Arrays.equals(kyrz, post));
		}

	@Test
	public void testMerge() {
		int [] kyrz = { 3, 6, 8 , 2, 6, 9, };
		int [] post = {2 , 3,6,6,8,9};
		MergeSorter.merge(kyrz, 0, 2, 5);
		assertTrue(Arrays.equals(kyrz, post));
	}

}

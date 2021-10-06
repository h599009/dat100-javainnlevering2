package no.hvl.dat100.lab6.matriser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatriserEnhetsTester {

	static int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };
	static int[][] b = { {10,11,12}, {13,14,15}, {16,17,18} };
		
	@Test
	void testtilStreng() {
		
		assertEquals("1 2 3 \n4 5 6 \n7 8 9 \n",Matriser.tilStreng(a));
	}

	@Test
	void testSkaler() {
		
		int[][] skalert = { {2,4,6}, {8,10,12}, {14,16,18} };
		
		assertArrayEquals(skalert,Matriser.skaler(2,a));
	}
	
	
	
	@Test
	void testerLik() {
		
		assertTrue(Matriser.erLik(a, a));
		assertFalse(Matriser.erLik(a, b));
	}
}
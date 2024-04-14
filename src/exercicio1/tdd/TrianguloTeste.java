package exercicio1.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TrianguloTeste {

	@Test
	public void testEscalenoValido() {
		Integer lado1 = 3;
		Integer lado2 = 4;
		Integer lado3 = 5;
		String expected = "escaleno";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testIsoscelesValido() {
		Integer lado1 = 3;
		Integer lado2 = 3;
		Integer lado3 = 4;
		String expected = "isósceles";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testEquilateroValido() {
		Integer lado1 = 5;
		Integer lado2 = 5;
		Integer lado3 = 5;
		String expected = "equilátero";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testIsoscelesPermutacao1(){
		Integer lado1 = 3;
		Integer lado2 = 3;
		Integer lado3 = 5;
		String expected = "isósceles";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testIsoscelesPermutacao2() {
		Integer lado1 = 3;
		Integer lado2 = 5;
		Integer lado3 = 3;
		String expected = "isósceles";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testIsoscelesPermutacao3() {
		Integer lado1 = 5;
		Integer lado2 = 3;
		Integer lado3 = 3;
		String expected = "isósceles";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testValorZero() {
		Integer lado1 = 0;
		Integer lado2 = 2;
		Integer lado3 = 3;
		String expected = "não é um triângulo";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@Test
	public void testValorNegativo() {
		Integer lado1 = -1;
		Integer lado2 = 2;
		Integer lado3 = 3;
		String expected = "não é um triângulo";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
	@ParameterizedTest
	
	@CsvSource({
		"3, 4, 7",
		"5, 10, 15",
		"6, 7, 13",
		"-2, -3, -5"
	})
	public void testSomaDoisLadosIgualATerceiro(Integer lado1, Integer lado2, Integer lado3) {
		String expected = "não é um triângulo";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
	
    @ParameterizedTest
	
	@CsvSource({
		"3, 4, 7",
		"4, 3, 7",
		"7, 3, 4",
		"4, 7, 3",
		"7, 4, 3",
		"3, 7, 4",
		"-2, -3, -5",
		"-3, -2, -5",
		"-5, -2, -3",
		"-3, -5, -2",
		"-5, -3, -2",
		"-2, -5, -3",
	})
	public void testSomaDoisLadosIgualATerceiroPermutacao(Integer lado1, Integer lado2, Integer lado3) {
		String expected = "não é um triângulo";
		
		String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
		
		assertEquals(expected, resultado);
	}
    
    @ParameterizedTest
    @CsvSource({
        "1, 2, 5",
        "2, 3, 6",
        "3, 4, 8",
        "-2, -3, -6"
    })
    public void testSomaLadosMenorQueTerceiro(Integer lado1, Integer lado2, Integer lado3) {
    	String expected = "não é um triângulo";
    	
    	String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
    	
    	assertEquals(expected, resultado);
    }
    @ParameterizedTest
    @CsvSource({
        "1, 2, 5",
        "2, 1, 5",
        "5, 1, 2",
        "2, 5, 1",
        "5, 2, 1",
        "1, 5, 2",
        "2, 3, 6",
        "3, 2, 6",
        "6, 2, 3",
        "3, 6, 2",
        "6, 3, 2",
        "2, 6, 3",
        "3, 4, 8",
        "4, 3, 8",
        "8, 3, 4",
        "4, 8, 3",
        "8, 4, 3",
        "3, 8, 4",
        "-2, -3, -6",
        "-3, -2, -6",
        "-6, -2, -3",
        "-3, -6, -2",
        "-6, -3, -2",
        "-2, -6, -3"
    })
    public void testSomaLadosMenorQueTerceiroPermutacao(Integer lado1, Integer lado2, Integer lado3) {
    	String expected = "não é um triângulo";
    	
    	String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
    	
    	assertEquals(expected, resultado);
    }
    
    @Test
    public void testTodosValoresZero() {
    	Integer lado1 = 0;
    	Integer lado2 = 0;
    	Integer lado3 = 0;
    	String expected = "não é um triângulo";
    	
    	String resultado = Triangulo.classificarTriangulo(lado1, lado2, lado3);
    	
    	assertEquals(expected, resultado);
    }
}
;
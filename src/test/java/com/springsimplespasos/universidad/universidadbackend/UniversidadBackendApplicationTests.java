package com.springsimplespasos.universidad.universidadbackend;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UniversidadBackendApplicationTests {

	Calculadora calculadora = new Calculadora();

	@Test
	@DisplayName("Suma de valor A + B")
	void sumaDeValores() {
		int valorA = 2;
		int valorB = 3;

		int resultadoEsperado = calculadora.sumar(valorA, valorB);
		int expectativa = 5;
		//then
		assertThat(expectativa).isEqualTo(resultadoEsperado);

	}
	class Calculadora{
		int sumar(int valor_a, int valor_b){
			return valor_a + valor_b;
		}
	}

	@Test
	@DisplayName("Suma de valor A + B")
	@Disabled("Test Depregado")
	void testDesactivado(){
	}
	class Calculador{
		int sumar(int valor_a, int valor_b){
			return valor_a + valor_b;
		}
	}
}



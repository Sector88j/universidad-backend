package com.springsimplespasos.universidad.universidadbackend.repositorios;

import com.springsimplespasos.universidad.universidadbackend.datos.DatosDummy;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Carrera;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class CarreraRepositoryTest {
    @Autowired
    CarreraRepository carreraRepository;

    @BeforeEach
    void setup(){
        carreraRepository.save(DatosDummy.carrera01(false));
        carreraRepository.save(DatosDummy.carrera02());
        carreraRepository.save(DatosDummy.carrera03(false));
    }

    @Test
    void findCarrerasByNombreContains() {
        //carreraRepository.save(DatosDummy.carrera01(false));
        //carreraRepository.save(DatosDummy.carrera02());
        //carreraRepository.save(DatosDummy.carrera03(false));

        Iterable<Carrera> expected = carreraRepository.findCarrerasByNombreContains("Sistemas");

        assertThat(((List<Carrera>)expected).size()== 2).isTrue();

    }

    @Test
    void findCarrerasByNombreContainsIgnoreCase() {
    }

    @Test
    void findCarrerasByCantidadAniosAfter() {
    }
}
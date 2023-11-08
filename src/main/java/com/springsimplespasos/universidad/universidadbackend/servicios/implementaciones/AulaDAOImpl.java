package com.springsimplespasos.universidad.universidadbackend.servicios.implementaciones;

import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.Aula;
import com.springsimplespasos.universidad.universidadbackend.modelo.entidades.enumeradores.Pizarron;
import com.springsimplespasos.universidad.universidadbackend.repositorios.AulaRepository;
import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.AulaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class AulaDAOImpl extends GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO {

    @Autowired
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional(readOnly =true)
    public Iterable<Aula> findAulasByPizarron(Pizarron pizzaron) {
        return repository.findAulasByPizarron(pizzaron);
    }

    @Override
    @Transactional(readOnly =true)
    public Iterable<Aula> findAulasByPabellonNombre(String nombre) {
        return repository.findAulasByPabellonNombre(nombre);
    }

    @Override
    public Optional<Aula> findAulaByNroAula(Integer nroAula) {
        return repository.findAulaByNroAula(nroAula);
    }

}

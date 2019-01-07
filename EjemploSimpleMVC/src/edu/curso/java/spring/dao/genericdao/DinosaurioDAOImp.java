package edu.curso.java.spring.dao.genericdao;



import java.util.List;

import org.springframework.stereotype.Repository;

import edu.curso.java.spring.model.Dinosaurio;

@Repository
public class DinosaurioDAOImp extends GenericDAOImp<Dinosaurio, Long> implements DinosaurioDAO {

}

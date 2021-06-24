package br.com.rndtecnologia.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rndtecnologia.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}

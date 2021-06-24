package br.com.rndtecnologia.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rndtecnologia.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}

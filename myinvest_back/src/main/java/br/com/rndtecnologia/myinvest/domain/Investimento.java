package br.com.rndtecnologia.myinvest.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Investimento {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long codigo;
	
	private String codigoAtivo;
	
	private Double valorCotas;
	
	private Integer quantidadeCotas;
	
	private LocalDate dataCompra;
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCodigoAtivo() {
		return codigoAtivo;
	}

	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}

	public Double getValorCotas() {
		return valorCotas;
	}

	public void setValorCotas(Double valorCotas) {
		this.valorCotas = valorCotas;
	}

	public Integer getQuantidadeCotas() {
		return quantidadeCotas;
	}

	public void setQuantidadeCotas(Integer quantidadeCotas) {
		this.quantidadeCotas = quantidadeCotas;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codigoAtivo == null) ? 0 : codigoAtivo.hashCode());
		result = prime * result + ((dataCompra == null) ? 0 : dataCompra.hashCode());
		result = prime * result + ((quantidadeCotas == null) ? 0 : quantidadeCotas.hashCode());
		result = prime * result + ((valorCotas == null) ? 0 : valorCotas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investimento other = (Investimento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codigoAtivo == null) {
			if (other.codigoAtivo != null)
				return false;
		} else if (!codigoAtivo.equals(other.codigoAtivo))
			return false;
		if (dataCompra == null) {
			if (other.dataCompra != null)
				return false;
		} else if (!dataCompra.equals(other.dataCompra))
			return false;
		if (quantidadeCotas == null) {
			if (other.quantidadeCotas != null)
				return false;
		} else if (!quantidadeCotas.equals(other.quantidadeCotas))
			return false;
		if (valorCotas == null) {
			if (other.valorCotas != null)
				return false;
		} else if (!valorCotas.equals(other.valorCotas))
			return false;
		return true;
	}

}

package com.antoniolimajr.demoacmeap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniolimajr.demoacmeap.domain.Fatura;
import com.antoniolimajr.demoacmeap.domain.Instalacao;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

	public Optional<Fatura> findByCodigo(String codigo);

	public List<Fatura> findByInstalacao(Instalacao instalacao);

}

package br.com.rodrigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigo.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long>{

	Cambio findByFromAndTo(String from, String to);
}

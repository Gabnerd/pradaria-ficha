package br.com.pescaroli.pradariaficha.repository;

import br.com.pescaroli.pradariaficha.model.Heroi;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HeroiRepository extends CrudRepository<Heroi, Integer> {

}

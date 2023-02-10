package cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.domain.Fruta;

public interface FrutaService {
	Fruta add(Fruta f);
	List<Fruta> getAll();
	Fruta getOne(Integer id);
	void delete(Integer id);
	Fruta update(Fruta f);
	
	
	

}

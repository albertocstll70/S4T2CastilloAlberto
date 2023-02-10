package cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.domain.Fruta;
import cat.itacademy.barcelonactiva.castillo.corporan.alberto.s04.t02.n01.S04T02N01CastilloCorporanAlberto.model.repository.FrutaRepository;

@Service("FrutaServiceDB")
public class FrutaSerciceDB implements FrutaService {
	
    @Autowired
	private FrutaRepository repositorio;
	
	@Override
	public Fruta add(Fruta f) {
		
		return repositorio.save(f);
	}

	@Override
	public List<Fruta> getAll() {
		
		return  (List<Fruta>) repositorio.findAll();
	}

	

	@Override
	public Fruta update(Fruta f) {
	
		return repositorio.save(f);
	}

	@Override
	public void delete(Integer id) {
		 repositorio.deleteById(id);
	}

	

	@Override
	public Fruta getOne(Integer id) {
		
		return repositorio.findById(id).orElse(null);
	}

	

}

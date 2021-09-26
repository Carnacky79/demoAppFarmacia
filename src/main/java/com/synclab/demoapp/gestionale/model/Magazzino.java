package com.synclab.demoapp.gestionale.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.FetchType;
import io.github.kaiso.relmongo.annotation.JoinProperty;
import io.github.kaiso.relmongo.annotation.OneToMany;
import lombok.Data;

@Data
@Document(collection = "magazzino")
public class Magazzino {
	
	@Id
	private Integer id;
	
	private String nomeMagazzino;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinProperty(name = "magazzinoProdotti")
	private List<ProdottiMagazzino> magazzinoProdotti;
}

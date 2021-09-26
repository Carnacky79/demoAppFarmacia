package com.synclab.demoapp.gestionale.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.FetchType;
import io.github.kaiso.relmongo.annotation.JoinProperty;
import io.github.kaiso.relmongo.annotation.ManyToOne;
import io.github.kaiso.relmongo.annotation.OneToMany;
import lombok.Data;


@Data
@Document(collection = "movimentiMagazzino")
public class MovimentoMagazzino {
	
	@Id
	private Integer  id;
	
	@Indexed(unique = true, direction = IndexDirection.ASCENDING)
	private Date dataMovimento;
	
	private String tipoMovimento;
	
	private Integer quantitaMovimento;
	
	@ManyToOne(mappedBy = "movimenti")
	private User user;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinProperty(name = "magazzinoProdottiQuantitaPrezzo")
	private List<ProdottiQuantitaPrezzo> movimentoProdotti;
	
}

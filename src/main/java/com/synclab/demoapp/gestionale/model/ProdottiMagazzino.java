package com.synclab.demoapp.gestionale.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.kaiso.relmongo.annotation.ManyToOne;
import lombok.Data;

@Data
@Document(collection = "prodottiMagazzino")
public class ProdottiMagazzino {

	@Id
	private Integer id;

	private BigInteger disponibilita;

	@ManyToOne(mappedBy = "prodottoMagazzino")
	private Prodotti prodotto;

	@ManyToOne(mappedBy = "magazzinoProdotti")
	private Magazzino magazzino;

}

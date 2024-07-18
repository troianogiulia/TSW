package it.unisa.model;

import java.io.Serializable;

public class ProdottoBean implements Serializable {

private static final long serialVersionUID = 1L;

	public ProdottoBean() {
		
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}
	

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public int getQuantita() {
		return quantita;
	}
	
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	
	public boolean isInVendita() {
		return inVendita;
	}
	
	public void setInVendita(boolean inVendita) {
		this.inVendita = inVendita;
	}
	
	public String getIva() {
		return iva;
	}
	
	public void setIva(String iva) {
		this.iva = iva;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getCategoria() {
		return Categoria;
	}
	
	public void setCategoria(String Categoria) {
		this.Categoria = Categoria;
	}
	
	public String getImmagine() {
		return immagine;
	}
	
	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}
	
	public String getDescrizioneDettagliata() {
		return descrizioneDettagliata;
	}
	
	public void setDescrizioneDettagliata(String descrizioneDettagliata) {
		this.descrizioneDettagliata = descrizioneDettagliata;
	}
	
	
	@Override
	public String toString() {
		return nome +", " + idProdotto +", " + prezzo +", " + descrizione +", " + quantita +", " + Categoria+", "+ immagine+", " +iva;
	}

	private int idProdotto;
	private String nome;
	private String descrizione;
	private int quantita;
	private boolean inVendita;
	private String iva;
	private double prezzo;
	private String immagine;
	private String Categoria;
	private String descrizioneDettagliata;
}
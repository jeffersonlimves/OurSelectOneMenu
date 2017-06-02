package br.com.bean.java;

public enum TipoProfissao {

	ESTUDANTE("Estudante"),
	ARQUITETO("Arquiteto"),
	ENGENHEIRO_CIVIL("Engenheiro Civil"),
	ENGENHEIRO_ELETRONICO("Engenheiro Eletrônico"),
	ENGENHEIRO_MECANICO("Engenheiro Mecânico");
	
	private String tipo;

	private TipoProfissao(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}

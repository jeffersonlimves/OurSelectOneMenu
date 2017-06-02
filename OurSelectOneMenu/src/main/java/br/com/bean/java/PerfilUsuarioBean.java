package br.com.bean.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="perfilUsuarioBean")
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String profissao;
	private TipoProfissao tipoProf;
	private List<TipoProfissao> listTipoProfissao;
	private Map<String,String> listProfissoes;
	
	public void atualizar(){
		System.out.println("Nome="+this.nome);
		System.out.println("Tipo profissao (Enum)="+this.tipoProf);
		System.out.println("Profissao (String)="+this.profissao);
		
		if(tipoProf instanceof TipoProfissao){
			System.out.println("O que veio eh realmente um enum!");
			System.out.println("TipoProfissao="+tipoProf);
		}

		if(tipoProf == null ){
			System.out.println("O tipoProf eh ="+tipoProf);
			System.out.println("TipoProfissao="+tipoProf);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado"));
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<TipoProfissao> getListTipoProfissao() {
		if(listTipoProfissao == null){
			listTipoProfissao = new  ArrayList<TipoProfissao>();
			for (TipoProfissao tipoProfissao : TipoProfissao.values()) {
				listTipoProfissao.add(tipoProfissao);
				
			}
		}
		return listTipoProfissao;
	}

	public void setListTipoProfissao(List<TipoProfissao> listTipoProfissao) {
		this.listTipoProfissao = listTipoProfissao;
	}
	

	public TipoProfissao getTipoProf() {
		return tipoProf;
	}

	public void setTipoProf(TipoProfissao tipoProf) {
		this.tipoProf = tipoProf;
	}

	public Map<String, String> getListProfissoes() {
		
		if(listProfissoes == null){
			listProfissoes = new  HashMap<String,String>();
			
			listProfissoes.put("Studante",  "STUDANTE");//chave==>label,valor==>o que sera salvo
			listProfissoes.put("Professor", "PROFESSOR");
			listProfissoes.put("Diretor",   "DIRETOR");
			listProfissoes.put("Supervisor","SUPERVISOR");
		}
		
		return listProfissoes;
	}

	public void setListProfissoes(Map<String, String> listProfissoes) {
		this.listProfissoes = listProfissoes;
	}

	
	public TipoProfissao[] getArrayTipoProfissao() {
		return TipoProfissao.values();
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	
	
	
}

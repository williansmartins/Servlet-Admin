package br.com.waiso.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="cartao")
public class CartaoEntity implements Serializable{

	private static final long serialVersionUID = -3689382195454890010L;

	@Id @GeneratedValue
	private Integer id;
	private String banco;
	private String agencia;
	private String conta;
	private String gerente;
	private String senhaCartao;
	private String senhaInternet;
	private String senhaLetras;
	private String senhaToken;
	
	public CartaoEntity() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public String getSenhaCartao() {
		return senhaCartao;
	}

	public void setSenhaCartao(String senhaCartao) {
		this.senhaCartao = senhaCartao;
	}

	public String getSenhaInternet() {
		return senhaInternet;
	}

	public void setSenhaInternet(String senhaInternet) {
		this.senhaInternet = senhaInternet;
	}

	public String getSenhaLetras() {
		return senhaLetras;
	}

	public void setSenhaLetras(String senhaLetras) {
		this.senhaLetras = senhaLetras;
	}

	public String getSenhaToken() {
		return senhaToken;
	}

	public void setSenhaToken(String senhaToken) {
		this.senhaToken = senhaToken;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}

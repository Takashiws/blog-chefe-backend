package com.api.blogchefe.models;

import java.time.LocalDate;

public class Post {

	private Long idPost;
	private String tituloPost;
	private String autor;
	private LocalDate dataPost;
	private String conteudoPost;
	
	public Long getIdPost() {
		return idPost;
	}
	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}
	public String getTituloPost() {
		return tituloPost;
	}
	public void setTituloPost(String tituloPost) {
		this.tituloPost = tituloPost;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public LocalDate getDataPost() {
		return dataPost;
	}
	public void setDataPost(LocalDate dataPost) {
		this.dataPost = dataPost;
	}
	public String getConteudoPost() {
		return conteudoPost;
	}
	public void setConteudoPost(String conteudoPost) {
		this.conteudoPost = conteudoPost;
	}
	
	
}

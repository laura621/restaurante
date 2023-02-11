package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")

public class usuario {

	private Integer id;
	private String nombre;
	private String apellido;
	private String tipo_doc;
	private Integer numidentificacion;
	private String email;
	private Boolean rol;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name = "APELLIDO")
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Column(name = "TIPO_DOC")
	public String getTipo_doc() {
		return tipo_doc;
	}
	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	@Column(name = "NUMIDENFITICACION")
	public Integer getNumidentificacion() {
		return numidentificacion;
	}
	public void setNumidentificacion(Integer numidentificacion) {
		this.numidentificacion = numidentificacion;
	}
	@Column(name = "EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "ROL")
	public Boolean getRol() {
		return rol;
	}
	public void setRol(Boolean rol) {
		this.rol = rol;
	}
	
	
	
}

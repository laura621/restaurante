package com.example.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="RESERVA")

public class reserva {
	
	    private Integer id;
	    private Date fe_reserva;
		private String tiporeserva;
		private Integer cantperonas;
		private String descripcion;
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		
		@Column(name = "FE_RESERVA")
		public Date getFe_reserva() {
			return fe_reserva;
		}
		
		public void setFe_reserva(Date fe_reserva) {
			this.fe_reserva = fe_reserva;
		}
		
		@Column(name = "TIPORESERVA")
		public String getTiporeserva() {
			return tiporeserva;
		}
		public void setTiporeserva(String tiporeserva) {
			this.tiporeserva = tiporeserva;
		}
		@Column(name = "CANTPERSONAS")
		public Integer getCantperonas() {
			return cantperonas;
		}
		public void setCantperonas(Integer cantperonas) {
			this.cantperonas = cantperonas;
		}
		@Column(name = "DESCRIPCION")
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		

}

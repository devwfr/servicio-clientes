package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Direccion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-18T03:48:12.379Z")

@Entity
@DynamicUpdate
@Table(name = "DIRECCION")
public class Direccion {

	
	/*
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "idcliente")
	private Cliente cliente;
	*/
	
	
	@Column(name = "IDDIRECCION")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("iddireccion")
	private Integer idDireccion = null;

	@Column(name = "IDCLIENTE")
	@JsonProperty("idcliente")
	private Integer idCliente = null;

	@Column(name = "direccion")
	@JsonProperty("direccion")
	private String direccion = null;

	@Column(name = "pais")
	@JsonProperty("pais")
	private String pais = null;

	@Column(name = "ciudad")
	@JsonProperty("ciudad")
	private String ciudad = null;

	@Column(name = "tipodireccion")
	@JsonProperty("tipodireccion")
	private String tipodireccion = null;

	@Column(name = "estado")
	@JsonProperty("estado")
	private String estado = null;

	public Direccion idDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
		return this;
	}

	/**
	 * Get idDireccion
	 * 
	 * @return idDireccion
	 **/
	@ApiModelProperty(value = "")

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Direccion idCliente(Integer idCliente) {
		this.idCliente = idCliente;
		return this;
	}

	/**
	 * Get idCliente
	 * 
	 * @return idCliente
	 **/
	@ApiModelProperty(value = "")

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Direccion direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	/**
	 * Get direccion
	 * 
	 * @return direccion
	 **/
	@ApiModelProperty(value = "")

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Direccion pais(String pais) {
		this.pais = pais;
		return this;
	}

	/**
	 * Get pais
	 * 
	 * @return pais
	 **/
	@ApiModelProperty(value = "")

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Direccion ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	/**
	 * Get ciudad
	 * 
	 * @return ciudad
	 **/
	@ApiModelProperty(value = "")

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Direccion tipodireccion(String tipodireccion) {
		this.tipodireccion = tipodireccion;
		return this;
	}

	/**
	 * Get tipodireccion
	 * 
	 * @return tipodireccion
	 **/
	@ApiModelProperty(value = "")

	public String getTipodireccion() {
		return tipodireccion;
	}

	public void setTipodireccion(String tipodireccion) {
		this.tipodireccion = tipodireccion;
	}

	public Direccion estado(String estado) {
		this.estado = estado;
		return this;
	}

	/**
	 * Get estado
	 * 
	 * @return estado
	 **/
	@ApiModelProperty(value = "")

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Direccion direccion = (Direccion) o;
		return Objects.equals(this.idDireccion, direccion.idDireccion)
				&& Objects.equals(this.idCliente, direccion.idCliente)
				&& Objects.equals(this.direccion, direccion.direccion) && Objects.equals(this.pais, direccion.pais)
				&& Objects.equals(this.ciudad, direccion.ciudad)
				&& Objects.equals(this.tipodireccion, direccion.tipodireccion)
				&& Objects.equals(this.estado, direccion.estado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDireccion, idCliente, direccion, pais, ciudad, tipodireccion, estado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Direccion {\n");

		sb.append("    idDireccion: ").append(toIndentedString(idDireccion)).append("\n");
		sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    tipodireccion: ").append(toIndentedString(tipodireccion)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

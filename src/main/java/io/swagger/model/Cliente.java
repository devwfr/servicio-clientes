package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Clientes de la plataforma Kallsonys
 */
@ApiModel(description = "Clientes de la plataforma Kallsonys")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-18T03:06:55.979Z")

@Entity
@DynamicUpdate
@Table(name = "CLIENTE")
public class Cliente {
	/*
	@OneToMany(mappedBy = "cliente")
	private List<Direccion> listaDirecciones;
	 */
	
	@Column(name = "idcliente")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("idCliente")
	private Integer idCliente = null;

	@Column(name = "usuario")
	@JsonProperty("usuario")
	private String usuario = null;

	@Column(name = "password")
	@JsonProperty("password")
	private String password = null;

	@Column(name = "apellido")
	@JsonProperty("apellido")
	private String apellido = null;

	@Column(name = "nombre")
	@JsonProperty("nombre")
	private String nombre = null;

	@Column(name = "telefono")
	@JsonProperty("telefono")
	private String telefono = null;

	@Column(name = "email")
	@JsonProperty("email")
	private String email = null;

	@Column(name = "estado")
	@JsonProperty("estado")
	private String estado = null;

	@Column(name = "idcategoria")
	@JsonProperty("idCategoria")
	private Integer idCategoria = null;

	@Column(name = "origen")
	@JsonProperty("origen")
	private String origen = null;
	



	public Cliente idCliente(Integer idCliente) {
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

	public Cliente usuario(String usuario) {
		this.usuario = usuario;
		return this;
	}

	/**
	 * Get usuario
	 * 
	 * @return usuario
	 **/
	@ApiModelProperty(value = "")

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Cliente password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "")

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Cliente apellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	/**
	 * Get apellido
	 * 
	 * @return apellido
	 **/
	@ApiModelProperty(value = "")

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Cliente nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * Get nombre
	 * 
	 * @return nombre
	 **/
	@ApiModelProperty(value = "")

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente telefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	/**
	 * Get telefono
	 * 
	 * @return telefono
	 **/
	@ApiModelProperty(value = "")

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Cliente email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Get email
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "")

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cliente estado(String estado) {
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

	public Cliente idCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
		return this;
	}

	/**
	 * Get idCategoria
	 * 
	 * @return idCategoria
	 **/
	@ApiModelProperty(value = "")

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Cliente origen(String origen) {
		this.origen = origen;
		return this;
	}

	/**
	 * Get origen
	 * 
	 * @return origen
	 **/
	@ApiModelProperty(value = "")

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) o;
		return Objects.equals(this.idCliente, cliente.idCliente) && Objects.equals(this.usuario, cliente.usuario)
				&& Objects.equals(this.password, cliente.password) && Objects.equals(this.apellido, cliente.apellido)
				&& Objects.equals(this.nombre, cliente.nombre) && Objects.equals(this.telefono, cliente.telefono)
				&& Objects.equals(this.email, cliente.email) && Objects.equals(this.estado, cliente.estado)
				&& Objects.equals(this.idCategoria, cliente.idCategoria) && Objects.equals(this.origen, cliente.origen);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCliente, usuario, password, apellido, nombre, telefono, email, estado, idCategoria,
				origen);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Cliente {\n");

		sb.append("    idCliente: ").append(toIndentedString(idCliente)).append("\n");
		sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    apellido: ").append(toIndentedString(apellido)).append("\n");
		sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    idCategoria: ").append(toIndentedString(idCategoria)).append("\n");
		sb.append("    origen: ").append(toIndentedString(origen)).append("\n");
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

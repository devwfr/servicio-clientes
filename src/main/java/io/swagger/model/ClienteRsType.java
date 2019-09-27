package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cliente;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClienteRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

public class ClienteRsType {

	public ClienteRsType() {
	}

	public ClienteRsType(StatusType status, Cliente cliente) {
		this.status = status;
		this.cliente = cliente;
	}

	@JsonProperty("status")
	private StatusType status = null;

	@JsonProperty("cliente")
	private Cliente cliente = null;

	public ClienteRsType status(StatusType status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public ClienteRsType cliente(Cliente cliente) {
		this.cliente = cliente;
		return this;
	}

	/**
	 * Get cliente
	 * 
	 * @return cliente
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClienteRsType clienteRsType = (ClienteRsType) o;
		return Objects.equals(this.status, clienteRsType.status) && Objects.equals(this.cliente, clienteRsType.cliente);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, cliente);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClienteRsType {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
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

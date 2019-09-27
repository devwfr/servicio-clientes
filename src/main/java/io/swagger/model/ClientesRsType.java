package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Clientes;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * clientes.
 */
@ApiModel(description = "clientes.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

public class ClientesRsType {

	public ClientesRsType() {
		
	}
	
	public ClientesRsType(StatusType status, Clientes clientes) {
		this.status = status;
		this.clientes = clientes;
	}

	@JsonProperty("status")
	private StatusType status = null;

	@JsonProperty("clientes")
	private Clientes clientes = null;

	public ClientesRsType status(StatusType status) {
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

	public ClientesRsType clientes(Clientes clientes) {
		this.clientes = clientes;
		return this;
	}

	/**
	 * Get clientes
	 * 
	 * @return clientes
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClientesRsType clientesRsType = (ClientesRsType) o;
		return Objects.equals(this.status, clientesRsType.status)
				&& Objects.equals(this.clientes, clientesRsType.clientes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, clientes);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClientesRsType {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    clientes: ").append(toIndentedString(clientes)).append("\n");
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

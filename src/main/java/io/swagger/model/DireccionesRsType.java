package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Direcciones;
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

public class DireccionesRsType {

	public DireccionesRsType() {
	}
	
	public DireccionesRsType(StatusType status, Direcciones direcciones) {
		this.status = status;
		this.direcciones = direcciones;
	}

	@JsonProperty("status")
	private StatusType status = null;

	@JsonProperty("direcciones")
	private Direcciones direcciones = null;

	public DireccionesRsType status(StatusType status) {
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

	public DireccionesRsType direcciones(Direcciones direcciones) {
		this.direcciones = direcciones;
		return this;
	}

	/**
	 * Get direcciones
	 * 
	 * @return direcciones
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Direcciones getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Direcciones direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DireccionesRsType direccionesRsType = (DireccionesRsType) o;
		return Objects.equals(this.status, direccionesRsType.status)
				&& Objects.equals(this.direcciones, direccionesRsType.direcciones);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, direcciones);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DireccionesRsType {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    direcciones: ").append(toIndentedString(direcciones)).append("\n");
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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StatusType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecCredRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

public class RecCredRsType {

	public RecCredRsType() {
	}
	
	public RecCredRsType(StatusType status, Boolean autenticacion) {
		this.status = status;
		this.autenticacion = autenticacion;
	}

	@JsonProperty("status")
	private StatusType status = null;

	@JsonProperty("autenticacion")
	private Boolean autenticacion = null;

	public RecCredRsType status(StatusType status) {
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

	public RecCredRsType autenticacion(Boolean autenticacion) {
		this.autenticacion = autenticacion;
		return this;
	}

	/**
	 * Estado de envio correo
	 * 
	 * @return autenticacion
	 **/
	@ApiModelProperty(value = "Estado de envio correo")

	public Boolean isAutenticacion() {
		return autenticacion;
	}

	public void setAutenticacion(Boolean autenticacion) {
		this.autenticacion = autenticacion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecCredRsType recCredRsType = (RecCredRsType) o;
		return Objects.equals(this.status, recCredRsType.status)
				&& Objects.equals(this.autenticacion, recCredRsType.autenticacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, autenticacion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecCredRsType {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    autenticacion: ").append(toIndentedString(autenticacion)).append("\n");
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

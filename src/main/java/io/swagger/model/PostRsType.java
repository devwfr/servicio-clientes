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
 * PostRsType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

public class PostRsType {

	public PostRsType() {
	}
	
	public PostRsType(StatusType status, Integer idClienteCreado) {
		this.status = status;
		this.idClienteCreado = idClienteCreado;
	}

	@JsonProperty("status")
	private StatusType status = null;

	@JsonProperty("idClienteCreado")
	private Integer idClienteCreado = null;

	public PostRsType status(StatusType status) {
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

	public PostRsType idClienteCreado(Integer idClienteCreado) {
		this.idClienteCreado = idClienteCreado;
		return this;
	}

	/**
	 * idCreado.
	 * 
	 * @return idClienteCreado
	 **/
	@ApiModelProperty(value = "idCreado.")

	public Integer getIdClienteCreado() {
		return idClienteCreado;
	}

	public void setIdClienteCreado(Integer idClienteCreado) {
		this.idClienteCreado = idClienteCreado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PostRsType postRsType = (PostRsType) o;
		return Objects.equals(this.status, postRsType.status)
				&& Objects.equals(this.idClienteCreado, postRsType.idClienteCreado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, idClienteCreado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PostRsType {\n");

		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    idClienteCreado: ").append(toIndentedString(idClienteCreado)).append("\n");
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

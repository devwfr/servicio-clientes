package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Status de respuesta.
 */
@ApiModel(description = "Status de respuesta.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

public class StatusType {

	public StatusType(Integer statusCode, String statusDesc) {
		this.statusCode = statusCode;
		this.statusDesc = statusDesc;
	}
	
	public StatusType() {
	}

	@JsonProperty("statusCode")
	private Integer statusCode = null;

	@JsonProperty("statusDesc")
	private String statusDesc = null;

	public StatusType statusCode(Integer statusCode) {
		this.statusCode = statusCode;
		return this;
	}

	/**
	 * Código de status.
	 * 
	 * @return statusCode
	 **/
	@ApiModelProperty(value = "Código de status.")

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public StatusType statusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
		return this;
	}

	/**
	 * Descripción de estatus.
	 * 
	 * @return statusDesc
	 **/
	@ApiModelProperty(value = "Descripción de estatus.")

	public String getStatusDesc() {
		return statusDesc;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		StatusType statusType = (StatusType) o;
		return Objects.equals(this.statusCode, statusType.statusCode)
				&& Objects.equals(this.statusDesc, statusType.statusDesc);
	}

	@Override
	public int hashCode() {
		return Objects.hash(statusCode, statusDesc);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class StatusType {\n");

		sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
		sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
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

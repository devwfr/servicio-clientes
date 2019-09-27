package io.swagger.api;

import io.swagger.model.Clientes;
import io.swagger.model.ClientesRsType;
import io.swagger.model.StatusType;
import io.swagger.service.ClienteService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-21T18:31:55.482Z")

@Controller
public class ClientesApiController implements ClientesApi {

    private static final Logger log = LoggerFactory.getLogger(ClientesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    @Autowired
    ClienteService clienteService;

    @org.springframework.beans.factory.annotation.Autowired
    public ClientesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ClientesRsType> consultarClientes(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID) {
        String accept = request.getHeader("Accept");
if (accept != null && accept.contains("application/json")) {
        	
        	Clientes clientes = new Clientes();
        	clientes.addAll(clienteService.listarAllClientes());
        	
        	ClientesRsType response = new ClientesRsType(
        			new StatusType(200,"Consulta Realizada Correctaente"),clientes);
        	
        	return new ResponseEntity<ClientesRsType>(response,HttpStatus.OK);
        	

        }
        return new ResponseEntity<ClientesRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}

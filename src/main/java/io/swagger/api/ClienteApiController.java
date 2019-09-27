package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.model.ClienteRsType;
import io.swagger.model.Direccion;
import io.swagger.model.Direcciones;
import io.swagger.model.DireccionesRsType;
import io.swagger.model.PostRsType;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-22T23:02:22.485Z")

@Controller
public class ClienteApiController implements ClienteApi {

    private static final Logger log = LoggerFactory.getLogger(ClienteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    ClienteService clienteService;

    @org.springframework.beans.factory.annotation.Autowired
    public ClienteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<StatusType> actualizarCategoriaCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "idCliente",required=true) @PathVariable("idCliente") Integer idCliente,@ApiParam(value = "categoria del cliente",required=true) @PathVariable("idcategoria") Integer idcategoria) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            int result = clienteService.actualizarCategoria(idCliente, idcategoria);
			StatusType response = new StatusType(200,"Registros actualizados: "+result);
			return new ResponseEntity<StatusType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<StatusType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<StatusType> actualizarClientePorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Cliente a registrar" ,required=true )  @Valid @RequestBody Cliente cliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            
    		clienteService.actualizarClientePorId(cliente);
    		StatusType response = new StatusType(200,"Actualizacion realizada correctamente");
    		return new ResponseEntity<StatusType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<StatusType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<StatusType> actualizarDireccion(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "id usuario actualizar direccion",required=true) @PathVariable("idUsuario") Integer idUsuario,@ApiParam(value = "idUsuario direccion",required=true) @PathVariable("idDireccion") Integer idDireccion,@ApiParam(value = "direccion actualizar" ,required=true )  @Valid @RequestBody Direccion direccion) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {   
        	
        	clienteService.actualizarDireccion(direccion);
        	StatusType response = new StatusType(200,"Actualizacion realizada correctamente");
    		return new ResponseEntity<StatusType>(response, HttpStatus.OK);           
        }

        return new ResponseEntity<StatusType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ClienteRsType> consultarClientePorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del cliente a consultar",required=true) @PathVariable("idCliente") Integer idCliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	ClienteRsType response = new ClienteRsType();
        	response.setStatus(new StatusType(200,"Consulta realizada correctamente"));
        	response.setCliente(clienteService.getClienteById(idCliente));
        	return new ResponseEntity<ClienteRsType>(response,HttpStatus.OK);
        }

        return new ResponseEntity<ClienteRsType>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<ClienteRsType> consultarClientePorUsuario(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario del cliente a consultar",required=true) @PathVariable("usuario") String usuario) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            ClienteRsType response = new ClienteRsType();
			response.setStatus(new StatusType(200,"Consulta Realizada correctamente"));
			response.setCliente(clienteService.getClienteByUser(usuario));
			
			return new ResponseEntity<ClienteRsType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<ClienteRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DireccionesRsType> direccionesCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario a consultar",required=true) @PathVariable("usuario") String usuario) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	
        	DireccionesRsType response = new DireccionesRsType();        	
        	Direcciones direcciones = new Direcciones();
        	direcciones.addAll(clienteService.getDireccionesByUser(usuario));        	
        	response.setDirecciones(direcciones);
        	response.setStatus(new StatusType(200,"Consulta Realizada Correctamente"));        	
            return new ResponseEntity<DireccionesRsType>(response, HttpStatus.OK);           
        }

        return new ResponseEntity<DireccionesRsType>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<StatusType> recuperarCredencialesCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario a recuperar credenciales",required=true) @PathVariable("usuario") String usuario) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            clienteService.recuperarCredenciales(usuario);
			StatusType response = new StatusType(200,"Operacion Realizada Correctamente");
			
			return new ResponseEntity<StatusType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<StatusType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PostRsType> registrarCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Cliente a registrar" ,required=true )  @Valid @RequestBody Cliente cliente) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            clienteService.crearCliente(cliente);
			PostRsType response = new PostRsType();
			response.setIdClienteCreado(cliente.getIdCliente());
			response.setStatus(new StatusType(200,"Registro realizado correctamente"));
			return new ResponseEntity<PostRsType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<PostRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PostRsType> registrarDireccion(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "direccion a registrar direccion" ,required=true )  @Valid @RequestBody Direccion direccion) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            clienteService.crearDireccion(direccion);
			PostRsType response = new PostRsType();            	
			response.setIdClienteCreado(direccion.getIdCliente());
			response.setStatus(new StatusType(200,"Registro realizado correctamente"));
			return new ResponseEntity<PostRsType>(response, HttpStatus.OK);
        }

        return new ResponseEntity<PostRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}

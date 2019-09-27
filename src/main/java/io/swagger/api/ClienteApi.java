/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.model.ClienteRsType;
import io.swagger.model.Direccion;
import io.swagger.model.DireccionesRsType;
import io.swagger.model.PostRsType;
import io.swagger.model.StatusType;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-22T23:02:22.485Z")

@Api(value = "cliente", description = "the cliente API")
public interface ClienteApi {

    @ApiOperation(value = "Actualizar categoria del cliente", nickname = "actualizarCategoriaCliente", notes = "Actualizar categoria del cliente", response = StatusType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = StatusType.class),
        @ApiResponse(code = 400, message = "Bad request", response = StatusType.class),
        @ApiResponse(code = 404, message = "Not found", response = StatusType.class) })
    @RequestMapping(value = "/cliente/{idCliente}/categoria/{idcategoria}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<StatusType> actualizarCategoriaCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "idCliente",required=true) @PathVariable("idCliente") Integer idCliente,@ApiParam(value = "categoria del cliente",required=true) @PathVariable("idcategoria") Integer idcategoria);


    @ApiOperation(value = "Actualizar Cliente", nickname = "actualizarClientePorId", notes = "Actualizar un cliente", response = StatusType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = StatusType.class),
        @ApiResponse(code = 400, message = "Bad request", response = StatusType.class),
        @ApiResponse(code = 404, message = "Not found", response = StatusType.class) })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<StatusType> actualizarClientePorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Cliente a registrar" ,required=true )  @Valid @RequestBody Cliente cliente);


    @ApiOperation(value = "Actualizar Direccion", nickname = "actualizarDireccion", notes = "Actualizar Direccion", response = StatusType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = StatusType.class),
        @ApiResponse(code = 400, message = "Bad request", response = StatusType.class),
        @ApiResponse(code = 404, message = "Not found", response = StatusType.class) })
    @RequestMapping(value = "/cliente/{idUsuario}/direccion/{idDireccion}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<StatusType> actualizarDireccion(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "id usuario actualizar direccion",required=true) @PathVariable("idUsuario") Integer idUsuario,@ApiParam(value = "idUsuario direccion",required=true) @PathVariable("idDireccion") Integer idDireccion,@ApiParam(value = "direccion actualizar" ,required=true )  @Valid @RequestBody Direccion direccion);


    @ApiOperation(value = "Consultar Cliente por ID", nickname = "consultarClientePorId", notes = "Retorna un Cliente", response = ClienteRsType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ClienteRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClienteRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ClienteRsType.class) })
    @RequestMapping(value = "/cliente/{idCliente}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ClienteRsType> consultarClientePorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del cliente a consultar",required=true) @PathVariable("idCliente") Integer idCliente);


    @ApiOperation(value = "Consultar Cliente por usuario", nickname = "consultarClientePorUsuario", notes = "Retorna un cliente", response = ClienteRsType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ClienteRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ClienteRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ClienteRsType.class) })
    @RequestMapping(value = "/cliente/usuario/{usuario}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ClienteRsType> consultarClientePorUsuario(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario del cliente a consultar",required=true) @PathVariable("usuario") String usuario);


    @ApiOperation(value = "Consultar Todos las direcciones asociadas a un cliente", nickname = "direccionesCliente", notes = "Retorna Todos las direcciones asociadas a un cliente", response = DireccionesRsType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = DireccionesRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = DireccionesRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = DireccionesRsType.class) })
    @RequestMapping(value = "/cliente/{usuario}/direcciones",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DireccionesRsType> direccionesCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario a consultar",required=true) @PathVariable("usuario") String usuario);


    @ApiOperation(value = "Recuperar credenciales cliente", nickname = "recuperarCredencialesCliente", notes = "Recuperar credenciales cliente", response = StatusType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = StatusType.class),
        @ApiResponse(code = 400, message = "Bad request", response = StatusType.class),
        @ApiResponse(code = 404, message = "Not found", response = StatusType.class) })
    @RequestMapping(value = "/cliente/{usuario}/recuperar-credenciales",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<StatusType> recuperarCredencialesCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "usuario a recuperar credenciales",required=true) @PathVariable("usuario") String usuario);


    @ApiOperation(value = "Registrar un Cliente", nickname = "registrarCliente", notes = "", response = PostRsType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = PostRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = PostRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = PostRsType.class) })
    @RequestMapping(value = "/cliente",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PostRsType> registrarCliente(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Cliente a registrar" ,required=true )  @Valid @RequestBody Cliente cliente);


    @ApiOperation(value = "Registrar Direccion", nickname = "registrarDireccion", notes = "Registrar Direccion", response = PostRsType.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = PostRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = PostRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = PostRsType.class) })
    @RequestMapping(value = "/cliente/direccion",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<PostRsType> registrarDireccion(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servKallcli" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "direccion a registrar direccion" ,required=true )  @Valid @RequestBody Direccion direccion);

}
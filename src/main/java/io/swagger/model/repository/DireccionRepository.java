package io.swagger.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.swagger.model.Direccion;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,Integer>{
	
	@Query(value="SELECT d.* FROM DIRECCION d , cliente c\r\n" + 
			"WHERE d.IDCLIENTE = c.IDCLIENTE\r\n" + 
			"AND c.USUARIO = ?1", nativeQuery = true)
	List<Direccion> getDireccionesByUser(String usuario);

}

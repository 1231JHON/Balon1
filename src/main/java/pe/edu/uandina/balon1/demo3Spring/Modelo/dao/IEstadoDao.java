package pe.edu.uandina.balon1.demo3Spring.Modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.balon1.demo3Spring.Modelo.Estado;

public interface IEstadoDao extends CrudRepository<Estado,Long> {
}

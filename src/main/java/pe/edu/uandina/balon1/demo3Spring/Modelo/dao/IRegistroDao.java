package pe.edu.uandina.balon1.demo3Spring.Modelo.dao;

import org.springframework.data.repository.CrudRepository;
import pe.edu.uandina.balon1.demo3Spring.Modelo.Registro;

public interface IRegistroDao extends CrudRepository<Registro,Long> {
}

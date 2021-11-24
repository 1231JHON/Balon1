package pe.edu.uandina.balon1.demo3Spring.Modelo.services;

import pe.edu.uandina.balon1.demo3Spring.Modelo.Accion;

import java.util.List;

public interface IAccionService {
    public List<Accion>findAll();
    public Accion findById(Long id);
    public Accion save(Accion accion);
    public void delete(Long id);
}

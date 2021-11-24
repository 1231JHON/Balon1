package pe.edu.uandina.balon1.demo3Spring.Modelo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.uandina.balon1.demo3Spring.Modelo.Accion;
import pe.edu.uandina.balon1.demo3Spring.Modelo.dao.IAccionDao;


import java.util.List;
@Service

public class AccionServicelmpl implements IAccionService{

    @Autowired
    private IAccionDao accionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Accion> findAll(){
        return (List<Accion>) accionDao.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Accion findById(Long id) {
        return accionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Accion save(Accion accion) {
        return accionDao.save(accion);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        accionDao.deleteById(id);
    }

}

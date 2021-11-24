package pe.edu.uandina.balon1.demo3Spring.Control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.balon1.demo3Spring.Modelo.Accion;
import pe.edu.uandina.balon1.demo3Spring.Modelo.services.IAccionService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class AccionRestController {
    @Autowired
    private IAccionService accionService;

    @GetMapping("/accion")
    public List<Accion> Listar(){
        return accionService.findAll();
    }
}

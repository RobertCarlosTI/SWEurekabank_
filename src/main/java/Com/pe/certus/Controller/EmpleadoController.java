package Com.pe.certus.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.pe.certus.entity.Empleado;
import Com.pe.certus.service.EmpleadoService;

@Controller
@RequestMapping("/")
public class EmpleadoController {

    private final Logger log = LoggerFactory.getLogger(EmpleadoController.class);

    @Autowired
    private EmpleadoService empleadoService;

   
    @GetMapping("views/empleado")
    public String listar(Model model) {
        List<Empleado> empleado = empleadoService.listarEmpleados();
        log.info("Listar empleados: {}", empleado);
        model.addAttribute("empleado", empleado);
        return "/views/empleado/listar_empleado"; 
    }


    @GetMapping("views/empleado/create")
    public String crear() {
        return "/views/empleado/create_empleado"; 
    }

    
    @PostMapping("views/empleado/save")
    public String guardar(Empleado empleado) {
        log.info("Guardar empleado: {}", empleado);
        empleadoService.crearActualizarEmpleado(empleado);
        return "redirect:/views/empleado";
    }

    
    @GetMapping("views/empleado/edit/{id}")
    public String editar(@PathVariable Long id, Model model) {
        log.info("Editar empleado ID: {}", id);
        Empleado empleado = empleadoService.getIdEmpleado(id);
        log.info("Empleado encontrado: {}", empleado);
        model.addAttribute("empleado", empleado);
        return "/views/empleado/edit_empleado"; 
    }


    @GetMapping("views/empleado/delete/{id}")
    public String eliminar(@PathVariable Long id) {
        log.info("Eliminar empleado ID: {}", id);
        empleadoService.eliminarEmpleado(id);
        return "redirect:/views/empleado";
    }
}

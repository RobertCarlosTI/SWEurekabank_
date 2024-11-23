package Com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Com.pe.certus.entity.Empleado;
import Com.pe.certus.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado getIdEmpleado(Long id) {
        return empleadoRepository.findById(id).orElse(null);
    }

    @Override
    public void crearActualizarEmpleado(Empleado empleado) {
        Empleado emp = new Empleado();
        emp.setId(empleado.getId());
        emp.setPaterno(empleado.getPaterno());
        emp.setMaterno(empleado.getMaterno());
        emp.setNombres(empleado.getNombres());
        emp.setUsuario(empleado.getUsuario());
        emp.setClave(empleado.getClave());
        emp.setFoto(empleado.getFoto());
        if (empleado.getEstado() == null) {
            emp.setEstado(true);
        } else {
            emp.setEstado(empleado.getEstado());
        }

        empleadoRepository.save(emp);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}
package Com.pe.certus.service;

import java.util.List;

import Com.pe.certus.entity.Empleado;

public interface EmpleadoService {
    List<Empleado> listarEmpleados();
    Empleado getIdEmpleado(Long id);
    void crearActualizarEmpleado(Empleado empleado);
    void eliminarEmpleado(Long id);
}
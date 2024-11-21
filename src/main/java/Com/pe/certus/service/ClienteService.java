package Com.pe.certus.service;

import java.util.List;

import Com.pe.certus.entity.Cliente;

public interface ClienteService {

	public List<Cliente> listarClientes();
	public Cliente getIdCliente(Long id);
	public void crearActualizarCliente(Cliente cliente);
	public void eliminarCliente(Long id);
	
}

package Com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Com.pe.certus.entity.Cliente;
import Com.pe.certus.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements ClienteService{
	
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

	@Override
	public Cliente getIdCliente(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	@Override
	public void crearActualizarCliente(Cliente cliente) {
		Cliente cli = new Cliente();
		cli.setId(cliente.getId());
		cli.setPaterno(cliente.getPaterno());
		cli.setMaterno(cliente.getMaterno());	
		cli.setNombres(cliente.getNombres());
		cli.setDni(cliente.getDni());
		cli.setCiudad(cliente.getCiudad());
		cli.setEstado(cliente.getEstado());
		cli.setCorreo(cliente.getCorreo());
		
		
		clienteRepository.save(cli);
		}
	@Override
	public void eliminarCliente(Long id) {
		clienteRepository.deleteById(id);
	}


}

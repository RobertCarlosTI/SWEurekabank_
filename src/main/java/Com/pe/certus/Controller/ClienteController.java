package Com.pe.certus.Controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Com.pe.certus.entity.Cliente;
import Com.pe.certus.service.ClienteService;

@Controller
@RequestMapping("/")
public class ClienteController {

	private final Logger log = LoggerFactory.getLogger(Cliente.class);
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("views/cliente")
	public String listar(Model model){
		List<Cliente> cliente = clienteService.listarClientes();
		log.info("Listar Objeto {}", cliente);
		model.addAttribute("clientes", cliente);
		return "/views/cliente/listar";//nos retorna al archivo estudiante
	}
	
	
	@GetMapping("views/cliente/create")
	public String crear() {
		return "/views/cliente/create";
	}
	
	
	@PostMapping("views/cliente/save")
	public String guardar(Cliente cliente) {
		log.info("Metodo Guardar {}", cliente);
		return "";
	}
}

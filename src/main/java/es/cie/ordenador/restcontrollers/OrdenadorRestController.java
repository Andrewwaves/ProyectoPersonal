package es.cie.ordenador.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cie.ordenador.negocio.Ordenador;
import es.cie.ordenador.repositories.OrdenadorRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/webapi/ordenadores")
public class OrdenadorRestController {

    @Autowired
    @Qualifier("jdbc")
    private OrdenadorRepository ordenadorRepository;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Ordenador> buscarTodos(){
        return ordenadorRepository.buscarTodos();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public void insertar(@RequestBody Ordenador ordenador){
        ordenadorRepository.insertar(ordenador);
    }

    @DeleteMapping("/{numero}")
    @CrossOrigin(origins = "http://localhost:4200")
    public void borrar(@PathVariable int numero){
        ordenadorRepository.borrar(new Ordenador(numero));
    }
    

}

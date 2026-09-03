package Exercicios.API.repo;

import Exercicios.API.dto.DadosCliente;
import org.springframework.http.ResponseEntity;

public interface clienteRepository {
    static ResponseEntity save(DadosCliente cliente) {
        return null;
    }
}

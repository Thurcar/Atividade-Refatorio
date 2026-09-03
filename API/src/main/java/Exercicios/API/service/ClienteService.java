package Exercicios.API.service;

import Exercicios.API.dto.DadosCliente;
import Exercicios.API.entities.Cliente;
import Exercicios.API.repo.clienteRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ClienteService {
    public static ResponseEntity cadastrarCliente(DadosCliente cliente) {
        verificarCadastro(cliente);
        definirCliente(cliente);

        return clienteRepository.save(cliente);
    }

    public static ResponseEntity verificarCadastro(DadosCliente cliente) {
        if (cliente.nome() == null || cliente.nome().isBlank()) {
            return ResponseEntity.badRequest()
                    .body("Nome obrigatório");
        }
        if (clienteRepository.existsByEmail(cliente.email())) {
            return ResponseEntity.badRequest()
                    .body("Email já cadastrado");
        }
        return null;
    }

    public static void definirCliente(DadosCliente cliente) {
        cliente.setAtivo(true);
        cliente.setDataCadastro(LocalDateTime.now());
    }
}

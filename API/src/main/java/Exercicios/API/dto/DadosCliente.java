package Exercicios.API.dto;

import Exercicios.API.entities.Cliente;

import java.time.LocalDateTime;


public record DadosCliente(Object email, String nome) {

    public DadosCliente(Cliente cliente){
        this(cliente.getEmail(), cliente.getNome());
    }

    public void setAtivo(boolean b){}

    public void setDataCadastro(LocalDateTime now){}
}

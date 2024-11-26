package org.example;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDeJogos {
    private String nome;
    private String endereco;
    private List<Jogo> listaDeJogos;
    //private List<Cliente> clientes;

    public BibliotecaDeJogos(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.listaDeJogos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        listaDeJogos.add(jogo);
        System.out.println("Jogo adicionado: " + jogo.getTitulo());
    }

    public void removerJogo(Jogo jogo) {
        if (listaDeJogos.remove(jogo)) {
            System.out.println("Jogo removido: " + jogo.getTitulo());
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNome());
    }

    public void removerCliente(Cliente cliente) {
        if (clientes.remove(cliente)) {
            System.out.println("Cliente removido: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public Jogo procurarJogoPorTitulo(String titulo) {
        for (Jogo jogo : listaDeJogos) {
            if (jogo.getTitulo().equalsIgnoreCase(titulo)) {
                return jogo;
            }
        }
        System.out.println("Jogo não encontrado.");
        return null;
    }

    public void listarJogosDisponiveis() {
        System.out.println("Jogos disponíveis:");
        for (Jogo jogo : listaDeJogos) {
            if (jogo.isDisponivel()) {
                System.out.println("- " + jogo.getTitulo());
            }
        }
    }
}
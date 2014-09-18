package br.calebe.ticketmachine.core;

/**
 *
 * MUDANÇA PARA O GITHUB DEPOIS DA IMPORTAÇÃO PARA O NETBEANS
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

package org.example;

import java.util.Random;

public class GeradorDeSenhas {

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private Random random = new Random();

    public String gerarSenha(int comprimento, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        String caracteresDisponiveis = "";

        // Adicionando os tipos de caracteres selecionados pelo usuário à string de caracteres disponíveis
        if (incluirMinusculas) {
            caracteresDisponiveis += LETRAS_MINUSCULAS;
        }
        if (incluirMaiusculas) {
            caracteresDisponiveis += LETRAS_MAIUSCULAS;
        }
        if (incluirNumeros) {
            caracteresDisponiveis += NUMEROS;
        }
        if (incluirSimbolos) {
            caracteresDisponiveis += SIMBOLOS;
        }

        if (caracteresDisponiveis.isEmpty()) {
            throw new IllegalArgumentException("Pelo menos uma categoria de caracteres deve ser selecionada.");
        }

        String senha = "";
        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresDisponiveis.length());
            senha += caracteresDisponiveis.charAt(index);
        }

        return senha;
    }
}
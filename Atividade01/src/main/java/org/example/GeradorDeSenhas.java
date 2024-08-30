package org.example;

import java.security.SecureRandom;

public class GeradorDeSenhas {

    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String LETRAS_MAIUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMEROS = "0123456789";
    private static final String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

    private SecureRandom random = new SecureRandom();

    public String gerarSenha(int comprimento, boolean incluirMinusculas, boolean incluirMaiusculas, boolean incluirNumeros, boolean incluirSimbolos) {
        StringBuilder caracteresDisponiveis = new StringBuilder();

        if (incluirMinusculas) {
            caracteresDisponiveis.append(LETRAS_MINUSCULAS);
        }
        if (incluirMaiusculas) {
            caracteresDisponiveis.append(LETRAS_MAIUSCULAS);
        }
        if (incluirNumeros) {
            caracteresDisponiveis.append(NUMEROS);
        }
        if (incluirSimbolos) {
            caracteresDisponiveis.append(SIMBOLOS);
        }

        if (caracteresDisponiveis.length() == 0) {
            throw new IllegalArgumentException("Pelo menos uma categoria de caracteres deve ser selecionada.");
        }

        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresDisponiveis.length());
            senha.append(caracteresDisponiveis.charAt(index));
        }

        return senha.toString();
    }
}

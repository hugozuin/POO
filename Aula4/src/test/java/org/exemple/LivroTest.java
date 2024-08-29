package org.exemple;

import org.example.Livro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {

    Livro livro = new Livro("Memorias Postumas", "Machado", "1990");

    @Test
    public void testGetTitulo(){
            assertEquals("Memorias Postumas", livro.getTitulo());
    }

    @Test
    public void testGetAutor(){
        assertEquals("Machado", livro.getAutor());
    }

}

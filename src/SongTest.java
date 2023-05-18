import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {

    @org.junit.jupiter.api.Test
    void crearCancion1() {
        List<String> TodosAnimales = new ArrayList<>();
        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals("", resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void crearCancionPopular2() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("spider");
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancion3() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        String resultadoEsperado = """
                There was an old lady who swallowed a fly.
                I don't know why she swallowed a fly - perhaps she'll die!
                There was an old lady who swallowed a spider;
                That wriggled and wiggled and tickled inside her.
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!
                """;
        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancion4() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("spider");
        TodosAnimales.add("fly");
        String resultadoEsperado = """
                There was an old lady who swallowed a spider.
                I don't know why she swallowed a spider - perhaps she'll die!
                There was an old lady who swallowed a fly;
                That wriggled and wiggled and tickled inside her.
                She swallowed the fly to catch the spider;
                I don't know why she swallowed a spider - perhaps she'll die!
                """;

        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancion5() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        TodosAnimales.add("bird");
        String resultadoEsperado = """
                There was an old lady who swallowed a fly.
                I don't know why she swallowed a fly - perhaps she'll die!
                There was an old lady who swallowed a spider;
                That wriggled and wiggled and tickled inside her.
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!
                There was an old lady who swallowed a bird;
                How absurd to swallow a bird.
                She swallowed the bird to catch the spider,
                She swallowed the spider to catch the fly;
                I don't know why she swallowed a fly - perhaps she'll die!

                """;

        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancion6() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("bird");
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        String resultadoEsperado = """
                There was an old lady who swallowed a bird.
                I don't know why she swallowed a bird - perhaps she'll die!
                There was an old lady who swallowed a fly;
                That wriggled and wiggled and tickled inside her.
                She swallowed the fly to catch the bird;
                I don't know why she swallowed a bird - perhaps she'll die!
                There was an old lady who swallowed a spider;
                How absurd to swallow a spider.
                She swallowed the spider to catch the fly,
                She swallowed the fly to catch the bird;
                I don't know why she swallowed a bird - perhaps she'll die!

                """;

        String resultadoReal = Song.crearCancion(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}
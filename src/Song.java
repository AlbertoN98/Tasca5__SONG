import java.util.List;

public class Song {
    private final static String frasePrimer = """
                    There was an old lady who swallowed a BUG_1.
                    I don't know why she swallowed a BUG_1 - perhaps she'll die!
                    """;
    private final static String fraseSegun = """
            There was an old lady who swallowed a BUG_2;
            That wriggled and wiggled and tickled inside her.
            She swallowed the BUG_2 to catch the BUG_1;
            I don't know why she swallowed a BUG_1 - perhaps she'll die!
            """;
    private final static String fraseTerce = """
            There was an old lady who swallowed a BUG_3;
            How absurd to swallow a BUG_3.
            She swallowed the BUG_3 to catch the BUG_2,
            She swallowed the BUG_2 to catch the BUG_1;
            I don't know why she swallowed a BUG_1 - perhaps she'll die!

            """;
    private static String fraseEntera = "";

    private final static String PRIMER_ANIMAL = "BUG_1";
    private final static String SEGUNDO_ANIMAL = "BUG_2";
    private final static String TERCER_ANIMAL = "BUG_3";


    public static String crearCancion(List<String> TodosLosAnimales) {

        if (TodosLosAnimales.size() >= 1) {
            fraseEntera = frasePrimer;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
        }
        if (TodosLosAnimales.size() >= 2) {
            fraseEntera += fraseSegun;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
            fraseEntera = fraseEntera.replaceAll(SEGUNDO_ANIMAL, TodosLosAnimales.get(1));
        }
        if (TodosLosAnimales.size() >= 3) {
            fraseEntera += fraseTerce;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
            fraseEntera = fraseEntera.replaceAll(SEGUNDO_ANIMAL, TodosLosAnimales.get(1));
            fraseEntera = fraseEntera.replaceAll(TERCER_ANIMAL, TodosLosAnimales.get(2));
        }

        return fraseEntera;
    }
}

import java.util.List;

public class Song {
    private final static String frasePrimer = """
                    There was an old lady who swallowed a Animal1.
                    I don't know why she swallowed a Animal1 - perhaps she'll die!
                    """;
    private final static String fraseSegun = """
            There was an old lady who swallowed a Animal2;
            That wriggled and wiggled and tickled inside her.
            She swallowed the Animal2 to catch the Animal1;
            I don't know why she swallowed a Animal1 - perhaps she'll die!
            """;
    private final static String fraseTerce = """
            There was an old lady who swallowed a Animal3;
            How absurd to swallow a Animal3.
            She swallowed the Animal3 to catch the Animal2,
            She swallowed the Animal2 to catch the Animal1;
            I don't know why she swallowed a Animal1 - perhaps she'll die!

            """;
    private static String fraseEntera = "";

    private final static String PRIMER_ANIMAL = "Animal1";
    private final static String SEGUNDO_ANIMAL = "Animal2";
    private final static String TERCER_ANIMAL = "Animal3";


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

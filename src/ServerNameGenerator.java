import java.util.Random;

public class ServerNameGenerator {
    public static final String[] ADJECTIVES = {
            "adaptable",
            "adventurous",
            "affectionate",
            "ambitious",
            "amiable",
            "compassionate",
            "considerate",
            "courageous",
            "courteous",
            "diligent",
            "empathetic",
            "exuberant",
            "frank",
            "generous",
            "gregarious",
            "impartial",
            "intuitive",
            "inventive",
            "passionate",
            "persistent",
            "philosophical",
            "practical",
            "rational",
            "reliable",
            "resourceful",
            "sensible",
            "sincere",
            "sympathetic",
            "unassuming",
            "witty"
    };

    public static final String[] NOUNS = {
            "bison",
            "cheetah",
            "pig",
            "reindeer",
            "zebra",
            "sloth",
            "frog",
            "giraffe",
            "coyote",
            "leopard",
            "anteater",
            "stallion",
            "bull",
            "mountain-goat",
            "guanaco",
            "jerboa",
            "aardvark",
            "kitten",
            "tapir",
            "ferret",
            "highland-cow",
            "mule",
            "hamster",
            "chimpanzee",
            "marten",
            "okapi",
            "beaver",
            "orangutan",
            "lemur",
            "ocelot"
    };

    public static void main(String[] args) {
        String serverName = String.format("%s-%s", randomWord(ADJECTIVES), randomWord(NOUNS));
        System.out.printf("Here is your server name:\n%s\n", serverName);
    }

    public static String randomWord(String[] words) {
        Random rng = new Random();
        return words[rng.nextInt(words.length)];
    }
}
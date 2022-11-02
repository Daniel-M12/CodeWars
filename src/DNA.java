import java.util.Locale;

public class DNA {
    public static void main(String[] args) {
        DnaStrand strand = new DnaStrand();

        String complement = strand.makeComplement("Aaa");
        System.out.println(complement);
    }

    public static class DnaStrand {

        public static String makeComplement(String dna) {
            String reverse = "";
            char c;

            for(int i=0; i<dna.length(); i++){
                c = dna.toUpperCase().charAt(i);
                switch (c){
                    case 'A':
                        reverse += "T";
                        break;
                    case 'T':
                        reverse += "A";
                        break;
                    case 'C':
                        reverse += "G";
                        break;
                    case 'G':
                        reverse += "C";
                        break;
                    default:
                        return "It is not a DNA";
                }
            }
            return reverse;
        }
    }
}

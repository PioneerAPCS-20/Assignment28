

public class Main
{
    public static void main(String[] args)
    {
        String[] strands = {"CCTGCGGAAGATCGGCACTAGAATAGCCAGAACCGTTTCTCTGAGGCTTCCGGCCTTCCCTCCCACTAATAATTCTGAGG", "CCATCGGTAGCGCATCCTTAGTCCAATTAAGTCCCTATCCAGGCGCTCCGCCGAAGGTCTATATCCATTTGTCAGCAGACACGC", "CCACCCTCGTGGTATGGCTAGGCATTCAGGAACCGGAGAACGCTTCAGACCAGCCCGGACTGGGAACCTGCGGGCAGTAGGTGGAAT", "CCATCGTGGTATTAAAAACCGGAGAACGCTTCAGAAAATTATATACCACACTATGCGGGCAGTAATAATCATATATTTATTTTTAGTTT"};

        // print the lowest and highest GC-content percentages

    }

    /**
     * Finds the GC-content percentage in the given DNA strand.
     *
     * @param dna - the DNA strand
     * @return      the percentage of nucleotides in the strand that are 'G' or 'C'
     */
    public static double gcContent(String dna)
    {
        int c = 0;
        for(int i = 0; i < dna.length(); i++)
        {
            if(dna.substring(i, i+1).equals("G") || dna.substring(i, i+1).equals("C"))
            {
                c++;
            }
        }

        return (double) c / dna.length() * 100;
    }
}


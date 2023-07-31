package feacp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

/**
 * Example of how to use the FEACP algorithm from the source code
 * 
 * The FEACP algorithm was proposed in this paper:
 * 
 * N. T. Tung, Loan T. T. Nguyen, Trinh D. D. Nguyen, Philippe Fournier-Viger, 
 * Ngoc Thanh Nguyen, Bay Vo:  Efficient mining of cross-level high-utility 
 * itemsets in taxonomy quantitative databases. Inf. Sci. 587: 41-62 (2022)
 * 
 * @see AlgoFEACP
 */
public class Main {


	public static void main(String[] args) throws IOException {

		// input file path (taxonomy)
		String TaxonomyPath = "taxonomy.txt";
		// input file path (transactions)
		String inputPath = "transaction.txt";
		// Output path
		String outputPath = "output.txt";
		
		// minimum utility
		int minimumUtility = 1000;
		
		// run the algorithm
		AlgoFEACP algorithm = new AlgoFEACP();
		algorithm.runAlgorithm(minimumUtility, inputPath, outputPath, TaxonomyPath, Integer.MAX_VALUE);
		algorithm.printStats();
	}
	
	
}

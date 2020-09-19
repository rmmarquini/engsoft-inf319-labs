package br.unicamp.ic.inf319;
/**
 * <img src="./doc-files/PartNumber.png" alt="PartNumber">
 *
 * @author INF319
 * 
 * esoft38 - Rafael Mardegan Marquini: 
 * -> Added the method PartNumberToString() to return the PartNumber as a String
 */
public class PartNumber {

    private final int number;
    
    /**
     *
     * @param 
     */
    public PartNumber(int theNumber) {
        number = theNumber;
    }

    /**
     *
     * @return 
     */
    public int getNumber() {
        return number;
    }
    
    /**
     * 
     * @return this PartNumber as a String
     */
    public String partNumberToString() {
    	return Integer.toString(number);
    }
}

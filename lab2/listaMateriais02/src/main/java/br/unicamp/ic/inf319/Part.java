package br.unicamp.ic.inf319;
/**
 * <img src="./doc-files/Part.png" alt="Part">
 *
 * @author INF319
 * 
 * esoft38 - Rafael Mardegan Marquini: 
 * -> Added the method print() to return a printable line of a Part
 * -> Also, included the method list() that represents the zero level printed line in the representation of a Part
 */
public abstract class Part {

    private String description;
    private final PartNumber partNumber;
    
    /**
     *
     * @param thePartNumber
     * @param theDescription
     */
    public Part(PartNumber thePartNumber, String theDescription) {
        description = theDescription;
        partNumber = thePartNumber;
    }
    
    /**
     *
     * @return double
     */
    public abstract double cost();

    /**
     *
     * @return String
     */
    public String getDescription() {
    	return description;
    }
    
    /**
     *
     * @param desc
     */
    public void setDescription(String desc) {
    	description = desc;
    }

    /**
     *
     * @return PartNumber
     */
    public PartNumber getPartNumber() {
        return partNumber;
    }
    
    /**
    *
    * @param level - which level of this Part is inserted
    *
    * @return a printable line that represents this Part
    */
    public String print(Integer level) {
    	String levels = level > 0 ? String.format(String.format("%%%ds", level), " ") : "";
   			
	   	return String.format(
			"%sParte: %s; Descricao: %s; Custo: %.1f\n", 
			levels, 
			getPartNumber().partNumberToString(), 
			getDescription(), 
			cost()
		);	
    }
    

	/**
	 * 
	 * @return a string representing the zero level printed line in the representation of a Part
	 */
	public String list() {
		return print(0);
	}
}

package br.unicamp.ic.inf319;

import static org.junit.Assert.assertEquals;

public class ImprimeListaMateriaisTest {

	public void partNumberTest() {
		PartNumber partNumber = new PartNumber(42);
		String strPartNumber = partNumber.partNumberToString();
		assertEquals(42, partNumber.getNumber());
		assertEquals("42", strPartNumber);
	}
	
	public void piecePartPrinterWithoutAnyLevelTest() {
		PartNumber partNumber = new PartNumber(42);
		Part part = new PiecePart(partNumber, "some description", 23.0);
		
		String expected = String.format("Parte: 42; Descricao: some description; Custo: %.1f\n", 23.0);
		String result = part.print(0);
		
		assertEquals(42, part.getPartNumber().getNumber());
        assertEquals("some description", part.getDescription());
        assertEquals(23.0, part.cost(), 0);
        assertEquals(expected, result);
		
	}
	
	public void piecePartPrinterWithLevelsTest() {
        PartNumber partNumber = new PartNumber(42);
        Part part = new PiecePart(partNumber, "some description", 23.0);
        
        String expected = String.format(" Parte: 42; Descricao: some description; Custo: %.1f\n", 23.0);
        String result = part.print(1);
        
        assertEquals(42, part.getPartNumber().getNumber());
        assertEquals("description", part.getDescription());
        assertEquals(23.0, part.cost(), 0);
        assertEquals(expected, result);
    }
	
	@SuppressWarnings("deprecation")
	public void assemblyPrinterTest() {
		Assembly assembly1 = new Assembly(new PartNumber(10), "assembly1");
		assembly1.addPart(new PiecePart(new PartNumber(11), "part11", 11));
		assembly1.addPart(new PiecePart(new PartNumber(12), "part12", 12));
		assembly1.addPart(new PiecePart(new PartNumber(13), "part13", 13));
		assembly1.addPart(new PiecePart(new PartNumber(14), "part14", 14));
		assembly1.addPart(new PiecePart(new PartNumber(15), "part15", 15));
		
		assertEquals(65.0, assembly1.cost());
		
		StringBuilder expected1 = new StringBuilder();
		expected1.append(String.format("Parte: 10; Descricao: assembly1; Custo: %.1f\n", 65.0));
		expected1.append(String.format(" Parte: 11; Descricao: part11; Custo: %.1f\n", 11.0));
		expected1.append(String.format(" Parte: 12; Descricao: part12; Custo: %.1f\n", 12.0));
		expected1.append(String.format(" Parte: 13; Descricao: part13; Custo: %.1f\n", 13.0));
		expected1.append(String.format(" Parte: 14; Descricao: part14; Custo: %.1f\n", 14.0));
		expected1.append(String.format(" Parte: 15; Descricao: part15; Custo: %.1f\n", 15.0));
		
		String result1 = assembly1.print(0);
		assertEquals(expected1.toString(), result1);
		
		
        Assembly assembly2 = new Assembly(new PartNumber(20), "assembly2");
        assembly2.addPart(new PiecePart(new PartNumber(21), "part21", 21));
        assembly2.addPart(new PiecePart(new PartNumber(22), "part22", 22));
        assembly2.addPart(new PiecePart(new PartNumber(23), "part23", 23));
        assembly2.addPart(new PiecePart(new PartNumber(24), "part24", 24));
        assembly2.addPart(new PiecePart(new PartNumber(25), "part25", 25));
        
        assertEquals(115.0, assembly2.cost());
        
        StringBuilder expected2 = new StringBuilder();
        expected2.append(String.format("Parte: 20; Descricao: assembly2; Custo: %.1f\n", 115.0));
		expected2.append(String.format(" Parte: 21; Descricao: part21; Custo: %.1f\n", 21.0));
        expected2.append(String.format(" Parte: 22; Descricao: part22; Custo: %.1f\n", 22.0));
        expected2.append(String.format(" Parte: 23; Descricao: part23; Custo: %.1f\n", 23.0));
        expected2.append(String.format(" Parte: 24; Descricao: part24; Custo: %.1f\n", 24.0));
        expected2.append(String.format(" Parte: 25; Descricao: part25; Custo: %.1f\n", 25.0));
		
		String result2 = assembly2.print(0);
		assertEquals(expected2.toString(), result2);
		
		
        Assembly assembly3 = new Assembly(new PartNumber(69), "assembly3");
        assembly3.addPart(assembly1);
        assembly3.addPart(assembly2);
        
        assertEquals(180.0, assembly3.cost());
        
        StringBuilder expected3 = new StringBuilder();
        expected3.append(String.format("Parte: 69; Descricao: assembly3; Custo: %.1f\n", 180.0));
        for (String line : expected1.toString().split("\n")) {
        	expected3.append(String.format(" %s\n", line));
        }
        for (String line : expected2.toString().split("\n")) {
        	expected3.append(String.format(" %s\n", line));
        }
        
        String result3 = assembly3.print(0);
		assertEquals(expected3.toString(), result3);
	}
	
}

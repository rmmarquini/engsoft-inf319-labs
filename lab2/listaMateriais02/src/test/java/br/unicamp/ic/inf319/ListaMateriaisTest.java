package br.unicamp.ic.inf319;

import junit.framework.TestCase;

public class ListaMateriaisTest extends TestCase {

    public void testPart() {
        PartNumber number = new PartNumber(42);
        Part part = new PiecePart(number, "description", 23);
        assertEquals(42, part.getPartNumber().getNumber());
        assertEquals("description", part.getDescription());
        part.setDescription("new description");
        assertEquals("new description", part.getDescription());
    }
    
    public void testPiecePart() {
        PartNumber number = new PartNumber(42);
        PiecePart part = new PiecePart(number, "description", 23);
        assertEquals(23, part.cost(), 0);
        part.setCost(5);
        assertEquals(5, part.cost(), 0);
    }
    
    public void testAssembly() {
        PartNumber number1 = new PartNumber(23);
        PartNumber number2 = new PartNumber(42);
        PartNumber number3 = new PartNumber(69);

        Assembly assembly1 = new Assembly(number1, "assembly1");
        Assembly assembly2 = new Assembly(number2, "assembly2");
        Assembly assembly3 = new Assembly(number3, "assembly3");

        for (int i = 0; i < 10; i++) {
            assembly1.addPart(new PiecePart(new PartNumber(i), "pp" + i, i));
        }
        assertEquals(((9 + 0) * 10)/2, assembly1.cost(), 0);

        for (int i = 10; i < 20; i++) {
            assembly2.addPart(new PiecePart(new PartNumber(i), "pp" + i, i));
        }
        assertEquals(((19 + 10) * 10)/2, assembly2.cost(), 0);
        
        assembly3.addPart(assembly1);
        assembly3.addPart(assembly2);
        assertEquals(assembly1.cost() + assembly2.cost(), assembly3.cost(), 0);

        double cost = assembly3.cost();
        assembly2.addPart(new PiecePart(new PartNumber(75), "piece", 10));
        assertEquals(cost + 10, assembly3.cost(), 0);
    }
    
    public void testList() {
    	
    	// Átomos para a roda dianteira
    	PiecePart aroDianteiro = new PiecePart(new PartNumber(51), "Aro Dianteiro", 20.0);
    	PiecePart cuboDianteiro = new PiecePart(new PartNumber(52), "Cubo Dianteiro", 30.0);
    	PiecePart raiosDianteiro = new PiecePart(new PartNumber(53), "Raios Dianteiro", 5.0);
    	PiecePart pneuDianteiro = new PiecePart(new PartNumber(54), "Pneu Dianteiro", 15.0);
    	
    	// Roda dianteira
    	Assembly rodaDianteira = new Assembly(new PartNumber(5), "Roda Dianteira");
    	rodaDianteira.addPart(aroDianteiro);
    	rodaDianteira.addPart(cuboDianteiro);
    	rodaDianteira.addPart(raiosDianteiro);
    	rodaDianteira.addPart(pneuDianteiro);
    	
    	// Átomos para a roda traseira
       	PiecePart aroTraseiro = new PiecePart(new PartNumber(61), "Aro Traseiro", 20.0);
    	PiecePart cuboTraseiro = new PiecePart(new PartNumber(62), "Cubo Traseiro", 30.0);
    	PiecePart raiosTraseiro = new PiecePart(new PartNumber(63), "Raios Traseiro", 5.0);
    	PiecePart pneuTraseiro = new PiecePart(new PartNumber(64), "Pneu Traseiro", 15.0);
    	
    	//Roda Traseira
    	Assembly rodaTraseira = new Assembly(new PartNumber(6), "Roda Traseira");
    	rodaTraseira.addPart(aroTraseiro);
    	rodaTraseira.addPart(cuboTraseiro);
    	rodaTraseira.addPart(raiosTraseiro);
    	rodaTraseira.addPart(pneuTraseiro);
    	
    	Assembly motocicleta = new Assembly(new PartNumber(7), "Motocicleta");
    	motocicleta.addPart(rodaDianteira);
    	motocicleta.addPart(rodaTraseira);
    
    	assertEquals(140.0, motocicleta.cost());
    	
    	
    	StringBuilder expected = new StringBuilder();    	
    	expected.append(String.format("Parte: 7; Descricao: Motocicleta; Custo: %.1f\n", 140.0));
    	expected.append(String.format(" Parte: 5; Descricao: Roda Dianteira; Custo: %.1f\n", 70.0));
    	expected.append(String.format("  Parte: 51; Descricao: Aro Dianteiro; Custo: %.1f\n", 20.0));
    	expected.append(String.format("  Parte: 52; Descricao: Cubo Dianteiro; Custo: %.1f\n", 30.0));
    	expected.append(String.format("  Parte: 53; Descricao: Raios Dianteiro; Custo: %.1f\n", 5.0));
    	expected.append(String.format("  Parte: 54; Descricao: Pneu Dianteiro; Custo: %.1f\n", 15.0));
    	expected.append(String.format(" Parte: 6; Descricao: Roda Traseira; Custo: %.1f\n", 70.0));
    	expected.append(String.format("  Parte: 61; Descricao: Aro Traseiro; Custo: %.1f\n", 20.0));
    	expected.append(String.format("  Parte: 62; Descricao: Cubo Traseiro; Custo: %.1f\n", 30.0));
    	expected.append(String.format("  Parte: 63; Descricao: Raios Traseiro; Custo: %.1f\n", 5.0));
    	expected.append(String.format("  Parte: 64; Descricao: Pneu Traseiro; Custo: %.1f\n", 15.0));

    	String result = motocicleta.list();
    	assertEquals(expected.toString(), result);
    }

}

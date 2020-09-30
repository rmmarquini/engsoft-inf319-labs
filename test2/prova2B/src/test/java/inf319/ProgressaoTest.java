package inf319;

import junit.framework.TestCase;

public class ProgressaoTest extends TestCase { 

    public void testProgressaoAritmetica() {
        Progressao p = new ProgressaoAritmetica();
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));
        assertEquals("0 1 2 3 4 5 6 7 8 9 10\n",
                     p.imprimeProgressao(10));

        p = new ProgressaoAritmetica(0,5);
        assertEquals(0, p.inicia(0,5));
        assertEquals(5, p.proxTermo());
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.iesimoTermo(4));
        assertEquals(30, p.iesimoTermo(6));
        assertEquals("0 5 10 15 20 25 30 35 40 45 50\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoAritmetica();
        assertEquals(0, p.inicia(0,5));
        assertEquals(5, p.proxTermo());
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.iesimoTermo(4));
        assertEquals(30, p.iesimoTermo(6));
        assertEquals("0 5 10 15 20 25 30 35 40 45 50\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoAritmetica(3,5);
        assertEquals(8, p.proxTermo());
        assertEquals(13, p.proxTermo());
        assertEquals(23, p.iesimoTermo(4));
        assertEquals(33, p.iesimoTermo(6));
        assertEquals("3 8 13 18 23 28 33 38 43 48 53\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoAritmetica(2,10);
        assertEquals(12, p.proxTermo());
        assertEquals(22, p.proxTermo());
        assertEquals(52, p.iesimoTermo(5));
        assertEquals(62, p.iesimoTermo(6));
        assertEquals("2 12 22 32 42 52 62 72 82 92 102\n",
                     p.imprimeProgressao(10));
        assertEquals(4, p.inicia(4,10));
        assertEquals(14, p.proxTermo());
        assertEquals(24, p.proxTermo());

    }

    public void testProgressaoGeometrica() {
        Progressao p = new ProgressaoGeometrica();
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.proxTermo());
        assertEquals(16, p.iesimoTermo(4));
        assertEquals(64, p.iesimoTermo(6));
        assertEquals("1 2 4 8 16 32 64 128 256 512 1024\n",
                     p.imprimeProgressao(10));
        assertEquals(1, p.inicia(1, 5));
        assertEquals(5, p.proxTermo());
        assertEquals(25, p.proxTermo());
        assertEquals(625, p.iesimoTermo(4));
        assertEquals(78125, p.iesimoTermo(7));
        assertEquals("1 5 25 125 625 3125 15625 78125 390625 1953125 9765625\n",
                     p.imprimeProgressao(10));


        p = new ProgressaoGeometrica();
        assertEquals(1, p.inicia(1, 5));
        assertEquals(5, p.proxTermo());
        assertEquals(25, p.proxTermo());
        assertEquals(625, p.iesimoTermo(4));
        assertEquals(15625, p.iesimoTermo(6));
        assertEquals("1 5 25 125 625 3125 15625 78125 390625 1953125 9765625\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoGeometrica(2,2);
        assertEquals(4, p.proxTermo());
        assertEquals(8, p.proxTermo());
        assertEquals(32, p.iesimoTermo(4));
        assertEquals(128, p.iesimoTermo(6));
        assertEquals("2 4 8 16 32 64 128 256 512 1024 2048\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoGeometrica();
        assertEquals(2, p.inicia(2,2));
        assertEquals(4, p.proxTermo());
        assertEquals(8, p.proxTermo());
        assertEquals(32, p.iesimoTermo(4));
        assertEquals(128, p.iesimoTermo(6));
        assertEquals("2 4 8 16 32 64 128 256 512 1024 2048\n",
                     p.imprimeProgressao(10));

        
    }
    
    public void testProgressaoFibonacci() {
        Progressao p = new ProgressaoFibonacci();
        assertEquals(0, p.inicia());
        assertEquals(1, p.proxTermo());
        assertEquals(1, p.proxTermo());
        assertEquals(3, p.iesimoTermo(4));
        assertEquals(8, p.iesimoTermo(6));
        assertEquals("0 1 1 2 3 5 8 13 21 34 55\n",
                     p.imprimeProgressao(10));
        
        p = new ProgressaoFibonacci(5,4);
        assertEquals(5, p.inicia());
        assertEquals(9, p.proxTermo());
        assertEquals(14, p.proxTermo());
        assertEquals(37, p.iesimoTermo(4));
        assertEquals(60, p.iesimoTermo(5));
        assertEquals("5 9 14 23 37 60 97 157 254 411 665\n",
                p.imprimeProgressao(10));
        
        p.inicia(10);
        assertEquals(421, p.proxTermo());
        assertEquals(431, p.proxTermo());
        
        p = new ProgressaoFibonacci(5);
        assertEquals(5, p.inicia());
        assertEquals(6, p.proxTermo());
        assertEquals(11, p.proxTermo());
        assertEquals(17, p.iesimoTermo(3));
        assertEquals(45, p.iesimoTermo(5));
        assertEquals("5 6 11 17 28 45\n",
                     p.imprimeProgressao(5));
        
    }

    public void testProgressaoJosephus() {
        Progressao p = new ProgressaoJosephus();
        assertEquals(0, p.inicia());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.proxTermo());
        assertEquals(8, p.iesimoTermo(4));
        assertEquals(12, p.iesimoTermo(6));
        assertEquals("0 2 4 6 8 10 12 14 16 18 20\n",
                     p.imprimeProgressao(10));
        assertEquals(17, p.iesimoTermo(40));
        assertEquals(0, p.iesimoTermo(41));
        

        p = new ProgressaoJosephus();
        assertEquals(0, p.inicia(41, 10));
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.proxTermo());
        assertEquals(30, p.proxTermo());
        assertEquals(40, p.proxTermo());
        assertEquals(11, p.proxTermo());
        assertEquals(40, p.iesimoTermo(4));
        assertEquals(22, p.iesimoTermo(6));
        assertEquals("0 10 20 30 40 11 22 33 4 16 28\n",
                     p.imprimeProgressao(10));
        assertEquals(25, p.iesimoTermo(40));
        assertEquals(0, p.iesimoTermo(41));
        
        p = new ProgressaoJosephus(41,10);
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.proxTermo());
        assertEquals(30, p.proxTermo());
        assertEquals(40, p.proxTermo());
        assertEquals(11, p.proxTermo());
        assertEquals(40, p.iesimoTermo(4));
        assertEquals(22, p.iesimoTermo(6));
        assertEquals("0 10 20 30 40 11 22 33 4 16 28\n",
                     p.imprimeProgressao(10));
        assertEquals(25, p.iesimoTermo(40));
        assertEquals(0, p.iesimoTermo(41));
        
        Progressao q = new ProgressaoJosephus(30,3);
        assertEquals(0, q.inicia(25));
        assertEquals(3, q.proxTermo());
        assertEquals(6, q.proxTermo());
        q.inicia(25,3);
        assertEquals(3, q.proxTermo());
        assertEquals(6, q.proxTermo());
        q.inicia(20,5);
        assertEquals(5, q.proxTermo());
        assertEquals(10, q.proxTermo());
        assertEquals(15, q.proxTermo());
        assertEquals(1, q.proxTermo());
        assertEquals(7, q.proxTermo());
        assertEquals("0 5 10 15 1 7 13 19 8\n", q.imprimeProgressao(8));
    }

}




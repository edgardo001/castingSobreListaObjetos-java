/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingSobreListaObjetos;

/**
 *
 * @author datasoft-edgardo
 */
public class castingSobreListaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a myA = new a();
        b myB = new b();
        c myC = new c();
        String cadena = "demo de cadena";
        Object[] lObj = new Object[]{myA, myB, myC, cadena};
        for (Object object : lObj) {
            if (object instanceof a) {
                a otraA = (a) object;
                System.out.println("Es de tipo a: " + otraA.demo_a);
            }
            if (object instanceof b) {
                b otraB = (b) object;
                System.out.println("Es de tipo b: " + otraB.demo_b);
            }
            if (object instanceof c) {
                c otraC = (c) object;
                System.out.println("Es de tipo c: " + otraC.demo_c);
            }
            if (object instanceof String) {
                String otraCadena = (String) object;
                System.out.println("Es de tipo String: " + otraCadena);
            }
        }
        for (Object object : lObj) {
            if (object.getClass() == a.class) {
                a otraA = (a) object;
                System.out.println("Es de tipo a: " + otraA.demo_a);
            }
            if (object.getClass() == b.class) {
                b otraB = (b) object;
                System.out.println("Es de tipo b: " + otraB.demo_b);
            }
            if (object.getClass() == c.class) {
                c otraC = (c) object;
                System.out.println("Es de tipo c: " + otraC.demo_c);
            }
            if (object.getClass() == String.class) {
                String otraCadena = (String) object;
                System.out.println("Es de tipo String: " + otraCadena);
            }
        }
    }
}

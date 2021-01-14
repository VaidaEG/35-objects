/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektai;

/**
 *
 * @author 37067
 */
public class Objektai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] m1 = {1, 2, 3};
//        int[] m2 = m1;
//        m2[1] = 15;
//        System.out.println(m1[1]);
//        System.out.println(m2[1]);
        // kai naudojame konstruktoriu
//        Puodukas p8 = new Puodukas ('z', 800);
//        System.out.println(p8.spalva);
//        System.out.println(p8.turis);
        
        // sukurdami nauja puoduka, mes duodame nuoroda i puoduka, bet ne ji nukopijuojame
//        Puodukas p1 = new Puodukas();
//        p1.spalva = 'r';
//        p1.turis = 300;
//        p1.kiekis = 0;
//        
//        Puodukas p2 = new Puodukas();
//        p2.spalva = 'b';
//        p2.turis = 150;
//        p2.kiekis = 0;
        // jei ipilame daugiau negu turis, kiekis tampa lygus turiui
//        p1.ipilk(400);
//        System.out.println(p1.kiekis);
////        
//        p2.ipilk(50);
//        System.out.println(p2.kiekis);
//        
//        // jei priskiriame nauja puoduka ankstesniam puodukui ir nurodome kieki
//        // tada kiekis keiciasi ir ankstesniame puoduke
//        Puodukas p3 = p1;
//        p3.kiekis = 120;
        
//        System.out.println(p1.spalva);
//        System.out.println(p2.spalva);
//        System.out.println(p1.kiekis);
//        System.out.println(p3.kiekis);
//        
//        // padarome masyvo kopija
//        int[] m4 = {6, 7, 8};
//        int[] m5 = new int [m4.length];
//        for (int i = 0; i < m4.length; i ++) {
//            m5[i] = m4[i];
//        }
//        System.out.println(m4[0]);
//        System.out.println(m5[0]);
        
        Termosas t1 = new Termosas('b', 1000);
        
        Puodukas p10 = new Termosas('r', 1500);
        
        Termosas t2 = (Termosas) p10;
        t2.pasildyk(15);
        t2.ipilk(50);
        
        System.out.println(t1.getTemp());
        System.out.println(t1.getTuris());
        t1.ipilk(100);
        t1.pasildyk(50);
        System.out.println(t1.kiekis);
        System.out.println(t1.getTemp());
        System.out.println(t2.kiekis);
        System.out.println(t2.getTemp());
        System.out.println(p10.getKiekis());
        
        Object o = t1;
        if (o instanceof Puodukas) {
            System.out.println("Puodukas");
        
        }
        if (o instanceof Termosas) {
            System.out.println("Termosas");
        }
        Object ob = null;
        
        
        // String objektas
        String s = "Labas Pasauli!!!";
        s = s + " ar tikrai?";
        
        if (s == "Labas Pasauli!!! ar tikrai?") {
            System.out.println("lygu");
        } else {
            System.out.println("nelygu");
        }
        System.out.println(s);
        
        String ks = "lygu1";
        if (ks == "lygu1") {
            System.out.println("lygu");
        } else {
            System.out.println("nelygu");
        }
        
        
    }
}

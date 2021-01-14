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
public class Puodukas extends Object {
//    public char spalva;
//    public int turis;
//    public int kiekis;
    private char spalva;
    protected int turis;
    protected int kiekis;
    
    // java konstruktorius
    public Puodukas(char spalva, int turis) {
        this.spalva = spalva;
        this.turis = turis;
        this.kiekis = 0;
    }
    public int getTuris() {
        return this.turis;
    }
    public int getKiekis() {
        return this.kiekis;
    }
    public void setSpalva(char spalva) {
        this.spalva = spalva;
    }
    public char getSpalva() {
        return this.spalva;
    }
    public boolean getPilnas() {
        return this.kiekis == this.turis;
    }
    
    public void ipilk(int kiek) {
        // pilame tik tada, jei bendras kiekis nevirsija turio
//        if(this.kiekis + kiekis <= turis){
//            this.kiekis += kiekis;
//        }
        // jei ipilame daugiau negu turis, kiekis tampa lygus turiui
        this.kiekis += kiek;
        if (this.kiekis > turis) {
            this.kiekis = this.turis;
        }
    }
    public void isgerk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.kiekis -= kiek;
        if (this.kiekis < 0) {
            this.kiekis = 0;
        }
    }
}

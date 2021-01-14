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
public class Termosas extends Puodukas {
    private int temp;
    
    public Termosas(char spalva, int turis){
        super(spalva, turis);
        this.temp = 20;
    }
    
    public int getTemp() {
        return this.temp;
    }
    public void pasildyk(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp += kiek;
    }
    public void atvesink(int kiek) {
        if (kiek <= 0) {
            return;
        }
        this.temp -= kiek;
    }
    public void ipilk(int kiek) {
        super.ipilk(kiek);
        this.temp -= 5;
    }

    @Override
    public String toString() {
        return "Termosas{" + "temp=" + temp + '}';
    }
    
    
}

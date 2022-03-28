package test;
public class bola {
    double jariJari;
    public void setJarijari(double jariJari){
    this.jariJari = jariJari;
    }
    public void showDiameter(){
    double diameter = 2*jariJari;
        System.out.println("Diameter bola ini adalah "+diameter);
    }
    public void showLuasPermukaan(){
    double luasPermukaan = 4*3.14*jariJari*jariJari;
        System.out.println("Luas permukaan bola ini adalah "+luasPermukaan);
    }
    public void showVolume(){
    double volume = 4/3*3.14*jariJari*jariJari*jariJari;
        System.out.println("Volume bola ini adalah "+volume);
    }
}

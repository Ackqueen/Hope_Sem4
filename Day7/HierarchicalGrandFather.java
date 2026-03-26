class GrandFather{
    void GF(){
        System.out.println("I am GrandFather I do farming I have a son and a daughter");
    }
}
class Son extends GrandFather{
    void job(){
        System.out.println("I am grandfather's son I am a Engineer and I have a daughter");
    }
}
class Daughter extends GrandFather{
    void business(){
        System.out.println("I am grandfather's daughter I am a doctor and I have a son");
    }
}
class GrandSon extends Son{
    void job(){
        System.out.println("I am grandfather's grandson I am a entrepreneur and I have a son");
    }
}
class GrandDaughter extends Daughter{
    void business(){
        System.out.println("I am grandfather's granddaughter I am a horticultural therapist and I have a daughter");
    }
}
public class HierarchicalGrandFather {
    public static void main(String[] args) {

        // GrandFather object
        GrandFather gf = new GrandFather();
        gf.GF();

        // Son object
        Son s = new Son();
        s.GF();   // inherited
        s.job();

        // Daughter object
        Daughter d = new Daughter();
        d.GF();   // inherited
        d.business();

        // GrandSon object
        GrandSon gs = new GrandSon();
        gs.GF();   // inherited from GrandFather
        gs.job();  // overridden method

        // GrandDaughter object
        GrandDaughter gd = new GrandDaughter();
        gd.GF();        // inherited
        gd.business();  // overridden method
    }
}
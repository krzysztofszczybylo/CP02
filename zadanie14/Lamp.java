
public class Lamp
{
    boolean isOn;
    
    void switchOn(){
        System.out.println(isOn = true);
    };
    void switchOff(){
        System.out.println(isOn = false);
    };
    void ifIsOn(){
        if (isOn == true){
            System.out.println("The lamp is switched on");
        }else{
            System.out.println("The lamp is switched off");
        }
    };
}

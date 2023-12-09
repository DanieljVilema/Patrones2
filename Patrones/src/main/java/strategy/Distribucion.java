package strategy;

public class Distribucion {
    Via via;
    
    public void SetVia(Via via){
        this.via = via;
    }
    
    public void distribucion(){
        via.enviar();
    }
}

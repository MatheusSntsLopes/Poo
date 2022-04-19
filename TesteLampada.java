public class TesteLampada {
    public static void main(String[] args){
     Lampada lampada = new Lampada();
     lampada.ligada = true;
     lampada.ligada = false;

     lampada.ligar();
     lampada.mostrarEstado();

     lampada.desligar();
     lampada.mostrarEstado();

     lampada.mudarEstado();
     lampada.mostrarEstado();
    }
    
}

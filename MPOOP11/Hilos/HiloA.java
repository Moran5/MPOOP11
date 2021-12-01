package MPOOP11.Hilos;
public class HiloA extends Thread{
  public HiloA(String nombre){
    super(nombre);
  }
  public void run(){
    for(int i=0;i<10;i++){
      System.out.println("Iteración "+i+" del "+getName());
    }
    System.out.println("Termina el hilo "+getName());
  }
}
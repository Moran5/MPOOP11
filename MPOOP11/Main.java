package MPOOP11;
import MPOOP11.Hilos.*;
public class Main {
  public static void main(String[] args) {
    HiloA hilo1 = new HiloA("Primer Hilo");
    hilo1.start();
    new HiloA("Segundo Hilo").start();
    
    new Thread(new HiloB(),"Tercer Hilo").start();
    new Thread(new HiloB(),"Cuarto Hilo").start();

    for(int i=0;i<10;i++){
      System.out.println("Iteración "+i+" del Hilo main");
    }
    System.out.println("Termina el Hilo Main");
  }
}
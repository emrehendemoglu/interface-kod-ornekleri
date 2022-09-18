public class Main {

    public static void main(String[] args) {
	  int[] sayılar = new int[]{1,2,3,5,7,9,0};
      int aranacak = 5;
      boolean varmı= false;

      for (int sayı : sayılar){
          if(sayı==aranacak){
             varmı= true;
             break;
          }
      }
      if(varmı){
          System.out.println("Sayı Mevcuttur");

      }

    }
}

public class FavoriteSong {
   public static void main(String []args) {
      Song song = new Song();
      song.lyrics();
   }
}
class Song {  
   void lyrics() {
   System.out.println("Never gonna give you up");
   System.out.println("never gonna let you down");
   System.out.println("never gonna run around");
   System.out.println("and desert you!!!");
   }
}
import java.util.Random;

public class Main {
    public static void main(String[] args) {

       Tiles[] Board = new Tiles[52];

        for(int i = 0;i<52;i++) {
            Board[i] = new Tiles("Tom");
        }
  
        Player player1 = new Player("rød");
        Player player2 = new Player("blå");
        Player player3 = new Player("gul");
        Player player4 = new Player("grøn");
        
        for(int i = 1;i<5;i++) {
            Brik b1 = new Bri
        }        
        Board[2].type = "Rød Globus";
        Board[10].type = "Globus";
        Board[15].type = "blå Globus";
        Board[23].type = "Globus";
        Board[28].type = "Grøn Globus";
        Board[36].type = "Globus";
        Board[41].type = "Gul Globus";
        Board[49].type = "Globus";


    }

    public int Diceroller() {
        int dice = new Random().nextInt(6)  + 1;
        return dice;
    }

    public boolean TjekForBrikISpil(string farve) {
        int i;
        for (i = 0; i <= 52; i++) {
            if (brikker[i].includes(farve)) {
                return true;
            }
        }
        return false;

    }

    public int Globus{
        if(e.getSource<0&&e.getSource>=13) {

        }

}
    public int ryk(){

        return 1;
    }











}
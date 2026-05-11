class Excercise1{
  public static void main(String[] args) {
   int[] player1 = {10, 6, 8, 9, 7, 12, 7};
   int[] player2 ={7 , 6 , 9 , 5 , 2, 8, 11};

    int player1Win = 0;
    int player2Win = 0;
    
    for(int i = 0 ; i < player1.length; i++){
       if(player1[i] > player2[i]){
        System.out.println("round No:" + (i+1) + "- Player 1 wins the round " + player1[i] + " beats " + player2[i]);
        player1Win++;
       } else if(player1[i] < player2[i]){
        System.out.println("round No:" + (i+1) + "- Player 2 wins the round " + player2[i] + " beats " + player1[i]);
        player2Win++;
       } else {
        System.out.println("round No:" + (i+1) + "- Tie!" + player1[i] + " ties with " + player2[i]);
       }
        
    }

    if(player1Win > player2Win){
      System.out.println("Player One wins!! He won " + String.valueOf(player1Win) + " rounds" +" Beating Player two who won " + String.valueOf(player2Win) + " rounds");
    }
    else if(player1Win < player2Win){
      System.out.println("Player Two wins!! He won " + String.valueOf(player2Win) + " rounds" +" Beating Player one who won " + String.valueOf(player1Win) + " rounds");
    } else {
      System.out.println("It's a tie!! Both players won " + String.valueOf(player1Win) + " rounds");
    }

   
  }

}
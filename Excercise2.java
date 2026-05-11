class Excercise2{

    public static void main(String[] arguments) {
    int moneyAmount = 500;
    int [] loanAmount = {60, 20, 100, 80, 40, 300, 200, 100};

    for (int i = 0; i < loanAmount.length; i++) {

        System.out.println("Cash in pot: " + moneyAmount); 

        if(loanAmount[i] <= moneyAmount){

              System.out.println("Loan amount requested: " + loanAmount[i] + " - Loan amount granted!");
            moneyAmount -= loanAmount[i]; //this piece of code is not wokring as expected, it is not reducing the money amount by the loan amount and i dont know why

          
        }     
        else if(loanAmount[i] > moneyAmount){
            System.out.println("Loan amount requested: " + loanAmount[i] );
            System.out.println("The exact loan requested amount cannot be processed in full (insufficent funds avaliable)");
            System.out.println("However, we will give you what we can... " + moneyAmount);
            moneyAmount = 0;
        }
        else if(moneyAmount == 0){
            System.out.println("Cash remaining in the pot: " + moneyAmount); 
            System.out.println("The following loan requests cou ld not be facilitated." + "\n" + "Loan amount requested: " + loanAmount[i] );
        }

        
    }

    }

}
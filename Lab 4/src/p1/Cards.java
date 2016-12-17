package p1;

public class Cards {

        
        enum Rank {
            ace,
            two,
            three,
            four,
            five,
            six,
            seven,
            eight,
            nine,
            ten,
            jack,
            queen,
            king
        }

        public static void main(String[] args) {
            
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;
        
        highCard = Rank.ace;
        faceCard = Rank.king;
        card1 = Rank.two;
        card2 = Rank.three;
        
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard );
        
        int card1val = card1.ordinal() + 1;
        int card2val = card2.ordinal() + 1;
        
        System.out.println("A two card hand: " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1val + card2val));
        
    }

}

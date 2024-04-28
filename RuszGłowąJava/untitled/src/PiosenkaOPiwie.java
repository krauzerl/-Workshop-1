public class PiosenkaOPiwie {
    public static void main(String[] args){
        int liczbaButelek = 10;
        String slowo = "bottles";

        while (liczbaButelek>0){


            System.out.println(liczbaButelek+" green "+ slowo + " hanging on the wall");
            System.out.println(liczbaButelek+" green "+ slowo + " hanging on the wall");
            System.out.println("And if one green botlle should accidentlly fall");
            liczbaButelek = liczbaButelek - 1;

            if(liczbaButelek == 1){
                slowo = "bottle";
            }
            if (liczbaButelek >= 1 ){
                System.out.println("There'll be " + liczbaButelek + " green " + slowo +  " ,hanging on the wall");
            }
            else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}

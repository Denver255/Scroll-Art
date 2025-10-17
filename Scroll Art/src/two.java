public class two {
  public static void main(String[] args) throws InterruptedException {
        for(int i=0; i>-1;i++){
       //sceneOneP2();
        System.out.println("");
        System.out.println("");
         sceneTwo();
                
            Thread.sleep(35);
         }
    }
 static String[][] creation(){
        String[][] stab = new String[8][6];
        stab[0][0]=" ";
        stab[0][1]=" ";
        stab[0][2]="-";
        stab[0][3]="-";
        stab[0][4]=" ";
        stab[0][5]=" ";
        stab[1][0]=" ";
        stab[1][1]="*";
        stab[1][2]=")";
        stab[1][3]=")";
        stab[1][4]="*";
        stab[1][5]=" ";
        stab[2][0]="*";
        stab[2][1]="*";
        stab[2][2]="\\";
        stab[2][3]="/";
        stab[2][4]="*";
        stab[2][5]="/";
        stab[3][0]="/";
        stab[3][1]="-";
        stab[3][2]="/";
        stab[3][3]="|";
        stab[3][4]="|";
        stab[3][5]="/";
        stab[4][0]="\\";
        stab[4][1]="-";
        stab[4][2]="\\";
        stab[4][3]="|";
        stab[4][4]="|";
        stab[4][5]="\\";
        stab[5][0]=" ";
        stab[5][1]=" ";
        stab[5][2]=" ";
        stab[5][3]=" ";
        stab[5][4]=" ";
        stab[5][5]="\\";
        stab[6][0]="/";
        stab[6][1]="-";
        stab[6][2]="/";
        stab[6][3]="|";
        stab[6][4]="|";
        stab[6][5]="/";
        stab[7][0]="\\";
        stab[7][1]="-";
        stab[7][2]="\\";
        stab[7][3]="|";
        stab[7][4]="|";
        stab[7][5]="\\";
        return stab;
    }

    static String evolution1(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab= "";
         for(int i=0; i<8; i++){
           SuperStab= SuperStab + " " + stab[i][0];
        }
        SuperStab= Superspaces + SuperStab;
        return SuperStab;
    }

    static String evolution2(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab2= "";
         for(int i=0; i<8; i++){
           SuperStab2= SuperStab2 + " " + stab[i][1];
        }
        SuperStab2= Superspaces + SuperStab2;
        return SuperStab2;
    }

    static String evolution3(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab3= "";
         for(int i=0; i<8; i++){
           SuperStab3= SuperStab3 + " " + stab[i][2];
        }
        SuperStab3= Superspaces + SuperStab3;
        return SuperStab3;
    }

    static String evolution4(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab4= "";
         for(int i=0; i<8; i++){
           SuperStab4= SuperStab4 + " " + stab[i][3];
        }
        SuperStab4= Superspaces + SuperStab4;
        return SuperStab4;
    }

    static String evolution5(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab5= "";
         for(int i=0; i<8; i++){
           SuperStab5= SuperStab5 + " " + stab[i][4];
        }
        SuperStab5= Superspaces + SuperStab5;
        return SuperStab5;
    }

    static String evolution6(String[][] stab){
        String Superspaces= "                    ";
        String SuperStab6= "";
         for(int i=0; i<8; i++){
           SuperStab6= SuperStab6 + " " + stab[i][0];
        }
        SuperStab6= Superspaces + SuperStab6;
        return SuperStab6;
    }

     static void sceneTwo(){
        System.out.println(evolution1(creation()));
        System.out.println(evolution2(creation()));
        System.out.println(evolution3(creation()));
        System.out.println(evolution4(creation()));
        System.out.println(evolution5(creation()));
        System.out.println(evolution6(creation()));
       

    }






    
}

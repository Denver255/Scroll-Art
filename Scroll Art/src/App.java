public class App {
    static int counter=0;
    static boolean gurt=true;
    static String[] Superspaces= {"                    "};
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i>-1;i++){
       sceneOneP2();
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

    static String[] addSpaces(String[] spaces){
        String[] ultraSpaces = new String[counter + 1];
        for(int i=0; i<counter; i++){
            ultraSpaces[i]=" ";
        }
        if(gurt==true){
        ultraSpaces[ultraSpaces.length-1]=" ";
        } else{
            ultraSpaces[ultraSpaces.length-1]="";
        }
        return ultraSpaces;
    }

    static String[] combine1(String[] spaces){
        String[] fusion1 = new String[spaces.length + 8];
        for(int i=0; i<spaces.length; i++){
            //System.out.println(spaces[i]);
            fusion1[i]=spaces[i];
        }
        fusion1[fusion1.length-1] = "\\";
        fusion1[fusion1.length-2] = "/";
        fusion1[fusion1.length-3] = " ";
        fusion1[fusion1.length-4] = "/";
        fusion1[fusion1.length-5] = "_";
        fusion1[fusion1.length-6] = " ";
        fusion1[fusion1.length-7] = "/";
        fusion1[fusion1.length-8] = "\\";
        return fusion1;
    }
    static String[] combine2(String[] spaces){
        String[] fusion2 = new String[spaces.length + 8];
        for(int i=0; i<spaces.length; i++){
            fusion2[i]=spaces[i];
        }
        fusion2[fusion2.length-1] = ".";
        fusion2[fusion2.length-2] = ".";
        fusion2[fusion2.length-3] = "?";
        fusion2[fusion2.length-4] = ".";
        fusion2[fusion2.length-5] = ".";
        fusion2[fusion2.length-6] = "!";
        fusion2[fusion2.length-7] = ".";
        fusion2[fusion2.length-8] = ".";
        return fusion2;
    }
    static String[] combine3(String[] spaces){
        String[] fusion3 = new String[spaces.length + 8];
        for(int i=0; i<spaces.length; i++){
            fusion3[i]=spaces[i];
        }
        fusion3[fusion3.length-1] = "\\";
        fusion3[fusion3.length-2] = "/";
        fusion3[fusion3.length-3] = " ";
        fusion3[fusion3.length-4] = "_";
        fusion3[fusion3.length-5] = "_";
        fusion3[fusion3.length-6] = " ";
        fusion3[fusion3.length-7] = "\\";
        fusion3[fusion3.length-8] = "/";
        return fusion3;
    }
    static String[] combine4(String[] spaces){
        String[] fusion4 = new String[spaces.length + 8];
        for(int i=0; i<spaces.length; i++){
            fusion4[i]=spaces[i];
        }
        fusion4[fusion4.length-1] = "\\";
        fusion4[fusion4.length-2] = "/";
        fusion4[fusion4.length-3] = " ";
        fusion4[fusion4.length-4] = "\\";
        fusion4[fusion4.length-5] = "/";
        fusion4[fusion4.length-6] = " ";
        fusion4[fusion4.length-7] = "/";
        fusion4[fusion4.length-8] = "\\";
        return fusion4;
    }
    static String[] combine5(String[] spaces){
        String[] fusion5 = new String[spaces.length + 8];
        for(int i=0; i<spaces.length; i++){
            fusion5[i]=spaces[i];
        }
        fusion5[fusion5.length-1] = "|";
        fusion5[fusion5.length-2] = "|";
        fusion5[fusion5.length-3] = " ";
        fusion5[fusion5.length-4] = "|";
        fusion5[fusion5.length-5] = "|";
        fusion5[fusion5.length-6] = " ";
        fusion5[fusion5.length-7] = "|";
        fusion5[fusion5.length-8] = "|";
        return fusion5;
    }
    static String getLine1(String[] fusion1){
        String line1="";
        for(int i=0; i<fusion1.length; i++){
            line1= line1 + " " + fusion1[i];
        }
        return line1;
    }
    static String getLine2(String[] fusion2){
        String line2="";
         for(int i=0; i<fusion2.length; i++){
            line2= line2 + " " + fusion2[i];
        }
        return line2;
    }
     static String getLine3(String[] fusion3){
        String line3="";
         for(int i=0; i<fusion3.length; i++){
            line3= line3 + " " + fusion3[i];
        }
        return line3;
    }
     static String getLine4(String[] fusion4){
        String line4="";
         for(int i=0; i<fusion4.length; i++){
            line4= line4 + " " + fusion4[i];
        }
        return line4;
    }
     static String getLine5(String[] fusion5){
        String line5="";
         for(int i=0; i<fusion5.length; i++){
            line5= line5 + " " + fusion5[i];
        }
        return line5;
    }
    static void sceneOneP2(){
        //boolean gurt=true;
        String spaces[]= {" "};
        System.out.println(getLine1(combine1(addSpaces(spaces))));
        System.out.println(getLine2(combine2(addSpaces(spaces))));
        System.out.println(getLine3(combine3(addSpaces(spaces))));
        System.out.println(getLine4(combine4(addSpaces(spaces))));
        System.out.println(getLine5(combine5(addSpaces(spaces))));
        System.out.println(getLine5(combine5(addSpaces(spaces))));
        if(gurt==true){
            counter= counter+1;
        }
        if(gurt==false){
            counter=counter-1;
        }
        if(counter==20){
            gurt=false;
        }
        if(counter==0){
            gurt=true;
        }
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


public class App {
    static int counter=0;
    static boolean gurt=true;
    public static void main(String[] args) throws Exception {
        for(int i=0; i>-1;i++){
        sceneOneP2();
                

         }

    //     String spaces[]= {""};
    //     boolean yo=true;
    //    while(yo==true){
    //     spaces=addSpaces(spaces);
    //     System.out.println(getLine1(combine1(spaces)));
    //     System.out.println(getLine2(combine2(spaces)));
    //     System.out.println(getLine3(combine3(spaces)));
    //     System.out.println(getLine4(combine4(spaces)));
    //     System.out.println(getLine5(combine5(spaces)));
    //     System.out.println(getLine5(combine5(spaces)));
    //     }

    }
    // static void sceneOneP1(){
    //     String spaces[] = {" "};
    //     }


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
        fusion3[fusion3.length-7] = "_";
        fusion3[fusion3.length-8] = "_";
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


    // static void printSpaces( String[] spaces){
    //      for(int i=0; i<spaces.length;i++){
    //         System.out.println(spaces[i]);

    //     }
    // }
    }


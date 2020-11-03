public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        /*
        String 2D array oluştur     Hafta05-Gun21 Java2D_Array4 de cozduk ayni sekilde

       {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       ve butun elemanlari topla

       double return et(toplam sonucu double veri tipi olmali)

    */
    public static void main(String[] args) {

//        Tek Boyutlu bir diziyi
//        Koda burdan başlayın

        String[] array={"$12" , "$22" , "$0","€9" , "€40" , "$1","€12", "$2","$0"};

        int tplm = 0;



        for (int i=0; i<array.length; i++){

                if(array[i].contains("$")){
                    tplm+=Integer.parseInt(array[i].replaceAll("[$]",""))*3.2;

                }else if(array[i].contains("€")){

                    tplm+= Integer.parseInt(array[i].replaceAll("[€]",""))*4.2;
            }
        }System.out.println(tplm);
    }
}




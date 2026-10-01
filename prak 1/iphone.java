class iphone {
    String color;
    String storage;


    public void nyala() {System.out.println("iphone warna " + this.color + " menyala");}
    public void mati() {System.out.println("iphone warna" + this.color + " menyala");}
    public void berdering() {System.out.println("iphone warna " + this.color + " menyala");}
    public void videocall() {System.out.println("iphone warna " + this.color + " menyala");}

    public static void main(String[] args) {
        iphone iGold = new iphone();
        iphone iGreen = new iphone();
        iphone iGrey = new iphone();
        iphone iDarkGrey = new iphone();
    
        iGold.color = "gold";
        iGreen.color = "green";
        iGrey.color = "grey";
        iDarkGrey.color = "dark grey";
  
        iGold.storage= "64gb";
        iGreen.storage= "128gb";
        iGrey.storage= "512gb";
        iDarkGrey.storage= "64gb";

        System.out.println();
        iGreen. berdering();
        iDarkGrey. mati();
        iGold. nyala(); 
        System.out.println("");
         
    
    
    
    
    
    
    
    }

}



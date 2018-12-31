package com.codz;

public class Bed {
    private BedFrame bedFrame;
    private Blanket blanket;
    private BedSheets bedSheets;
    private Pillow pillow;

    public Bed(BedFrame bedFrame, Blanket blanket, BedSheets bedSheets, Pillow pillow) {
        this.bedFrame = bedFrame;
        this.blanket = blanket;
        this.bedSheets = bedSheets;
        this.pillow = pillow;
    }

    private BedFrame getBedframe(){
        return (this.bedFrame);
    }


    private Blanket getBlanket() {
        return blanket;
    }

    private BedSheets getBedSheets() {
        return bedSheets;
    }

    private Pillow getPillow() {
        return pillow;
    }

    public void makeBed(){
        System.out.println("Making Bed...");
        System.out.println("Bed().makeBed(): Making bed");
        this.getBedframe().makeBedFrame();
        this.getBlanket().makeBlanket();
        this.getBedSheets().makeBedSheets();
        this.getPillow().makePllow();
        System.out.println("Bed MakeUP complete!!");
    }
}

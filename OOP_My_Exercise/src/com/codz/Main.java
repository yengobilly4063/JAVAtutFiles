package com.codz;

public class Main {

    public static void main(String[] args) {

        BedFrame bedFrame = new BedFrame(150, 300, 50, false, "wood");
//        bedFrame.makeBedFrame();
//        HeadRestExtension headrestextension = new HeadRestExtension(true);
        Blanket blanket = new Blanket("Steve's", true, "purple", 100);
        BedSheets bedsheets = new BedSheets("wool", "yellow", 40, true);
        Pillow pillow = new Pillow(40, 30, "blue", "designer", 250);

        Bed bed = new Bed(bedFrame, blanket, bedsheets, pillow);
        bed.makeBed();
    }
}

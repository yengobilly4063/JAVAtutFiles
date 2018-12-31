package com.codz;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixalAt(1200, 50, "yellow");
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
}

















//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
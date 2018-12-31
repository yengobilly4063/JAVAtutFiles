package com.codz;

public class HeadRestExtension {
    private int width = 200;
    private int height = 100;
    private boolean designer = false;
    private String color;

    public HeadRestExtension() {
        if (designer){
            this.color = "Stripped black/white";
        }else{
            this.color = "plain black/white";
        }

    }

    public void addHeadRestExtension(){
        System.out.println("HeadRestExtension().addHeadRestExtension(): Attaching HearRest Extension");
    }

    public String getColor(){
        return ( this.color );
    }

    public void setDesigner(boolean designer){
        this.designer = designer;
    }
}

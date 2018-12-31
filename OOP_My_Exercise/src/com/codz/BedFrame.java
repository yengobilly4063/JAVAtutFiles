package com.codz;

public class BedFrame {
    private int width;
    private int length;
    private int height;
    private boolean hasHeadRestExtension;
    private HeadRestExtension head_rest_xtension;
    private String material;

    public BedFrame(int width, int length, int height, boolean hasHeadRestExtension, String material) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.material = material;
        this.hasHeadRestExtension = hasHeadRestExtension;

        if ( hasHeadRestExtension ){
            this.head_rest_xtension = new HeadRestExtension();
        }

    }
    private HeadRestExtension getHead_rest_xtension(){
        return (this.head_rest_xtension);
    }

    public void makeBedFrame(){
        System.out.println("BedFrame().makeBedFrame(): Placing bedframe in correct spot and angle");
        if ( hasHeadRestExtension ){
            this.head_rest_xtension.addHeadRestExtension();
        }else{
            System.out.println("No Head Rest Extensions found");
        }
    }
}

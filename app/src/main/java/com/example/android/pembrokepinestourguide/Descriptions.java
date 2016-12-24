package com.example.android.pembrokepinestourguide;

/**
 * Created by tonynguyen on 11/16/16.
 */

public class Descriptions {

    // Name of place
    private int mTitle;

    // Description one of place
    private int mDescOne;

    // Description two of place
    private int mDescTwo;

    // Description three of place
    private int mDescThree;

    // Description four of place
    private int mDescFour;

    // Image of object
    private int mImageResourceId;

    // No image
    private int NO_IMAGE_PROVIDED = -1;

    // Descriptions object
    public Descriptions(int imageResourceId,int title, int descOne, int descTwo){
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescOne = descOne;
        mDescTwo = descTwo;
    }

    // Descriptions object with no image
    public Descriptions(int title, int descOne, int descTwo){
        mTitle = title;
        mDescOne = descOne;
        mDescTwo = descTwo;
    }

    // Descriptions object with image
    public Descriptions(int imageResourceId, int title, int descOne, int descTwo, int descThree, int descFour){
        mTitle = title;
        mDescOne = descOne;
        mDescTwo = descTwo;
        mDescThree = descThree;
        mDescFour = descFour;
        mImageResourceId = imageResourceId;
    }

    // Get title
    public int getTitle() {
        return mTitle;
    }

    // Get description one
    public int getDescOne() {
        return mDescOne;
    }

    // Get description two
    public int getDescTwo() {
        return mDescTwo;
    }

    public int getDescThree() {
        return mDescThree;
    }

    public int getDescFour() {
        return mDescFour;
    }

    // Get image resource ID
    public int getImageResourceId(){
        return mImageResourceId;
    }

    // Check if description has image
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

package com.example.muhammad.miwok;

/**
 * Created by Muhammad on 9/19/2016.
 * this class convert default word into miwok word translation
 * default = English
 */
public class Word {
    private String defaultWord ;//default word translation
    private String miwokWord;//miwok word translation
    private int imageResourceId = NO_IMAGE_PROVIDED;//image id
    public static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId ;//audio resource id



    public Word(String defaultWord , String miwokWord, int mAudioResourceId){
        setDefaultWord(defaultWord);
        setMiwokWord(miwokWord);
        setmAudioResourceId(mAudioResourceId);
    }
    public Word(String defaultWord , String miwokWord,int imageResourceId, int mAudioResourceId){
        setDefaultWord(defaultWord);
        setMiwokWord(miwokWord);
        setImageResourceId(imageResourceId);
        setmAudioResourceId(mAudioResourceId);
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    //return miwok translation
    public String getMiwokWord() {
        return miwokWord;
    }
    //set miwok translation
    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    //return default word
    public String getDefaultWord() {
        return defaultWord;
    }
    //set default word
    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

    public boolean hasImage(){
        return imageResourceId!=NO_IMAGE_PROVIDED;
    }


}

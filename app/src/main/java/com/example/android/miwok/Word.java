package com.example.android.miwok;

/**
 * Created by Michael Peterson on 7/14/2016.
 */
public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}

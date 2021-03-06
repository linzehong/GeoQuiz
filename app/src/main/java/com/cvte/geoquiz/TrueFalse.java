package com.cvte.geoquiz;

/**
 * Created by Administrator on 2016/3/12.
 */
public class TrueFalse {

    private int mQuestion;
    private boolean mTrueQuestion;
    private boolean mIsCheated;

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
        mIsCheated = false;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public boolean isIsCheated() {
        return mIsCheated;
    }

    public void setIsCheated(boolean mIsCheated) {
        this.mIsCheated = mIsCheated;
    }
}

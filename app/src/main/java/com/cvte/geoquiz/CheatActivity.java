package com.cvte.geoquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/3/13.
 */
public class CheatActivity extends Activity {

    public static final String EXTRA_ANSWER_IS_TRUE = "com.cvte.geoquiz.answer_is_true";

    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        mAnswerTextView = (TextView) findViewById(R.id.answerTextView);

        mShowAnswer = (Button) findViewById(R.id.showAnswerButton);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resId = (mAnswerIsTrue) ? (R.string.true_button) : (R.string.false_button);
                mAnswerTextView.setText(resId);
            }
        });
    }
}

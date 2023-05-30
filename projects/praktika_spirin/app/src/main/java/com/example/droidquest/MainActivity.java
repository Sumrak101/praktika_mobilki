package com.example.droidquest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() вызван");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() вызван");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() вызван");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() вызван");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() вызван");
    }

    private static final String TAG = "MainActivity";

    private static final int REQUEST_CODE_DECEIT = 0;
    private static final String KEY_INDEX = "index";
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private Button mDeceitButton;
    private TextView mQuestionTextView;

    private boolean mIsDeceiter;


    private Button mPreviousButton;
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_android, true),
            new Question(R.string.question_linear, false),
            new Question(R.string.question_service, false),
            new Question(R.string.question_res, true),
            new Question(R.string.question_manifest, false),
            new Question(R.string.question_developer, true),
            new Question(R.string.question_java, true),
            new Question(R.string.question_created, true),
            new Question(R.string.question_creator, true),
            new Question(R.string.question_versions, true),
    };

    private int mCurrentIndex = 0;

    private void updateQuestion() {
        int question = mQuestionBank[mCurrentIndex].getmTextResId();
        mQuestionTextView.setText(question);
    }

    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].ismAnswerTrue();
        int messageResId = 0;
        if (mIsDeceiter) {
            messageResId = R.string.judgment_toast;
        } else {
            if (userPressedTrue == answerIsTrue) {
                messageResId = R.string.correct_toast;

            } else {
                messageResId = R.string.incorrect_toast;
            }
            Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) вызван");
        setContentView(R.layout.activity_main);
        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });



        mQuestionTextView = (TextView) findViewById(R.id.textView);
        mTrueButton = (Button) findViewById(R.id.true_button);

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                mIsDeceiter = false;
                updateQuestion();
            }
        });

        mDeceitButton = (Button) findViewById(R.id.deceit_button);
        mDeceitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, DeceitActivity.class);
                boolean answerIsTrue = mQuestionBank[mCurrentIndex].ismAnswerTrue();
                Intent i = DeceitActivity.newIntent(MainActivity.this,answerIsTrue);
//             1
                startActivityForResult(i, REQUEST_CODE_DECEIT);
            }


        });

        mPreviousButton = (Button) findViewById(R.id.previous_button);
        mPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCurrentIndex = (mCurrentIndex - 1) % mQuestionBank.length;
                updateQuestion();
            }
        });

        if (savedInstanceState != null) {
            mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
        }
        updateQuestion();


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        if (requestCode == REQUEST_CODE_DECEIT) {
            if (data == null) {
                return;
            }
            mIsDeceiter = DeceitActivity.wasAnswerShown(data);
        }
    }
}
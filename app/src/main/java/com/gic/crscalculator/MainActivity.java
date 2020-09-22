package com.gic.crscalculator;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Variable for radio group data
    private RadioGroup radioMaritalStatus;
    private RadioGroup ieltsStatus;
    private RadioGroup tefStatus;
    private RadioGroup provincialStatus;
    private RadioGroup familyInCanadaStatus;
    private RadioGroup offerEmploymentinCanada;

    //Variable for seek_bar data
    private SeekBar ageSeek;

    private SeekBar completedDegreeSeek;

    private SeekBar ieltsListeningScoreSeek;
    private SeekBar ieltsReadingScoreSeek;
    private SeekBar ieltsWritingScoreSeek;
    private SeekBar ieltsSpeakingScoreSeek;

    private SeekBar tefListeningScoreSeek;
    private SeekBar tefReadingScoreSeek;
    private SeekBar tefWritingScoreSeek;
    private SeekBar tefSpeakingScoreSeek;

    private SeekBar workExCanadaSeek;
    private SeekBar workExBDSeek;

    private SeekBar spouse_diplomaInfoSeek;
    private SeekBar spouse_workExCanadaSeek;

    private SeekBar spouse_ieltsListenigScoreSeek;
    private SeekBar spouse_ieltsReadingScoreSeek;
    private SeekBar spouse_ieltsWritingScoreSeek;
    private SeekBar spouse_ieltsSpeakingScoreSeek;

    private SeekBar eduCanadaInfoSeek;

    //TextView find for seek_bar result showing
    private TextView age_text;

    private TextView completed_degree_result_txtview;

    private TextView ielts_listening_score;
    private TextView ielts_reading_score;
    private TextView ielts_writing_score;
    private TextView ielts_speaking_score;

    private TextView tef_listening_score;
    private TextView tef_reading_score;
    private TextView tef_writing_score;
    private TextView tef_speaking_score;

    private TextView work_experience_canada_score;
    private TextView work_experience_bd_score;

    private TextView spouse_edu_info_score;
    private TextView spouse_work_exp_canada;

    private TextView spouse_ielts_listening_score;
    private TextView spouse_ielts_reading_score;
    private TextView spouse_ielts_writing_score;
    private TextView spouse_ielts_speaking_score;

    private TextView edu_in_canada_score_bottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Radio find here
        radioMaritalStatus = findViewById(R.id.radio_marital_status);
        ieltsStatus = findViewById(R.id.radio_ielts_status);
        tefStatus = findViewById(R.id.radio_tef_status);
        provincialStatus = findViewById(R.id.radio_provincial_status);
        familyInCanadaStatus = findViewById(R.id.radio_family_in_canada);
        offerEmploymentinCanada = findViewById(R.id.radio_offer_employment_in_canada);

        //Seekbar find by id here
        ageSeek = findViewById(R.id.ageSeek);

        completedDegreeSeek = findViewById(R.id.completedDegreeSeek);

        ieltsListeningScoreSeek = findViewById(R.id.ieltsListeningScoreSeek);
        ieltsReadingScoreSeek = findViewById(R.id.ieltsReadingScoreSeek);
        ieltsWritingScoreSeek = findViewById(R.id.ieltsWritingScoreSeek);
        ieltsSpeakingScoreSeek = findViewById(R.id.ieltsSpeakingScoreSeek);

        tefListeningScoreSeek = findViewById(R.id.tefListeningScoreSeek);
        tefReadingScoreSeek = findViewById(R.id.tefReadingScoreSeek);
        tefWritingScoreSeek = findViewById(R.id.tefWritingScoreSeek);
        tefSpeakingScoreSeek = findViewById(R.id.tefSpeakingScoreSeek);

        workExCanadaSeek = findViewById(R.id.workExCanadaSeek);
        workExBDSeek = findViewById(R.id.workExBDSeek);

        spouse_diplomaInfoSeek = findViewById(R.id.spouse_diplomaInfoSeek);
        spouse_workExCanadaSeek = findViewById(R.id.spouse_workExCanadaSeek);

        spouse_ieltsListenigScoreSeek = findViewById(R.id.spouse_ieltsListenigScoreSeek);
        spouse_ieltsReadingScoreSeek = findViewById(R.id.spouse_ieltsReadingScoreSeek);
        spouse_ieltsWritingScoreSeek = findViewById(R.id.spouse_ieltsWritingScoreSeek);
        spouse_ieltsSpeakingScoreSeek = findViewById(R.id.spouse_ieltsSpeakingScoreSeek);

        eduCanadaInfoSeek = findViewById(R.id.eduCanadaInfoSeek);


        //Find all textview for showing seekbar result
        age_text = findViewById(R.id.age_text);

        completed_degree_result_txtview = findViewById(R.id.completed_degree_result_txtview);

        ielts_listening_score = findViewById(R.id.ielts_listening_score);
        ielts_reading_score = findViewById(R.id.ielts_reading_score);
        ielts_writing_score = findViewById(R.id.ielts_writing_score);
        ielts_speaking_score = findViewById(R.id.ielts_speaking_score);

        tef_listening_score = findViewById(R.id.tef_listening_score);
        tef_reading_score = findViewById(R.id.tef_reading_score);
        tef_writing_score = findViewById(R.id.tef_writing_score);
        tef_speaking_score = findViewById(R.id.tef_speaking_score);

        work_experience_canada_score = findViewById(R.id.work_experience_canada_score);
        work_experience_bd_score = findViewById(R.id.work_experience_bd_score);

        spouse_edu_info_score = findViewById(R.id.spouse_edu_info_score);
        spouse_work_exp_canada = findViewById(R.id.spouse_work_exp_canada);

        spouse_ielts_listening_score = findViewById(R.id.spouse_ielts_listening_score);
        spouse_ielts_reading_score = findViewById(R.id.spouse_ielts_reading_score);
        spouse_ielts_writing_score = findViewById(R.id.spouse_ielts_writing_score);
        spouse_ielts_speaking_score = findViewById(R.id.spouse_ielts_speaking_score);

        edu_in_canada_score_bottom = findViewById(R.id.edu_in_canada_score_bottom);


        maritalStatus();
        getIeltsStatus();
        getTefStatus();
        getProvincialStatus();
        getFamilyInCanadaStatus();
        getOfferEmploymentinCanada();

        /*****
         * Get data form seek_bar for all seek_bar
         * 11111111111111111111111111111**/


        ageSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                age_text.setText("" + progress + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get data form seek_bar for all seek_bar
         * 22222222222222222222222222222**/

        completedDegreeSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {


                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 2) {
                    completed_degree_result_txtview.setText("" + progress + "Completed Two years deploma!");
                } else if (progress == 3) {
                    completed_degree_result_txtview.setText("" + progress + "Completed Three years deploma!");
                } else if (progress == 2) {
                    completed_degree_result_txtview.setText("" + progress + "Completed Four years deploma!");
                } else if (progress == 1 && progress == 0) {
                    completed_degree_result_txtview.setText("" + progress + "Completed One years deploma!");
                } else {
                    completed_degree_result_txtview.setText("" + progress + "None");
                }


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get IELTS data form seek_bar for all seek_bar
         * 33333333333333333333333333**/

        ieltsListeningScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    ielts_listening_score.setText("4.5");
                } else if (progress == 2) {
                    ielts_listening_score.setText("6.0");
                } else if (progress == 3) {
                    ielts_listening_score.setText("7.5");
                } else if (progress == 4 && progress == 5) {
                    ielts_listening_score.setText("8.0");
                } else {
                    ielts_listening_score.setText("9.5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get IELTS data form seek_bar for all seek_bar
         * 44444444444444444444444444**/

        ieltsReadingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    ielts_reading_score.setText("4.5");
                } else if (progress == 2) {
                    ielts_reading_score.setText("6.0");
                } else if (progress == 3) {
                    ielts_reading_score.setText("7.5");
                } else if (progress == 4 && progress == 5) {
                    ielts_reading_score.setText("8.0");
                } else {
                    ielts_reading_score.setText("9.5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get IELTS data form seek_bar for all seek_bar
         * 55555555555555555555**/

        ieltsReadingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    ielts_reading_score.setText("4.5");
                } else if (progress == 2) {
                    ielts_reading_score.setText("6.0");
                } else if (progress == 3) {
                    ielts_reading_score.setText("7.5");
                } else if (progress == 4) {
                    ielts_reading_score.setText("8.0");
                } else {
                    ielts_reading_score.setText("9.5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get IELTS data form seek_bar for all seek_bar
         * 666666666666666666666**/

        ieltsWritingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    ielts_writing_score.setText("4.5");
                } else if (progress == 2) {
                    ielts_writing_score.setText("6.0");
                } else if (progress == 3) {
                    ielts_writing_score.setText("7.5");
                } else if (progress == 4) {
                    ielts_writing_score.setText("8.0");
                } else {
                    ielts_writing_score.setText("9.5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get IELTS data form seek_bar for all seek_bar
         * 7777777777777777777**/

        ieltsSpeakingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    ielts_speaking_score.setText("4.5");
                } else if (progress == 2) {
                    ielts_speaking_score.setText("6.0");
                } else if (progress == 3) {
                    ielts_speaking_score.setText("7.5");
                } else if (progress == 4) {
                    ielts_speaking_score.setText("8.0");
                } else {
                    ielts_speaking_score.setText("9.5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         * 888888888888888888888888888**/

        tefListeningScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    tef_listening_score.setText("247");
                } else if (progress == 2) {
                    tef_listening_score.setText("201");
                } else if (progress == 3) {
                    tef_listening_score.setText("280");
                } else if (progress == 4) {
                    tef_listening_score.setText("250");
                } else {
                    tef_listening_score.setText("187");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         *999999999999999999999999**/

        tefReadingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    tef_reading_score.setText("247");
                } else if (progress == 2) {
                    tef_reading_score.setText("201");
                } else if (progress == 3) {
                    tef_reading_score.setText("280");
                } else if (progress == 4) {
                    tef_reading_score.setText("250");
                } else {
                    tef_reading_score.setText("187");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         *10 10 10 10 10 10 10 10 10 10 10 10**/

        tefWritingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    tef_writing_score.setText("247");
                } else if (progress == 2) {
                    tef_writing_score.setText("201");
                } else if (progress == 3) {
                    tef_writing_score.setText("280");
                } else if (progress == 4) {
                    tef_writing_score.setText("250");
                } else {
                    tef_writing_score.setText("187");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         *11 11 11 11 11 11 11 11 11 11**/

        tefSpeakingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    tef_speaking_score.setText("247");
                } else if (progress == 2) {
                    tef_speaking_score.setText("201");
                } else if (progress == 3) {
                    tef_speaking_score.setText("280");
                } else if (progress == 4) {
                    tef_speaking_score.setText("250");
                } else {
                    tef_speaking_score.setText("187");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *12 12 12 12 12 12 12 12 12 12**/

        workExCanadaSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    work_experience_canada_score.setText("1");
                } else if (progress == 2) {
                    work_experience_canada_score.setText("2");
                } else if (progress == 3) {
                    work_experience_canada_score.setText("3");
                } else if (progress == 4) {
                    work_experience_canada_score.setText("4");
                } else {
                    work_experience_canada_score.setText("5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *13 13 13 13 13 13 13 13 13 13**/

        workExBDSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    work_experience_bd_score.setText("1");
                } else if (progress == 2) {
                    work_experience_bd_score.setText("2");
                } else if (progress == 3) {
                    work_experience_bd_score.setText("3");
                } else if (progress == 4) {
                    work_experience_bd_score.setText("4");
                } else {
                    work_experience_bd_score.setText("5");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *14 14 14 14 14 14 14 14 14 14**/

        spouse_diplomaInfoSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_edu_info_score.setText(": 1 Year Diploma");
                } else if (progress == 2) {
                    spouse_edu_info_score.setText(": 2 Year Diploma");
                } else if (progress == 3) {
                    spouse_edu_info_score.setText(": 3 Year Diploma");
                } else if (progress == 4) {
                    spouse_edu_info_score.setText(": 4 Year Diploma");
                } else {
                    spouse_edu_info_score.setText(": 5 Year Diploma");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         *15 15 15 15 15 15 15 15 15 15**/

        spouse_workExCanadaSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_work_exp_canada.setText("1y");
                } else if (progress == 2) {
                    spouse_work_exp_canada.setText("2y");
                } else if (progress == 3) {
                    spouse_work_exp_canada.setText("3y");
                } else if (progress == 4) {
                    spouse_work_exp_canada.setText("4y");
                } else {
                    spouse_work_exp_canada.setText("5y");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *16 16 16 16 16 16 16 16 16 16**/

        spouse_ieltsListenigScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_ielts_listening_score.setText("4.5");
                } else if (progress == 2) {
                    spouse_ielts_listening_score.setText("6.0");
                } else if (progress == 3) {
                    spouse_ielts_listening_score.setText("7.0");
                } else if (progress == 4) {
                    spouse_ielts_listening_score.setText("8.5");
                } else {
                    spouse_ielts_listening_score.setText("9.0");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *17 17 17 17 17 17 17 17 17 17**/

        spouse_ieltsReadingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_ielts_reading_score.setText("4.5");
                } else if (progress == 2) {
                    spouse_ielts_reading_score.setText("6.0");
                } else if (progress == 3) {
                    spouse_ielts_reading_score.setText("7.0");
                } else if (progress == 4) {
                    spouse_ielts_reading_score.setText("8.0");
                } else {
                    spouse_ielts_reading_score.setText("9.0");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *18 18 18 18 18 18 18 18 18 18**/

        spouse_ieltsWritingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_ielts_writing_score.setText("4.5");
                } else if (progress == 2) {
                    spouse_ielts_writing_score.setText("6.0");
                } else if (progress == 3) {
                    spouse_ielts_writing_score.setText("7.0");
                } else if (progress == 4) {
                    spouse_ielts_writing_score.setText("8.0");
                } else {
                    spouse_ielts_writing_score.setText("9.0");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        /*****
         * Get TEF data form seek_bar for all seek_bar
         *19 19 19 19 19 19 19 19 19 19**/

        spouse_ieltsSpeakingScoreSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    spouse_ielts_listening_score.setText("4.5");
                } else if (progress == 2) {
                    spouse_ielts_listening_score.setText("6.0");
                } else if (progress == 3) {
                    spouse_ielts_listening_score.setText("7.0");
                } else if (progress == 4) {
                    spouse_ielts_listening_score.setText("8.0");
                } else {
                    spouse_ielts_listening_score.setText("9.0");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        /*****
         * Get TEF data form seek_bar for all seek_bar
         *20 20 20 20 20 20 20 20 20**/

        eduCanadaInfoSeek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                Log.d("TAG_COM_DEGREE_RESULT", "PROGRESS: " + progress);

                if (progress == 1) {
                    edu_in_canada_score_bottom.setText("Post-Secondary Education in Canada - Credential of one or two years!");
                } else if (progress == 2) {
                    edu_in_canada_score_bottom.setText("2Post-Secondary Education in Canada - Credential of one or two years!");
                } else if (progress == 3) {
                    edu_in_canada_score_bottom.setText("3Post-Secondary Education in Canada - Credential of one or two years!");
                } else if (progress == 4) {
                    edu_in_canada_score_bottom.setText("4Post-Secondary Education in Canada - Credential of one or two years!");
                } else {
                    edu_in_canada_score_bottom.setText("5Post-Secondary Education in Canada - Credential of one or two years!");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }


    //Get data here form marital status
    private void maritalStatus() {
        radioMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_single:
                        //get value form here
                        Log.d("TAG_MARRIED", "Single!");
                        break;
                    case R.id.radio_married:
                        Log.d("TAG_MARRIED", "Married!");
                        break;
                    case R.id.radio_separated:
                        Log.d("TAG_MARRIED", "Separated!");
                        break;

                }
            }
        });
    }

    //get ielts info from radio group
    private void getIeltsStatus() {
        ieltsStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.ielts_yes:
                        Log.d("TAG_IELTS", "YES");
                        break;
                    case R.id.ielts_no:
                        Log.d("TAG_IELTS", "NO");
                        break;
                }
            }
        });
    }

    //get ielts info from radio group
    private void getTefStatus() {
        tefStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.tef_yes:
                        Log.d("TAG_TEF", "YES");
                        break;
                    case R.id.tef_no:
                        Log.d("TAG_TEF", "NO");
                        break;

                }
            }
        });

    }

    //get ielts provincial nomination info from radio group
    private void getProvincialStatus() {
        provincialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.provincial_yes:
                        Log.d("TAG_PROVINCIAL", "YES");
                        break;
                    case R.id.provincial_no:
                        Log.d("TAG_PROVINCIAL", "NO");
                        break;
                }
            }
        });

    }

    //get ielts family in canada  info from radio group
    private void getFamilyInCanadaStatus() {
        familyInCanadaStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_family_yes:
                        Log.d("TAG_FAMILY_IN_CANADA", "YES");
                        break;
                    case R.id.radio_family_no:
                        Log.d("TAG_FAMILY_IN_CANADA", "NO");
                        break;
                }
            }
        });
    }

    //get offer employnebt in canada  info from radio group
    private void getOfferEmploymentinCanada() {
        offerEmploymentinCanada.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_offer_no:
                        Log.d("TAG_OFFER_EMP_IN_CANADA", "NO");
                        break;
                    case R.id.radio_offer_noc_oox:
                        Log.d("TAG_OFFER_EMP_IN_CANADA", "NOC OOX");
                        break;

                    case R.id.radio_offer_noc_o_a_c:
                        Log.d("TAG_OFFER_EMP_IN_CANADA", "NOC O/A/C");
                        break;
                }
            }
        });
    }


}

package com.example.clockapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    TextView TimezoneTextView;
    TextView TimezoneTextView1;
    TextView TimezoneTextView2;
    TextView TimezoneTextView3;
    TextView TimezoneTextView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


    Thread t;

    {
        t = new Thread() {
            @Override
            public void run() {
                try {
                    while (!isInterrupted()) {
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {


                                TimezoneTextView = (TextView) findViewById(R.id.sydneytime);
                                TimezoneTextView1 = (TextView) findViewById(R.id.latime);
                                TimezoneTextView2 = (TextView) findViewById(R.id.tokyotime);
                                TimezoneTextView3 = (TextView) findViewById(R.id.taipeitime);
                                TimezoneTextView4 = (TextView) findViewById(R.id.saopaulotime);


                                //SYDNEY TIME


                                TimeZone tz = TimeZone.getTimeZone("Australia/Sydney");
                                Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
                                SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss ");
                                format.setTimeZone(cal.getTimeZone());
                                String myFormatted = format.format(cal.getTime());

                                TextView TimeZoneTextView;


                                SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                                String date = df.format(cal.getInstance(tz).getTime());

                                //String time = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(new Date(cal.getTimeInMillis()));
                                String time = String.format("%02d", cal.get(Calendar.HOUR)) + ":" +

                                        String.format("%02d", cal.get(Calendar.MINUTE));

                                TimezoneTextView.setText("Date: " + date + "\n Time: " + myFormatted);


                                //LA TIME


                                TimeZone tz1 = TimeZone.getTimeZone("America/Dawson");
                                Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("America/Dawson"));
                                SimpleDateFormat format1 = new SimpleDateFormat("HH:mm:ss ");
                                format1.setTimeZone(cal1.getTimeZone());
                                String myFormatted1 = format1.format(cal1.getTime());


                                TextView TimeZoneTextView1;


                                SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
                                String date1 = df.format(cal1.getInstance(tz1).getTime());

                                //String time = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(new Date(cal.getTimeInMillis()));
                                String time1 = String.format("%02d", cal1.get(Calendar.HOUR)) + ":" +

                                        String.format("%02d", cal1.get(Calendar.MINUTE));

                                TimezoneTextView1.setText("Date: " + date1 + "\n Time: " + myFormatted1);


                                //TOKYO TIME

                                TimeZone tz2 = TimeZone.getTimeZone("Asia/Tokyo");
                                Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"));
                                SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss ");
                                format2.setTimeZone(cal2.getTimeZone());
                                String myFormatted2 = format2.format(cal2.getTime());

                                TextView TimeZoneTextView2;


                                SimpleDateFormat df2 = new SimpleDateFormat("dd-MMM-yyyy");
                                String date2 = df.format(cal2.getInstance(tz2).getTime());

                                //String time = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(new Date(cal.getTimeInMillis()));
                                String time2 = String.format("%02d", cal2.get(Calendar.HOUR)) + ":" +

                                        String.format("%02d", cal2.get(Calendar.MINUTE));

                                TimezoneTextView2.setText("Date: " + date2 + "\n Time: " + myFormatted2);

                                //TAIPEI TIME

                                TimeZone tz3 = TimeZone.getTimeZone("Asia/Taipei");
                                Calendar cal3 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Taipei"));
                                SimpleDateFormat format3 = new SimpleDateFormat("HH:mm:ss ");
                                format3.setTimeZone(cal3.getTimeZone());
                                String myFormatted3 = format3.format(cal3.getTime());

                                TextView TimeZoneTextView3;


                                SimpleDateFormat df3 = new SimpleDateFormat("dd-MMM-yyyy");
                                String date3 = df.format(cal2.getInstance(tz3).getTime());

                                //String time = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(new Date(cal.getTimeInMillis()));
                                String time3 = String.format("%02d", cal3.get(Calendar.HOUR)) + ":" +

                                        String.format("%02d", cal3.get(Calendar.MINUTE));

                                TimezoneTextView3.setText("Date: " + date3 + "\n Time: " + myFormatted3);

                                //SAO PAULO TIME

                                TimeZone tz4 = TimeZone.getTimeZone("America/Sao_Paulo");
                                Calendar cal4 = Calendar.getInstance(TimeZone.getTimeZone("America/Sao_Paulo"));
                                SimpleDateFormat format4 = new SimpleDateFormat("HH:mm:ss ");
                                format4.setTimeZone(cal4.getTimeZone());
                                String myFormatted4 = format4.format(cal4.getTime());

                                TextView TimeZoneTextView4;


                                SimpleDateFormat df4 = new SimpleDateFormat("dd-MMM-yyyy");
                                String date4 = df.format(cal4.getInstance(tz4).getTime());

                                //String time = new SimpleDateFormat("dd/MM/yyy HH:mm:ss").format(new Date(cal.getTimeInMillis()));
                                String time4 = String.format("%02d", cal4.get(Calendar.HOUR)) + ":" +

                                        String.format("%02d", cal4.get(Calendar.MINUTE));

                                TimezoneTextView4.setText("Date: " + date4 + "\n Time: " + myFormatted4);


                            }
                        });
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        t.start();
    }
    }
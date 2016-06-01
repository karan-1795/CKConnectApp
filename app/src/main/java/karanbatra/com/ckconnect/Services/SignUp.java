package karanbatra.com.ckconnect.Services;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

import karanbatra.com.ckconnect.R;
import karanbatra.com.ckconnect.Services.Codekamp.CodekampService;

public class SignUp extends Activity {
    LinearLayout linearLayout;
    Button button;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        CodekampService service=new CodekampService("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOjIsImlzcyI6Imh0dHA6XC9cL2FwaS5jb2Rla2FtcC5pblwvYXV0aGVudGljYXRlIiwiaWF0IjoxNDYzMjE1MzY4LCJleHAiOjE0NjQ0MjQ5NjgsIm5iZiI6MTQ2MzIxNTM2OCwianRpIjoiYTRjMzRiOGQwNmQ1MzAyMmNlMzYyMGE5NzE0ODQ0M2QifQ.S5x7yR4bwovzc92rr2N3-xwnSIhaz8y6ox4Fj1BK6Tc");





        linearLayout=(LinearLayout)findViewById(R.id.email_Layout);

        button=(Button)findViewById(R.id.buttonPanel);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                i=i+1;
                findViewById(R.id.et1).setVisibility(View.VISIBLE);
                //findViewById(R.id.et2).setVisibility(View.VISIBLE);



            }
        });}

        public void arrowLogin(View view)
    {

    }

    }



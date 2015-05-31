package org.chrisna.and.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void presentToast(View view) {
        Button button = (Button) view;
        CharSequence text = TextUtils.concat(
            "This button will launch the following app: ",
            button.getText(),
            "!"
        );
        Toast toast = createToast(text);
        toast.show();
    }

    private Toast createToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        return Toast.makeText(context, text, duration);
    }

}

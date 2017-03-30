package fvi.at.ua.animationlamp;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Animation extends AppCompatActivity {
        ImageView img;
        Button btnGo;
        boolean goOn =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

         btnGo = (Button)findViewById(R.id.btnGo);
         img = (ImageView)findViewById(R.id.imgLamp);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!goOn) {
                    img.setImageResource(R.drawable.transition_on);
                    ((TransitionDrawable) img.getDrawable()).startTransition(3000);
                     goOn = true;
                }else{
                    img.setImageResource(R.drawable.transition_off);
                    ((TransitionDrawable) img.getDrawable()).startTransition(1000);
                    goOn = false;
                }
                }
        });

    }
}

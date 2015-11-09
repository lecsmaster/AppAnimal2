package lecsinc.appanimal;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.Intent;

public class InicioAnimation extends Activity {
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove notification bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.inicio_animation);

        imgLogo = (ImageView) findViewById(R.id.img_logo);

        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(InicioAnimation.this, R.anim.animation);
                imgLogo.startAnimation(hyperspaceJumpAnimation);


                Intent intent = new Intent(InicioAnimation.this, Inicio.class);
                InicioAnimation.this.startActivity(intent);
                InicioAnimation.this.finish();
            }
        });

    }//fin del create

}

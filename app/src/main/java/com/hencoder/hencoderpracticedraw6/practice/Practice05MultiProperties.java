package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice05MultiProperties extends ConstraintLayout {
    Button animateBt;
    ImageView imageView;
    boolean flag;


    public Practice05MultiProperties(Context context) {
        super(context);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setScaleX(0);
        imageView.setScaleY(0);
        imageView.setAlpha(0f);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 在这里处理点击事件，同时对多个属性做动画
                if (!flag) {
                    flag=true;
                    imageView.animate()
                            .alpha(1)
                            .scaleX(1)
                            .scaleY(1)
                            .translationX(500)
                            .rotation(360)
                            .setDuration(500);
                    Log.e("TAG", "onClick: 1111111111111111111111111");
                } else {
                    flag=false;
                    imageView.animate()
                            .alpha(0)
                            .scaleX(0)
                            .scaleY(0)
                            .translationX(0)
                            .rotation(0)
                            .setDuration(500);
                    Log.e("TAG", "onClick: 22222222222222222222222222");

                }

            }
        });
    }
}

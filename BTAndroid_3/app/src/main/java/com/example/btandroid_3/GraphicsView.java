package com.example.btandroid_3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[101];
    int i = 0;

    public GraphicsView(Context context) {
        super(context);
        //frames[0]= BitmapFactory.decodeResource(getResources(),R.drawable._01);
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable._01);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable._02);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable._03);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable._04);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable._05);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable._06);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable._07);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable._08);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable._09);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable._10);
    }

    @Override
    protected void onDraw(Canvas canvas){
        if(i<10){
            canvas.drawBitmap(frames[i],4,4,new Paint());
        }else {
            i=0;
        }
        invalidate();
    }

    @Override
    public  boolean onTouchEvent(MotionEvent event){
        i++;
        return true;
    }
}

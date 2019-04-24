package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class Practice2DrawCircleView extends View {


    private  Paint mPaint;
    private static final float RADIUS=dpToPix(70);
    private static final float PADDING=dpToPix(10);
    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
//        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.FILL);
//        mPaint.setStrokeWidth(dpToPix(4));
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(dpToPix(4));
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //平移坐标系位于中心
        canvas.translate(getWidth()/2,0);
        canvas.drawCircle(-(PADDING+RADIUS),PADDING+RADIUS,RADIUS,mPaint);

//        mPaint.reset();
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle((PADDING+RADIUS),PADDING+RADIUS,RADIUS,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
        canvas.drawCircle(-(PADDING+RADIUS),2*PADDING+3*RADIUS,RADIUS,mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth(dpToPix(16));
        canvas.drawCircle((PADDING+RADIUS),2*PADDING+3*RADIUS,RADIUS,mPaint);

        RectF rectF = new RectF(PADDING,
                                2 * PADDING + 2 * RADIUS,
                                PADDING + 2 * RADIUS,
                                2 * PADDING + 4 * RADIUS);
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF,-90,270,false,mPaint);
    }

    private static float dpToPix(int dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }
}

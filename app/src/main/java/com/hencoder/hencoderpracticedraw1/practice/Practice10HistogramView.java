package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import java.util.ArrayList;

public class Practice10HistogramView extends View {

    private ArrayList<DataBean> mDataBeans;
    private final Paint mPaint;
    private  final static float PADDING =dpToPix(50);
    private               float startX  =0;

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mDataBeans = new ArrayList<>();
        DataBean            dataBean1  = new DataBean("Froyo","0","yel");
        DataBean            dataBean2  = new DataBean("GB","10","blue");
        DataBean            dataBean3  = new DataBean("ics","80","yel");
        DataBean            dataBean4  = new DataBean("jb","70","yel");
        DataBean            dataBean5  = new DataBean("l","20","yel");
        mDataBeans.add(dataBean1);
        mDataBeans.add(dataBean2);
        mDataBeans.add(dataBean3);
        mDataBeans.add(dataBean4);
        mDataBeans.add(dataBean5);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        Rect rectF = new Rect();
        canvas.drawLine(dpToPix(20),dpToPix(20),dpToPix(20),dpToPix(220),mPaint);
        canvas.drawLine(dpToPix(20),dpToPix(220),dpToPix(350),dpToPix(220),mPaint);
        mPaint.setTextSize(56);
        mPaint.setStyle(Paint.Style.FILL);
        for (DataBean bean:mDataBeans){
            mPaint.setColor(Color.WHITE);
            canvas.drawText(bean.getName(),startX+PADDING,dpToPix(250),mPaint);
            startX += PADDING ;
        }
//        mPaint.setColor(Color.WHITE);
//        mPaint.setTextSize(50);
//        canvas.drawText("123", (canvas.getWidth() - mPaint.measureText("123")) / 2, canvas.getHeight() * 0.9f, mPaint);
//
//        canvas.translate(canvas.getWidth() * 0.1f, canvas.getHeight() * 0.7f);//移动原点
//
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawLine(0, 0, 0, -canvas.getHeight() * 0.6f, mPaint);//绘制y轴
//        canvas.drawLine(0, 0, canvas.getWidth() * 0.8f, 0, mPaint);//绘制x轴
//
//
//        startX = 0f;//这句很重要
//        mPaint.setTextSize(36);
//        mPaint.setStyle(Paint.Style.FILL);
//        for (DataBean data : mDataBeans) {
//            mPaint.setColor(Color.WHITE);
//            canvas.drawText(data.getName(), startX + PADDING , 30, mPaint);
//
////            mPaint.setColor(data.getColor());
////            canvas.drawRect(startX + space, -data.getNumber() / maxHeight * canvas.getHeight() * 0.5f, startX + space + width, 0, mPaint);
//            startX += PADDING ;
//        }


    }

    private static float dpToPix(int dp) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, Resources.getSystem().getDisplayMetrics());
    }
}

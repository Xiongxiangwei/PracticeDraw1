package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        canvas.translate(getWidth()/2,0);
        Path path = new Path();
        RectF rectF = new RectF(-100, 20, 100, 120);
//        path.addRect(rectF, Path.Direction.CW);
//        PathDashPathEffect pathEffect = new PathDashPathEffect(path,
//                                                                       0,
//                                                                       0,
//                                                                       PathDashPathEffect.Style.ROTATE);
//
//        paint.setPathEffect(pathEffect);

        canvas.drawRoundRect(rectF,50,50,paint);
    }
}

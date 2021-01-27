package com.neandroid.gradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class LinearGradientCircle extends View {

    private LinearGradient mLinearGradient;
    private Paint mPaint;
    private Paint mPaint2;
    private RadialGradient mRadialGradient;


    // 梯度渐变扫描渲染
    private SweepGradient mSweepGradient = null;

    public LinearGradientCircle(Context context) {
        this(context, null);
    }

    public LinearGradientCircle(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearGradientCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //mLinearGradient = new LinearGradient(0, 0, 300, 0, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null, Shader.TileMode.CLAMP);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //mRadialGradient = new RadialGradient(this.getWidth() / 2, this.getHeight() / 2, 500, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null, Shader.TileMode.CLAMP);
//        mRadialGradient = new RadialGradient(this.getWidth() / 2, this.getHeight() / 2, 800, new int[]{Color.RED, Color.YELLOW}, null, Shader.TileMode.CLAMP);
//        mPaint2 = new Paint();
//        mPaint2.setAntiAlias(true);
//        mPaint2.setShader(mRadialGradient);
//        canvas.drawCircle(this.getWidth() / 2, this.getHeight() / 2, Math.max(getWidth(), getHeight()), mPaint2);

        mLinearGradient = new LinearGradient(200 - 100, 200 + 100, 200 + 100, 200 + 100, new int[]{this.getResources().getColor(R.color.color_gradient_start), this.getResources().getColor(R.color.color_gradient_end)}, null, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setShader(mLinearGradient);
        canvas.drawCircle(200, 200, 100, mPaint);

        mLinearGradient = new LinearGradient(400 - 100, 200 + 100, 400 + 100, 200 + 100, new int[]{this.getResources().getColor(R.color.color_gradient_start), this.getResources().getColor(R.color.color_gradient_end)}, null, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setShader(mLinearGradient);
        canvas.drawCircle(400, 200, 100, mPaint);

        mLinearGradient = new LinearGradient(600 - 100, 200 + 100, 600 + 100, 200 + 100, new int[]{this.getResources().getColor(R.color.color_gradient_start), this.getResources().getColor(R.color.color_gradient_end)}, null, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setShader(mLinearGradient);
        canvas.drawCircle(600, 200, 100, mPaint);


        //绘制圆环
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        mPaint.setAntiAlias(true);
        RectF rectF = new RectF(600, 600, 800, 800);
        //mLinearGradient = new LinearGradient(500, 800, 800, 800, new int[]{Color.RED, Color.GREEN, Color.YELLOW, Color.BLUE}, null, Shader.TileMode.CLAMP);
        mLinearGradient = new LinearGradient(600, 600, 800, 800, new int[]{this.getResources().getColor(R.color.color_gradient_start), this.getResources().getColor(R.color.color_gradient_end)}, null, Shader.TileMode.CLAMP);
        mPaint.setShader(mLinearGradient);
        canvas.drawArc(rectF, 0, 360, false, mPaint);//先画圆圈

        mLinearGradient = new LinearGradient(600, 800, 800, 800, new int[]{this.getResources().getColor(R.color.color_gradient_end), this.getResources().getColor(R.color.color_gradient_start)}, null, Shader.TileMode.CLAMP);
        mPaint = new Paint();
        mPaint.setShader(mLinearGradient);
        canvas.drawCircle(700, 700, 80, mPaint);


        mSweepGradient = new SweepGradient(this.getWidth() / 2, this.getHeight() / 2, new int[]{Color.TRANSPARENT, Color.RED, Color.TRANSPARENT, Color.YELLOW, Color.BLUE}, null);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setShader(mSweepGradient);
        canvas.drawCircle(this.getWidth() / 2, this.getHeight() / 2, 200, mPaint);
    }
}

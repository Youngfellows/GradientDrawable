package com.neandroid.gradient;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.graphics.Shader;
import android.view.View;

public class LinearGradientView extends View {

    private LinearGradient linearGradient1 = null;
    private Paint paint1 = null;

    private LinearGradient linearGradient2 = null;
    private Paint paint2 = null;

    private LinearGradient linearGradient3 = null;
    private Paint paint3 = null;

    private LinearGradient linearGradient4 = null;
    private Paint paint4 = null;

    private LinearGradient linearGradient5 = null;
    private Paint paint5 = null;

    public LinearGradientView(Context context) {
        super(context);

        linearGradient1 = new LinearGradient(0, 0, 300, 0, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null,
                Shader.TileMode.REPEAT);
        paint1 = new Paint();

        linearGradient2 = new LinearGradient(0, 0, 300, 0, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null,
                Shader.TileMode.MIRROR);
        paint2 = new Paint();

        linearGradient3 = new LinearGradient(0, 0, 300, 0, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null,
                Shader.TileMode.CLAMP);
        paint3 = new Paint();

        linearGradient4 = new LinearGradient(0, 0, 300, 300, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null,
                Shader.TileMode.REPEAT);
        paint4 = new Paint();

        linearGradient5 = new LinearGradient(0, 300, 300, 0, new int[]{Color.RED, Color.YELLOW, Color.BLUE}, null,
                Shader.TileMode.REPEAT);
        paint5 = new Paint();
    }

    public LinearGradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int left = 10, top = 20, right = 0, bottom = 0;
        // 渲染到View的最右边
        right = this.getWidth() - left;

        // 渲染的每一个矩形高度，也可以简单理解为坐标系的结束值y
        bottom = this.getHeight() / 5;

        // 渲染器1
        paint1.setShader(linearGradient1);
        Rect rect1 = new Rect(left, top, right, bottom);
        canvas.drawRect(rect1, paint1);

        top = top + bottom;
        // 渲染器2
        paint2.setShader(linearGradient2);
        Rect rect2 = new Rect(left, top, right, bottom * 2);
        canvas.drawRect(rect2, paint2);

        top = top + bottom;
        // 渲染器3
        paint3.setShader(linearGradient3);
        Rect rect3 = new Rect(left, top, right, bottom * 3);
        canvas.drawRect(rect3, paint3);

        top = top + bottom;
        // 渲染器4
        paint4.setShader(linearGradient4);
        Rect rect4 = new Rect(left, top, right, bottom * 4);
        canvas.drawRect(rect4, paint4);

        top = top + bottom;
        // 渲染器5
        paint5.setShader(linearGradient5);
        Rect rect5 = new Rect(left, top, right, bottom * 5);
        canvas.drawRect(rect5, paint5);
    }
}
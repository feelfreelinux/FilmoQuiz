package com.quiz.mule.filmoquiz;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class ButtonSquare extends Button {
    private final double mScale = 1.0;
    public ButtonSquare(Context context) {
        super(context);
    }
    //doge
    public ButtonSquare(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ButtonSquare(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        if (width > (int)((mScale * height) + 0.5)) {
            width = (int)((mScale * height) + 0.5);
        } else {
            height = (int)((width / mScale) + 0.5);
        }

        super.onMeasure(
                MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
        );
    }
}


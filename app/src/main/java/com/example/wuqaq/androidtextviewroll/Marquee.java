package com.example.wuqaq.androidtextviewroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by wuqaq on 17-3-22.
 */

public class Marquee extends AppCompatTextView {
    public Marquee(Context context) {
        super(context);
    }

    public Marquee(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Marquee(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public boolean isFocused() {
        return true;
    }
}

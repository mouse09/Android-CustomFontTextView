package uk.co.lesleh.android.fonts;

import android.content.Context;
import android.inputmethodservice.ExtractEditText;
import android.util.AttributeSet;

public class CustomFontExtractEditText extends ExtractEditText {
    public CustomFontExtractEditText(Context context) {
        super(context);
        init(context, null, 0);
    }

    public CustomFontExtractEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CustomFontExtractEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
        TypefaceManager.initTypeface(this, context, attrs, defStyle);
    }
}

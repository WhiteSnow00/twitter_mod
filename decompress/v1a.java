import android.graphics.Rect;
import androidx.emoji2.text.c;
import android.view.View;
import android.text.method.TransformationMethod;

// 
// Decompiled by Procyon v0.6.0
// 

public final class v1a implements TransformationMethod
{
    public final TransformationMethod C0;
    
    public v1a(final TransformationMethod c0) {
        this.C0 = c0;
    }
    
    public final CharSequence getTransformation(CharSequence i, final View view) {
        if (view.isInEditMode()) {
            return i;
        }
        final TransformationMethod c0 = this.C0;
        CharSequence transformation = i;
        if (c0 != null) {
            transformation = c0.getTransformation(i, view);
        }
        if ((i = transformation) != null) {
            if (c.a().b() != 1) {
                i = transformation;
            }
            else {
                i = c.a().i(transformation);
            }
        }
        return i;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
        final TransformationMethod c0 = this.C0;
        if (c0 != null) {
            c0.onFocusChanged(view, charSequence, b, n, rect);
        }
    }
}

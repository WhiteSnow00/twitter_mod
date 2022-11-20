// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.app.AppCompatDelegateImpl;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import java.util.Objects;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
    public TypedValue D0;
    public TypedValue E0;
    public TypedValue F0;
    public TypedValue G0;
    public TypedValue H0;
    public TypedValue I0;
    public final Rect J0;
    public a K0;
    
    public ContentFrameLayout(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.J0 = new Rect();
    }
    
    public TypedValue getFixedHeightMajor() {
        if (this.H0 == null) {
            this.H0 = new TypedValue();
        }
        return this.H0;
    }
    
    public TypedValue getFixedHeightMinor() {
        if (this.I0 == null) {
            this.I0 = new TypedValue();
        }
        return this.I0;
    }
    
    public TypedValue getFixedWidthMajor() {
        if (this.F0 == null) {
            this.F0 = new TypedValue();
        }
        return this.F0;
    }
    
    public TypedValue getFixedWidthMinor() {
        if (this.G0 == null) {
            this.G0 = new TypedValue();
        }
        return this.G0;
    }
    
    public TypedValue getMinWidthMajor() {
        if (this.D0 == null) {
            this.D0 = new TypedValue();
        }
        return this.D0;
    }
    
    public TypedValue getMinWidthMinor() {
        if (this.E0 == null) {
            this.E0 = new TypedValue();
        }
        return this.E0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final a k0 = this.K0;
        if (k0 != null) {
            Objects.requireNonNull(k0);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Object o = this.K0;
        if (o == null) {
            return;
        }
        o = ((yj0)o).a;
        final dc8 o2 = ((AppCompatDelegateImpl)o).O0;
        if (o2 != null) {
            o2.l();
        }
        Label_0080: {
            if (((AppCompatDelegateImpl)o).T0 == null) {
                break Label_0080;
            }
            ((AppCompatDelegateImpl)o).I0.getDecorView().removeCallbacks((Runnable)((AppCompatDelegateImpl)o).U0);
            while (true) {
                if (!((AppCompatDelegateImpl)o).T0.isShowing()) {
                    break Label_0075;
                }
                try {
                    ((AppCompatDelegateImpl)o).T0.dismiss();
                    ((AppCompatDelegateImpl)o).T0 = null;
                    ((AppCompatDelegateImpl)o).I();
                    o = ((AppCompatDelegateImpl)o).N(0).h;
                    if (o != null) {
                        ((e)o).d(true);
                    }
                }
                catch (final IllegalArgumentException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void onMeasure(int n, int n2) {
        final DisplayMetrics displayMetrics = ((View)this).getContext().getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final int n3 = 1;
        final boolean b = widthPixels < heightPixels;
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int measureSpec = 0;
        Label_0207: {
            if (mode == Integer.MIN_VALUE) {
                TypedValue typedValue;
                if (b) {
                    typedValue = this.G0;
                }
                else {
                    typedValue = this.F0;
                }
                if (typedValue != null) {
                    final int type = typedValue.type;
                    if (type != 0) {
                        int n5 = 0;
                        Label_0154: {
                            float n4;
                            if (type == 5) {
                                n4 = typedValue.getDimension(displayMetrics);
                            }
                            else {
                                if (type != 6) {
                                    n5 = 0;
                                    break Label_0154;
                                }
                                final int widthPixels2 = displayMetrics.widthPixels;
                                n4 = typedValue.getFraction((float)widthPixels2, (float)widthPixels2);
                            }
                            n5 = (int)n4;
                        }
                        if (n5 > 0) {
                            final Rect j0 = this.J0;
                            measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(n5 - (j0.left + j0.right), View$MeasureSpec.getSize(n)), 1073741824);
                            n = 1;
                            break Label_0207;
                        }
                    }
                }
            }
            final int n6 = 0;
            measureSpec = n;
            n = n6;
        }
        int measureSpec2 = n2;
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2;
            if (b) {
                typedValue2 = this.H0;
            }
            else {
                typedValue2 = this.I0;
            }
            measureSpec2 = n2;
            if (typedValue2 != null) {
                final int type2 = typedValue2.type;
                measureSpec2 = n2;
                if (type2 != 0) {
                    int n8 = 0;
                    Label_0313: {
                        float n7;
                        if (type2 == 5) {
                            n7 = typedValue2.getDimension(displayMetrics);
                        }
                        else {
                            if (type2 != 6) {
                                n8 = 0;
                                break Label_0313;
                            }
                            final int heightPixels2 = displayMetrics.heightPixels;
                            n7 = typedValue2.getFraction((float)heightPixels2, (float)heightPixels2);
                        }
                        n8 = (int)n7;
                    }
                    measureSpec2 = n2;
                    if (n8 > 0) {
                        final Rect j2 = this.J0;
                        measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.min(n8 - (j2.top + j2.bottom), View$MeasureSpec.getSize(n2)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(measureSpec, measureSpec2);
        final int measuredWidth = ((View)this).getMeasuredWidth();
        final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        Label_0520: {
            if (n == 0 && mode == Integer.MIN_VALUE) {
                TypedValue typedValue3;
                if (b) {
                    typedValue3 = this.E0;
                }
                else {
                    typedValue3 = this.D0;
                }
                if (typedValue3 != null) {
                    n = typedValue3.type;
                    if (n != 0) {
                        Label_0470: {
                            float n9;
                            if (n == 5) {
                                n9 = typedValue3.getDimension(displayMetrics);
                            }
                            else {
                                if (n != 6) {
                                    n = 0;
                                    break Label_0470;
                                }
                                n = displayMetrics.widthPixels;
                                n9 = typedValue3.getFraction((float)n, (float)n);
                            }
                            n = (int)n9;
                        }
                        n2 = n;
                        if (n > 0) {
                            final Rect j3 = this.J0;
                            n2 = n - (j3.left + j3.right);
                        }
                        if (measuredWidth < n2) {
                            n = View$MeasureSpec.makeMeasureSpec(n2, 1073741824);
                            n2 = n3;
                            break Label_0520;
                        }
                    }
                }
            }
            n2 = 0;
            n = measureSpec3;
        }
        if (n2 != 0) {
            super.onMeasure(n, measureSpec2);
        }
    }
    
    public void setAttachListener(final a k0) {
        this.K0 = k0;
    }
    
    public interface a
    {
    }
}

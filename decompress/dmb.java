import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.annotation.TargetApi;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.LinearLayoutCompat;

// 
// Decompiled by Procyon v0.6.0
// 

public class dmb extends LinearLayoutCompat
{
    public Drawable U0;
    public final Rect V0;
    public final Rect W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    
    public dmb(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public dmb(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.V0 = new Rect();
        this.W0 = new Rect();
        this.X0 = 119;
        this.Y0 = true;
        this.Z0 = false;
        final TypedArray d = uls.d(context, set, lai.Y0, 0, 0, new int[0]);
        this.X0 = d.getInt(1, this.X0);
        final Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.Y0 = d.getBoolean(2, true);
        d.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final Drawable u0 = this.U0;
        if (u0 != null) {
            if (this.Z0) {
                this.Z0 = false;
                final Rect v0 = this.V0;
                final Rect w0 = this.W0;
                final int n = ((View)this).getRight() - ((View)this).getLeft();
                final int n2 = ((View)this).getBottom() - ((View)this).getTop();
                if (this.Y0) {
                    v0.set(0, 0, n, n2);
                }
                else {
                    v0.set(((View)this).getPaddingLeft(), ((View)this).getPaddingTop(), n - ((View)this).getPaddingRight(), n2 - ((View)this).getPaddingBottom());
                }
                Gravity.apply(this.X0, u0.getIntrinsicWidth(), u0.getIntrinsicHeight(), v0, w0);
                u0.setBounds(w0);
            }
            u0.draw(canvas);
        }
    }
    
    @TargetApi(21)
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable u0 = this.U0;
        if (u0 != null) {
            u0.setHotspot(n, n2);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable u0 = this.U0;
        if (u0 != null && u0.isStateful()) {
            this.U0.setState(((View)this).getDrawableState());
        }
    }
    
    public Drawable getForeground() {
        return this.U0;
    }
    
    public int getForegroundGravity() {
        return this.X0;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable u0 = this.U0;
        if (u0 != null) {
            u0.jumpToCurrentState();
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.Z0 |= b;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.Z0 = true;
    }
    
    public void setForeground(final Drawable u0) {
        final Drawable u2 = this.U0;
        if (u2 != u0) {
            if (u2 != null) {
                u2.setCallback((Drawable$Callback)null);
                ((View)this).unscheduleDrawable(this.U0);
            }
            if ((this.U0 = u0) != null) {
                ((View)this).setWillNotDraw(false);
                u0.setCallback((Drawable$Callback)this);
                if (u0.isStateful()) {
                    u0.setState(((View)this).getDrawableState());
                }
                if (this.X0 == 119) {
                    u0.getPadding(new Rect());
                }
            }
            else {
                ((View)this).setWillNotDraw(true);
            }
            ((View)this).requestLayout();
            ((View)this).invalidate();
        }
    }
    
    public void setForegroundGravity(int x0) {
        if (this.X0 != x0) {
            int n = x0;
            if ((0x800007 & x0) == 0x0) {
                n = (x0 | 0x800003);
            }
            x0 = n;
            if ((n & 0x70) == 0x0) {
                x0 = (n | 0x30);
            }
            this.X0 = x0;
            if (x0 == 119 && this.U0 != null) {
                this.U0.getPadding(new Rect());
            }
            ((View)this).requestLayout();
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.U0;
    }
}

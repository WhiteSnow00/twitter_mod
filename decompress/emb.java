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

public class emb extends LinearLayoutCompat
{
    public Drawable R0;
    public final Rect S0;
    public final Rect T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    
    public emb(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public emb(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.S0 = new Rect();
        this.T0 = new Rect();
        this.U0 = 119;
        this.V0 = true;
        this.W0 = false;
        final TypedArray d = hks.d(context, set, rp2.d1, 0, 0, new int[0]);
        this.U0 = d.getInt(1, this.U0);
        final Drawable drawable = d.getDrawable(0);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.V0 = d.getBoolean(2, true);
        d.recycle();
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        final Drawable r0 = this.R0;
        if (r0 != null) {
            if (this.W0) {
                this.W0 = false;
                final Rect s0 = this.S0;
                final Rect t0 = this.T0;
                final int n = ((View)this).getRight() - ((View)this).getLeft();
                final int n2 = ((View)this).getBottom() - ((View)this).getTop();
                if (this.V0) {
                    s0.set(0, 0, n, n2);
                }
                else {
                    s0.set(((View)this).getPaddingLeft(), ((View)this).getPaddingTop(), n - ((View)this).getPaddingRight(), n2 - ((View)this).getPaddingBottom());
                }
                Gravity.apply(this.U0, r0.getIntrinsicWidth(), r0.getIntrinsicHeight(), s0, t0);
                r0.setBounds(t0);
            }
            r0.draw(canvas);
        }
    }
    
    @TargetApi(21)
    public final void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable r0 = this.R0;
        if (r0 != null) {
            r0.setHotspot(n, n2);
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable r0 = this.R0;
        if (r0 != null && r0.isStateful()) {
            this.R0.setState(((View)this).getDrawableState());
        }
    }
    
    public Drawable getForeground() {
        return this.R0;
    }
    
    public int getForegroundGravity() {
        return this.U0;
    }
    
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable r0 = this.R0;
        if (r0 != null) {
            r0.jumpToCurrentState();
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.W0 |= b;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.W0 = true;
    }
    
    public void setForeground(final Drawable r0) {
        final Drawable r2 = this.R0;
        if (r2 != r0) {
            if (r2 != null) {
                r2.setCallback((Drawable$Callback)null);
                ((View)this).unscheduleDrawable(this.R0);
            }
            if ((this.R0 = r0) != null) {
                ((View)this).setWillNotDraw(false);
                r0.setCallback((Drawable$Callback)this);
                if (r0.isStateful()) {
                    r0.setState(((View)this).getDrawableState());
                }
                if (this.U0 == 119) {
                    r0.getPadding(new Rect());
                }
            }
            else {
                ((View)this).setWillNotDraw(true);
            }
            ((View)this).requestLayout();
            ((View)this).invalidate();
        }
    }
    
    public void setForegroundGravity(int u0) {
        if (this.U0 != u0) {
            int n = u0;
            if ((0x800007 & u0) == 0x0) {
                n = (u0 | 0x800003);
            }
            u0 = n;
            if ((n & 0x70) == 0x0) {
                u0 = (n | 0x30);
            }
            this.U0 = u0;
            if (u0 == 119 && this.R0 != null) {
                this.R0.getPadding(new Rect());
            }
            ((View)this).requestLayout();
        }
    }
    
    public final boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.R0;
    }
}

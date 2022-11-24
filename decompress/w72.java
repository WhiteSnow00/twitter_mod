import android.graphics.ColorFilter;
import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w72 extends Drawable
{
    public final csp a;
    public final Paint b;
    public final Path c;
    public final Rect d;
    public final RectF e;
    public final RectF f;
    public final a g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public bsp o;
    public ColorStateList p;
    
    public w72(final bsp o) {
        this.a = csp$a.a;
        this.c = new Path();
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new a();
        this.n = true;
        this.o = o;
        (this.b = new Paint(1)).setStyle(Paint$Style.STROKE);
    }
    
    public final RectF a() {
        this.f.set(this.getBounds());
        return this.f;
    }
    
    public final void b(final ColorStateList p) {
        if (p != null) {
            this.m = p.getColorForState(this.getState(), this.m);
        }
        this.p = p;
        this.n = true;
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        if (this.n) {
            final Paint b = this.b;
            final Rect d = this.d;
            this.copyBounds(d);
            final float n = this.h / d.height();
            b.setShader((Shader)new LinearGradient(0.0f, (float)d.top, 0.0f, (float)d.bottom, new int[] { ks4.g(this.i, this.m), ks4.g(this.j, this.m), ks4.g(ks4.k(this.j, 0), this.m), ks4.g(ks4.k(this.l, 0), this.m), ks4.g(this.l, this.m), ks4.g(this.k, this.m) }, new float[] { 0.0f, n, 0.5f, 0.5f, 1.0f - n, 1.0f }, Shader$TileMode.CLAMP));
            this.n = false;
        }
        final float n2 = this.b.getStrokeWidth() / 2.0f;
        this.copyBounds(this.d);
        this.e.set(this.d);
        final float min = Math.min(this.o.e.a(this.a()), this.e.width() / 2.0f);
        if (this.o.e(this.a())) {
            this.e.inset(n2, n2);
            canvas.drawRoundRect(this.e, min, min, this.b);
        }
    }
    
    public final Drawable$ConstantState getConstantState() {
        return this.g;
    }
    
    public final int getOpacity() {
        int n;
        if (this.h > 0.0f) {
            n = -3;
        }
        else {
            n = -2;
        }
        return n;
    }
    
    @TargetApi(21)
    public final void getOutline(final Outline outline) {
        if (this.o.e(this.a())) {
            outline.setRoundRect(this.getBounds(), this.o.e.a(this.a()));
            return;
        }
        this.copyBounds(this.d);
        this.e.set(this.d);
        this.a.b(this.o, 1.0f, this.e, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }
    
    public final boolean getPadding(final Rect rect) {
        if (this.o.e(this.a())) {
            final int round = Math.round(this.h);
            rect.set(round, round, round, round);
        }
        return true;
    }
    
    public final boolean isStateful() {
        final ColorStateList p = this.p;
        return (p != null && p.isStateful()) || super.isStateful();
    }
    
    public final void onBoundsChange(final Rect rect) {
        this.n = true;
    }
    
    public final boolean onStateChange(final int[] array) {
        final ColorStateList p = this.p;
        if (p != null) {
            final int colorForState = p.getColorForState(array, this.m);
            if (colorForState != this.m) {
                this.n = true;
                this.m = colorForState;
            }
        }
        if (this.n) {
            this.invalidateSelf();
        }
        return this.n;
    }
    
    public final void setAlpha(final int alpha) {
        this.b.setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public final class a extends Drawable$ConstantState
    {
        public final w72 a;
        
        public a(final w72 a) {
            this.a = a;
        }
        
        public final int getChangingConfigurations() {
            return 0;
        }
        
        public final Drawable newDrawable() {
            return this.a;
        }
    }
}

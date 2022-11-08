import android.graphics.drawable.Drawable;
import java.util.Objects;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$Align;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.graphics.Paint$FontMetrics;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lit extends qng implements ues$b
{
    public CharSequence b1;
    public final Context c1;
    public final Paint$FontMetrics d1;
    public final ues e1;
    public final lit$a f1;
    public final Rect g1;
    public int h1;
    public int i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public float n1;
    public float o1;
    public float p1;
    public float q1;
    
    public lit(final Context c1, final int n) {
        super(c1, (AttributeSet)null, 0, n);
        this.d1 = new Paint$FontMetrics();
        final ues e1 = new ues((ues$b)this);
        this.e1 = e1;
        this.f1 = new lit$a(this);
        this.g1 = new Rect();
        this.n1 = 1.0f;
        this.o1 = 1.0f;
        this.p1 = 0.5f;
        this.q1 = 1.0f;
        this.c1 = c1;
        e1.a.density = c1.getResources().getDisplayMetrics().density;
        ((Paint)e1.a).setTextAlign(Paint$Align.CENTER);
    }
    
    public final float C() {
        int n;
        if (this.g1.right - ((Drawable)this).getBounds().right - this.m1 - this.k1 < 0) {
            n = this.g1.right - ((Drawable)this).getBounds().right - this.m1 - this.k1;
        }
        else {
            if (this.g1.left - ((Drawable)this).getBounds().left - this.m1 + this.k1 <= 0) {
                return 0.0f;
            }
            n = this.g1.left - ((Drawable)this).getBounds().left - this.m1 + this.k1;
        }
        return (float)n;
    }
    
    public final kq9 D() {
        final float n = -this.C();
        final float n2 = (float)(((Drawable)this).getBounds().width() - Math.sqrt(2.0) * this.l1) / 2.0f;
        return (kq9)new sfj((kq9)new nlg((float)this.l1), Math.min(Math.max(n, -n2), n2));
    }
    
    public final void a() {
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        canvas.save();
        final float c = this.C();
        final float n = (float)(-(Math.sqrt(2.0) * this.l1 - this.l1));
        canvas.scale(this.n1, this.o1, ((Drawable)this).getBounds().width() * 0.5f + ((Drawable)this).getBounds().left, ((Drawable)this).getBounds().height() * this.p1 + ((Drawable)this).getBounds().top);
        canvas.translate(c, n);
        super.draw(canvas);
        if (this.b1 != null) {
            final Rect bounds = ((Drawable)this).getBounds();
            final float n2 = (float)bounds.centerY();
            ((Paint)this.e1.a).getFontMetrics(this.d1);
            final Paint$FontMetrics d1 = this.d1;
            final int n3 = (int)(n2 - (d1.descent + d1.ascent) / 2.0f);
            final ues e1 = this.e1;
            if (e1.f != null) {
                e1.a.drawableState = ((Drawable)this).getState();
                final ues e2 = this.e1;
                e2.f.e(this.c1, e2.a, (n5r)e2.b);
                ((Paint)this.e1.a).setAlpha((int)(this.q1 * 255.0f));
            }
            final CharSequence b1 = this.b1;
            canvas.drawText(b1, 0, b1.length(), (float)bounds.centerX(), (float)n3, (Paint)this.e1.a);
        }
        canvas.restore();
    }
    
    public final int getIntrinsicHeight() {
        return (int)Math.max(((Paint)this.e1.a).getTextSize(), (float)this.j1);
    }
    
    public final int getIntrinsicWidth() {
        final float n = (float)(this.h1 * 2);
        final CharSequence b1 = this.b1;
        float a;
        if (b1 == null) {
            a = 0.0f;
        }
        else {
            a = this.e1.a(b1.toString());
        }
        return (int)Math.max(n + a, (float)this.i1);
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        final pqp a = super.C0.a;
        Objects.requireNonNull(a);
        final pqp.a a2 = new pqp.a(a);
        a2.k = this.D();
        this.setShapeAppearanceModel(a2.a());
    }
    
    public final boolean onStateChange(final int[] array) {
        return super.onStateChange(array);
    }
}

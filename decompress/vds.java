import android.graphics.Paint;
import android.text.TextPaint;
import android.util.TypedValue;
import android.content.res.Resources$NotFoundException;
import android.util.Log;
import android.content.res.TypedArray;
import android.content.Context;
import android.graphics.Typeface;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vds
{
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m;
    public Typeface n;
    
    public vds(final Context context, final int n) {
        this.m = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(n, rp2.A1);
        this.k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = ong.b(context, obtainStyledAttributes, 3);
        ong.b(context, obtainStyledAttributes, 4);
        ong.b(context, obtainStyledAttributes, 5);
        this.c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int n2 = 12;
        if (!obtainStyledAttributes.hasValue(12)) {
            n2 = 10;
        }
        this.l = obtainStyledAttributes.getResourceId(n2, 0);
        this.b = obtainStyledAttributes.getString(n2);
        obtainStyledAttributes.getBoolean(14, false);
        this.a = ong.b(context, obtainStyledAttributes, 6);
        this.e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(n, rp2.o1);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }
    
    public final void a() {
        if (this.n == null) {
            final String b = this.b;
            if (b != null) {
                this.n = Typeface.create(b, this.c);
            }
        }
        if (this.n == null) {
            final int d = this.d;
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        this.n = Typeface.DEFAULT;
                    }
                    else {
                        this.n = Typeface.MONOSPACE;
                    }
                }
                else {
                    this.n = Typeface.SERIF;
                }
            }
            else {
                this.n = Typeface.SANS_SERIF;
            }
            this.n = Typeface.create(this.n, this.c);
        }
    }
    
    public final Typeface b(final Context context) {
        if (this.m) {
            return this.n;
        }
        if (context.isRestricted()) {
            goto Label_0079;
        }
        try {
            final Typeface b = xqm.b(context, this.l);
            this.n = b;
            if (b != null) {
                this.n = Typeface.create(b, this.c);
                goto Label_0079;
            }
            goto Label_0079;
        }
        catch (final Exception ex) {
            final StringBuilder g = w48.g("Error loading font ");
            g.append(this.b);
            Log.d("TextAppearance", g.toString(), (Throwable)ex);
        }
        catch (final UnsupportedOperationException | Resources$NotFoundException ex2) {
            goto Label_0079;
        }
    }
    
    public final void c(final Context context, final n5r n5r) {
        if (this.d(context)) {
            this.b(context);
        }
        else {
            this.a();
        }
        final int l = this.l;
        if (l == 0) {
            this.m = true;
        }
        if (this.m) {
            n5r.B(this.n, true);
            return;
        }
        try {
            final vds$a vds$a = new vds$a(this, n5r);
            final ThreadLocal<TypedValue> a = xqm.a;
            if (context.isRestricted()) {
                ((xqm.e)vds$a).a(-4);
            }
            else {
                xqm.c(context, l, new TypedValue(), 0, (xqm.e)vds$a, false, false);
            }
        }
        catch (final Exception ex) {
            final StringBuilder g = w48.g("Error loading font ");
            g.append(this.b);
            Log.d("TextAppearance", g.toString(), (Throwable)ex);
            this.m = true;
            n5r.A(-3);
        }
        catch (final Resources$NotFoundException ex2) {
            this.m = true;
            n5r.A(1);
        }
    }
    
    public final boolean d(final Context context) {
        final int l = this.l;
        if (l != 0) {
            final ThreadLocal<TypedValue> a = xqm.a;
            if (!context.isRestricted()) {
                final Typeface c = xqm.c(context, l, new TypedValue(), 0, null, false, true);
                return c != null;
            }
        }
        final Typeface c = null;
        return c != null;
    }
    
    public final void e(final Context context, final TextPaint textPaint, final n5r n5r) {
        this.f(context, textPaint, n5r);
        final ColorStateList j = this.j;
        int colorForState;
        if (j != null) {
            colorForState = j.getColorForState(textPaint.drawableState, j.getDefaultColor());
        }
        else {
            colorForState = -16777216;
        }
        ((Paint)textPaint).setColor(colorForState);
        final float g = this.g;
        final float e = this.e;
        final float f = this.f;
        final ColorStateList a = this.a;
        int colorForState2;
        if (a != null) {
            colorForState2 = a.getColorForState(textPaint.drawableState, a.getDefaultColor());
        }
        else {
            colorForState2 = 0;
        }
        ((Paint)textPaint).setShadowLayer(g, e, f, colorForState2);
    }
    
    public final void f(final Context context, final TextPaint textPaint, final n5r n5r) {
        if (this.d(context)) {
            this.g(context, textPaint, this.b(context));
        }
        else {
            this.a();
            this.g(context, textPaint, this.n);
            this.c(context, (n5r)new wds(this, context, textPaint, n5r));
        }
    }
    
    public final void g(final Context context, final TextPaint textPaint, Typeface typeface) {
        final Typeface a = amv.a(context.getResources().getConfiguration(), typeface);
        if (a != null) {
            typeface = a;
        }
        ((Paint)textPaint).setTypeface(typeface);
        final int n = this.c & ~typeface.getStyle();
        ((Paint)textPaint).setFakeBoldText((n & 0x1) != 0x0);
        float textSkewX;
        if ((n & 0x2) != 0x0) {
            textSkewX = -0.25f;
        }
        else {
            textSkewX = 0.0f;
        }
        ((Paint)textPaint).setTextSkewX(textSkewX);
        ((Paint)textPaint).setTextSize(this.k);
        if (this.h) {
            ((Paint)textPaint).setLetterSpacing(this.i);
        }
    }
}

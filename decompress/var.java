import java.util.Objects;
import android.text.TextDirectionHeuristics;
import android.text.StaticLayout$Builder;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import android.text.TextDirectionHeuristic;
import android.text.StaticLayout;
import java.lang.reflect.Constructor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class var
{
    public static final int m;
    public static boolean n;
    public static Constructor<StaticLayout> o;
    public static TextDirectionHeuristic p;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public Layout$Alignment e;
    public int f;
    public float g;
    public float h;
    public int i;
    public boolean j;
    public boolean k;
    public TextUtils$TruncateAt l;
    
    static {
        m = ((Build$VERSION.SDK_INT >= 23) ? 1 : 0);
    }
    
    public var(final CharSequence a, final TextPaint b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.length();
        this.e = Layout$Alignment.ALIGN_NORMAL;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = var.m;
        this.j = true;
        this.l = null;
    }
    
    public final StaticLayout a() throws a {
        if (this.a == null) {
            this.a = "";
        }
        final int max = Math.max(0, this.c);
        CharSequence charSequence2;
        final CharSequence charSequence = charSequence2 = this.a;
        if (this.f == 1) {
            charSequence2 = TextUtils.ellipsize(charSequence, this.b, (float)max, this.l);
        }
        final int min = Math.min(charSequence2.length(), this.d);
        this.d = min;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            if (this.k && this.f == 1) {
                this.e = Layout$Alignment.ALIGN_OPPOSITE;
            }
            final StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence2, 0, min, this.b, max);
            obtain.setAlignment(this.e);
            obtain.setIncludePad(this.j);
            TextDirectionHeuristic textDirection;
            if (this.k) {
                textDirection = TextDirectionHeuristics.RTL;
            }
            else {
                textDirection = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirection);
            final TextUtils$TruncateAt l = this.l;
            if (l != null) {
                obtain.setEllipsize(l);
            }
            obtain.setMaxLines(this.f);
            final float g = this.g;
            if (g != 0.0f || this.h != 1.0f) {
                obtain.setLineSpacing(g, this.h);
            }
            if (this.f > 1) {
                obtain.setHyphenationFrequency(this.i);
            }
            return obtain.build();
        }
        Label_0419: {
            if (var.n) {
                break Label_0419;
            }
            try {
                TextDirectionHeuristic p;
                if (this.k && sdk_INT >= 23) {
                    p = TextDirectionHeuristics.RTL;
                }
                else {
                    p = TextDirectionHeuristics.LTR;
                }
                var.p = p;
                final Class<Integer> type = Integer.TYPE;
                final Class<Float> type2 = Float.TYPE;
                (var.o = StaticLayout.class.getDeclaredConstructor(CharSequence.class, type, type, TextPaint.class, type, Layout$Alignment.class, TextDirectionHeuristic.class, type2, type2, Boolean.TYPE, TextUtils$TruncateAt.class, type, type)).setAccessible(true);
                var.n = true;
                try {
                    final Constructor<StaticLayout> o = var.o;
                    Objects.requireNonNull(o);
                    final int d = this.d;
                    final TextPaint b = this.b;
                    final Layout$Alignment e = this.e;
                    final TextDirectionHeuristic p2 = var.p;
                    Objects.requireNonNull(p2);
                    return o.newInstance(charSequence2, 0, d, b, max, e, p2, 1.0f, 0.0f, this.j, null, max, this.f);
                }
                catch (final Exception ex) {
                    throw new a(ex);
                }
            }
            catch (final Exception ex2) {
                throw new a(ex2);
            }
        }
    }
    
    public static final class a extends Exception
    {
        public a(final Throwable t) {
            final StringBuilder f = ehk.f("Error thrown initializing StaticLayout ");
            f.append(t.getMessage());
            super(f.toString(), t);
        }
    }
}

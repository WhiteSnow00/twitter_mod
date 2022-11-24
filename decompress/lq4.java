import android.text.Layout;
import android.content.res.Configuration;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import java.util.Objects;
import android.util.Log;
import android.view.Gravity;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import java.util.WeakHashMap;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.graphics.Rect;
import android.content.res.ColorStateList;
import android.view.View;
import android.animation.TimeInterpolator;
import android.text.TextPaint;
import android.graphics.Bitmap;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lq4
{
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public mg3 E;
    public mg3 F;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final View a;
    public ColorStateList a0;
    public boolean b;
    public float b0;
    public float c;
    public float c0;
    public boolean d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public float f;
    public float f0;
    public int g;
    public float g0;
    public final Rect h;
    public float h0;
    public final Rect i;
    public StaticLayout i0;
    public final RectF j;
    public float j0;
    public int k;
    public float k0;
    public int l;
    public float l0;
    public float m;
    public CharSequence m0;
    public float n;
    public int n0;
    public ColorStateList o;
    public float o0;
    public ColorStateList p;
    public float p0;
    public int q;
    public int q0;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    
    public lq4(final View a) {
        this.k = 16;
        this.l = 16;
        this.m = 15.0f;
        this.n = 15.0f;
        this.J = true;
        this.n0 = 1;
        this.o0 = 0.0f;
        this.p0 = 1.0f;
        this.q0 = var.m;
        this.a = a;
        final TextPaint t = new TextPaint(129);
        this.T = t;
        this.U = new TextPaint((Paint)t);
        this.i = new Rect();
        this.h = new Rect();
        this.j = new RectF();
        final float e = this.e;
        this.f = va.d(1.0f, e, 0.5f, e);
        this.k(a.getContext().getResources().getConfiguration());
    }
    
    public static int a(final int n, final int n2, final float n3) {
        final float n4 = 1.0f - n3;
        return Color.argb(Math.round(Color.alpha(n2) * n3 + Color.alpha(n) * n4), Math.round(Color.red(n2) * n3 + Color.red(n) * n4), Math.round(Color.green(n2) * n3 + Color.green(n) * n4), Math.round(Color.blue(n2) * n3 + Color.blue(n) * n4));
    }
    
    public static float j(final float n, final float n2, final float n3, final TimeInterpolator timeInterpolator) {
        float interpolation = n3;
        if (timeInterpolator != null) {
            interpolation = timeInterpolator.getInterpolation(n3);
        }
        final LinearInterpolator a = hc0.a;
        return va.d(n2, n, interpolation, n);
    }
    
    public final boolean A(final int[] r) {
        this.R = r;
        final ColorStateList p = this.p;
        boolean b = false;
        Label_0044: {
            if (p == null || !p.isStateful()) {
                final ColorStateList o = this.o;
                if (o == null || !o.isStateful()) {
                    b = false;
                    break Label_0044;
                }
            }
            b = true;
        }
        if (b) {
            this.m(false);
            return true;
        }
        return false;
    }
    
    public final void B(final CharSequence g) {
        if (g == null || !TextUtils.equals(this.G, g)) {
            this.G = g;
            this.H = null;
            this.e();
            this.m(false);
        }
    }
    
    public final boolean b(final CharSequence charSequence) {
        final View a = this.a;
        final WeakHashMap a2 = b7x.a;
        final int d = b7x$e.d(a);
        int n = 1;
        if (d != 1) {
            n = 0;
        }
        int b = n;
        if (this.J) {
            dgs$d dgs$d;
            if (n != 0) {
                dgs$d = dgs.d;
            }
            else {
                dgs$d = dgs.c;
            }
            b = (((dgs.c)dgs$d).b(charSequence, charSequence.length()) ? 1 : 0);
        }
        return b != 0;
    }
    
    public final void c(float n) {
        if (this.d) {
            final RectF j = this.j;
            Rect rect;
            if (n < this.f) {
                rect = this.h;
            }
            else {
                rect = this.i;
            }
            j.set(rect);
        }
        else {
            this.j.left = j((float)this.h.left, (float)this.i.left, n, this.V);
            this.j.top = j(this.r, this.s, n, this.V);
            this.j.right = j((float)this.h.right, (float)this.i.right, n, this.V);
            this.j.bottom = j((float)this.h.bottom, (float)this.i.bottom, n, this.V);
        }
        float n2;
        if (this.d) {
            if (n < this.f) {
                this.v = this.t;
                this.w = this.r;
                this.y(0.0f);
                n2 = 0.0f;
            }
            else {
                this.v = this.u;
                this.w = this.s - Math.max(0, this.g);
                this.y(1.0f);
                n2 = 1.0f;
            }
        }
        else {
            this.v = j(this.t, this.u, n, this.V);
            this.w = j(this.r, this.s, n, this.V);
            this.y(n);
            n2 = n;
        }
        final ssa b = hc0.b;
        this.k0 = 1.0f - j(0.0f, 1.0f, 1.0f - n, (TimeInterpolator)b);
        final View a = this.a;
        final WeakHashMap a2 = b7x.a;
        b7x$d.k(a);
        this.l0 = j(1.0f, 0.0f, n, (TimeInterpolator)b);
        b7x$d.k(this.a);
        final ColorStateList p = this.p;
        final ColorStateList o = this.o;
        if (p != o) {
            ((Paint)this.T).setColor(a(this.i(o), this.h(), n2));
        }
        else {
            ((Paint)this.T).setColor(this.h());
        }
        final float f0 = this.f0;
        final float g0 = this.g0;
        if (f0 != g0) {
            ((Paint)this.T).setLetterSpacing(j(g0, f0, n, (TimeInterpolator)b));
        }
        else {
            ((Paint)this.T).setLetterSpacing(f0);
        }
        this.N = j(this.b0, this.X, n, null);
        this.O = j(this.c0, this.Y, n, null);
        this.P = j(this.d0, this.Z, n, null);
        final int a3 = a(this.i(this.e0), this.i(this.a0), n);
        this.Q = a3;
        ((Paint)this.T).setShadowLayer(this.N, this.O, this.P, a3);
        if (this.d) {
            final int alpha = ((Paint)this.T).getAlpha();
            final float f2 = this.f;
            if (n <= f2) {
                n = hc0.a(1.0f, 0.0f, this.e, f2, n);
            }
            else {
                n = hc0.a(0.0f, 1.0f, f2, 1.0f, n);
            }
            ((Paint)this.T).setAlpha((int)(n * alpha));
        }
        b7x$d.k(this.a);
    }
    
    public final void d(float g, final boolean b) {
        if (this.G == null) {
            return;
        }
        final float n = (float)this.i.width();
        final float n2 = (float)this.h.width();
        float m = 0.0f;
        float h0 = 0.0f;
        int n3 = 0;
        Label_0262: {
            if (Math.abs(g - 1.0f) < 1.0E-5f) {
                m = this.n;
                h0 = this.f0;
                this.L = 1.0f;
                final Typeface d = this.D;
                final Typeface x = this.x;
                if (d != x) {
                    this.D = x;
                    n3 = 1;
                    g = n;
                }
                else {
                    n3 = 0;
                    g = n;
                }
            }
            else {
                m = this.m;
                h0 = this.g0;
                final Typeface d2 = this.D;
                final Typeface a = this.A;
                if (d2 != a) {
                    this.D = a;
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                if (Math.abs(g - 0.0f) < 1.0E-5f) {
                    this.L = 1.0f;
                }
                else {
                    this.L = j(this.m, this.n, g, this.W) / this.m;
                }
                g = this.n / this.m;
                if (!b) {
                    if (n2 * g > n) {
                        g = Math.min(n / g, n2);
                        break Label_0262;
                    }
                }
                g = n2;
            }
        }
        int n4 = n3;
        if (g > 0.0f) {
            final boolean b2 = this.M != m;
            final boolean b3 = this.h0 != h0;
            final boolean b4 = b2 || b3 || this.S || n3 != 0;
            this.M = m;
            this.h0 = h0;
            this.S = false;
            n4 = (b4 ? 1 : 0);
        }
        if (this.H == null || n4 != 0) {
            ((Paint)this.T).setTextSize(this.M);
            ((Paint)this.T).setTypeface(this.D);
            ((Paint)this.T).setLetterSpacing(this.h0);
            ((Paint)this.T).setLinearText(this.L != 1.0f);
            final int b5 = this.b(this.G) ? 1 : 0;
            this.I = (b5 != 0);
            final int n5 = this.n0;
            int f;
            if (n5 > 1 && (b5 == 0 || this.d)) {
                f = n5;
            }
            else {
                f = 1;
            }
            StaticLayout a2 = null;
            Label_0515: {
                if (f != 1) {
                    break Label_0515;
                }
                try {
                    Layout$Alignment e = Layout$Alignment.ALIGN_NORMAL;
                    while (true) {
                        int n6 = 0;
                    Block_26_Outer:
                        while (true) {
                            final var var = new var(this.G, this.T, (int)g);
                            var.l = TextUtils$TruncateAt.END;
                            var.k = (b5 != 0);
                            var.e = e;
                            var.j = false;
                            var.f = f;
                            g = this.o0;
                            final float p2 = this.p0;
                            var.g = g;
                            var.h = p2;
                            var.i = this.q0;
                            a2 = var.a();
                            break Label_0515;
                        Block_27:
                            while (true) {
                                e = Layout$Alignment.ALIGN_OPPOSITE;
                                continue Block_26_Outer;
                                n6 = (Gravity.getAbsoluteGravity(this.k, b5) & 0x7);
                                iftrue(Label_0587:)(n6 == 1);
                                break Block_26_Outer;
                                Label_0579: {
                                    e = Layout$Alignment.ALIGN_OPPOSITE;
                                }
                                continue Block_26_Outer;
                                Label_0564:
                                iftrue(Label_0579:)(!this.I);
                                break Block_27;
                                iftrue(Label_0556:)(!this.I);
                                continue;
                            }
                            e = Layout$Alignment.ALIGN_NORMAL;
                            continue Block_26_Outer;
                            Label_0587: {
                                e = Layout$Alignment.ALIGN_CENTER;
                            }
                            continue Block_26_Outer;
                            Label_0556:
                            e = Layout$Alignment.ALIGN_NORMAL;
                            continue Block_26_Outer;
                        }
                        iftrue(Label_0564:)(n6 == 5);
                        continue;
                    }
                }
                catch (final var.a a3) {
                    Log.e("CollapsingTextHelper", a3.getCause().getMessage(), (Throwable)a3);
                    a2 = null;
                }
            }
            Objects.requireNonNull(a2);
            this.i0 = a2;
            this.H = ((Layout)a2).getText();
        }
    }
    
    public final void e() {
        final Bitmap k = this.K;
        if (k != null) {
            k.recycle();
            this.K = null;
        }
    }
    
    public final void f(final Canvas canvas) {
        final int save = canvas.save();
        if (this.H != null && this.b) {
            ((Paint)this.T).setTextSize(this.M);
            final float v = this.v;
            final float w = this.w;
            final float l = this.L;
            if (l != 1.0f && !this.d) {
                canvas.scale(l, l, v, w);
            }
            final int n0 = this.n0;
            final int n2 = 1;
            int n3 = 0;
            Label_0114: {
                if (n0 > 1) {
                    n3 = n2;
                    if (!this.I) {
                        break Label_0114;
                    }
                    if (this.d) {
                        n3 = n2;
                        break Label_0114;
                    }
                }
                n3 = 0;
            }
            if (n3 != 0 && (!this.d || this.c > this.f)) {
                final float v2 = this.v;
                final float n4 = (float)this.i0.getLineStart(0);
                final int alpha = ((Paint)this.T).getAlpha();
                canvas.translate(v2 - n4, w);
                final TextPaint t = this.T;
                final float l2 = this.l0;
                final float n5 = (float)alpha;
                ((Paint)t).setAlpha((int)(l2 * n5));
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 31) {
                    final TextPaint t2 = this.T;
                    ((Paint)t2).setShadowLayer(this.N, this.O, this.P, ak1.f(this.Q, ((Paint)t2).getAlpha()));
                }
                ((Layout)this.i0).draw(canvas);
                ((Paint)this.T).setAlpha((int)(this.k0 * n5));
                if (sdk_INT >= 31) {
                    final TextPaint t3 = this.T;
                    ((Paint)t3).setShadowLayer(this.N, this.O, this.P, ak1.f(this.Q, ((Paint)t3).getAlpha()));
                }
                final int lineBaseline = ((Layout)this.i0).getLineBaseline(0);
                final CharSequence m0 = this.m0;
                final int length = m0.length();
                final float n6 = (float)lineBaseline;
                canvas.drawText(m0, 0, length, 0.0f, n6, (Paint)this.T);
                if (sdk_INT >= 31) {
                    ((Paint)this.T).setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.d) {
                    String s2;
                    final String s = s2 = this.m0.toString().trim();
                    if (s.endsWith("\u2026")) {
                        s2 = s.substring(0, s.length() - 1);
                    }
                    ((Paint)this.T).setAlpha(alpha);
                    canvas.drawText(s2, 0, Math.min(((Layout)this.i0).getLineEnd(0), s2.length()), 0.0f, n6, (Paint)this.T);
                }
            }
            else {
                canvas.translate(v, w);
                ((Layout)this.i0).draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }
    
    public final float g() {
        final TextPaint u = this.U;
        ((Paint)u).setTextSize(this.n);
        ((Paint)u).setTypeface(this.x);
        ((Paint)u).setLetterSpacing(this.f0);
        return -((Paint)this.U).ascent();
    }
    
    public final int h() {
        return this.i(this.p);
    }
    
    public final int i(final ColorStateList list) {
        if (list == null) {
            return 0;
        }
        final int[] r = this.R;
        if (r != null) {
            return list.getColorForState(r, 0);
        }
        return list.getDefaultColor();
    }
    
    public final void k(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 31) {
            final Typeface z = this.z;
            if (z != null) {
                this.y = knv.a(configuration, z);
            }
            final Typeface c = this.C;
            if (c != null) {
                this.B = knv.a(configuration, c);
            }
            Typeface x = this.y;
            if (x == null) {
                x = this.z;
            }
            this.x = x;
            Typeface a = this.B;
            if (a == null) {
                a = this.C;
            }
            this.A = a;
            this.m(true);
        }
    }
    
    public final void l() {
        this.b = (this.i.width() > 0 && this.i.height() > 0 && this.h.width() > 0 && this.h.height() > 0);
    }
    
    public final void m(final boolean b) {
        if ((this.a.getHeight() > 0 && this.a.getWidth() > 0) || b) {
            this.d(1.0f, b);
            final CharSequence h = this.H;
            if (h != null) {
                final StaticLayout i0 = this.i0;
                if (i0 != null) {
                    this.m0 = TextUtils.ellipsize(h, this.T, (float)((Layout)i0).getWidth(), TextUtils$TruncateAt.END);
                }
            }
            final CharSequence m0 = this.m0;
            int lineCount = 0;
            float measureText = 0.0f;
            if (m0 != null) {
                this.j0 = ((Paint)this.T).measureText(m0, 0, m0.length());
            }
            else {
                this.j0 = 0.0f;
            }
            final int absoluteGravity = Gravity.getAbsoluteGravity(this.l, (int)(this.I ? 1 : 0));
            final int n = absoluteGravity & 0x70;
            if (n != 48) {
                if (n != 80) {
                    this.s = this.i.centerY() - (((Paint)this.T).descent() - ((Paint)this.T).ascent()) / 2.0f;
                }
                else {
                    this.s = ((Paint)this.T).ascent() + this.i.bottom;
                }
            }
            else {
                this.s = (float)this.i.top;
            }
            final int n2 = absoluteGravity & 0x800007;
            if (n2 != 1) {
                if (n2 != 5) {
                    this.u = (float)this.i.left;
                }
                else {
                    this.u = this.i.right - this.j0;
                }
            }
            else {
                this.u = this.i.centerX() - this.j0 / 2.0f;
            }
            this.d(0.0f, b);
            final StaticLayout i2 = this.i0;
            float n3;
            if (i2 != null) {
                n3 = (float)((Layout)i2).getHeight();
            }
            else {
                n3 = 0.0f;
            }
            final StaticLayout i3 = this.i0;
            if (i3 != null && this.n0 > 1) {
                measureText = (float)((Layout)i3).getWidth();
            }
            else {
                final CharSequence h2 = this.H;
                if (h2 != null) {
                    measureText = ((Paint)this.T).measureText(h2, 0, h2.length());
                }
            }
            final StaticLayout i4 = this.i0;
            if (i4 != null) {
                lineCount = i4.getLineCount();
            }
            this.q = lineCount;
            final int absoluteGravity2 = Gravity.getAbsoluteGravity(this.k, (int)(this.I ? 1 : 0));
            final int n4 = absoluteGravity2 & 0x70;
            if (n4 != 48) {
                if (n4 != 80) {
                    this.r = this.h.centerY() - n3 / 2.0f;
                }
                else {
                    this.r = ((Paint)this.T).descent() + (this.h.bottom - n3);
                }
            }
            else {
                this.r = (float)this.h.top;
            }
            final int n5 = absoluteGravity2 & 0x800007;
            if (n5 != 1) {
                if (n5 != 5) {
                    this.t = (float)this.h.left;
                }
                else {
                    this.t = this.h.right - measureText;
                }
            }
            else {
                this.t = this.h.centerX() - measureText / 2.0f;
            }
            this.e();
            this.y(this.c);
            this.c(this.c);
        }
    }
    
    public final void n(final int n, final int n2, final int n3, final int n4) {
        final Rect i = this.i;
        if (i.left != n || i.top != n2 || i.right != n3 || i.bottom != n4) {
            i.set(n, n2, n3, n4);
            this.S = true;
            this.l();
        }
    }
    
    public final void o(final int n) {
        final ifs ifs = new ifs(this.a.getContext(), n);
        final ColorStateList j = ifs.j;
        if (j != null) {
            this.p = j;
        }
        final float k = ifs.k;
        if (k != 0.0f) {
            this.n = k;
        }
        final ColorStateList a = ifs.a;
        if (a != null) {
            this.a0 = a;
        }
        this.Y = ifs.e;
        this.Z = ifs.f;
        this.X = ifs.g;
        this.f0 = ifs.i;
        final mg3 f = this.F;
        if (f != null) {
            f.I0 = true;
        }
        final mg3$a mg3$a = (mg3$a)new mg3$a(this) {
            public final lq4 a;
            
            public final void a(final Typeface typeface) {
                final lq4 a = this.a;
                if (a.r(typeface)) {
                    a.m(false);
                }
            }
        };
        ifs.a();
        this.F = new mg3((mg3.mg3$a)mg3$a, ifs.n);
        ifs.c(this.a.getContext(), (g7r)this.F);
        this.m(false);
    }
    
    public final void p(final ColorStateList p) {
        if (this.p != p) {
            this.p = p;
            this.m(false);
        }
    }
    
    public final void q(final int l) {
        if (this.l != l) {
            this.l = l;
            this.m(false);
        }
    }
    
    public final boolean r(Typeface z) {
        final mg3 f = this.F;
        if (f != null) {
            f.I0 = true;
        }
        if (this.z != z) {
            this.z = z;
            final Typeface a = knv.a(this.a.getContext().getResources().getConfiguration(), z);
            this.y = a;
            if ((z = a) == null) {
                z = this.z;
            }
            this.x = z;
            return true;
        }
        return false;
    }
    
    public final void s(final int n, final int n2, final int n3, final int n4) {
        final Rect h = this.h;
        if (h.left != n || h.top != n2 || h.right != n3 || h.bottom != n4) {
            h.set(n, n2, n3, n4);
            this.S = true;
            this.l();
        }
    }
    
    public final void t(final int n) {
        final ifs ifs = new ifs(this.a.getContext(), n);
        final ColorStateList j = ifs.j;
        if (j != null) {
            this.o = j;
        }
        final float k = ifs.k;
        if (k != 0.0f) {
            this.m = k;
        }
        final ColorStateList a = ifs.a;
        if (a != null) {
            this.e0 = a;
        }
        this.c0 = ifs.e;
        this.d0 = ifs.f;
        this.b0 = ifs.g;
        this.g0 = ifs.i;
        final mg3 e = this.E;
        if (e != null) {
            e.I0 = true;
        }
        final mg3$a mg3$a = (mg3$a)new mg3$a(this) {
            public final lq4 a;
            
            public final void a(final Typeface typeface) {
                final lq4 a = this.a;
                if (a.w(typeface)) {
                    a.m(false);
                }
            }
        };
        ifs.a();
        this.E = new mg3((mg3.mg3$a)mg3$a, ifs.n);
        ifs.c(this.a.getContext(), (g7r)this.E);
        this.m(false);
    }
    
    public final void u(final ColorStateList o) {
        if (this.o != o) {
            this.o = o;
            this.m(false);
        }
    }
    
    public final void v(final int k) {
        if (this.k != k) {
            this.k = k;
            this.m(false);
        }
    }
    
    public final boolean w(Typeface c) {
        final mg3 e = this.E;
        if (e != null) {
            e.I0 = true;
        }
        if (this.C != c) {
            this.C = c;
            final Typeface a = knv.a(this.a.getContext().getResources().getConfiguration(), c);
            this.B = a;
            if ((c = a) == null) {
                c = this.C;
            }
            this.A = c;
            return true;
        }
        return false;
    }
    
    public final void x(float k) {
        k = p0b.k(k, 0.0f, 1.0f);
        if (k != this.c) {
            this.c(this.c = k);
        }
    }
    
    public final void y(final float n) {
        this.d(n, false);
        final View a = this.a;
        final WeakHashMap a2 = b7x.a;
        b7x$d.k(a);
    }
    
    public final void z(final TimeInterpolator v) {
        this.V = v;
        this.m(false);
    }
}

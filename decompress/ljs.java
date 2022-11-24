import java.util.Arrays;
import android.graphics.Path;
import java.util.Objects;
import android.graphics.Typeface;
import java.util.ArrayList;
import android.graphics.Canvas;
import java.util.HashMap;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import java.util.List;
import java.util.Map;
import android.graphics.Matrix;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ljs extends ym1
{
    public final RectF A;
    public final Matrix B;
    public final ljs$a C;
    public final ljs$b D;
    public final Map<okb, List<fm6>> E;
    public final ycg<String> F;
    public final ijs G;
    public final ceg H;
    public final udg I;
    public wm1<Integer, Integer> J;
    public wm1<Integer, Integer> K;
    public wm1<Integer, Integer> L;
    public wm1<Integer, Integer> M;
    public wm1<Float, Float> N;
    public wm1<Float, Float> O;
    public wm1<Float, Float> P;
    public wm1<Float, Float> Q;
    public wm1<Float, Float> R;
    public final StringBuilder z;
    
    public ljs(final ceg h, final tve tve) {
        super(h, tve);
        this.z = new StringBuilder(2);
        this.A = new RectF();
        this.B = new Matrix();
        this.C = new Paint() {
            {
                this.setStyle(Paint$Style.FILL);
            }
        };
        this.D = new Paint() {
            {
                this.setStyle(Paint$Style.STROKE);
            }
        };
        this.E = new HashMap();
        this.F = (ycg<String>)new ycg();
        this.H = h;
        this.I = tve.b;
        final ijs g = new ijs((List)tve.q.G0);
        ((wm1)(this.G = g)).a((wm1$a)this);
        this.d((wm1<?, ?>)g);
        final q80 r = tve.r;
        if (r != null) {
            final e80 e80 = (e80)r.a;
            if (e80 != null) {
                final wm1<Integer, Integer> g2 = e80.g();
                this.J = (xr4)g2;
                g2.a((wm1$a)this);
                this.d((wm1<?, ?>)this.J);
            }
        }
        if (r != null) {
            final e80 e81 = (e80)r.b;
            if (e81 != null) {
                final wm1<Integer, Integer> g3 = e81.g();
                this.L = (xr4)g3;
                g3.a((wm1$a)this);
                this.d((wm1<?, ?>)this.L);
            }
        }
        if (r != null) {
            final f80 f80 = (f80)r.c;
            if (f80 != null) {
                final wm1<Float, Float> g4 = f80.g();
                this.N = (o7b)g4;
                g4.a((wm1$a)this);
                this.d((wm1<?, ?>)this.N);
            }
        }
        if (r != null) {
            final f80 f81 = (f80)r.d;
            if (f81 != null) {
                final wm1<Float, Float> g5 = f81.g();
                this.P = (o7b)g5;
                g5.a((wm1$a)this);
                this.d((wm1<?, ?>)this.P);
            }
        }
    }
    
    @Override
    public final void c(final RectF rectF, final Matrix matrix, final boolean b) {
        super.c(rectF, matrix, b);
        rectF.set(0.0f, 0.0f, (float)this.I.j.width(), (float)this.I.j.height());
    }
    
    @Override
    public final <T> void e(final T t, final seg seg) {
        super.e(t, seg);
        if (t == jeg.a) {
            final xow k = this.K;
            if (k != null) {
                this.n((wm1<?, ?>)k);
            }
            if (seg == null) {
                this.K = null;
            }
            else {
                ((wm1)(this.K = new xow(seg, (Object)null))).a((wm1$a)this);
                this.d((wm1<?, ?>)this.K);
            }
        }
        else if (t == jeg.b) {
            final xow m = this.M;
            if (m != null) {
                this.n((wm1<?, ?>)m);
            }
            if (seg == null) {
                this.M = null;
            }
            else {
                ((wm1)(this.M = new xow(seg, (Object)null))).a((wm1$a)this);
                this.d((wm1<?, ?>)this.M);
            }
        }
        else if (t == jeg.q) {
            final xow o = this.O;
            if (o != null) {
                this.n((wm1<?, ?>)o);
            }
            if (seg == null) {
                this.O = null;
            }
            else {
                ((wm1)(this.O = new xow(seg, (Object)null))).a((wm1$a)this);
                this.d((wm1<?, ?>)this.O);
            }
        }
        else if (t == jeg.r) {
            final xow q = this.Q;
            if (q != null) {
                this.n((wm1<?, ?>)q);
            }
            if (seg == null) {
                this.Q = null;
            }
            else {
                ((wm1)(this.Q = new xow(seg, (Object)null))).a((wm1$a)this);
                this.d((wm1<?, ?>)this.Q);
            }
        }
        else if (t == jeg.D) {
            final xow r = this.R;
            if (r != null) {
                this.n((wm1<?, ?>)r);
            }
            if (seg == null) {
                this.R = null;
            }
            else {
                ((wm1)(this.R = new xow(seg, (Object)null))).a((wm1$a)this);
                this.d((wm1<?, ?>)this.R);
            }
        }
    }
    
    @Override
    public final void j(final Canvas canvas, final Matrix matrix, int i) {
        canvas.save();
        if (this.H.G0.g.H0 > 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i == 0) {
            canvas.concat(matrix);
        }
        final n79 n79 = (n79)((wm1)this.G).f();
        final kkb kkb = this.I.e.get(n79.b);
        if (kkb == null) {
            canvas.restore();
            return;
        }
        final xow k = this.K;
        if (k != null) {
            this.C.setColor((int)k.f());
        }
        else {
            final xr4 j = this.J;
            if (j != null) {
                this.C.setColor((int)((wm1)j).f());
            }
            else {
                this.C.setColor(n79.h);
            }
        }
        final xow m = this.M;
        if (m != null) {
            this.D.setColor((int)m.f());
        }
        else {
            final xr4 l = this.L;
            if (l != null) {
                this.D.setColor((int)((wm1)l).f());
            }
            else {
                this.D.setColor(n79.i);
            }
        }
        final wm1 j2 = super.v.j;
        if (j2 == null) {
            i = 100;
        }
        else {
            i = (int)j2.f();
        }
        i = i * 255 / 100;
        this.C.setAlpha(i);
        this.D.setAlpha(i);
        final xow o = this.O;
        if (o != null) {
            this.D.setStrokeWidth((float)o.f());
        }
        else {
            final o7b n80 = this.N;
            if (n80 != null) {
                this.D.setStrokeWidth((float)((wm1)n80).f());
            }
            else {
                this.D.setStrokeWidth(wnw.c() * n79.j * wnw.d(matrix));
            }
        }
        if (this.H.G0.g.H0 > 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            final xow r = this.R;
            float n81;
            if (r != null) {
                n81 = (float)r.f();
            }
            else {
                n81 = n79.c;
            }
            final float n82 = n81 / 100.0f;
            final float d = wnw.d(matrix);
            final String a = n79.a;
            final float n83 = wnw.c() * n79.f;
            final List<String> w = this.w(a);
            int size;
            String s;
            float n84;
            int n85;
            int n86;
            okb okb;
            int n87;
            okb okb2;
            List<?> list;
            List<isp> a2;
            int size2;
            ArrayList list2;
            int n88;
            int n89;
            Path s2;
            float n90;
            float c;
            float n91;
            xow q;
            float n92;
            o7b p3;
            float n93 = 0.0f;
            for (size = w.size(), i = 0; i < size; size = i, i = n86) {
                s = w.get(i);
                n84 = 0.0f;
                n85 = 0;
                n86 = i;
                while (n85 < s.length()) {
                    i = okb.a(s.charAt(n85), kkb.a, kkb.b);
                    okb = this.I.g.e(i, null);
                    if (okb != null) {
                        n84 += (float)(okb.c * n82 * wnw.c() * d);
                    }
                    ++n85;
                }
                canvas.save();
                this.t(n79.d, canvas, n84);
                canvas.translate(0.0f, n86 * n83 - (size - 1) * n83 / 2.0f);
                n87 = 0;
                i = size;
                while (n87 < s.length()) {
                    okb2 = this.I.g.e(okb.a(s.charAt(n87), kkb.a, kkb.b), null);
                    if (okb2 != null) {
                        if (this.E.containsKey(okb2)) {
                            list = this.E.get(okb2);
                        }
                        else {
                            a2 = okb2.a;
                            size2 = a2.size();
                            list2 = new ArrayList<fm6>(size2);
                            for (n88 = 0; n88 < size2; ++n88) {
                                list2.add(new fm6(this.H, this, (isp)a2.get(n88)));
                            }
                            this.E.put(okb2, list2);
                            list = list2;
                        }
                        for (n89 = 0; n89 < list.size(); ++n89) {
                            s2 = ((fm6)list.get(n89)).s();
                            s2.computeBounds(this.A, false);
                            this.B.set(matrix);
                            this.B.preTranslate(0.0f, -n79.g * wnw.c());
                            this.B.preScale(n82, n82);
                            s2.transform(this.B);
                            if (n79.k) {
                                this.v(s2, this.C, canvas);
                                this.v(s2, this.D, canvas);
                            }
                            else {
                                this.v(s2, this.D, canvas);
                                this.v(s2, this.C, canvas);
                            }
                        }
                        n90 = (float)okb2.c;
                        c = wnw.c();
                        n91 = n79.e / 10.0f;
                        q = this.Q;
                        Label_1089: {
                            if (q != null) {
                                n92 = (float)q.f();
                            }
                            else {
                                p3 = this.P;
                                n93 = n91;
                                if (p3 == null) {
                                    break Label_1089;
                                }
                                n92 = (float)((wm1)p3).f();
                            }
                            n93 = n91 + n92;
                        }
                        canvas.translate(n93 * d + c * (n90 * n82) * d, 0.0f);
                    }
                    ++n87;
                }
                canvas.restore();
                ++n86;
            }
        }
        else {
            wnw.d(matrix);
            final ceg h = this.H;
            final String a3 = kkb.a;
            final String b = kkb.b;
            mkb q2;
            if (h.getCallback() == null) {
                q2 = null;
            }
            else {
                if (h.Q0 == null) {
                    h.Q0 = new mkb(h.getCallback());
                }
                q2 = h.Q0;
            }
            Typeface typeface;
            if (q2 != null) {
                final a4c a4 = q2.a;
                a4.G0 = a3;
                a4.H0 = b;
                typeface = q2.b.get(a4);
                if (typeface == null) {
                    typeface = q2.c.get(a3);
                    if (typeface == null) {
                        final StringBuilder n94 = a88.n("fonts/", a3);
                        n94.append(q2.e);
                        typeface = Typeface.createFromAsset(q2.d, n94.toString());
                        q2.c.put(a3, typeface);
                    }
                    final boolean contains = b.contains("Italic");
                    final boolean contains2 = b.contains("Bold");
                    if (contains && contains2) {
                        i = 3;
                    }
                    else if (contains) {
                        i = 2;
                    }
                    else if (contains2) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    if (typeface.getStyle() != i) {
                        typeface = Typeface.create(typeface, i);
                    }
                    q2.b.put(q2.a, typeface);
                }
            }
            else {
                typeface = null;
            }
            if (typeface != null) {
                final String a5 = n79.a;
                Objects.requireNonNull(this.H);
                this.C.setTypeface(typeface);
                final xow r2 = this.R;
                float n95;
                if (r2 != null) {
                    n95 = (float)r2.f();
                }
                else {
                    n95 = n79.c;
                }
                this.C.setTextSize(wnw.c() * n95);
                this.D.setTypeface(this.C.getTypeface());
                this.D.setTextSize(this.C.getTextSize());
                final float n96 = wnw.c() * n79.f;
                final float n97 = n79.e / 10.0f;
                final xow q3 = this.Q;
                float n99 = 0.0f;
                Label_1589: {
                    float n98;
                    if (q3 != null) {
                        n98 = (float)q3.f();
                    }
                    else {
                        final o7b p4 = this.P;
                        n99 = n97;
                        if (p4 == null) {
                            break Label_1589;
                        }
                        n98 = (float)((wm1)p4).f();
                    }
                    n99 = n97 + n98;
                }
                final float n100 = wnw.c() * n99 * n95 / 100.0f;
                final List<String> w2 = this.w(a5);
                for (int size3 = w2.size(), n101 = 0; n101 < size3; ++n101) {
                    final String s3 = w2.get(n101);
                    final float measureText = this.D.measureText(s3);
                    final float n102 = (float)(s3.length() - 1);
                    canvas.save();
                    this.t(n79.d, canvas, n102 * n100 + measureText);
                    canvas.translate(0.0f, n101 * n96 - (size3 - 1) * n96 / 2.0f);
                    i = 0;
                    while (i < s3.length()) {
                        int codePoint;
                        int n103;
                        int codePoint2;
                        for (codePoint = s3.codePointAt(i), n103 = Character.charCount(codePoint) + i; n103 < s3.length(); n103 += Character.charCount(codePoint2), codePoint = codePoint * 31 + codePoint2) {
                            codePoint2 = s3.codePointAt(n103);
                            if (Character.getType(codePoint2) != 16 && Character.getType(codePoint2) != 27 && Character.getType(codePoint2) != 6 && Character.getType(codePoint2) != 28 && Character.getType(codePoint2) != 19) {
                                break;
                            }
                        }
                        final ycg<String> f = this.F;
                        final long n104 = codePoint;
                        String string;
                        if (f.e(n104)) {
                            string = (String)this.F.g(n104, (Object)null);
                        }
                        else {
                            this.z.setLength(0);
                            int codePoint3;
                            for (int n105 = i; n105 < n103; n105 += Character.charCount(codePoint3)) {
                                codePoint3 = s3.codePointAt(n105);
                                this.z.appendCodePoint(codePoint3);
                            }
                            string = this.z.toString();
                            this.F.j(n104, (Object)string);
                        }
                        i += string.length();
                        if (n79.k) {
                            this.u(string, this.C, canvas);
                            this.u(string, this.D, canvas);
                        }
                        else {
                            this.u(string, this.D, canvas);
                            this.u(string, this.C, canvas);
                        }
                        canvas.translate(this.C.measureText(string) + n100, 0.0f);
                    }
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }
    
    public final void t(int n, final Canvas canvas, final float n2) {
        if (n != 0) {
            if (--n != 1) {
                if (n == 2) {
                    canvas.translate(-n2 / 2.0f, 0.0f);
                }
            }
            else {
                canvas.translate(-n2, 0.0f);
            }
            return;
        }
        throw null;
    }
    
    public final void u(final String s, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(s, 0, s.length(), 0.0f, 0.0f, paint);
    }
    
    public final void v(final Path path, final Paint paint, final Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint$Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }
    
    public final List<String> w(final String s) {
        return Arrays.asList(s.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}

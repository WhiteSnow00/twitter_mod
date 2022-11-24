import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.ScaleXSpan;
import java.util.Arrays;
import android.text.style.LeadingMarginSpan$Standard;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.Collection;
import android.os.Build$VERSION;
import android.graphics.Typeface;
import java.util.Locale;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e50 implements iwj
{
    public final kks a;
    public final List<xc0$b<f1r>> b;
    public final List<xc0$b<phk>> c;
    public final qkb$b d;
    public final rp8 e;
    public final y60 f;
    public final CharSequence g;
    public final jwe h;
    public final List<cnv> i;
    public final int j;
    
    public e50(String g, final kks a, final List<xc0$b<f1r>> b, final List<xc0$b<phk>> c, final qkb$b d, final rp8 e) {
        e0e.f((Object)g, "text");
        e0e.f((Object)a, "style");
        e0e.f((Object)d, "fontFamilyResolver");
        e0e.f((Object)e, "density");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final y60 f = new y60(e.getDensity());
        this.f = f;
        this.i = new ArrayList();
        final bgs b2 = a.b.b;
        final s5g k = a.a.k;
        final int n = 3;
        int a2;
        if (b2 != null) {
            a2 = b2.a;
        }
        else {
            Objects.requireNonNull(bgs.Companion);
            a2 = 3;
        }
        Objects.requireNonNull(bgs.Companion);
        int j = 0;
        Label_0346: {
            if (a2 != 4) {
                if (a2 == 5) {
                    j = n;
                    break Label_0346;
                }
                if (a2 == 1) {
                    j = 0;
                    break Label_0346;
                }
                if (a2 == 2) {
                    j = 1;
                    break Label_0346;
                }
                if (a2 != 3) {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                Locale locale = null;
                Label_0316: {
                    if (k != null) {
                        final eik a3 = k.e().a;
                        e0e.d((Object)a3, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                        if ((locale = ((o40)a3).a) != null) {
                            break Label_0316;
                        }
                    }
                    locale = Locale.getDefault();
                }
                final int a4 = rks.a;
                final int a5 = rks.a.a(locale);
                if (a5 != 0) {
                    j = n;
                    if (a5 == 1) {
                        break Label_0346;
                    }
                }
            }
            j = 2;
        }
        this.j = j;
        final mub<qkb, qlb, mlb, nlb, Typeface> mub = (mub<qkb, qlb, mlb, nlb, Typeface>)new mub<qkb, qlb, mlb, nlb, Typeface>(this) {
            public final e50 F0;
            
            public final Object I(Object b, final Object o, final Object o2, final Object o3) {
                final qkb qkb = (qkb)b;
                final qlb qlb = (qlb)o;
                final int a = ((mlb)o2).a;
                final int a2 = ((nlb)o3).a;
                e0e.f((Object)qlb, "fontWeight");
                final cnv cnv = new cnv(this.F0.d.a(qkb, qlb, a, a2));
                this.F0.i.add(cnv);
                b = cnv.b;
                e0e.d(b, "null cannot be cast to non-null type android.graphics.Typeface");
                return b;
            }
        };
        final f1r a6 = a.a;
        e0e.f((Object)a6, "style");
        final long c2 = pks.c(a6.b);
        Objects.requireNonNull(qks.Companion);
        if (qks.a(c2, 4294967296L)) {
            ((Paint)f).setTextSize(e.V(a6.b));
        }
        else if (qks.a(c2, 8589934592L)) {
            ((Paint)f).setTextSize(pks.d(a6.b) * ((Paint)f).getTextSize());
        }
        if (p4j.y(a6)) {
            final qkb f2 = a6.f;
            qlb qlb;
            if ((qlb = a6.c) == null) {
                Objects.requireNonNull(qlb.Companion);
                qlb = qlb.M0;
            }
            final mlb d2 = a6.d;
            int a7;
            if (d2 != null) {
                a7 = d2.a;
            }
            else {
                Objects.requireNonNull(mlb.Companion);
                a7 = 0;
            }
            final nlb e2 = a6.e;
            int a8;
            if (e2 != null) {
                a8 = e2.a;
            }
            else {
                Objects.requireNonNull(nlb.Companion);
                a8 = 1;
            }
            e0e.f((Object)qlb, "fontWeight");
            final cnv cnv = new cnv(mub.F0.d.a(f2, qlb, a7, a8));
            mub.F0.i.add(cnv);
            final Object b3 = cnv.b;
            e0e.d(b3, "null cannot be cast to non-null type android.graphics.Typeface");
            ((Paint)f).setTypeface((Typeface)b3);
        }
        final s5g i = a6.k;
        if (i != null && !e0e.a((Object)i, (Object)s5g.Companion.a())) {
            if (Build$VERSION.SDK_INT >= 24) {
                v5g.a.b(f, a6.k);
            }
            else {
                q5g q5g;
                if (a6.k.isEmpty()) {
                    q5g = q5g.Companion.a();
                }
                else {
                    q5g = a6.k.e();
                }
                ((Paint)f).setTextLocale(tpz.V(q5g));
            }
        }
        if (qks.a(pks.c(a6.h), 8589934592L)) {
            ((Paint)f).setLetterSpacing(pks.d(a6.h));
        }
        final String g2 = a6.g;
        if (g2 != null && !e0e.a((Object)g2, (Object)"")) {
            ((Paint)f).setFontFeatureSettings(a6.g);
        }
        final wis l = a6.j;
        if (l != null) {
            Objects.requireNonNull(wis.Companion);
            if (!e0e.a((Object)l, (Object)wis.c)) {
                ((Paint)f).setTextScaleX(((Paint)f).getTextScaleX() * a6.j.a);
                ((Paint)f).setTextSkewX(((Paint)f).getTextSkewX() + a6.j.b);
            }
        }
        f.b(a6.c());
        final wq2 b4 = a6.b();
        Objects.requireNonNull(aeq.Companion);
        f.a(b4, aeq.c, a6.a());
        f.c(a6.n);
        long n2;
        if (qks.a(pks.c(a6.h), 4294967296L) && pks.d(a6.h) != 0.0f) {
            n2 = a6.h;
        }
        else {
            Objects.requireNonNull(pks.Companion);
            n2 = pks.c;
        }
        final long m = a6.l;
        Objects.requireNonNull(sr4.Companion);
        long n3;
        if (sr4.c(m, sr4.f)) {
            n3 = sr4.g;
        }
        else {
            n3 = a6.l;
        }
        final ur1 i2 = a6.i;
        Objects.requireNonNull(ur1.Companion);
        ur1 i3;
        if (i2 != null && e0e.a((Object)i2.a, (Object)0.0f)) {
            i3 = null;
        }
        else {
            i3 = a6.i;
        }
        xfs m2 = a6.m;
        Objects.requireNonNull(xfs.Companion);
        if (!(e0e.a((Object)m2, (Object)xfs.b) ^ true)) {
            m2 = null;
        }
        final f1r f1r = new f1r(0L, 0L, (qlb)null, (mlb)null, (nlb)null, (qkb)null, (String)null, n2, i3, (wis)null, (s5g)null, n3, m2, (vrp)null, 9855);
        final float textSize = ((Paint)f).getTextSize();
        final ArrayList list = (ArrayList)rr4.T1((Collection)shw.x0((Object)new xc0$b((Object)f1r, 0, g.length())), (Iterable)b);
        Label_3044: {
            if (list.isEmpty() && c.isEmpty()) {
                final xis d3 = a.b.d;
                Objects.requireNonNull(xis.Companion);
                if (e0e.a((Object)d3, (Object)xis.c) && ma7.B(a.b.c)) {
                    break Label_3044;
                }
            }
            final Object o = new SpannableString((CharSequence)g);
            final bjk c3 = a.c;
            boolean a9 = false;
            Label_1273: {
                if (c3 != null) {
                    final mik b5 = c3.b;
                    if (b5 != null) {
                        a9 = b5.a;
                        break Label_1273;
                    }
                }
                a9 = true;
            }
            Label_1520: {
                if (a9) {
                    final jwj b6 = a.b;
                    if (b6.f == null) {
                        final float o2 = pk7.o(b6.c, textSize, e);
                        if (!Float.isNaN(o2)) {
                            pk7.v((Spannable)o, new mdf(o2), 0, ((SpannableString)o).length());
                        }
                        break Label_1520;
                    }
                }
                ndf ndf;
                if ((ndf = a.b.f) == null) {
                    Objects.requireNonNull(ndf.Companion);
                    ndf = ndf.c;
                }
                final long c4 = a.b.c;
                e0e.f((Object)ndf, "lineHeightStyle");
                final float o3 = pk7.o(c4, textSize, e);
                if (!Float.isNaN(o3)) {
                    int length;
                    if (((SpannableString)o).length() != 0 && xlr.c2((CharSequence)o) != '\n') {
                        length = ((SpannableString)o).length();
                    }
                    else {
                        length = ((SpannableString)o).length() + 1;
                    }
                    final int b7 = ndf.b;
                    pk7.v((Spannable)o, new odf(o3, length, (b7 & 0x1) > 0, (b7 & 0x10) > 0, ndf.a), 0, ((SpannableString)o).length());
                }
            }
            final xis d4 = a.b.d;
            if (d4 != null && (!pks.a(d4.a, ma7.w(0)) || !pks.a(d4.b, ma7.w(0))) && !ma7.B(d4.a)) {
                if (!ma7.B(d4.b)) {
                    final long c5 = pks.c(d4.a);
                    float v;
                    if (qks.a(c5, 4294967296L)) {
                        v = e.V(d4.a);
                    }
                    else if (qks.a(c5, 8589934592L)) {
                        v = pks.d(d4.a) * textSize;
                    }
                    else {
                        v = 0.0f;
                    }
                    final long c6 = pks.c(d4.b);
                    float v2;
                    if (qks.a(c6, 4294967296L)) {
                        v2 = e.V(d4.b);
                    }
                    else if (qks.a(c6, 8589934592L)) {
                        v2 = pks.d(d4.b) * textSize;
                    }
                    else {
                        v2 = 0.0f;
                    }
                    pk7.v((Spannable)o, new LeadingMarginSpan$Standard((int)(float)Math.ceil(v), (int)(float)Math.ceil(v2)), 0, ((SpannableString)o).length());
                }
            }
            final ArrayList list2 = new ArrayList<xc0$b>(list.size());
            for (int size = list.size(), n4 = 0; n4 < size; ++n4) {
                final Object value = list.get(n4);
                final xc0$b xc0$b = (xc0$b)value;
                if (p4j.y((f1r)xc0$b.a) || ((f1r)xc0$b.a).e != null) {
                    list2.add((xc0$b)value);
                }
            }
            f1r f1r2;
            if (p4j.y(a.a) || a.a.e != null) {
                final f1r a10 = a.a;
                f1r2 = new f1r(0L, 0L, a10.c, a10.d, a10.e, a10.f, (String)null, 0L, (ur1)null, (wis)null, (s5g)null, 0L, (xfs)null, (vrp)null, 16323);
            }
            else {
                f1r2 = null;
            }
            final j1r j1r = new j1r((Spannable)o, (mub)mub);
            if (list2.size() <= 1) {
                if (list2.isEmpty() ^ true) {
                    final f1r f1r3 = (f1r)list2.get(0).a;
                    f1r e3;
                    if (f1r2 == null) {
                        e3 = f1r3;
                    }
                    else {
                        e3 = f1r2.e(f1r3);
                    }
                    j1r.h0((Object)e3, (Object)list2.get(0).b, (Object)list2.get(0).c);
                }
            }
            else {
                final int size2 = list2.size();
                final int n5 = size2 * 2;
                final Integer[] array = new Integer[n5];
                for (int n6 = 0; n6 < n5; ++n6) {
                    array[n6] = 0;
                }
                for (int size3 = list2.size(), n7 = 0; n7 < size3; ++n7) {
                    final xc0$b xc0$b2 = list2.get(n7);
                    array[n7] = xc0$b2.b;
                    array[n7 + size2] = xc0$b2.c;
                }
                final Comparable[] array2 = array;
                if (array2.length > 1) {
                    Arrays.sort(array2);
                }
                final int intValue = ((Number)ft0.X0((Object[])array)).intValue();
                int n8 = 0;
                final int n9 = n5;
                int n10 = intValue;
                final ArrayList<xc0$b> list3 = (ArrayList<xc0$b>)list2;
                while (n8 < n9) {
                    final int intValue2 = array[n8];
                    if (intValue2 != n10) {
                        final int size4 = list3.size();
                        f1r f1r4 = f1r2;
                        Object e4;
                        for (int n11 = 0; n11 < size4; ++n11, f1r4 = (f1r)e4) {
                            final xc0$b xc0$b3 = list3.get(n11);
                            final int b8 = xc0$b3.b;
                            final int c7 = xc0$b3.c;
                            e4 = f1r4;
                            if (b8 != c7) {
                                e4 = f1r4;
                                if (yc0.c(n10, intValue2, b8, c7)) {
                                    e4 = xc0$b3.a;
                                    if (f1r4 != null) {
                                        e4 = f1r4.e((f1r)e4);
                                    }
                                }
                            }
                        }
                        if (f1r4 != null) {
                            j1r.h0((Object)f1r4, (Object)n10, (Object)intValue2);
                        }
                        n10 = intValue2;
                    }
                    ++n8;
                }
            }
            final ArrayList<e1r> list4 = new ArrayList<e1r>();
            final int size5 = list.size();
            int n12 = 0;
            rp8 rp8 = e;
            while (n12 < size5) {
                final xc0$b xc0$b4 = list.get(n12);
                final int b9 = xc0$b4.b;
                final int c8 = xc0$b4.c;
                rp8 rp9;
                if (b9 >= 0 && b9 < ((SpannableString)o).length() && c8 > b9 && c8 <= ((SpannableString)o).length()) {
                    final int b10 = xc0$b4.b;
                    final int c9 = xc0$b4.c;
                    final f1r f1r5 = (f1r)xc0$b4.a;
                    final ur1 i4 = f1r5.i;
                    if (i4 != null) {
                        pk7.v((Spannable)o, new vr1(i4.a), b10, c9);
                    }
                    pk7.s((Spannable)o, f1r5.c(), b10, c9);
                    final wq2 b11 = f1r5.b();
                    final float a11 = f1r5.a();
                    if (b11 != null) {
                        if (b11 instanceof jmq) {
                            pk7.s((Spannable)o, ((jmq)b11).a, b10, c9);
                        }
                        else if (b11 instanceof trp) {
                            pk7.v((Spannable)o, new urp((trp)b11, a11), b10, c9);
                        }
                    }
                    final xfs m3 = f1r5.m;
                    if (m3 != null) {
                        Objects.requireNonNull(xfs.Companion);
                        final int a12 = m3.a;
                        final boolean b12 = (0x1 | a12) == a12;
                        final int a13 = m3.a;
                        pk7.v((Spannable)o, new yfs(b12, (0x2 | a13) == a13), b10, c9);
                    }
                    pk7.t((Spannable)o, f1r5.b, e, b10, c9);
                    final String g3 = f1r5.g;
                    if (g3 != null) {
                        pk7.v((Spannable)o, new ukb(g3), b10, c9);
                    }
                    final wis j2 = f1r5.j;
                    if (j2 != null) {
                        pk7.v((Spannable)o, new ScaleXSpan(j2.a), b10, c9);
                        pk7.v((Spannable)o, new meq(j2.b), b10, c9);
                    }
                    pk7.u((Spannable)o, f1r5.k, b10, c9);
                    pk7.r((Spannable)o, f1r5.l, b10, c9);
                    final vrp n13 = f1r5.n;
                    if (n13 != null) {
                        final int i5 = yru.I(n13.a);
                        final float d5 = kgj.d(n13.b);
                        final float e5 = kgj.e(n13.b);
                        float c10 = n13.c;
                        if (c10 == 0.0f) {
                            c10 = Float.MIN_VALUE;
                        }
                        pk7.v((Spannable)o, new yrp(i5, d5, e5, c10), b10, c9);
                    }
                    final long h = f1r5.h;
                    final long c11 = pks.c(h);
                    Objects.requireNonNull(qks.Companion);
                    Object o4;
                    if (qks.a(c11, 4294967296L)) {
                        o4 = new x7f(e.V(h));
                    }
                    else if (qks.a(c11, 8589934592L)) {
                        o4 = new w7f(pks.d(h));
                    }
                    else {
                        o4 = null;
                    }
                    rp9 = e;
                    if (o4 != null) {
                        list4.add(new e1r(o4, b10, c9));
                        rp9 = e;
                    }
                }
                else {
                    rp9 = rp8;
                }
                ++n12;
                rp8 = rp9;
            }
            for (int size6 = list4.size(), n14 = 0; n14 < size6; ++n14) {
                final e1r e1r = list4.get(n14);
                pk7.v((Spannable)o, e1r.a, e1r.b, e1r.c);
            }
            if (c.size() > 0) {
                final phk phk = (phk)c.get(0).a;
                new(qhk.class)();
                Objects.requireNonNull(phk);
                pks.d(0L);
                kqe.Q();
                pks.d(0L);
                kqe.Q();
                e.p0();
                e.getDensity();
                Objects.requireNonNull(rhk.Companion);
                throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
            }
            g = (String)o;
        }
        this.g = g;
        this.h = new jwe((CharSequence)g, (TextPaint)this.f, this.j);
    }
    
    public final boolean a() {
        final ArrayList i = this.i;
        final int size = i.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final cnv cnv = (cnv)i.get(n);
            if (cnv.a.getValue() != cnv.b) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final float b() {
        return ((Number)this.h.c.getValue()).floatValue();
    }
    
    public final float c() {
        return ((Number)this.h.b.getValue()).floatValue();
    }
}

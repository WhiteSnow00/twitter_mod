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

public final class f50 implements tvj
{
    public final sjs a;
    public final List<xc0$b<i0r>> b;
    public final List<xc0$b<bhk>> c;
    public final pjb$b d;
    public final lo8 e;
    public final z60 f;
    public final CharSequence g;
    public final mve h;
    public final List<qmv> i;
    public final int j;
    
    public f50(String g, final sjs a, final List<xc0$b<i0r>> b, final List<xc0$b<bhk>> c, final pjb$b d, final lo8 e) {
        czd.f((Object)g, "text");
        czd.f((Object)a, "style");
        czd.f((Object)d, "fontFamilyResolver");
        czd.f((Object)e, "density");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final z60 f = new z60(e.getDensity());
        this.f = f;
        this.i = new ArrayList();
        final jfs b2 = a.b.b;
        final x4g k = a.a.k;
        final int n = 3;
        int a2;
        if (b2 != null) {
            a2 = b2.a;
        }
        else {
            Objects.requireNonNull(jfs.Companion);
            a2 = 3;
        }
        Objects.requireNonNull(jfs.Companion);
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
                        final phk a3 = k.e().a;
                        czd.d((Object)a3, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                        if ((locale = ((p40)a3).a) != null) {
                            break Label_0316;
                        }
                    }
                    locale = Locale.getDefault();
                }
                final int a4 = zjs.a;
                final int a5 = zjs$a.a(locale);
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
        final f50$a f50$a = new f50$a(this);
        final i0r a6 = a.a;
        czd.f((Object)a6, "style");
        final long c2 = xjs.c(a6.b);
        Objects.requireNonNull(yjs.Companion);
        if (yjs.a(c2, 4294967296L)) {
            ((Paint)f).setTextSize(e.V(a6.b));
        }
        else if (yjs.a(c2, 8589934592L)) {
            ((Paint)f).setTextSize(xjs.d(a6.b) * ((Paint)f).getTextSize());
        }
        if (gmw.v(a6)) {
            final pjb f2 = a6.f;
            pkb pkb;
            if ((pkb = a6.c) == null) {
                Objects.requireNonNull(pkb.Companion);
                pkb = pkb.K0;
            }
            final lkb d2 = a6.d;
            int a7;
            if (d2 != null) {
                a7 = d2.a;
            }
            else {
                Objects.requireNonNull(lkb.Companion);
                a7 = 0;
            }
            final mkb e2 = a6.e;
            int a8;
            if (e2 != null) {
                a8 = e2.a;
            }
            else {
                Objects.requireNonNull(mkb.Companion);
                a8 = 1;
            }
            czd.f((Object)pkb, "fontWeight");
            final qmv qmv = new qmv(f50$a.D0.d.a(f2, pkb, a7, a8));
            f50$a.D0.i.add(qmv);
            final Object b3 = qmv.b;
            czd.d(b3, "null cannot be cast to non-null type android.graphics.Typeface");
            ((Paint)f).setTypeface((Typeface)b3);
        }
        final x4g i = a6.k;
        if (i != null && !czd.a((Object)i, (Object)x4g.Companion.a())) {
            if (Build$VERSION.SDK_INT >= 24) {
                a5g.a.b(f, a6.k);
            }
            else {
                v4g v4g;
                if (a6.k.isEmpty()) {
                    v4g = v4g.Companion.a();
                }
                else {
                    v4g = a6.k.e();
                }
                ((Paint)f).setTextLocale(uoz.a0(v4g));
            }
        }
        if (yjs.a(xjs.c(a6.h), 8589934592L)) {
            ((Paint)f).setLetterSpacing(xjs.d(a6.h));
        }
        final String g2 = a6.g;
        if (g2 != null && !czd.a((Object)g2, (Object)"")) {
            ((Paint)f).setFontFeatureSettings(a6.g);
        }
        final eis l = a6.j;
        if (l != null) {
            Objects.requireNonNull(eis.Companion);
            if (!czd.a((Object)l, (Object)eis.c)) {
                ((Paint)f).setTextScaleX(((Paint)f).getTextScaleX() * a6.j.a);
                ((Paint)f).setTextSkewX(((Paint)f).getTextSkewX() + a6.j.b);
            }
        }
        f.b(a6.c());
        final fq2 b4 = a6.b();
        Objects.requireNonNull(ddq.Companion);
        f.a(b4, ddq.c, a6.a());
        f.c(a6.n);
        long n2;
        if (yjs.a(xjs.c(a6.h), 4294967296L) && xjs.d(a6.h) != 0.0f) {
            n2 = a6.h;
        }
        else {
            Objects.requireNonNull(xjs.Companion);
            n2 = xjs.c;
        }
        final long m = a6.l;
        Objects.requireNonNull(nq4.Companion);
        long n3;
        if (nq4.c(m, nq4.f)) {
            n3 = nq4.g;
        }
        else {
            n3 = a6.l;
        }
        final nr1 i2 = a6.i;
        Objects.requireNonNull(nr1.Companion);
        nr1 i3;
        if (i2 != null && czd.a((Object)i2.a, (Object)0.0f)) {
            i3 = null;
        }
        else {
            i3 = a6.i;
        }
        ffs m2 = a6.m;
        Objects.requireNonNull(ffs.Companion);
        if (!(czd.a((Object)m2, (Object)ffs.b) ^ true)) {
            m2 = null;
        }
        final i0r i0r = new i0r(0L, 0L, (pkb)null, (lkb)null, (mkb)null, (pjb)null, (String)null, n2, i3, (eis)null, (x4g)null, n3, m2, (arp)null, 9855);
        final float textSize = ((Paint)f).getTextSize();
        final ArrayList list = (ArrayList)mq4.x0((Collection)s9i.r(new xc0$b((Object)i0r, 0, g.length())), (Iterable)b);
        Label_3044: {
            if (list.isEmpty() && c.isEmpty()) {
                final fis d3 = a.b.d;
                Objects.requireNonNull(fis.Companion);
                if (czd.a((Object)d3, (Object)fis.c) && fli.k0(a.b.c)) {
                    break Label_3044;
                }
            }
            final Object o = new SpannableString((CharSequence)g);
            final lik c3 = a.c;
            boolean a9 = false;
            Label_1273: {
                if (c3 != null) {
                    final xhk b5 = c3.b;
                    if (b5 != null) {
                        a9 = b5.a;
                        break Label_1273;
                    }
                }
                a9 = true;
            }
            Label_1520: {
                if (a9) {
                    final uvj b6 = a.b;
                    if (b6.f == null) {
                        final float j2 = yvl.J(b6.c, textSize, e);
                        if (!Float.isNaN(j2)) {
                            yvl.R((Spannable)o, (Object)new pcf(j2), 0, ((SpannableString)o).length());
                        }
                        break Label_1520;
                    }
                }
                qcf qcf;
                if ((qcf = a.b.f) == null) {
                    Objects.requireNonNull(qcf.Companion);
                    qcf = qcf.c;
                }
                final long c4 = a.b.c;
                czd.f((Object)qcf, "lineHeightStyle");
                final float j3 = yvl.J(c4, textSize, e);
                if (!Float.isNaN(j3)) {
                    int length;
                    if (((SpannableString)o).length() != 0 && alr.N0((CharSequence)o) != '\n') {
                        length = ((SpannableString)o).length();
                    }
                    else {
                        length = ((SpannableString)o).length() + 1;
                    }
                    final int b7 = qcf.b;
                    yvl.R((Spannable)o, (Object)new rcf(j3, length, (b7 & 0x1) > 0, (b7 & 0x10) > 0, qcf.a), 0, ((SpannableString)o).length());
                }
            }
            final fis d4 = a.b.d;
            if (d4 != null && (!xjs.a(d4.a, fli.b0(0)) || !xjs.a(d4.b, fli.b0(0))) && !fli.k0(d4.a)) {
                if (!fli.k0(d4.b)) {
                    final long c5 = xjs.c(d4.a);
                    float v;
                    if (yjs.a(c5, 4294967296L)) {
                        v = e.V(d4.a);
                    }
                    else if (yjs.a(c5, 8589934592L)) {
                        v = xjs.d(d4.a) * textSize;
                    }
                    else {
                        v = 0.0f;
                    }
                    final long c6 = xjs.c(d4.b);
                    float v2;
                    if (yjs.a(c6, 4294967296L)) {
                        v2 = e.V(d4.b);
                    }
                    else if (yjs.a(c6, 8589934592L)) {
                        v2 = xjs.d(d4.b) * textSize;
                    }
                    else {
                        v2 = 0.0f;
                    }
                    yvl.R((Spannable)o, (Object)new LeadingMarginSpan$Standard((int)(float)Math.ceil(v), (int)(float)Math.ceil(v2)), 0, ((SpannableString)o).length());
                }
            }
            final ArrayList list2 = new ArrayList<xc0$b>(list.size());
            for (int size = list.size(), n4 = 0; n4 < size; ++n4) {
                final Object value = list.get(n4);
                final xc0$b xc0$b = (xc0$b)value;
                if (gmw.v((i0r)xc0$b.a) || ((i0r)xc0$b.a).e != null) {
                    list2.add((xc0$b)value);
                }
            }
            i0r i0r2;
            if (gmw.v(a.a) || a.a.e != null) {
                final i0r a10 = a.a;
                i0r2 = new i0r(0L, 0L, a10.c, a10.d, a10.e, a10.f, (String)null, 0L, (nr1)null, (eis)null, (x4g)null, 0L, (ffs)null, (arp)null, 16323);
            }
            else {
                i0r2 = null;
            }
            final m0r m0r = new m0r((Spannable)o, (ktb)f50$a);
            if (list2.size() <= 1) {
                if (list2.isEmpty() ^ true) {
                    final i0r i0r3 = (i0r)list2.get(0).a;
                    i0r e3;
                    if (i0r2 == null) {
                        e3 = i0r3;
                    }
                    else {
                        e3 = i0r2.e(i0r3);
                    }
                    m0r.h0((Object)e3, (Object)list2.get(0).b, (Object)list2.get(0).c);
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
                final int intValue = ((Number)ct0.O0((Object[])array)).intValue();
                int n8 = 0;
                final int n9 = n5;
                int n10 = intValue;
                final ArrayList<xc0$b> list3 = (ArrayList<xc0$b>)list2;
                while (n8 < n9) {
                    final int intValue2 = array[n8];
                    if (intValue2 != n10) {
                        final int size4 = list3.size();
                        i0r i0r4 = i0r2;
                        Object e4;
                        for (int n11 = 0; n11 < size4; ++n11, i0r4 = (i0r)e4) {
                            final xc0$b xc0$b3 = list3.get(n11);
                            final int b8 = xc0$b3.b;
                            final int c7 = xc0$b3.c;
                            e4 = i0r4;
                            if (b8 != c7) {
                                e4 = i0r4;
                                if (yc0.c(n10, intValue2, b8, c7)) {
                                    e4 = xc0$b3.a;
                                    if (i0r4 != null) {
                                        e4 = i0r4.e((i0r)e4);
                                    }
                                }
                            }
                        }
                        if (i0r4 != null) {
                            m0r.h0((Object)i0r4, (Object)n10, (Object)intValue2);
                        }
                        n10 = intValue2;
                    }
                    ++n8;
                }
            }
            final ArrayList<h0r> list4 = new ArrayList<h0r>();
            final int size5 = list.size();
            int n12 = 0;
            lo8 lo8 = e;
            while (n12 < size5) {
                final xc0$b xc0$b4 = list.get(n12);
                final int b9 = xc0$b4.b;
                final int c8 = xc0$b4.c;
                lo8 lo9;
                if (b9 >= 0 && b9 < ((SpannableString)o).length() && c8 > b9 && c8 <= ((SpannableString)o).length()) {
                    final int b10 = xc0$b4.b;
                    final int c9 = xc0$b4.c;
                    final i0r i0r5 = (i0r)xc0$b4.a;
                    final nr1 i4 = i0r5.i;
                    if (i4 != null) {
                        yvl.R((Spannable)o, (Object)new or1(i4.a), b10, c9);
                    }
                    yvl.O((Spannable)o, i0r5.c(), b10, c9);
                    final fq2 b11 = i0r5.b();
                    final float a11 = i0r5.a();
                    if (b11 != null) {
                        if (b11 instanceof mlq) {
                            yvl.O((Spannable)o, ((mlq)b11).a, b10, c9);
                        }
                        else if (b11 instanceof yqp) {
                            yvl.R((Spannable)o, (Object)new zqp((yqp)b11, a11), b10, c9);
                        }
                    }
                    final ffs m3 = i0r5.m;
                    if (m3 != null) {
                        Objects.requireNonNull(ffs.Companion);
                        final int a12 = m3.a;
                        final boolean b12 = (0x1 | a12) == a12;
                        final int a13 = m3.a;
                        yvl.R((Spannable)o, (Object)new gfs(b12, (0x2 | a13) == a13), b10, c9);
                    }
                    yvl.P((Spannable)o, i0r5.b, e, b10, c9);
                    final String g3 = i0r5.g;
                    if (g3 != null) {
                        yvl.R((Spannable)o, (Object)new tjb(g3), b10, c9);
                    }
                    final eis j4 = i0r5.j;
                    if (j4 != null) {
                        yvl.R((Spannable)o, (Object)new ScaleXSpan(j4.a), b10, c9);
                        yvl.R((Spannable)o, (Object)new pdq(j4.b), b10, c9);
                    }
                    yvl.Q((Spannable)o, i0r5.k, b10, c9);
                    yvl.N((Spannable)o, i0r5.l, b10, c9);
                    final arp n13 = i0r5.n;
                    if (n13 != null) {
                        final int f3 = q3j.f0(n13.a);
                        final float d5 = wfj.d(n13.b);
                        final float e5 = wfj.e(n13.b);
                        float c10 = n13.c;
                        if (c10 == 0.0f) {
                            c10 = Float.MIN_VALUE;
                        }
                        yvl.R((Spannable)o, (Object)new drp(f3, d5, e5, c10), b10, c9);
                    }
                    final long h = i0r5.h;
                    final long c11 = xjs.c(h);
                    Objects.requireNonNull(yjs.Companion);
                    Object o2;
                    if (yjs.a(c11, 4294967296L)) {
                        o2 = new y6f(e.V(h));
                    }
                    else if (yjs.a(c11, 8589934592L)) {
                        o2 = new x6f(xjs.d(h));
                    }
                    else {
                        o2 = null;
                    }
                    lo9 = e;
                    if (o2 != null) {
                        list4.add(new h0r(o2, b10, c9));
                        lo9 = e;
                    }
                }
                else {
                    lo9 = lo8;
                }
                ++n12;
                lo8 = lo9;
            }
            for (int size6 = list4.size(), n14 = 0; n14 < size6; ++n14) {
                final h0r h0r = list4.get(n14);
                yvl.R((Spannable)o, h0r.a, h0r.b, h0r.c);
            }
            if (c.size() > 0) {
                final bhk bhk = (bhk)c.get(0).a;
                new(chk.class)();
                Objects.requireNonNull(bhk);
                xjs.d(0L);
                wj1.m();
                xjs.d(0L);
                wj1.m();
                e.p0();
                e.getDensity();
                Objects.requireNonNull(dhk.Companion);
                throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
            }
            g = (String)o;
        }
        this.g = g;
        this.h = new mve((CharSequence)g, (TextPaint)this.f, this.j);
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
            final qmv qmv = (qmv)i.get(n);
            if (qmv.a.getValue() != qmv.b) {
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

import android.graphics.Paint;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.graphics.PathEffect;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint$FontMetricsInt;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import android.text.Spanned;
import android.text.TextUtils$TruncateAt;
import android.os.Build$VERSION;
import android.text.SpannableString;
import android.text.Spannable;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d50 implements fwj
{
    public final e50 a;
    public final int b;
    public final long c;
    public final njs d;
    public final CharSequence e;
    public final List<p6m> f;
    public final nxe g;
    
    public d50(final e50 a, int i, final boolean b, final long c) {
        this.a = a;
        this.b = i;
        this.c = c;
        if (vj6.i(c) != 0 || vj6.j(c) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            final kks a2 = a.a;
            boolean b3 = false;
            Label_0220: {
                if (b && !pks.a(a2.a.h, ma7.w(0))) {
                    final long h = a2.a.h;
                    Objects.requireNonNull(pks.Companion);
                    if (!pks.a(h, pks.c)) {
                        final efs a3 = a2.b.a;
                        if (a3 != null) {
                            Objects.requireNonNull(efs.Companion);
                            if (a3.a != 5) {
                                final efs a4 = a2.b.a;
                                boolean b2 = false;
                                Label_0206: {
                                    if (a4 != null) {
                                        if (a4.a == 4) {
                                            b2 = true;
                                            break Label_0206;
                                        }
                                    }
                                    b2 = false;
                                }
                                if (!b2) {
                                    b3 = true;
                                    break Label_0220;
                                }
                            }
                        }
                    }
                }
                b3 = false;
            }
            Object e;
            if (b3) {
                e = a.g;
                if (((CharSequence)e).length() != 0) {
                    if (e instanceof Spannable) {
                        e = e;
                    }
                    else {
                        e = new SpannableString((CharSequence)e);
                    }
                    pk7.v((Spannable)e, new vkd(), ((CharSequence)e).length() - 1, ((CharSequence)e).length() - 1);
                }
            }
            else {
                e = a.g;
            }
            this.e = (CharSequence)e;
            final efs a5 = a2.b.a;
            Objects.requireNonNull(efs.Companion);
            boolean b4 = false;
            Label_0360: {
                if (a5 != null) {
                    if (a5.a == 1) {
                        b4 = true;
                        break Label_0360;
                    }
                }
                b4 = false;
            }
            int n = 0;
            Label_0512: {
                if (b4) {
                    n = 3;
                }
                else {
                    boolean b5 = false;
                    Label_0395: {
                        if (a5 != null) {
                            if (a5.a == 2) {
                                b5 = true;
                                break Label_0395;
                            }
                        }
                        b5 = false;
                    }
                    if (b5) {
                        n = 4;
                    }
                    else {
                        boolean b6 = false;
                        Label_0430: {
                            if (a5 != null) {
                                if (a5.a == 3) {
                                    b6 = true;
                                    break Label_0430;
                                }
                            }
                            b6 = false;
                        }
                        if (b6) {
                            n = 2;
                        }
                        else {
                            boolean b7 = false;
                            Label_0465: {
                                if (a5 != null) {
                                    if (a5.a == 5) {
                                        b7 = true;
                                        break Label_0465;
                                    }
                                }
                                b7 = false;
                            }
                            if (!b7) {
                                boolean b8 = false;
                                Label_0498: {
                                    if (a5 != null) {
                                        if (a5.a == 6) {
                                            b8 = true;
                                            break Label_0498;
                                        }
                                    }
                                    b8 = false;
                                }
                                if (b8) {
                                    n = 1;
                                    break Label_0512;
                                }
                            }
                            n = 0;
                        }
                    }
                }
            }
            final jwj b9 = a2.b;
            final efs a6 = b9.a;
            int n2;
            if (a6 == null) {
                n2 = 0;
            }
            else {
                int n3;
                if (a6.a == 4) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                n2 = n3;
            }
            final n2d h2 = b9.h;
            Objects.requireNonNull(n2d.Companion);
            int n4;
            if (e0e.a((Object)h2, (Object)n2d.b)) {
                if (Build$VERSION.SDK_INT <= 32) {
                    n4 = 1;
                }
                else {
                    n4 = 3;
                }
            }
            else {
                e0e.a((Object)h2, (Object)n2d.a);
                n4 = 0;
            }
            final hdf g = a2.b.g;
            hdf$b hdf$b;
            if (g != null) {
                hdf$b = new hdf$b(g.a);
            }
            else {
                hdf$b = null;
            }
            Objects.requireNonNull(hdf$b.Companion);
            boolean b10 = false;
            Label_0671: {
                if (hdf$b != null) {
                    if (hdf$b.a == 1) {
                        b10 = true;
                        break Label_0671;
                    }
                }
                b10 = false;
            }
            int n5 = 0;
            Label_0752: {
                if (!b10) {
                    boolean b11 = false;
                    Label_0703: {
                        if (hdf$b != null) {
                            if (hdf$b.a == 2) {
                                b11 = true;
                                break Label_0703;
                            }
                        }
                        b11 = false;
                    }
                    if (b11) {
                        n5 = 1;
                        break Label_0752;
                    }
                    boolean b12 = false;
                    Label_0738: {
                        if (hdf$b != null) {
                            if (hdf$b.a == 3) {
                                b12 = true;
                                break Label_0738;
                            }
                        }
                        b12 = false;
                    }
                    if (b12) {
                        n5 = 2;
                        break Label_0752;
                    }
                }
                n5 = 0;
            }
            final hdf g2 = a2.b.g;
            hdf$c hdf$c;
            if (g2 != null) {
                hdf$c = new hdf$c(g2.b);
            }
            else {
                hdf$c = null;
            }
            Objects.requireNonNull(hdf$c.Companion);
            boolean b13 = false;
            Label_0813: {
                if (hdf$c != null) {
                    if (hdf$c.a == 1) {
                        b13 = true;
                        break Label_0813;
                    }
                }
                b13 = false;
            }
            int n6 = 0;
            Label_0929: {
                if (!b13) {
                    boolean b14 = false;
                    Label_0845: {
                        if (hdf$c != null) {
                            if (hdf$c.a == 2) {
                                b14 = true;
                                break Label_0845;
                            }
                        }
                        b14 = false;
                    }
                    if (b14) {
                        n6 = 1;
                        break Label_0929;
                    }
                    boolean b15 = false;
                    Label_0880: {
                        if (hdf$c != null) {
                            if (hdf$c.a == 3) {
                                b15 = true;
                                break Label_0880;
                            }
                        }
                        b15 = false;
                    }
                    if (b15) {
                        n6 = 2;
                        break Label_0929;
                    }
                    boolean b16 = false;
                    Label_0915: {
                        if (hdf$c != null) {
                            if (hdf$c.a == 4) {
                                b16 = true;
                                break Label_0915;
                            }
                        }
                        b16 = false;
                    }
                    if (b16) {
                        n6 = 3;
                        break Label_0929;
                    }
                }
                n6 = 0;
            }
            final hdf g3 = a2.b.g;
            hdf$d hdf$d;
            if (g3 != null) {
                hdf$d = new hdf$d(g3.c);
            }
            else {
                hdf$d = null;
            }
            Objects.requireNonNull(hdf$d.Companion);
            boolean b17 = false;
            Label_0990: {
                if (hdf$d != null) {
                    if (hdf$d.a == 1) {
                        b17 = true;
                        break Label_0990;
                    }
                }
                b17 = false;
            }
            int n7 = 0;
            Label_1036: {
                if (!b17) {
                    boolean b18 = false;
                    Label_1022: {
                        if (hdf$d != null) {
                            if (hdf$d.a == 2) {
                                b18 = true;
                                break Label_1022;
                            }
                        }
                        b18 = false;
                    }
                    if (b18) {
                        n7 = 1;
                        break Label_1036;
                    }
                }
                n7 = 0;
            }
            TextUtils$TruncateAt end;
            if (b) {
                end = TextUtils$TruncateAt.END;
            }
            else {
                end = null;
            }
            final njs v = this.v(n, n2, end, i, n4, n5, n6, n7);
            Label_1206: {
                if (b && v.a() > vj6.g(c) && i > 1) {
                    final int g4 = vj6.g(c);
                    while (true) {
                        int e2;
                        njs v2;
                        for (e2 = v.e, i = 0; i < e2; ++i) {
                            if (v.d(i) > g4) {
                                v2 = v;
                                if (i >= 0) {
                                    v2 = v;
                                    if (i != this.b) {
                                        if (i < 1) {
                                            i = 1;
                                        }
                                        v2 = this.v(n, n2, end, i, n4, n5, n6, n7);
                                    }
                                }
                                this.d = v2;
                                break Label_1206;
                            }
                        }
                        i = v.e;
                        continue;
                    }
                }
                this.d = v;
            }
            this.a.f.a(a2.c(), jty.g(this.getWidth(), this.getHeight()), a2.b());
            final njs d = this.d;
            urp[] array;
            if (!(d.j() instanceof Spanned)) {
                array = new urp[0];
            }
            else {
                array = (urp[])((Spanned)d.j()).getSpans(0, d.j().length(), (Class)urp.class);
                e0e.e((Object)array, "brushSpans");
                if (array.length == 0) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i != 0) {
                    array = new urp[0];
                }
            }
            int length;
            for (length = array.length, i = 0; i < length; ++i) {
                array[i].H0 = new aeq(jty.g(this.getWidth(), this.getHeight()));
            }
            final CharSequence e3 = this.e;
            Object f0;
            if (!(e3 instanceof Spanned)) {
                f0 = h3a.F0;
            }
            else {
                final Object[] spans = ((Spanned)e3).getSpans(0, e3.length(), (Class)qhk.class);
                e0e.e((Object)spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                final ArrayList list = new ArrayList<p6m>(spans.length);
                for (int length2 = spans.length, j = 0; j < length2; ++j) {
                    final qhk qhk = (qhk)spans[j];
                    final Spanned spanned = (Spanned)e3;
                    final int spanStart = spanned.getSpanStart((Object)qhk);
                    final int spanEnd = spanned.getSpanEnd((Object)qhk);
                    final int f2 = this.d.f(spanStart);
                    if (f2 >= this.b) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    final boolean b19 = this.d.d.getEllipsisCount(f2) > 0 && spanEnd > this.d.d.getEllipsisStart(f2);
                    final boolean b20 = spanEnd > this.d.e(f2);
                    p6m p6m;
                    if (!b19 && !b20 && i == 0) {
                        frm frm;
                        if (this.d.d.isRtlCharAt(spanStart)) {
                            frm = frm.G0;
                        }
                        else {
                            frm = frm.F0;
                        }
                        i = ((Enum)frm).ordinal();
                        float n8;
                        if (i != 0) {
                            if (i != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n8 = this.n(spanStart, true) - qhk.c();
                        }
                        else {
                            n8 = this.n(spanStart, true);
                        }
                        final float n9 = (float)qhk.c();
                        final njs d2 = this.d;
                        float g5 = 0.0f;
                        Label_1913: {
                            float n12 = 0.0f;
                            Label_1906: {
                                float n10 = 0.0f;
                                float n11 = 0.0f;
                                switch (qhk.K0) {
                                    default: {
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                    case 6: {
                                        final Paint$FontMetricsInt a7 = qhk.a();
                                        n10 = (float)((a7.ascent + a7.descent - qhk.b()) / 2);
                                        n11 = d2.c(f2);
                                        break;
                                    }
                                    case 5: {
                                        n12 = d2.c(f2) + qhk.a().descent;
                                        i = qhk.b();
                                        break Label_1906;
                                    }
                                    case 4: {
                                        n10 = (float)qhk.a().ascent;
                                        n11 = d2.c(f2);
                                        break;
                                    }
                                    case 3: {
                                        g5 = (d2.d(f2) + d2.g(f2) - qhk.b()) / 2;
                                        break Label_1913;
                                    }
                                    case 2: {
                                        n12 = d2.d(f2);
                                        i = qhk.b();
                                        break Label_1906;
                                    }
                                    case 1: {
                                        g5 = d2.g(f2);
                                        break Label_1913;
                                    }
                                    case 0: {
                                        n12 = d2.c(f2);
                                        i = qhk.b();
                                        break Label_1906;
                                    }
                                }
                                g5 = n11 + n10;
                                break Label_1913;
                            }
                            g5 = n12 - i;
                        }
                        p6m = new p6m(n8, g5, n9 + n8, qhk.b() + g5);
                    }
                    else {
                        p6m = null;
                    }
                    list.add(p6m);
                }
                f0 = list;
            }
            this.f = (List<p6m>)f0;
            this.g = jty.M(3, (ptb)new ptb<orx>(this) {
                public final d50 F0;
                
                public final Object invoke() {
                    final Locale textLocale = ((Paint)this.F0.a.f).getTextLocale();
                    e0e.e((Object)textLocale, "paragraphIntrinsics.textPaint.textLocale");
                    return new orx(textLocale, this.F0.d.j());
                }
            });
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
    
    public final p6m a(final int n) {
        final njs d = this.d;
        final int f = d.f(n);
        final float g = d.g(f);
        final float d2 = d.d(f);
        final boolean b = d.d.getParagraphDirection(f) == 1;
        final boolean rtlChar = d.d.isRtlCharAt(n);
        float n2 = 0.0f;
        float n3 = 0.0f;
        Label_0180: {
            if (b && !rtlChar) {
                n2 = d.h(n, false);
                n3 = d.h(n + 1, true);
            }
            else {
                float n4;
                float n5;
                if (b && rtlChar) {
                    n4 = d.i(n, false);
                    n5 = d.i(n + 1, true);
                }
                else {
                    if (!rtlChar) {
                        n2 = d.i(n, false);
                        n3 = d.i(n + 1, true);
                        break Label_0180;
                    }
                    n4 = d.h(n, false);
                    n5 = d.h(n + 1, true);
                }
                final float n6 = n4;
                n2 = n5;
                n3 = n6;
            }
        }
        final RectF rectF = new RectF(n2, g, n3, d2);
        return new p6m(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
    
    public final frm b(int f) {
        f = this.d.f(f);
        frm frm;
        if (this.d.d.getParagraphDirection(f) == 1) {
            frm = frm.F0;
        }
        else {
            frm = frm.G0;
        }
        return frm;
    }
    
    public final float c(final int n) {
        return this.d.g(n);
    }
    
    public final p6m d(int f) {
        if (f >= 0 && f <= this.e.length()) {
            final float h = this.d.h(f, false);
            f = this.d.f(f);
            return new p6m(h, this.d.g(f), h, this.d.d(f));
        }
        final StringBuilder a = snp.a("offset(", f, ") is out of bounds (0,");
        a.append(this.e.length());
        throw new AssertionError((Object)a.toString());
    }
    
    public final long e(int n) {
        final orx orx = (orx)this.g.getValue();
        final prx a = orx.a;
        a.a(n);
        int n2;
        if (orx.a.e(a.d.preceding(n))) {
            final prx a2 = orx.a;
            a2.a(n);
            int preceding = n;
            while (true) {
                n2 = preceding;
                if (preceding == -1) {
                    break;
                }
                final boolean b = a2.e(preceding) && !a2.c(preceding);
                n2 = preceding;
                if (b) {
                    break;
                }
                a2.a(preceding);
                preceding = a2.d.preceding(preceding);
            }
        }
        else {
            final prx a3 = orx.a;
            a3.a(n);
            if (a3.d(n)) {
                if (a3.d.isBoundary(n) && !a3.b(n)) {
                    n2 = n;
                }
                else {
                    n2 = a3.d.preceding(n);
                }
            }
            else if (a3.b(n)) {
                n2 = a3.d.preceding(n);
            }
            else {
                n2 = -1;
            }
        }
        int n3;
        if ((n3 = n2) == -1) {
            n3 = n;
        }
        final orx orx2 = (orx)this.g.getValue();
        final prx a4 = orx2.a;
        a4.a(n);
        int n4;
        if (orx2.a.c(a4.d.following(n))) {
            final prx a5 = orx2.a;
            a5.a(n);
            int following = n;
            while (true) {
                n4 = following;
                if (following == -1) {
                    break;
                }
                final boolean b2 = !a5.e(following) && a5.c(following);
                n4 = following;
                if (b2) {
                    break;
                }
                a5.a(following);
                following = a5.d.following(following);
            }
        }
        else {
            final prx a6 = orx2.a;
            a6.a(n);
            if (a6.b(n)) {
                if (a6.d.isBoundary(n) && !a6.d(n)) {
                    n4 = n;
                }
                else {
                    n4 = a6.d.following(n);
                }
            }
            else if (a6.d(n)) {
                n4 = a6.d.following(n);
            }
            else {
                n4 = -1;
            }
        }
        if (n4 != -1) {
            n = n4;
        }
        return p4j.f(n3, n);
    }
    
    public final float f() {
        return this.d.c(0);
    }
    
    public final int g(final long n) {
        final njs d = this.d;
        final int lineForVertical = d.d.getLineForVertical(d.f + (int)kgj.e(n));
        final njs d2 = this.d;
        return d2.d.getOffsetForHorizontal(lineForVertical, d2.b(lineForVertical) * -1 + kgj.d(n));
    }
    
    public final float getHeight() {
        return (float)this.d.a();
    }
    
    public final float getWidth() {
        return (float)vj6.h(this.c);
    }
    
    public final void h(final ah3 ah3, final long n, final vrp vrp, final xfs xfs) {
        final y60 f = this.a.f;
        f.b(n);
        f.c(vrp);
        f.d(xfs);
        this.w(ah3);
    }
    
    public final int i(final int n) {
        return this.d.d.getLineStart(n);
    }
    
    public final int j(int n, final boolean b) {
        if (b) {
            final njs d = this.d;
            if (d.d.getEllipsisStart(n) == 0) {
                n = d.d.getLineVisibleEnd(n);
            }
            else {
                n = d.d.getEllipsisStart(n) + d.d.getLineStart(n);
            }
        }
        else {
            n = this.d.e(n);
        }
        return n;
    }
    
    public final float k(final int n) {
        final njs d = this.d;
        final float lineRight = d.d.getLineRight(n);
        float i;
        if (n == d.e - 1) {
            i = d.i;
        }
        else {
            i = 0.0f;
        }
        return lineRight + i;
    }
    
    public final int l(final float n) {
        final njs d = this.d;
        return d.d.getLineForVertical(d.f + (int)n);
    }
    
    public final c0k m(final int n, final int n2) {
        int n3 = 0;
        if (n >= 0) {
            n3 = n3;
            if (n <= n2) {
                n3 = 1;
            }
        }
        if (n3 != 0 && n2 <= this.e.length()) {
            final Path path = new Path();
            final njs d = this.d;
            Objects.requireNonNull(d);
            d.d.getSelectionPath(n, n2, path);
            if (d.f != 0 && !path.isEmpty()) {
                path.offset(0.0f, (float)d.f);
            }
            return (c0k)new f50(path);
        }
        final StringBuilder g = xnf.g("Start(", n, ") or End(", n2, ") is out of Range(0..");
        g.append(this.e.length());
        g.append("), or start > end!");
        throw new AssertionError((Object)g.toString());
    }
    
    public final float n(final int n, final boolean b) {
        float n2;
        if (b) {
            n2 = this.d.h(n, false);
        }
        else {
            n2 = this.d.i(n, false);
        }
        return n2;
    }
    
    public final float o(final int n) {
        final njs d = this.d;
        final float lineLeft = d.d.getLineLeft(n);
        float h;
        if (n == d.e - 1) {
            h = d.h;
        }
        else {
            h = 0.0f;
        }
        return lineLeft + h;
    }
    
    public final float p() {
        final njs d = this.d;
        return d.c(d.e - 1);
    }
    
    public final int q(final int n) {
        return this.d.f(n);
    }
    
    public final frm r(final int n) {
        frm frm;
        if (this.d.d.isRtlCharAt(n)) {
            frm = frm.G0;
        }
        else {
            frm = frm.F0;
        }
        return frm;
    }
    
    public final float s(final int n) {
        return this.d.d(n);
    }
    
    public final List<p6m> t() {
        return this.f;
    }
    
    public final void u(final ah3 ah3, final wq2 wq2, final float n, final vrp vrp, final xfs xfs, final dcu e) {
        final y60 f = this.a.f;
        f.a(wq2, jty.g(this.getWidth(), this.getHeight()), n);
        f.c(vrp);
        f.d(xfs);
        if (e != null) {
            if (!e0e.a((Object)f.e, (Object)e)) {
                f.e = e;
                if (e0e.a((Object)e, (Object)vya.F0)) {
                    ((Paint)f).setStyle(Paint$Style.FILL);
                }
                else if (e instanceof fmr) {
                    ((Paint)f).setStyle(Paint$Style.STROKE);
                    final fmr fmr = (fmr)e;
                    ((Paint)f).setStrokeWidth(fmr.F0);
                    ((Paint)f).setStrokeMiter(fmr.G0);
                    final int i0 = fmr.I0;
                    Objects.requireNonNull(imr.Companion);
                    final int n2 = 0;
                    Paint$Join strokeJoin;
                    if (i0 == 0) {
                        strokeJoin = Paint$Join.MITER;
                    }
                    else if (i0 == 1) {
                        strokeJoin = Paint$Join.ROUND;
                    }
                    else if (i0 == 2) {
                        strokeJoin = Paint$Join.BEVEL;
                    }
                    else {
                        strokeJoin = Paint$Join.MITER;
                    }
                    ((Paint)f).setStrokeJoin(strokeJoin);
                    final int h0 = fmr.H0;
                    Objects.requireNonNull(gmr.Companion);
                    Paint$Cap strokeCap;
                    if (h0 == 0) {
                        strokeCap = Paint$Cap.BUTT;
                    }
                    else if (h0 == 1) {
                        strokeCap = Paint$Cap.ROUND;
                    }
                    else {
                        int n3 = n2;
                        if (h0 == 2) {
                            n3 = 1;
                        }
                        if (n3 != 0) {
                            strokeCap = Paint$Cap.SQUARE;
                        }
                        else {
                            strokeCap = Paint$Cap.BUTT;
                        }
                    }
                    ((Paint)f).setStrokeCap(strokeCap);
                    final f0k j0 = fmr.J0;
                    if (j0 != null) {
                        final g50 g50 = (g50)j0;
                    }
                    ((Paint)f).setPathEffect((PathEffect)null);
                }
            }
        }
        this.w(ah3);
    }
    
    public final njs v(final int n, final int n2, final TextUtils$TruncateAt textUtils$TruncateAt, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final CharSequence e = this.e;
        final float width = this.getWidth();
        final e50 a = this.a;
        final y60 f = a.f;
        final int j = a.j;
        final jwe h = a.h;
        final kks a2 = a.a;
        e0e.f((Object)a2, "<this>");
        final bjk c = a2.c;
        if (c != null) {
            final mik b = c.b;
            if (b != null) {
                final boolean a3 = b.a;
                return new njs(e, width, (TextPaint)f, n, textUtils$TruncateAt, j, a3, n3, n5, n6, n7, n4, n2, h);
            }
        }
        final boolean a3 = true;
        return new njs(e, width, (TextPaint)f, n, textUtils$TruncateAt, j, a3, n3, n5, n6, n7, n4, n2, h);
    }
    
    public final void w(final ah3 ah3) {
        final Canvas a = f20.a;
        final Canvas a2 = ((e20)ah3).a;
        if (this.d.c) {
            a2.save();
            a2.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        final njs d = this.d;
        Objects.requireNonNull(d);
        e0e.f((Object)a2, "canvas");
        final int f = d.f;
        if (f != 0) {
            a2.translate(0.0f, (float)f);
        }
        final hfs n = d.n;
        Objects.requireNonNull(n);
        n.a = a2;
        d.d.draw((Canvas)d.n);
        final int f2 = d.f;
        if (f2 != 0) {
            a2.translate(0.0f, -1 * (float)f2);
        }
        if (this.d.c) {
            a2.restore();
        }
    }
}

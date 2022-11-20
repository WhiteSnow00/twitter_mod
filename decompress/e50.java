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

public final class e50 implements qvj
{
    public final f50 a;
    public final int b;
    public final long c;
    public final vis d;
    public final CharSequence e;
    public final List<c6m> f;
    public final qwe g;
    
    public e50(final f50 a, int i, final boolean b, final long c) {
        this.a = a;
        this.b = i;
        this.c = c;
        if (pi6.i(c) != 0 || pi6.j(c) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            final sjs a2 = a.a;
            boolean b3 = false;
            Label_0220: {
                if (b && !xjs.a(a2.a.h, fli.b0(0))) {
                    final long h = a2.a.h;
                    Objects.requireNonNull(xjs.Companion);
                    if (!xjs.a(h, xjs.c)) {
                        final mes a3 = a2.b.a;
                        if (a3 != null) {
                            Objects.requireNonNull(mes.Companion);
                            if (a3.a != 5) {
                                final mes a4 = a2.b.a;
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
                    yvl.R((Spannable)e, (Object)new ujd(), ((CharSequence)e).length() - 1, ((CharSequence)e).length() - 1);
                }
            }
            else {
                e = a.g;
            }
            this.e = (CharSequence)e;
            final mes a5 = a2.b.a;
            Objects.requireNonNull(mes.Companion);
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
            final uvj b9 = a2.b;
            final mes a6 = b9.a;
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
            final n1d h2 = b9.h;
            Objects.requireNonNull(n1d.Companion);
            int n4;
            if (czd.a((Object)h2, (Object)n1d.b)) {
                if (Build$VERSION.SDK_INT <= 32) {
                    n4 = 1;
                }
                else {
                    n4 = 3;
                }
            }
            else {
                czd.a((Object)h2, (Object)n1d.a);
                n4 = 0;
            }
            final kcf g = a2.b.g;
            kcf$b kcf$b;
            if (g != null) {
                kcf$b = new kcf$b(g.a);
            }
            else {
                kcf$b = null;
            }
            Objects.requireNonNull(kcf$b.Companion);
            boolean b10 = false;
            Label_0671: {
                if (kcf$b != null) {
                    if (kcf$b.a == 1) {
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
                        if (kcf$b != null) {
                            if (kcf$b.a == 2) {
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
                        if (kcf$b != null) {
                            if (kcf$b.a == 3) {
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
            final kcf g2 = a2.b.g;
            kcf$c kcf$c;
            if (g2 != null) {
                kcf$c = new kcf$c(g2.b);
            }
            else {
                kcf$c = null;
            }
            Objects.requireNonNull(kcf$c.Companion);
            boolean b13 = false;
            Label_0813: {
                if (kcf$c != null) {
                    if (kcf$c.a == 1) {
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
                        if (kcf$c != null) {
                            if (kcf$c.a == 2) {
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
                        if (kcf$c != null) {
                            if (kcf$c.a == 3) {
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
                        if (kcf$c != null) {
                            if (kcf$c.a == 4) {
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
            final kcf g3 = a2.b.g;
            kcf$d kcf$d;
            if (g3 != null) {
                kcf$d = new kcf$d(g3.c);
            }
            else {
                kcf$d = null;
            }
            Objects.requireNonNull(kcf$d.Companion);
            boolean b17 = false;
            Label_0990: {
                if (kcf$d != null) {
                    if (kcf$d.a == 1) {
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
                        if (kcf$d != null) {
                            if (kcf$d.a == 2) {
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
            final vis v = this.v(n, n2, end, i, n4, n5, n6, n7);
            Label_1206: {
                if (b && v.a() > pi6.g(c) && i > 1) {
                    final int g4 = pi6.g(c);
                    while (true) {
                        int e2;
                        vis v2;
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
            this.a.f.a(a2.c(), oj7.d(this.getWidth(), this.getHeight()), a2.b());
            final vis d = this.d;
            zqp[] array;
            if (!(d.j() instanceof Spanned)) {
                array = new zqp[0];
            }
            else {
                array = (zqp[])((Spanned)d.j()).getSpans(0, d.j().length(), (Class)zqp.class);
                czd.e((Object)array, "brushSpans");
                if (array.length == 0) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i != 0) {
                    array = new zqp[0];
                }
            }
            int length;
            for (length = array.length, i = 0; i < length; ++i) {
                array[i].F0 = new ddq(oj7.d(this.getWidth(), this.getHeight()));
            }
            final CharSequence e3 = this.e;
            Object d2;
            if (!(e3 instanceof Spanned)) {
                d2 = f2a.D0;
            }
            else {
                final Object[] spans = ((Spanned)e3).getSpans(0, e3.length(), (Class)chk.class);
                czd.e((Object)spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                final ArrayList list = new ArrayList<c6m>(spans.length);
                for (int length2 = spans.length, j = 0; j < length2; ++j) {
                    final chk chk = (chk)spans[j];
                    final Spanned spanned = (Spanned)e3;
                    final int spanStart = spanned.getSpanStart((Object)chk);
                    final int spanEnd = spanned.getSpanEnd((Object)chk);
                    final int f = this.d.f(spanStart);
                    if (f >= this.b) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    final boolean b19 = this.d.d.getEllipsisCount(f) > 0 && spanEnd > this.d.d.getEllipsisStart(f);
                    final boolean b20 = spanEnd > this.d.e(f);
                    c6m c6m;
                    if (!b19 && !b20 && i == 0) {
                        rqm rqm;
                        if (this.d.d.isRtlCharAt(spanStart)) {
                            rqm = rqm.E0;
                        }
                        else {
                            rqm = rqm.D0;
                        }
                        i = ((Enum)rqm).ordinal();
                        float n8;
                        if (i != 0) {
                            if (i != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n8 = this.n(spanStart, true) - chk.c();
                        }
                        else {
                            n8 = this.n(spanStart, true);
                        }
                        final float n9 = (float)chk.c();
                        final vis d3 = this.d;
                        float g5 = 0.0f;
                        Label_1913: {
                            float n12 = 0.0f;
                            Label_1906: {
                                float n10 = 0.0f;
                                float n11 = 0.0f;
                                switch (chk.I0) {
                                    default: {
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                    case 6: {
                                        final Paint$FontMetricsInt a7 = chk.a();
                                        n10 = (float)((a7.ascent + a7.descent - chk.b()) / 2);
                                        n11 = d3.c(f);
                                        break;
                                    }
                                    case 5: {
                                        n12 = d3.c(f) + chk.a().descent;
                                        i = chk.b();
                                        break Label_1906;
                                    }
                                    case 4: {
                                        n10 = (float)chk.a().ascent;
                                        n11 = d3.c(f);
                                        break;
                                    }
                                    case 3: {
                                        g5 = (d3.d(f) + d3.g(f) - chk.b()) / 2;
                                        break Label_1913;
                                    }
                                    case 2: {
                                        n12 = d3.d(f);
                                        i = chk.b();
                                        break Label_1906;
                                    }
                                    case 1: {
                                        g5 = d3.g(f);
                                        break Label_1913;
                                    }
                                    case 0: {
                                        n12 = d3.c(f);
                                        i = chk.b();
                                        break Label_1906;
                                    }
                                }
                                g5 = n11 + n10;
                                break Label_1913;
                            }
                            g5 = n12 - i;
                        }
                        c6m = new c6m(n8, g5, n9 + n8, chk.b() + g5);
                    }
                    else {
                        c6m = null;
                    }
                    list.add(c6m);
                }
                d2 = list;
            }
            this.f = (List<c6m>)d2;
            this.g = pps.m(3, (nsb)new e50$a(this));
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
    
    public final c6m a(final int n) {
        final vis d = this.d;
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
                final float n6 = n5;
                n3 = n4;
                n2 = n6;
            }
        }
        final RectF rectF = new RectF(n2, g, n3, d2);
        return new c6m(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
    
    public final rqm b(int f) {
        f = this.d.f(f);
        rqm rqm;
        if (this.d.d.getParagraphDirection(f) == 1) {
            rqm = rqm.D0;
        }
        else {
            rqm = rqm.E0;
        }
        return rqm;
    }
    
    public final float c(final int n) {
        return this.d.g(n);
    }
    
    public final c6m d(int f) {
        if (f >= 0 && f <= this.e.length()) {
            final float h = this.d.h(f, false);
            f = this.d.f(f);
            return new c6m(h, this.d.g(f), h, this.d.d(f));
        }
        final StringBuilder l = da8.l("offset(", f, ") is out of bounds (0,");
        l.append(this.e.length());
        throw new AssertionError((Object)l.toString());
    }
    
    public final long e(int n) {
        final xqx xqx = (xqx)this.g.getValue();
        final yqx a = xqx.a;
        a.a(n);
        int n2;
        if (xqx.a.e(a.d.preceding(n))) {
            final yqx a2 = xqx.a;
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
            final yqx a3 = xqx.a;
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
        final xqx xqx2 = (xqx)this.g.getValue();
        final yqx a4 = xqx2.a;
        a4.a(n);
        int n4;
        if (xqx2.a.c(a4.d.following(n))) {
            final yqx a5 = xqx2.a;
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
            final yqx a6 = xqx2.a;
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
        return c9y.h(n3, n);
    }
    
    public final float f() {
        return this.d.c(0);
    }
    
    public final int g(final long n) {
        final vis d = this.d;
        final int lineForVertical = d.d.getLineForVertical(d.f + (int)wfj.e(n));
        final vis d2 = this.d;
        return d2.d.getOffsetForHorizontal(lineForVertical, d2.b(lineForVertical) * -1 + wfj.d(n));
    }
    
    public final float getHeight() {
        return (float)this.d.a();
    }
    
    public final float getWidth() {
        return (float)pi6.h(this.c);
    }
    
    public final void h(final ag3 ag3, final long n, final arp arp, final ffs ffs) {
        final z60 f = this.a.f;
        f.b(n);
        f.c(arp);
        f.d(ffs);
        this.w(ag3);
    }
    
    public final int i(final int n) {
        return this.d.d.getLineStart(n);
    }
    
    public final int j(int n, final boolean b) {
        if (b) {
            final vis d = this.d;
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
        final vis d = this.d;
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
        final vis d = this.d;
        return d.d.getLineForVertical(d.f + (int)n);
    }
    
    public final lzj m(final int n, final int n2) {
        int n3 = 0;
        if (n >= 0) {
            n3 = n3;
            if (n <= n2) {
                n3 = 1;
            }
        }
        if (n3 != 0 && n2 <= this.e.length()) {
            final Path path = new Path();
            final vis d = this.d;
            Objects.requireNonNull(d);
            d.d.getSelectionPath(n, n2, path);
            if (d.f != 0 && !path.isEmpty()) {
                path.offset(0.0f, (float)d.f);
            }
            return (lzj)new g50(path);
        }
        final StringBuilder f = shc.f("Start(", n, ") or End(", n2, ") is out of Range(0..");
        f.append(this.e.length());
        f.append("), or start > end!");
        throw new AssertionError((Object)f.toString());
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
        final vis d = this.d;
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
        final vis d = this.d;
        return d.c(d.e - 1);
    }
    
    public final int q(final int n) {
        return this.d.f(n);
    }
    
    public final rqm r(final int n) {
        rqm rqm;
        if (this.d.d.isRtlCharAt(n)) {
            rqm = rqm.E0;
        }
        else {
            rqm = rqm.D0;
        }
        return rqm;
    }
    
    public final float s(final int n) {
        return this.d.d(n);
    }
    
    public final List<c6m> t() {
        return this.f;
    }
    
    public final void u(final ag3 ag3, final fq2 fq2, final float n, final arp arp, final ffs ffs, final nbu e) {
        final z60 f = this.a.f;
        f.a(fq2, oj7.d(this.getWidth(), this.getHeight()), n);
        f.c(arp);
        f.d(ffs);
        if (e != null) {
            if (!czd.a((Object)f.e, (Object)e)) {
                f.e = e;
                if (czd.a((Object)e, (Object)sxa.D0)) {
                    ((Paint)f).setStyle(Paint$Style.FILL);
                }
                else if (e instanceof ilr) {
                    ((Paint)f).setStyle(Paint$Style.STROKE);
                    final ilr ilr = (ilr)e;
                    ((Paint)f).setStrokeWidth(ilr.D0);
                    ((Paint)f).setStrokeMiter(ilr.E0);
                    final int g0 = ilr.G0;
                    Objects.requireNonNull(llr.Companion);
                    final int n2 = 0;
                    Paint$Join strokeJoin;
                    if (g0 == 0) {
                        strokeJoin = Paint$Join.MITER;
                    }
                    else if (g0 == 1) {
                        strokeJoin = Paint$Join.ROUND;
                    }
                    else if (g0 == 2) {
                        strokeJoin = Paint$Join.BEVEL;
                    }
                    else {
                        strokeJoin = Paint$Join.MITER;
                    }
                    ((Paint)f).setStrokeJoin(strokeJoin);
                    final int f2 = ilr.F0;
                    Objects.requireNonNull(jlr.Companion);
                    Paint$Cap strokeCap;
                    if (f2 == 0) {
                        strokeCap = Paint$Cap.BUTT;
                    }
                    else if (f2 == 1) {
                        strokeCap = Paint$Cap.ROUND;
                    }
                    else {
                        int n3 = n2;
                        if (f2 == 2) {
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
                    final ozj h0 = ilr.H0;
                    if (h0 != null) {
                        final h50 h2 = (h50)h0;
                    }
                    ((Paint)f).setPathEffect((PathEffect)null);
                }
            }
        }
        this.w(ag3);
    }
    
    public final vis v(final int n, final int n2, final TextUtils$TruncateAt textUtils$TruncateAt, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final CharSequence e = this.e;
        final float width = this.getWidth();
        final f50 a = this.a;
        final z60 f = a.f;
        final int j = a.j;
        final mve h = a.h;
        final sjs a2 = a.a;
        czd.f((Object)a2, "<this>");
        final lik c = a2.c;
        if (c != null) {
            final xhk b = c.b;
            if (b != null) {
                final boolean a3 = b.a;
                return new vis(e, width, (TextPaint)f, n, textUtils$TruncateAt, j, a3, n3, n5, n6, n7, n4, n2, h);
            }
        }
        final boolean a3 = true;
        return new vis(e, width, (TextPaint)f, n, textUtils$TruncateAt, j, a3, n3, n5, n6, n7, n4, n2, h);
    }
    
    public final void w(final ag3 ag3) {
        final Canvas a = f20.a;
        final Canvas a2 = ((e20)ag3).a;
        if (this.d.c) {
            a2.save();
            a2.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        final vis d = this.d;
        Objects.requireNonNull(d);
        czd.f((Object)a2, "canvas");
        final int f = d.f;
        if (f != 0) {
            a2.translate(0.0f, (float)f);
        }
        final pes n = d.n;
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

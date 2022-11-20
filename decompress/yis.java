import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yis
{
    public final wis a;
    public final nsh b;
    public final long c;
    public final float d;
    public final float e;
    public final List<c6m> f;
    
    public yis(final wis a, final nsh b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final boolean empty = b.h.isEmpty();
        final float n = 0.0f;
        float f;
        if (empty) {
            f = 0.0f;
        }
        else {
            f = b.h.get(0).a.f();
        }
        this.d = f;
        float e;
        if (b.h.isEmpty()) {
            e = n;
        }
        else {
            final rvj rvj = (rvj)mq4.o0((List)b.h);
            e = rvj.a.p() + rvj.f;
        }
        this.e = e;
        this.f = b.g;
    }
    
    public final rqm a(final int n) {
        final nsh b = this.b;
        b.d(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.t((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        return rvj.a.r(rvj.b(n));
    }
    
    public final c6m b(final int n) {
        final nsh b = this.b;
        Objects.requireNonNull(b);
        if (n >= 0 && n < b.a.a.D0.length()) {
            final rvj rvj = b.h.get(g63.t((List)b.h, n));
            return rvj.a(rvj.a.a(rvj.b(n)));
        }
        final StringBuilder l = da8.l("offset(", n, ") is out of bounds [0, ");
        l.append(b.a.a.length());
        l.append(')');
        throw new IllegalArgumentException(l.toString().toString());
    }
    
    public final c6m c(final int n) {
        final nsh b = this.b;
        b.d(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.t((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        return rvj.a(rvj.a.d(rvj.b(n)));
    }
    
    public final float d(final int n) {
        final nsh b = this.b;
        b.e(n);
        final rvj rvj = b.h.get(g63.u((List)b.h, n));
        return rvj.a.s(n - rvj.d) + rvj.f;
    }
    
    public final int e(final int n, final boolean b) {
        final nsh b2 = this.b;
        b2.e(n);
        final rvj rvj = b2.h.get(g63.u((List)b2.h, n));
        return rvj.a.j(n - rvj.d, b) + rvj.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yis)) {
            return false;
        }
        final wis a = this.a;
        final yis yis = (yis)o;
        return czd.a((Object)a, (Object)yis.a) && czd.a((Object)this.b, (Object)yis.b) && ltd.a(this.c, yis.c) && this.d == yis.d && this.e == yis.e && czd.a((Object)this.f, (Object)yis.f);
    }
    
    public final int f(final int n) {
        final nsh b = this.b;
        int n2;
        if (n >= b.a.a.length()) {
            n2 = s9i.o(b.h);
        }
        else if (n < 0) {
            n2 = 0;
        }
        else {
            n2 = g63.t((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        return rvj.a.q(rvj.b(n)) + rvj.d;
    }
    
    public final int g(final float n) {
        final nsh b = this.b;
        int n2;
        if (n <= 0.0f) {
            n2 = 0;
        }
        else if (n >= b.e) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.v((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        final int c = rvj.c;
        final int b2 = rvj.b;
        int max;
        if (c - b2 == 0) {
            max = Math.max(0, b2 - 1);
        }
        else {
            max = rvj.a.l(n - rvj.f) + rvj.d;
        }
        return max;
    }
    
    public final float h(final int n) {
        final nsh b = this.b;
        b.e(n);
        final rvj rvj = b.h.get(g63.u((List)b.h, n));
        return rvj.a.o(n - rvj.d);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + c0.g(this.e, c0.g(this.d, (ltd.c(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31, 31), 31);
    }
    
    public final float i(final int n) {
        final nsh b = this.b;
        b.e(n);
        final rvj rvj = b.h.get(g63.u((List)b.h, n));
        return rvj.a.k(n - rvj.d);
    }
    
    public final int j(final int n) {
        final nsh b = this.b;
        b.e(n);
        final rvj rvj = b.h.get(g63.u((List)b.h, n));
        return rvj.a.i(n - rvj.d) + rvj.b;
    }
    
    public final float k(final int n) {
        final nsh b = this.b;
        b.e(n);
        final rvj rvj = b.h.get(g63.u((List)b.h, n));
        return rvj.a.c(n - rvj.d) + rvj.f;
    }
    
    public final int l(final long n) {
        final nsh b = this.b;
        Objects.requireNonNull(b);
        int n2;
        if (wfj.e(n) <= 0.0f) {
            n2 = 0;
        }
        else if (wfj.e(n) >= b.e) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.v((List)b.h, wfj.e(n));
        }
        final rvj rvj = b.h.get(n2);
        final int c = rvj.c;
        final int b2 = rvj.b;
        int max;
        if (c - b2 == 0) {
            max = Math.max(0, b2 - 1);
        }
        else {
            max = rvj.a.g(wj1.a(wfj.d(n), wfj.e(n) - rvj.f)) + rvj.b;
        }
        return max;
    }
    
    public final rqm m(final int n) {
        final nsh b = this.b;
        b.d(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.t((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        return rvj.a.b(rvj.b(n));
    }
    
    public final long n(final int n) {
        final nsh b = this.b;
        b.d(n);
        int n2;
        if (n == b.a.a.length()) {
            n2 = s9i.o(b.h);
        }
        else {
            n2 = g63.t((List)b.h, n);
        }
        final rvj rvj = b.h.get(n2);
        final long e = rvj.a.e(rvj.b(n));
        final hjs$a companion = hjs.Companion;
        return c9y.h((int)(e >> 32) + rvj.b, hjs.d(e) + rvj.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("TextLayoutResult(layoutInput=");
        j.append(this.a);
        j.append(", multiParagraph=");
        j.append(this.b);
        j.append(", size=");
        j.append((Object)ltd.d(this.c));
        j.append(", firstBaseline=");
        j.append(this.d);
        j.append(", lastBaseline=");
        j.append(this.e);
        j.append(", placeholderRects=");
        j.append(this.f);
        j.append(')');
        return j.toString();
    }
}

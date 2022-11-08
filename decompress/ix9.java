// 
// Decompiled by Procyon v0.6.0
// 

public final class ix9
{
    public static final a Companion;
    public final ywj a;
    public int b;
    public int c;
    public int d;
    public int e;
    
    static {
        Companion = new a();
    }
    
    public ix9(final bd0 bd0, final long n) {
        this.a = new ywj(bd0.C0);
        this.b = mis.g(n);
        this.c = mis.f(n);
        this.d = -1;
        this.e = -1;
        final int g = mis.g(n);
        final int f = mis.f(n);
        if (g < 0 || g > bd0.length()) {
            final StringBuilder j = lwe.j("start (", g, ") offset is outside of text region ");
            j.append(bd0.length());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (f < 0 || f > bd0.length()) {
            final StringBuilder i = lwe.j("end (", f, ") offset is outside of text region ");
            i.append(bd0.length());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (g <= f) {
            return;
        }
        throw new IllegalArgumentException(hi.H("Do not set reversed range: ", g, " > ", f));
    }
    
    public final void a() {
        this.d = -1;
        this.e = -1;
    }
    
    public final void b(final int n, final int n2) {
        final long f = h6q.f(n, n2);
        this.a.b(n, n2, "");
        final long e0 = oyz.e0(h6q.f(this.b, this.c), f);
        this.k(mis.g(e0));
        this.j(mis.f(e0));
        if (this.f()) {
            final long e2 = oyz.e0(h6q.f(this.d, this.e), f);
            if (mis.c(e2)) {
                this.a();
            }
            else {
                this.d = mis.g(e2);
                this.e = mis.f(e2);
            }
        }
    }
    
    public final char c(int n) {
        final ywj a = this.a;
        final fyb b = a.b;
        char c;
        if (b == null) {
            n = (c = a.a.charAt(n));
        }
        else if (n < a.c) {
            n = (c = a.a.charAt(n));
        }
        else {
            final int a2 = b.a();
            final int c2 = a.c;
            if (n < a2 + c2) {
                n -= c2;
                final int c3 = b.c;
                if (n < c3) {
                    n = (c = b.b[n]);
                }
                else {
                    n = (c = b.b[n - c3 + b.d]);
                }
            }
            else {
                n = (c = a.a.charAt(n - (a2 - a.d + c2)));
            }
        }
        return c;
    }
    
    public final mis d() {
        mis mis;
        if (this.f()) {
            mis = new mis(h6q.f(this.d, this.e));
        }
        else {
            mis = null;
        }
        return mis;
    }
    
    public final int e() {
        return this.a.a();
    }
    
    public final boolean f() {
        return this.d != -1;
    }
    
    public final void g(final int n, final int n2, final String s) {
        zzd.f((Object)s, "text");
        if (n < 0 || n > this.a.a()) {
            final StringBuilder j = lwe.j("start (", n, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (n2 < 0 || n2 > this.a.a()) {
            final StringBuilder i = lwe.j("end (", n2, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (n <= n2) {
            this.a.b(n, n2, s);
            this.k(s.length() + n);
            this.j(s.length() + n);
            this.d = -1;
            this.e = -1;
            return;
        }
        throw new IllegalArgumentException(hi.H("Do not set reversed range: ", n, " > ", n2));
    }
    
    public final void h(final int d, final int e) {
        if (d < 0 || d > this.a.a()) {
            final StringBuilder j = lwe.j("start (", d, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (e < 0 || e > this.a.a()) {
            final StringBuilder i = lwe.j("end (", e, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (d < e) {
            this.d = d;
            this.e = e;
            return;
        }
        throw new IllegalArgumentException(hi.H("Do not set reversed or empty range: ", d, " > ", e));
    }
    
    public final void i(final int n, final int n2) {
        if (n < 0 || n > this.a.a()) {
            final StringBuilder j = lwe.j("start (", n, ") offset is outside of text region ");
            j.append(this.a.a());
            throw new IndexOutOfBoundsException(j.toString());
        }
        if (n2 < 0 || n2 > this.a.a()) {
            final StringBuilder i = lwe.j("end (", n2, ") offset is outside of text region ");
            i.append(this.a.a());
            throw new IndexOutOfBoundsException(i.toString());
        }
        if (n <= n2) {
            this.k(n);
            this.j(n2);
            return;
        }
        throw new IllegalArgumentException(hi.H("Do not set reversed range: ", n, " > ", n2));
    }
    
    public final void j(final int c) {
        if (c >= 0) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException(yk.y("Cannot set selectionEnd to a negative value: ", c).toString());
    }
    
    public final void k(final int b) {
        if (b >= 0) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(yk.y("Cannot set selectionStart to a negative value: ", b).toString());
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public static final class a
    {
    }
}

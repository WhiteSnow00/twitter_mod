import com.apollographql.apollo3.exception.JsonDataException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lr2 implements qle
{
    public static final lr2.lr2$a Companion;
    public static final String[] J0;
    public final kr2 C0;
    public final String D0;
    public int E0;
    public final int[] F0;
    public final String[] G0;
    public final int[] H0;
    public String I0;
    
    static {
        Companion = new lr2.lr2$a();
        final String[] j0 = new String[128];
        for (int i = 0; i < 32; ++i) {
            final StringBuilder g = w48.g("\\u00");
            final lr2.lr2$a companion = lr2.Companion;
            final byte b = (byte)i;
            Objects.requireNonNull(companion);
            final StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 0xF));
            g.append(sb.toString());
            j0[i] = g.toString();
        }
        j0[34] = "\\\"";
        j0[92] = "\\\\";
        j0[9] = "\\t";
        j0[8] = "\\b";
        j0[10] = "\\n";
        j0[13] = "\\r";
        J0 = j0;
    }
    
    public lr2(final kr2 c0) {
        this.C0 = c0;
        this.D0 = null;
        this.F0 = new int[256];
        this.G0 = new String[256];
        this.H0 = new int[256];
        this.h(6);
    }
    
    public final qle A1(final String i0) {
        final int e0 = this.E0;
        final int n = 0;
        if (e0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        int n2 = n;
        if (this.I0 == null) {
            n2 = 1;
        }
        if (n2 != 0) {
            this.I0 = i0;
            this.G0[e0 - 1] = i0;
            return (qle)this;
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }
    
    public final qle G() {
        this.j();
        this.e(3, "{");
        return (qle)this;
    }
    
    public final qle I() {
        this.b(1, 2, "]");
        return (qle)this;
    }
    
    public final qle J() {
        this.j();
        this.e(1, "[");
        return (qle)this;
    }
    
    public final qle J0(final boolean b) {
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        this.c(s);
        return (qle)this;
    }
    
    public final qle Q() {
        this.b(3, 5, "}");
        return (qle)this;
    }
    
    public final void a() {
        final int f = this.f();
        final boolean b = true;
        if (f != 1) {
            if (f != 2) {
                if (f != 4) {
                    if (f != 6) {
                        if (f == 7) {
                            throw new IllegalStateException("JSON must have only one top-level value.".toString());
                        }
                        throw new IllegalStateException("Nesting problem.");
                    }
                    else {
                        this.i(7);
                    }
                }
                else {
                    final kr2 c0 = this.C0;
                    final String d0 = this.D0;
                    int n = b ? 1 : 0;
                    if (d0 != null) {
                        if (d0.length() == 0) {
                            n = (b ? 1 : 0);
                        }
                        else {
                            n = 0;
                        }
                    }
                    String s;
                    if (n != 0) {
                        s = ":";
                    }
                    else {
                        s = ": ";
                    }
                    c0.P0(s);
                    this.i(5);
                }
            }
            else {
                this.C0.l2(44);
                this.d();
            }
        }
        else {
            this.i(2);
            this.d();
        }
    }
    
    public final qle b(int e0, final int n, final String s) {
        final int f = this.f();
        final int n2 = 0;
        if (f != n && f != e0) {
            e0 = 0;
        }
        else {
            e0 = 1;
        }
        if (e0 == 0) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        e0 = n2;
        if (this.I0 == null) {
            e0 = 1;
        }
        if (e0 != 0) {
            e0 = this.E0 - 1;
            this.E0 = e0;
            this.G0[e0] = null;
            final int[] h0 = this.H0;
            --e0;
            ++h0[e0];
            if (f == n) {
                this.d();
            }
            this.C0.P0(s);
            return (qle)this;
        }
        final StringBuilder g = w48.g("Dangling name: ");
        g.append(this.I0);
        throw new IllegalStateException(g.toString().toString());
    }
    
    public final qle c(final String s) {
        zzd.f((Object)s, "value");
        this.j();
        this.a();
        this.C0.P0(s);
        final int[] h0 = this.H0;
        final int n = this.E0 - 1;
        ++h0[n];
        return (qle)this;
    }
    
    public final qle c2(final bhe bhe) {
        zzd.f((Object)bhe, "value");
        this.c(bhe.a);
        return (qle)this;
    }
    
    public final void close() {
        ((lcq)this.C0).close();
        final int e0 = this.E0;
        if (e0 <= 1 && (e0 != 1 || this.F0[e0 - 1] == 7)) {
            this.E0 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    public final void d() {
        if (this.D0 == null) {
            return;
        }
        this.C0.l2(10);
        for (int e0 = this.E0, i = 1; i < e0; ++i) {
            this.C0.P0(this.D0);
        }
    }
    
    public final qle d0(final r3w r3w) {
        zzd.f((Object)r3w, "value");
        this.u3();
        return (qle)this;
    }
    
    public final qle e(final int n, final String s) {
        this.a();
        this.h(n);
        this.H0[this.E0 - 1] = 0;
        this.C0.P0(s);
        return (qle)this;
    }
    
    public final qle e0(final long n) {
        this.c(String.valueOf(n));
        return (qle)this;
    }
    
    public final int f() {
        final int e0 = this.E0;
        if (e0 != 0) {
            return this.F0[e0 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }
    
    public final qle f0(final int n) {
        this.c(String.valueOf(n));
        return (qle)this;
    }
    
    public final void h(int i) {
        final int e0 = this.E0;
        final int[] f0 = this.F0;
        if (e0 == f0.length) {
            final StringBuilder g = w48.g("Nesting too deep at ");
            final int e2 = this.E0;
            final int[] f2 = this.F0;
            final String[] g2 = this.G0;
            final int[] h0 = this.H0;
            zzd.f((Object)f2, "stack");
            zzd.f((Object)g2, "pathNames");
            zzd.f((Object)h0, "pathIndices");
            final ArrayList list = new ArrayList();
            int n;
            String s;
            for (i = 0; i < e2; ++i) {
                n = f2[i];
                if (n != 1 && n != 2) {
                    if (n == 3 || n == 4 || n == 5) {
                        s = g2[i];
                        if (s != null) {
                            list.add(s);
                        }
                    }
                }
                else {
                    list.add(h0[i]);
                }
            }
            throw new JsonDataException(hi.I(g, or4.M1((Iterable)list, (CharSequence)".", (CharSequence)null, (CharSequence)null, (rtb)null, 62), ": circular reference?"));
        }
        this.E0 = e0 + 1;
        f0[e0] = i;
    }
    
    public final void i(final int n) {
        this.F0[this.E0 - 1] = n;
    }
    
    public final qle i2(final String s) {
        zzd.f((Object)s, "value");
        this.j();
        this.a();
        lr2.Companion.a(this.C0, s);
        final int[] h0 = this.H0;
        final int n = this.E0 - 1;
        ++h0[n];
        return (qle)this;
    }
    
    public final void j() {
        if (this.I0 != null) {
            final int f = this.f();
            if (f == 5) {
                this.C0.l2(44);
            }
            else if (f != 3) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
            this.d();
            this.i(4);
            final lr2.lr2$a companion = lr2.Companion;
            final kr2 c0 = this.C0;
            final String i0 = this.I0;
            zzd.c((Object)i0);
            companion.a(c0, i0);
            this.I0 = null;
        }
    }
    
    public final qle k0(final double n) {
        if (!Double.isNaN(n) && !Double.isInfinite(n)) {
            this.c(String.valueOf(n));
            return (qle)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final qle u3() {
        this.c("null");
        return (qle)this;
    }
}

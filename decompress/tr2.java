import com.apollographql.apollo3.exception.JsonDataException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tr2 implements yle
{
    public static final tr2.tr2$a Companion;
    public static final String[] M0;
    public final sr2 F0;
    public final String G0;
    public int H0;
    public final int[] I0;
    public final String[] J0;
    public final int[] K0;
    public String L0;
    
    static {
        Companion = new tr2.tr2$a();
        final String[] m0 = new String[128];
        for (int i = 0; i < 32; ++i) {
            final StringBuilder f = ehk.f("\\u00");
            final tr2.tr2$a companion = tr2.Companion;
            final byte b = (byte)i;
            Objects.requireNonNull(companion);
            final StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 0xF));
            f.append(sb.toString());
            m0[i] = f.toString();
        }
        m0[34] = "\\\"";
        m0[92] = "\\\\";
        m0[9] = "\\t";
        m0[8] = "\\b";
        m0[10] = "\\n";
        m0[13] = "\\r";
        M0 = m0;
    }
    
    public tr2(final sr2 f0) {
        this.F0 = f0;
        this.G0 = null;
        this.I0 = new int[256];
        this.J0 = new String[256];
        this.K0 = new int[256];
        this.h(6);
    }
    
    public final yle A1(final String l0) {
        final int h0 = this.H0;
        final int n = 0;
        if (h0 == 0) {
            throw new IllegalStateException("JsonWriter is closed.".toString());
        }
        int n2 = n;
        if (this.L0 == null) {
            n2 = 1;
        }
        if (n2 != 0) {
            this.L0 = l0;
            this.J0[h0 - 1] = l0;
            return (yle)this;
        }
        throw new IllegalStateException("Nesting problem.".toString());
    }
    
    public final yle G() {
        this.j();
        this.e(3, "{");
        return (yle)this;
    }
    
    public final yle I() {
        this.b(1, 2, "]");
        return (yle)this;
    }
    
    public final yle J() {
        this.j();
        this.e(1, "[");
        return (yle)this;
    }
    
    public final yle J0(final boolean b) {
        String s;
        if (b) {
            s = "true";
        }
        else {
            s = "false";
        }
        this.c(s);
        return (yle)this;
    }
    
    public final yle Q() {
        this.b(3, 5, "}");
        return (yle)this;
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
                    final sr2 f2 = this.F0;
                    final String g0 = this.G0;
                    int n = b ? 1 : 0;
                    if (g0 != null) {
                        if (g0.length() == 0) {
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
                    f2.P0(s);
                    this.i(5);
                }
            }
            else {
                this.F0.l2(44);
                this.d();
            }
        }
        else {
            this.i(2);
            this.d();
        }
    }
    
    public final yle b(int h0, final int n, final String s) {
        final int f = this.f();
        final int n2 = 0;
        if (f != n && f != h0) {
            h0 = 0;
        }
        else {
            h0 = 1;
        }
        if (h0 == 0) {
            throw new IllegalStateException("Nesting problem.".toString());
        }
        h0 = n2;
        if (this.L0 == null) {
            h0 = 1;
        }
        if (h0 != 0) {
            h0 = this.H0 - 1;
            this.H0 = h0;
            this.J0[h0] = null;
            final int[] k0 = this.K0;
            --h0;
            ++k0[h0];
            if (f == n) {
                this.d();
            }
            this.F0.P0(s);
            return (yle)this;
        }
        final StringBuilder f2 = ehk.f("Dangling name: ");
        f2.append(this.L0);
        throw new IllegalStateException(f2.toString().toString());
    }
    
    public final yle c(final String s) {
        e0e.f((Object)s, "value");
        this.j();
        this.a();
        this.F0.P0(s);
        final int[] k0 = this.K0;
        final int n = this.H0 - 1;
        ++k0[n];
        return (yle)this;
    }
    
    public final yle c2(final hhe hhe) {
        e0e.f((Object)hhe, "value");
        this.c(hhe.a);
        return (yle)this;
    }
    
    public final void close() {
        ((zdq)this.F0).close();
        final int h0 = this.H0;
        if (h0 <= 1 && (h0 != 1 || this.I0[h0 - 1] == 7)) {
            this.H0 = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }
    
    public final void d() {
        if (this.G0 == null) {
            return;
        }
        this.F0.l2(10);
        for (int h0 = this.H0, i = 1; i < h0; ++i) {
            this.F0.P0(this.G0);
        }
    }
    
    public final yle d0(final t4w t4w) {
        e0e.f((Object)t4w, "value");
        this.u3();
        return (yle)this;
    }
    
    public final yle e(final int n, final String s) {
        this.a();
        this.h(n);
        this.K0[this.H0 - 1] = 0;
        this.F0.P0(s);
        return (yle)this;
    }
    
    public final yle e0(final long n) {
        this.c(String.valueOf(n));
        return (yle)this;
    }
    
    public final int f() {
        final int h0 = this.H0;
        if (h0 != 0) {
            return this.I0[h0 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.".toString());
    }
    
    public final yle f0(final int n) {
        this.c(String.valueOf(n));
        return (yle)this;
    }
    
    public final void h(int i) {
        final int h0 = this.H0;
        final int[] i2 = this.I0;
        if (h0 == i2.length) {
            final StringBuilder f = ehk.f("Nesting too deep at ");
            final int h2 = this.H0;
            final int[] i3 = this.I0;
            final String[] j0 = this.J0;
            final int[] k0 = this.K0;
            e0e.f((Object)i3, "stack");
            e0e.f((Object)j0, "pathNames");
            e0e.f((Object)k0, "pathIndices");
            final ArrayList list = new ArrayList();
            int n;
            String s;
            for (i = 0; i < h2; ++i) {
                n = i3[i];
                if (n != 1 && n != 2) {
                    if (n == 3 || n == 4 || n == 5) {
                        s = j0[i];
                        if (s != null) {
                            list.add(s);
                        }
                    }
                }
                else {
                    list.add(k0[i]);
                }
            }
            throw new JsonDataException(m51.y(f, rr4.I1((Iterable)list, (CharSequence)".", (CharSequence)null, (CharSequence)null, (stb)null, 62), ": circular reference?"));
        }
        this.H0 = h0 + 1;
        i2[h0] = i;
    }
    
    public final void i(final int n) {
        this.I0[this.H0 - 1] = n;
    }
    
    public final yle i2(final String s) {
        e0e.f((Object)s, "value");
        this.j();
        this.a();
        tr2.Companion.a(this.F0, s);
        final int[] k0 = this.K0;
        final int n = this.H0 - 1;
        ++k0[n];
        return (yle)this;
    }
    
    public final void j() {
        if (this.L0 != null) {
            final int f = this.f();
            if (f == 5) {
                this.F0.l2(44);
            }
            else if (f != 3) {
                throw new IllegalStateException("Nesting problem.".toString());
            }
            this.d();
            this.i(4);
            final tr2.tr2$a companion = tr2.Companion;
            final sr2 f2 = this.F0;
            final String l0 = this.L0;
            e0e.c((Object)l0);
            companion.a(f2, l0);
            this.L0 = null;
        }
    }
    
    public final yle k0(final double n) {
        if (!Double.isNaN(n) && !Double.isInfinite(n)) {
            this.c(String.valueOf(n));
            return (yle)this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final yle u3() {
        this.c("null");
        return (yle)this;
    }
}

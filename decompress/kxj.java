import com.fasterxml.jackson.core.JsonParseException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kxj extends mxj
{
    public static final BigInteger b1;
    public static final BigInteger c1;
    public static final BigInteger d1;
    public static final BigInteger e1;
    public static final BigDecimal f1;
    public static final BigDecimal g1;
    public static final BigDecimal h1;
    public static final BigDecimal i1;
    public final k3d H0;
    public boolean I0;
    public int J0;
    public int K0;
    public long L0;
    public int M0;
    public int N0;
    public int O0;
    public int P0;
    public iie Q0;
    public rje R0;
    public final kfs S0;
    public int T0;
    public int U0;
    public long V0;
    public double W0;
    public BigInteger X0;
    public BigDecimal Y0;
    public boolean Z0;
    public int a1;
    
    static {
        final BigInteger bigInteger = b1 = BigInteger.valueOf(-2147483648L);
        final BigInteger bigInteger2 = c1 = BigInteger.valueOf(2147483647L);
        final BigInteger bigInteger3 = d1 = BigInteger.valueOf(Long.MIN_VALUE);
        final BigInteger bigInteger4 = e1 = BigInteger.valueOf(Long.MAX_VALUE);
        f1 = new BigDecimal(bigInteger3);
        g1 = new BigDecimal(bigInteger4);
        h1 = new BigDecimal(bigInteger);
        i1 = new BigDecimal(bigInteger2);
    }
    
    public kxj(final k3d h0, int n) {
        super(n);
        final int n2 = 1;
        this.M0 = 1;
        this.O0 = 1;
        this.T0 = 0;
        this.H0 = h0;
        this.S0 = new kfs(h0.d);
        if ((qhe$a.Q0.G0 & n) != 0x0) {
            n = n2;
        }
        else {
            n = 0;
        }
        nm9 nm9;
        if (n != 0) {
            nm9 = new nm9((Object)this);
        }
        else {
            nm9 = null;
        }
        this.Q0 = new iie((iie)null, nm9, 0, 1, 0);
    }
    
    public abstract void R0() throws IOException;
    
    public final int S0() throws IOException {
        if (super.G0 == rje.T0) {
            final char[] j = this.S0.j();
            final int k = this.S0.k();
            final int a1 = this.a1;
            int n = k;
            if (this.Z0) {
                n = k + 1;
            }
            if (a1 <= 9) {
                int c;
                final int n2 = c = i3j.c(j, n, a1);
                if (this.Z0) {
                    c = -n2;
                }
                this.U0 = c;
                this.T0 = 1;
                return c;
            }
        }
        this.V0(1);
        if ((this.T0 & 0x1) == 0x0) {
            this.Y0();
        }
        return this.U0;
    }
    
    public final void V0(int c) throws IOException {
        final rje g0 = super.G0;
        if (g0 == rje.T0) {
            final char[] j = this.S0.j();
            final int k = this.S0.k();
            final int a1 = this.a1;
            c = k;
            if (this.Z0) {
                c = k + 1;
            }
            final boolean b = true;
            if (a1 <= 9) {
                final int n = c = i3j.c(j, c, a1);
                if (this.Z0) {
                    c = -n;
                }
                this.U0 = c;
                this.T0 = 1;
                return;
            }
            if (a1 <= 18) {
                final int n2 = a1 - 9;
                final long n3 = i3j.c(j, c, n2) * 1000000000L + i3j.c(j, c + n2, 9);
                final boolean z0 = this.Z0;
                long v0 = n3;
                if (z0) {
                    v0 = -n3;
                }
                if (a1 == 10) {
                    if (z0) {
                        if (v0 >= -2147483648L) {
                            this.U0 = (int)v0;
                            this.T0 = 1;
                            return;
                        }
                    }
                    else if (v0 <= 2147483647L) {
                        this.U0 = (int)v0;
                        this.T0 = 1;
                        return;
                    }
                }
                this.V0 = v0;
                this.T0 = 2;
                return;
            }
            final String e = this.S0.e();
            try {
                String s;
                if (this.Z0) {
                    s = i3j.a;
                }
                else {
                    s = i3j.b;
                }
                final int length = s.length();
                int n4 = 0;
                Label_0320: {
                    if (a1 < length) {
                        n4 = (b ? 1 : 0);
                    }
                    else {
                        if (a1 <= length) {
                            int n5 = 0;
                            while (true) {
                                n4 = (b ? 1 : 0);
                                if (n5 >= length) {
                                    break Label_0320;
                                }
                                final int n6 = j[c + n5] - s.charAt(n5);
                                if (n6 != 0) {
                                    if (n6 < 0) {
                                        n4 = (b ? 1 : 0);
                                        break Label_0320;
                                    }
                                    break;
                                }
                                else {
                                    ++n5;
                                }
                            }
                        }
                        n4 = 0;
                    }
                }
                if (n4 != 0) {
                    this.V0 = Long.parseLong(e);
                    this.T0 = 2;
                }
                else {
                    this.X0 = new BigInteger(e);
                    this.T0 = 4;
                }
                return;
            }
            catch (final NumberFormatException ex) {
                throw new JsonParseException((qhe)this, c0e.h("Malformed numeric value '", e, "'"), (Throwable)ex);
            }
        }
        if (g0 == rje.U0) {
            Label_0421: {
                if (c != 16) {
                    break Label_0421;
                }
                try {
                    this.Y0 = this.S0.d();
                    this.T0 = 16;
                    return;
                    this.W0 = i3j.b(this.S0.e());
                    this.T0 = 8;
                    return;
                }
                catch (final NumberFormatException ex2) {
                    final StringBuilder f = ehk.f("Malformed numeric value '");
                    f.append(this.S0.e());
                    f.append("'");
                    throw new JsonParseException((qhe)this, f.toString(), (Throwable)ex2);
                }
            }
        }
        final StringBuilder f2 = ehk.f("Current token (");
        f2.append(super.G0);
        f2.append(") not numeric, can not use numeric value accessors");
        this.u0(f2.toString());
        throw null;
    }
    
    public void W0() throws IOException {
        final kfs s0 = this.S0;
        if (s0.a == null) {
            s0.l();
        }
        else if (s0.h != null) {
            s0.l();
            final char[] h = s0.h;
            s0.h = null;
            s0.a.b[2] = h;
        }
    }
    
    public final void X0(final int n, final char c) throws JsonParseException {
        final StringBuilder f = ehk.f("");
        final iie q0 = this.Q0;
        f.append(new kge(this.H0.a, -1L, -1L, q0.h, q0.i));
        final String string = f.toString();
        final StringBuilder f2 = ehk.f("Unexpected close marker '");
        f2.append((char)n);
        f2.append("': expected '");
        f2.append(c);
        f2.append("' (for ");
        f2.append(((fje)this.Q0).g());
        f2.append(" starting at ");
        f2.append(string);
        f2.append(")");
        this.u0(f2.toString());
        throw null;
    }
    
    public final void Y0() throws IOException {
        final int t0 = this.T0;
        if ((t0 & 0x2) != 0x0) {
            final long v0 = this.V0;
            final int u0 = (int)v0;
            if (u0 != v0) {
                final StringBuilder f = ehk.f("Numeric value (");
                f.append(this.j());
                f.append(") out of range of int");
                this.u0(f.toString());
                throw null;
            }
            this.U0 = u0;
        }
        else if ((t0 & 0x4) != 0x0) {
            if (kxj.b1.compareTo(this.X0) > 0 || kxj.c1.compareTo(this.X0) < 0) {
                this.a1();
                throw null;
            }
            this.U0 = this.X0.intValue();
        }
        else if ((t0 & 0x8) != 0x0) {
            final double w0 = this.W0;
            if (w0 < -2.147483648E9 || w0 > 2.147483647E9) {
                this.a1();
                throw null;
            }
            this.U0 = (int)w0;
        }
        else {
            if ((t0 & 0x10) == 0x0) {
                this.I0();
                throw null;
            }
            if (kxj.h1.compareTo(this.Y0) > 0 || kxj.i1.compareTo(this.Y0) < 0) {
                this.a1();
                throw null;
            }
            this.U0 = this.Y0.intValue();
        }
        this.T0 |= 0x1;
    }
    
    public final void Z0() throws JsonParseException {
        this.u0("Invalid numeric value: Leading zeroes not allowed");
        throw null;
    }
    
    public final void a1() throws IOException {
        this.u0(String.format("Numeric value (%s) out of range of int (%d - %s)", this.j(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        throw null;
    }
    
    public final void b1() throws IOException {
        this.u0(String.format("Numeric value (%s) out of range of long (%d - %s)", this.j(), Long.MIN_VALUE, Long.MAX_VALUE));
        throw null;
    }
    
    public final void close() throws IOException {
        if (!this.I0) {
            this.I0 = true;
            try {
                this.R0();
            }
            finally {
                this.W0();
            }
        }
    }
    
    public final String d() throws IOException {
        final rje g0 = super.G0;
        if (g0 == rje.N0 || g0 == rje.P0) {
            final iie d = this.Q0.d;
            if (d != null) {
                return d.g;
            }
        }
        return this.Q0.g;
    }
    
    public final void e1(final int n, final String s) throws JsonParseException {
        final StringBuilder f = ehk.f("Unexpected character (");
        f.append(mxj.p0(n));
        f.append(") in numeric value");
        final String string = f.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(": ");
        sb.append(s);
        this.u0(sb.toString());
        throw null;
    }
    
    public final double f() throws IOException {
        final int t0 = this.T0;
        if ((t0 & 0x8) == 0x0) {
            if (t0 == 0) {
                this.V0(8);
            }
            final int t2 = this.T0;
            if ((t2 & 0x8) == 0x0) {
                if ((t2 & 0x10) != 0x0) {
                    this.W0 = this.Y0.doubleValue();
                }
                else if ((t2 & 0x4) != 0x0) {
                    this.W0 = this.X0.doubleValue();
                }
                else if ((t2 & 0x2) != 0x0) {
                    this.W0 = (double)this.V0;
                }
                else {
                    if ((t2 & 0x1) == 0x0) {
                        this.I0();
                        throw null;
                    }
                    this.W0 = this.U0;
                }
                this.T0 |= 0x8;
            }
        }
        return this.W0;
    }
    
    public final rje f1(final String j, final double w0) {
        final kfs s0 = this.S0;
        s0.b = null;
        s0.c = -1;
        s0.d = 0;
        s0.j = j;
        s0.k = null;
        if (s0.f) {
            s0.b();
        }
        s0.i = 0;
        this.W0 = w0;
        this.T0 = 8;
        return rje.U0;
    }
    
    public final rje g1(final boolean z0, final int a1) {
        this.Z0 = z0;
        this.a1 = a1;
        this.T0 = 0;
        return rje.U0;
    }
    
    public final int h() throws IOException {
        final int t0 = this.T0;
        if ((t0 & 0x1) == 0x0) {
            if (t0 == 0) {
                return this.S0();
            }
            if ((t0 & 0x1) == 0x0) {
                this.Y0();
            }
        }
        return this.U0;
    }
    
    public final rje h1(final boolean z0, final int a1) {
        this.Z0 = z0;
        this.a1 = a1;
        this.T0 = 0;
        return rje.T0;
    }
    
    public final long i() throws IOException {
        final int t0 = this.T0;
        if ((t0 & 0x2) == 0x0) {
            if (t0 == 0) {
                this.V0(2);
            }
            final int t2 = this.T0;
            if ((t2 & 0x2) == 0x0) {
                if ((t2 & 0x1) != 0x0) {
                    this.V0 = this.U0;
                }
                else if ((t2 & 0x4) != 0x0) {
                    if (kxj.d1.compareTo(this.X0) > 0 || kxj.e1.compareTo(this.X0) < 0) {
                        this.b1();
                        throw null;
                    }
                    this.V0 = this.X0.longValue();
                }
                else if ((t2 & 0x8) != 0x0) {
                    final double w0 = this.W0;
                    if (w0 < -9.223372036854776E18 || w0 > 9.223372036854776E18) {
                        this.b1();
                        throw null;
                    }
                    this.V0 = (long)w0;
                }
                else {
                    if ((t2 & 0x10) == 0x0) {
                        this.I0();
                        throw null;
                    }
                    if (kxj.f1.compareTo(this.Y0) > 0 || kxj.g1.compareTo(this.Y0) < 0) {
                        this.b1();
                        throw null;
                    }
                    this.V0 = this.Y0.longValue();
                }
                this.T0 |= 0x2;
            }
        }
        return this.V0;
    }
    
    @Override
    public final void q0() throws JsonParseException {
        if (!((fje)this.Q0).e()) {
            String s;
            if (((fje)this.Q0).c()) {
                s = "Array";
            }
            else {
                s = "Object";
            }
            final iie q0 = this.Q0;
            this.x0(String.format(": expected close marker for %s (start marker at %s)", s, new kge(this.H0.a, -1L, -1L, q0.h, q0.i)), null);
            throw null;
        }
    }
}

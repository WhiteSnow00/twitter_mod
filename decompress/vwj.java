import com.fasterxml.jackson.core.JsonParseException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vwj extends xwj
{
    public static final BigInteger Z0;
    public static final BigInteger a1;
    public static final BigInteger b1;
    public static final BigInteger c1;
    public static final BigDecimal d1;
    public static final BigDecimal e1;
    public static final BigDecimal f1;
    public static final BigDecimal g1;
    public final k2d F0;
    public boolean G0;
    public int H0;
    public int I0;
    public long J0;
    public int K0;
    public int L0;
    public int M0;
    public int N0;
    public mhe O0;
    public vie P0;
    public final ses Q0;
    public int R0;
    public int S0;
    public long T0;
    public double U0;
    public BigInteger V0;
    public BigDecimal W0;
    public boolean X0;
    public int Y0;
    
    static {
        final BigInteger bigInteger = Z0 = BigInteger.valueOf(-2147483648L);
        final BigInteger bigInteger2 = a1 = BigInteger.valueOf(2147483647L);
        final BigInteger bigInteger3 = b1 = BigInteger.valueOf(Long.MIN_VALUE);
        final BigInteger bigInteger4 = c1 = BigInteger.valueOf(Long.MAX_VALUE);
        d1 = new BigDecimal(bigInteger3);
        e1 = new BigDecimal(bigInteger4);
        f1 = new BigDecimal(bigInteger);
        g1 = new BigDecimal(bigInteger2);
    }
    
    public vwj(final k2d f0, int n) {
        super(n);
        final int n2 = 1;
        this.K0 = 1;
        this.M0 = 1;
        this.R0 = 0;
        this.F0 = f0;
        this.Q0 = new ses(f0.d);
        if ((tge$a.O0.E0 & n) != 0x0) {
            n = n2;
        }
        else {
            n = 0;
        }
        ll9 ll9;
        if (n != 0) {
            ll9 = new ll9((Object)this);
        }
        else {
            ll9 = null;
        }
        this.O0 = new mhe((mhe)null, ll9, 0, 1, 0);
    }
    
    public abstract void Q0() throws IOException;
    
    public final int R0() throws IOException {
        if (super.E0 == vie.R0) {
            final char[] j = this.Q0.j();
            final int k = this.Q0.k();
            final int y0 = this.Y0;
            int n = k;
            if (this.X0) {
                n = k + 1;
            }
            if (y0 <= 9) {
                int c;
                final int n2 = c = v2j.c(j, n, y0);
                if (this.X0) {
                    c = -n2;
                }
                this.S0 = c;
                this.R0 = 1;
                return c;
            }
        }
        this.U0(1);
        if ((this.R0 & 0x1) == 0x0) {
            this.X0();
        }
        return this.S0;
    }
    
    public final void U0(int c) throws IOException {
        final vie e0 = super.E0;
        if (e0 == vie.R0) {
            final char[] j = this.Q0.j();
            final int k = this.Q0.k();
            final int y0 = this.Y0;
            c = k;
            if (this.X0) {
                c = k + 1;
            }
            final boolean b = true;
            if (y0 <= 9) {
                final int n = c = v2j.c(j, c, y0);
                if (this.X0) {
                    c = -n;
                }
                this.S0 = c;
                this.R0 = 1;
                return;
            }
            if (y0 <= 18) {
                final int n2 = y0 - 9;
                final long n3 = v2j.c(j, c, n2) * 1000000000L + v2j.c(j, c + n2, 9);
                final boolean x0 = this.X0;
                long t0 = n3;
                if (x0) {
                    t0 = -n3;
                }
                if (y0 == 10) {
                    if (x0) {
                        if (t0 >= -2147483648L) {
                            this.S0 = (int)t0;
                            this.R0 = 1;
                            return;
                        }
                    }
                    else if (t0 <= 2147483647L) {
                        this.S0 = (int)t0;
                        this.R0 = 1;
                        return;
                    }
                }
                this.T0 = t0;
                this.R0 = 2;
                return;
            }
            final String e2 = this.Q0.e();
            try {
                String s;
                if (this.X0) {
                    s = v2j.a;
                }
                else {
                    s = v2j.b;
                }
                final int length = s.length();
                int n4 = 0;
                Label_0320: {
                    if (y0 < length) {
                        n4 = (b ? 1 : 0);
                    }
                    else {
                        if (y0 <= length) {
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
                    this.T0 = Long.parseLong(e2);
                    this.R0 = 2;
                }
                else {
                    this.V0 = new BigInteger(e2);
                    this.R0 = 4;
                }
                return;
            }
            catch (final NumberFormatException ex) {
                throw new JsonParseException((tge)this, da8.j("Malformed numeric value '", e2, "'"), (Throwable)ex);
            }
        }
        if (e0 == vie.S0) {
            Label_0421: {
                if (c != 16) {
                    break Label_0421;
                }
                try {
                    this.W0 = this.Q0.d();
                    this.R0 = 16;
                    return;
                    this.U0 = v2j.b(this.Q0.e());
                    this.R0 = 8;
                    return;
                }
                catch (final NumberFormatException ex2) {
                    final StringBuilder i = fu8.j("Malformed numeric value '");
                    i.append(this.Q0.e());
                    i.append("'");
                    throw new JsonParseException((tge)this, i.toString(), (Throwable)ex2);
                }
            }
        }
        final StringBuilder l = fu8.j("Current token (");
        l.append(super.E0);
        l.append(") not numeric, can not use numeric value accessors");
        this.t0(l.toString());
        throw null;
    }
    
    public void V0() throws IOException {
        final ses q0 = this.Q0;
        if (q0.a == null) {
            q0.l();
        }
        else if (q0.h != null) {
            q0.l();
            final char[] h = q0.h;
            q0.h = null;
            q0.a.b[2] = h;
        }
    }
    
    public final void W0(final int n, final char c) throws JsonParseException {
        final StringBuilder j = fu8.j("");
        final mhe o0 = this.O0;
        j.append(new mfe(this.F0.a, -1L, -1L, o0.h, o0.i));
        final String string = j.toString();
        final StringBuilder i = fu8.j("Unexpected close marker '");
        i.append((char)n);
        i.append("': expected '");
        i.append(c);
        i.append("' (for ");
        i.append(((jie)this.O0).g());
        i.append(" starting at ");
        i.append(string);
        i.append(")");
        this.t0(i.toString());
        throw null;
    }
    
    public final void X0() throws IOException {
        final int r0 = this.R0;
        if ((r0 & 0x2) != 0x0) {
            final long t0 = this.T0;
            final int s0 = (int)t0;
            if (s0 != t0) {
                final StringBuilder j = fu8.j("Numeric value (");
                j.append(((tge)this).j());
                j.append(") out of range of int");
                this.t0(j.toString());
                throw null;
            }
            this.S0 = s0;
        }
        else if ((r0 & 0x4) != 0x0) {
            if (vwj.Z0.compareTo(this.V0) > 0 || vwj.a1.compareTo(this.V0) < 0) {
                this.Z0();
                throw null;
            }
            this.S0 = this.V0.intValue();
        }
        else if ((r0 & 0x8) != 0x0) {
            final double u0 = this.U0;
            if (u0 < -2.147483648E9 || u0 > 2.147483647E9) {
                this.Z0();
                throw null;
            }
            this.S0 = (int)u0;
        }
        else {
            if ((r0 & 0x10) == 0x0) {
                this.H0();
                throw null;
            }
            if (vwj.f1.compareTo(this.W0) > 0 || vwj.g1.compareTo(this.W0) < 0) {
                this.Z0();
                throw null;
            }
            this.S0 = this.W0.intValue();
        }
        this.R0 |= 0x1;
    }
    
    public final void Y0() throws JsonParseException {
        this.t0("Invalid numeric value: Leading zeroes not allowed");
        throw null;
    }
    
    public final void Z0() throws IOException {
        this.t0(String.format("Numeric value (%s) out of range of int (%d - %s)", ((tge)this).j(), Integer.MIN_VALUE, Integer.MAX_VALUE));
        throw null;
    }
    
    public final void a1() throws IOException {
        this.t0(String.format("Numeric value (%s) out of range of long (%d - %s)", ((tge)this).j(), Long.MIN_VALUE, Long.MAX_VALUE));
        throw null;
    }
    
    public final void close() throws IOException {
        if (!this.G0) {
            this.G0 = true;
            try {
                this.Q0();
            }
            finally {
                this.V0();
            }
        }
    }
    
    public final String d() throws IOException {
        final vie e0 = super.E0;
        if (e0 == vie.L0 || e0 == vie.N0) {
            final mhe d = this.O0.d;
            if (d != null) {
                return d.g;
            }
        }
        return this.O0.g;
    }
    
    public final void d1(final int n, final String s) throws JsonParseException {
        final StringBuilder j = fu8.j("Unexpected character (");
        j.append(xwj.o0(n));
        j.append(") in numeric value");
        final String string = j.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(": ");
        sb.append(s);
        this.t0(sb.toString());
        throw null;
    }
    
    public final vie e1(final String j, final double u0) {
        final ses q0 = this.Q0;
        q0.b = null;
        q0.c = -1;
        q0.d = 0;
        q0.j = j;
        q0.k = null;
        if (q0.f) {
            q0.b();
        }
        q0.i = 0;
        this.U0 = u0;
        this.R0 = 8;
        return vie.S0;
    }
    
    public final double f() throws IOException {
        final int r0 = this.R0;
        if ((r0 & 0x8) == 0x0) {
            if (r0 == 0) {
                this.U0(8);
            }
            final int r2 = this.R0;
            if ((r2 & 0x8) == 0x0) {
                if ((r2 & 0x10) != 0x0) {
                    this.U0 = this.W0.doubleValue();
                }
                else if ((r2 & 0x4) != 0x0) {
                    this.U0 = this.V0.doubleValue();
                }
                else if ((r2 & 0x2) != 0x0) {
                    this.U0 = (double)this.T0;
                }
                else {
                    if ((r2 & 0x1) == 0x0) {
                        this.H0();
                        throw null;
                    }
                    this.U0 = this.S0;
                }
                this.R0 |= 0x8;
            }
        }
        return this.U0;
    }
    
    public final vie f1(final boolean x0, final int y0) {
        this.X0 = x0;
        this.Y0 = y0;
        this.R0 = 0;
        return vie.S0;
    }
    
    public final vie g1(final boolean x0, final int y0) {
        this.X0 = x0;
        this.Y0 = y0;
        this.R0 = 0;
        return vie.R0;
    }
    
    public final int h() throws IOException {
        final int r0 = this.R0;
        if ((r0 & 0x1) == 0x0) {
            if (r0 == 0) {
                return this.R0();
            }
            if ((r0 & 0x1) == 0x0) {
                this.X0();
            }
        }
        return this.S0;
    }
    
    public final long i() throws IOException {
        final int r0 = this.R0;
        if ((r0 & 0x2) == 0x0) {
            if (r0 == 0) {
                this.U0(2);
            }
            final int r2 = this.R0;
            if ((r2 & 0x2) == 0x0) {
                if ((r2 & 0x1) != 0x0) {
                    this.T0 = this.S0;
                }
                else if ((r2 & 0x4) != 0x0) {
                    if (vwj.b1.compareTo(this.V0) > 0 || vwj.c1.compareTo(this.V0) < 0) {
                        this.a1();
                        throw null;
                    }
                    this.T0 = this.V0.longValue();
                }
                else if ((r2 & 0x8) != 0x0) {
                    final double u0 = this.U0;
                    if (u0 < -9.223372036854776E18 || u0 > 9.223372036854776E18) {
                        this.a1();
                        throw null;
                    }
                    this.T0 = (long)u0;
                }
                else {
                    if ((r2 & 0x10) == 0x0) {
                        this.H0();
                        throw null;
                    }
                    if (vwj.d1.compareTo(this.W0) > 0 || vwj.e1.compareTo(this.W0) < 0) {
                        this.a1();
                        throw null;
                    }
                    this.T0 = this.W0.longValue();
                }
                this.R0 |= 0x2;
            }
        }
        return this.T0;
    }
    
    public final void p0() throws JsonParseException {
        if (!((jie)this.O0).e()) {
            String s;
            if (((jie)this.O0).c()) {
                s = "Array";
            }
            else {
                s = "Object";
            }
            final mhe o0 = this.O0;
            this.w0(String.format(": expected close marker for %s (start marker at %s)", s, new mfe(this.F0.a, -1L, -1L, o0.h, o0.i)), (vie)null);
            throw null;
        }
    }
}

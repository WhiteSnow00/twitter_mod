import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kle extends jie
{
    public static final a73 Q0;
    public static final a73 R0;
    public static final a73 S0;
    public static final a73 T0;
    public final ur2 K0;
    public final cr2 L0;
    public int M0;
    public long N0;
    public int O0;
    public String P0;
    
    static {
        final a73$a companion = a73.Companion;
        Q0 = companion.c("'\\");
        R0 = companion.c("\"\\");
        S0 = companion.c("{}[]:, \n\t\r\f/\\;#=");
        T0 = companion.c("\n\r");
        companion.c("*/");
    }
    
    public kle(final ur2 k0) {
        this.M0 = 0;
        Objects.requireNonNull(k0, "source == null");
        this.K0 = k0;
        this.L0 = k0.c0();
        this.e(6);
    }
    
    public final String K() throws IOException {
        final long d1 = this.K0.d1(kle.S0);
        String s;
        if (d1 != -1L) {
            s = this.L0.K(d1);
        }
        else {
            s = this.L0.z();
        }
        return s;
    }
    
    @Override
    public final boolean K1() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 5) {
            this.M0 = 0;
            final int[] i0 = super.I0;
            final int n2 = super.F0 - 1;
            ++i0[n2];
            return true;
        }
        if (n == 6) {
            this.M0 = 0;
            final int[] i2 = super.I0;
            final int n3 = super.F0 - 1;
            ++i2[n3];
            return false;
        }
        final StringBuilder f = ehk.f("Expected a boolean but was ");
        f.append(dn.D(this.V2()));
        f.append(" at path ");
        f.append(this.s());
        throw new xee(f.toString());
    }
    
    public final char L() throws IOException {
        if (!this.K0.E(1L)) {
            this.i("Unterminated escape sequence");
            throw null;
        }
        final byte byte1 = this.L0.readByte();
        if (byte1 == 10 || byte1 == 34 || byte1 == 39 || byte1 == 47 || byte1 == 92) {
            return (char)byte1;
        }
        if (byte1 == 98) {
            return '\b';
        }
        if (byte1 == 102) {
            return '\f';
        }
        if (byte1 == 110) {
            return '\n';
        }
        if (byte1 == 114) {
            return '\r';
        }
        if (byte1 == 116) {
            return '\t';
        }
        if (byte1 != 117) {
            final StringBuilder f = ehk.f("Invalid escape sequence: \\");
            f.append((char)byte1);
            this.i(f.toString());
            throw null;
        }
        if (this.K0.E(4L)) {
            int i = 0;
            char c = '\0';
            while (i < 4) {
                int f2 = this.L0.f((long)i);
                final char c2 = (char)(c << 4);
                if (f2 >= '0' && f2 <= '9') {
                    f2 -= 48;
                }
                else {
                    if (f2 >= 'a' && f2 <= 'f') {
                        f2 -= 97;
                    }
                    else {
                        if (f2 < 'A' || f2 > 'F') {
                            final StringBuilder f3 = ehk.f("\\u");
                            f3.append(this.L0.K(4L));
                            this.i(f3.toString());
                            throw null;
                        }
                        f2 -= 65;
                    }
                    f2 += '\n';
                }
                c = (char)(f2 + c2);
                ++i;
            }
            this.L0.U2(4L);
            return c;
        }
        final StringBuilder f4 = ehk.f("Unterminated escape sequence at path ");
        f4.append(this.s());
        throw new EOFException(f4.toString());
    }
    
    public final void N(final a73 a73) throws IOException {
        while (true) {
            final long d1 = this.K0.d1(a73);
            if (d1 == -1L) {
                this.i("Unterminated string");
                throw null;
            }
            if (this.L0.f(d1) != 92) {
                this.L0.U2(d1 + 1L);
                return;
            }
            this.L0.U2(d1 + 1L);
            this.L();
        }
    }
    
    @Override
    public final String N0() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        String s;
        if (n == 14) {
            s = this.K();
        }
        else if (n == 13) {
            s = this.z(kle.R0);
        }
        else if (n == 12) {
            s = this.z(kle.Q0);
        }
        else {
            if (n != 15) {
                final StringBuilder f = ehk.f("Expected a name but was ");
                f.append(dn.D(this.V2()));
                f.append(" at path ");
                f.append(this.s());
                throw new xee(f.toString());
            }
            s = this.P0;
        }
        this.M0 = 0;
        return super.H0[super.F0 - 1] = s;
    }
    
    public final void P() throws IOException {
        long n = this.K0.d1(kle.S0);
        final cr2 l0 = this.L0;
        if (n == -1L) {
            n = l0.G0;
        }
        l0.U2(n);
    }
    
    @Override
    public final int Q0() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 16) {
            final long n2 = this.N0;
            final int n3 = (int)n2;
            if (n2 == n3) {
                this.M0 = 0;
                final int[] i0 = super.I0;
                final int n4 = super.F0 - 1;
                ++i0[n4];
                return n3;
            }
            final StringBuilder f = ehk.f("Expected an int but was ");
            f.append(this.N0);
            f.append(" at path ");
            f.append(this.s());
            throw new xee(f.toString());
        }
        else {
            while (true) {
                if (n == 17) {
                    this.P0 = this.L0.K((long)this.O0);
                    break Label_0295;
                }
                String p0;
                if (n != 9 && n != 8) {
                    if (n == 11) {
                        break Label_0295;
                    }
                    final StringBuilder f2 = ehk.f("Expected an int but was ");
                    f2.append(dn.D(this.V2()));
                    f2.append(" at path ");
                    f2.append(this.s());
                    throw new xee(f2.toString());
                }
                else if (n == 9) {
                    p0 = this.z(kle.R0);
                }
                else {
                    p0 = this.z(kle.Q0);
                }
                this.P0 = p0;
                try {
                    final int int1 = Integer.parseInt(p0);
                    this.M0 = 0;
                    final int[] i2 = super.I0;
                    final int n5 = super.F0 - 1;
                    ++i2[n5];
                    return int1;
                    this.M0 = 11;
                    try {
                        final double double1 = Double.parseDouble(this.P0);
                        final int n6 = (int)double1;
                        if (n6 == double1) {
                            this.P0 = null;
                            this.M0 = 0;
                            final int[] i3 = super.I0;
                            final int n7 = super.F0 - 1;
                            ++i3[n7];
                            return n6;
                        }
                        final StringBuilder f3 = ehk.f("Expected an int but was ");
                        f3.append(this.P0);
                        f3.append(" at path ");
                        f3.append(this.s());
                        throw new xee(f3.toString());
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder f4 = ehk.f("Expected an int but was ");
                        f4.append(this.P0);
                        f4.append(" at path ");
                        f4.append(this.s());
                        throw new xee(f4.toString());
                    }
                }
                catch (final NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public final String S1() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        String s;
        if (n == 10) {
            s = this.K();
        }
        else if (n == 9) {
            s = this.z(kle.R0);
        }
        else if (n == 8) {
            s = this.z(kle.Q0);
        }
        else if (n == 11) {
            s = this.P0;
            this.P0 = null;
        }
        else if (n == 16) {
            s = Long.toString(this.N0);
        }
        else {
            if (n != 17) {
                final StringBuilder f = ehk.f("Expected a string but was ");
                f.append(dn.D(this.V2()));
                f.append(" at path ");
                f.append(this.s());
                throw new xee(f.toString());
            }
            s = this.L0.K((long)this.O0);
        }
        this.M0 = 0;
        final int[] i0 = super.I0;
        final int n2 = super.F0 - 1;
        ++i0[n2];
        return s;
    }
    
    @Override
    public final int V2() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 18: {
                return 10;
            }
            case 16:
            case 17: {
                return 7;
            }
            case 12:
            case 13:
            case 14:
            case 15: {
                return 5;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return 6;
            }
            case 7: {
                return 9;
            }
            case 5:
            case 6: {
                return 8;
            }
            case 4: {
                return 2;
            }
            case 3: {
                return 1;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
        }
    }
    
    @Override
    public final void a() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 3) {
            this.e(1);
            super.I0[super.F0 - 1] = 0;
            this.M0 = 0;
            return;
        }
        final StringBuilder f = ehk.f("Expected BEGIN_ARRAY but was ");
        f.append(dn.D(this.V2()));
        f.append(" at path ");
        f.append(this.s());
        throw new xee(f.toString());
    }
    
    @Override
    public final void b() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 1) {
            this.e(3);
            this.M0 = 0;
            return;
        }
        final StringBuilder f = ehk.f("Expected BEGIN_OBJECT but was ");
        f.append(dn.D(this.V2()));
        f.append(" at path ");
        f.append(this.s());
        throw new xee(f.toString());
    }
    
    @Override
    public final void c() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 4) {
            int f0 = super.F0 - 1;
            super.F0 = f0;
            final int[] i0 = super.I0;
            --f0;
            ++i0[f0];
            this.M0 = 0;
            return;
        }
        final StringBuilder f2 = ehk.f("Expected END_ARRAY but was ");
        f2.append(dn.D(this.V2()));
        f2.append(" at path ");
        f2.append(this.s());
        throw new xee(f2.toString());
    }
    
    @Override
    public final void close() throws IOException {
        this.M0 = 0;
        super.G0[0] = 8;
        super.F0 = 1;
        this.L0.a();
        ((qmq)this.K0).close();
    }
    
    @Override
    public final void d() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 2) {
            int f0 = super.F0 - 1;
            super.F0 = f0;
            super.H0[f0] = null;
            final int[] i0 = super.I0;
            --f0;
            ++i0[f0];
            this.M0 = 0;
            return;
        }
        final StringBuilder f2 = ehk.f("Expected END_OBJECT but was ");
        f2.append(dn.D(this.V2()));
        f2.append(" at path ");
        f2.append(this.s());
        throw new xee(f2.toString());
    }
    
    @Override
    public final int f(final a a) throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n < 12 || n > 15) {
            return -1;
        }
        if (n == 15) {
            return this.m(this.P0, a);
        }
        final int w3 = this.K0.w3(a.b);
        if (w3 != -1) {
            this.M0 = 0;
            super.H0[super.F0 - 1] = a.a[w3];
            return w3;
        }
        final String s = super.H0[super.F0 - 1];
        final String n2 = this.N0();
        final int m = this.m(n2, a);
        if (m == -1) {
            this.M0 = 15;
            this.P0 = n2;
            super.H0[super.F0 - 1] = s;
        }
        return m;
    }
    
    @Override
    public final void h() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 14) {
            this.P();
        }
        else if (n == 13) {
            this.N(kle.R0);
        }
        else if (n == 12) {
            this.N(kle.Q0);
        }
        else if (n != 15) {
            final StringBuilder f = ehk.f("Expected a name but was ");
            f.append(dn.D(this.V2()));
            f.append(" at path ");
            f.append(this.s());
            throw new xee(f.toString());
        }
        this.M0 = 0;
        super.H0[super.F0 - 1] = "null";
    }
    
    @Override
    public final void h0() throws IOException {
        int n = 0;
        int i = 0;
        do {
            int n2;
            if ((n2 = this.M0) == 0) {
                n2 = this.l();
            }
            Label_0365: {
                if (n2 == 3) {
                    this.e(1);
                }
                else if (n2 == 1) {
                    this.e(3);
                }
                else if (n2 == 4) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.F0;
                        break Label_0365;
                    }
                    final StringBuilder f = ehk.f("Expected a value but was ");
                    f.append(dn.D(this.V2()));
                    f.append(" at path ");
                    f.append(this.s());
                    throw new xee(f.toString());
                }
                else if (n2 == 2) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.F0;
                        break Label_0365;
                    }
                    final StringBuilder f2 = ehk.f("Expected a value but was ");
                    f2.append(dn.D(this.V2()));
                    f2.append(" at path ");
                    f2.append(this.s());
                    throw new xee(f2.toString());
                }
                else {
                    if (n2 == 14 || n2 == 10) {
                        this.P();
                        i = n;
                        break Label_0365;
                    }
                    if (n2 == 9 || n2 == 13) {
                        this.N(kle.R0);
                        i = n;
                        break Label_0365;
                    }
                    if (n2 == 8 || n2 == 12) {
                        this.N(kle.Q0);
                        i = n;
                        break Label_0365;
                    }
                    if (n2 == 17) {
                        this.L0.U2((long)this.O0);
                        i = n;
                        break Label_0365;
                    }
                    if (n2 != 18) {
                        i = n;
                        break Label_0365;
                    }
                    final StringBuilder f3 = ehk.f("Expected a value but was ");
                    f3.append(dn.D(this.V2()));
                    f3.append(" at path ");
                    f3.append(this.s());
                    throw new xee(f3.toString());
                }
                i = n + 1;
            }
            this.M0 = 0;
            n = i;
        } while (i != 0);
        final int[] i2 = super.I0;
        final int f4 = super.F0;
        final int n3 = f4 - 1;
        ++i2[n3];
        super.H0[f4 - 1] = "null";
    }
    
    @Override
    public final boolean hasNext() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        return n != 2 && n != 4 && n != 18;
    }
    
    public final void j() throws IOException {
        this.i("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
    
    public final int l() throws IOException {
        final int[] g0 = super.G0;
        final int f0 = super.F0;
        final int n = g0[f0 - 1];
        if (n == 1) {
            g0[f0 - 1] = 2;
        }
        else if (n == 2) {
            final int r = this.r(true);
            this.L0.readByte();
            if (r != 44) {
                if (r == 59) {
                    this.j();
                    throw null;
                }
                if (r == 93) {
                    return this.M0 = 4;
                }
                this.i("Unterminated array");
                throw null;
            }
        }
        else if (n != 3 && n != 5) {
            if (n == 4) {
                g0[f0 - 1] = 5;
                final int r2 = this.r(true);
                this.L0.readByte();
                if (r2 != 58) {
                    if (r2 != 61) {
                        this.i("Expected ':'");
                        throw null;
                    }
                    this.j();
                    throw null;
                }
            }
            else if (n == 6) {
                g0[f0 - 1] = 7;
            }
            else if (n == 7) {
                if (this.r(false) == -1) {
                    return this.M0 = 18;
                }
                this.j();
                throw null;
            }
            else if (n == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            g0[f0 - 1] = 4;
            if (n == 5) {
                final int r3 = this.r(true);
                this.L0.readByte();
                if (r3 != 44) {
                    if (r3 == 59) {
                        this.j();
                        throw null;
                    }
                    if (r3 == 125) {
                        return this.M0 = 2;
                    }
                    this.i("Unterminated object");
                    throw null;
                }
            }
            final int r4 = this.r(true);
            if (r4 == 34) {
                this.L0.readByte();
                return this.M0 = 13;
            }
            if (r4 == 39) {
                this.L0.readByte();
                this.j();
                throw null;
            }
            if (r4 != 125) {
                this.j();
                throw null;
            }
            if (n != 5) {
                this.L0.readByte();
                return this.M0 = 2;
            }
            this.i("Expected name");
            throw null;
        }
        final int r5 = this.r(true);
        if (r5 == 34) {
            this.L0.readByte();
            return this.M0 = 9;
        }
        if (r5 == 39) {
            this.j();
            throw null;
        }
        if (r5 != 44 && r5 != 59) {
            if (r5 == 91) {
                this.L0.readByte();
                return this.M0 = 3;
            }
            if (r5 != 93) {
                if (r5 == 123) {
                    this.L0.readByte();
                    return this.M0 = 1;
                }
                final byte f2 = this.L0.f(0L);
                int m0 = 0;
                Label_0491: {
                    Label_0393: {
                        String s;
                        String s2;
                        if (f2 != 116 && f2 != 84) {
                            if (f2 != 102 && f2 != 70) {
                                if (f2 != 110 && f2 != 78) {
                                    break Label_0393;
                                }
                                s = "null";
                                s2 = "NULL";
                                m0 = 7;
                            }
                            else {
                                s = "false";
                                s2 = "FALSE";
                                m0 = 6;
                            }
                        }
                        else {
                            s = "true";
                            s2 = "TRUE";
                            m0 = 5;
                        }
                        final int length = s.length();
                        int n2;
                        for (int i = 1; i < length; i = n2) {
                            final ur2 k0 = this.K0;
                            n2 = i + 1;
                            if (!k0.E((long)n2)) {
                                break Label_0393;
                            }
                            final byte f3 = this.L0.f((long)i);
                            if (f3 != s.charAt(i) && f3 != s2.charAt(i)) {
                                break Label_0393;
                            }
                        }
                        if (!this.K0.E((long)(length + 1)) || !this.q(this.L0.f((long)length))) {
                            this.L0.U2((long)length);
                            this.M0 = m0;
                            break Label_0491;
                        }
                    }
                    m0 = 0;
                }
                if (m0 != 0) {
                    return m0;
                }
                long n3 = 0L;
                int n4 = 0;
                int o0 = 0;
                int n5 = 1;
                int n6 = 0;
                int n13 = 0;
                Label_0938: {
                    Label_0936: {
                        while (true) {
                            final ur2 k2 = this.K0;
                            final int n7 = o0 + 1;
                            if (!k2.E((long)n7)) {
                                break;
                            }
                            final byte f4 = this.L0.f((long)o0);
                            int n11 = 0;
                            Label_0924: {
                                if (f4 != 43) {
                                    if (f4 != 69 && f4 != 101) {
                                        if (f4 != 45) {
                                            if (f4 != 46) {
                                                if (f4 >= 48 && f4 <= 57) {
                                                    long n8 = 0L;
                                                    int n10 = 0;
                                                    Label_0741: {
                                                        if (n4 != 1 && n4 != 0) {
                                                            if (n4 == 2) {
                                                                if (n3 == 0L) {
                                                                    break Label_0936;
                                                                }
                                                                n8 = 10L * n3 - (f4 - 48);
                                                                final long n9 = lcmp(n3, -922337203685477580L);
                                                                n10 = (((n9 > 0 || (n9 == 0 && n8 < n3)) ? 1 : 0) & n5);
                                                                n11 = n4;
                                                            }
                                                            else {
                                                                if (n4 == 3) {
                                                                    n11 = 4;
                                                                    break Label_0924;
                                                                }
                                                                if (n4 != 5) {
                                                                    n11 = n4;
                                                                    n10 = n5;
                                                                    n8 = n3;
                                                                    if (n4 != 6) {
                                                                        break Label_0741;
                                                                    }
                                                                }
                                                                n11 = 7;
                                                                n10 = n5;
                                                                n8 = n3;
                                                            }
                                                        }
                                                        else {
                                                            n8 = -(f4 - 48);
                                                            n11 = 2;
                                                            n10 = n5;
                                                        }
                                                    }
                                                    n5 = n10;
                                                    n3 = n8;
                                                    break Label_0924;
                                                }
                                                if (!this.q(f4)) {
                                                    break;
                                                }
                                                break Label_0936;
                                            }
                                            else {
                                                if (n4 == 2) {
                                                    n11 = 3;
                                                    break Label_0924;
                                                }
                                                break Label_0936;
                                            }
                                        }
                                        else {
                                            if (n4 == 0) {
                                                n11 = 1;
                                                n6 = 1;
                                                break Label_0924;
                                            }
                                            if (n4 != 5) {
                                                break Label_0936;
                                            }
                                        }
                                    }
                                    else {
                                        if (n4 == 2 || n4 == 4) {
                                            n11 = 5;
                                            break Label_0924;
                                        }
                                        break Label_0936;
                                    }
                                }
                                else if (n4 != 5) {
                                    break Label_0936;
                                }
                                n11 = 6;
                            }
                            final int n12 = n7;
                            n4 = n11;
                            o0 = n12;
                        }
                        if (n4 == 2 && n5 && (n3 != Long.MIN_VALUE || n6 != 0) && (n3 != 0L || n6 == 0)) {
                            if (n6 == 0) {
                                n3 = -n3;
                            }
                            this.N0 = n3;
                            this.L0.U2((long)o0);
                            n13 = 16;
                            this.M0 = 16;
                            break Label_0938;
                        }
                        if (n4 == 2 || n4 == 4 || n4 == 7) {
                            this.O0 = o0;
                            n13 = 17;
                            this.M0 = 17;
                            break Label_0938;
                        }
                    }
                    n13 = 0;
                }
                if (n13 != 0) {
                    return n13;
                }
                if (!this.q(this.L0.f(0L))) {
                    this.i("Expected value");
                    throw null;
                }
                this.j();
                throw null;
            }
            else if (n == 1) {
                this.L0.readByte();
                return this.M0 = 4;
            }
        }
        if (n != 1 && n != 2) {
            this.i("Unexpected value");
            throw null;
        }
        this.j();
        throw null;
    }
    
    public final int m(final String s, final a a) {
        for (int length = a.a.length, i = 0; i < length; ++i) {
            if (s.equals(a.a[i])) {
                this.M0 = 0;
                super.H0[super.F0 - 1] = s;
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public final double n2() throws IOException {
        int n;
        if ((n = this.M0) == 0) {
            n = this.l();
        }
        if (n == 16) {
            this.M0 = 0;
            final int[] i0 = super.I0;
            final int n2 = super.F0 - 1;
            ++i0[n2];
            return (double)this.N0;
        }
        Label_0317: {
            if (n == 17) {
                this.P0 = this.L0.K((long)this.O0);
            }
            else if (n == 9) {
                this.P0 = this.z(kle.R0);
            }
            else if (n == 8) {
                this.P0 = this.z(kle.Q0);
            }
            else if (n == 10) {
                this.P0 = this.K();
            }
            else if (n != 11) {
                break Label_0317;
            }
            this.M0 = 11;
            try {
                final double double1 = Double.parseDouble(this.P0);
                if (!Double.isNaN(double1) && !Double.isInfinite(double1)) {
                    this.P0 = null;
                    this.M0 = 0;
                    final int[] i2 = super.I0;
                    final int n3 = super.F0 - 1;
                    ++i2[n3];
                    return double1;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(double1);
                sb.append(" at path ");
                sb.append(this.s());
                throw new nfe(sb.toString());
            }
            catch (final NumberFormatException ex) {
                final StringBuilder f = ehk.f("Expected a double but was ");
                f.append(this.P0);
                f.append(" at path ");
                f.append(this.s());
                throw new xee(f.toString());
            }
        }
        final StringBuilder f2 = ehk.f("Expected a double but was ");
        f2.append(dn.D(this.V2()));
        f2.append(" at path ");
        f2.append(this.s());
        throw new xee(f2.toString());
    }
    
    public final boolean q(final int n) throws IOException {
        if (n != 9 && n != 10 && n != 12 && n != 13 && n != 32) {
            if (n != 35) {
                if (n == 44) {
                    return false;
                }
                if (n != 47 && n != 61) {
                    if (n == 123 || n == 125 || n == 58) {
                        return false;
                    }
                    if (n != 59) {
                        switch (n) {
                            default: {
                                return true;
                            }
                            case 92: {
                                break;
                            }
                            case 91:
                            case 93: {
                                return false;
                            }
                        }
                    }
                }
            }
            this.j();
            throw null;
        }
        return false;
    }
    
    public final int r(final boolean b) throws IOException {
        int n = 0;
        while (true) {
            final ur2 k0 = this.K0;
            final int n2 = n + 1;
            if (k0.E((long)n2)) {
                final byte f = this.L0.f((long)n);
                if (f != 10 && f != 32 && f != 13 && f != 9) {
                    this.L0.U2((long)(n2 - 1));
                    if (f == 47) {
                        if (!this.K0.E(2L)) {
                            return f;
                        }
                        this.j();
                        throw null;
                    }
                    else {
                        if (f != 35) {
                            return f;
                        }
                        this.j();
                        throw null;
                    }
                }
                else {
                    n = n2;
                }
            }
            else {
                if (!b) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("JsonReader(");
        f.append(this.K0);
        f.append(")");
        return f.toString();
    }
    
    public final String z(final a73 a73) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long d1 = this.K0.d1(a73);
            if (d1 == -1L) {
                this.i("Unterminated string");
                throw null;
            }
            if (this.L0.f(d1) == 92) {
                StringBuilder sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.L0.K(d1));
                this.L0.readByte();
                sb2.append(this.L());
                sb = sb2;
            }
            else {
                if (sb == null) {
                    final String k = this.L0.K(d1);
                    this.L0.readByte();
                    return k;
                }
                sb.append(this.L0.K(d1));
                this.L0.readByte();
                return sb.toString();
            }
        }
    }
}

import java.io.EOFException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.io.Reader;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public class fie implements Closeable
{
    public final Reader C0;
    public boolean D0;
    public final char[] E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public int J0;
    public long K0;
    public int L0;
    public String M0;
    public int[] N0;
    public int O0;
    public String[] P0;
    public int[] Q0;
    
    static {
        fb.C0 = new fie$a();
    }
    
    public fie(final Reader c0) {
        this.D0 = false;
        this.E0 = new char[1024];
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = 0;
        final int[] n0 = new int[32];
        this.N0 = n0;
        this.O0 = 0 + 1;
        n0[0] = 6;
        this.P0 = new String[32];
        this.Q0 = new int[32];
        Objects.requireNonNull(c0, "in == null");
        this.C0 = c0;
    }
    
    public final void K(final int n) {
        final int o0 = this.O0;
        final int[] n2 = this.N0;
        if (o0 == n2.length) {
            final int n3 = o0 * 2;
            this.N0 = Arrays.copyOf(n2, n3);
            this.Q0 = Arrays.copyOf(this.Q0, n3);
            this.P0 = Arrays.copyOf(this.P0, n3);
        }
        this.N0[this.O0++] = n;
    }
    
    public boolean K1() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 5) {
            this.J0 = 0;
            final int[] q0 = this.Q0;
            final int n2 = this.O0 - 1;
            ++q0[n2];
            return true;
        }
        if (n == 6) {
            this.J0 = 0;
            final int[] q2 = this.Q0;
            final int n3 = this.O0 - 1;
            ++q2[n3];
            return false;
        }
        final StringBuilder g = w48.g("Expected a boolean but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public void K2() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 7) {
            this.J0 = 0;
            final int[] q0 = this.Q0;
            final int n2 = this.O0 - 1;
            ++q0[n2];
            return;
        }
        final StringBuilder g = w48.g("Expected null but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public final char L() throws IOException {
        if (this.F0 == this.G0 && !this.h(1)) {
            this.T("Unterminated escape sequence");
            throw null;
        }
        final char[] e0 = this.E0;
        final int f0 = this.F0;
        final int n = f0 + 1;
        this.F0 = n;
        final char c = e0[f0];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c == 'b') {
                    return '\b';
                }
                if (c == 'f') {
                    return '\f';
                }
                if (c == 'n') {
                    return '\n';
                }
                if (c == 'r') {
                    return '\r';
                }
                if (c == 't') {
                    return '\t';
                }
                if (c != 'u') {
                    this.T("Invalid escape sequence");
                    throw null;
                }
                if (n + 4 > this.G0 && !this.h(4)) {
                    this.T("Unterminated escape sequence");
                    throw null;
                }
                final char c2 = '\0';
                int f2 = this.F0;
                char c3 = c2;
                while (true) {
                    final int n2 = f2;
                    if (n2 >= f2 + 4) {
                        this.F0 += 4;
                        return c3;
                    }
                    int n3 = this.E0[n2];
                    final char c4 = (char)(c3 << 4);
                    if (n3 >= 48 && n3 <= 57) {
                        n3 -= 48;
                    }
                    else {
                        if (n3 >= 97 && n3 <= 102) {
                            n3 -= 97;
                        }
                        else {
                            if (n3 < 65 || n3 > 70) {
                                final StringBuilder g = w48.g("\\u");
                                g.append(new String(this.E0, this.F0, 4));
                                throw new NumberFormatException(g.toString());
                            }
                            n3 -= 65;
                        }
                        n3 += 10;
                    }
                    final char c5 = (char)(n3 + c4);
                    f2 = n2 + 1;
                    c3 = c5;
                }
            }
        }
        else {
            ++this.H0;
            this.I0 = n;
        }
        return c;
    }
    
    public final void N(final char c) throws IOException {
        final char[] e0 = this.E0;
        while (true) {
            int i = this.F0;
            int n = this.G0;
            while (i < n) {
                final int i2 = i + 1;
                final char c2 = e0[i];
                if (c2 == c) {
                    this.F0 = i2;
                    return;
                }
                if (c2 == '\\') {
                    this.F0 = i2;
                    this.L();
                    i = this.F0;
                    n = this.G0;
                }
                else {
                    if (c2 == '\n') {
                        ++this.H0;
                        this.I0 = i2;
                    }
                    i = i2;
                }
            }
            this.F0 = i;
            if (this.h(1)) {
                continue;
            }
            this.T("Unterminated string");
            throw null;
        }
    }
    
    public String N0() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        String s;
        if (n == 14) {
            s = this.z();
        }
        else if (n == 12) {
            s = this.q('\'');
        }
        else {
            if (n != 13) {
                final StringBuilder g = w48.g("Expected a name but was ");
                g.append(p88.l(this.V2()));
                g.append(this.m());
                throw new IllegalStateException(g.toString());
            }
            s = this.q('\"');
        }
        this.J0 = 0;
        return this.P0[this.O0 - 1] = s;
    }
    
    public final void P() throws IOException {
        while (this.F0 < this.G0 || this.h(1)) {
            final char[] e0 = this.E0;
            final int f0 = this.F0;
            final int n = f0 + 1;
            this.F0 = n;
            final char c = e0[f0];
            if (c == '\n') {
                ++this.H0;
                this.I0 = n;
                break;
            }
            if (c == '\r') {
                break;
            }
        }
    }
    
    public int Q0() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 15) {
            final long k0 = this.K0;
            final int n2 = (int)k0;
            if (k0 == n2) {
                this.J0 = 0;
                final int[] q0 = this.Q0;
                final int n3 = this.O0 - 1;
                ++q0[n3];
                return n2;
            }
            final StringBuilder g = w48.g("Expected an int but was ");
            g.append(this.K0);
            g.append(this.m());
            throw new NumberFormatException(g.toString());
        }
        else {
            if (n == 16) {
                this.M0 = new String(this.E0, this.F0, this.L0);
                this.F0 += this.L0;
            }
            else {
                if (n != 8 && n != 9 && n != 10) {
                    final StringBuilder g2 = w48.g("Expected an int but was ");
                    g2.append(p88.l(this.V2()));
                    g2.append(this.m());
                    throw new IllegalStateException(g2.toString());
                }
                if (n == 10) {
                    this.M0 = this.z();
                }
                else {
                    char c;
                    if (n == 8) {
                        c = '\'';
                    }
                    else {
                        c = '\"';
                    }
                    this.M0 = this.q(c);
                }
                try {
                    final int int1 = Integer.parseInt(this.M0);
                    this.J0 = 0;
                    final int[] q2 = this.Q0;
                    final int n4 = this.O0 - 1;
                    ++q2[n4];
                    return int1;
                }
                catch (final NumberFormatException ex) {}
            }
            this.J0 = 11;
            final double double1 = Double.parseDouble(this.M0);
            final int n5 = (int)double1;
            if (n5 == double1) {
                this.M0 = null;
                this.J0 = 0;
                final int[] q3 = this.Q0;
                final int n6 = this.O0 - 1;
                ++q3[n6];
                return n5;
            }
            final StringBuilder g3 = w48.g("Expected an int but was ");
            g3.append(this.M0);
            g3.append(this.m());
            throw new NumberFormatException(g3.toString());
        }
    }
    
    public String S1() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        String s;
        if (n == 10) {
            s = this.z();
        }
        else if (n == 8) {
            s = this.q('\'');
        }
        else if (n == 9) {
            s = this.q('\"');
        }
        else if (n == 11) {
            s = this.M0;
            this.M0 = null;
        }
        else if (n == 15) {
            s = Long.toString(this.K0);
        }
        else {
            if (n != 16) {
                final StringBuilder g = w48.g("Expected a string but was ");
                g.append(p88.l(this.V2()));
                g.append(this.m());
                throw new IllegalStateException(g.toString());
            }
            s = new String(this.E0, this.F0, this.L0);
            this.F0 += this.L0;
        }
        this.J0 = 0;
        final int[] q0 = this.Q0;
        final int n2 = this.O0 - 1;
        ++q0[n2];
        return s;
    }
    
    public final IOException T(final String s) throws IOException {
        final StringBuilder g = w48.g(s);
        g.append(this.m());
        throw new MalformedJsonException(g.toString());
    }
    
    public int V2() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return 10;
            }
            case 15:
            case 16: {
                return 7;
            }
            case 12:
            case 13:
            case 14: {
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
    
    public void a() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 3) {
            this.K(1);
            this.Q0[this.O0 - 1] = 0;
            this.J0 = 0;
            return;
        }
        final StringBuilder g = w48.g("Expected BEGIN_ARRAY but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public void b() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 1) {
            this.K(3);
            this.J0 = 0;
            return;
        }
        final StringBuilder g = w48.g("Expected BEGIN_OBJECT but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public final void c() throws IOException {
        if (this.D0) {
            return;
        }
        this.T("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
    
    @Override
    public void close() throws IOException {
        this.J0 = 0;
        this.N0[0] = 8;
        this.O0 = 1;
        this.C0.close();
    }
    
    public final int d() throws IOException {
        final int[] n0 = this.N0;
        final int o0 = this.O0;
        final int n2 = n0[o0 - 1];
        if (n2 == 1) {
            n0[o0 - 1] = 2;
        }
        else if (n2 == 2) {
            final int p = this.p(true);
            if (p != 44) {
                if (p != 59) {
                    if (p == 93) {
                        return this.J0 = 4;
                    }
                    this.T("Unterminated array");
                    throw null;
                }
                else {
                    this.c();
                }
            }
        }
        else if (n2 != 3 && n2 != 5) {
            if (n2 == 4) {
                n0[o0 - 1] = 5;
                final int p2 = this.p(true);
                if (p2 != 58) {
                    if (p2 != 61) {
                        this.T("Expected ':'");
                        throw null;
                    }
                    this.c();
                    if (this.F0 < this.G0 || this.h(1)) {
                        final char[] e0 = this.E0;
                        final int f0 = this.F0;
                        if (e0[f0] == '>') {
                            this.F0 = f0 + 1;
                        }
                    }
                }
            }
            else if (n2 == 6) {
                if (this.D0) {
                    this.p(true);
                    final int f2 = this.F0 - 1;
                    this.F0 = f2;
                    if (f2 + 5 <= this.G0 || this.h(5)) {
                        final int f3 = this.F0;
                        final char[] e2 = this.E0;
                        if (e2[f3] == ')' && e2[f3 + 1] == ']' && e2[f3 + 2] == '}' && e2[f3 + 3] == '\'') {
                            if (e2[f3 + 4] == '\n') {
                                this.F0 = f3 + 5;
                            }
                        }
                    }
                }
                this.N0[this.O0 - 1] = 7;
            }
            else if (n2 == 7) {
                if (this.p(false) == -1) {
                    return this.J0 = 17;
                }
                this.c();
                --this.F0;
            }
            else if (n2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            n0[o0 - 1] = 4;
            if (n2 == 5) {
                final int p3 = this.p(true);
                if (p3 != 44) {
                    if (p3 != 59) {
                        if (p3 == 125) {
                            return this.J0 = 2;
                        }
                        this.T("Unterminated object");
                        throw null;
                    }
                    else {
                        this.c();
                    }
                }
            }
            final int p4 = this.p(true);
            if (p4 == 34) {
                return this.J0 = 13;
            }
            if (p4 == 39) {
                this.c();
                return this.J0 = 12;
            }
            if (p4 != 125) {
                this.c();
                --this.F0;
                if (this.k((char)p4)) {
                    return this.J0 = 14;
                }
                this.T("Expected name");
                throw null;
            }
            else {
                if (n2 != 5) {
                    return this.J0 = 2;
                }
                this.T("Expected name");
                throw null;
            }
        }
        final int p5 = this.p(true);
        if (p5 == 34) {
            return this.J0 = 9;
        }
        if (p5 == 39) {
            this.c();
            return this.J0 = 8;
        }
        if (p5 != 44 && p5 != 59) {
            if (p5 == 91) {
                return this.J0 = 3;
            }
            if (p5 != 93) {
                if (p5 == 123) {
                    return this.J0 = 1;
                }
                final int f4 = this.F0 - 1;
                this.F0 = f4;
                final char c = this.E0[f4];
                int j0 = 0;
                Label_0659: {
                    Label_0638: {
                        String s;
                        String s2;
                        if (c != 't' && c != 'T') {
                            if (c != 'f' && c != 'F') {
                                if (c != 'n' && c != 'N') {
                                    break Label_0638;
                                }
                                s = "null";
                                s2 = "NULL";
                                j0 = 7;
                            }
                            else {
                                s = "false";
                                s2 = "FALSE";
                                j0 = 6;
                            }
                        }
                        else {
                            s = "true";
                            s2 = "TRUE";
                            j0 = 5;
                        }
                        final int length = s.length();
                        for (int i = 1; i < length; ++i) {
                            if (this.F0 + i >= this.G0 && !this.h(i + 1)) {
                                break Label_0638;
                            }
                            final char c2 = this.E0[this.F0 + i];
                            if (c2 != s.charAt(i) && c2 != s2.charAt(i)) {
                                break Label_0638;
                            }
                        }
                        if ((this.F0 + length >= this.G0 && !this.h(length + 1)) || !this.k(this.E0[this.F0 + length])) {
                            this.F0 += length;
                            this.J0 = j0;
                            break Label_0659;
                        }
                    }
                    j0 = 0;
                }
                if (j0 != 0) {
                    return j0;
                }
                final char[] e3 = this.E0;
                int f5 = this.F0;
                int g0 = this.G0;
                long k0 = 0L;
                int l0 = 0;
                int n3 = 0;
                int n4 = 1;
                int n5 = 0;
                int n12 = 0;
            Label_1246:
                while (true) {
                    Label_0737: {
                        while (true) {
                            int f6 = f5;
                            int g2 = g0;
                            if (f5 + l0 == g0) {
                                if (l0 == e3.length) {
                                    break;
                                }
                                if (!this.h(l0 + 1)) {
                                    break Label_0737;
                                }
                                f6 = this.F0;
                                g2 = this.G0;
                            }
                            final char c3 = e3[f6 + l0];
                            int n8 = 0;
                            int n9 = 0;
                            long n10 = 0L;
                            int n11 = 0;
                            Label_1218: {
                                if (c3 != '+') {
                                    if (c3 != 'E' && c3 != 'e') {
                                        if (c3 != '-') {
                                            if (c3 != '.') {
                                                if (c3 >= '0' && c3 <= '9') {
                                                    if (n3 != 1 && n3 != 0) {
                                                        if (n3 == 2) {
                                                            if (k0 == 0L) {
                                                                break;
                                                            }
                                                            final long n6 = 10L * k0 - (c3 - '0');
                                                            final long n7 = lcmp(k0, -922337203685477580L);
                                                            n4 &= ((n7 > 0 || (n7 == 0 && n6 < k0)) ? 1 : 0);
                                                            k0 = n6;
                                                            n8 = n3;
                                                        }
                                                        else {
                                                            if (n3 != 3) {
                                                                if (n3 != 5) {
                                                                    n8 = n3;
                                                                    n9 = n4;
                                                                    n10 = k0;
                                                                    n11 = n5;
                                                                    if (n3 != 6) {
                                                                        break Label_1218;
                                                                    }
                                                                }
                                                                n8 = 7;
                                                                n9 = n4;
                                                                n10 = k0;
                                                                n11 = n5;
                                                                break Label_1218;
                                                            }
                                                            n8 = 4;
                                                        }
                                                        n9 = n4;
                                                        n10 = k0;
                                                        n11 = n5;
                                                        break Label_1218;
                                                    }
                                                    n10 = -(c3 - '0');
                                                    n8 = 2;
                                                    n9 = n4;
                                                    n11 = n5;
                                                    break Label_1218;
                                                }
                                                else {
                                                    if (!this.k(c3)) {
                                                        break Label_0737;
                                                    }
                                                    break;
                                                }
                                            }
                                            else {
                                                if (n3 == 2) {
                                                    n8 = 3;
                                                    n9 = n4;
                                                    n10 = k0;
                                                    n11 = n5;
                                                    break Label_1218;
                                                }
                                                break;
                                            }
                                        }
                                        else {
                                            if (n3 == 0) {
                                                n8 = 1;
                                                n11 = 1;
                                                n9 = n4;
                                                n10 = k0;
                                                break Label_1218;
                                            }
                                            if (n3 != 5) {
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        if (n3 == 2 || n3 == 4) {
                                            n8 = 5;
                                            n9 = n4;
                                            n10 = k0;
                                            n11 = n5;
                                            break Label_1218;
                                        }
                                        break;
                                    }
                                }
                                else if (n3 != 5) {
                                    break;
                                }
                                n8 = 6;
                                n11 = n5;
                                n10 = k0;
                                n9 = n4;
                            }
                            ++l0;
                            f5 = f6;
                            g0 = g2;
                            n3 = n8;
                            n4 = n9;
                            k0 = n10;
                            n5 = n11;
                        }
                        n12 = 0;
                        break Label_1246;
                    }
                    if (n3 == 2 && n4 != 0 && (k0 != Long.MIN_VALUE || n5 != 0) && (k0 != 0L || n5 == 0)) {
                        if (n5 == 0) {
                            k0 = -k0;
                        }
                        this.K0 = k0;
                        this.F0 += l0;
                        n12 = 15;
                        this.J0 = 15;
                    }
                    else {
                        if (n3 != 2 && n3 != 4 && n3 != 7) {
                            continue;
                        }
                        this.L0 = l0;
                        n12 = 16;
                        this.J0 = 16;
                    }
                    break;
                }
                if (n12 != 0) {
                    return n12;
                }
                if (this.k(this.E0[this.F0])) {
                    this.c();
                    return this.J0 = 10;
                }
                this.T("Expected value");
                throw null;
            }
            else if (n2 == 1) {
                return this.J0 = 4;
            }
        }
        if (n2 != 1 && n2 != 2) {
            this.T("Unexpected value");
            throw null;
        }
        this.c();
        --this.F0;
        return this.J0 = 7;
    }
    
    public void e() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 4) {
            int o0 = this.O0 - 1;
            this.O0 = o0;
            final int[] q0 = this.Q0;
            --o0;
            ++q0[o0];
            this.J0 = 0;
            return;
        }
        final StringBuilder g = w48.g("Expected END_ARRAY but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public void f() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 2) {
            int o0 = this.O0 - 1;
            this.O0 = o0;
            this.P0[o0] = null;
            final int[] q0 = this.Q0;
            --o0;
            ++q0[o0];
            this.J0 = 0;
            return;
        }
        final StringBuilder g = w48.g("Expected END_OBJECT but was ");
        g.append(p88.l(this.V2()));
        g.append(this.m());
        throw new IllegalStateException(g.toString());
    }
    
    public final boolean h(int n) throws IOException {
        final char[] e0 = this.E0;
        final int i0 = this.I0;
        final int f0 = this.F0;
        this.I0 = i0 - f0;
        final int g0 = this.G0;
        if (g0 != f0) {
            System.arraycopy(e0, f0, e0, 0, this.G0 = g0 - f0);
        }
        else {
            this.G0 = 0;
        }
        this.F0 = 0;
        int j;
        int n2;
        do {
            final Reader c0 = this.C0;
            final int g2 = this.G0;
            final int read = c0.read(e0, g2, e0.length - g2);
            if (read == -1) {
                return false;
            }
            j = this.G0 + read;
            this.G0 = j;
            n2 = n;
            if (this.H0 != 0) {
                continue;
            }
            final int i2 = this.I0;
            n2 = n;
            if (i2 != 0) {
                continue;
            }
            n2 = n;
            if (j <= 0) {
                continue;
            }
            n2 = n;
            if (e0[0] != '\ufeff') {
                continue;
            }
            ++this.F0;
            this.I0 = i2 + 1;
            n2 = n + 1;
        } while (j < (n = n2));
        return true;
    }
    
    public void h0() throws IOException {
        int n = 0;
        int n2 = 0;
        do {
            int n3;
            if ((n3 = this.J0) == 0) {
                n3 = this.d();
            }
            Label_0352: {
                if (n3 == 3) {
                    this.K(1);
                }
                else {
                    if (n3 != 1) {
                        if (n3 == 4) {
                            --this.O0;
                        }
                        else {
                            if (n3 != 2) {
                                if (n3 != 14) {
                                    if (n3 != 10) {
                                        if (n3 == 8 || n3 == 12) {
                                            this.N('\'');
                                            n2 = n;
                                            break Label_0352;
                                        }
                                        if (n3 == 9 || n3 == 13) {
                                            this.N('\"');
                                            n2 = n;
                                            break Label_0352;
                                        }
                                        n2 = n;
                                        if (n3 == 16) {
                                            this.F0 += this.L0;
                                            n2 = n;
                                        }
                                        break Label_0352;
                                    }
                                }
                                do {
                                    int n4 = 0;
                                    Label_0322: {
                                        Label_0318: {
                                            int f0;
                                            while (true) {
                                                f0 = this.F0 + n4;
                                                if (f0 >= this.G0) {
                                                    break;
                                                }
                                                final char c = this.E0[f0];
                                                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                                    break Label_0322;
                                                }
                                                if (c == '#') {
                                                    break Label_0318;
                                                }
                                                if (c == ',') {
                                                    break Label_0322;
                                                }
                                                if (c == '/' || c == '=') {
                                                    break Label_0318;
                                                }
                                                if (c == '{' || c == '}' || c == ':') {
                                                    break Label_0322;
                                                }
                                                if (c == ';') {
                                                    break Label_0318;
                                                }
                                                switch (c) {
                                                    default: {
                                                        ++n4;
                                                        continue;
                                                    }
                                                    case 92: {
                                                        break Label_0318;
                                                    }
                                                    case 91:
                                                    case 93: {
                                                        break Label_0322;
                                                    }
                                                }
                                            }
                                            this.F0 = f0;
                                            continue;
                                        }
                                        this.c();
                                    }
                                    this.F0 += n4;
                                    n2 = n;
                                    break Label_0352;
                                } while (this.h(1));
                                n2 = n;
                                break Label_0352;
                            }
                            --this.O0;
                        }
                        n2 = n - 1;
                        break Label_0352;
                    }
                    this.K(3);
                }
                n2 = n + 1;
            }
            this.J0 = 0;
        } while ((n = n2) != 0);
        final int[] q0 = this.Q0;
        final int o0 = this.O0;
        final int n5 = o0 - 1;
        ++q0[n5];
        this.P0[o0 - 1] = "null";
    }
    
    public boolean hasNext() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        return n != 2 && n != 4 && n != 17;
    }
    
    public final String i(final boolean b) {
        final StringBuilder l = ffa.l('$');
        int n = 0;
        while (true) {
            final int o0 = this.O0;
            if (n >= o0) {
                break;
            }
            final int n2 = this.N0[n];
            if (n2 != 1 && n2 != 2) {
                if (n2 == 3 || n2 == 4 || n2 == 5) {
                    l.append('.');
                    final String[] p = this.P0;
                    if (p[n] != null) {
                        l.append(p[n]);
                    }
                }
            }
            else {
                int n4;
                final int n3 = n4 = this.Q0[n];
                if (b && (n4 = n3) > 0) {
                    n4 = n3;
                    if (n == o0 - 1) {
                        n4 = n3 - 1;
                    }
                }
                l.append('[');
                l.append(n4);
                l.append(']');
            }
            ++n;
        }
        return l.toString();
    }
    
    public String j() {
        return this.i(true);
    }
    
    public final boolean k(final char c) throws IOException {
        if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
            if (c != '#') {
                if (c == ',') {
                    return false;
                }
                if (c != '/' && c != '=') {
                    if (c == '{' || c == '}' || c == ':') {
                        return false;
                    }
                    if (c != ';') {
                        switch (c) {
                            default: {
                                return true;
                            }
                            case '\\': {
                                break;
                            }
                            case '[':
                            case ']': {
                                return false;
                            }
                        }
                    }
                }
            }
            this.c();
        }
        return false;
    }
    
    public final String m() {
        final StringBuilder j = sbl.j(" at line ", this.H0 + 1, " column ", this.F0 - this.I0 + 1, " path ");
        j.append(this.r());
        return j.toString();
    }
    
    public double n2() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 15) {
            this.J0 = 0;
            final int[] q0 = this.Q0;
            final int n2 = this.O0 - 1;
            ++q0[n2];
            return (double)this.K0;
        }
        if (n == 16) {
            this.M0 = new String(this.E0, this.F0, this.L0);
            this.F0 += this.L0;
        }
        else if (n != 8 && n != 9) {
            if (n == 10) {
                this.M0 = this.z();
            }
            else if (n != 11) {
                final StringBuilder g = w48.g("Expected a double but was ");
                g.append(p88.l(this.V2()));
                g.append(this.m());
                throw new IllegalStateException(g.toString());
            }
        }
        else {
            char c;
            if (n == 8) {
                c = '\'';
            }
            else {
                c = '\"';
            }
            this.M0 = this.q(c);
        }
        this.J0 = 11;
        final double double1 = Double.parseDouble(this.M0);
        if (!this.D0 && (Double.isNaN(double1) || Double.isInfinite(double1))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(double1);
            sb.append(this.m());
            throw new MalformedJsonException(sb.toString());
        }
        this.M0 = null;
        this.J0 = 0;
        final int[] q2 = this.Q0;
        final int n3 = this.O0 - 1;
        ++q2[n3];
        return double1;
    }
    
    public long n3() throws IOException {
        int n;
        if ((n = this.J0) == 0) {
            n = this.d();
        }
        if (n == 15) {
            this.J0 = 0;
            final int[] q0 = this.Q0;
            final int n2 = this.O0 - 1;
            ++q0[n2];
            return this.K0;
        }
        if (n == 16) {
            this.M0 = new String(this.E0, this.F0, this.L0);
            this.F0 += this.L0;
        }
        else {
            if (n != 8 && n != 9 && n != 10) {
                final StringBuilder g = w48.g("Expected a long but was ");
                g.append(p88.l(this.V2()));
                g.append(this.m());
                throw new IllegalStateException(g.toString());
            }
            if (n == 10) {
                this.M0 = this.z();
            }
            else {
                char c;
                if (n == 8) {
                    c = '\'';
                }
                else {
                    c = '\"';
                }
                this.M0 = this.q(c);
            }
            try {
                final long long1 = Long.parseLong(this.M0);
                this.J0 = 0;
                final int[] q2 = this.Q0;
                final int n3 = this.O0 - 1;
                ++q2[n3];
                return long1;
            }
            catch (final NumberFormatException ex) {}
        }
        this.J0 = 11;
        final double double1 = Double.parseDouble(this.M0);
        final long n4 = (long)double1;
        if (n4 == double1) {
            this.M0 = null;
            this.J0 = 0;
            final int[] q3 = this.Q0;
            final int n5 = this.O0 - 1;
            ++q3[n5];
            return n4;
        }
        final StringBuilder g2 = w48.g("Expected a long but was ");
        g2.append(this.M0);
        g2.append(this.m());
        throw new NumberFormatException(g2.toString());
    }
    
    public final int p(final boolean b) throws IOException {
        final char[] e0 = this.E0;
        int f0 = this.F0;
        int n = this.G0;
        while (true) {
            final int n2 = 1;
            int f2 = f0;
            int g0 = n;
            if (f0 == n) {
                this.F0 = f0;
                if (!this.h(1)) {
                    if (!b) {
                        return -1;
                    }
                    final StringBuilder g2 = w48.g("End of input");
                    g2.append(this.m());
                    throw new EOFException(g2.toString());
                }
                else {
                    f2 = this.F0;
                    g0 = this.G0;
                }
            }
            f0 = f2 + 1;
            final char c = e0[f2];
            if (c == '\n') {
                ++this.H0;
                this.I0 = f0;
            }
            else if (c != ' ' && c != '\r') {
                if (c != '\t') {
                    if (c == '/') {
                        if ((this.F0 = f0) == g0) {
                            this.F0 = f0 - 1;
                            final boolean h = this.h(2);
                            ++this.F0;
                            if (!h) {
                                return c;
                            }
                        }
                        this.c();
                        final int f3 = this.F0;
                        final char c2 = e0[f3];
                        if (c2 != '*') {
                            if (c2 != '/') {
                                return c;
                            }
                            this.F0 = f3 + 1;
                            this.P();
                            f0 = this.F0;
                            n = this.G0;
                            continue;
                        }
                        else {
                            this.F0 = f3 + 1;
                            int n4 = 0;
                        Label_0399:
                            while (true) {
                                final int f4 = this.F0;
                                final int g3 = this.G0;
                                int n3 = 0;
                                if (f4 + 2 > g3 && !this.h(2)) {
                                    n4 = 0;
                                    break;
                                }
                                final char[] e2 = this.E0;
                                final int f5 = this.F0;
                                if (e2[f5] == '\n') {
                                    ++this.H0;
                                    this.I0 = f5 + 1;
                                }
                                else {
                                    while (true) {
                                        n4 = n2;
                                        if (n3 >= 2) {
                                            break Label_0399;
                                        }
                                        if (this.E0[this.F0 + n3] != "*/".charAt(n3)) {
                                            break;
                                        }
                                        ++n3;
                                    }
                                }
                                ++this.F0;
                            }
                            if (n4 != 0) {
                                f0 = this.F0 + 2;
                                n = this.G0;
                                continue;
                            }
                            this.T("Unterminated comment");
                            throw null;
                        }
                    }
                    else {
                        if (c == '#') {
                            this.F0 = f0;
                            this.c();
                            this.P();
                            f0 = this.F0;
                            n = this.G0;
                            continue;
                        }
                        this.F0 = f0;
                        return c;
                    }
                }
            }
            n = g0;
        }
    }
    
    public final String q(final char c) throws IOException {
        final char[] e0 = this.E0;
        StringBuilder sb = null;
    Label_0007:
        while (true) {
            while (true) {
                int n = this.F0;
                int n2 = this.G0;
                while (true) {
                    int i0 = n;
                    while (true) {
                        final int f0 = i0;
                        if (f0 < n2) {
                            i0 = f0 + 1;
                            final char c2 = e0[f0];
                            if (c2 == c) {
                                this.F0 = i0;
                                final int n3 = i0 - n - 1;
                                if (sb == null) {
                                    return new String(e0, n, n3);
                                }
                                sb.append(e0, n, n3);
                                return sb.toString();
                            }
                            else {
                                if (c2 == '\\') {
                                    this.F0 = i0;
                                    final int n4 = i0 - n - 1;
                                    StringBuilder sb2;
                                    if ((sb2 = sb) == null) {
                                        sb2 = new StringBuilder(Math.max((n4 + 1) * 2, 16));
                                    }
                                    sb2.append(e0, n, n4);
                                    sb2.append(this.L());
                                    n = this.F0;
                                    n2 = this.G0;
                                    sb = sb2;
                                    break;
                                }
                                if (c2 != '\n') {
                                    continue;
                                }
                                ++this.H0;
                                this.I0 = i0;
                            }
                        }
                        else {
                            StringBuilder sb3;
                            if ((sb3 = sb) == null) {
                                sb3 = new StringBuilder(Math.max((f0 - n) * 2, 16));
                            }
                            sb3.append(e0, n, f0 - n);
                            this.F0 = f0;
                            if (this.h(1)) {
                                sb = sb3;
                                continue Label_0007;
                            }
                            this.T("Unterminated string");
                            throw null;
                        }
                    }
                }
            }
            break;
        }
    }
    
    public String r() {
        return this.i(false);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(this.m());
        return sb.toString();
    }
    
    public final String z() throws IOException {
        final int n = 0;
        StringBuilder sb = null;
        while (true) {
            do {
                int n2 = 0;
                Label_0187: {
                    Label_0158: {
                        while (true) {
                            final int f0 = this.F0;
                            if (f0 + n2 < this.G0) {
                                final char c = this.E0[f0 + n2];
                                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                                    break Label_0187;
                                }
                                if (c == '#') {
                                    break Label_0158;
                                }
                                if (c == ',') {
                                    break Label_0187;
                                }
                                if (c == '/' || c == '=') {
                                    break Label_0158;
                                }
                                if (c == '{' || c == '}' || c == ':') {
                                    break Label_0187;
                                }
                                if (c == ';') {
                                    break Label_0158;
                                }
                                switch (c) {
                                    default: {
                                        ++n2;
                                        continue;
                                    }
                                    case 92: {
                                        break Label_0158;
                                    }
                                    case 91:
                                    case 93: {
                                        break Label_0187;
                                    }
                                }
                            }
                            else {
                                if (n2 >= this.E0.length) {
                                    break;
                                }
                                if (this.h(n2 + 1)) {
                                    continue;
                                }
                                break Label_0187;
                            }
                        }
                        StringBuilder sb2;
                        if ((sb2 = sb) == null) {
                            sb2 = new StringBuilder(Math.max(n2, 16));
                        }
                        sb2.append(this.E0, this.F0, n2);
                        this.F0 += n2;
                        sb = sb2;
                        continue;
                    }
                    this.c();
                }
                StringBuilder sb2 = sb;
                String string;
                if (sb2 == null) {
                    string = new String(this.E0, this.F0, n2);
                }
                else {
                    sb2.append(this.E0, this.F0, n2);
                    string = sb2.toString();
                }
                this.F0 += n2;
                return string;
            } while (this.h(1));
            int n2 = n;
            continue;
        }
    }
}

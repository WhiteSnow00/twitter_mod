import java.util.ArrayList;
import com.apollographql.apollo3.exception.JsonEncodingException;
import java.util.List;
import java.io.EOFException;
import com.apollographql.apollo3.exception.JsonDataException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class er2 implements ohe
{
    public static final a Companion;
    public static final i63 P0;
    public static final i63 Q0;
    public static final i63 R0;
    public static final i63 S0;
    public final dr2 D0;
    public final lq2 E0;
    public int F0;
    public long G0;
    public int H0;
    public String I0;
    public final int[] J0;
    public int K0;
    public final String[] L0;
    public final int[] M0;
    public final int[] N0;
    public int O0;
    
    static {
        Companion = new a();
        final i63$a companion = i63.Companion;
        P0 = companion.c("'\\");
        Q0 = companion.c("\"\\");
        R0 = companion.c("{}[]:, \n\t\r/\\;#=");
        S0 = companion.c("\n\r");
    }
    
    public er2(final dr2 d0) {
        this.D0 = d0;
        this.E0 = ((m2m)d0).E0;
        final int[] j0 = new int[256];
        j0[0] = 6;
        this.J0 = j0;
        this.K0 = 1;
        this.L0 = new String[256];
        this.M0 = new int[256];
        final int[] n0 = new int[256];
        n0[0] = 0;
        this.N0 = n0;
        this.O0 = 1;
    }
    
    public final ohe F() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 1) {
            this.i(3);
            this.F0 = 0;
            final int o0 = this.O0 + 1;
            this.O0 = o0;
            this.N0[o0 - 1] = 0;
            return (ohe)this;
        }
        final StringBuilder j = fu8.j("Expected BEGIN_OBJECT but was ");
        j.append(yvl.X(this.U2()));
        j.append(" at path ");
        j.append(this.c());
        throw new JsonDataException(j.toString());
    }
    
    public final void G() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.".toString());
    }
    
    public final ohe H() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 4) {
            int k0 = this.K0 - 1;
            this.K0 = k0;
            final int[] m0 = this.M0;
            --k0;
            ++m0[k0];
            this.F0 = 0;
            return (ohe)this;
        }
        final StringBuilder j = fu8.j("Expected END_ARRAY but was ");
        j.append(yvl.X(this.U2()));
        j.append(" at path ");
        j.append(this.c());
        throw new JsonDataException(j.toString());
    }
    
    public final ohe I() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 3) {
            this.i(1);
            this.M0[this.K0 - 1] = 0;
            this.F0 = 0;
            return (ohe)this;
        }
        final StringBuilder j = fu8.j("Expected BEGIN_ARRAY but was ");
        j.append(yvl.X(this.U2()));
        j.append(" at path ");
        j.append(this.c());
        throw new JsonDataException(j.toString());
    }
    
    public final boolean J1() {
        Integer value = this.F0;
        final int intValue = value.intValue();
        boolean b = false;
        if (intValue == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n != 5) {
            if (n != 6) {
                final StringBuilder j = fu8.j("Expected a boolean but was ");
                j.append(yvl.X(this.U2()));
                j.append(" at path ");
                j.append(this.c());
                throw new JsonDataException(j.toString());
            }
            this.F0 = 0;
            final int[] m0 = this.M0;
            final int n2 = this.K0 - 1;
            ++m0[n2];
        }
        else {
            this.F0 = 0;
            final int[] m2 = this.M0;
            final int n3 = this.K0 - 1;
            ++m2[n3];
            b = true;
        }
        return b;
    }
    
    public final void J2() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 7) {
            this.F0 = 0;
            final int[] m0 = this.M0;
            final int n2 = this.K0 - 1;
            ++m0[n2];
            return;
        }
        final StringBuilder j = fu8.j("Expected null but was ");
        j.append(yvl.X(this.U2()));
        j.append(" at path ");
        j.append(this.c());
        throw new JsonDataException(j.toString());
    }
    
    public final String M0() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        String s = null;
        switch (n) {
            default: {
                final StringBuilder j = fu8.j("Expected a name but was ");
                j.append(yvl.X(this.U2()));
                j.append(" at path ");
                j.append(this.c());
                throw new JsonDataException(j.toString());
            }
            case 14: {
                s = this.h();
                break;
            }
            case 13: {
                s = this.f(er2.Q0);
                break;
            }
            case 12: {
                s = this.f(er2.P0);
                break;
            }
        }
        this.F0 = 0;
        return this.L0[this.K0 - 1] = s;
    }
    
    public final ohe P() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 2) {
            int k0 = this.K0 - 1;
            this.K0 = k0;
            this.L0[k0] = null;
            final int[] m0 = this.M0;
            --k0;
            ++m0[k0];
            this.F0 = 0;
            --this.O0;
            return (ohe)this;
        }
        final StringBuilder j = fu8.j("Expected END_OBJECT but was ");
        j.append(yvl.X(this.U2()));
        j.append(" at path ");
        j.append(this.c());
        throw new JsonDataException(j.toString());
    }
    
    public final int P0() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 15) {
            final long g0 = this.G0;
            final int n2 = (int)g0;
            if (g0 == n2) {
                this.F0 = 0;
                final int[] m0 = this.M0;
                final int n3 = this.K0 - 1;
                ++m0[n3];
                return n2;
            }
            final StringBuilder j = fu8.j("Expected an int but was ");
            j.append(this.G0);
            j.append(" at path ");
            j.append(this.r());
            throw new JsonDataException(j.toString());
        }
        else {
            while (true) {
                if (n == 16) {
                    this.I0 = this.E0.J((long)this.H0);
                    break Label_0330;
                }
                i63 i2;
                if (n != 9 && n != 8) {
                    if (n == 11) {
                        break Label_0330;
                    }
                    final StringBuilder i = fu8.j("Expected an int but was ");
                    i.append(yvl.X(this.U2()));
                    i.append(" at path ");
                    i.append(this.c());
                    throw new JsonDataException(i.toString());
                }
                else if (n == 9) {
                    i2 = er2.Q0;
                }
                else {
                    i2 = er2.P0;
                }
                final String f = this.f(i2);
                this.I0 = f;
                try {
                    final int int1 = Integer.parseInt(f);
                    this.F0 = 0;
                    final int[] m2 = this.M0;
                    final int n4 = this.K0 - 1;
                    ++m2[n4];
                    return int1;
                    this.F0 = 11;
                    try {
                        final String i3 = this.I0;
                        czd.c((Object)i3);
                        final double double1 = Double.parseDouble(i3);
                        final int n5 = (int)double1;
                        if (n5 == double1) {
                            this.I0 = null;
                            this.F0 = 0;
                            final int[] m3 = this.M0;
                            final int n6 = this.K0 - 1;
                            ++m3[n6];
                            return n5;
                        }
                        final StringBuilder k = fu8.j("Expected an int but was ");
                        k.append(this.I0);
                        k.append(" at path ");
                        k.append(this.c());
                        throw new JsonDataException(k.toString());
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder l = fu8.j("Expected an int but was ");
                        l.append(this.I0);
                        l.append(" at path ");
                        l.append(this.c());
                        throw new JsonDataException(l.toString());
                    }
                }
                catch (final NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final String R1() {
        Integer value = this.F0;
        final boolean b = value.intValue() == 0;
        final String s = null;
        if (b) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        String s2;
        if (n != 15) {
            if (n != 16) {
                switch (n) {
                    default: {
                        final StringBuilder j = fu8.j("Expected a string but was ");
                        j.append(yvl.X(this.U2()));
                        j.append(" at path ");
                        j.append(this.c());
                        throw new JsonDataException(j.toString());
                    }
                    case 11: {
                        final String i0 = this.I0;
                        s2 = s;
                        if (i0 != null) {
                            this.I0 = null;
                            s2 = i0;
                            break;
                        }
                        break;
                    }
                    case 10: {
                        s2 = this.h();
                        break;
                    }
                    case 9: {
                        s2 = this.f(er2.Q0);
                        break;
                    }
                    case 8: {
                        s2 = this.f(er2.P0);
                        break;
                    }
                }
            }
            else {
                s2 = this.E0.J((long)this.H0);
            }
        }
        else {
            s2 = String.valueOf(this.G0);
        }
        this.F0 = 0;
        final int[] m0 = this.M0;
        final int n2 = this.K0 - 1;
        ++m0[n2];
        return s2;
    }
    
    public final int U2() {
        Integer value = this.F0;
        final int intValue = value.intValue();
        final int n = 1;
        if (intValue == 0) {
            value = null;
        }
        int n2;
        if (value != null) {
            n2 = value;
        }
        else {
            n2 = this.b();
        }
        int n3 = n;
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 3: {
                return n3;
            }
            case 17: {
                n3 = 11;
                return n3;
            }
            case 16: {
                n3 = 7;
                return n3;
            }
            case 15: {
                n3 = 8;
                return n3;
            }
            case 12:
            case 13:
            case 14: {
                n3 = 5;
                return n3;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                n3 = 6;
                return n3;
            }
            case 7: {
                n3 = 10;
                return n3;
            }
            case 5:
            case 6: {
                n3 = 9;
                return n3;
            }
            case 4: {
                n3 = 2;
                return n3;
            }
            case 2: {
                n3 = 4;
                return n3;
            }
            case 1: {
                n3 = 3;
                return n3;
            }
        }
    }
    
    public final void a() {
        throw this.m("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    public final int b() {
        final int[] j0 = this.J0;
        final int k0 = this.K0;
        final int n = j0[k0 - 1];
        int n2 = 2;
        switch (n) {
            default: {
                if (n != 8) {
                    break;
                }
                throw new IllegalStateException("JsonReader is closed".toString());
            }
            case 7: {
                if (this.e(false) == -1) {
                    return this.F0 = 17;
                }
                this.a();
                throw null;
            }
            case 6: {
                j0[k0 - 1] = 7;
                break;
            }
            case 4: {
                j0[k0 - 1] = 5;
                final int e = this.e(true);
                this.E0.readByte();
                final char c = (char)e;
                if (c == ':') {
                    break;
                }
                if (c == '=') {
                    this.a();
                    throw null;
                }
                throw this.m("Expected ':'");
            }
            case 3:
            case 5: {
                j0[k0 - 1] = 4;
                if (n == 5) {
                    final int e2 = this.e(true);
                    this.E0.readByte();
                    final char c2 = (char)e2;
                    if (c2 == '}') {
                        return this.F0 = 2;
                    }
                    if (c2 == ';') {
                        this.a();
                        throw null;
                    }
                    if (c2 != ',') {
                        throw this.m("Unterminated object");
                    }
                }
                final char c3 = (char)this.e(true);
                if (c3 == '\"') {
                    this.E0.readByte();
                    n2 = 13;
                    this.F0 = 13;
                }
                else {
                    if (c3 == '\'') {
                        this.E0.readByte();
                        this.a();
                        throw null;
                    }
                    if (c3 != '}') {
                        this.a();
                        throw null;
                    }
                    if (n == 5) {
                        throw this.m("Expected name");
                    }
                    this.E0.readByte();
                    this.F0 = 2;
                }
                return n2;
            }
            case 2: {
                final int e3 = this.e(true);
                this.E0.readByte();
                final char c4 = (char)e3;
                if (c4 == ']') {
                    return this.F0 = 4;
                }
                if (c4 == ';') {
                    this.a();
                    throw null;
                }
                if (c4 == ',') {
                    break;
                }
                throw this.m("Unterminated array");
            }
            case 1: {
                j0[k0 - 1] = 2;
                break;
            }
        }
        final char c5 = (char)this.e(true);
        if (c5 == ']') {
            if (n == 1) {
                this.E0.readByte();
                return this.F0 = 4;
            }
            if (n != 1 && n != 2) {
                throw this.m("Unexpected value");
            }
            this.a();
            throw null;
        }
        else if (c5 == ';' || c5 == ',') {
            if (n != 1 && n != 2) {
                throw this.m("Unexpected value");
            }
            this.a();
            throw null;
        }
        else {
            if (c5 == '\'') {
                this.a();
                throw null;
            }
            if (c5 == '\"') {
                this.E0.readByte();
                return this.F0 = 9;
            }
            if (c5 == '[') {
                this.E0.readByte();
                return this.F0 = 3;
            }
            if (c5 == '{') {
                this.E0.readByte();
                return this.F0 = 1;
            }
            final byte f = this.E0.f(0L);
            boolean b = false;
            Label_0628: {
                if (f != (byte)116) {
                    if (f != (byte)84) {
                        b = false;
                        break Label_0628;
                    }
                }
                b = true;
            }
            int f2 = 0;
            Label_0879: {
                Label_0771: {
                    String s;
                    String s2;
                    if (b) {
                        s = "true";
                        s2 = "TRUE";
                        f2 = 5;
                    }
                    else {
                        boolean b2 = false;
                        Label_0671: {
                            if (f != (byte)102) {
                                if (f != (byte)70) {
                                    b2 = false;
                                    break Label_0671;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            s = "false";
                            s2 = "FALSE";
                            f2 = 6;
                        }
                        else {
                            boolean b3 = false;
                            Label_0715: {
                                if (f != (byte)110) {
                                    if (f != (byte)78) {
                                        b3 = false;
                                        break Label_0715;
                                    }
                                }
                                b3 = true;
                            }
                            if (!b3) {
                                break Label_0771;
                            }
                            s = "null";
                            s2 = "NULL";
                            f2 = 7;
                        }
                    }
                    final int length = s.length();
                    for (int i = 1; i < length; ++i) {
                        final dr2 d0 = this.D0;
                        final long n3 = i;
                        if (!d0.D(n3 + 1L)) {
                            break Label_0771;
                        }
                        final byte f3 = this.E0.f(n3);
                        if (f3 != (byte)s.charAt(i) && f3 != (byte)s2.charAt(i)) {
                            break Label_0771;
                        }
                    }
                    final dr2 d2 = this.D0;
                    final long n4 = length;
                    if (!d2.D(n4 + 1L) || !this.d((char)this.E0.f(n4))) {
                        this.E0.T2(n4);
                        this.F0 = f2;
                        break Label_0879;
                    }
                }
                f2 = 0;
            }
            if (f2 != 0) {
                return f2;
            }
            int h0 = 0;
            int n5 = 0;
            boolean b4 = false;
            long g0 = 0L;
            boolean b5 = true;
            int n9 = 0;
            Label_1323: {
                Label_1303: {
                    long n6;
                    while (true) {
                        final dr2 d3 = this.D0;
                        n6 = h0;
                        if (!d3.D(n6 + 1L)) {
                            break;
                        }
                        final byte f4 = this.E0.f(n6);
                        final char c6 = (char)f4;
                        Label_1040: {
                            if (c6 == '-') {
                                if (n5 == 0) {
                                    n5 = 1;
                                    b4 = true;
                                    break Label_1040;
                                }
                                if (n5 != 5) {
                                    break Label_1303;
                                }
                            }
                            else if (c6 == '+') {
                                if (n5 != 5) {
                                    break Label_1303;
                                }
                            }
                            else {
                                boolean b6 = false;
                                Label_1004: {
                                    if (c6 != 'e') {
                                        if (c6 != 'E') {
                                            b6 = false;
                                            break Label_1004;
                                        }
                                    }
                                    b6 = true;
                                }
                                if (b6) {
                                    if (n5 != 2 && n5 != 4) {
                                        break Label_1303;
                                    }
                                    n5 = 5;
                                    break Label_1040;
                                }
                                else if (c6 == '.') {
                                    if (n5 == 2) {
                                        n5 = 3;
                                        break Label_1040;
                                    }
                                    break Label_1303;
                                }
                                else {
                                    final byte b7 = 48;
                                    if (f4 >= b7 && f4 <= (byte)57) {
                                        if (n5 == 0 || n5 == 1) {
                                            g0 = -(f4 - b7);
                                            n5 = 2;
                                            break Label_1040;
                                        }
                                        if (n5 != 2) {
                                            if (n5 == 3) {
                                                n5 = 4;
                                                break Label_1040;
                                            }
                                            if (n5 != 5 && n5 != 6) {
                                                break Label_1040;
                                            }
                                            n5 = 7;
                                            break Label_1040;
                                        }
                                        else {
                                            if (g0 == 0L) {
                                                break Label_1303;
                                            }
                                            final long n7 = 10 * g0 - (f4 - b7);
                                            final long n8 = lcmp(g0, -922337203685477580L);
                                            b5 = ((n8 > 0 & b5) || (n8 == 0 && n7 < g0));
                                            g0 = n7;
                                            break Label_1040;
                                        }
                                    }
                                    else {
                                        if (!this.d(c6)) {
                                            break;
                                        }
                                        break Label_1303;
                                    }
                                }
                            }
                            n5 = 6;
                        }
                        ++h0;
                    }
                    if (n5 == 2 && b5 && (g0 != Long.MIN_VALUE || b4)) {
                        if (!b4) {
                            g0 = -g0;
                        }
                        this.G0 = g0;
                        this.E0.T2(n6);
                        n9 = 15;
                        this.F0 = 15;
                        break Label_1323;
                    }
                    if (n5 == 2 || n5 == 4 || n5 == 7) {
                        this.H0 = h0;
                        n9 = 16;
                        this.F0 = 16;
                        break Label_1323;
                    }
                }
                n9 = 0;
            }
            if (n9 != 0) {
                return n9;
            }
            if (!this.d((char)this.E0.f(0L))) {
                throw this.m("Expected value");
            }
            this.a();
            throw null;
        }
    }
    
    public final String c() {
        return mq4.m0((Iterable)this.r(), (CharSequence)".", (CharSequence)null, (CharSequence)null, (qsb)null, 62);
    }
    
    public final void close() {
        this.F0 = 0;
        this.J0[0] = 8;
        this.K0 = 1;
        this.E0.a();
        ((tlq)this.D0).close();
    }
    
    public final boolean d(final char c) {
        final int n = 0;
        if (c != '/' && c != '\\' && c != ';' && c != '#' && c != '=') {
            if (c != '{' && c != '}' && c != '[' && c != ']' && c != ':' && c != ',' && c != ' ' && c != '\t' && c != '\r') {
                final int n2 = n;
                if (c != '\n') {
                    return (n2 ^ 0x1) != 0x0;
                }
            }
            final int n2 = 1;
            return (n2 ^ 0x1) != 0x0;
        }
        this.a();
        throw null;
    }
    
    public final int e(final boolean b) {
        int n = 0;
        while (true) {
            final dr2 d0 = this.D0;
            final long n2 = n;
            if (d0.D(n2 + 1L)) {
                final lq2 e0 = this.E0;
                final int n3 = n + 1;
                final byte f = e0.f(n2);
                n = n3;
                if (f == 10) {
                    continue;
                }
                n = n3;
                if (f == 32) {
                    continue;
                }
                n = n3;
                if (f == 13) {
                    continue;
                }
                if (f == 9) {
                    n = n3;
                }
                else {
                    this.E0.T2(n3 - 1L);
                    if (f == 47) {
                        if (!this.D0.D(2L)) {
                            return f;
                        }
                        this.a();
                        throw null;
                    }
                    else {
                        if (f != 35) {
                            return f;
                        }
                        this.a();
                        throw null;
                    }
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
    
    public final String f(final i63 i63) {
        StringBuilder sb = null;
        while (true) {
            final long c1 = this.D0.c1(i63);
            if (c1 == -1L) {
                throw this.m("Unterminated string");
            }
            if (this.E0.f(c1) != (byte)92) {
                String s;
                if (sb == null) {
                    s = this.E0.J(c1);
                    this.E0.readByte();
                }
                else {
                    sb.append(this.E0.J(c1));
                    this.E0.readByte();
                    s = sb.toString();
                    czd.e((Object)s, "{\n        builder.append\u2026uilder.toString()\n      }");
                }
                return s;
            }
            StringBuilder sb2;
            if ((sb2 = sb) == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.E0.J(c1));
            this.E0.readByte();
            sb2.append(this.j());
            sb = sb2;
        }
    }
    
    public final void g0() {
        int n = 0;
        int i = 0;
        do {
            Integer value = this.F0;
            if (value.intValue() == 0) {
                value = null;
            }
            int n2;
            if (value != null) {
                n2 = value;
            }
            else {
                n2 = this.b();
            }
            Label_0276: {
                Label_0272: {
                    switch (n2) {
                        default: {
                            i = n;
                            break Label_0276;
                        }
                        case 16: {
                            this.E0.T2((long)this.H0);
                            i = n;
                            break Label_0276;
                        }
                        case 10:
                        case 14: {
                            long n3 = this.D0.c1(er2.R0);
                            final lq2 e0 = this.E0;
                            if (n3 == -1L) {
                                n3 = e0.E0;
                            }
                            e0.T2(n3);
                            i = n;
                            break Label_0276;
                        }
                        case 9:
                        case 13: {
                            this.k(er2.Q0);
                            i = n;
                            break Label_0276;
                        }
                        case 8:
                        case 12: {
                            this.k(er2.P0);
                            i = n;
                            break Label_0276;
                        }
                        case 4: {
                            --this.K0;
                            break;
                        }
                        case 3: {
                            this.i(1);
                            break Label_0272;
                        }
                        case 2: {
                            --this.K0;
                            break;
                        }
                        case 1: {
                            this.i(3);
                            break Label_0272;
                        }
                    }
                    i = n - 1;
                    break Label_0276;
                }
                i = n + 1;
            }
            this.F0 = 0;
            n = i;
        } while (i != 0);
        final int[] m0 = this.M0;
        final int k0 = this.K0;
        final int n4 = k0 - 1;
        ++m0[n4];
        this.L0[k0 - 1] = "null";
    }
    
    public final String h() {
        final long c1 = this.D0.c1(er2.R0);
        String s;
        if (c1 != -1L) {
            s = this.E0.J(c1);
        }
        else {
            s = this.E0.y();
        }
        return s;
    }
    
    public final boolean hasNext() {
        Integer value = this.F0;
        final int intValue = value.intValue();
        boolean b = true;
        if (intValue == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 2 || n == 4) {
            b = false;
        }
        return b;
    }
    
    public final void i(final int n) {
        final int k0 = this.K0;
        final int[] j0 = this.J0;
        if (k0 != j0.length) {
            this.K0 = k0 + 1;
            j0[k0] = n;
            return;
        }
        final StringBuilder i = fu8.j("Nesting too deep at ");
        i.append(this.r());
        throw new JsonDataException(i.toString());
    }
    
    public final kge i3() {
        final String r1 = this.R1();
        czd.c((Object)r1);
        return new kge(r1);
    }
    
    public final char j() {
        if (this.D0.D(1L)) {
            char c = (char)this.E0.readByte();
            final int n = 0;
            int i = 0;
            if (c == 'u') {
                if (!this.D0.D(4L)) {
                    final StringBuilder j = fu8.j("Unterminated escape sequence at path ");
                    j.append(this.r());
                    throw new EOFException(j.toString());
                }
                c = '\0';
                while (i < 4) {
                    final byte f = this.E0.f((long)i);
                    final char c2 = (char)(c << 4);
                    final byte b = 48;
                    int n2;
                    if (f >= b && f <= (byte)57) {
                        n2 = f - b;
                    }
                    else {
                        byte b2 = 97;
                        if (f < b2 || f > (byte)102) {
                            b2 = 65;
                            if (f < b2 || f > (byte)70) {
                                final StringBuilder k = fu8.j("\\u");
                                k.append(this.E0.J(4L));
                                throw this.m(k.toString());
                            }
                        }
                        n2 = f - b2 + 10;
                    }
                    c = (char)(c2 + n2);
                    ++i;
                }
                this.E0.T2(4L);
            }
            else if (c == 't') {
                c = '\t';
            }
            else if (c == 'b') {
                c = '\b';
            }
            else if (c == 'n') {
                c = '\n';
            }
            else if (c == 'r') {
                c = '\r';
            }
            else if (c == 'f') {
                c = '\f';
            }
            else {
                boolean b3 = false;
                Label_0316: {
                    if (c != '\n') {
                        if (c != '\'') {
                            b3 = false;
                            break Label_0316;
                        }
                    }
                    b3 = true;
                }
                boolean b4 = false;
                Label_0336: {
                    if (!b3) {
                        if (c != '\"') {
                            b4 = false;
                            break Label_0336;
                        }
                    }
                    b4 = true;
                }
                boolean b5 = false;
                Label_0356: {
                    if (!b4) {
                        if (c != '\\') {
                            b5 = false;
                            break Label_0356;
                        }
                    }
                    b5 = true;
                }
                int n3 = 0;
                Label_0373: {
                    if (!b5) {
                        n3 = n;
                        if (c != '/') {
                            break Label_0373;
                        }
                    }
                    n3 = 1;
                }
                if (n3 == 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Invalid escape sequence: \\");
                    sb.append(c);
                    throw this.m(sb.toString());
                }
            }
            return c;
        }
        throw this.m("Unterminated escape sequence");
    }
    
    public final int j3(final List<String> list) {
        czd.f((Object)list, "names");
        if (list.isEmpty()) {
            return -1;
        }
    Label_0018:
        while (this.hasNext()) {
            final String m0 = this.M0();
            final int n = this.N0[this.O0 - 1];
            if (czd.a(list.get(n), (Object)m0)) {
                final int[] n2 = this.N0;
                final int o0 = this.O0;
                n2[o0 - 1] = n + 1;
                if (n2[o0 - 1] == list.size()) {
                    this.N0[this.O0 - 1] = 0;
                }
                return n;
            }
            int n3 = n;
            int n4;
            do {
                n4 = ++n3;
                if (n3 == list.size()) {
                    n4 = 0;
                }
                if (n4 == n) {
                    this.g0();
                    continue Label_0018;
                }
                n3 = n4;
            } while (!czd.a(list.get(n4), (Object)m0));
            final int[] n5 = this.N0;
            final int o2 = this.O0;
            n5[o2 - 1] = n4 + 1;
            if (n5[o2 - 1] == list.size()) {
                this.N0[this.O0 - 1] = 0;
            }
            return n4;
        }
        return -1;
    }
    
    public final void k(final i63 i63) {
        while (true) {
            final long c1 = this.D0.c1(i63);
            if (c1 == -1L) {
                throw this.m("Unterminated string");
            }
            if (this.E0.f(c1) != (byte)92) {
                this.E0.T2(c1 + 1L);
                return;
            }
            this.E0.T2(c1 + 1L);
            this.j();
        }
    }
    
    public final JsonEncodingException m(final String s) {
        final StringBuilder b = kgi.b(s, " at path ");
        b.append(this.r());
        return new JsonEncodingException(b.toString());
    }
    
    public final double m2() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 15) {
            this.F0 = 0;
            final int[] m0 = this.M0;
            final int n2 = this.K0 - 1;
            ++m0[n2];
            return (double)this.G0;
        }
        Label_0360: {
            if (n == 16) {
                this.I0 = this.E0.J((long)this.H0);
            }
            else if (n == 9) {
                this.I0 = this.f(er2.Q0);
            }
            else if (n == 8) {
                this.I0 = this.f(er2.P0);
            }
            else if (n == 10) {
                this.I0 = this.h();
            }
            else if (n != 11) {
                break Label_0360;
            }
            this.F0 = 11;
            try {
                final String i0 = this.I0;
                czd.c((Object)i0);
                final double double1 = Double.parseDouble(i0);
                if (!Double.isNaN(double1) && !Double.isInfinite(double1)) {
                    this.I0 = null;
                    this.F0 = 0;
                    final int[] m2 = this.M0;
                    final int n3 = this.K0 - 1;
                    ++m2[n3];
                    return double1;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(double1);
                sb.append(" at path ");
                sb.append(this.c());
                throw new JsonEncodingException(sb.toString());
            }
            catch (final NumberFormatException ex) {
                final StringBuilder j = fu8.j("Expected a double but was ");
                j.append(this.I0);
                j.append(" at path ");
                j.append(this.c());
                throw new JsonDataException(j.toString());
            }
        }
        final StringBuilder k = fu8.j("Expected a double but was ");
        k.append(yvl.X(this.U2()));
        k.append(" at path ");
        k.append(this.c());
        throw new JsonDataException(k.toString());
    }
    
    public final long m3() {
        Integer value = this.F0;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value != null) {
            n = value;
        }
        else {
            n = this.b();
        }
        if (n == 15) {
            this.F0 = 0;
            final int[] m0 = this.M0;
            final int n2 = this.K0 - 1;
            ++m0[n2];
            return this.G0;
        }
        while (true) {
            if (n == 16) {
                this.I0 = this.E0.J((long)this.H0);
                break Label_0264;
            }
            i63 i63;
            if (n != 9 && n != 8) {
                if (n == 11) {
                    break Label_0264;
                }
                final StringBuilder j = fu8.j("Expected a long but was ");
                j.append(yvl.X(this.U2()));
                j.append(" at path ");
                j.append(this.c());
                throw new JsonDataException(j.toString());
            }
            else if (n == 9) {
                i63 = er2.Q0;
            }
            else {
                i63 = er2.P0;
            }
            final String f = this.f(i63);
            this.I0 = f;
            try {
                final long long1 = Long.parseLong(f);
                this.F0 = 0;
                final int[] m2 = this.M0;
                final int n3 = this.K0 - 1;
                ++m2[n3];
                return long1;
                this.F0 = 11;
                try {
                    final String i64 = this.I0;
                    czd.c((Object)i64);
                    final double double1 = Double.parseDouble(i64);
                    final long n4 = (long)double1;
                    if (n4 == double1) {
                        this.I0 = null;
                        this.F0 = 0;
                        final int[] m3 = this.M0;
                        final int n5 = this.K0 - 1;
                        ++m3[n5];
                        return n4;
                    }
                    final StringBuilder k = fu8.j("Expected a long but was ");
                    k.append(this.I0);
                    k.append(" at path ");
                    k.append(this.c());
                    throw new JsonDataException(k.toString());
                }
                catch (final NumberFormatException ex) {
                    final StringBuilder l = fu8.j("Expected a long but was ");
                    l.append(this.I0);
                    l.append(" at path ");
                    l.append(this.c());
                    throw new JsonDataException(l.toString());
                }
            }
            catch (final NumberFormatException ex2) {
                continue;
            }
            break;
        }
    }
    
    public final List<Object> r() {
        final int k0 = this.K0;
        final int[] j0 = this.J0;
        final String[] l0 = this.L0;
        final int[] m0 = this.M0;
        czd.f((Object)j0, "stack");
        czd.f((Object)l0, "pathNames");
        czd.f((Object)m0, "pathIndices");
        final ArrayList list = new ArrayList();
        for (int i = 0; i < k0; ++i) {
            final int n = j0[i];
            if (n != 1 && n != 2) {
                if (n == 3 || n == 4 || n == 5) {
                    final String s = l0[i];
                    if (s != null) {
                        list.add(s);
                    }
                }
            }
            else {
                list.add(m0[i]);
            }
        }
        return list;
    }
    
    public static final class a
    {
    }
}

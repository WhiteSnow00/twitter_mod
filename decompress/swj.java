import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class swj extends khe
{
    public lje D0;
    
    public swj(final int n) {
        super(n);
    }
    
    public static final String p0(final int n) {
        final char c = (char)n;
        if (Character.isISOControl(c)) {
            return ffa.k("(CTRL-CHAR, code ", n, ")");
        }
        if (n > 255) {
            final StringBuilder sb = new StringBuilder();
            sb.append("'");
            sb.append(c);
            sb.append("' (code ");
            sb.append(n);
            sb.append(" / 0x");
            sb.append(Integer.toHexString(n));
            sb.append(")");
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("'");
        sb2.append(c);
        sb2.append("' (code ");
        sb2.append(n);
        sb2.append(")");
        return sb2.toString();
    }
    
    public final void A0(final lje lje) throws JsonParseException {
        String s;
        if (lje != lje.P0) {
            if (lje != lje.Q0 && lje != lje.R0) {
                s = " in a value";
            }
            else {
                s = " in a Number value";
            }
        }
        else {
            s = " in a String value";
        }
        this.x0(s, lje);
        throw null;
    }
    
    public final void B0(final int n, final String s) throws JsonParseException {
        if (n >= 0) {
            final StringBuilder g = w48.g("Unexpected character (");
            g.append(p0(n));
            g.append(")");
            String s2 = g.toString();
            if (s != null) {
                s2 = zi.y(s2, ": ", s);
            }
            this.u0(s2);
            throw null;
        }
        this.w0();
        throw null;
    }
    
    public final void I0() {
        final int a = urw.a;
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
    
    public int K() throws IOException {
        final lje d0 = this.D0;
        Label_0256: {
            if (d0 == lje.Q0 || d0 == lje.R0) {
                break Label_0256;
            }
            int int1;
            final int n = int1 = 0;
            if (d0 == null) {
                return int1;
            }
            final int f0 = d0.F0;
            final int n2 = 1;
            Label_0249: {
                String substring = null;
                if (f0 != 6) {
                    switch (f0) {
                        default: {
                            int1 = n;
                            return int1;
                        }
                        case 10:
                        case 11: {
                            return 0;
                        }
                        case 9: {
                            return 1;
                        }
                    }
                }
                else {
                    final String j = this.j();
                    if (this.s0(j)) {
                        return 0;
                    }
                    final String a = p2j.a;
                    if (j == null) {
                        int1 = n;
                        return int1;
                    }
                    final String trim = j.trim();
                    final int length = trim.length();
                    if (length == 0) {
                        int1 = n;
                        return int1;
                    }
                    substring = trim;
                    while (true) {
                        Label_0200: {
                            int length2;
                            if ((length2 = length) <= 0) {
                                break Label_0200;
                            }
                            final char char1 = trim.charAt(0);
                            if (char1 == '+') {
                                substring = trim.substring(1);
                                length2 = substring.length();
                                break Label_0200;
                            }
                            substring = trim;
                            length2 = length;
                            if (char1 != '-') {
                                break Label_0200;
                            }
                            substring = trim;
                            length2 = length;
                            int i = n2;
                            while (i < length2) {
                                final char char2 = substring.charAt(i);
                                if (char2 > '9') {
                                    break Label_0249;
                                }
                                if (char2 < '0') {
                                    break Label_0249;
                                }
                                ++i;
                            }
                            break Label_0249;
                        }
                        int i = 0;
                        continue;
                    }
                }
                try {
                    int1 = (int)p2j.b(substring);
                    return int1;
                    return this.h();
                    int1 = Integer.parseInt(substring);
                    return int1;
                }
                catch (final NumberFormatException ex) {
                    int1 = n;
                    return int1;
                }
            }
        }
    }
    
    public final void K0(int n) throws JsonParseException {
        n = (char)n;
        final StringBuilder g = w48.g("Illegal character (");
        g.append(p0(n));
        g.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        this.u0(g.toString());
        throw null;
    }
    
    public final long L() throws IOException {
        final lje d0 = this.D0;
        if (d0 != lje.Q0 && d0 != lje.R0) {
            return this.N();
        }
        return this.i();
    }
    
    public final void M0(int n, final String s) throws JsonParseException {
        if (this.Z(khe$a.J0) && n <= 32) {
            return;
        }
        n = (char)n;
        final StringBuilder g = w48.g("Illegal unquoted character (");
        g.append(p0(n));
        g.append("): has to be escaped using backslash to be included in ");
        g.append(s);
        this.u0(g.toString());
        throw null;
    }
    
    public final long N() throws IOException {
        final lje d0 = this.D0;
        Label_0278: {
            if (d0 == lje.Q0 || d0 == lje.R0) {
                break Label_0278;
            }
            long long1;
            final long n = long1 = 0L;
            if (d0 == null) {
                return long1;
            }
            final int f0 = d0.F0;
            Label_0269: {
                String substring = null;
                if (f0 != 6) {
                    switch (f0) {
                        default: {
                            long1 = n;
                            return long1;
                        }
                        case 10:
                        case 11: {
                            return 0L;
                        }
                        case 9: {
                            return 1L;
                        }
                    }
                }
                else {
                    final String j = this.j();
                    if (this.s0(j)) {
                        return 0L;
                    }
                    final String a = p2j.a;
                    if (j == null) {
                        long1 = n;
                        return long1;
                    }
                    final String trim = j.trim();
                    final int length = trim.length();
                    if (length == 0) {
                        long1 = n;
                        return long1;
                    }
                    final int n2 = 0;
                    substring = trim;
                    int length2 = length;
                    int i = n2;
                    if (length > 0) {
                        final char char1 = trim.charAt(0);
                        if (char1 == '+') {
                            substring = trim.substring(1);
                            length2 = substring.length();
                            i = n2;
                        }
                        else {
                            substring = trim;
                            length2 = length;
                            i = n2;
                            if (char1 == '-') {
                                i = 1;
                                length2 = length;
                                substring = trim;
                            }
                        }
                    }
                    while (i < length2) {
                        final char char2 = substring.charAt(i);
                        if (char2 > '9') {
                            break Label_0269;
                        }
                        if (char2 < '0') {
                            break Label_0269;
                        }
                        ++i;
                    }
                    break Label_0269;
                }
                try {
                    long1 = (long)p2j.b(substring);
                    return long1;
                    long1 = Long.parseLong(substring);
                    return long1;
                    return this.i();
                }
                catch (final NumberFormatException ex) {
                    long1 = n;
                    return long1;
                }
            }
        }
    }
    
    public String T(final String s) throws IOException {
        final lje d0 = this.D0;
        if (d0 == lje.P0) {
            return this.j();
        }
        if (d0 == lje.O0) {
            return this.d();
        }
        String j = s;
        if (d0 != null) {
            j = s;
            if (d0 != lje.U0) {
                if (!d0.I0) {
                    j = s;
                }
                else {
                    j = this.j();
                }
            }
        }
        return j;
    }
    
    public final boolean W() {
        return this.D0 != null;
    }
    
    public final lje a() {
        return this.D0;
    }
    
    public final lje e() {
        return this.D0;
    }
    
    public final boolean m() throws IOException {
        final lje d0 = this.D0;
        boolean b = false;
        if (d0 != null) {
            final int f0 = d0.F0;
            if (f0 != 6) {
                if (f0 == 7) {
                    if (this.h() != 0) {
                        b = true;
                    }
                    return b;
                }
                if (f0 == 9) {
                    return true;
                }
            }
            else {
                final String trim = this.j().trim();
                if ("true".equals(trim)) {
                    return true;
                }
                if ("false".equals(trim)) {
                    return false;
                }
                this.s0(trim);
            }
        }
        return false;
    }
    
    public final khe m0() throws IOException {
        final lje d0 = this.D0;
        if (d0 != lje.K0 && d0 != lje.M0) {
            return this;
        }
        int n = 1;
        while (true) {
            final lje i0 = this.i0();
            if (i0 == null) {
                this.q0();
                return this;
            }
            if (i0.G0) {
                ++n;
            }
            else {
                if (i0.H0 && --n == 0) {
                    return this;
                }
                continue;
            }
        }
    }
    
    public final double q() throws IOException {
        final lje d0 = this.D0;
        double b;
        final double n = b = 0.0;
        if (d0 == null) {
            return b;
        }
        final String trim;
        switch (d0.F0) {
            default: {
                b = n;
                return b;
            }
            case 10:
            case 11: {
                return 0.0;
            }
            case 9: {
                return 1.0;
            }
            case 7:
            case 8: {
                return this.f();
            }
            case 6: {
                final String j = this.j();
                if (this.s0(j)) {
                    return 0.0;
                }
                final String a = p2j.a;
                if (j == null) {
                    b = n;
                    return b;
                }
                trim = j.trim();
                if (trim.length() == 0) {
                    b = n;
                    return b;
                }
                break;
            }
        }
        try {
            b = p2j.b(trim);
            return b;
        }
        catch (final NumberFormatException ex) {
            b = n;
            return b;
        }
    }
    
    public abstract void q0() throws JsonParseException;
    
    public final char r0(final char c) throws JsonProcessingException {
        if (this.Z(khe$a.K0)) {
            return c;
        }
        if (c == '\'' && this.Z(khe$a.I0)) {
            return c;
        }
        final StringBuilder g = w48.g("Unrecognized character escape ");
        g.append(p0(c));
        this.u0(g.toString());
        throw null;
    }
    
    public final boolean s0(final String s) {
        return "null".equals(s);
    }
    
    public final void u0(final String s) throws JsonParseException {
        throw new JsonParseException((khe)this, s);
    }
    
    public final void w0() throws JsonParseException {
        final StringBuilder g = w48.g(" in ");
        g.append(this.D0);
        this.x0(g.toString(), this.D0);
        throw null;
    }
    
    public final void x0(final String s, final lje lje) throws JsonParseException {
        throw new JsonEOFException(this, l7k.c("Unexpected end-of-input", s));
    }
    
    public int z() throws IOException {
        final lje d0 = this.D0;
        if (d0 != lje.Q0 && d0 != lje.R0) {
            return this.K();
        }
        return this.h();
    }
}

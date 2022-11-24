import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class mxj extends qhe
{
    public rje G0;
    
    public mxj(final int n) {
        super(n);
    }
    
    public static final String p0(final int n) {
        final char c = (char)n;
        if (Character.isISOControl(c)) {
            return ffe.m("(CTRL-CHAR, code ", n, ")");
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
    
    public final void A0(final rje rje) throws JsonParseException {
        String s;
        if (rje != rje.S0) {
            if (rje != rje.T0 && rje != rje.U0) {
                s = " in a value";
            }
            else {
                s = " in a Number value";
            }
        }
        else {
            s = " in a String value";
        }
        this.x0(s, rje);
        throw null;
    }
    
    public final void B0(final int n, final String s) throws JsonParseException {
        if (n >= 0) {
            final StringBuilder f = ehk.f("Unexpected character (");
            f.append(p0(n));
            f.append(")");
            String s2 = f.toString();
            if (s != null) {
                s2 = c0e.h(s2, ": ", s);
            }
            this.u0(s2);
            throw null;
        }
        this.w0();
        throw null;
    }
    
    public final void I0() {
        final int a = ctw.a;
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
    
    public int K() throws IOException {
        final rje g0 = this.G0;
        Label_0262: {
            if (g0 == rje.T0 || g0 == rje.U0) {
                break Label_0262;
            }
            int int1;
            final int n = int1 = 0;
            if (g0 == null) {
                return int1;
            }
            final int i0 = g0.I0;
            final int n2 = 1;
            Label_0254: {
                String substring = null;
                if (i0 != 6) {
                    switch (i0) {
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
                    final String a = i3j.a;
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
                        Label_0206: {
                            int length2;
                            if ((length2 = length) <= 0) {
                                break Label_0206;
                            }
                            final char char1 = trim.charAt(0);
                            if (char1 == '+') {
                                substring = trim.substring(1);
                                length2 = substring.length();
                                break Label_0206;
                            }
                            substring = trim;
                            length2 = length;
                            if (char1 != '-') {
                                break Label_0206;
                            }
                            substring = trim;
                            length2 = length;
                            int k = n2;
                            while (k < length2) {
                                final char char2 = substring.charAt(k);
                                if (char2 > '9') {
                                    break Label_0254;
                                }
                                if (char2 < '0') {
                                    break Label_0254;
                                }
                                ++k;
                            }
                            break Label_0254;
                        }
                        int k = 0;
                        continue;
                    }
                }
                try {
                    int1 = (int)i3j.b(substring);
                    return int1;
                    int1 = Integer.parseInt(substring);
                    return int1;
                    return this.h();
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
        final StringBuilder f = ehk.f("Illegal character (");
        f.append(p0(n));
        f.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        this.u0(f.toString());
        throw null;
    }
    
    public final long L() throws IOException {
        final rje g0 = this.G0;
        if (g0 != rje.T0 && g0 != rje.U0) {
            return this.N();
        }
        return this.i();
    }
    
    public final void M0(int n, final String s) throws JsonParseException {
        if (this.Z(qhe$a.M0) && n <= 32) {
            return;
        }
        n = (char)n;
        final StringBuilder f = ehk.f("Illegal unquoted character (");
        f.append(p0(n));
        f.append("): has to be escaped using backslash to be included in ");
        f.append(s);
        this.u0(f.toString());
        throw null;
    }
    
    public final long N() throws IOException {
        final rje g0 = this.G0;
        Label_0276: {
            if (g0 == rje.T0 || g0 == rje.U0) {
                break Label_0276;
            }
            long long1;
            final long n = long1 = 0L;
            if (g0 == null) {
                return long1;
            }
            final int i0 = g0.I0;
            Label_0266: {
                String substring = null;
                if (i0 != 6) {
                    switch (i0) {
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
                    final String a = i3j.a;
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
                    int k = n2;
                    if (length > 0) {
                        final char char1 = trim.charAt(0);
                        if (char1 == '+') {
                            substring = trim.substring(1);
                            length2 = substring.length();
                            k = n2;
                        }
                        else {
                            substring = trim;
                            length2 = length;
                            k = n2;
                            if (char1 == '-') {
                                k = 1;
                                length2 = length;
                                substring = trim;
                            }
                        }
                    }
                    while (k < length2) {
                        final char char2 = substring.charAt(k);
                        if (char2 > '9') {
                            break Label_0266;
                        }
                        if (char2 < '0') {
                            break Label_0266;
                        }
                        ++k;
                    }
                    break Label_0266;
                }
                try {
                    long1 = (long)i3j.b(substring);
                    return long1;
                    return this.i();
                    long1 = Long.parseLong(substring);
                    return long1;
                }
                catch (final NumberFormatException ex) {
                    long1 = n;
                    return long1;
                }
            }
        }
    }
    
    public String T(final String s) throws IOException {
        final rje g0 = this.G0;
        if (g0 == rje.S0) {
            return this.j();
        }
        if (g0 == rje.R0) {
            return this.d();
        }
        String j = s;
        if (g0 != null) {
            j = s;
            if (g0 != rje.X0) {
                if (!g0.L0) {
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
        return this.G0 != null;
    }
    
    public final rje a() {
        return this.G0;
    }
    
    public final rje e() {
        return this.G0;
    }
    
    public final boolean m() throws IOException {
        final rje g0 = this.G0;
        boolean b = false;
        if (g0 != null) {
            final int i0 = g0.I0;
            if (i0 != 6) {
                if (i0 == 7) {
                    if (this.h() != 0) {
                        b = true;
                    }
                    return b;
                }
                if (i0 == 9) {
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
    
    public final qhe m0() throws IOException {
        final rje g0 = this.G0;
        if (g0 != rje.N0 && g0 != rje.P0) {
            return this;
        }
        int n = 1;
        while (true) {
            final rje i0 = this.i0();
            if (i0 == null) {
                this.q0();
                return this;
            }
            if (i0.J0) {
                ++n;
            }
            else {
                if (i0.K0 && --n == 0) {
                    return this;
                }
                continue;
            }
        }
    }
    
    public abstract void q0() throws JsonParseException;
    
    public final double r() throws IOException {
        final rje g0 = this.G0;
        double b;
        final double n = b = 0.0;
        if (g0 == null) {
            return b;
        }
        final String trim;
        switch (g0.I0) {
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
                final String a = i3j.a;
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
            b = i3j.b(trim);
            return b;
        }
        catch (final NumberFormatException ex) {
            b = n;
            return b;
        }
    }
    
    public final char r0(final char c) throws JsonProcessingException {
        if (this.Z(qhe$a.N0)) {
            return c;
        }
        if (c == '\'' && this.Z(qhe$a.L0)) {
            return c;
        }
        final StringBuilder f = ehk.f("Unrecognized character escape ");
        f.append(p0(c));
        this.u0(f.toString());
        throw null;
    }
    
    public final boolean s0(final String s) {
        return "null".equals(s);
    }
    
    public final void u0(final String s) throws JsonParseException {
        throw new JsonParseException((qhe)this, s);
    }
    
    public final void w0() throws JsonParseException {
        final StringBuilder f = ehk.f(" in ");
        f.append(this.G0);
        this.x0(f.toString(), this.G0);
        throw null;
    }
    
    public final void x0(final String s, final rje rje) throws JsonParseException {
        throw new JsonEOFException(this, mqb.l("Unexpected end-of-input", s));
    }
    
    public int z() throws IOException {
        final rje g0 = this.G0;
        if (g0 != rje.T0 && g0 != rje.U0) {
            return this.K();
        }
        return this.h();
    }
}

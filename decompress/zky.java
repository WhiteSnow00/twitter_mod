import java.util.Arrays;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

// 
// Decompiled by Procyon v0.6.0
// 

public class zky
{
    public static final sky c;
    public final wky a;
    @NullableDecl
    public final Character b;
    
    static {
        final Character value = '=';
        new ely("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", value);
        new ely("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", value);
        new zky(new wky("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), value);
        new zky(new wky("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), value);
        c = new sky();
    }
    
    public zky(final wky a, @NullableDecl final Character b) {
        this.a = a;
        boolean b2 = false;
        Label_0057: {
            if (b != null) {
                final char charValue = b;
                final byte[] g = a.g;
                if (charValue < g.length && g[charValue] != -1) {
                    b2 = false;
                    break Label_0057;
                }
            }
            b2 = true;
        }
        if (b2) {
            this.b = b;
            return;
        }
        throw new IllegalArgumentException(qds.B("Padding character %s was already in alphabet", new Object[] { b }));
    }
    
    public final String a(final byte[] array) {
        final int length = array.length;
        r1n.r0(0, length, array.length);
        final wky a = this.a;
        final StringBuilder sb = new StringBuilder(y78.q(length, a.f, RoundingMode.CEILING) * a.e);
        try {
            this.b(sb, array, length);
            return sb.toString();
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public void b(final Appendable appendable, final byte[] array, final int n) throws IOException {
        final int length = array.length;
        int i = 0;
        r1n.r0(0, n + 0, length);
        while (i < n) {
            this.c(appendable, array, i + 0, Math.min(this.a.f, n - i));
            i += this.a.f;
        }
    }
    
    public final void c(final Appendable appendable, final byte[] array, int i, final int n) throws IOException {
        r1n.r0(i, i + n, array.length);
        final int f = this.a.f;
        final int n2 = 0;
        r1n.s0(n <= f);
        long n3 = 0L;
        for (int j = 0; j < n; ++j) {
            n3 = (n3 | (long)(array[i + j] & 0xFF)) << 8;
        }
        final int d = this.a.d;
        int n4;
        wky a;
        for (i = n2; i < n << 3; i += this.a.d) {
            n4 = (int)(n3 >>> (n + 1 << 3) - d - i);
            a = this.a;
            ((StringBuilder)appendable).append(a.b[n4 & a.c]);
        }
        if (this.b != null) {
            while (i < this.a.f << 3) {
                ((StringBuilder)appendable).append((char)this.b);
                i += this.a.d;
            }
        }
    }
    
    @Override
    public final boolean equals(@NullableDecl final Object o) {
        if (o instanceof zky) {
            final zky zky = (zky)o;
            if (this.a.equals((Object)zky.a) && iwl.s((Object)this.b, (Object)zky.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(new Object[] { this.b });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.a.a);
        if (8 % this.a.d != 0) {
            if (this.b == null) {
                sb.append(".omitPadding()");
            }
            else {
                sb.append(".withPadChar('");
                sb.append(this.b);
                sb.append("')");
            }
        }
        return sb.toString();
    }
}

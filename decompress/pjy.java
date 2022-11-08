import java.util.Arrays;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

// 
// Decompiled by Procyon v0.6.0
// 

public class pjy
{
    public static final ijy c;
    public final mjy a;
    @NullableDecl
    public final Character b;
    
    static {
        final Character value = '=';
        new ujy("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", value);
        new ujy("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", value);
        new pjy(new mjy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), value);
        new pjy(new mjy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), value);
        c = new ijy();
    }
    
    public pjy(final mjy a, @NullableDecl final Character b) {
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
        throw new IllegalArgumentException(m8y.D("Padding character %s was already in alphabet", b));
    }
    
    public final String a(final byte[] array) {
        final int length = array.length;
        tdy.d1(0, length, array.length);
        final mjy a = this.a;
        final StringBuilder sb = new StringBuilder(kq9.f1(length, a.f, RoundingMode.CEILING) * a.e);
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
        tdy.d1(0, n + 0, length);
        while (i < n) {
            this.c(appendable, array, i + 0, Math.min(this.a.f, n - i));
            i += this.a.f;
        }
    }
    
    public final void c(final Appendable appendable, final byte[] array, int i, final int n) throws IOException {
        tdy.d1(i, i + n, array.length);
        final int f = this.a.f;
        final int n2 = 0;
        tdy.e1(n <= f);
        long n3 = 0L;
        for (int j = 0; j < n; ++j) {
            n3 = (n3 | (long)(array[i + j] & 0xFF)) << 8;
        }
        final int d = this.a.d;
        int n4;
        mjy a;
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
        if (o instanceof pjy) {
            final pjy pjy = (pjy)o;
            if (this.a.equals(pjy.a) && rqu.V((Object)this.b, (Object)pjy.b)) {
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

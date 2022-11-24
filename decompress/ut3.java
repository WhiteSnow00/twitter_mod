import java.nio.CharBuffer;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ut3 implements CharSequence, Serializable
{
    public char[] F0;
    public int G0;
    
    public ut3(final int n) {
        if (n >= 0) {
            this.F0 = new char[n];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
    
    public final void a(final char c) {
        final int g0 = this.G0 + 1;
        if (g0 > this.F0.length) {
            this.e(g0);
        }
        this.F0[this.G0] = c;
        this.G0 = g0;
    }
    
    public final void b(String s) {
        if (s == null) {
            s = "null";
        }
        final int length = s.length();
        final int g0 = this.G0 + length;
        if (g0 > this.F0.length) {
            this.e(g0);
        }
        s.getChars(0, length, this.F0, this.G0);
        this.G0 = g0;
    }
    
    public final void c(final char[] array, final int n) {
        if (array.length >= 0 && n >= 0) {
            final int n2 = n + 0;
            if (n2 >= 0 && n2 <= array.length) {
                if (n == 0) {
                    return;
                }
                final int g0 = this.G0 + n;
                if (g0 > this.F0.length) {
                    this.e(g0);
                }
                System.arraycopy(array, 0, this.F0, this.G0, n);
                this.G0 = g0;
                return;
            }
        }
        final int length = array.length;
        final StringBuilder g2 = xnf.g("off: ", 0, " len: ", n, " b.length: ");
        g2.append(length);
        throw new IndexOutOfBoundsException(g2.toString());
    }
    
    @Override
    public final char charAt(final int n) {
        return this.F0[n];
    }
    
    public final void d(final int n) {
        if (n <= 0) {
            return;
        }
        final int length = this.F0.length;
        final int g0 = this.G0;
        if (n > length - g0) {
            this.e(g0 + n);
        }
    }
    
    public final void e(final int n) {
        final char[] f0 = new char[Math.max(this.F0.length << 1, n)];
        System.arraycopy(this.F0, 0, f0, 0, this.G0);
        this.F0 = f0;
    }
    
    @Override
    public final int length() {
        return this.G0;
    }
    
    @Override
    public final CharSequence subSequence(final int n, final int n2) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(rk0.B("Negative beginIndex: ", n));
        }
        if (n2 > this.G0) {
            throw new IndexOutOfBoundsException(mw.z("endIndex: ", n2, " > length: ", this.G0));
        }
        if (n <= n2) {
            return CharBuffer.wrap(this.F0, n, n2);
        }
        throw new IndexOutOfBoundsException(mw.z("beginIndex: ", n, " > endIndex: ", n2));
    }
    
    @Override
    public final String toString() {
        return new String(this.F0, 0, this.G0);
    }
}

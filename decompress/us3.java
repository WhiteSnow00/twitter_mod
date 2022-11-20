import java.nio.CharBuffer;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class us3 implements CharSequence, Serializable
{
    public char[] D0;
    public int E0;
    
    public us3(final int n) {
        if (n >= 0) {
            this.D0 = new char[n];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
    
    public final void a(final char c) {
        final int e0 = this.E0 + 1;
        if (e0 > this.D0.length) {
            this.e(e0);
        }
        this.D0[this.E0] = c;
        this.E0 = e0;
    }
    
    public final void b(String s) {
        if (s == null) {
            s = "null";
        }
        final int length = s.length();
        final int e0 = this.E0 + length;
        if (e0 > this.D0.length) {
            this.e(e0);
        }
        s.getChars(0, length, this.D0, this.E0);
        this.E0 = e0;
    }
    
    public final void c(final char[] array, final int n) {
        if (array.length >= 0 && n >= 0) {
            final int n2 = n + 0;
            if (n2 >= 0 && n2 <= array.length) {
                if (n == 0) {
                    return;
                }
                final int e0 = this.E0 + n;
                if (e0 > this.D0.length) {
                    this.e(e0);
                }
                System.arraycopy(array, 0, this.D0, this.E0, n);
                this.E0 = e0;
                return;
            }
        }
        final int length = array.length;
        final StringBuilder f = shc.f("off: ", 0, " len: ", n, " b.length: ");
        f.append(length);
        throw new IndexOutOfBoundsException(f.toString());
    }
    
    @Override
    public final char charAt(final int n) {
        return this.D0[n];
    }
    
    public final void d(final int n) {
        if (n <= 0) {
            return;
        }
        final int length = this.D0.length;
        final int e0 = this.E0;
        if (n > length - e0) {
            this.e(e0 + n);
        }
    }
    
    public final void e(final int n) {
        final char[] d0 = new char[Math.max(this.D0.length << 1, n)];
        System.arraycopy(this.D0, 0, d0, 0, this.E0);
        this.D0 = d0;
    }
    
    @Override
    public final int length() {
        return this.E0;
    }
    
    @Override
    public final CharSequence subSequence(final int n, final int n2) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(udu.z("Negative beginIndex: ", n));
        }
        if (n2 > this.E0) {
            throw new IndexOutOfBoundsException(zjf.h("endIndex: ", n2, " > length: ", this.E0));
        }
        if (n <= n2) {
            return CharBuffer.wrap(this.D0, n, n2);
        }
        throw new IndexOutOfBoundsException(zjf.h("beginIndex: ", n, " > endIndex: ", n2));
    }
    
    @Override
    public final String toString() {
        return new String(this.D0, 0, this.E0);
    }
}

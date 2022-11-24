import java.util.Locale;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oiz implements Iterable, Serializable
{
    public static final whz G0;
    public int F0;
    
    static {
        G0 = new whz(tmz.b);
        final int a = vgz.a;
    }
    
    public oiz() {
        this.F0 = 0;
    }
    
    public static int p(final int n, final int n2, final int n3) {
        final int n4 = n2 - n;
        if ((n | n2 | n4 | n3 - n2) >= 0) {
            return n4;
        }
        if (n < 0) {
            throw new IndexOutOfBoundsException(ffe.m("Beginning index: ", n, " < 0"));
        }
        if (n2 < n) {
            throw new IndexOutOfBoundsException(mw.z("Beginning index larger than ending index: ", n, ", ", n2));
        }
        throw new IndexOutOfBoundsException(mw.z("End index: ", n2, " >= ", n3));
    }
    
    public static oiz q(final byte[] array, final int n, final int n2) {
        p(n, n + n2, array.length);
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return (oiz)new whz(array2);
    }
    
    public abstract byte e(final int p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract byte g(final int p0);
    
    @Override
    public final int hashCode() {
        int f0;
        if ((f0 = this.F0) == 0) {
            final int i = this.i();
            if ((f0 = this.j(i, i)) == 0) {
                f0 = 1;
            }
            this.F0 = f0;
        }
        return f0;
    }
    
    public abstract int i();
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new jhz(this);
    }
    
    public abstract int j(final int p0, final int p1);
    
    public abstract oiz k();
    
    public abstract String m(final Charset p0);
    
    public abstract void n(final hfe p0) throws IOException;
    
    public abstract boolean o();
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int i = this.i();
        String s;
        if (this.i() <= 50) {
            s = ak1.Z(this);
        }
        else {
            s = ak1.Z(this.k()).concat("...");
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, i, s);
    }
}

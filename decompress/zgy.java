import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zgy<E> extends cgy<E>
{
    public static final zgy<Object> K0;
    public final transient Object[] F0;
    public final transient Object[] G0;
    public final transient int H0;
    public final transient int I0;
    public final transient int J0;
    
    static {
        K0 = new zgy<Object>(new Object[0], 0, null, 0, 0);
    }
    
    public zgy(final Object[] f0, final int i0, final Object[] g0, final int h0, final int j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    public final boolean contains(@NullableDecl final Object o) {
        final Object[] g0 = this.G0;
        if (o == null || g0 == null) {
            return false;
        }
        int f = nkz.F(o.hashCode());
        while (true) {
            f &= this.H0;
            final Object o2 = g0[f];
            if (o2 == null) {
                return false;
            }
            if (o2.equals(o)) {
                return true;
            }
            ++f;
        }
    }
    
    public final int e(final Object[] array) {
        System.arraycopy(this.F0, 0, array, 0, this.J0);
        return this.J0 + 0;
    }
    
    public final niy<E> g() {
        jey<E> d0;
        if ((d0 = super.D0) == null) {
            d0 = this.o();
            super.D0 = d0;
        }
        return d0.g();
    }
    
    @Override
    public final int hashCode() {
        return this.I0;
    }
    
    public final Object[] i() {
        return this.F0;
    }
    
    public final int j() {
        return 0;
    }
    
    public final int l() {
        return this.J0;
    }
    
    public final jey<E> o() {
        return jey.n(this.F0, this.J0);
    }
    
    public final int size() {
        return this.J0;
    }
}

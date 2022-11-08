import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nam<E> extends led<E>
{
    public static final Object[] K0;
    public static final nam<Object> L0;
    public final transient Object[] F0;
    public final transient int G0;
    public final transient Object[] H0;
    public final transient int I0;
    public final transient int J0;
    
    static {
        final Object[] array = K0 = new Object[0];
        L0 = new nam<Object>(array, 0, array, 0, 0);
    }
    
    public nam(final Object[] f0, final int g0, final Object[] h0, final int i0, final int j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Object[] h0 = this.H0;
        if (o == null || h0.length == 0) {
            return false;
        }
        int z = h6q.Z(o.hashCode());
        while (true) {
            z &= this.I0;
            final Object o2 = h0[z];
            if (o2 == null) {
                return false;
            }
            if (o2.equals(o)) {
                return true;
            }
            ++z;
        }
    }
    
    @Override
    public final int g(final Object[] array, final int n) {
        System.arraycopy(this.F0, 0, array, n, this.J0);
        return n + this.J0;
    }
    
    @Override
    public final int hashCode() {
        return this.G0;
    }
    
    @Override
    public final Object[] i() {
        return this.F0;
    }
    
    @Override
    public final int j() {
        return this.J0;
    }
    
    @Override
    public final int l() {
        return 0;
    }
    
    @Override
    public final boolean m() {
        return false;
    }
    
    @Override
    public final ozv<E> n() {
        return (ozv<E>)this.e().s(0);
    }
    
    @Override
    public final aed<E> s() {
        return (aed<E>)aed.o(this.F0, this.J0);
    }
    
    @Override
    public final int size() {
        return this.J0;
    }
}

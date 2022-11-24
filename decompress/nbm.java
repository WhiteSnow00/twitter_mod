import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nbm<E> extends eed<E>
{
    public static final eed<Object> J0;
    public final transient Object[] H0;
    public final transient int I0;
    
    static {
        nbm.J0 = new nbm(new Object[0], 0);
    }
    
    public nbm(final Object[] h0, final int i0) {
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final int g(final Object[] array, final int n) {
        System.arraycopy(this.H0, 0, array, n, this.I0);
        return n + this.I0;
    }
    
    public final E get(final int n) {
        v7q.e(n, this.I0);
        final Object o = this.H0[n];
        Objects.requireNonNull(o);
        return (E)o;
    }
    
    public final Object[] i() {
        return this.H0;
    }
    
    public final int j() {
        return this.I0;
    }
    
    public final int k() {
        return 0;
    }
    
    public final boolean m() {
        return false;
    }
    
    public final int size() {
        return this.I0;
    }
}

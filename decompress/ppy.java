import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ppy<E> extends wly<E>
{
    public static final wly<Object> J0;
    public final transient Object[] H0;
    public final transient int I0;
    
    static {
        ppy.J0 = new ppy(new Object[0], 0);
    }
    
    public ppy(final Object[] h0, final int i0) {
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final int e(final Object[] array) {
        System.arraycopy(this.H0, 0, array, 0, this.I0);
        return this.I0;
    }
    
    public final int g() {
        return this.I0;
    }
    
    @Override
    public final E get(final int n) {
        p4j.c0(n, this.I0);
        final Object o = this.H0[n];
        Objects.requireNonNull(o);
        return (E)o;
    }
    
    public final int i() {
        return 0;
    }
    
    public final Object[] j() {
        return this.H0;
    }
    
    @Override
    public final int size() {
        return this.I0;
    }
}

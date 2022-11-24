import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfy<E> extends xey<E>
{
    public static final xey<Object> J0;
    public final transient Object[] H0;
    public final transient int I0;
    
    static {
        lfy.J0 = new lfy(new Object[0], 0);
    }
    
    public lfy(final Object[] h0, final int i0) {
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
    
    public final E get(final int n) {
        bs4.x0(n, this.I0);
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
    
    public final int size() {
        return this.I0;
    }
}

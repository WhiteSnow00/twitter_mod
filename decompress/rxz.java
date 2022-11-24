// 
// Decompiled by Procyon v0.6.0
// 

public final class rxz<E> extends ewz<E>
{
    public static final ewz<Object> I0;
    public final transient Object[] H0;
    
    static {
        rxz.I0 = new rxz(new Object[0]);
    }
    
    public rxz(final Object[] h0) {
        this.H0 = h0;
    }
    
    @Override
    public final int e(final Object[] array) {
        System.arraycopy(this.H0, 0, array, 0, 0);
        return 0;
    }
    
    public final int g() {
        return 0;
    }
    
    public final E get(final int n) {
        lp7.I0(n, 0);
        return (E)this.H0[n];
    }
    
    public final int i() {
        return 0;
    }
    
    public final Object[] j() {
        return this.H0;
    }
    
    public final int size() {
        return 0;
    }
}

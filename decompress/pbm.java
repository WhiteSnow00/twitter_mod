import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pbm<E> extends ped<E>
{
    public static final Object[] N0;
    public static final pbm<Object> O0;
    public final transient Object[] I0;
    public final transient int J0;
    public final transient Object[] K0;
    public final transient int L0;
    public final transient int M0;
    
    static {
        final Object[] array = N0 = new Object[0];
        O0 = new pbm<Object>(array, 0, array, 0, 0);
    }
    
    public pbm(final Object[] i0, final int j0, final Object[] k0, final int l0, final int m0) {
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
    }
    
    public final boolean contains(final Object o) {
        final Object[] k0 = this.K0;
        if (o == null || k0.length == 0) {
            return false;
        }
        int w = p4j.W(o.hashCode());
        while (true) {
            w &= this.L0;
            final Object o2 = k0[w];
            if (o2 == null) {
                return false;
            }
            if (o2.equals(o)) {
                return true;
            }
            ++w;
        }
    }
    
    public final int g(final Object[] array, final int n) {
        System.arraycopy(this.I0, 0, array, n, this.M0);
        return n + this.M0;
    }
    
    public final int hashCode() {
        return this.J0;
    }
    
    public final Object[] i() {
        return this.I0;
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.n();
    }
    
    public final int j() {
        return this.M0;
    }
    
    public final int k() {
        return 0;
    }
    
    public final boolean m() {
        return false;
    }
    
    public final v0w<E> n() {
        return (v0w<E>)this.e().s(0);
    }
    
    public final eed<E> s() {
        return eed.o(this.I0, this.M0);
    }
    
    public final int size() {
        return this.M0;
    }
}

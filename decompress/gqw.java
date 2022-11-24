import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqw extends iqw implements Iterable<iqw>, koe
{
    public final String F0;
    public final float G0;
    public final float H0;
    public final float I0;
    public final float J0;
    public final float K0;
    public final float L0;
    public final float M0;
    public final List<m0k> N0;
    public final List<iqw> O0;
    
    public gqw() {
        final int a = hqw.a;
        final h3a f0 = h3a.F0;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, (List<? extends m0k>)f0, (List<? extends iqw>)f0);
    }
    
    public gqw(final String f0, final float g0, final float h0, final float i0, final float j0, final float k0, final float l0, final float m0, final List<? extends m0k> n0, final List<? extends iqw> o0) {
        e0e.f((Object)f0, "name");
        e0e.f((Object)n0, "clipPathData");
        e0e.f((Object)o0, "children");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = (List<m0k>)n0;
        this.O0 = (List<iqw>)o0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof gqw) {
            final String f0 = this.F0;
            final gqw gqw = (gqw)o;
            return e0e.a((Object)f0, (Object)gqw.F0) && this.G0 == gqw.G0 && this.H0 == gqw.H0 && this.I0 == gqw.I0 && this.J0 == gqw.J0 && this.K0 == gqw.K0 && this.L0 == gqw.L0 && this.M0 == gqw.M0 && e0e.a((Object)this.N0, (Object)gqw.N0) && e0e.a((Object)this.O0, (Object)gqw.O0);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.O0.hashCode() + go9.o((List)this.N0, dn.g(this.M0, dn.g(this.L0, dn.g(this.K0, dn.g(this.J0, dn.g(this.I0, dn.g(this.H0, dn.g(this.G0, this.F0.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    public final Iterator<iqw> iterator() {
        return new Iterator<iqw>(this) {
            public final Iterator<iqw> F0 = gqw.O0.iterator();
            
            public final void forEachRemaining(final Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
            }
            
            @Override
            public final void forEachRemaining(final java.util.function.Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
            }
            
            @Override
            public final boolean hasNext() {
                return this.F0.hasNext();
            }
            
            @Override
            public final Object next() {
                return this.F0.next();
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

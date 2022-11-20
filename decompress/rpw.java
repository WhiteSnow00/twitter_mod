import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rpw extends tpw implements Iterable<tpw>, mne
{
    public final String D0;
    public final float E0;
    public final float F0;
    public final float G0;
    public final float H0;
    public final float I0;
    public final float J0;
    public final float K0;
    public final List<vzj> L0;
    public final List<tpw> M0;
    
    public rpw() {
        final int a = spw.a;
        final f2a d0 = f2a.D0;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, (List<? extends vzj>)d0, (List<? extends tpw>)d0);
    }
    
    public rpw(final String d0, final float e0, final float f0, final float g0, final float h0, final float i0, final float j0, final float k0, final List<? extends vzj> l0, final List<? extends tpw> m0) {
        czd.f((Object)d0, "name");
        czd.f((Object)l0, "clipPathData");
        czd.f((Object)m0, "children");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = (List<vzj>)l0;
        this.M0 = (List<tpw>)m0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof rpw) {
            final String d0 = this.D0;
            final rpw rpw = (rpw)o;
            return czd.a((Object)d0, (Object)rpw.D0) && this.E0 == rpw.E0 && this.F0 == rpw.F0 && this.G0 == rpw.G0 && this.H0 == rpw.H0 && this.I0 == rpw.I0 && this.J0 == rpw.J0 && this.K0 == rpw.K0 && czd.a((Object)this.L0, (Object)rpw.L0) && czd.a((Object)this.M0, (Object)rpw.M0);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.M0.hashCode() + sde.d((List)this.L0, c0.g(this.K0, c0.g(this.J0, c0.g(this.I0, c0.g(this.H0, c0.g(this.G0, c0.g(this.F0, c0.g(this.E0, this.D0.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    public final Iterator<tpw> iterator() {
        return new Iterator<tpw>(this) {
            public final Iterator<tpw> D0 = rpw.M0.iterator();
            
            public final void forEachRemaining(final Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, consumer);
            }
            
            @Override
            public final void forEachRemaining(final java.util.function.Consumer consumer) {
                Iterator$_CC.$default$forEachRemaining((Iterator)this, Consumer$VivifiedWrapper.convert(consumer));
            }
            
            @Override
            public final boolean hasNext() {
                return this.D0.hasNext();
            }
            
            @Override
            public final Object next() {
                return this.D0.next();
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

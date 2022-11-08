import j$.util.function.Consumer$VivifiedWrapper;
import j$.util.Iterator$_CC;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wow extends yow implements Iterable<yow>, coe
{
    public final String C0;
    public final float D0;
    public final float E0;
    public final float F0;
    public final float G0;
    public final float H0;
    public final float I0;
    public final float J0;
    public final List<rzj> K0;
    public final List<yow> L0;
    
    public wow() {
        final int a = xow.a;
        final v2a c0 = v2a.C0;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, (List<? extends rzj>)c0, (List<? extends yow>)c0);
    }
    
    public wow(final String c0, final float d0, final float e0, final float f0, final float g0, final float h0, final float i0, final float j0, final List<? extends rzj> k0, final List<? extends yow> l0) {
        zzd.f((Object)c0, "name");
        zzd.f((Object)k0, "clipPathData");
        zzd.f((Object)l0, "children");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = (List<rzj>)k0;
        this.L0 = (List<yow>)l0;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && o instanceof wow) {
            final String c0 = this.C0;
            final wow wow = (wow)o;
            return zzd.a((Object)c0, (Object)wow.C0) && this.D0 == wow.D0 && this.E0 == wow.E0 && this.F0 == wow.F0 && this.G0 == wow.G0 && this.H0 == wow.H0 && this.I0 == wow.I0 && this.J0 == wow.J0 && zzd.a((Object)this.K0, (Object)wow.K0) && zzd.a((Object)this.L0, (Object)wow.L0);
        }
        return false;
    }
    
    public final int hashCode() {
        return this.L0.hashCode() + hy8.m((List)this.K0, c0.h(this.J0, c0.h(this.I0, c0.h(this.H0, c0.h(this.G0, c0.h(this.F0, c0.h(this.E0, c0.h(this.D0, this.C0.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
    
    public final Iterator<yow> iterator() {
        return new Iterator<yow>(this) {
            public final Iterator<yow> C0 = wow.L0.iterator();
            
            @Override
            public final boolean hasNext() {
                return this.C0.hasNext();
            }
            
            @Override
            public final Object next() {
                return this.C0.next();
            }
            
            @Override
            public final void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

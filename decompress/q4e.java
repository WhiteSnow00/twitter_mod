import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q4e implements mma
{
    public final Iterable D0;
    public final gtb E0;
    
    public q4e(final Iterable d0, final gtb e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object J0(final xtk xtk) {
        final int a = lma.a;
        return i5e.g((Iterable)this, xtk);
    }
    
    public final mma N1(final xtk xtk) {
        final int a = lma.a;
        return i5e.e((Iterable)this, xtk);
    }
    
    public final boolean V0(final xtk xtk) {
        final int a = lma.a;
        return this.J0(xtk) != null;
    }
    
    public final Object first() {
        final int a = lma.a;
        return i5e.i((Iterable)this);
    }
    
    public final int getSize() {
        final int a = lma.a;
        return i5e.l((Iterable)this);
    }
    
    public final int i1(final xtk xtk) {
        final int a = lma.a;
        return i5e.h((Iterable)this, xtk);
    }
    
    public final boolean isEmpty() {
        final int a = lma.a;
        return lma.a((mma)this, 0);
    }
    
    public final Iterator iterator() {
        return (Iterator)new d5e(this.D0, this.E0);
    }
    
    public final mma k1(final xtk xtk) {
        final int a = lma.a;
        return i5e.e((Iterable)this, ((r8g)xtk).a());
    }
    
    public final boolean r2(final int n) {
        return lma.a((mma)this, n);
    }
    
    public final List s3() {
        final int a = lma.a;
        return rif.u((Iterable)this);
    }
    
    public final mma u2(final jtb jtb) {
        final int a = lma.a;
        return (mma)new r4e((Iterable)this, jtb);
    }
}

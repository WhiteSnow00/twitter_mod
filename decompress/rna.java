import java.util.List;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rna implements tna
{
    public static final rna F0;
    
    static {
        F0 = new rna();
    }
    
    public final Object K0(final nuk nuk) {
        final int a = sna.a;
        return k6e.g((Iterable)this, nuk);
    }
    
    public final tna O1(final nuk nuk) {
        final int a = sna.a;
        return k6e.e((Iterable)this, nuk);
    }
    
    public final boolean W0(final nuk nuk) {
        final int a = sna.a;
        return this.K0(nuk) != null;
    }
    
    public final Object first() {
        final int a = sna.a;
        return k6e.i((Iterable)this);
    }
    
    public final int getSize() {
        final int a = sna.a;
        return k6e.l((Iterable)this);
    }
    
    public final boolean isEmpty() {
        final int a = sna.a;
        return sna.a((tna)this, 0);
    }
    
    public final Iterator iterator() {
        final bed$b g0 = bed.G0;
        final int a = o5j.a;
        return (Iterator)g0;
    }
    
    public final int j1(final nuk nuk) {
        final int a = sna.a;
        return k6e.h((Iterable)this, nuk);
    }
    
    public final tna l1(final nuk nuk) {
        final int a = sna.a;
        return k6e.e((Iterable)this, ((d0g)nuk).a());
    }
    
    public final boolean s2(final int n) {
        return sna.a((tna)this, n);
    }
    
    public final List t3() {
        final int a = sna.a;
        return ojf.u((Iterable)this);
    }
    
    public final tna v2(final lub lub) {
        final int a = sna.a;
        return (tna)new t5e((Iterable)this, lub);
    }
}

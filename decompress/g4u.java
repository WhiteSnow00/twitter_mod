import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4u<K, V> extends a4u<K, V, Map.Entry<K, V>>
{
    public final x8k I0;
    
    public g4u(final x8k i0) {
        e0e.f((Object)i0, "parentIterator");
        this.I0 = i0;
    }
    
    @Override
    public final Object next() {
        final int h0 = super.H0 + 2;
        super.H0 = h0;
        final x8k i0 = this.I0;
        final Object[] f0 = super.F0;
        return new quh(i0, f0[h0 - 2], f0[h0 - 1]);
    }
}

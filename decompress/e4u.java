// 
// Decompiled by Procyon v0.6.0
// 

public final class e4u<K, V> extends a4u<K, V, K>
{
    @Override
    public final K next() {
        final int h0 = super.H0 + 2;
        super.H0 = h0;
        return (K)super.F0[h0 - 2];
    }
}

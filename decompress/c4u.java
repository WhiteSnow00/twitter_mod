import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c4u<K, V> extends a4u<K, V, Map.Entry<? extends K, ? extends V>>
{
    @Override
    public final Object next() {
        final int h0 = super.H0 + 2;
        super.H0 = h0;
        final Object[] f0 = super.F0;
        return new qkg(f0[h0 - 2], f0[h0 - 1], 0);
    }
}

import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3u<K, V> extends h3u<K, V, Map.Entry<K, V>>
{
    public final k8k G0;
    
    public n3u(final k8k g0) {
        czd.f((Object)g0, "parentIterator");
        this.G0 = g0;
    }
    
    public final Object next() {
        final int f0 = super.F0 + 2;
        super.F0 = f0;
        final k8k g0 = this.G0;
        final Object[] d0 = super.D0;
        return new auh(g0, d0[f0 - 2], d0[f0 - 1]);
    }
}

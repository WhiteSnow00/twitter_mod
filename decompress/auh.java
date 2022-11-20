// 
// Decompiled by Procyon v0.6.0
// 

public final class auh<K, V> extends xjg<K, V> implements pne$a
{
    public final k8k F0;
    public V G0;
    
    public auh(final k8k f0, final K k, final V g0) {
        czd.f((Object)f0, "parentIterator");
        super((Object)k, (Object)g0);
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final V getValue() {
        return this.G0;
    }
    
    public final V setValue(final V g0) {
        final V g2 = this.G0;
        this.G0 = g0;
        final k8k f0 = this.F0;
        final Object d0 = super.D0;
        final g8k g8k = (g8k)f0.E0;
        if (g8k.G0.containsKey(d0)) {
            if (g8k.F0) {
                final Object a = g8k.a();
                g8k.G0.put(d0, (Object)g0);
                int hashCode;
                if (a != null) {
                    hashCode = a.hashCode();
                }
                else {
                    hashCode = 0;
                }
                g8k.e(hashCode, g8k.G0.F0, a, 0);
            }
            else {
                g8k.G0.put(d0, (Object)g0);
            }
            g8k.J0 = g8k.G0.H0;
        }
        return g2;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytd<K, V> implements k4h<K, V>
{
    public final k4h<K, V> F0;
    public final m4h G0;
    
    public ytd(final k4h<K, V> f0, final m4h g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final cj4<V> a(final K k, final cj4<V> cj4) {
        this.G0.c(k);
        return this.F0.a(k, cj4);
    }
    
    @Override
    public final int d(final puk<K> puk) {
        return this.F0.d(puk);
    }
    
    @Override
    public final void f(final v4h v4h) {
        this.F0.f(v4h);
    }
    
    @Override
    public final cj4<V> get(final K k) {
        final cj4<V> value = this.F0.get(k);
        if (value == null) {
            this.G0.b(k);
        }
        else {
            this.G0.a(k);
        }
        return value;
    }
}

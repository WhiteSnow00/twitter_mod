// 
// Decompiled by Procyon v0.6.0
// 

public final class wsd<K, V> implements t3h<K, V>
{
    public final t3h<K, V> D0;
    public final v3h E0;
    
    public wsd(final t3h<K, V> d0, final v3h e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final xh4<V> a(final K k, final xh4<V> xh4) {
        this.E0.c((Object)k);
        return (xh4<V>)this.D0.a((Object)k, (xh4)xh4);
    }
    
    public final int d(final ztk<K> ztk) {
        return this.D0.d((ztk)ztk);
    }
    
    public final void f(final e4h e4h) {
        ((f4h)this.D0).f(e4h);
    }
    
    public final xh4<V> get(final K k) {
        final xh4 value = this.D0.get((Object)k);
        if (value == null) {
            this.E0.b((Object)k);
        }
        else {
            this.E0.a((Object)k);
        }
        return (xh4<V>)value;
    }
}

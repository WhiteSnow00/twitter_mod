// 
// Decompiled by Procyon v0.6.0
// 

public final class mgp<T>
{
    public final String a;
    public final gub<T, T, T> b;
    
    public mgp(final String a, final gub<? super T, ? super T, ? extends T> b) {
        zzd.f((Object)b, "mergePolicy");
        this.a = a;
        this.b = (gub<T, T, T>)b;
    }
    
    public final void a(final ngp ngp, final soe<?> soe, final T t) {
        zzd.f((Object)ngp, "thisRef");
        zzd.f((Object)soe, "property");
        ngp.e(this, (Object)t);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("SemanticsPropertyKey: ");
        g.append(this.a);
        return g.toString();
    }
}

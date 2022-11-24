// 
// Decompiled by Procyon v0.6.0
// 

public final class edm extends pue implements hub<quo, fvh<Object>, fvh<Object>>
{
    public final ouo<Object, Object> F0;
    
    public edm(final ouo<Object, Object> f0) {
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, Object a) {
        final quo quo = (quo)o;
        final fvh fvh = (fvh)a;
        e0e.f((Object)quo, "$this$Saver");
        e0e.f((Object)fvh, "state");
        if (fvh instanceof bjq) {
            a = this.F0.a(quo, fvh.getValue());
            final djq a2 = ((bjq)fvh).a();
            e0e.d((Object)a2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
            return zzz.V(a, a2);
        }
        throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
    }
}

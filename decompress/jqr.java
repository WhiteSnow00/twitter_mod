// 
// Decompiled by Procyon v0.6.0
// 

public final class jqr implements gqr
{
    public final ppr a;
    public final omv<String, qor> b;
    public final sqr c;
    public final jvv d;
    public final d5s e;
    public final r9a f;
    public final e39 g;
    
    public jqr(final ppr a, final omv<String, qor> b, final sqr c, final jvv d, final d5s e, final kcm kcm, final r9a f) {
        e0e.f((Object)a, "subscriptionsFeatureDataSource");
        e0e.f((Object)b, "typedKeyValueRepository");
        e0e.f((Object)c, "subscriptionsScribeDelegate");
        e0e.f((Object)d, "undoTweetPreferenceRepository");
        e0e.f((Object)e, "syncUndoTweetData");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)f, "errorReporter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        final e39 g = new e39();
        this.g = g;
        kcm.i((sj)new bmj(g, 2));
    }
    
    public final yz5 a() {
        return (yz5)new o06((idq)((tnm<kni, Object, osc>)this.a).S(kni.a).m((rk6)new ppl((stb)new jqr$a((Object)this), 23)).w((rtb)new vyn((stb)new stb<qor, bbq<noj<qor>>>(this) {
            public final jqr F0;
            
            public final Object invoke(final Object o) {
                final qor qor = (qor)o;
                e0e.f((Object)qor, "subscriptionProductFeaturesForClient");
                return this.F0.b.e((Object)"KEY_SUBSCRIPTION_PRODUCT_FEATURE", (Object)qor);
            }
        }, 21)));
    }
    
    public final bbq<qor> b() {
        return (bbq<qor>)this.b.get((Object)"KEY_SUBSCRIPTION_PRODUCT_FEATURE").o((ouk)new t3i((stb)jqr$c.F0, 22)).s().w((rtb)new t8o((stb)jqr$d.F0, 25));
    }
}

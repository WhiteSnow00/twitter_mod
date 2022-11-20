// 
// Decompiled by Procyon v0.6.0
// 

public final class rr extends enm<String, tmi, sr>
{
    public final m8a E0;
    
    public rr(final m8a e0) {
        czd.f((Object)e0, "errorReporter");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
    }
    
    public final orc c(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "productId");
        return (orc)new sr(s);
    }
    
    public final Object d(final orc orc) {
        final sr sr = (sr)orc;
        czd.f((Object)sr, "request");
        final xrc t = ((orc)sr).T();
        czd.e((Object)t, "request.result");
        tmi tmi;
        if (t.b && t.g != null) {
            tmi = tmi.a;
        }
        else {
            this.E0.f((Throwable)new Error("Subscriptions: Failed to add subscription"));
            tmi = tmi.a;
        }
        return tmi;
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwz implements awz
{
    public static final idz a;
    public static final idz b;
    
    static {
        final tdz tdz = new tdz(xcz.a(), true, true);
        a = (idz)tdz.c("measurement.collection.enable_session_stitching_token.client.dev", false);
        b = (idz)tdz.c("measurement.collection.enable_session_stitching_token.service", false);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((bez)bwz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((bez)bwz.b).b();
    }
}

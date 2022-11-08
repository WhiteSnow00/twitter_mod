// 
// Decompiled by Procyon v0.6.0
// 

public final class ovz implements nvz
{
    public static final tcz a;
    public static final tcz b;
    
    static {
        final edz edz = new edz(icz.a(), true, true);
        a = (tcz)edz.c("measurement.collection.enable_session_stitching_token.client.dev", false);
        b = (tcz)edz.c("measurement.collection.enable_session_stitching_token.service", false);
    }
    
    public final void a() {
    }
    
    public final boolean c() {
        return (boolean)((mdz)ovz.a).b();
    }
    
    public final boolean d() {
        return (boolean)((mdz)ovz.b).b();
    }
}

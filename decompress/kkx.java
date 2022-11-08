// 
// Decompiled by Procyon v0.6.0
// 

public final class kkx
{
    public static final a Companion;
    public final qkx a;
    
    static {
        Companion = new a();
    }
    
    public kkx(final qkx a) {
        zzd.f((Object)a, "viewInitializer");
        this.a = a;
    }
    
    public final jn6 a(final jn6 jn6) {
        if (jn6 != null) {
            this.a.b(jn6.getView());
        }
        else {
            cag.a("kkx", "ContentView binding is null - won't run Weaver traversal");
        }
        return jn6;
    }
    
    public static final class a
    {
    }
}

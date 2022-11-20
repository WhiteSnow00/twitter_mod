// 
// Decompiled by Procyon v0.6.0
// 

public final class elx
{
    public static final a Companion;
    public final klx a;
    
    static {
        Companion = new a();
    }
    
    public elx(final klx a) {
        czd.f((Object)a, "viewInitializer");
        this.a = a;
    }
    
    public final pm6 a(final pm6 pm6) {
        if (pm6 != null) {
            this.a.b(pm6.getView());
        }
        else {
            s9g.a("elx", "ContentView binding is null - won't run Weaver traversal");
        }
        return pm6;
    }
    
    public static final class a
    {
    }
}

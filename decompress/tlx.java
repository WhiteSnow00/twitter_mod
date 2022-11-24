// 
// Decompiled by Procyon v0.6.0
// 

public final class tlx
{
    public static final a Companion;
    public final zlx a;
    
    static {
        Companion = new a();
    }
    
    public tlx(final zlx a) {
        e0e.f((Object)a, "viewInitializer");
        this.a = a;
    }
    
    public final vn6 a(final vn6 vn6) {
        if (vn6 != null) {
            this.a.b(vn6.getView());
        }
        else {
            nag.a("tlx", "ContentView binding is null - won't run Weaver traversal");
        }
        return vn6;
    }
    
    public static final class a
    {
    }
}

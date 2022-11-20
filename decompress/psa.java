import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psa
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public psa(final UserIdentifier a, final String b) {
        czd.f((Object)a, "userIdentifier");
        czd.f((Object)b, "page");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        this.d(nza.j1(this.b, "feature_spotlight", "cancel", 8));
    }
    
    public final void b() {
        this.d(nza.j1(this.b, "feature_spotlight", "confirm", 8));
    }
    
    public final void c() {
        this.d(nza.f1(this.b, (String)null, "feature_spotlight", 10));
    }
    
    public final void d(final vba vba) {
        final af4 af4 = new af4(vba);
        ((u0p)af4).r = this.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public static final class a
    {
    }
}

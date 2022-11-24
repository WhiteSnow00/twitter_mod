import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zx4
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    
    static {
        Companion = new a();
    }
    
    public zx4(final UserIdentifier a, final String b) {
        e0e.f((Object)a, "userIdentifier");
        e0e.f((Object)b, "page");
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final fg4 fg4 = new fg4(shw.L(this.b, (String)null, (String)null, 14));
        ((o1p)fg4).r = this.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public final void b() {
        final fg4 fg4 = new fg4(shw.R(this.b, (String)null, "save", 10));
        ((o1p)fg4).r = this.a;
        final int a = o5j.a;
        sbw.b((tlm)fg4);
    }
    
    public static final class a
    {
    }
}

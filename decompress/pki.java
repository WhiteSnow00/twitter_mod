import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pki
{
    public static final a Companion;
    public final UserIdentifier a;
    public final daa b;
    public final vba c;
    public final vba d;
    
    static {
        Companion = new a();
    }
    
    public pki(final ica ica, final UserIdentifier a) {
        czd.f((Object)a, "userIdentifier");
        this.a = a;
        final baa a2 = baa.Companion.a(ica, "no_module");
        this.b = (daa)a2;
        final vba$a companion = vba.Companion;
        this.c = companion.b(a2, "", "impression");
        this.d = companion.b(a2, "cta_configure", "click");
    }
    
    public static final class a
    {
    }
}

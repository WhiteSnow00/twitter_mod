// 
// Decompiled by Procyon v0.6.0
// 

public final class bcl
{
    public static final a Companion;
    public static final cba b;
    public static final vba c;
    public static final vba d;
    public static final vba e;
    public static final vba f;
    public String a;
    
    static {
        Companion = new a();
        final bba b2 = bba.Companion.b("profile", "profile_modules", "", "");
        b = (cba)b2;
        final vba$a companion = vba.Companion;
        c = companion.c(b2, "request");
        d = companion.c(b2, "request_success");
        e = companion.c(b2, "request_failure");
        f = companion.c(b2, "impression");
    }
    
    public final void a(final vba vba) {
        final af4 af4 = new af4(vba);
        ((u0p)af4).C = this.a;
        final int a = c5j.a;
        cbw.b((elm)af4);
    }
    
    public static final class a
    {
    }
}

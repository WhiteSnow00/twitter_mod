// 
// Decompiled by Procyon v0.6.0
// 

public final class uii
{
    public static final a Companion;
    public final ewj a;
    
    static {
        Companion = new a();
    }
    
    public uii() {
        this.a = new ewj();
    }
    
    public final void a(final String s, final cgv cgv, final rii rii, final efv efv) {
        czd.f((Object)s, "id");
        czd.f((Object)cgv, "profileUser");
        czd.f((Object)rii, "newsletterSource");
        if (czd.a((Object)rii.D0, (Object)"twitter-profile")) {
            final af4 af4 = new af4(vba.Companion.e("profile", "profile_modules", "newsletter_subscribe", "", "dismiss"));
            ((u0p)af4).i((j0p)this.a.g(s, cgv, rii));
            cbw.b((elm)af4);
        }
        else {
            final vba$a companion = vba.Companion;
            String d;
            if (efv == null || (d = ((lzo)efv).d) == null) {
                d = "";
            }
            String e;
            if (efv == null || (e = ((lzo)efv).e) == null) {
                e = "";
            }
            final af4 af5 = new af4(companion.e(d, e, "newsletter_subscribe", "", "dismiss"));
            ((u0p)af5).i((j0p)this.a.g(s, cgv, rii));
            cbw.b((elm)af5);
        }
    }
    
    public static final class a
    {
    }
}

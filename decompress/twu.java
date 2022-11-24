import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twu
{
    public final UserIdentifier a;
    public final sbw b;
    public final sfv c;
    
    public twu(final UserIdentifier a, final sbw b, final sfv c) {
        e0e.f((Object)a, "currentUser");
        e0e.f((Object)b, "eventReporter");
        e0e.f((Object)c, "scribeAssociation");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final fg4 a(final String s, final String s2, final String s3) {
        final UserIdentifier a = this.a;
        final dda.a companion = dda.Companion;
        final String d = ((f0p)this.c).d;
        e0e.e((Object)d, "scribeAssociation.page");
        final String e = ((f0p)this.c).e;
        e0e.e((Object)e, "scribeAssociation.section");
        return new fg4(a, companion.e(d, e, s, s2, s3));
    }
    
    public final void b(final iuu iuu, final int f, final String s) {
        final b1p r0 = iuu.k.R0;
        final ufv ufv = new ufv();
        ufv.a = iuu.k.D();
        ufv.R0 = r0;
        ufv.f = f;
        String f2;
        if (r0 == null || (f2 = r0.f) == null) {
            f2 = "";
        }
        String g;
        if (r0 == null || (g = r0.g) == null) {
            g = "tweet";
        }
        final fg4 a = this.a(f2, g, s);
        ((o1p)a).i((d1p)ufv);
        this.b.c((tlm)a);
    }
}

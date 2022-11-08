// 
// Decompiled by Procyon v0.6.0
// 

public final class g98
{
    public static final a Companion;
    public final zqc a;
    
    static {
        Companion = new a();
    }
    
    public g98(final zqc a) {
        zzd.f((Object)a, "hostNameRewriter");
        this.a = a;
    }
    
    public final f98 a(final String s, final String s2) {
        final f98 d0 = f98.D0;
        final int n = 1;
        f98 f98;
        if (s2 != null && ckr.n1(s2, "image", false)) {
            f98 = f98.E0;
        }
        else {
            int n2;
            if (s2 != null && ckr.n1(s2, "video", false)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                f98 = f98.F0;
            }
            else {
                final vrc a = qbv.a;
                f98 = d0;
                if (!zzd.a((Object)a.b, (Object)s)) {
                    if (zzd.a((Object)qbv.b.b, (Object)s)) {
                        f98 = d0;
                    }
                    else if (s != null && zzd.a((Object)this.a.d(a.b), (Object)s)) {
                        f98 = d0;
                    }
                    else {
                        f98 = f98.C0;
                    }
                }
            }
        }
        return f98;
    }
    
    public static final class a
    {
    }
}

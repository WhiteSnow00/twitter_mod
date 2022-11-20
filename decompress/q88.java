// 
// Decompiled by Procyon v0.6.0
// 

public final class q88
{
    public static final a Companion;
    public final cqc a;
    
    static {
        Companion = new a();
    }
    
    public q88(final cqc a) {
        czd.f((Object)a, "hostNameRewriter");
        this.a = a;
    }
    
    public final p88 a(final String s, final String s2) {
        final p88 e0 = p88.E0;
        final int n = 1;
        p88 p2;
        if (s2 != null && vkr.b0(s2, "image", false)) {
            p2 = p88.F0;
        }
        else {
            int n2;
            if (s2 != null && vkr.b0(s2, "video", false)) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                p2 = p88.G0;
            }
            else {
                final yqc a = lcv.a;
                p2 = e0;
                if (!czd.a((Object)a.b, (Object)s)) {
                    if (czd.a((Object)lcv.b.b, (Object)s)) {
                        p2 = e0;
                    }
                    else if (s != null && czd.a((Object)this.a.d(a.b), (Object)s)) {
                        p2 = e0;
                    }
                    else {
                        p2 = p88.D0;
                    }
                }
            }
        }
        return p2;
    }
    
    public static final class a
    {
    }
}

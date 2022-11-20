import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j3i extends enm<j3i.j3i$a, d6i, k3i>
{
    public teq E0;
    
    public j3i(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        super((trc)null, 1, (rf8)null);
    }
    
    public final orc c(final Object o) {
        final j3i.j3i$a j3i$a = (j3i.j3i$a)o;
        czd.f((Object)j3i$a, "args");
        return (orc)new k3i(j3i$a.a, j3i$a.b, j3i$a.c, this.E0);
    }
    
    public final Object d(final orc orc) {
        final k3i k3i = (k3i)orc;
        czd.f((Object)k3i, "request");
        final xrc t = ((orc)k3i).T();
        czd.e((Object)t, "request.result");
        if (t.b) {
            final Object g = t.g;
            final boolean b = g instanceof d6i$b;
            teq b2 = null;
            d6i$b d6i$b;
            if (b) {
                d6i$b = (d6i$b)g;
            }
            else {
                d6i$b = null;
            }
            if (d6i$b != null) {
                b2 = d6i$b.b;
            }
            this.E0 = b2;
            czd.c(g);
            return g;
        }
        kbv kbv;
        if ((kbv = (kbv)t.h) == null) {
            kbv = new kbv(new hbv[] { new hbv(t.c) });
        }
        throw new IllegalStateException(kbv.toString());
    }
}

import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hgr implements ggr
{
    public final jsi a;
    public final dw b;
    public final k9h c;
    public final igr d;
    
    public hgr(final jsi a, final dw b, final k9h c, final igr d) {
        e0e.f((Object)a, "notificationFiltersWrapper");
        e0e.f((Object)b, "aggregatedInteractionsNotifFactory");
        e0e.f((Object)c, "messagingStyleDmFactory");
        e0e.f((Object)d, "statusBarNotifUtil");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(Object a) {
        final bti bti = (bti)a;
        e0e.f((Object)bti, "arg");
        bbq bbq;
        if (this.a.a.a(bti)) {
            if (dsi.Companion.f(bti.B)) {
                a = ((gra)this.c).a((Object)bti);
                e0e.e(a, "{\n                    me\u2026te(arg)\n                }");
                bbq = (bbq)a;
            }
            else if (igr.d(bti)) {
                bbq = bbq.v((Object)new bw(bti));
            }
            else {
                bbq = bbq.v((Object)new ft7(bti));
            }
        }
        else if (this.a.b.a(bti)) {
            if (this.d.c(bti)) {
                bbq = this.b.f(bti);
            }
            else {
                bbq = bbq.v((Object)new fgr(bti));
            }
        }
        else {
            bbq = bbq.v((Object)new fgr(bti));
        }
        return bbq;
    }
    
    public final Class<? extends fgr> b(final bti bti) {
        final Class<fgr> clazz = fgr.class;
        e0e.f((Object)bti, "arg");
        if (this.a.a.a(bti)) {
            Serializable s;
            if (dsi.Companion.f(bti.B)) {
                s = n9h.class;
            }
            else if (igr.d(bti)) {
                s = bw.class;
            }
            else {
                s = ft7.class;
            }
            return (Class<? extends fgr>)s;
        }
        Serializable s2 = clazz;
        if (this.a.b.a(bti)) {
            s2 = clazz;
            if (this.d.c(bti)) {
                s2 = cw.class;
            }
        }
        return (Class<? extends fgr>)s2;
    }
}

import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzz implements dsy
{
    public final Object F0;
    public final Object G0;
    public final Object H0;
    
    public kzz(final dea f0, final bea g0, final bea h0) {
        e0e.f((Object)f0, "processor");
        e0e.f((Object)g0, "parentRegistry");
        e0e.f((Object)h0, "metadataRegistry");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final bsi$d b = bsi$d.b;
        this.b((bsi)b, "push_notification");
        final bsi$a b2 = bsi$a.b;
        this.b((bsi)b2, "background");
        final bsi$c b3 = bsi$c.b;
        this.b((bsi)b3, "dismiss");
        final bsi$b b4 = bsi$b.b;
        this.b((bsi)b4, "dismiss");
        this.c((bsi)b2, (bsi)b);
        this.c((bsi)b3, (bsi)b);
        this.c((bsi)b4, (bsi)b2);
        f0.a(((bsi)b).a);
        f0.a(((bsi)b2).a);
        f0.a(((bsi)b4).a);
        f0.a(((bsi)b3).a);
    }
    
    public kzz(final dsy f0, final dsy g0, final dsy h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    public final /* bridge */ Object a() {
        final Context b = ((xzz)this.F0).b();
        final nry<Object> b2 = wry.b(this.G0);
        final nry<Object> b3 = wry.b(this.H0);
        w100 w100;
        if (tvz.a(b) == null) {
            w100 = (w100)b2.a();
        }
        else {
            w100 = (w100)b3.a();
        }
        vq9.u((Object)w100);
        return w100;
    }
    
    public final void b(final bsi bsi, final String s) {
        ((bea)this.H0).b(bsi.a.getId(), (zda)new vte(s, s));
    }
    
    public final void c(final bsi bsi, final bsi bsi2) {
        ((bea)this.G0).b(bsi.a.getId(), (zda)new bxj(bsi2.a.getId()));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class xqj
{
    public final yhq a;
    public final rtb<jwe, oyv> b;
    public final rtb<jwe, oyv> c;
    public final rtb<jwe, oyv> d;
    public final rtb<jwe, oyv> e;
    public final rtb<jwe, oyv> f;
    public final rtb<jwe, oyv> g;
    
    public xqj(final rtb<? super otb<oyv>, oyv> rtb) {
        this.a = new yhq((rtb)rtb);
        this.b = xqj$e.C0;
        this.c = xqj$f.C0;
        this.d = xqj$a.C0;
        this.e = xqj$b.C0;
        this.f = xqj$c.C0;
        this.g = xqj$d.C0;
    }
    
    public final void a(final jwe jwe, final boolean b, final otb<oyv> otb) {
        zzd.f((Object)jwe, "node");
        if (b && jwe.R0 != null) {
            this.d(jwe, (rtb<? super jwe, oyv>)this.f, otb);
        }
        else {
            this.d(jwe, (rtb<? super jwe, oyv>)this.e, otb);
        }
    }
    
    public final void b(final jwe jwe, final boolean b, final otb<oyv> otb) {
        zzd.f((Object)jwe, "node");
        if (b && jwe.R0 != null) {
            this.d(jwe, (rtb<? super jwe, oyv>)this.g, otb);
        }
        else {
            this.d(jwe, (rtb<? super jwe, oyv>)this.d, otb);
        }
    }
    
    public final void c(final jwe jwe, final boolean b, final otb<oyv> otb) {
        zzd.f((Object)jwe, "node");
        if (b && jwe.R0 != null) {
            this.d(jwe, (rtb<? super jwe, oyv>)this.b, otb);
        }
        else {
            this.d(jwe, (rtb<? super jwe, oyv>)this.c, otb);
        }
    }
    
    public final <T extends vqj> void d(final T t, final rtb<? super T, oyv> rtb, final otb<oyv> otb) {
        zzd.f((Object)t, "target");
        zzd.f((Object)rtb, "onChanged");
        this.a.c((Object)t, (rtb)rtb, (otb)otb);
    }
}

import tv.periscope.model.NarrowcastSpaceType$SuperFollowerOnly;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gfn extends gue implements rtb<mfn, oyv>
{
    public final /* synthetic */ ien C0;
    
    public gfn(final ien c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final mfn mfn = (mfn)o;
        zzd.f((Object)mfn, "$this$distinct");
        if (zzd.a((Object)mfn.q, (Object)NarrowcastSpaceType$SuperFollowerOnly.INSTANCE) && dta.b().b("super_follow_space_consumption_enabled", false)) {
            final ien c0 = this.C0;
            c0.M0.setBackgroundColor(((Number)c0.a1.getValue()).intValue());
            final ien c2 = this.C0;
            c2.J0.f(ien.a(c2));
        }
        else {
            final ien c3 = this.C0;
            c3.M0.setBackgroundColor(((Number)c3.Z0.getValue()).intValue());
            final ien c4 = this.C0;
            c4.J0.f(c4.S0);
        }
        return oyv.a;
    }
}

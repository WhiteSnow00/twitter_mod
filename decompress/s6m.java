import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s6m implements okx<sc2, qc2, pc2>
{
    public final mhh<sc2> C0;
    
    public s6m(final View view) {
        zzd.f((Object)view, "view");
        this.C0 = (mhh<sc2>)ajy.a0((rtb)new rtb<mhh$a<sc2>, oyv>() {
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                mhh$a.d((rtb)new r6m(view));
                return oyv.a;
            }
        });
    }
    
    public final void T(final oax oax) {
        final sc2 sc2 = (sc2)oax;
        zzd.f((Object)sc2, "state");
        this.C0.b((Object)sc2);
    }
}

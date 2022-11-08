import java.util.LinkedHashMap;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yik implements okx<sc2, qc2, pc2>
{
    public final ImageView C0;
    public final zml<qc2> D0;
    public final mhh<sc2> E0;
    
    public yik(final ImageView c0) {
        zzd.f((Object)c0, "imageView");
        this.C0 = c0;
        this.D0 = (zml<qc2>)new zml();
        this.E0 = (mhh<sc2>)ajy.a0((rtb)new rtb<mhh$a<sc2>, oyv>() {
            public final /* synthetic */ yik C0;
            
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                final xik xik = new xik(this.C0);
                final LinkedHashMap b = mhh$a.b;
                final mhh$a mhh$a2 = new mhh$a();
                xik.invoke((Object)mhh$a2);
                b.put(sc2.d.class, mhh$a2.b());
                return oyv.a;
            }
        });
    }
    
    public final void T(final oax oax) {
        final sc2 sc2 = (sc2)oax;
        zzd.f((Object)sc2, "state");
        this.E0.b((Object)sc2);
    }
    
    public final b5j x() {
        return (b5j)this.D0;
    }
}

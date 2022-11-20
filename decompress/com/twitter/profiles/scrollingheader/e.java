// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.profiles.scrollingheader;

import android.app.Activity;
import android.content.Context;

public abstract class e extends eus implements c$d
{
    public final m4p t1;
    
    public e(final tcv tcv, final mws mws, final hss hss, final gh7<bo6> gh7, final gdf<cxs> gdf, final brb brb, final tod tod, final epi<cxs> epi, final Context context, final sc sc, final vxs vxs, final w0t w0t, final c3e<cxs> c3e, final xba<bo> xba, final udx udx, final efv efv) {
        super(tcv, mws, hss, (gh7)gh7, (gdf)gdf, brb, tod, (epi)epi, sc, vxs, w0t, (c3e)c3e, (xba)xba, udx, efv);
        this.t1 = m4p.d((Activity)((ucv)this).D0, ((ucv)this).Y0, ((vl1)super.f1).d("fragment_page_number"));
        ((ucv)this).H0.u1((n93)new mr2((Object)this, 22));
    }
    
    public final void O0(final n3e<cxs> n3e) {
        super.O0((n3e)n3e);
        this.t1.e();
    }
    
    public final c$c Q() {
        return (c$c)this.t1;
    }
    
    public final void W0() {
    }
    
    public boolean i0() {
        return this instanceof h7l ^ true;
    }
    
    public gdv$b l0(final gdv$b gdv$b) {
        if (!this.i0()) {
            gdv$b.g = 2131624572;
        }
        gdv$b.j = new l3p(false);
        final i2a$d b = gdv$b.b;
        b.a = 2131625623;
        b.b = 2131624856;
        return gdv$b;
    }
}

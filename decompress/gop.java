import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.app.Activity;
import com.twitter.onboarding.ocf.settings.SettingsListViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gop extends a3e<h8c, hop>
{
    public final dej d;
    public final SettingsListViewModel e;
    public final dn6<qop, rop> f;
    public final mv1<tmi> g;
    public final acs h;
    public final Activity i;
    public yai j;
    
    public gop(final dej d, final SettingsListViewModel e, final obi<?> obi, final acs h, final Activity i, final yai j) {
        super((Class)h8c.class);
        this.g = (mv1<tmi>)mv1.e((Object)tmi.a);
        this.d = d;
        this.e = e;
        this.h = h;
        this.i = i;
        final dn6 h2 = obi.h((Class)rop.class, (tsm)new etr());
        this.f = (dn6<qop, rop>)h2;
        this.j = j;
        f.i(h2.c(), (n93)new jgk((Object)this, 21));
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final hop hop = (hop)v7x;
        final i8c a = ((h8c)o).a;
        hop.E0.setText((CharSequence)((oxm)a.a).D0);
        final dej d = this.d;
        final cej b = a.b;
        if (b == null) {
            ((View)hop.F0).setVisibility(8);
        }
        else {
            d.a(hop.F0, (oxm)b);
        }
        hop.D0.setOnClickListener((View$OnClickListener)new ty((Object)this, (Object)a, 15));
        final t19 subscribe = ((h5j)this.g).subscribe((lj6)new fy0((Object)this, (Object)a, (Object)hop, 8));
        hop.H0.a();
        hop.H0.c(subscribe);
        xbm.i((oj)new tzo((Object)hop, 13));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        return (v7x)new hop(da8.h(viewGroup, 2131625081, viewGroup, false));
    }
}

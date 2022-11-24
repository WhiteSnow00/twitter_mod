import java.util.AbstractCollection;
import java.util.List;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$e;
import java.util.Collection;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.NavigationHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class owd extends p8x
{
    public final s4e<ewd> K0;
    public final b39 L0;
    public final b39 M0;
    
    public owd(final k9x k9x, final kcm kcm, final bur bur, final pwd pwd, final mwd mwd, final NavigationHandler navigationHandler, final d4e<ewd> d4e, final s4e<ewd> k0, final lf1 lf1, final OcfEventReporter ocfEventReporter) {
        super(k9x);
        this.C1(((sl8)mwd).F0);
        this.K0 = k0;
        final int a = o5j.a;
        final kwd h = (kwd)bur;
        if (pwd.h == null) {
            final fwd a2 = pwd.a;
            final afj f = ((bur)h).f;
            final pej a3 = f.a;
            pej n0 = pej.N0;
            pej pej;
            if ((pej = a3) == null) {
                pej = n0;
            }
            final pej b = f.b;
            if (b != null) {
                n0 = b;
            }
            a2.a = new ewd$e(pej, n0, h.m, h.j);
            pwd.h = h;
            pwd.e.a = h.n;
            ((List)pwd.b).clear();
            ((List<Object>)pwd.b).addAll(h.k);
            pwd.f.onNext((Object)pwd.a());
            ((AbstractCollection<Object>)pwd.c).addAll(h.l);
            pwd.g.onNext((Object)pwd.c);
        }
        final j4e adapter = new j4e((f5e)k0, (d4e)d4e, kcm);
        ((RecyclerView$e)adapter).A(true);
        mwd.G0.setAdapter((RecyclerView$e)adapter);
        this.L0 = ((t5j)pwd.f).map((rtb)new if8((Object)pwd, 7)).subscribe((rk6)new di3((Object)this, 20));
        final dtv a4 = ((bur)h).a;
        vmw.g((Object)a4);
        final String c = a4.c;
        final pc2 pc2 = new pc2((Object)navigationHandler, (Object)h, (Object)pwd, 4);
        final ba2 h2 = mwd.H0;
        String s;
        if ((s = c) == null) {
            s = "";
        }
        ((rrt)h2).o0((CharSequence)s);
        ((rrt)mwd.H0).n0((View$OnClickListener)pc2);
        this.M0 = ((t5j)pwd.g).subscribe((rk6)new iug((Object)mwd, 13));
        final dtv b2 = ((bur)h).b;
        if (b2 != null) {
            final String c2 = b2.c;
            final nwd nwd = new nwd(navigationHandler, b2, 0);
            mwd.H0.r0((CharSequence)c2);
            mwd.H0.q0((View$OnClickListener)nwd);
        }
        lf1.a(((sl8)mwd).F0, bur.d, (View$OnClickListener)null);
        ocfEventReporter.c();
    }
    
    @Override
    public final void w1() {
        this.L0.dispose();
        this.M0.dispose();
    }
}

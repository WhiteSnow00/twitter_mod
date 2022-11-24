import java.util.List;
import android.view.View;
import android.view.ViewStub;
import com.twitter.onboarding.ocf.analytics.OcfEventReporter;
import com.twitter.onboarding.ocf.topicselector.b;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fpf implements gra
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    
    public fpf(final Object b, final Object c, final Object d, final Object e, final Object f, final int a) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                final Activity activity = (Activity)this.b;
                final zym zym = (zym)this.c;
                final qgc qgc = (qgc)this.d;
                final pym pym = (pym)this.e;
                final d6w d6w = (d6w)this.f;
                final fg4 c = (fg4)o;
                e0e.f((Object)activity, "$activity");
                e0e.f((Object)zym, "$urlClickHandler");
                e0e.f((Object)qgc, "$hashtagClickListener");
                e0e.f((Object)pym, "$mentionClickHandler");
                e0e.f((Object)d6w, "$uriNavigator");
                final pe6 c2 = pe6.c((Context)activity);
                ((List<z0r>)c2.a).add(new z0r((z0r$a)new mf4((Context)activity, (Class)yym.class, (mf4$b)new nea(c, zym, 12))));
                ((List<sym>)c2.a).add(mf4.a((Context)activity, (mf4$b)new ke4((Object)d6w, 14)));
                ((List<mym>)c2.a).add(new mym((Context)activity, qgc));
                final rym rym = new rym((Context)activity, pym);
                rym.c = c;
                ((List<rym>)c2.a).add(rym);
                return c2;
            }
            case 1: {
                return new lnt(new mnt(((LayoutInflater)this.b).inflate(2131625059, (ViewGroup)o, false)), (b)this.c, (fut)this.d, (qej)this.e, (OcfEventReporter)this.f);
            }
            case 0: {
                final lh2 lh2 = (lh2)this.b;
                final dtf dtf = (dtf)this.c;
                final jzw jzw = (jzw)this.d;
                final iqf iqf = (iqf)this.e;
                final apf apf = (apf)this.f;
                final ViewGroup viewGroup = (ViewGroup)o;
                e0e.f((Object)lh2, "$controllerManager");
                e0e.f((Object)dtf, "$chromeFeatures");
                e0e.f((Object)jzw, "$videoDockController");
                e0e.f((Object)iqf, "$stateCoordinator");
                e0e.f((Object)apf, "$accessibilityUtils");
                e0e.f((Object)viewGroup, "viewGroup");
                final ojf h = ojf.H();
                h.p((Object)new oqf(lh2));
                h.p((Object)new n3g(viewGroup));
                if (dtf.a()) {
                    h.p((Object)new axf(jzw).f(viewGroup));
                    final lsf lsf = new lsf();
                    final rpf rpf = new rpf(dtf, iqf);
                    final eqf eqf = new eqf((ViewStub)((View)viewGroup).findViewById(2131429832), zrm.Companion.b((View)viewGroup));
                    h.p((Object)new dqf(eqf, rpf, new fqf(ita.b().h("live_event_multi_video_auto_advance_transition_duration_seconds", 5L), iqs.j(), (gqf)eqf, apf), lsf));
                }
                return new ha4((List)((z4j)h).e());
            }
        }
    }
}

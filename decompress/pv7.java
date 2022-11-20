import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import java.util.LinkedHashMap;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import android.app.Dialog;
import com.twitter.ui.components.button.legacy.TwitterButton;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pv7 implements ilx<cw7, mv7, lv7>
{
    public static final a Companion;
    public final az7 D0;
    public final fkf<ex7> E0;
    public final h5j<mv7> F0;
    public final p G0;
    public final qft H0;
    public final SwipeRefreshLayout I0;
    public final RecyclerView J0;
    public final TextView K0;
    public final ViewGroup L0;
    public final TextView M0;
    public final FrescoMediaImageView N0;
    public final TextView O0;
    public final TwitterButton P0;
    public final nnl<mv7> Q0;
    public kjl$b R0;
    public final String S0;
    public final String T0;
    public final String U0;
    public final String V0;
    public final String W0;
    public final String X0;
    public final itb<Dialog, Integer, Integer, fzv> Y0;
    public final rhh<cw7> Z0;
    
    static {
        Companion = new a();
    }
    
    public pv7(final View view, final az7 d0, final fkf<ex7> e0, final h5j<mv7> f0, final h3e$a h3e$a, final c3e<ex7> c3e, final xbm xbm, final p g0, final qft h0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)d0, "navigator");
        czd.f((Object)e0, "itemProvider");
        czd.f((Object)f0, "recentItemIntentObservable");
        czd.f((Object)h3e$a, "itemDecorator");
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)h0, "toaster");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final SwipeRefreshLayout i0 = (SwipeRefreshLayout)view;
        this.I0 = i0;
        final RecyclerView j0 = (RecyclerView)view.findViewById(16908298);
        this.J0 = j0;
        this.K0 = (TextView)view.findViewById(2131428930);
        this.L0 = (ViewGroup)view.findViewById(2131429772);
        this.M0 = (TextView)view.findViewById(2131428938);
        this.N0 = (FrescoMediaImageView)view.findViewById(2131428925);
        this.O0 = (TextView)view.findViewById(2131428921);
        this.P0 = (TwitterButton)view.findViewById(2131428918);
        this.Q0 = (nnl<mv7>)new nnl();
        final Resources resources = view.getResources();
        this.R0 = new kjl$b(887);
        final String string = resources.getString(2131953421);
        czd.e((Object)string, "res.getString(com.twitte\u2026_search_no_results_title)");
        this.S0 = string;
        final String string2 = resources.getString(2131953419);
        czd.e((Object)string2, "res.getString(com.twitte\u2026h_no_results_description)");
        this.T0 = string2;
        final String string3 = resources.getString(2131953422);
        czd.e((Object)string3, "res.getString(com.twitte\u2026h_start_new_conversation)");
        this.U0 = string3;
        final String string4 = resources.getString(2131953417);
        czd.e((Object)string4, "res.getString(com.twitte\u2026search_no_internet_title)");
        this.V0 = string4;
        final String string5 = resources.getString(2131953416);
        czd.e((Object)string5, "res.getString(com.twitte\u2026_no_internet_description)");
        this.W0 = string5;
        final String string6 = resources.getString(2131957162);
        czd.e((Object)string6, "res.getString(com.twitte\u2026ts.legacy.R.string.retry)");
        this.X0 = string6;
        final itb<Dialog, Integer, Integer, fzv> y0 = (itb<Dialog, Integer, Integer, fzv>)new itb<Dialog, Integer, Integer, fzv>(this) {
            public final pv7 D0;
            
            public final Object h0(final Object o, final Object o2, final Object o3) {
                final Dialog dialog = (Dialog)o;
                ((Number)o2).intValue();
                final int intValue = ((Number)o3).intValue();
                czd.f((Object)dialog, "<anonymous parameter 0>");
                if (intValue == -1) {
                    this.D0.Q0.onNext((Object)mv7$h.a);
                }
                return fzv.a;
            }
        };
        this.Y0 = y0;
        final a7m a7m = new a7m(((View)j0).getContext(), j0);
        a7m.z((RecyclerView$e)new h3e((d4e)e0, (c3e)c3e, xbm));
        a7m.p((RecyclerView$l)h3e$a);
        a7m.A((RecyclerView$j)new g());
        i0.setOnRefreshListener((SwipeRefreshLayout.h)new lo((Object)this, 0));
        xbm.i((oj)new nv7((Object)((h5j)new x6m(j0)).filter((ytk)new bu4((qsb)pv7$d.D0, 3)).subscribe((lj6)new st1((qsb)new qsb<Integer, fzv>(this) {
            public final pv7 D0;
            
            public final Object invoke(final Object o) {
                final Integer n = (Integer)o;
                this.D0.Q0.onNext((Object)mv7$b.a);
                return fzv.a;
            }
        }, 7)), (Object)max.I(view, (qsb)new qsb<MotionEvent, Boolean>(this) {
            public final pv7 D0;
            
            public final Object invoke(final Object o) {
                final MotionEvent motionEvent = (MotionEvent)o;
                czd.f((Object)motionEvent, "event");
                final int n = motionEvent.getActionMasked() & motionEvent.getAction();
                if (n == 0 || n == 2) {
                    this.D0.Q0.onNext((Object)mv7$b.a);
                }
                return Boolean.FALSE;
            }
        }).subscribe(), 0));
        final Fragment g2 = g0.G(887);
        Object o;
        if (g2 instanceof jjl) {
            o = g2;
        }
        else {
            o = null;
        }
        if (o != null) {
            ((wk1)o).U1 = (xv8)new ov7((itb)y0, 0);
            final int a = c5j.a;
        }
        this.Z0 = (rhh<cw7>)q3j.g0((qsb)new qsb<rhh$a<cw7>, fzv>(this) {
            public final pv7 D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)qv7.D0 }, (qsb)new rv7(this.D0));
                final uv7 uv7 = new uv7(this.D0);
                final LinkedHashMap b = rhh$a.b;
                final rhh$a rhh$a2 = new rhh$a();
                uv7.invoke((Object)rhh$a2);
                b.put(cw7$a.class, rhh$a2.b());
                final xv7 xv7 = new xv7(this.D0);
                final LinkedHashMap b2 = rhh$a.b;
                final rhh$a rhh$a3 = new rhh$a();
                xv7.invoke((Object)rhh$a3);
                b2.put(cw7$c.b.class, rhh$a3.b());
                final aw7 aw7 = new aw7(this.D0);
                final LinkedHashMap b3 = rhh$a.b;
                final rhh$a rhh$a4 = new rhh$a();
                aw7.invoke(rhh$a4);
                b3.put(cw7$b.class, rhh$a4.b());
                rhh$a.a((ftb)rhh$a$c.D0, (qsb)new bw7(this.D0));
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final cw7 cw7 = (cw7)jbx;
        czd.f((Object)cw7, "state");
        this.Z0.b((Object)cw7);
    }
    
    public final void q(final Object o) {
        final lv7 lv7 = (lv7)o;
        czd.f((Object)lv7, "effect");
        if (lv7 instanceof lv7$b) {
            final az7 d0 = this.D0;
            final qo7 a = ((lv7$b)lv7).a;
            Objects.requireNonNull(d0);
            czd.f((Object)a, "inboxItem");
            final tj7$b tj7$b = new tj7$b();
            ((tj7$a)tj7$b).E(a);
            d0.d.d((Context)d0.a, (obi)d0.b, (tj7)((n4j)tj7$b).e());
        }
        else if (lv7 instanceof lv7$d) {
            ecl.d((Context)this.D0.a, UserIdentifier.Companion.a(((lv7$d)lv7).a.D0));
        }
        else if (lv7 instanceof lv7$f) {
            this.D0.b(((lv7$f)lv7).a);
        }
        else if (czd.a((Object)lv7, (Object)lv7$c.a)) {
            this.D0.a();
        }
        else if (czd.a((Object)lv7, (Object)lv7$a.a)) {
            are.c((View)this.J0);
        }
        else if (czd.a((Object)lv7, (Object)lv7$e.a)) {
            this.H0.c(2131958156, 0);
        }
        else if (czd.a((Object)lv7, (Object)lv7$g.a)) {
            final kjl$b r0 = this.R0;
            ((kjl$a)r0).H(2131956919);
            ((kjl$a)r0).A(2131956920);
            ((kjl$a)r0).F(2131952458);
            ((kjl$a)r0).C(2131952374);
            final wk1 w = ((xk1$a)r0).w();
            w.U1 = (xv8)new dib((Object)this.Y0, 1);
            final int a2 = c5j.a;
            w.l2(this.G0);
        }
    }
    
    public final h5j<mv7> w() {
        final h5j merge = h5j.merge((taj)this.Q0, (taj)this.F0);
        czd.e((Object)merge, "merge(\n            viewI\u2026ntentObservable\n        )");
        return (h5j<mv7>)merge;
    }
    
    public static final class a
    {
    }
    
    public interface b
    {
        pv7 a(final View p0);
    }
}

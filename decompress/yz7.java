import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;
import android.view.View$OnClickListener;
import java.util.List;
import java.util.LinkedHashMap;
import android.view.MotionEvent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h;
import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import com.twitter.ui.components.button.legacy.TwitterButton;
import com.twitter.media.ui.fresco.FrescoMediaImageView;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yz7 implements okx<m08, wz7, tz7>
{
    public final View C0;
    public final sz7 D0;
    public final vkf<wx7> E0;
    public final b5j<wz7> F0;
    public final bft G0;
    public final boolean H0;
    public final SwipeRefreshLayout I0;
    public final TextView J0;
    public final ViewGroup K0;
    public final TextView L0;
    public final FrescoMediaImageView M0;
    public final TextView N0;
    public final TwitterButton O0;
    public final zml<wz7> P0;
    public final Resources Q0;
    public final String R0;
    public final String S0;
    public final String T0;
    public final String U0;
    public final String V0;
    public final mhh<m08> W0;
    
    public yz7(final View c0, final sz7 d0, final vkf<wx7> e0, final b5j<wz7> f0, final c4e$a c4e$a, final x3e<wx7> x3e, final ibm ibm, final bft g0, final boolean h0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)d0, "navigator");
        zzd.f((Object)e0, "itemProvider");
        zzd.f((Object)f0, "recentItemIntentObservable");
        zzd.f((Object)c4e$a, "itemDecorator");
        zzd.f((Object)x3e, "itemBinderDirectory");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)g0, "toaster");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final SwipeRefreshLayout i0 = (SwipeRefreshLayout)c0;
        this.I0 = i0;
        final RecyclerView recyclerView = (RecyclerView)c0.findViewById(16908298);
        this.J0 = (TextView)c0.findViewById(2131428930);
        this.K0 = (ViewGroup)c0.findViewById(2131429772);
        this.L0 = (TextView)c0.findViewById(2131428938);
        this.M0 = (FrescoMediaImageView)c0.findViewById(2131428925);
        this.N0 = (TextView)c0.findViewById(2131428921);
        this.O0 = (TwitterButton)c0.findViewById(2131428918);
        this.P0 = (zml<wz7>)new zml();
        final Resources resources = c0.getResources();
        this.Q0 = resources;
        final String string = resources.getString(2131953421);
        zzd.e((Object)string, "res.getString(com.twitte\u2026_search_no_results_title)");
        this.R0 = string;
        final String string2 = resources.getString(2131953419);
        zzd.e((Object)string2, "res.getString(com.twitte\u2026h_no_results_description)");
        this.S0 = string2;
        final String string3 = resources.getString(2131953420);
        zzd.e((Object)string3, "res.getString(com.twitte\u2026ages_enabled_description)");
        this.T0 = string3;
        final String string4 = resources.getString(2131953422);
        zzd.e((Object)string4, "res.getString(com.twitte\u2026h_start_new_conversation)");
        this.U0 = string4;
        final String string5 = resources.getString(2131957162);
        zzd.e((Object)string5, "res.getString(com.twitte\u2026ts.legacy.R.string.retry)");
        this.V0 = string5;
        final k6m k6m = new k6m(((View)recyclerView).getContext(), recyclerView);
        k6m.z((RecyclerView$e)new c4e((y4e)e0, (x3e)x3e, ibm));
        k6m.p((RecyclerView$l)c4e$a);
        k6m.A((RecyclerView$j)new g());
        ((ViewGroup)i0).getLayoutTransition().setAnimateParentHierarchy(false);
        i0.setOnRefreshListener((SwipeRefreshLayout$h)new xz7(this));
        ibm.i((rj)new pj4((Object)((b5j)new h6m(recyclerView)).filter((ptk)new di((rtb)yz7$b.C0, 2)).subscribe((fk6)new zak((rtb)new rtb<Integer, oyv>() {
            public final /* synthetic */ yz7 C0;
            
            public final Object invoke(final Object o) {
                final Integer n = (Integer)o;
                this.C0.P0.onNext((Object)wz7$b.a);
                return oyv.a;
            }
        }, 11)), (Object)asy.E0(c0, (rtb)new rtb<MotionEvent, Boolean>() {
            public final /* synthetic */ yz7 C0;
            
            public final Object invoke(final Object o) {
                final MotionEvent motionEvent = (MotionEvent)o;
                zzd.f((Object)motionEvent, "event");
                final int n = motionEvent.getActionMasked() & motionEvent.getAction();
                if (n == 0 || n == 2) {
                    this.C0.P0.onNext((Object)wz7$b.a);
                }
                return Boolean.FALSE;
            }
        }).subscribe(), 1));
        this.W0 = (mhh<m08>)ajy.a0((rtb)new rtb<mhh$a<m08>, oyv>() {
            public final /* synthetic */ yz7 C0;
            
            public final Object invoke(final Object o) {
                final mhh$a mhh$a = (mhh$a)o;
                zzd.f((Object)mhh$a, "$this$watch");
                mhh$a.c(new voe[] { (voe)zz7.C0 }, (rtb)new a08(this.C0));
                final d08 d08 = new d08(this.C0);
                final LinkedHashMap b = mhh$a.b;
                final mhh$a mhh$a2 = new mhh$a();
                d08.invoke((Object)mhh$a2);
                b.put(m08.a.class, mhh$a2.b());
                final g08 g08 = new g08(this.C0);
                final LinkedHashMap b2 = mhh$a.b;
                final mhh$a mhh$a3 = new mhh$a();
                g08.invoke((Object)mhh$a3);
                b2.put(m08$c$b.class, mhh$a3.b());
                final j08 j08 = new j08(this.C0);
                final LinkedHashMap b3 = mhh$a.b;
                final mhh$a mhh$a4 = new mhh$a();
                j08.invoke((Object)mhh$a4);
                b3.put(m08.b.class, mhh$a4.b());
                mhh$a.a((gub)mhh$a$c.C0, (rtb)new k08(this.C0));
                return oyv.a;
            }
        });
    }
    
    public final void T(final oax oax) {
        final m08 m08 = (m08)oax;
        zzd.f((Object)m08, "state");
        this.W0.b((Object)m08);
    }
    
    public final void a(final int n, final int n2) {
        this.E0.g((List)v2a.C0);
        this.L0.setText((CharSequence)this.Q0.getString(n));
        this.N0.setText((CharSequence)this.Q0.getString(n2));
        ((TextView)this.O0).setText((CharSequence)this.V0);
        final TextView j0 = this.J0;
        zzd.e((Object)j0, "unSearchedTextView");
        ((View)j0).setVisibility(8);
        final ViewGroup k0 = this.K0;
        zzd.e((Object)k0, "noResultsContainer");
        ((View)k0).setVisibility(0);
        ((View)this.O0).setOnClickListener((View$OnClickListener)new u0p((Object)this, 8));
    }
    
    public final void s(final Object o) {
        final tz7 tz7 = (tz7)o;
        zzd.f((Object)tz7, "effect");
        if (tz7 instanceof tz7$a) {
            final sz7 d0 = this.D0;
            final String a = ((tz7$a)tz7).a;
            Objects.requireNonNull(d0);
            zzd.f((Object)a, "conversationId");
            final kk7$b kk7$b = new kk7$b();
            ((kk7$a)kk7$b).A(a);
            d0.d.d((Context)d0.a, d0.b, (kk7)((h4j)kk7$b).e());
        }
        else if (tz7 instanceof tz7$b) {
            final sz7 d2 = this.D0;
            final tz7$b tz7$b = (tz7$b)tz7;
            final String a2 = tz7$b.a;
            final long b = tz7$b.b;
            Objects.requireNonNull(d2);
            zzd.f((Object)a2, "conversationId");
            final kk7$b kk7$b2 = new kk7$b();
            ((kk7$a)kk7$b2).A(a2);
            ((BaseBundle)((zl1$a)kk7$b2).a).putLong("snapshot_message_id", b);
            final int a3 = w4j.a;
            d2.d.d((Context)d2.a, d2.b, (kk7)((h4j)kk7$b2).e());
        }
        else if (tz7 instanceof tz7$d) {
            rbl.d((Context)this.D0.a, UserIdentifier.Companion.a(((tz7$d)tz7).a.C0));
        }
        else if (tz7 instanceof tz7$f) {
            this.D0.b(((tz7$f)tz7).a);
        }
        else if (zzd.a((Object)tz7, (Object)tz7$c.a)) {
            this.D0.a();
        }
        else if (zzd.a((Object)tz7, (Object)tz7$e.a)) {
            this.G0.b(2131958156, 0);
        }
    }
    
    public final b5j<wz7> x() {
        final b5j merge = b5j.merge((naj)this.P0, (naj)this.F0);
        zzd.e((Object)merge, "merge(\n            viewI\u2026ntentObservable\n        )");
        return (b5j<wz7>)merge;
    }
}

import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import java.util.Objects;
import android.view.View$OnClickListener;
import java.util.List;
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

public final class j08 implements xlx<y08, h08, e08>
{
    public final View F0;
    public final d08 G0;
    public final clf<hy7> H0;
    public final t5j<h08> I0;
    public final igt J0;
    public final boolean K0;
    public final SwipeRefreshLayout L0;
    public final TextView M0;
    public final ViewGroup N0;
    public final TextView O0;
    public final FrescoMediaImageView P0;
    public final TextView Q0;
    public final TwitterButton R0;
    public final znl<h08> S0;
    public final Resources T0;
    public final String U0;
    public final String V0;
    public final String W0;
    public final String X0;
    public final String Y0;
    public final fih<y08> Z0;
    
    public j08(final View f0, final d08 g0, final clf<hy7> h0, final t5j<h08> i0, final j4e$a j4e$a, final d4e<hy7> d4e, final kcm kcm, final igt j0, final boolean k0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)g0, "navigator");
        e0e.f((Object)h0, "itemProvider");
        e0e.f((Object)i0, "recentItemIntentObservable");
        e0e.f((Object)j4e$a, "itemDecorator");
        e0e.f((Object)d4e, "itemBinderDirectory");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)j0, "toaster");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        final SwipeRefreshLayout l0 = (SwipeRefreshLayout)f0;
        this.L0 = l0;
        final RecyclerView recyclerView = (RecyclerView)f0.findViewById(16908298);
        this.M0 = (TextView)f0.findViewById(2131428930);
        this.N0 = (ViewGroup)f0.findViewById(2131429773);
        this.O0 = (TextView)f0.findViewById(2131428938);
        this.P0 = (FrescoMediaImageView)f0.findViewById(2131428925);
        this.Q0 = (TextView)f0.findViewById(2131428921);
        this.R0 = (TwitterButton)f0.findViewById(2131428918);
        this.S0 = (znl<h08>)new znl();
        final Resources resources = f0.getResources();
        this.T0 = resources;
        final String string = resources.getString(2131953421);
        e0e.e((Object)string, "res.getString(com.twitte\u2026_search_no_results_title)");
        this.U0 = string;
        final String string2 = resources.getString(2131953419);
        e0e.e((Object)string2, "res.getString(com.twitte\u2026h_no_results_description)");
        this.V0 = string2;
        final String string3 = resources.getString(2131953420);
        e0e.e((Object)string3, "res.getString(com.twitte\u2026ages_enabled_description)");
        this.W0 = string3;
        final String string4 = resources.getString(2131953422);
        e0e.e((Object)string4, "res.getString(com.twitte\u2026h_start_new_conversation)");
        this.X0 = string4;
        final String string5 = resources.getString(2131957162);
        e0e.e((Object)string5, "res.getString(com.twitte\u2026ts.legacy.R.string.retry)");
        this.Y0 = string5;
        final n7m n7m = new n7m(((View)recyclerView).getContext(), recyclerView);
        n7m.z((RecyclerView$e)new j4e((f5e)h0, (d4e)d4e, kcm));
        n7m.p((RecyclerView$l)j4e$a);
        n7m.A((RecyclerView$j)new g());
        ((ViewGroup)l0).getLayoutTransition().setAnimateParentHierarchy(false);
        l0.setOnRefreshListener((SwipeRefreshLayout$h)new i08(this));
        kcm.i((sj)new psf(new k7m(recyclerView).filter((ouk)new m7k((stb)j08$b.F0, 2)).subscribe((rk6)new waa((stb)new j08$c(this), 12)), vq9.t(f0, (stb)new j08$d(this)).subscribe(), 1));
        this.Z0 = (fih<y08>)ma7.S((stb)new j08$e(this));
    }
    
    public final void T(final ccx ccx) {
        final y08 y08 = (y08)ccx;
        e0e.f((Object)y08, "state");
        this.Z0.b((Object)y08);
    }
    
    public final void a(final int n, final int n2) {
        this.H0.g((List)h3a.F0);
        this.O0.setText((CharSequence)this.T0.getString(n));
        this.Q0.setText((CharSequence)this.T0.getString(n2));
        ((TextView)this.R0).setText((CharSequence)this.Y0);
        final TextView m0 = this.M0;
        e0e.e((Object)m0, "unSearchedTextView");
        ((View)m0).setVisibility(8);
        final ViewGroup n3 = this.N0;
        e0e.e((Object)n3, "noResultsContainer");
        ((View)n3).setVisibility(0);
        ((View)this.R0).setOnClickListener((View$OnClickListener)new d1x((Object)this, 9));
    }
    
    public final void r(final Object o) {
        final e08 e08 = (e08)o;
        e0e.f((Object)e08, "effect");
        if (e08 instanceof e08$a) {
            final d08 g0 = this.G0;
            final String a = ((e08$a)e08).a;
            Objects.requireNonNull(g0);
            e0e.f((Object)a, "conversationId");
            final uk7$b uk7$b = new uk7$b();
            ((uk7$a)uk7$b).A(a);
            g0.d.d((Context)g0.a, g0.b, (uk7)((z4j)uk7$b).e());
        }
        else if (e08 instanceof e08$b) {
            final d08 g2 = this.G0;
            final e08$b e08$b = (e08$b)e08;
            final String a2 = e08$b.a;
            final long b = e08$b.b;
            Objects.requireNonNull(g2);
            e0e.f((Object)a2, "conversationId");
            final uk7$b uk7$b2 = new uk7$b();
            ((uk7$a)uk7$b2).A(a2);
            ((BaseBundle)((am1.a)uk7$b2).a).putLong("snapshot_message_id", b);
            final int a3 = o5j.a;
            g2.d.d((Context)g2.a, g2.b, (uk7)((z4j)uk7$b2).e());
        }
        else if (e08 instanceof e08$d) {
            rcl.d((Context)this.G0.a, UserIdentifier.Companion.a(((e08$d)e08).a.F0));
        }
        else if (e08 instanceof e08$f) {
            this.G0.b(((e08$f)e08).a);
        }
        else if (e0e.a((Object)e08, (Object)e08$c.a)) {
            this.G0.a();
        }
        else if (e0e.a((Object)e08, (Object)e08$e.a)) {
            this.J0.c(2131958156, 0);
        }
    }
    
    public final t5j<h08> w() {
        final t5j merge = t5j.merge((fbj)this.S0, (fbj)this.I0);
        e0e.e((Object)merge, "merge(\n            viewI\u2026ntentObservable\n        )");
        return (t5j<h08>)merge;
    }
}

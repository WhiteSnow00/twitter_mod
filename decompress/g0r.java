import android.content.Context;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.twitter.ui.components.button.legacy.TwitterButton;
import android.widget.HorizontalScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.widget.ProgressBar;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0r implements xlx<u0r, f0r, ixq>
{
    public static final g0r.g0r$a Companion;
    public final View F0;
    public final s4e<oxq> G0;
    public final asn H0;
    public final oko I0;
    public final b11 J0;
    public final k9x K0;
    public final ProgressBar L0;
    public final SwipeRefreshLayout M0;
    public final HorizontalScrollView N0;
    public final TwitterButton O0;
    public final FrameLayout P0;
    public final TextView Q0;
    public final znl<String> R0;
    public final fih<u0r> S0;
    
    static {
        Companion = new g0r.g0r$a();
    }
    
    public g0r(final View f0, final j4e<oxq> adapter, final s4e<oxq> g0, final asn h0, final oko i0, final b11 j0, final k9x k0, final kcm kcm) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)adapter, "adapter");
        e0e.f((Object)g0, "provider");
        e0e.f((Object)h0, "roomNavigator");
        e0e.f((Object)i0, "roomsScribeReporter");
        e0e.f((Object)j0, "componentPrefixDispatcher");
        e0e.f((Object)k0, "viewLifecycle");
        e0e.f((Object)kcm, "releaseCompletable");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        final View viewById = f0.findViewById(2131431633);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026tab_layout_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        final View viewById2 = f0.findViewById(2131431582);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.spaces_loading_view)");
        this.L0 = (ProgressBar)viewById2;
        final View viewById3 = f0.findViewById(2131431862);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.swipe_refresh_layout)");
        this.M0 = (SwipeRefreshLayout)viewById3;
        final View viewById4 = f0.findViewById(2131431583);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.spaces_search_view)");
        final ConstraintLayout constraintLayout = (ConstraintLayout)viewById4;
        final View viewById5 = f0.findViewById(2131430570);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.pills_layout_scroller)");
        final HorizontalScrollView n0 = (HorizontalScrollView)viewById5;
        this.N0 = n0;
        final View viewById6 = f0.findViewById(2131431594);
        e0e.e((Object)viewById6, "rootView.findViewById(R.\u2026.spaces_tab_button_retry)");
        this.O0 = (TwitterButton)viewById6;
        final View viewById7 = f0.findViewById(2131431555);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.space_tab_error_layout)");
        this.P0 = (FrameLayout)viewById7;
        final View viewById8 = ((View)constraintLayout).findViewById(2131430842);
        e0e.e((Object)viewById8, "spacesSearchView.findViewById(R.id.query_view)");
        this.Q0 = (TextView)viewById8;
        this.R0 = (znl<String>)new znl();
        f0.getContext();
        boolean b = true;
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        recyclerView.h((RecyclerView$l)new g0r$a$a(f0.getResources().getDimensionPixelSize(2131167434)));
        if (!vjo.n() || !ita.b().b("android_audio_spaces_tab_search_enabled", false)) {
            b = false;
        }
        final int n2 = 8;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)constraintLayout).setVisibility(visibility);
        int visibility2 = n2;
        if (ita.b().b("android_audio_spaces_tab_pills_enabled", false)) {
            visibility2 = 0;
        }
        ((View)n0).setVisibility(visibility2);
        ((View)n0).setHorizontalScrollBarEnabled(false);
        final t5j d = k0.d();
        final e39 e39 = new e39();
        ((yz5)kcm.G0).q((sj)new g0r$c(e39));
        e39.c(d.subscribe((rk6)new f$w3((stb)new g0r$d(this))));
        this.S0 = (fih<u0r>)ma7.S((stb)new g0r$i(this));
    }
    
    public static final void a(final g0r g0r, final boolean b, final boolean b2) {
        final int n = 0;
        final boolean b3 = b && !b2;
        final SwipeRefreshLayout m0 = g0r.M0;
        int visibility;
        if (b3 ^ true) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)m0).setVisibility(visibility);
        final FrameLayout p3 = g0r.P0;
        int visibility2;
        if (b3) {
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        ((View)p3).setVisibility(visibility2);
    }
    
    public final void T(final ccx ccx) {
        final u0r u0r = (u0r)ccx;
        e0e.f((Object)u0r, "state");
        this.S0.b((Object)u0r);
    }
    
    public final void b(final Button button) {
        int textColor;
        if (((View)button).isSelected()) {
            final Context context = this.F0.getContext();
            e0e.e((Object)context, "rootView.context");
            textColor = b1b.B(context, 2130968583);
        }
        else {
            final Context context2 = this.F0.getContext();
            e0e.e((Object)context2, "rootView.context");
            textColor = b1b.B(context2, 2130968593);
        }
        ((TextView)button).setTextColor(textColor);
    }
    
    public final void r(final Object o) {
        final ixq ixq = (ixq)o;
        e0e.f((Object)ixq, "effect");
        final boolean b = ixq instanceof ixq$a;
    }
    
    public final t5j<f0r> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)kqe.h0(this.M0).map((rtb)new d3o((stb)g0r$e.F0, 6)), (fbj)vq9.a((View)this.Q0).map((rtb)new ter((stb)g0r$f.F0, 3)), (fbj)((t5j)this.R0).map((rtb)new wsn((stb)g0r$g.F0, 29)), (fbj)vq9.a((View)this.O0).map((rtb)new t8o((stb)g0r$h.F0, 12)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        swip\u2026ent.RetryClicked },\n    )");
        return (t5j<f0r>)mergeArray;
    }
}

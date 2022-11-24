import androidx.recyclerview.widget.RecyclerView$j;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import android.widget.LinearLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqp implements xlx<sqp, iqp, hqp>
{
    public final clf<hbp> F0;
    public final fci<?> G0;
    public final znl<hbp> H0;
    public final Context I0;
    public final RecyclerView J0;
    public final TypefacesTextView K0;
    public final LinearLayout L0;
    public final TypefacesTextView M0;
    public final String N0;
    public final fih<sqp> O0;
    
    public jqp(final View view, final clf<hbp> f0, final d4e<hbp> d4e, final fci<?> g0, final znl<hbp> h0, final kcm kcm) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "itemProvider");
        e0e.f((Object)d4e, "itemBinderDirectory");
        e0e.f((Object)g0, "navigator");
        e0e.f((Object)h0, "resultItemClicks");
        e0e.f((Object)kcm, "releaseCompletable");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final Context context = view.getContext();
        e0e.e((Object)context, "rootView.context");
        this.I0 = context;
        final View viewById = view.findViewById(2131430984);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.results_list)");
        final RecyclerView j0 = (RecyclerView)viewById;
        this.J0 = j0;
        final View viewById2 = view.findViewById(2131431385);
        e0e.e((Object)viewById2, "rootView.findViewById(R.\u2026results_empty_state_text)");
        this.K0 = (TypefacesTextView)viewById2;
        final View viewById3 = view.findViewById(2131428936);
        e0e.e((Object)viewById3, "rootView.findViewById(R.\u2026ate_no_results_container)");
        this.L0 = (LinearLayout)viewById3;
        final View viewById4 = view.findViewById(2131430361);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.no_results_title)");
        this.M0 = (TypefacesTextView)viewById4;
        final String string = view.getResources().getString(2131953421);
        e0e.e((Object)string, "rootView.resources.getSt\u2026_search_no_results_title)");
        this.N0 = string;
        this.O0 = (fih<sqp>)ma7.S((stb)new jqp$c(this));
        final n7m n7m = new n7m(((View)j0).getContext(), j0);
        n7m.z((RecyclerView$e)new j4e((f5e)f0, (d4e)d4e, kcm));
        n7m.A((RecyclerView$j)new g());
    }
    
    public final void T(final ccx ccx) {
        final sqp sqp = (sqp)ccx;
        e0e.f((Object)sqp, "state");
        this.O0.b((Object)sqp);
    }
    
    public final void r(final Object o) {
        final hqp hqp = (hqp)o;
        e0e.f((Object)hqp, "effect");
        if (hqp instanceof hqp$a) {
            final sai a = ((hqp$a)hqp).a;
            if (a instanceof sai$c) {
                this.G0.b(((sai$c)a).a);
            }
            else if (a instanceof sai$a) {
                this.G0.d(((sai$a)a).a);
            }
            else if (a instanceof sai$b) {
                this.I0.startActivity(((sai$b)a).a);
            }
        }
    }
    
    public final t5j<iqp> w() {
        final t5j map = ((t5j)this.H0).map((rtb)new ula((stb)jqp$b.F0, 11));
        e0e.e((Object)map, "resultItemClicks.map { S\u2026SearchResultClicked(it) }");
        return (t5j<iqp>)map;
    }
}

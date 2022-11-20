import kotlin.NoWhenBranchMatchedException;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfo implements ilx<xfo, mfo, lfo>
{
    public static final pfo.pfo$a Companion;
    public final View D0;
    public final cho E0;
    public final TypefacesTextView F0;
    public final LinearLayout G0;
    public final ImageView H0;
    public final TypefacesTextView I0;
    public final RecyclerView J0;
    public final float K0;
    public final rhh<xfo> L0;
    
    static {
        Companion = new pfo.pfo$a();
    }
    
    public pfo(final View d0, final c3e<cgo> c3e, final vjo vjo, final xbm xbm) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)vjo, "roomsScribeReporter");
        czd.f((Object)xbm, "releaseCompletable");
        this.D0 = d0;
        final cho e0 = new cho();
        this.E0 = e0;
        final pfo.pfo$a.a adapter = new pfo.pfo$a.a(e0, (c3e)c3e, xbm, vjo);
        final View viewById = d0.findViewById(2131432076);
        czd.e((Object)viewById, "rootView.findViewById(R.id.title)");
        this.F0 = (TypefacesTextView)viewById;
        final View viewById2 = d0.findViewById(2131429399);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.header)");
        this.G0 = (LinearLayout)viewById2;
        final View viewById3 = d0.findViewById(2131428222);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.chevron)");
        this.H0 = (ImageView)viewById3;
        final View viewById4 = d0.findViewById(2131428505);
        czd.e((Object)viewById4, "rootView.findViewById(R.id.counter)");
        this.I0 = (TypefacesTextView)viewById4;
        final View viewById5 = d0.findViewById(2131430933);
        czd.e((Object)viewById5, "rootView.findViewById(R.id.recycler)");
        final RecyclerView j0 = (RecyclerView)viewById5;
        this.J0 = j0;
        final Resources resources = d0.getResources();
        czd.e((Object)resources, "rootView.resources");
        float k0;
        if (r40.d(resources)) {
            k0 = -90.0f;
        }
        else {
            k0 = 90.0f;
        }
        this.K0 = k0;
        this.L0 = (rhh<xfo>)q3j.g0((qsb)new pfo$d(this));
        j0.setAdapter((RecyclerView$e)adapter);
        final StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, 0);
        layoutManager.G1();
        j0.setLayoutManager((RecyclerView$m)layoutManager);
        j0.h((RecyclerView$l)new pfo$a$b());
    }
    
    public final void T(final jbx jbx) {
        final xfo xfo = (xfo)jbx;
        czd.f((Object)xfo, "state");
        this.L0.b((Object)xfo);
    }
    
    public final void q(final Object o) {
        final lfo lfo = (lfo)o;
        czd.f((Object)lfo, "effect");
        if (lfo instanceof lfo$a) {
            this.J0.v0(((lfo$a)lfo).a);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
    
    public final h5j<mfo> w() {
        final h5j map = aoo.f((View)this.G0).map((psb)new abr((qsb)pfo$c.D0, 4));
        czd.e((Object)map, "header.throttledClicks()\u2026oryIntent.HeaderPressed }");
        return (h5j<mfo>)map;
    }
}

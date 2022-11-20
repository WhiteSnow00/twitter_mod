import java.util.Collection;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nka implements y6x<ViewGroup>
{
    public final View D0;
    public final Activity E0;
    public ska F0;
    public final qft G0;
    public final nnl<uja> H0;
    public final ProgressBar I0;
    public final EditText J0;
    public final aka K0;
    
    public nka(View viewById, final Activity e0, final ska f0, final qft g0) {
        czd.f((Object)viewById, "contentView");
        czd.f((Object)e0, "activity");
        czd.f((Object)f0, "state");
        czd.f((Object)g0, "toaster");
        this.D0 = viewById;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (nnl<uja>)new nnl();
        final View viewById2 = viewById.findViewById(2131429855);
        czd.e((Object)viewById2, "contentView.findViewById(R.id.loading_progress)");
        this.I0 = (ProgressBar)viewById2;
        final View viewById3 = viewById.findViewById(2131431807);
        czd.e((Object)viewById3, "contentView.findViewById\u2026.id.suggestion_edit_text)");
        this.J0 = (EditText)viewById3;
        viewById = viewById.findViewById(2131431810);
        czd.e((Object)viewById, "contentView.findViewById\u2026suggestion_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        final aka aka = new aka((List)new ArrayList());
        this.K0 = aka;
        aka.H0 = new lo((Object)this, 8);
        ((View)recyclerView).getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)aka);
        this.a(this.F0);
    }
    
    public final void a(final ska f0) {
        czd.f((Object)f0, "viewState");
        this.F0 = f0;
        if (f0.d) {
            this.E0.finish();
            return;
        }
        final aka k0 = this.K0;
        final List b = f0.b;
        Objects.requireNonNull(k0);
        czd.f((Object)b, "locations");
        k0.G0.clear();
        k0.G0.addAll(b);
        ((RecyclerView$e)this.K0).f();
        final ProgressBar i0 = this.I0;
        int visibility;
        if (this.F0.c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)i0).setVisibility(visibility);
        if (this.F0.e) {
            this.G0.c(2131954010, 0);
            final ska f2 = this.F0;
            final String a = f2.a;
            final List b2 = f2.b;
            czd.f((Object)a, "inputText");
            czd.f((Object)b2, "locations");
        }
    }
}

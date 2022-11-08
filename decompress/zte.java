import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zte implements okx<due, Object, qte>, ay9<qte>
{
    public final mbi<?> C0;
    public final wte D0;
    public final /* synthetic */ rte E0;
    public final mhh<due> F0;
    
    public zte(final View view, final rte e0, final mbi<?> c0, final wte wte) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)e0, "effectHandler");
        zzd.f((Object)c0, "navigator");
        this.C0 = c0;
        this.D0 = wte;
        this.E0 = e0;
        final View viewById = view.findViewById(2131429710);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026bs_feature_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        recyclerView.setAdapter((RecyclerView$e)wte);
        view.getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        this.F0 = (mhh<due>)ajy.a0((rtb)new zte$b(this));
    }
    
    public final void T(final oax oax) {
        final due due = (due)oax;
        zzd.f((Object)due, "state");
        this.F0.b((Object)due);
    }
    
    public final void s(final Object o) {
        zzd.f((Object)o, "effect");
        Objects.requireNonNull(this.E0);
    }
}

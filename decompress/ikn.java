import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikn implements ilx<xkn, Object, fkn>, mx9<fkn>
{
    public final bjn D0;
    public final gkn E0;
    public final rhh<xkn> F0;
    
    public ikn(final View view, final h3e<ajn> adapter, final bjn d0, final gkn e0) {
        czd.f((Object)view, "rootView");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)d0, "collectionProvider");
        czd.f((Object)e0, "effectHandler");
        this.D0 = d0;
        this.E0 = e0;
        final View viewById = view.findViewById(2131431151);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026oms_follow_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        view.getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.F0 = (rhh<xkn>)q3j.g0((qsb)new ikn$b(this));
    }
    
    public final void T(final jbx jbx) {
        final xkn xkn = (xkn)jbx;
        czd.f((Object)xkn, "state");
        this.F0.b((Object)xkn);
    }
    
    public final void q(final Object o) {
        final fkn fkn = (fkn)o;
        czd.f((Object)fkn, "effect");
        this.E0.a(fkn);
    }
    
    public final h5j<Object> w() {
        final h5j never = h5j.never();
        czd.e((Object)never, "never()");
        return (h5j<Object>)never;
    }
}

import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vjn implements okx<kkn, Object, sjn>, ay9<sjn>
{
    public final nin C0;
    public final /* synthetic */ tjn D0;
    public final mhh<kkn> E0;
    
    public vjn(final View view, final c4e<min> adapter, final nin c0, final tjn d0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)adapter, "adapter");
        zzd.f((Object)c0, "collectionProvider");
        zzd.f((Object)d0, "effectHandler");
        this.C0 = c0;
        this.D0 = d0;
        final View viewById = view.findViewById(2131431149);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026oms_follow_recycler_view)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        view.getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        this.E0 = (mhh<kkn>)ajy.a0((rtb)new vjn$b(this));
    }
    
    public final void T(final oax oax) {
        final kkn kkn = (kkn)oax;
        zzd.f((Object)kkn, "state");
        this.E0.b((Object)kkn);
    }
    
    public final void s(final Object o) {
        final sjn sjn = (sjn)o;
        zzd.f((Object)sjn, "effect");
        this.D0.a(sjn);
    }
    
    public final b5j<Object> x() {
        final b5j never = b5j.never();
        zzd.e((Object)never, "never()");
        return (b5j<Object>)never;
    }
}

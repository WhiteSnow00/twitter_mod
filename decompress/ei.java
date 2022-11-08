import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ei implements okx<ii, zh, xh>, ay9<xh>
{
    public final nmd C0;
    public final cmd D0;
    public final /* synthetic */ yh E0;
    public final mhh<ii> F0;
    
    public ei(final View view, final yh e0, final mmd adapter, final Activity activity, final nmd c0, final cmd d0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)e0, "effectHandler");
        zzd.f((Object)adapter, "adapter");
        zzd.f((Object)activity, "activity");
        zzd.f((Object)c0, "infoItemCollectionProvider");
        zzd.f((Object)d0, "infoBinderActionDispatcher");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        final View viewById = view.findViewById(2131429711);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.landing_page_items)");
        final RecyclerView recyclerView = (RecyclerView)viewById;
        this.F0 = (mhh<ii>)ajy.a0((rtb)new ei$c(this));
        view.getContext();
        recyclerView.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        recyclerView.setAdapter((RecyclerView$e)adapter);
        activity.getWindow().setStatusBarColor(eo6.b((Context)activity, 2131100836));
    }
    
    public final void T(final oax oax) {
        final ii ii = (ii)oax;
        zzd.f((Object)ii, "state");
        this.F0.b((Object)ii);
    }
    
    public final void s(final Object o) {
        final xh xh = (xh)o;
        zzd.f((Object)xh, "effect");
        this.E0.a(xh);
    }
    
    public final b5j<zh> x() {
        final b5j map = this.D0.a().map((qtb)new di((rtb)ei$b.C0, 0));
        zzd.e((Object)map, "infoBinderActionDispatch\u2026}\n            }\n        }");
        return (b5j<zh>)map;
    }
}

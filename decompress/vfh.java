import androidx.recyclerview.widget.h0;
import java.util.Objects;
import android.content.res.Resources;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vfh implements xlx<yfh, lfh, gfh>
{
    public final hfh F0;
    public final nfh G0;
    public final kdh H0;
    public final RecyclerView I0;
    public final fih<yfh> J0;
    
    public vfh(final View view, final hfh f0, final j4e<efh> adapter, final nfh g0, final kdh h0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "mobileAppModuleEffectHandler");
        e0e.f((Object)adapter, "mobileAppModuleItemAdapter");
        e0e.f((Object)g0, "mobileAppModuleItemProvider");
        e0e.f((Object)h0, "mobileAppModuleActionDispatcher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final RecyclerView i0 = (RecyclerView)view.findViewById(2131430073);
        (this.I0 = i0).setAdapter((RecyclerView$e)adapter);
        view.getContext();
        i0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(0));
        final Resources resources = view.getResources();
        e0e.e((Object)resources, "rootView.resources");
        i0.h((RecyclerView$l)new ldh(resources, (j4e)adapter));
        ((h0)new v()).b(i0);
        this.J0 = (fih<yfh>)ma7.S((stb)new vfh$a(this));
    }
    
    public final void T(final ccx ccx) {
        final yfh yfh = (yfh)ccx;
        e0e.f((Object)yfh, "state");
        this.J0.b((Object)yfh);
    }
    
    public final void r(final Object o) {
        final gfh gfh = (gfh)o;
        e0e.f((Object)gfh, "effect");
        final hfh f0 = this.F0;
        Objects.requireNonNull(f0);
        if (gfh instanceof gfh$a) {
            String a = ((gfh$a)gfh).a;
            if (!(slr.k1((CharSequence)a) ^ true)) {
                a = null;
            }
            if (a != null) {
                f0.a.c(a);
            }
        }
    }
    
    public final t5j<lfh> w() {
        final xnl a = this.H0.a;
        Objects.requireNonNull(a);
        return (t5j<lfh>)new d8j((bol)a);
    }
}

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

public final class efh implements okx<hfh, ueh, peh>
{
    public final qeh C0;
    public final weh D0;
    public final tch E0;
    public final RecyclerView F0;
    public final mhh<hfh> G0;
    
    public efh(final View view, final qeh c0, final c4e<neh> adapter, final weh d0, final tch e0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "mobileAppModuleEffectHandler");
        zzd.f((Object)adapter, "mobileAppModuleItemAdapter");
        zzd.f((Object)d0, "mobileAppModuleItemProvider");
        zzd.f((Object)e0, "mobileAppModuleActionDispatcher");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        final RecyclerView f0 = (RecyclerView)view.findViewById(2131430070);
        (this.F0 = f0).setAdapter((RecyclerView$e)adapter);
        view.getContext();
        f0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(0));
        final Resources resources = view.getResources();
        zzd.e((Object)resources, "rootView.resources");
        f0.h((RecyclerView$l)new uch(resources, (c4e)adapter));
        ((h0)new v()).b(f0);
        this.G0 = (mhh<hfh>)ajy.a0((rtb)new efh$a(this));
    }
    
    public final void T(final oax oax) {
        final hfh hfh = (hfh)oax;
        zzd.f((Object)hfh, "state");
        this.G0.b((Object)hfh);
    }
    
    public final void s(final Object o) {
        final peh peh = (peh)o;
        zzd.f((Object)peh, "effect");
        final qeh c0 = this.C0;
        Objects.requireNonNull(c0);
        if (peh instanceof peh.a) {
            String a = ((peh.a)peh).a;
            if (!(ckr.h1((CharSequence)a) ^ true)) {
                a = null;
            }
            if (a != null) {
                c0.a.c(a);
            }
        }
    }
    
    public final b5j<ueh> x() {
        final xml a = this.E0.a;
        Objects.requireNonNull(a);
        return (b5j<ueh>)new l7j((bnl)a);
    }
}

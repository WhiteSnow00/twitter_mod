import android.view.View;
import android.widget.CompoundButton;
import android.view.View$OnClickListener;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pa8 extends RecyclerView$e<oa8>
{
    public final List<la8> F0;
    public final int G0;
    public final ghj H0;
    public final xqa<ViewGroup, ghj, oa8> I0;
    
    public pa8(final List<? extends la8> f0, final int g0, final ghj h0, final xqa<ViewGroup, ghj, oa8> i0) {
        zzd.f((Object)f0, "options");
        zzd.f((Object)h0, "dateFilterClickListener");
        this.F0 = (List<la8>)f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final int c() {
        return this.F0.size();
    }
    
    public final void p(final RecyclerView$c0 recyclerView$c0, int g0) {
        final oa8 oa8 = (oa8)recyclerView$c0;
        final la8 x0 = this.F0.get(g0);
        g0 = this.G0;
        zzd.f((Object)x0, "option");
        oa8.X0 = x0;
        final ma8 w0 = oa8.W0;
        final String a = x0.a;
        zzd.e((Object)a, "option.title");
        Objects.requireNonNull(w0);
        w0.D0.setText((CharSequence)a);
        h6q.Y(oa8.W0.E0, (CharSequence)x0.b);
        ((CompoundButton)oa8.W0.F0).setChecked(x0.d == g0);
        ((View)oa8.W0.F0).setOnClickListener((View$OnClickListener)new tpf((Object)oa8, 4));
    }
    
    public final RecyclerView$c0 r(final ViewGroup viewGroup, final int n) {
        zzd.f((Object)viewGroup, "parent");
        final Object a = this.I0.a((Object)viewGroup, (Object)this.H0);
        zzd.e(a, "itemHolderFactory.create\u2026 dateFilterClickListener)");
        return (oa8)a;
    }
}

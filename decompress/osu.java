import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osu extends siu implements f6x<View>
{
    public final l4e<lup> g1;
    public final c4e<lup> h1;
    
    public osu(final LayoutInflater layoutInflater, final x3e<lup> x3e, final fm fm, final l4e<lup> g1, final nw8 nw8, final ibm ibm, final tqm tqm, final wv1 wv1, final llb llb) {
        zzd.f((Object)layoutInflater, "layoutInflater");
        zzd.f((Object)x3e, "controller");
        zzd.f((Object)fm, "actionSheetViewOptions");
        zzd.f((Object)g1, "provider");
        zzd.f((Object)nw8, "dialogNavigationDelegate");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)tqm, "resourceProvider");
        zzd.f((Object)wv1, "behavioralEventHelper");
        zzd.f((Object)llb, "fontSizes");
        super(layoutInflater, tqm, fm.i, wv1, llb);
        this.g1 = g1;
        this.h1 = (c4e<lup>)new c4e((y4e)g1, (x3e)x3e, ibm);
        nw8.x0(true);
    }
    
    public final void s0(final fm fm, final nw8 nw8) {
        zzd.f((Object)fm, "options");
        zzd.f((Object)nw8, "delegate");
        final RecyclerView j0 = ((dm)this).J0;
        zzd.e((Object)j0, "actionsRecyclerView");
        final View c0 = ((el8)this).C0;
        zzd.e((Object)c0, "heldView");
        final c4e<lup> h1 = this.h1;
        c0.getContext();
        j0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        j0.setAdapter((RecyclerView$e)h1);
        final Context context = c0.getContext();
        zzd.e((Object)context, "heldView.context");
        j0.h((RecyclerView$l)new dup(context));
        final int dimensionPixelSize = c0.getResources().getDimensionPixelSize(2131167431);
        ((View)j0).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
        j0.setClipToPadding(false);
    }
}

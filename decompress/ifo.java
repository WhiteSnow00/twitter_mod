import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifo extends h3e<nfo>
{
    public final vjo L0;
    
    public ifo(final kfo kfo, final c3e<nfo> c3e, final xbm xbm, final vjo l0) {
        czd.f((Object)kfo, "itemProvider");
        czd.f((Object)c3e, "itemBinderDirectory");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)l0, "roomsScribeReporter");
        super((d4e)kfo, (c3e)c3e, xbm);
        this.L0 = l0;
    }
    
    public final void D(final h3e$b h3e$b, final int n) {
        super.D(h3e$b, n);
        if (n == this.c() - 1) {
            vjo.b0(this.L0, null, "bottom", null, 27);
        }
    }
    
    public final /* bridge */ void p(final RecyclerView$c0 recyclerView$c0, final int n) {
        this.D((h3e$b)recyclerView$c0, n);
    }
}

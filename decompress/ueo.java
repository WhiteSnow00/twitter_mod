import androidx.recyclerview.widget.RecyclerView$c0;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ueo extends c4e<zeo>
{
    public final gjo K0;
    
    public ueo(final weo weo, final x3e<zeo> x3e, final ibm ibm, final gjo k0) {
        zzd.f((Object)weo, "itemProvider");
        zzd.f((Object)x3e, "itemBinderDirectory");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)k0, "roomsScribeReporter");
        super((y4e)weo, (x3e)x3e, ibm);
        this.K0 = k0;
    }
    
    public final void D(final c4e$b c4e$b, final int n) {
        super.D(c4e$b, n);
        if (n == this.c() - 1) {
            gjo.b0(this.K0, null, "bottom", null, 27);
        }
    }
}

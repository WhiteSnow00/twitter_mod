import java.util.List;
import java.util.Collection;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzf implements a94
{
    public static final mzf.mzf$a Companion;
    public static final mzf.mzf$b L0;
    public final mzf.mzf$c D0;
    public final Resources E0;
    public final p6 F0;
    public final gwo G0;
    public final w19 H0;
    public final nnl<mzf.mzf$b> I0;
    public w4 J0;
    public Collection<? extends f2> K0;
    
    static {
        Companion = new mzf.mzf$a();
        L0 = new mzf.mzf$b(false, "", false);
    }
    
    public mzf(final mzf.mzf$c d0, final Resources e0, final p6 f0, final gwo g0) {
        czd.f((Object)f0, "telephonyUtil");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = new w19();
        this.I0 = (nnl<mzf.mzf$b>)new nnl();
    }
    
    public final void g(final w4 j0) {
        czd.f((Object)j0, "attachment");
        this.J0 = j0;
        this.H0.c(((h5j)this.I0).observeOn(this.G0).scan((Object)mzf.L0, (zv1)new ajd((Object)new mzf$d(this), 0)).subscribe((lj6)new ebk((qsb)new mzf$e(this), 6)));
        final xx0 e = j0.e;
        czd.e((Object)e, "attachment.eventDispatcher");
        e.l((Collection)(this.K0 = s9i.s((qsv)new nnk((nnk$a)new ozf(this)), (qsv)new fok((fok$a)new nzf(this)))));
    }
    
    public final void h() {
        this.D0.a();
    }
    
    public final void unbind() {
        this.H0.a();
        final w4 j0 = this.J0;
        if (j0 != null) {
            final List k0 = this.K0;
            if (k0 != null) {
                j0.e.Y((Collection)k0);
            }
        }
        this.J0 = null;
    }
}

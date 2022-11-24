import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbr extends b4e<mbr, obr>
{
    public final qej d;
    public final int e;
    
    public lbr(final qej d) {
        super((Class)mbr.class);
        this.d = d;
        this.e = 2131625068;
    }
    
    public lbr(final qej d, final int n, final int n2, final wg8 wg8) {
        e0e.f((Object)d, "ocfRichTextProcessorHelper");
        super((Class)mbr.class);
        this.d = d;
        this.e = 2131625093;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final obr obr = (obr)n8x;
        final mbr mbr = (mbr)o;
        e0e.f((Object)obr, "viewHolder");
        e0e.f((Object)mbr, "displayItem");
        final nbr a = mbr.a;
        final nbr.nbr$c f = a.f;
        if (f != nbr$c.G0) {
            final pej a2 = a.a;
            e0e.f((Object)f, "style");
            obr.l0(2131431727, f, a2);
            final nbr a3 = mbr.a;
            final pej b = a3.b;
            final nbr.nbr$c f2 = a3.f;
            e0e.f((Object)f2, "style");
            obr.l0(2131431726, f2, b);
        }
        else {
            obr.l0(2131431727, nbr$c.H0, a.a);
            obr.l0(2131431726, nbr$c.I0, mbr.a.b);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = LayoutInflater.from(((View)viewGroup).getContext()).inflate(this.e, viewGroup, false);
        e0e.e((Object)inflate, "from(parent.context).inf\u2026te(layout, parent, false)");
        return (n8x)new obr(inflate, this.d);
    }
}

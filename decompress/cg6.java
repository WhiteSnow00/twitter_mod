import android.view.View;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cg6 extends v3e<eoh$b, gg6>
{
    public final LayoutInflater d;
    public final zlh e;
    
    public cg6(final LayoutInflater d, final zlh e) {
        zzd.f((Object)d, "layoutInflater");
        zzd.f((Object)e, "listIntentDispatcher");
        super((Class)eoh$b.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final gg6 gg6 = (gg6)c7x;
        final eoh$b eoh$b = (eoh$b)o;
        zzd.f((Object)gg6, "viewHolder");
        zzd.f((Object)eoh$b, "item");
        gg6.X0.setText(eoh$b.a);
        gg6.W0.setOnClickListener((View$OnClickListener)new qi2((Object)new ag6(this, eoh$b), 16));
        bqe.s(gg6.W0, (otb)new bg6(eoh$b));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624239, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026utton_row, parent, false)");
        return (c7x)new gg6(inflate);
    }
}

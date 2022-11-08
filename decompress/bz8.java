import android.view.View;
import android.view.ViewGroup;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView;
import com.twitter.ui.components.inlinecallout.HorizonInlineCalloutView$a$a;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bz8 extends v3e<eoh$d, cz8>
{
    public final LayoutInflater d;
    
    public bz8(final LayoutInflater d) {
        zzd.f((Object)d, "layoutInflater");
        super((Class)eoh$d.class);
        this.d = d;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final cz8 cz8 = (cz8)c7x;
        final eoh$d eoh$d = (eoh$d)o;
        zzd.f((Object)cz8, "viewHolder");
        zzd.f((Object)eoh$d, "item");
        HorizonInlineCalloutView.g(cz8.W0, (HorizonInlineCalloutView$a)new HorizonInlineCalloutView$a$a((cqm)new ey0(2130969276), gpc.v1), eoh$d.a, 0, 0, (otb)null, 28);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624287, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026aimer_row, parent, false)");
        return (c7x)new cz8(inflate);
    }
}

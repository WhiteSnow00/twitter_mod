import android.view.View;
import android.view.ViewGroup;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fg6 extends v3e<eoh$c, hg6>
{
    public final LayoutInflater d;
    public final zlh e;
    
    public fg6(final LayoutInflater d, final zlh e) {
        zzd.f((Object)d, "layoutInflater");
        zzd.f((Object)e, "listIntentDispatcher");
        super((Class)eoh$c.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final hg6 hg6 = (hg6)c7x;
        final eoh$c eoh$c = (eoh$c)o;
        zzd.f((Object)hg6, "viewHolder");
        zzd.f((Object)eoh$c, "item");
        hg6.W0.setOnClickListener((View$OnClickListener)new spf((Object)new dg6(this, eoh$c), 13));
        hg6.X0.setOnClickListener((View$OnClickListener)new vrk((Object)new eg6(this, eoh$c), 13));
        final boolean c = eoh$c.c;
        final HorizonComposeButton w0 = hg6.W0;
        final int n = 8;
        int visibility;
        if (c ^ true) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)w0).setVisibility(visibility);
        final HorizonComposeButton x0 = hg6.X0;
        int visibility2 = n;
        if (c) {
            visibility2 = 0;
        }
        ((View)x0).setVisibility(visibility2);
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624240, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026on_row_v1, parent, false)");
        return (c7x)new hg6(inflate);
    }
}

import android.view.View;
import android.view.ViewGroup;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rg6 extends b4e<yoh$c, tg6>
{
    public final LayoutInflater d;
    public final tmh e;
    
    public rg6(final LayoutInflater d, final tmh e) {
        e0e.f((Object)d, "layoutInflater");
        e0e.f((Object)e, "listIntentDispatcher");
        super((Class)yoh$c.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final tg6 tg6 = (tg6)n8x;
        final yoh$c yoh$c = (yoh$c)o;
        e0e.f((Object)tg6, "viewHolder");
        e0e.f((Object)yoh$c, "item");
        tg6.Z0.setOnClickListener((View$OnClickListener)new f2p((Object)new pg6(this, yoh$c), 12));
        tg6.a1.setOnClickListener((View$OnClickListener)new quf(new qg6(this, yoh$c), 18));
        final boolean c = yoh$c.c;
        final HorizonComposeButton z0 = tg6.Z0;
        final int n = 8;
        int visibility;
        if (c ^ true) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)z0).setVisibility(visibility);
        final HorizonComposeButton a1 = tg6.a1;
        int visibility2 = n;
        if (c) {
            visibility2 = 0;
        }
        ((View)a1).setVisibility(visibility2);
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        e0e.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624240, viewGroup, false);
        e0e.e((Object)inflate, "layoutInflater.inflate(R\u2026on_row_v1, parent, false)");
        return (n8x)new tg6(inflate);
    }
}

import androidx.recyclerview.widget.RecyclerView$c0;
import android.widget.TextView;
import android.view.ViewGroup;
import android.content.Context;
import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spn extends b4e<qpn, vpn>
{
    public final znl<opn> d;
    
    public spn(final znl<opn> d) {
        e0e.f((Object)d, "clickSubject");
        super((Class)qpn.class);
        this.d = d;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final vpn vpn = (vpn)n8x;
        final qpn qpn = (qpn)o;
        e0e.f((Object)vpn, "viewHolder");
        e0e.f((Object)qpn, "item");
        ((TextView)vpn.Z0).setText((CharSequence)qpn.a.b);
        final TypefacesTextView a1 = vpn.a1;
        final boolean c = qpn.c;
        int visibility = 0;
        String text;
        if (c) {
            text = qpn.a.c;
        }
        else {
            text = ((RecyclerView$c0)vpn).F0.getContext().getString(2131955471, new Object[] { qpn.a.c });
        }
        ((TextView)a1).setText((CharSequence)text);
        final String d = qpn.a.d;
        final beq$a companion = beq.Companion;
        final int dimensionPixelSize = ((View)vpn.b1).getContext().getResources().getDimensionPixelSize(2131165321);
        final hpj hpj = new hpj(d, companion.b(dimensionPixelSize, dimensionPixelSize));
        final UserImageView b1 = vpn.b1;
        if (qpn.a.e) {
            b1.setShape((tsp)new emo());
        }
        else {
            b1.setShape((tsp)xi4.H0);
        }
        vpn.b1.J(hpj);
        final boolean b2 = qpn.b;
        final View c2 = vpn.c1;
        if (!b2) {
            visibility = 8;
        }
        c2.setVisibility(visibility);
        final Context context = vpn.d1.getContext();
        e0e.e((Object)context, "container.context");
        final int b3 = b1b.B(context, 2130969095);
        final Context context2 = vpn.d1.getContext();
        e0e.e((Object)context2, "container.context");
        int b4 = b1b.B(context2, 2130969036);
        final View d2 = vpn.d1;
        if (b2) {
            b4 = b3;
        }
        d2.setBackgroundColor(b4);
        if (qpn.c) {
            vpn.getHeldView().setOnClickListener((View$OnClickListener)new ugc((Object)vpn, (Object)this, (Object)qpn, 4));
        }
        else {
            vpn.d1.setBackgroundColor(b3);
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131624652, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new vpn(x);
    }
}

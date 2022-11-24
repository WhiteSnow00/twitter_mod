import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gun extends b4e<eun, iun>
{
    public final zl1 d;
    public final eko e;
    public final hun f;
    
    public gun(final zl1 d, final eko e, final hun f) {
        e0e.f((Object)e, "roomUtilsFragmentViewEventDispatcher");
        e0e.f((Object)f, "roomOverflowCountItemDelegate");
        super((Class)eun.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final iun iun = (iun)n8x;
        final eun eun = (eun)o;
        e0e.f((Object)iun, "viewHolder");
        e0e.f((Object)eun, "item");
        final Resources resources = ((RecyclerView$c0)iun).F0.getContext().getResources();
        final String h = o2d.h(resources, (long)eun.a, true);
        e0e.e((Object)h, "tweetNumberFormat(resour\u2026tem.count.toLong(), true)");
        final ImageView a1 = iun.a1;
        int visibility;
        if (this.f.a.get()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)a1).setVisibility(visibility);
        ((TextView)iun.Z0).setText((CharSequence)resources.getQuantityString(2131820672, eun.a, new Object[] { h }));
        final View f0 = ((RecyclerView$c0)iun).F0;
        e0e.e((Object)f0, "viewHolder.itemView");
        kcm.i((sj)new ldm(too.f(f0).subscribe((rk6)new xql((stb)new fun(this, eun), 13)), 6));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View x = m51.x(viewGroup, "parent", 2131625535, viewGroup, false);
        e0e.e((Object)x, "view");
        return (n8x)new iun(x);
    }
}

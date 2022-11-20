import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ptn extends a3e<ntn, rtn>
{
    public final ul1 d;
    public final mjo e;
    public final qtn f;
    
    public ptn(final ul1 d, final mjo e, final qtn f) {
        czd.f((Object)e, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)f, "roomOverflowCountItemDelegate");
        super((Class)ntn.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final rtn rtn = (rtn)v7x;
        final ntn ntn = (ntn)o;
        czd.f((Object)rtn, "viewHolder");
        czd.f((Object)ntn, "item");
        final Resources resources = ((RecyclerView$c0)rtn).D0.getContext().getResources();
        final String h = o1d.h(resources, (long)ntn.a, true);
        czd.e((Object)h, "tweetNumberFormat(resour\u2026tem.count.toLong(), true)");
        final ImageView y0 = rtn.Y0;
        int visibility;
        if (this.f.a.get()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)y0).setVisibility(visibility);
        ((TextView)rtn.X0).setText((CharSequence)resources.getQuantityString(2131820672, ntn.a, new Object[] { h }));
        final View d0 = ((RecyclerView$c0)rtn).D0;
        czd.e((Object)d0, "viewHolder.itemView");
        xbm.i((oj)new lwu(aoo.f(d0).subscribe((lj6)new bxi((qsb)new otn(this, ntn), 7)), 5));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131625535, viewGroup, false);
        czd.e((Object)e, "view");
        return (v7x)new rtn(e);
    }
}

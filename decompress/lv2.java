import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lv2 extends v3e<wv2$b, mv2>
{
    public final LayoutInflater d;
    public final gv2 e;
    
    public lv2(final LayoutInflater d, final gv2 e) {
        zzd.f((Object)d, "layoutInflater");
        zzd.f((Object)e, "businessHoursActionDispatcher");
        super((Class)wv2$b.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final mv2 mv2 = (mv2)c7x;
        final wv2$b wv2$b = (wv2$b)o;
        zzd.f((Object)mv2, "viewHolder");
        zzd.f((Object)wv2$b, "item");
        final TextView w0 = mv2.W0;
        w0.setText(wv2$b.a);
        final boolean c = wv2$b.c;
        final int n = 0;
        String string;
        if (c) {
            string = ((View)w0).getContext().getString(2131955553, new Object[] { ((View)w0).getContext().getString(wv2$b.a) });
        }
        else {
            string = "";
        }
        ((View)w0).setContentDescription((CharSequence)string);
        mv2.W0.setText(wv2$b.a);
        final TextView x0 = mv2.X0;
        int visibility;
        if (!wv2$b.c) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)x0).setVisibility(visibility);
        final View y0 = mv2.Y0;
        int visibility2;
        if (wv2$b.c) {
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        y0.setVisibility(visibility2);
        mv2.Z0.setChecked(wv2$b.c);
        ((RecyclerView$c0)mv2).C0.setOnClickListener((View$OnClickListener)new x7w((Object)this, (Object)wv2$b, 5));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624134, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026y_summary, parent, false)");
        return (c7x)new mv2(inflate);
    }
}

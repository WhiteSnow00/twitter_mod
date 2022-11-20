import android.widget.CompoundButton;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ib2 extends a3e<w84, jb2>
{
    public final u84 d;
    public final LayoutInflater e;
    
    public ib2(final u84 d, final LayoutInflater e) {
        czd.f((Object)d, "viewModel");
        czd.f((Object)e, "layoutInflater");
        super((Class)w84.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final jb2 jb2 = (jb2)v7x;
        final w84 w84 = (w84)o;
        czd.f((Object)jb2, "viewHolder");
        czd.f((Object)w84, "item");
        final String d0 = ((oxm)w84.a.b).D0;
        czd.e((Object)d0, "item.choiceValue.text.text");
        jb2.E0.setText((CharSequence)d0);
        final cej c = w84.a.c;
        String d2;
        if (c != null) {
            d2 = ((oxm)c).D0;
        }
        else {
            d2 = null;
        }
        final TextView f0 = jb2.F0;
        final int n = 1;
        final int n2 = 0;
        int n3;
        if (d2 != null && d2.length() > 0) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        int visibility;
        if (n3 != 0) {
            visibility = n2;
        }
        else {
            visibility = 8;
        }
        ((View)f0).setVisibility(visibility);
        jb2.F0.setText((CharSequence)d2);
        ((CompoundButton)jb2.G0).setChecked(this.d.f(w84.a));
        ((View)jb2.G0).setOnClickListener((View$OnClickListener)new zof(this, w84, jb2, 4));
        xbm.i((oj)new qbk(jb2, 23));
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        czd.f((Object)viewGroup, "parent");
        return (v7x)new jb2(this.e, viewGroup);
    }
}

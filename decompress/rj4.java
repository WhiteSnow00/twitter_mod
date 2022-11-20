import android.widget.TextView;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.View$OnClickListener;
import android.view.View;
import android.content.Context;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rj4 extends fhc<Cursor, e4m>
{
    public final Context J0;
    public final View K0;
    public final int L0;
    public cgv M0;
    public boolean N0;
    public boolean O0;
    public View$OnClickListener P0;
    
    public rj4(final Context j0, final e4m e4m) {
        super((my5)e4m, 19, (ny5)null);
        this.N0 = false;
        this.P0 = null;
        ((plw)e4m).H0 = true;
        e4m.U0 = true;
        this.J0 = j0;
        (this.K0 = new View(j0)).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, 0));
        this.L0 = 2131624190;
        ((e4m)super.D0).S0 = true;
    }
    
    public final Object d() {
        return this.K0;
    }
    
    public final View e(final ViewGroup viewGroup) {
        return this.K0;
    }
    
    public final Object g() {
        return Boolean.TRUE;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.N0) {
            final af4 af4 = new af4();
            final StringBuilder sb = new StringBuilder();
            sb.append(ngl.i(this.O0));
            sb.append(":");
            sb.append("user_similarities_list:::impression");
            ((u0p)af4).q(new String[] { sb.toString() });
            cbw.b((elm)af4);
            this.N0 = true;
        }
        return as2.y((my5)this, n, view, viewGroup, ((View)viewGroup).getContext());
    }
    
    public final View h(final ViewGroup viewGroup) {
        final String string = this.J0.getString(2131955907);
        final int l0 = this.L0;
        final View$OnClickListener p = this.P0;
        final View h = da8.h(viewGroup, l0, viewGroup, false);
        final TextView tag = (TextView)h.findViewById(2131432076);
        h.setTag((Object)tag);
        tag.setText((CharSequence)string);
        if (p != null) {
            final View viewById = h.findViewById(2131428696);
            if (viewById != null) {
                viewById.setOnClickListener(p);
            }
        }
        return h;
    }
}

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

public final class wk4 extends iic<Cursor, q4m>
{
    public final Context L0;
    public final View M0;
    public final int N0;
    public qgv O0;
    public boolean P0;
    public boolean Q0;
    public View$OnClickListener R0;
    
    public wk4(final Context l0, final q4m q4m) {
        super((sz5)q4m, 19, (tz5)null);
        this.P0 = false;
        this.R0 = null;
        ((gmw)q4m).J0 = true;
        q4m.W0 = true;
        this.L0 = l0;
        (this.M0 = new View(l0)).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, 0));
        this.N0 = 2131624190;
        ((q4m)super.F0).U0 = true;
    }
    
    public final Object d() {
        return this.M0;
    }
    
    public final View e(final ViewGroup viewGroup) {
        return this.M0;
    }
    
    public final Object g() {
        return Boolean.TRUE;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.P0) {
            final fg4 fg4 = new fg4();
            final StringBuilder sb = new StringBuilder();
            sb.append(zgl.i(this.Q0));
            sb.append(":");
            sb.append("user_similarities_list:::impression");
            ((o1p)fg4).q(new String[] { sb.toString() });
            sbw.b((tlm)fg4);
            this.P0 = true;
        }
        return tqb.L((sz5)this, n, view, viewGroup, ((View)viewGroup).getContext());
    }
    
    public final View h(final ViewGroup viewGroup) {
        final String string = this.L0.getString(2131955907);
        final int n0 = this.N0;
        final View$OnClickListener r0 = this.R0;
        final View w = m51.w(viewGroup, n0, viewGroup, false);
        final TextView tag = (TextView)w.findViewById(2131432077);
        w.setTag((Object)tag);
        tag.setText((CharSequence)string);
        if (r0 != null) {
            final View viewById = w.findViewById(2131428696);
            if (viewById != null) {
                viewById.setOnClickListener(r0);
            }
        }
        return w;
    }
}

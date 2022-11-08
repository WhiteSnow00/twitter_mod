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

public final class sk4 extends gic<Cursor, p3m>
{
    public final Context I0;
    public final View J0;
    public final int K0;
    public hfv L0;
    public boolean M0;
    public boolean N0;
    public View$OnClickListener O0;
    
    public sk4(final Context i0, final p3m p3m) {
        super((cz5)p3m, 19, (dz5)null);
        this.M0 = false;
        this.O0 = null;
        p3m.G0 = true;
        p3m.T0 = true;
        this.I0 = i0;
        (this.J0 = new View(i0)).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, 0));
        this.K0 = 2131624190;
        ((p3m)super.C0).R0 = true;
    }
    
    public final Object d() {
        return this.J0;
    }
    
    public final View e(final ViewGroup viewGroup) {
        return this.J0;
    }
    
    public final Object g() {
        return Boolean.TRUE;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        if (!this.M0) {
            final zf4 zf4 = new zf4();
            final StringBuilder sb = new StringBuilder();
            sb.append(bgl.i(this.N0));
            sb.append(":");
            sb.append("user_similarities_list:::impression");
            zf4.q(new String[] { sb.toString() });
            saw.b((okm)zf4);
            this.M0 = true;
        }
        return nkz.o((cz5)this, n, view, viewGroup, ((View)viewGroup).getContext());
    }
    
    public final View h(final ViewGroup viewGroup) {
        final String string = this.I0.getString(2131955907);
        final int k0 = this.K0;
        final View$OnClickListener o0 = this.O0;
        final View b = w30.B(viewGroup, k0, viewGroup, false);
        final TextView tag = (TextView)b.findViewById(2131432073);
        b.setTag((Object)tag);
        tag.setText((CharSequence)string);
        if (o0 != null) {
            final View viewById = b.findViewById(2131428696);
            if (viewById != null) {
                viewById.setOnClickListener(o0);
            }
        }
        return b;
    }
}

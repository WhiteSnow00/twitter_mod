import android.view.View;
import androidx.recyclerview.widget.RecyclerView$c0;
import android.view.ViewGroup;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcl extends xl
{
    public mcl(final Context context, final hfv hfv, final boolean b, final nw8 nw8, final wv1 wv1) {
        final ijf h = ijf.H();
        if (hfv != null && hfv.i()) {
            h.p((Object)new vl(2131232326, 0, context.getString(2131956816)));
            h.p((Object)new vl(2131232420, 6, context.getString(2131955596, new Object[] { hfv.J0 })));
            if (!b) {
                if (tdy.k0(hfv.H1)) {
                    h.p((Object)new vl(2131232455, 2, context.getString(2131955600, new Object[] { hfv.J0 })));
                }
                else {
                    h.p((Object)new vl(2131232455, 1, context.getString(2131955588, new Object[] { hfv.J0 })));
                }
                if (tdy.Y(hfv.H1)) {
                    h.p((Object)new vl(2131232274, 4, context.getString(2131955598, new Object[] { hfv.J0 })));
                }
                else {
                    h.p((Object)new vl(2131232273, 3, context.getString(2131955582, new Object[] { hfv.J0 })));
                }
                h.p((Object)new vl(2131232086, 5, context.getString(2131955594, new Object[] { hfv.J0 })));
            }
        }
        super((List)((h4j)h).e(), nw8, wv1);
    }
    
    public final a D(final ViewGroup viewGroup) {
        return new a(w30.B(viewGroup, 2131623974, viewGroup, false), super.G0, (ud4)super.H0);
    }
    
    public final class a extends zl
    {
        public a(final View view, final nw8 nw8, final ud4 ud4) {
            super(view, nw8, ud4);
        }
        
        public final void onClick(final View view) {
            final vl vl = mcl.this.F0.get(((RecyclerView$c0)this).L());
            final nw8 b1 = super.b1;
            if (b1 != null) {
                b1.U(vl.b);
            }
        }
    }
}

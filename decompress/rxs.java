import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rxs extends v3e<qxs, txs>
{
    public final w7t d;
    public final exs e;
    
    public rxs(final w7t d, final exs e) {
        super((Class)qxs.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final txs txs = (txs)c7x;
        final qxs qxs = (qxs)o;
        Objects.requireNonNull(txs);
        final nxs k = qxs.k;
        txs.D0.D0.setText((CharSequence)k.a);
        final ote d0 = txs.D0;
        final String b = k.b;
        final TextView e0 = d0.E0;
        if (e0 != null) {
            if (b != null) {
                ((View)e0).setVisibility(0);
                d0.E0.setText((CharSequence)b);
            }
            else {
                ((View)e0).setVisibility(8);
            }
        }
        if (k.e) {
            Objects.requireNonNull(txs.D0);
        }
        else {
            Objects.requireNonNull(txs.D0);
        }
        if (k.d == 1) {
            txs.D0.C0.setOnClickListener((View$OnClickListener)new npf(txs, k, qxs, 1));
        }
    }
    
    public final c7x l(ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(((View)viewGroup).getContext());
        final w7t d = this.d;
        final exs e = this.e;
        viewGroup = (ViewGroup)from.inflate(2131624579, viewGroup, false);
        final View inflate = from.inflate(2131624844, viewGroup, true);
        return (c7x)new txs(new ote((View)viewGroup, (TextView)inflate.findViewById(2131430695), (TextView)inflate.findViewById(2131431295)), d, e);
    }
    
    public static final class a extends v3e$a<qxs>
    {
        public a(final fxe<rxs> fxe) {
            super((Class)qxs.class, (fxe)fxe);
        }
        
        public final boolean a(final Object o) {
            final int d = ((qxs)o).k.d;
            boolean b = true;
            if (d != 1) {
                b = false;
            }
            return b;
        }
    }
}

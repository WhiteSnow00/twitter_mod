import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Objects;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f2r extends v3e<g2r, i2r>
{
    public final l2r d;
    public final w7t e;
    
    public f2r(final l2r d, final w7t e) {
        super((Class)g2r.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final i2r i2r = (i2r)c7x;
        final dqv a = ((g2r)o).k.a;
        i2r.D0.a((d2r)a);
        ((el8)i2r).C0.setOnClickListener((View$OnClickListener)new ggk((Object)this, (Object)a, 1));
        final pxo d0 = i2r.D0;
        Objects.requireNonNull(d0);
        ibm.i((rj)new ht1((Object)d0, 7));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new i2r(pxo.b(LayoutInflater.from(((View)viewGroup).getContext()).inflate(2131625712, viewGroup, false), this.d));
    }
    
    public static final class a extends v3e$a<g2r>
    {
        public a(final fxe<f2r> fxe) {
            super((Class)g2r.class, (fxe)fxe);
        }
    }
}

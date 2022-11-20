import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sgt extends ste implements qsb<xgt, fzv>
{
    public final jgt D0;
    
    public sgt(final jgt d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final xgt xgt = (xgt)o;
        czd.f((Object)xgt, "$this$distinct");
        final jgt d0 = this.D0;
        d0.G0 = (TextView)d0.D0.findViewById(2131432091);
        final jgt d2 = this.D0;
        final TextView g0 = d2.G0;
        if (g0 != null) {
            d2.E0.a(g0, (oxm)xgt.e);
        }
        return fzv.a;
    }
}

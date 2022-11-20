import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efh extends ste implements qsb<jfh, fzv>
{
    public final ffh D0;
    
    public efh(final ffh d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jfh jfh = (jfh)o;
        czd.f((Object)jfh, "$this$distinct");
        final RecyclerView g0 = this.D0.G0;
        boolean b = false;
        g0.suppressLayout(false);
        ((l71)this.D0.E0).d((n3e)new ckf((Iterable)jfh.a));
        final RecyclerView g2 = this.D0.G0;
        if (jfh.a.size() == 1) {
            b = true;
        }
        g2.suppressLayout(b);
        return fzv.a;
    }
}

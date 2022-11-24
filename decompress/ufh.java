import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ufh extends pue implements stb<yfh, vzv>
{
    public final vfh F0;
    
    public ufh(final vfh f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final yfh yfh = (yfh)o;
        e0e.f((Object)yfh, "$this$distinct");
        final RecyclerView i0 = this.F0.I0;
        boolean b = false;
        i0.suppressLayout(false);
        ((s71)this.F0.G0).d((p4e)new zkf((Iterable)yfh.a));
        final RecyclerView i2 = this.F0.I0;
        if (yfh.a.size() == 1) {
            b = true;
        }
        i2.suppressLayout(b);
        return vzv.a;
    }
}

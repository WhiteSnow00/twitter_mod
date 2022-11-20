import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgo extends ste implements qsb<pgo, fzv>
{
    public final ggo D0;
    
    public kgo(final ggo d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final pgo pgo = (pgo)o;
        czd.f((Object)pgo, "$this$distinct");
        ((TextView)this.D0.E0).setText((CharSequence)pgo.a);
        return fzv.a;
    }
}

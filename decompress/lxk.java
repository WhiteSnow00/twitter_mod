import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxk extends ste implements qsb<nc2, fzv>
{
    public final qxk D0;
    
    public lxk(final qxk d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final nc2 nc2 = (nc2)o;
        czd.f((Object)nc2, "$this$distinctType");
        if (!(nc2 instanceof nc2$d)) {
            ((TextView)this.D0.D0).setText((CharSequence)"");
        }
        return fzv.a;
    }
}

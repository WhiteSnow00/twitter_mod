import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghn extends ste implements qsb<whn, fzv>
{
    public final lgn D0;
    
    public ghn(final lgn d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final whn whn = (whn)o;
        czd.f((Object)whn, "$this$distinct");
        ((TextView)this.D0.T0).setText((CharSequence)whn.h);
        return fzv.a;
    }
}

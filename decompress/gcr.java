import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcr extends ste implements qsb<jcr, fzv>
{
    public final ecr D0;
    
    public gcr(final ecr d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final jcr jcr = (jcr)o;
        czd.f((Object)jcr, "$this$distinct");
        ((TextView)this.D0.F0).setText((CharSequence)jcr.a);
        return fzv.a;
    }
}

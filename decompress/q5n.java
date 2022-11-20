import android.app.Dialog;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q5n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public q5n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        if (t6n.W) {
            final l1n d0 = this.D0;
            ((Dialog)new h8n((Context)d0.E0, t6n.V, d0.M0, d0.N0)).show();
        }
        return fzv.a;
    }
}

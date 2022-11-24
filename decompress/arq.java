import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arq extends pue implements stb<tsq, vzv>
{
    public final xqq F0;
    
    public arq(final xqq f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tsq tsq = (tsq)o;
        e0e.f((Object)tsq, "$this$distinct");
        this.F0.Q0.setImageResource(tsq.q);
        final xqq f0 = this.F0;
        ((View)f0.Q0).setContentDescription((CharSequence)f0.I0.getString(tsq.r));
        return vzv.a;
    }
}

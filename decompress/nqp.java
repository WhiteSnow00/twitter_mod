import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqp extends pue implements stb<sqp, vzv>
{
    public final jqp F0;
    
    public nqp(final jqp f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sqp sqp = (sqp)o;
        e0e.f((Object)sqp, "$this$distinct");
        final jqp f0 = this.F0;
        if (sqp.d) {
            ((View)f0.L0).setVisibility(0);
        }
        else {
            ((View)f0.L0).setVisibility(8);
        }
        return vzv.a;
    }
}

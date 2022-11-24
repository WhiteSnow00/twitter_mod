import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u7m extends pue implements stb
{
    public final View F0;
    
    public u7m(final View f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        e0e.f(o, "$this$distinctType");
        if (o instanceof ad2$d) {
            final ad2 ad2 = (ad2)o;
            final View f0 = this.F0;
            int visibility;
            if (ma7.A()) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            f0.setVisibility(visibility);
        }
        return vzv.a;
    }
}

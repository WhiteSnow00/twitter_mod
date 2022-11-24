import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mli extends pue implements stb<oli, vzv>
{
    public final nli F0;
    
    public mli(final nli f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oli oli = (oli)o;
        e0e.f((Object)oli, "$this$distinct");
        final View g0 = this.F0.G0;
        e0e.e((Object)g0, "moduleView");
        int visibility;
        if (oli.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        g0.setVisibility(visibility);
        return vzv.a;
    }
}

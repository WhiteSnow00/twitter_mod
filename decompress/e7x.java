import android.view.View;
import android.view.View$OnAttachStateChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e7x extends pue implements ptb<vzv>
{
    public final fb F0;
    public final f7x G0;
    public final krk H0;
    
    public e7x(final fb f0, final f7x g0, final krk h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(0);
    }
    
    public final Object invoke() {
        ((View)this.F0).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this.G0);
        final fb f0 = this.F0;
        final krk h0 = this.H0;
        e0e.f((Object)f0, "<this>");
        e0e.f((Object)h0, "listener");
        iuk.a0((View)f0).a.remove(h0);
        return vzv.a;
    }
}

import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u8 extends pue implements stb<j9, vzv>
{
    public final i8 F0;
    
    public u8(final i8 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j9 j9 = (j9)o;
        e0e.f((Object)j9, "$this$distinct");
        if (!c5l.Companion.b()) {
            final View n0 = this.F0.N0;
            e0e.e((Object)n0, "buttonSpacer");
            int visibility;
            if (j9.l) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            n0.setVisibility(visibility);
        }
        return vzv.a;
    }
}

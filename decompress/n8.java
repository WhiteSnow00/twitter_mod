import androidx.constraintlayout.widget.Group;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n8 extends pue implements stb<j9, vzv>
{
    public final i8 F0;
    
    public n8(final i8 f0) {
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final j9 j9 = (j9)o;
        e0e.f((Object)j9, "$this$distinct");
        if (!c5l.Companion.b()) {
            final Group r0 = this.F0.R0;
            e0e.e((Object)r0, "dividerGroup");
            int visibility;
            if (j9.k) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            r0.setVisibility(visibility);
        }
        return vzv.a;
    }
}

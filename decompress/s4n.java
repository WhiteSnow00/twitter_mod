import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s4n extends ste implements qsb<t6n, fzv>
{
    public final l1n D0;
    
    public s4n(final l1n d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final t6n t6n = (t6n)o;
        czd.f((Object)t6n, "$this$distinct");
        if (!t6n.B && ((View)this.D0.Y0).getVisibility() == 0) {
            ec0.g((View)this.D0.Y0, 300);
        }
        else if (t6n.B && ((View)this.D0.Z0).getVisibility() == 0) {
            ec0.g((View)this.D0.Z0, 300);
        }
        return fzv.a;
    }
}

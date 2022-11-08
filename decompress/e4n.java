import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e4n extends gue implements rtb<f6n, oyv>
{
    public final /* synthetic */ x0n C0;
    
    public e4n(final x0n c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final f6n f6n = (f6n)o;
        zzd.f((Object)f6n, "$this$distinct");
        if (!f6n.B && ((View)this.C0.X0).getVisibility() == 0) {
            ic0.g((View)this.C0.X0, 300);
        }
        else if (f6n.B && ((View)this.C0.Y0).getVisibility() == 0) {
            ic0.g((View)this.C0.Y0, 300);
        }
        return oyv.a;
    }
}

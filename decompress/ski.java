import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ski extends gue implements rtb<uki, oyv>
{
    public final /* synthetic */ tki C0;
    
    public ski(final tki c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final uki uki = (uki)o;
        zzd.f((Object)uki, "$this$distinct");
        final View d0 = this.C0.D0;
        zzd.e((Object)d0, "moduleView");
        int visibility;
        if (uki.b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d0.setVisibility(visibility);
        return oyv.a;
    }
}

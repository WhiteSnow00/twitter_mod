import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ihf extends gue implements rtb<thf, oyv>
{
    public final /* synthetic */ fhf C0;
    
    public ihf(final fhf c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final thf thf = (thf)o;
        zzd.f((Object)thf, "$this$distinct");
        final View d0 = this.C0.D0;
        zzd.e((Object)d0, "moduleView");
        int visibility;
        if (thf.f) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        d0.setVisibility(visibility);
        return oyv.a;
    }
}

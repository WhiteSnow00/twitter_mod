import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvn extends gue implements rtb<bwn, oyv>
{
    public final /* synthetic */ wun C0;
    
    public gvn(final wun c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final bwn bwn = (bwn)o;
        zzd.f((Object)bwn, "$this$distinct");
        final View w0 = this.C0.W0;
        final boolean m = bwn.m;
        final int n = 0;
        int visibility;
        if (m && !bwn.A) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        w0.setVisibility(visibility);
        return oyv.a;
    }
}

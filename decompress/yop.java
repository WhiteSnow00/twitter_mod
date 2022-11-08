import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yop extends gue implements rtb<fpp, oyv>
{
    public final /* synthetic */ wop C0;
    
    public yop(final wop c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fpp fpp = (fpp)o;
        zzd.f((Object)fpp, "$this$distinct");
        final wop c0 = this.C0;
        if (fpp.c) {
            ((View)c0.H0).setVisibility(0);
        }
        else {
            ((View)c0.H0).setVisibility(8);
        }
        return oyv.a;
    }
}

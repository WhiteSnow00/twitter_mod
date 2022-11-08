import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otl extends gue implements jub<Dialog, Integer, Integer, oyv>
{
    public final /* synthetic */ mtl C0;
    public final /* synthetic */ ytl.ytl$a.b D0;
    
    public otl(final mtl c0, final ytl.ytl$a.b d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final Dialog dialog = (Dialog)o;
        ((Number)o2).intValue();
        final int intValue = ((Number)o3).intValue();
        zzd.f((Object)dialog, "<anonymous parameter 0>");
        if (intValue == -1) {
            this.C0.M0.onNext((Object)new ftl$b$c(this.D0.b));
        }
        this.C0.a();
        return oyv.a;
    }
}

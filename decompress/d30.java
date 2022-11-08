import android.content.ComponentCallbacks;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d30 extends gue implements rtb<p29, o29>
{
    public final /* synthetic */ Context C0;
    public final /* synthetic */ e30 D0;
    
    public d30(final Context c0, final e30 d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        zzd.f((Object)o, "$this$DisposableEffect");
        this.C0.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)this.D0);
        return new c30(this.C0, this.D0);
    }
}

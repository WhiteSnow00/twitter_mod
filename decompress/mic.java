import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mic extends af4
{
    public final /* synthetic */ nic I0;
    
    public mic(final nic i0, final int n) {
        this.I0 = i0;
        super(n);
    }
    
    public final void onClick(final View view) {
        zzd.f((Object)view, "p0");
        this.I0.d.a.onNext((Object)klc.c.a);
    }
}

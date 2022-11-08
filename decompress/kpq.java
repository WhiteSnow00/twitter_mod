import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpq extends gue implements rtb<brq, oyv>
{
    public final /* synthetic */ fpq C0;
    
    public kpq(final fpq c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final brq brq = (brq)o;
        zzd.f((Object)brq, "$this$distinct");
        ((TextView)this.C0.O0).setText((CharSequence)brq.v);
        return oyv.a;
    }
}

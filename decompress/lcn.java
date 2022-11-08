import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcn extends gue implements rtb<mcn, oyv>
{
    public final /* synthetic */ jcn C0;
    public final /* synthetic */ View D0;
    
    public lcn(final jcn c0, final View d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final mcn mcn = (mcn)o;
        zzd.f((Object)mcn, "$this$distinct");
        this.C0.C0.setText((CharSequence)this.D0.getContext().getString(2131953039, new Object[] { mcn.b }));
        return oyv.a;
    }
}

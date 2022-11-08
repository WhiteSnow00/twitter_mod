import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfp extends gue implements rtb<ifp, oyv>
{
    public final /* synthetic */ ffp C0;
    
    public hfp(final ffp c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ifp ifp = (ifp)o;
        zzd.f((Object)ifp, "$this$distinct");
        if (!zzd.a((Object)ifp.a.toString(), (Object)String.valueOf(this.C0.C0.getText()))) {
            ((TextView)this.C0.C0).setText((CharSequence)ifp.a);
            this.C0.C0.setSelection(ifp.b);
        }
        return oyv.a;
    }
}

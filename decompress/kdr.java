import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kdr extends gue implements rtb<tdr, oyv>
{
    public final /* synthetic */ cdr C0;
    
    public kdr(final cdr c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final tdr tdr = (tdr)o;
        zzd.f((Object)tdr, "$this$distinct");
        ((TextView)this.C0.J0).setText((CharSequence)tdr.a);
        return oyv.a;
    }
}

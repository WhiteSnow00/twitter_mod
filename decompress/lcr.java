import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lcr extends gue implements rtb<ocr, oyv>
{
    public final /* synthetic */ rbr C0;
    
    public lcr(final rbr c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final ocr ocr = (ocr)o;
        zzd.f((Object)ocr, "$this$distinct");
        ((TextView)this.C0.V0).setText((CharSequence)ocr.c);
        return oyv.a;
    }
}

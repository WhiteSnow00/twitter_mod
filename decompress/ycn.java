import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ycn extends ste implements qsb<zcn, fzv>
{
    public final wcn D0;
    public final View E0;
    
    public ycn(final wcn d0, final View e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final zcn zcn = (zcn)o;
        czd.f((Object)zcn, "$this$distinct");
        this.D0.D0.setText((CharSequence)this.E0.getContext().getString(2131953039, new Object[] { zcn.b }));
        return fzv.a;
    }
}

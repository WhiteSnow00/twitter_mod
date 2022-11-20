import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e9 extends ste implements qsb<k9, fzv>
{
    public final j8 D0;
    
    public e9(final j8 d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final k9 k9 = (k9)o;
        czd.f((Object)k9, "$this$distinct");
        this.D0.I0.setText((CharSequence)k9.c);
        final j8 d0 = this.D0;
        ((View)d0.I0).setContentDescription((CharSequence)d0.D0.getResources().getString(2131952270, new Object[] { k9.c }));
        return fzv.a;
    }
}

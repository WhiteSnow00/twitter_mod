import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxq extends ste implements qsb<hwq, fzv>
{
    public final zxq D0;
    
    public kxq(final zxq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final s21 h = hwq.h;
        if (h != null) {
            final zxq d0 = this.D0;
            d0.l.H(h.e());
            ((TextView)d0.m).setText((CharSequence)h.c());
            ((TextView)d0.n).setText((CharSequence)((yvq)d0).c.getString(2131958208));
        }
        return fzv.a;
    }
}

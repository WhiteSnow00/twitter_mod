import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxq extends ste implements qsb<hwq, fzv>
{
    public final zxq D0;
    
    public pxq(final zxq d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final hwq hwq = (hwq)o;
        czd.f((Object)hwq, "$this$distinct");
        final zxq d0 = this.D0;
        final Integer q = hwq.q;
        int n;
        if (q != null) {
            n = q;
        }
        else {
            n = d0.f;
        }
        d0.g.setBackgroundTintList(ColorStateList.valueOf(n));
        return fzv.a;
    }
}

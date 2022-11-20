import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0a extends ste implements qsb<View, fzv>
{
    public final f0a D0;
    
    public g0a(final f0a d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        this.D0.d.onNext((Object)tmi.a);
        return fzv.a;
    }
}

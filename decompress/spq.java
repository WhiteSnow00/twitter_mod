import android.content.Context;
import android.content.res.Resources;
import android.app.Activity;
import com.twitter.util.user.UserIdentifier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class spq extends ste implements qsb<View, ilx<? super wpq, woq, emq>>
{
    public final koq D0;
    public final UserIdentifier E0;
    public final Activity F0;
    public final Resources G0;
    public final obi<?> H0;
    public final gfo I0;
    public final uxn J0;
    
    public spq(final koq d0, final UserIdentifier e0, final Activity f0, final Resources g0, final obi<?> h0, final gfo i0, final uxn j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final View view = (View)o;
        czd.f((Object)view, "it");
        Object o2;
        if (djo.e() == 1) {
            o2 = new loq(view, this.D0, this.E0.getStringId());
        }
        else {
            o2 = new voq(view, this.E0, (Context)this.F0, this.G0, (obi)this.H0, this.D0, this.I0, this.J0);
        }
        return o2;
    }
}

import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qvp extends ste implements ftb<tj7, Context, fzv>
{
    public final rvp D0;
    
    public qvp(final rvp d0) {
        this.D0 = d0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final tj7 tj7 = (tj7)o;
        final Context context = (Context)o2;
        czd.f((Object)tj7, "args");
        czd.f((Object)context, "context");
        final rvp d0 = this.D0;
        Objects.requireNonNull(d0);
        ah7.Companion.a().b(context, (obi)d0.D0, tj7, true);
        return fzv.a;
    }
}

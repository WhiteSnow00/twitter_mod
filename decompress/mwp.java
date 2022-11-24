import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mwp extends pue implements hub<uk7, Context, vzv>
{
    public final owp F0;
    
    public mwp(final owp f0) {
        this.F0 = f0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final uk7 uk7 = (uk7)o;
        final Context context = (Context)o2;
        e0e.f((Object)uk7, "args");
        e0e.f((Object)context, "context");
        final owp f0 = this.F0;
        Objects.requireNonNull(f0);
        ci7.Companion.a().b(context, f0.F0, uk7, true);
        return vzv.a;
    }
}

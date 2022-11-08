import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zup extends gue implements gub<kk7, Context, oyv>
{
    public final /* synthetic */ bvp C0;
    
    public zup(final bvp c0) {
        this.C0 = c0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final kk7 kk7 = (kk7)o;
        final Context context = (Context)o2;
        zzd.f((Object)kk7, "args");
        zzd.f((Object)context, "context");
        final bvp c0 = this.C0;
        Objects.requireNonNull(c0);
        th7.Companion.a().b(context, c0.C0, kk7, true);
        return oyv.a;
    }
}

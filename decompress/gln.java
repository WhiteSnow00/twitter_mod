import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gln implements fln
{
    public final psc a;
    
    public gln(final psc a) {
        zzd.f((Object)a, "httpRequestController");
        this.a = a;
    }
    
    public final void a(final Context context, final long n, final otb<oyv> otb) {
        zzd.f((Object)context, "context");
        zzd.f((Object)otb, "callback");
        ((kmm)this.a.f((ksc)new ys8(context, UserIdentifier.Companion.c(), n, (hil)null))).U((cw0$b)new gln$c((otb)otb));
    }
    
    public final void b(final Context context, final long n, final boolean m1, final otb<oyv> otb) {
        zzd.f((Object)context, "context");
        zzd.f((Object)otb, "callback");
        final p47 p4 = new p47(context, UserIdentifier.Companion.c(), n, null);
        p4.m1 = m1;
        ((p47)this.a.f((ksc)p4)).U((cw0$b)new gln$a((otb)otb));
    }
    
    public final void c(final Context context, final long k1, final otb<oyv> otb) {
        zzd.f((Object)context, "context");
        zzd.f((Object)otb, "callback");
        final vf3 vf3 = new vf3(context, UserIdentifier.Companion.c());
        vf3.k1 = k1;
        ((kmm)this.a.f((ksc)vf3)).U((cw0$b)new gln$b((otb)otb));
    }
}

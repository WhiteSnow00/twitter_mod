import android.content.Intent;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rlq implements qlq
{
    public final Intent a(final Context context, final slq slq) {
        e0e.f((Object)context, "context");
        e0e.f((Object)slq, "action");
        final Intent a = this.c(context, slq).a();
        e0e.e((Object)a, "getOcfIntentFactory(context, action).intent");
        return a;
    }
    
    public final cn b(final Context context, final slq slq) {
        e0e.f((Object)context, "context");
        e0e.f((Object)slq, "action");
        return (cn)this.c(context, slq).b();
    }
    
    public final dej c(final Context context, final slq slq) {
        final dej.a a = new dej.a(context);
        e0e.f((Object)slq, "action");
        final fds.a a2 = new fds.a();
        if (slq == slq.H0) {
            a2.p("open_app_login");
        }
        else {
            a2.p("welcome");
            a2.h = true;
            final xrd$a xrd$a = new xrd$a();
            xrd$a.d = fjh.b(kkg.o((Object)"source_action_type", (Object)slq.F0));
            a2.e = (xrd)((z4j)xrd$a).e();
        }
        a.d = (fds)a2.e();
        return (dej)a.e();
    }
}

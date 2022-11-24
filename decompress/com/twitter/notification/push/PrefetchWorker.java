// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notification.push;

import androidx.work.c;
import androidx.work.b;
import androidx.work.c$a$a;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.RxWorker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/twitter/notification/push/PrefetchWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "subsystem.tfa.notifications.push.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class PrefetchWorker extends RxWorker
{
    public static final PrefetchWorker.PrefetchWorker$a Companion;
    public final swk L0;
    
    static {
        Companion = new PrefetchWorker.PrefetchWorker$a();
    }
    
    public PrefetchWorker(final Context context, final WorkerParameters workerParameters) {
        e0e.f((Object)context, "appContext");
        e0e.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
        final swk e0 = o6f.b().e0();
        e0e.e((Object)e0, "get().preloadWorkerDelegate");
        this.L0 = e0;
    }
    
    public final bbq<c$a> h() {
        final swk l0 = this.L0;
        final b b = ((c)this).G0.b;
        e0e.e((Object)b, "inputData");
        final int c = ((c)this).G0.c;
        Objects.requireNonNull(l0);
        final UserIdentifier userIdentifier = (UserIdentifier)gmp.a(b.c("recipient_id"), UserIdentifier.SERIALIZER);
        Object v;
        if (userIdentifier == null) {
            v = bbq.v((Object)new c$a$a());
        }
        else {
            final long d = b.d("notification_id", 0L);
            final long d2 = b.d("status_id", 0L);
            bbq bbq;
            if (d2 == 0L) {
                bbq = bbq.v((Object)new c$a$a());
            }
            else {
                final String e = b.e("scribe_target");
                l0.a(e, userIdentifier, "request");
                final tsc a = l0.a;
                final rwk c2 = l0.c;
                Objects.requireNonNull(c2);
                bbq = a.a(new zov(c2.a, userIdentifier, userIdentifier, d2, (kbv)((vdq)kbv.J2(userIdentifier)).F0, new arv(kkg.o((Object)"referrer", (Object)"push")))).w((rtb)new m7k((stb)new uwk(l0, e, userIdentifier, c), 25));
            }
            v = new hcq((idq)bbq, (rtb)new mr0((stb)new twk(b, l0, userIdentifier, d), 24));
        }
        return (bbq<c$a>)v;
    }
}

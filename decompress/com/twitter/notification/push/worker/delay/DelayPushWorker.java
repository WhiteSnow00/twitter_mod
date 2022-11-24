// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notification.push.worker.delay;

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

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lcom/twitter/notification/push/worker/delay/DelayPushWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "subsystem.tfa.notifications.push.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class DelayPushWorker extends RxWorker
{
    public static final DelayPushWorker.DelayPushWorker$a Companion;
    public final um8 L0;
    
    static {
        Companion = new DelayPushWorker.DelayPushWorker$a();
    }
    
    public DelayPushWorker(final Context context, final WorkerParameters workerParameters) {
        e0e.f((Object)context, "appContext");
        e0e.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
        final um8 s4 = o6f.b().S4();
        e0e.e((Object)s4, "get().delayPushWorkerDelegate");
        this.L0 = s4;
    }
    
    public final bbq<c$a> h() {
        final um8 l0 = this.L0;
        final b b = ((c)this).G0.b;
        e0e.e((Object)b, "inputData");
        final int c = ((c)this).G0.c;
        Objects.requireNonNull(l0);
        final long d = b.d("notification_id", 0L);
        final String e = b.e("scribe_target");
        final UserIdentifier userIdentifier = (UserIdentifier)gmp.a(b.c("recipient_id"), UserIdentifier.SERIALIZER);
        bbq bbq;
        if (userIdentifier == null) {
            bbq = bbq.v((Object)new c$a$a()).m((rk6)new t3m((stb)new vm8(l0, e), 25));
        }
        else {
            bbq = bbq.Q((idq)l0.a.f(userIdentifier, d).m((rk6)new p95((stb)new xm8(l0), 28)), (idq)l0.a.c(userIdentifier), (hw1)new hqf((hub)new wm8(l0), 4));
        }
        return (bbq<c$a>)bbq;
    }
}

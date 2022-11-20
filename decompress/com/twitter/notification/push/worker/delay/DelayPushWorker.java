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
    public final ol8 J0;
    
    static {
        Companion = new DelayPushWorker.DelayPushWorker$a();
    }
    
    public DelayPushWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "appContext");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
        final ol8 s4 = x68.i().S4();
        czd.e((Object)s4, "get().delayPushWorkerDelegate");
        this.J0 = s4;
    }
    
    public final eaq<c$a> h() {
        final ol8 j0 = this.J0;
        final b b = ((c)this).E0.b;
        czd.e((Object)b, "inputData");
        final int c = ((c)this).E0.c;
        Objects.requireNonNull(j0);
        final long d = b.d("notification_id", 0L);
        final String e = b.e("scribe_target");
        final UserIdentifier userIdentifier = (UserIdentifier)klp.a(b.c("recipient_id"), UserIdentifier.SERIALIZER);
        eaq eaq;
        if (userIdentifier == null) {
            eaq = eaq.v((Object)new c$a$a()).m((lj6)new fta((qsb)new pl8(j0, e), 27));
        }
        else {
            eaq = eaq.Q((lcq)j0.a.f(userIdentifier, d).m((lj6)new s05((qsb)new rl8(j0), 24)), (lcq)j0.a.c(userIdentifier), (zv1)new ew7((ftb)new ql8(j0), 3));
        }
        return (eaq<c$a>)eaq;
    }
}

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
    public final bwk J0;
    
    static {
        Companion = new PrefetchWorker.PrefetchWorker$a();
    }
    
    public PrefetchWorker(final Context context, final WorkerParameters workerParameters) {
        czd.f((Object)context, "appContext");
        czd.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
        final bwk e0 = x68.i().e0();
        czd.e((Object)e0, "get().preloadWorkerDelegate");
        this.J0 = e0;
    }
    
    public final eaq<c$a> h() {
        final bwk j0 = this.J0;
        final b b = ((c)this).E0.b;
        czd.e((Object)b, "inputData");
        final int c = ((c)this).E0.c;
        Objects.requireNonNull(j0);
        final UserIdentifier userIdentifier = (UserIdentifier)klp.a(b.c("recipient_id"), UserIdentifier.SERIALIZER);
        Object v;
        if (userIdentifier == null) {
            v = eaq.v((Object)new c$a$a());
        }
        else {
            final long d = b.d("notification_id", 0L);
            final long d2 = b.d("status_id", 0L);
            eaq eaq;
            if (d2 == 0L) {
                eaq = eaq.v((Object)new c$a$a());
            }
            else {
                final String e = b.e("scribe_target");
                j0.a(e, userIdentifier, "request");
                final trc a = j0.a;
                final awk c2 = j0.c;
                Objects.requireNonNull(c2);
                eaq = a.a((orc)new oov(c2.a, userIdentifier, userIdentifier, d2, (vav)((ycq)vav.I2(userIdentifier)).D0, new pqv(qjg.o((Object)"referrer", (Object)"push")))).w((psb)new fgr((qsb)new dwk(j0, e, userIdentifier, c), 26));
            }
            v = new kbq((lcq)eaq, (psb)new ld5((qsb)new cwk(b, j0, userIdentifier, d), 26));
        }
        return (eaq<c$a>)v;
    }
}

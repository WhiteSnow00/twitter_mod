// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.analytics.tracking.tpm;

import java.util.Set;
import android.os.Build$VERSION;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c$a;
import androidx.work.WorkerParameters;
import android.content.Context;
import androidx.work.RxWorker;

public class TpmIdSyncWorker extends RxWorker
{
    public TpmIdSyncWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    public final eaq<c$a> h() {
        final int d = fvt.d;
        final List a = vth.a(0);
        if (fvt.a()) {
            for (final UserIdentifier userIdentifier : tqf.i().d()) {
                if (userIdentifier.isRegularUser()) {
                    a.add(trc.c().b((orc)new gvt(userIdentifier, new fvt(userIdentifier))).P());
                }
            }
        }
        return (eaq<c$a>)h5j.merge((Iterable)a).map((psb)naf.G0).onErrorResumeNext((psb)ivt.E0).toList().w((psb)hvt.E0);
    }
    
    public static final class a
    {
        public a(final urx urx) {
            if (fvt.a()) {
                final long millis = TimeUnit.SECONDS.toMillis(asa.b().h("performance_ads_tpm_id_sync_encryption_interval_in_seconds", fvt.b));
                final qbu e = pbu.e(UserIdentifier.getCurrent(), "tpm_id_sync");
                boolean b;
                if (e.d("tpm_id_sync_interval", 0L) == millis) {
                    b = true;
                }
                else {
                    e.i().c("tpm_id_sync_interval", millis).e();
                    b = false;
                }
                lfa lfa;
                if (b) {
                    lfa = lfa.E0;
                }
                else {
                    lfa = lfa.D0;
                }
                final n3k$a n3k$a = new n3k$a((Class)TpmIdSyncWorker.class, millis, TimeUnit.MILLISECONDS);
                final LinkedHashSet set = new LinkedHashSet();
                Object o;
                if (Build$VERSION.SDK_INT >= 24) {
                    o = mq4.R0((Iterable)set);
                }
                else {
                    o = p2a.D0;
                }
                ((osx$a)n3k$a).c.j = new qi6(2, false, false, false, false, -1L, -1L, (Set)o);
                urx.e("TpmIdSyncSingleJob", lfa, (n3k)((osx$a)n3k$a).b());
            }
            else {
                urx.c("TpmIdSyncSingleJob");
            }
        }
    }
}

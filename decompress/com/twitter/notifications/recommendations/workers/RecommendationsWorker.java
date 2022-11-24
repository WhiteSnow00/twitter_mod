// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.recommendations.workers;

import androidx.work.c;
import com.twitter.util.user.UserIdentifier$Companion;
import androidx.work.c$a$b;
import androidx.work.c$a$a;
import com.twitter.util.user.UserIdentifier;
import androidx.work.c$a;
import java.util.Objects;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.Metadata;
import androidx.work.RxWorker;

@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/twitter/notifications/recommendations/workers/RecommendationsWorker;", "Landroidx/work/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "subsystem.tfa.notifications.features.recommendations.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RecommendationsWorker extends RxWorker
{
    public final a5m L0;
    
    public RecommendationsWorker(final Context context, final WorkerParameters workerParameters) {
        e0e.f((Object)context, "context");
        e0e.f((Object)workerParameters, "workerParams");
        super(context, workerParameters);
        Objects.requireNonNull(t4m.Companion);
        this.L0 = ((t4m)((n5j)dr0.Companion.a()).B((Class)t4m.class)).s8();
    }
    
    public final bbq<c$a> h() {
        final a5m l0 = this.L0;
        final int c = ((c)this).G0.c;
        bbq bbq;
        if (!l0.g.a()) {
            l0.f.b(UserIdentifier.Companion.c(), (tlm)new fg4(new String[] { "notification::status_bar:client_initiated_mr:cancel" }));
            bbq = bbq.v((Object)new c$a$a());
        }
        else {
            final UserIdentifier$Companion companion = UserIdentifier.Companion;
            if (companion.c().isRegularUser()) {
                try {
                    bbq = l0.d.b(companion.c()).w((rtb)new t3i((stb)new b5m(l0), 6)).A((rtb)new y4m(c, l0));
                }
                catch (final Exception ex) {
                    if (c > 3) {
                        l0.a.a();
                        l0.a.b();
                        final nda<tlm> f = l0.f;
                        final UserIdentifier c2 = UserIdentifier.Companion.c();
                        final fg4 fg4 = new fg4(new String[] { "notification::status_bar:client_initiated_mr_logged_in:exception" });
                        ((o1p)fg4).t = String.valueOf(c);
                        final int a = o5j.a;
                        f.b(c2, (tlm)fg4);
                        bbq = bbq.v((Object)new c$a$a());
                    }
                    else {
                        bbq = bbq.v((Object)new c$a$b());
                    }
                }
            }
            else {
                try {
                    bbq = l0.d.a(l0.e.a()).w((rtb)new qe5((stb)new c5m(l0), 28)).A((rtb)new z4m(c, l0));
                }
                catch (final Exception ex2) {
                    if (c > 3) {
                        l0.a.a();
                        l0.a.b();
                        final nda<tlm> f2 = l0.f;
                        final UserIdentifier logged_OUT = UserIdentifier.LOGGED_OUT;
                        final fg4 fg5 = new fg4(new String[] { "notification::status_bar:client_initiated_mr_logged_out:exception" });
                        ((o1p)fg5).t = String.valueOf(c);
                        final int a2 = o5j.a;
                        f2.b(logged_OUT, (tlm)fg5);
                        bbq = bbq.v((Object)new c$a$a());
                    }
                    else {
                        bbq = bbq.v((Object)new c$a$b());
                    }
                }
            }
        }
        return (bbq<c$a>)bbq;
    }
}

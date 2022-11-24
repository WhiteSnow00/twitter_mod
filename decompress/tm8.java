import androidx.work.b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import androidx.work.c;
import com.twitter.notification.push.worker.delay.DelayPushWorker;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tm8 implements qm8
{
    public static final tm8.tm8$b Companion;
    public final lsx a;
    public final vgq b;
    public final erl c;
    public final kfw d;
    
    static {
        Companion = new tm8.tm8$b();
    }
    
    public tm8(final lsx a, final kcm kcm, final yq0 yq0, final vgq b, final erl c, final kfw d) {
        e0e.f((Object)a, "workManager");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)yq0, "applicationLifecycle");
        e0e.f((Object)b, "actionScriber");
        e0e.f((Object)c, "notificationsRepository");
        e0e.f((Object)d, "userManager");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        final de6 de6 = new de6();
        final dsi.a companion = dsi.Companion;
        final UserIdentifier b2 = d.b();
        e0e.e((Object)b2, "userManager.current");
        Objects.requireNonNull(companion);
        if (ita.a(b2).b("android_delay_push_enabled", false)) {
            kcm.i((sj)new tdv(de6, 11));
            de6.a(yq0.B().subscribe((rk6)new dl7((stb)new tm8$a(this), 28)));
        }
    }
    
    public final void a(final bti bti, final Map<String, ?> map) {
        e0e.f((Object)bti, "notificationInfo");
        e0e.f((Object)map, "extras");
        final wvi k = bti.K;
        e0e.c((Object)k);
        final long b = k.b.b;
        Objects.requireNonNull(tm8.Companion);
        final g5s a = nq1.a;
        final long n = b - System.currentTimeMillis();
        if (n < 0L) {
            this.b.a(bti, "delay_failure");
            return;
        }
        final emj.a a2 = (emj.a)new emj.a((Class<? extends c>)DelayPushWorker.class).a("delay").g(n, TimeUnit.MILLISECONDS);
        final HashMap hashMap = new HashMap();
        final byte[] e = gmp.e((Object)bti.B, UserIdentifier.SERIALIZER);
        final String b2 = androidx.work.b.b;
        final Byte[] array = new Byte[e.length];
        for (int i = 0; i < e.length; ++i) {
            array[i] = e[i];
        }
        hashMap.put("recipient_id", array);
        hashMap.put("notification_id", bti.a);
        hashMap.put("scribe_target", bti.h);
        hashMap.put("delay_time_stamp", b);
        final b b3 = new b((Map)hashMap);
        androidx.work.b.f(b3);
        this.a.f("delay", uga.F0, (emj)a2.h(b3).b());
    }
}

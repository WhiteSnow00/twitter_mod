import com.twitter.util.user.UserIdentifier;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axk implements zwk
{
    public final bxk a;
    public final eo1 b;
    public final uwi c;
    public final jg4 d;
    public final kfw e;
    public final rql f;
    
    public axk(final bxk a, final eo1 b, final uwi c, final jg4 d, final kfw e, final rql f) {
        e0e.f((Object)a, "preloadNotificationRepository");
        e0e.f((Object)b, "notificationController");
        e0e.f((Object)c, "notificationsChannelsManager");
        e0e.f((Object)d, "clientIdentity");
        e0e.f((Object)e, "userManager");
        e0e.f((Object)f, "pushNotificationBroadcaster");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a() {
        final int g = this.a.b.g("preload_number_of_times_shown", 0);
        final boolean b = ita.d().b("android_enable_preload_notifications_recycle", false);
        int n = g;
        if (g > 6) {
            n = g;
            if (b) {
                final gcu$c i = this.a.b.i();
                ((gcu$d)i).g("preload_number_of_times_shown", 0);
                i.e();
                n = 0;
            }
        }
        if (n < 7 && this.e.d().isEmpty()) {
            final bxk a = this.a;
            Objects.requireNonNull(a);
            awj awj = null;
            switch (n) {
                default: {
                    awj = null;
                    break;
                }
                case 6: {
                    awj = new awj((Object)a.a.getString(2131958025), (Object)a.a.getString(2131958024));
                    break;
                }
                case 5: {
                    awj = new awj((Object)a.a.getString(2131958109), (Object)a.a.getString(2131958108));
                    break;
                }
                case 4: {
                    awj = new awj((Object)a.a.getString(2131954059), (Object)a.a.getString(2131954058));
                    break;
                }
                case 3: {
                    awj = new awj((Object)a.a.getString(2131954170), (Object)a.a.getString(2131954169));
                    break;
                }
                case 2: {
                    awj = new awj((Object)a.a.getString(2131958718), (Object)a.a.getString(2131958717));
                    break;
                }
                case 1: {
                    awj = new awj((Object)a.a.getString(2131957514), (Object)a.a.getString(2131957513));
                    break;
                }
                case 0: {
                    awj = new awj((Object)a.a.getString(2131954083), (Object)a.a.getString(2131954082));
                    break;
                }
            }
            Objects.requireNonNull(this.a);
            String s;
            if (n != 1 && n != 6 && n != 3 && n != 4) {
                s = null;
            }
            else {
                s = "https://pbs.twimg.com/media/FWgt-7AWQAA7YWP?format=jpg&name=small";
            }
            final bti$a bti$a = new bti$a();
            bti$a.i = "twitter://onboarding/task?flow_name=welcome";
            String d;
            if (awj != null) {
                d = (String)awj.F0;
            }
            else {
                d = null;
            }
            bti$a.d = d;
            String e;
            if (awj != null) {
                e = (String)awj.G0;
            }
            else {
                e = null;
            }
            bti$a.e = e;
            bti$a.G = "TWITTER";
            bti$a.x = this.c.b();
            bti$a.a = 9;
            bti$a.p(UserIdentifier.LOGGED_OUT);
            final StringBuilder sb = new StringBuilder();
            sb.append("preloaded_c");
            sb.append(n);
            bti$a.q(sb.toString());
            bti$a.c = this.d.b();
            bti$a.l = 86432185L;
            bti$a.E = new z0k(Integer.valueOf(1), (Integer)null, (Integer)null);
            if (s != null) {
                final hqi.a a2 = new hqi.a();
                final usi$a usi$a = new usi$a();
                usi$a.a = s;
                a2.a = (usi)((z4j)usi$a).e();
                final usi$a usi$a2 = new usi$a();
                usi$a2.a = s;
                a2.c = (usi)((z4j)usi$a2).e();
                bti$a.F = (ati)a2.e();
            }
            final bti bti = (bti)((z4j)bti$a).e();
            if (ita.d().b("android_enable_preload_notifications_badge", false)) {
                this.f.b(bti);
            }
            this.b.e(bti, iwi.a());
            final fg4 fg4 = new fg4(new String[] { "external::oem:preload_notification:shown" });
            ((o1p)fg4).t = String.valueOf(n + 1);
            final int a3 = o5j.a;
            sbw.b((tlm)fg4);
            final bxk a4 = this.a;
            final int g2 = a4.b.g("preload_number_of_times_shown", 0);
            final gcu$c j = a4.b.i();
            ((gcu$d)j).g("preload_number_of_times_shown", g2 + 1);
            j.e();
            final bxk a5 = this.a;
            final gcu$c k = a5.b.i();
            ((gcu$d)k).c("preload_last_shown", a5.c.a());
            k.e();
        }
    }
}

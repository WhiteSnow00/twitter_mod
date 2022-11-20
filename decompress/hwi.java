import java.util.HashMap;
import android.app.NotificationChannelGroup;
import android.os.Build$VERSION;
import java.util.Objects;
import android.app.NotificationChannel;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwi implements dwi
{
    public static final d Companion;
    public final Context a;
    public final si8 b;
    public final bev c;
    public final mgv d;
    public final qbu e;
    public final bqi f;
    public final wc6 g;
    public boolean h;
    
    static {
        Companion = new d();
    }
    
    public hwi(final Context a, final xbm xbm, final si8 b, final bev c, final mgv d, final qbu e, final bqi f, final eqi eqi) {
        czd.f((Object)a, "context");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)b, "provider");
        czd.f((Object)c, "notificationManager");
        czd.f((Object)d, "userManager");
        czd.f((Object)e, "preferences");
        czd.f((Object)f, "listChecker");
        czd.f((Object)eqi, "notificationChannelsObserver");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new wc6();
        synchronized (this) {
            if (!this.h) {
                final List q = d.q();
                czd.e((Object)q, "userManager.allLoggedInUserInfos");
                final Iterator iterator = q.iterator();
                while (iterator.hasNext()) {
                    this.l((adw)iterator.next());
                }
                this.h = true;
            }
            monitorexit(this);
            this.g.d(new t19[] { this.d.p().subscribe((lj6)new gwi((qsb)new hwi$a(this), 0)), ((uew)this.d).r().subscribe((lj6)new tga((qsb)new hwi$b(this), 23)), eqi.a().subscribe((lj6)new eb7((qsb)new hwi$c(this), 25)) });
            xbm.i((oj)new qbk(this, 22));
        }
    }
    
    public static boolean k(final UserIdentifier userIdentifier, final NotificationChannel notificationChannel) {
        czd.f((Object)userIdentifier, "$userIdentifier");
        czd.f((Object)notificationChannel, "input");
        return notificationChannel.getGroup() != null && czd.a((Object)userIdentifier.getStringId(), (Object)notificationChannel.getGroup());
    }
    
    public final boolean a(final String s, final String s2) {
        czd.f((Object)s, "channelId");
        czd.f((Object)s2, "data");
        if (this.i()) {
            final NotificationChannel g = this.c.g(s);
            if (g == null) {
                final d companion = hwi.Companion;
                Objects.requireNonNull(companion);
                final StringBuilder sb = new StringBuilder();
                sb.append("Can't show a notification = ");
                sb.append(s2);
                sb.append(" in a nonexistent channel = ");
                sb.append(s);
                companion.c("show_invalid", sb.toString(), s);
                final h8a h8a = new h8a((Throwable)new IllegalStateException("Illegal channel"));
                ((HashMap<String, String>)h8a.a).put("missing-channel-id", s);
                ((HashMap<String, String>)h8a.a).put("notification-data", s2);
                m8a.c(h8a);
            }
            else {
                if (g.getImportance() != 0) {
                    return true;
                }
                final d companion2 = hwi.Companion;
                Objects.requireNonNull(companion2);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't show a notification in a disabled channel = ");
                sb2.append(s);
                companion2.c("show_disabled", sb2.toString(), s);
            }
            return false;
        }
        return true;
    }
    
    public final String b() {
        final boolean i = this.i();
        String s = "generic";
        if (i) {
            final String string = this.a.getString(2131952412);
            czd.e((Object)string, "context.getString(R.string.channel_generic_title)");
            final NotificationChannel notificationChannel = new NotificationChannel("generic", (CharSequence)string, 3);
            notificationChannel.setShowBadge(true);
            this.c.f(notificationChannel);
        }
        else {
            s = "";
        }
        return s;
    }
    
    public final boolean c() {
        if (this.i()) {
            final NotificationChannel g = this.c.g("generic");
            if (g == null || g.getImportance() != 0) {
                return true;
            }
        }
        return false;
    }
    
    public final String d(final UserIdentifier userIdentifier) {
        final si8 b = this.b;
        final String stringId = userIdentifier.getStringId();
        Objects.requireNonNull(b);
        czd.f((Object)stringId, "userId");
        return lp.K(stringId, "media_processing");
    }
    
    public final String e(final UserIdentifier userIdentifier) {
        final si8 b = this.b;
        final String stringId = userIdentifier.getStringId();
        Objects.requireNonNull(b);
        czd.f((Object)stringId, "userId");
        return lp.K(stringId, "spaces");
    }
    
    public final List<NotificationChannel> f(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final List e = fq4.e((Iterable)this.c.j(), (xtk)new pi7((Object)userIdentifier, 4));
        czd.e((Object)e, "filter(\n            noti\u2026stringId == input.group }");
        return e;
    }
    
    public final String g(final UserIdentifier userIdentifier) {
        final si8 b = this.b;
        final String stringId = userIdentifier.getStringId();
        Objects.requireNonNull(b);
        czd.f((Object)stringId, "userId");
        return lp.K(stringId, "audio_tweet");
    }
    
    public final void h() {
        if (!this.i()) {
            return;
        }
        for (final NotificationChannel notificationChannel : this.c.j()) {
            final String id = notificationChannel.getId();
            final qbu e = this.e;
            czd.e((Object)id, "channelId");
            int n = 1;
            final boolean e2 = e.e(id, true);
            if (notificationChannel.getImportance() == 0) {
                n = 0;
            }
            if ((e2 ? 1 : 0) == n) {
                continue;
            }
            this.e.i().f(id, (boolean)(n != 0)).e();
            String s;
            if (n != 0) {
                s = "enabled";
            }
            else {
                s = "disabled";
            }
            hwi.Companion.c(s, mw.y("Notification channel ", id, " was ", s), id);
        }
    }
    
    public final boolean i() {
        return Build$VERSION.SDK_INT >= 26;
    }
    
    public final String j(final UserIdentifier userIdentifier) {
        czd.f((Object)userIdentifier, "userIdentifier");
        final si8 b = this.b;
        final String stringId = userIdentifier.getStringId();
        Objects.requireNonNull(b);
        czd.f((Object)stringId, "userId");
        return lp.K(stringId, "engagement");
    }
    
    public final void l(final adw adw) {
        if (this.i()) {
            final cgv user = adw.getUser();
            czd.e((Object)user, "userInfo.user");
            this.g.a(this.f.a(adw).G((lj6)new fwi((qsb)new iwi(this, user, hwi.d.a(hwi.Companion, adw)), 0), (lj6)new ewi((qsb)jwi.D0, 0)));
        }
    }
    
    public static final class d
    {
        public static final NotificationChannelGroup a(final d d, final adw adw) {
            Objects.requireNonNull(d);
            final UserIdentifier f = adw.getUser().f();
            czd.e((Object)f, "userInfo.user.userIdentifier");
            return new NotificationChannelGroup(f.getStringId(), (CharSequence)lp.T(adw));
        }
        
        public static final void b(final d d, final UserIdentifier userIdentifier, final List list, final String s) {
            Objects.requireNonNull(d);
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final String id = ((NotificationChannel)iterator.next()).getId();
                czd.e((Object)id, "channel.id");
                final Object[] array = new oam("-").e((CharSequence)id, 0).toArray(new String[0]);
                czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                final vba e = vba.Companion.e("notification", "status_bar", "channel", ((String[])array)[1], s);
                final fca a = fca.a();
                final af4 af4 = new af4(e);
                ((u0p)af4).A();
                a.b(userIdentifier, (elm)af4);
            }
        }
        
        public final void c(final String s, final String t, String s2) {
            final Object[] array = new oam("-").e((CharSequence)s2, 0).toArray(new String[0]);
            czd.d((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final String[] array2 = (String[])array;
            if (array2.length > 1) {
                s2 = array2[1];
            }
            final af4 af4 = new af4(vba.Companion.e("notification", "status_bar", s2, "channel", s));
            ((u0p)af4).t = t;
            final int a = c5j.a;
            cbw.b((elm)af4);
        }
    }
}

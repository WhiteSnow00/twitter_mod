import android.os.Build$VERSION;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lri
{
    public static final a Companion;
    public final gew a;
    
    static {
        Companion = new a();
    }
    
    public lri(final gew a) {
        zzd.f((Object)a, "userManager");
        this.a = a;
    }
    
    public static final boolean b(final UserIdentifier userIdentifier) {
        return w48.i(lri.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_super_followers_tab_enabled", false);
    }
    
    public static final boolean d(final UserIdentifier userIdentifier) {
        return w48.i(lri.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_inline_action_bar_enabled_impress_magic_recs", false);
    }
    
    public static final boolean e(final UserIdentifier userIdentifier) {
        return w48.i(lri.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_inline_action_bar_enabled_impress_all", false);
    }
    
    public static final boolean f(final UserIdentifier userIdentifier) {
        return lri.Companion.f(userIdentifier);
    }
    
    public final boolean a() {
        final int size = this.a.d().size();
        boolean b = true;
        if (size <= 1) {
            b = false;
        }
        return b;
    }
    
    public final boolean c() {
        final boolean a = this.a();
        boolean m = false;
        if (a) {
            final boolean b = this.a.d().size() < 8;
            m = m;
            if (b) {
                m = dta.d().m("android_account_push_group_8860");
            }
        }
        return m;
    }
    
    public static final class a
    {
        public final boolean a(final jsi jsi) {
            zzd.f((Object)jsi, "notificationInfo");
            return gkr.o1((CharSequence)jsi.h, (CharSequence)"magic_rec", false);
        }
        
        public final boolean b(final jsi jsi) {
            final String h = jsi.h;
            boolean b2;
            final boolean b = b2 = false;
            if (gkr.o1((CharSequence)h, (CharSequence)"magic_rec_tweet", false)) {
                final String y = jsi.y;
                final boolean b3 = y != null && gkr.o1((CharSequence)y, (CharSequence)"topics", false);
                b2 = b;
                if (!b3) {
                    b2 = b;
                    if (!this.c(jsi)) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        public final boolean c(final jsi jsi) {
            zzd.f((Object)jsi, "notificationInfo");
            final String h = jsi.h;
            boolean b = false;
            if (gkr.o1((CharSequence)h, (CharSequence)"user", false) || gkr.o1((CharSequence)jsi.h, (CharSequence)"event_magic_fanout", false)) {
                b = true;
            }
            return b;
        }
        
        public final boolean d(final UserIdentifier userIdentifier, final jsi jsi) {
            final boolean b = yk.B(userIdentifier, "userIdentifier", userIdentifier, "android_custom_push_no_media_enabled", false);
            return Build$VERSION.SDK_INT >= 24 && this.a(jsi) && !this.c(jsi) && b;
        }
        
        public final boolean e(final UserIdentifier userIdentifier, final boolean b) {
            zzd.f((Object)userIdentifier, "userIdentifier");
            return Build$VERSION.SDK_INT >= 24 && (!b || !dta.a(userIdentifier).b("android_notification_custom_view_old_layout_enabled", false)) && dta.a(userIdentifier).b("android_notification_custom_view_enabled", false);
        }
        
        public final boolean f(final UserIdentifier userIdentifier) {
            zzd.f((Object)userIdentifier, "userIdentifier");
            return Build$VERSION.SDK_INT >= 24 && dta.e(userIdentifier).b("android_enable_messaging_style_push_notifications", false);
        }
    }
}

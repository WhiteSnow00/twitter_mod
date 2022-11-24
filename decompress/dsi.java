import android.os.Build$VERSION;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsi
{
    public static final a Companion;
    public final kfw a;
    
    static {
        Companion = new a();
    }
    
    public dsi(final kfw a) {
        e0e.f((Object)a, "userManager");
        this.a = a;
    }
    
    public static final boolean b(final UserIdentifier userIdentifier) {
        return mw.A(dsi.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_super_followers_tab_enabled", false);
    }
    
    public static final boolean d(final UserIdentifier userIdentifier) {
        return mw.A(dsi.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_inline_action_bar_enabled_impress_magic_recs", false);
    }
    
    public static final boolean e(final UserIdentifier userIdentifier) {
        return mw.A(dsi.Companion, userIdentifier, "userIdentifier", userIdentifier, "android_ntab_inline_action_bar_enabled_impress_all", false);
    }
    
    public static final boolean f(final UserIdentifier userIdentifier) {
        return dsi.Companion.f(userIdentifier);
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
                m = ita.d().m("android_account_push_group_8860");
            }
        }
        return m;
    }
    
    public static final class a
    {
        public final boolean a(final bti bti) {
            e0e.f((Object)bti, "notificationInfo");
            return wlr.r1((CharSequence)bti.h, (CharSequence)"magic_rec", false);
        }
        
        public final boolean b(final bti bti) {
            final String h = bti.h;
            boolean b2;
            final boolean b = b2 = false;
            if (wlr.r1((CharSequence)h, (CharSequence)"magic_rec_tweet", false)) {
                final String y = bti.y;
                final boolean b3 = y != null && wlr.r1((CharSequence)y, (CharSequence)"topics", false);
                b2 = b;
                if (!b3) {
                    b2 = b;
                    if (!this.c(bti)) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        public final boolean c(final bti bti) {
            e0e.f((Object)bti, "notificationInfo");
            final String h = bti.h;
            boolean b = false;
            if (wlr.r1((CharSequence)h, (CharSequence)"user", false) || wlr.r1((CharSequence)bti.h, (CharSequence)"event_magic_fanout", false)) {
                b = true;
            }
            return b;
        }
        
        public final boolean d(final UserIdentifier userIdentifier, final bti bti) {
            final boolean a = j00.A(userIdentifier, "userIdentifier", userIdentifier, "android_custom_push_no_media_enabled", false);
            return Build$VERSION.SDK_INT >= 24 && this.a(bti) && !this.c(bti) && a;
        }
        
        public final boolean e(final UserIdentifier userIdentifier, final boolean b) {
            e0e.f((Object)userIdentifier, "userIdentifier");
            return Build$VERSION.SDK_INT >= 24 && (!b || !ita.a(userIdentifier).b("android_notification_custom_view_old_layout_enabled", false)) && ita.a(userIdentifier).b("android_notification_custom_view_enabled", false);
        }
        
        public final boolean f(final UserIdentifier userIdentifier) {
            e0e.f((Object)userIdentifier, "userIdentifier");
            return Build$VERSION.SDK_INT >= 24 && ita.e(userIdentifier).b("android_enable_messaging_style_push_notifications", false);
        }
    }
}

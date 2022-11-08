import android.os.BaseBundle;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.browser.CustomTabsActionReceiver;
import android.app.PendingIntent;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ob7 implements nb7
{
    public final Context a;
    public final qfv b;
    
    public ob7(final Context a, final qfv b) {
        this.a = a;
        this.b = b;
    }
    
    public static PendingIntent b(final Activity activity, final String action, final c0p c0p) {
        final Intent putExtra = new Intent((Context)activity, (Class)CustomTabsActionReceiver.class).setAction(action).putExtra("scribe_items_provider", (Parcelable)c0p);
        if (Build$VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast((Context)activity, 0, putExtra, 167772160);
        }
        return PendingIntent.getBroadcast((Context)activity, 0, putExtra, 134217728);
    }
    
    @Override
    public final mb7 a(final mb7.a a, final Activity activity, final String s, final c0p c0p, final boolean b) {
        a.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", goz.J((Context)activity, 2130969110));
        a.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        if (b && !c6e.b((Iterable)dta.b().g("web_view_share_suppression_prefixes"), (otk)new gbg(s, 1))) {
            final boolean b2 = this.b.g(UserIdentifier.getCurrent()).o() == fjw.F0;
            final boolean b3 = UserIdentifier.getCurrent().isRegularUser() && !b2;
            for (final eb7 eb7 : eb7.values()) {
                Objects.requireNonNull(eb7);
                if (eb7 != eb7.J0 && (eb7.D0 || b3)) {
                    final PendingIntent b4 = b(activity, eb7.C0, c0p);
                    if (b4 != null) {
                        final String string = ((Context)activity).getString(eb7.E0);
                        if (a.b == null) {
                            a.b = new ArrayList<Bundle>();
                        }
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
                        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)b4);
                        a.b.add(bundle);
                    }
                }
            }
            if (b3) {
                final PendingIntent b5 = b(activity, "tweet_text_icon", c0p);
                final Context a2 = this.a;
                if (ob7.ob7$a.b == null) {
                    nds.a((Class)ob7.ob7$a.class);
                    ob7.ob7$a.b = new ob7.ob7$a(a2);
                }
                final Bitmap a3 = ob7.ob7$a.b.a;
                final String string2 = this.a.getString(2131958047);
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putInt("android.support.customtabs.customaction.ID", 0);
                bundle2.putParcelable("android.support.customtabs.customaction.ICON", (Parcelable)a3);
                ((BaseBundle)bundle2).putString("android.support.customtabs.customaction.DESCRIPTION", string2);
                bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)b5);
                a.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle2);
                a.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", false);
            }
        }
        a.c = tn.a((Context)activity, 2130772069, 2130772021).b();
        a.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", tn.a((Context)activity, 2130772018, 2130772066).b());
        final ArrayList<Bundle> b6 = a.b;
        if (b6 != null) {
            a.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", (ArrayList)b6);
        }
        a.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", a.d);
        final Intent a4 = a.a;
        final mb7 mb7 = new mb7(a4, a.c);
        a4.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", true);
        final StringBuilder sb = new StringBuilder();
        sb.append("android-app://");
        sb.append(this.a.getPackageName());
        a4.putExtra("android.intent.extra.REFERRER", (Parcelable)Uri.parse(sb.toString()));
        return mb7;
    }
}

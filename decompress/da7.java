import com.twitter.util.user.UserIdentifier;
import kotlin.NoWhenBranchMatchedException;
import android.widget.RemoteViews;
import android.os.Build;
import java.util.Objects;
import android.graphics.Bitmap;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class da7
{
    public final Resources a;
    
    public da7(final Resources a) {
        czd.f((Object)a, "resources");
        this.a = a;
    }
    
    public final void a(final qqi qqi, final lsi lsi, final Bitmap bitmap, final Bitmap bitmap2) {
        czd.f((Object)qqi, "builder");
        czd.f((Object)lsi, "info");
        final UserIdentifier b = lsi.B;
        Objects.requireNonNull(nri.Companion);
        czd.f((Object)b, "userIdentifier");
        final int f = asa.a(b).f("android_notification_custom_view_fill", 50);
        czd.e((Object)Build.MANUFACTURER, "MANUFACTURER");
        final aa7 c = zc.c();
        RemoteViews z;
        if (czd.a((Object)c, (Object)aa7$c.a)) {
            if (f != 25) {
                if (f != 33) {
                    z = new RemoteViews(f61.a, 2131625591);
                }
                else {
                    z = new RemoteViews(f61.a, 2131625592);
                }
            }
            else {
                z = new RemoteViews(f61.a, 2131625593);
            }
        }
        else if (czd.a((Object)c, (Object)aa7$d.a)) {
            if (f != 25) {
                if (f != 33) {
                    z = new RemoteViews(f61.a, 2131626010);
                }
                else {
                    z = new RemoteViews(f61.a, 2131626011);
                }
            }
            else {
                z = new RemoteViews(f61.a, 2131626012);
            }
        }
        else if (czd.a((Object)c, (Object)aa7$b.a)) {
            if (f != 25) {
                if (f != 33) {
                    z = new RemoteViews(f61.a, 2131624612);
                }
                else {
                    z = new RemoteViews(f61.a, 2131624613);
                }
            }
            else {
                z = new RemoteViews(f61.a, 2131624614);
            }
        }
        else {
            if (!czd.a((Object)c, (Object)aa7$a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (f != 25) {
                if (f != 33) {
                    z = new RemoteViews(f61.a, 2131624995);
                }
                else {
                    z = new RemoteViews(f61.a, 2131624996);
                }
            }
            else {
                z = new RemoteViews(f61.a, 2131624997);
            }
        }
        final String d = lsi.d;
        final boolean b2 = true;
        if (d == null || d.length() == 0) {
            z.setTextViewText(2131430385, this.a.getText(2131952029));
        }
        else {
            z.setTextViewText(2131430385, (CharSequence)lsi.d);
        }
        z.setTextViewText(2131430384, (CharSequence)lsi.e);
        final String u = lsi.U;
        int n = b2 ? 1 : 0;
        if (u != null) {
            if (u.length() == 0) {
                n = (b2 ? 1 : 0);
            }
            else {
                n = 0;
            }
        }
        if (n != 0) {
            z.setViewVisibility(2131430383, 8);
        }
        else {
            final String u2 = lsi.U;
            final StringBuilder sb = new StringBuilder();
            sb.append(u2);
            sb.append(" ");
            z.setTextViewText(2131430383, (CharSequence)sb.toString());
            z.setViewVisibility(2131430383, 0);
        }
        z.setLong(2131429431, "setTime", lsi.M);
        z.setImageViewBitmap(2131429284, bitmap);
        nza.U1(lsi, z);
        qqi.z = z;
    }
}

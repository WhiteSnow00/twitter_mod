import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import android.text.TextUtils;
import android.content.Intent;
import android.os.Build$VERSION;
import android.net.Uri;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kn extends qo6
{
    public static final int c = 0;
    
    public static Uri e(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 22) {
            return kn.kn$c.a(activity);
        }
        final Intent intent = activity.getIntent();
        final Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        final String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }
    
    public static void f(final Activity activity, final String[] array, final int n) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (TextUtils.isEmpty((CharSequence)array[i])) {
                throw new IllegalArgumentException(m51.y(ehk.f("Permission request for permissions "), Arrays.toString(array), " must not contain null or empty values"));
            }
        }
        if (Build$VERSION.SDK_INT >= 23) {
            if (activity instanceof kn.kn$f) {
                ((kn.kn$f)activity).g();
            }
            kn.kn$d.b(activity, array, n);
        }
        else if (activity instanceof kn.kn$e) {
            new Handler(Looper.getMainLooper()).post((Runnable)new kn$a(array, activity, n));
        }
    }
}

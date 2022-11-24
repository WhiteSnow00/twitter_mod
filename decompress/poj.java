import android.text.TextUtils;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poj
{
    public static void a(@RecentlyNonNull final Context context) {
        final gey g0 = xey.G0;
        final Object[] array = { "ocr" };
        kqe.u0(array, 1);
        final lfy lfy = new lfy(array, 1);
        final Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join((CharSequence)",", (Iterable)lfy));
        context.sendBroadcast(intent);
    }
}

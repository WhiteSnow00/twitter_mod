import android.content.res.Resources;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import android.widget.RemoteViews;
import android.app.Notification$Style;
import android.app.Notification$DecoratedCustomViewStyle;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rqi extends vqi
{
    public final void b(final tpi tpi) {
        if (Build$VERSION.SDK_INT >= 24) {
            ((wqi)tpi).b.setStyle((Notification$Style)new Notification$DecoratedCustomViewStyle());
        }
    }
    
    public final String f() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
    
    public final RemoteViews g() {
        if (Build$VERSION.SDK_INT >= 24) {
            return null;
        }
        final qqi a = super.a;
        RemoteViews remoteViews = a.A;
        if (remoteViews == null) {
            remoteViews = a.z;
        }
        if (remoteViews == null) {
            return null;
        }
        return this.k(remoteViews, true);
    }
    
    public final RemoteViews h() {
        if (Build$VERSION.SDK_INT >= 24) {
            return null;
        }
        final RemoteViews z = super.a.z;
        if (z == null) {
            return null;
        }
        return this.k(z, false);
    }
    
    public final void i() {
        if (Build$VERSION.SDK_INT >= 24) {
            return;
        }
        Objects.requireNonNull(super.a);
        final RemoteViews z = super.a.z;
    }
    
    public final RemoteViews k(final RemoteViews remoteViews, final boolean b) {
        final int n = 1;
        final RemoteViews c = this.c(true, 2131625012, false);
        c.removeAllViews(2131427508);
        final ArrayList b2 = super.a.b;
        List<mqi> list;
        if (b2 == null) {
            list = null;
        }
        else {
            list = new ArrayList<mqi>();
            for (final mqi mqi : b2) {
                if (!mqi.h) {
                    ((ArrayList<mqi>)list).add(mqi);
                }
            }
        }
        int n3 = 0;
        Label_0310: {
            if (b && list != null) {
                final int min = Math.min(list.size(), 3);
                if (min > 0) {
                    int n2 = 0;
                    while (true) {
                        n3 = n;
                        if (n2 >= min) {
                            break Label_0310;
                        }
                        final mqi mqi2 = list.get(n2);
                        final boolean b3 = mqi2.k == null;
                        final String packageName = super.a.a.getPackageName();
                        int n4;
                        if (b3) {
                            n4 = 2131624990;
                        }
                        else {
                            n4 = 2131624989;
                        }
                        final RemoteViews remoteViews2 = new RemoteViews(packageName, n4);
                        final IconCompat a = mqi2.a();
                        if (a != null) {
                            remoteViews2.setImageViewBitmap(2131427465, this.d(a, super.a.a.getResources().getColor(2131100529), 0));
                        }
                        remoteViews2.setTextViewText(2131427503, mqi2.j);
                        if (!b3) {
                            remoteViews2.setOnClickPendingIntent(2131427456, mqi2.k);
                        }
                        remoteViews2.setContentDescription(2131427456, mqi2.j);
                        c.addView(2131427508, remoteViews2);
                        ++n2;
                    }
                }
            }
            n3 = 0;
        }
        int n5;
        if (n3 != 0) {
            n5 = 0;
        }
        else {
            n5 = 8;
        }
        c.setViewVisibility(2131427508, n5);
        c.setViewVisibility(2131427459, n5);
        c.setViewVisibility(2131432076, 8);
        c.setViewVisibility(2131431944, 8);
        c.setViewVisibility(2131431943, 8);
        c.removeAllViews(2131430378);
        c.addView(2131430378, remoteViews.clone());
        c.setViewVisibility(2131430378, 0);
        final Resources resources = super.a.a.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131166763);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166764);
        final float fontScale = resources.getConfiguration().fontScale;
        float n6;
        if (fontScale < 1.0f) {
            n6 = 1.0f;
        }
        else {
            n6 = fontScale;
            if (fontScale > 1.3f) {
                n6 = 1.3f;
            }
        }
        final float n7 = (n6 - 1.0f) / 0.29999995f;
        c.setViewPadding(2131430379, 0, Math.round(n7 * dimensionPixelSize2 + (1.0f - n7) * dimensionPixelSize), 0, 0);
        return c;
    }
}

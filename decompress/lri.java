import android.os.BaseBundle;
import android.content.res.Resources$Theme;
import java.io.InputStream;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Bitmap$Config;
import android.util.Log;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat$b;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.BitmapFactory;
import androidx.core.graphics.drawable.IconCompat$a;
import android.os.Build$VERSION;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.Bitmap;
import android.content.res.Resources;
import android.os.SystemClock;
import java.text.NumberFormat;
import java.util.Objects;
import android.widget.RemoteViews;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lri
{
    public gri a;
    public CharSequence b;
    public CharSequence c;
    public boolean d;
    
    public lri() {
        this.d = false;
    }
    
    public void a(final Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        final CharSequence b = this.b;
        if (b != null) {
            bundle.putCharSequence("android.title.big", b);
        }
        final String f = this.f();
        if (f != null) {
            ((BaseBundle)bundle).putString("androidx.core.app.extra.COMPAT_TEMPLATE", f);
        }
    }
    
    public abstract void b(final jqi p0);
    
    public final RemoteViews c(final boolean b, int n, final boolean b2) {
        final Resources resources = this.a.a.getResources();
        final RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), n);
        final gri a = this.a;
        n = a.j;
        final Bitmap h = a.h;
        final int n2 = 0;
        if (h != null) {
            remoteViews.setViewVisibility(2131429506, 0);
            remoteViews.setImageViewBitmap(2131429506, this.a.h);
            if (b && this.a.F.icon != 0) {
                n = resources.getDimensionPixelSize(2131166756);
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131166758);
                final gri a2 = this.a;
                remoteViews.setImageViewBitmap(2131431002, this.e(a2.F.icon, n, n - dimensionPixelSize * 2, a2.x));
                remoteViews.setViewVisibility(2131431002, 0);
            }
        }
        else if (b && a.F.icon != 0) {
            remoteViews.setViewVisibility(2131429506, 0);
            n = resources.getDimensionPixelSize(2131166752);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166734);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(2131166759);
            final gri a3 = this.a;
            remoteViews.setImageViewBitmap(2131429506, this.e(a3.F.icon, n - dimensionPixelSize2, dimensionPixelSize3, a3.x));
        }
        final CharSequence e = this.a.e;
        if (e != null) {
            remoteViews.setTextViewText(2131432077, e);
        }
        final CharSequence f = this.a.f;
        final int n3 = 1;
        if (f != null) {
            remoteViews.setTextViewText(2131431944, f);
            n = 1;
        }
        else {
            n = 0;
        }
        Objects.requireNonNull(this.a);
        int n4;
        if (this.a.i > 0) {
            n = resources.getInteger(2131492967);
            if (this.a.i > n) {
                remoteViews.setTextViewText(2131429562, (CharSequence)resources.getString(2131958521));
            }
            else {
                remoteViews.setTextViewText(2131429562, (CharSequence)NumberFormat.getIntegerInstance().format(this.a.i));
            }
            remoteViews.setViewVisibility(2131429562, 0);
            n4 = 1;
            n = 1;
        }
        else {
            remoteViews.setViewVisibility(2131429562, 8);
            final int n5 = 0;
            n4 = n;
            n = n5;
        }
        final CharSequence n6 = this.a.n;
        boolean b3 = false;
        Label_0485: {
            if (n6 != null) {
                remoteViews.setTextViewText(2131431944, n6);
                final CharSequence f2 = this.a.f;
                if (f2 != null) {
                    remoteViews.setTextViewText(2131431945, f2);
                    remoteViews.setViewVisibility(2131431945, 0);
                    b3 = true;
                    break Label_0485;
                }
                remoteViews.setViewVisibility(2131431945, 8);
            }
            b3 = false;
        }
        if (b3) {
            if (b2) {
                remoteViews.setTextViewTextSize(2131431944, 0, (float)resources.getDimensionPixelSize(2131166761));
            }
            remoteViews.setViewPadding(2131429749, 0, 0, 0, 0);
        }
        if (this.a.c() != 0L) {
            if (this.a.l) {
                remoteViews.setViewVisibility(2131428243, 0);
                remoteViews.setLong(2131428243, "setBase", SystemClock.elapsedRealtime() - System.currentTimeMillis() + this.a.c());
                remoteViews.setBoolean(2131428243, "setStarted", true);
                Objects.requireNonNull(this.a);
                n = n3;
            }
            else {
                remoteViews.setViewVisibility(2131432034, 0);
                remoteViews.setLong(2131432034, "setTime", this.a.c());
                n = n3;
            }
        }
        if (n != 0) {
            n = 0;
        }
        else {
            n = 8;
        }
        remoteViews.setViewVisibility(2131431004, n);
        if (n4 != 0) {
            n = n2;
        }
        else {
            n = 8;
        }
        remoteViews.setViewVisibility(2131429750, n);
        return remoteViews;
    }
    
    public final Bitmap d(final IconCompat iconCompat, final int n, final int n2) {
        final Context a = this.a.a;
        iconCompat.a(a);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Drawable e;
        if (sdk_INT >= 23) {
            e = IconCompat$a.e(iconCompat.m(a), a);
        }
        else {
            Object o = null;
            Label_0391: {
                Label_0388: {
                    while (true) {
                        Label_0320: {
                            String s = null;
                            switch (iconCompat.a) {
                                default: {
                                    break Label_0388;
                                }
                                case 6: {
                                    final InputStream l = iconCompat.l(a);
                                    if (l == null) {
                                        break Label_0388;
                                    }
                                    if (sdk_INT >= 26) {
                                        o = IconCompat$b.a((Drawable)null, (Drawable)new BitmapDrawable(a.getResources(), BitmapFactory.decodeStream(l)));
                                        break Label_0320;
                                    }
                                    o = new BitmapDrawable(a.getResources(), IconCompat.b(BitmapFactory.decodeStream(l), false));
                                    break Label_0391;
                                }
                                case 5: {
                                    o = new BitmapDrawable(a.getResources(), IconCompat.b((Bitmap)iconCompat.b, false));
                                    break Label_0391;
                                }
                                case 4: {
                                    final InputStream i = iconCompat.l(a);
                                    if (i != null) {
                                        o = new BitmapDrawable(a.getResources(), BitmapFactory.decodeStream(i));
                                        break Label_0391;
                                    }
                                    break Label_0388;
                                }
                                case 3: {
                                    o = new BitmapDrawable(a.getResources(), BitmapFactory.decodeByteArray((byte[])iconCompat.b, iconCompat.e, iconCompat.f));
                                    break Label_0391;
                                }
                                case 2: {
                                    if (TextUtils.isEmpty((CharSequence)(s = iconCompat.h()))) {
                                        s = a.getPackageName();
                                        break;
                                    }
                                    break;
                                }
                                case 1: {
                                    o = new BitmapDrawable(a.getResources(), (Bitmap)iconCompat.b);
                                    break Label_0391;
                                }
                            }
                            final Resources j = IconCompat.i(a, s);
                            try {
                                final int e2 = iconCompat.e;
                                final Resources$Theme theme = a.getTheme();
                                final ThreadLocal a2 = dsm.a;
                                o = dsm$a.a(j, e2, theme);
                                break Label_0391;
                            }
                            catch (final RuntimeException ex) {
                                Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", iconCompat.e, iconCompat.b), (Throwable)ex);
                                break Label_0388;
                            }
                        }
                        continue;
                    }
                }
                o = null;
            }
            if (o != null && (iconCompat.g != null || iconCompat.h != IconCompat.k)) {
                ((Drawable)o).mutate();
                ae9$b.h((Drawable)o, iconCompat.g);
                ae9$b.i((Drawable)o, iconCompat.h);
            }
            e = (Drawable)o;
        }
        int intrinsicWidth;
        if (n2 == 0) {
            intrinsicWidth = e.getIntrinsicWidth();
        }
        else {
            intrinsicWidth = n2;
        }
        int intrinsicHeight = n2;
        if (n2 == 0) {
            intrinsicHeight = e.getIntrinsicHeight();
        }
        final Bitmap bitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap$Config.ARGB_8888);
        e.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        if (n != 0) {
            e.mutate().setColorFilter((ColorFilter)new PorterDuffColorFilter(n, PorterDuff$Mode.SRC_IN));
        }
        e.draw(new Canvas(bitmap));
        return bitmap;
    }
    
    public final Bitmap e(int n, int n2, final int n3, final int n4) {
        int n5 = n4;
        if (n4 == 0) {
            n5 = 0;
        }
        final Bitmap d = this.d(IconCompat.d(this.a.a, 2131232736), n5, n2);
        final Canvas canvas = new Canvas(d);
        final Drawable mutate = this.a.a.getResources().getDrawable(n).mutate();
        mutate.setFilterBitmap(true);
        n = (n2 - n3) / 2;
        n2 = n3 + n;
        mutate.setBounds(n, n, n2, n2);
        mutate.setColorFilter((ColorFilter)new PorterDuffColorFilter(-1, PorterDuff$Mode.SRC_ATOP));
        mutate.draw(canvas);
        return d;
    }
    
    public String f() {
        return null;
    }
    
    public RemoteViews g() {
        return null;
    }
    
    public RemoteViews h() {
        return null;
    }
    
    public void i() {
    }
    
    public final void j(final gri a) {
        if (this.a != a && (this.a = a) != null) {
            a.m(this);
        }
    }
}

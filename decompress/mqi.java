import android.content.res.Resources;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.app.PendingIntent;
import android.content.Context;
import java.util.ArrayList;
import android.app.Notification;
import android.widget.RemoteViews;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqi
{
    public RemoteViews A;
    public String B;
    public int C;
    public String D;
    public boolean E;
    public Notification F;
    public boolean G;
    @Deprecated
    public ArrayList<String> H;
    public Context a;
    public ArrayList<iqi> b;
    public ArrayList<cbk> c;
    public ArrayList<iqi> d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public Bitmap h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public rqi m;
    public CharSequence n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Bundle w;
    public int x;
    public int y;
    public RemoteViews z;
    
    public mqi(final Context a, final String b) {
        this.b = new ArrayList<iqi>();
        this.c = new ArrayList<cbk>();
        this.d = new ArrayList<iqi>();
        this.k = true;
        this.t = false;
        this.x = 0;
        this.y = 0;
        this.C = 0;
        final Notification f = new Notification();
        this.F = f;
        this.a = a;
        this.B = b;
        f.when = System.currentTimeMillis();
        this.F.audioStreamType = -1;
        this.j = 0;
        this.H = new ArrayList<String>();
        this.E = true;
    }
    
    public static CharSequence d(final CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        CharSequence subSequence = charSequence;
        if (charSequence.length() > 5120) {
            subSequence = charSequence.subSequence(0, 5120);
        }
        return subSequence;
    }
    
    public final mqi a(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
        this.b.add(new iqi(n, charSequence, pendingIntent));
        return this;
    }
    
    public final Notification b() {
        final sqi sqi = new sqi(this);
        final rqi m = sqi.c.m;
        if (m != null) {
            m.b((npi)sqi);
        }
        RemoteViews h;
        if (m != null) {
            h = m.h();
        }
        else {
            h = null;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        Notification notification;
        if (sdk_INT >= 26) {
            notification = sqi.b.build();
        }
        else if (sdk_INT >= 24) {
            final Notification notification2 = notification = sqi.b.build();
            if (sqi.h != 0) {
                if (notification2.getGroup() != null && (notification2.flags & 0x200) != 0x0 && sqi.h == 2) {
                    sqi.c(notification2);
                }
                notification = notification2;
                if (notification2.getGroup() != null) {
                    notification = notification2;
                    if ((notification2.flags & 0x200) == 0x0) {
                        notification = notification2;
                        if (sqi.h == 1) {
                            sqi.c(notification2);
                            notification = notification2;
                        }
                    }
                }
            }
        }
        else {
            sqi.b.setExtras(sqi.g);
            final Notification build = sqi.b.build();
            final RemoteViews d = sqi.d;
            if (d != null) {
                build.contentView = d;
            }
            final RemoteViews e = sqi.e;
            if (e != null) {
                build.bigContentView = e;
            }
            notification = build;
            if (sqi.h != 0) {
                if (build.getGroup() != null && (build.flags & 0x200) != 0x0 && sqi.h == 2) {
                    sqi.c(build);
                }
                notification = build;
                if (build.getGroup() != null) {
                    notification = build;
                    if ((build.flags & 0x200) == 0x0) {
                        notification = build;
                        if (sqi.h == 1) {
                            sqi.c(build);
                            notification = build;
                        }
                    }
                }
            }
        }
        if (h != null) {
            notification.contentView = h;
        }
        else {
            final RemoteViews z = sqi.c.z;
            if (z != null) {
                notification.contentView = z;
            }
        }
        if (m != null) {
            final RemoteViews g = m.g();
            if (g != null) {
                notification.bigContentView = g;
            }
        }
        if (m != null) {
            sqi.c.m.i();
        }
        if (m != null) {
            final Bundle extras = notification.extras;
            if (extras != null) {
                m.a(extras);
            }
        }
        return notification;
    }
    
    public final long c() {
        long when;
        if (this.k) {
            when = this.F.when;
        }
        else {
            when = 0L;
        }
        return when;
    }
    
    public final mqi e(final boolean b) {
        this.i(16, b);
        return this;
    }
    
    public final mqi f(final CharSequence charSequence) {
        this.f = d(charSequence);
        return this;
    }
    
    public final mqi g(final CharSequence charSequence) {
        this.e = d(charSequence);
        return this;
    }
    
    public final mqi h(final int defaults) {
        final Notification f = this.F;
        f.defaults = defaults;
        if ((defaults & 0x4) != 0x0) {
            f.flags |= 0x1;
        }
        return this;
    }
    
    public final void i(final int n, final boolean b) {
        if (b) {
            final Notification f = this.F;
            f.flags |= n;
        }
        else {
            final Notification f2 = this.F;
            f2.flags &= ~n;
        }
    }
    
    public final mqi j(final Bitmap bitmap) {
        Bitmap scaledBitmap = bitmap;
        if (bitmap != null) {
            if (Build$VERSION.SDK_INT >= 27) {
                scaledBitmap = bitmap;
            }
            else {
                final Resources resources = this.a.getResources();
                final int dimensionPixelSize = resources.getDimensionPixelSize(2131165482);
                final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165481);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    scaledBitmap = bitmap;
                }
                else {
                    final double min = Math.min(dimensionPixelSize / (double)Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / (double)Math.max(1, bitmap.getHeight()));
                    scaledBitmap = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * min), (int)Math.ceil(bitmap.getHeight() * min), true);
                }
            }
        }
        this.h = scaledBitmap;
        return this;
    }
    
    public final mqi k(int ledARGB, final int ledOnMS, final int ledOffMS) {
        final Notification f = this.F;
        f.ledARGB = ledARGB;
        f.ledOnMS = ledOnMS;
        f.ledOffMS = ledOffMS;
        if (ledOnMS != 0 && ledOffMS != 0) {
            ledARGB = 1;
        }
        else {
            ledARGB = 0;
        }
        f.flags = (ledARGB | (f.flags & 0xFFFFFFFE));
        return this;
    }
    
    public final mqi l() {
        this.i(8, true);
        return this;
    }
    
    public final mqi m(final rqi m) {
        if (this.m != m && (this.m = m) != null) {
            m.j(this);
        }
        return this;
    }
    
    public final mqi n(final CharSequence charSequence) {
        this.F.tickerText = d(charSequence);
        return this;
    }
}

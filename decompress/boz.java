import android.os.BaseBundle;
import android.util.Pair;
import android.os.Build;
import android.os.Parcelable;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.PackageManager;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.net.MalformedURLException;
import java.net.URL;
import android.net.Uri$Builder;
import java.nio.ByteBuffer;
import java.io.FileNotFoundException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import java.math.BigInteger;
import java.util.Locale;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.security.SecureRandom;
import java.io.IOException;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import java.util.Map;
import java.util.Collection;
import android.util.Log;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.app.job.JobInfo$Builder;
import android.os.PersistableBundle;
import android.content.ComponentName;
import android.os.Build$VERSION;
import android.os.SystemClock;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.List;
import java.util.Objects;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class boz implements hbz
{
    public static volatile boz h1;
    public final r6z C0;
    public final y2z D0;
    public jdy E0;
    public g3z F0;
    public gmz G0;
    public l9y H0;
    public final hoz I0;
    public agz J0;
    public wkz K0;
    public final fnz L0;
    public r4z M0;
    public final y7z N0;
    public boolean O0;
    public boolean P0;
    public long Q0;
    public ArrayList R0;
    public int S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public FileLock X0;
    public FileChannel Y0;
    public ArrayList Z0;
    public ArrayList a1;
    public long b1;
    public final HashMap c1;
    public final HashMap d1;
    public egz e1;
    public String f1;
    public final r4c g1;
    
    public boz(final eoz eoz) {
        this.O0 = false;
        this.g1 = new r4c((Object)this);
        this.N0 = y7z.v(eoz.a, (ppy)null, (Long)null);
        this.b1 = -1L;
        this.L0 = new fnz(this);
        final hoz i0 = new hoz(this);
        ((lmz)i0).i();
        this.I0 = i0;
        final y2z d0 = new y2z(this);
        ((lmz)d0).i();
        this.D0 = d0;
        final r6z c0 = new r6z(this);
        ((lmz)c0).i();
        this.C0 = c0;
        this.c1 = new HashMap();
        this.d1 = new HashMap();
        this.a().q((Runnable)new p2y((Object)this, (Object)eoz, 3, (w48)null));
    }
    
    public static final boolean H(final hwz hwz) {
        return !TextUtils.isEmpty((CharSequence)hwz.D0) || !TextUtils.isEmpty((CharSequence)hwz.S0);
    }
    
    public static final lmz I(final lmz lmz) {
        if (lmz == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (lmz.E0) {
            return lmz;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(lmz.getClass())));
    }
    
    public static boz O(final Context context) {
        Objects.requireNonNull(context, "null reference");
        xd.t((Object)context.getApplicationContext());
        if (boz.h1 == null) {
            synchronized (boz.class) {
                if (boz.h1 == null) {
                    boz.h1 = new boz(new eoz(context));
                }
            }
        }
        return boz.h1;
    }
    
    public static final void w(final o4z o4z, final int n, final String s) {
        final List v = o4z.v();
        for (int i = 0; i < v.size(); ++i) {
            if ("_err".equals(((i5z)v.get(i)).y())) {
                return;
            }
        }
        final e5z w = i5z.w();
        w.n("_err");
        w.m((long)n);
        final i5z i5z = (i5z)((mjz)w).j();
        final e5z w2 = i5z.w();
        w2.n("_ev");
        w2.o(s);
        final i5z i5z2 = (i5z)((mjz)w2).j();
        if (((mjz)o4z).E0) {
            ((mjz)o4z).l();
            ((mjz)o4z).E0 = false;
        }
        s4z.C((s4z)((mjz)o4z).D0, i5z);
        if (((mjz)o4z).E0) {
            ((mjz)o4z).l();
            ((mjz)o4z).E0 = false;
        }
        s4z.C((s4z)((mjz)o4z).D0, i5z2);
    }
    
    public static final void y(final o4z o4z, final String s) {
        final List v = o4z.v();
        for (int i = 0; i < v.size(); ++i) {
            if (s.equals(((i5z)v.get(i)).y())) {
                o4z.q(i);
                return;
            }
        }
    }
    
    public final Boolean A(final kaz kaz) {
        try {
            if (kaz.B() != -2147483648L) {
                if (kaz.B() == ntx.a(this.N0.C0).b(kaz.M(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            }
            else {
                final String versionName = ntx.a(this.N0.C0).b(kaz.M(), 0).versionName;
                final String p = kaz.P();
                if (p != null && p.equals(versionName)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public final void B() {
        this.a().g();
        if (this.U0 || this.V0 || this.W0) {
            this.b().P0.d("Not stopping services. fetch, network, upload", (Object)this.U0, (Object)this.V0, (Object)this.W0);
            return;
        }
        this.b().P0.a("Stopping uploading service(s)");
        final ArrayList r0 = this.R0;
        if (r0 == null) {
            return;
        }
        final Iterator iterator = r0.iterator();
        while (iterator.hasNext()) {
            ((Runnable)iterator.next()).run();
        }
        final ArrayList r2 = this.R0;
        Objects.requireNonNull(r2, "null reference");
        r2.clear();
    }
    
    public final void C(final s6z s6z, final long n, final boolean b) {
        String s;
        if (!b) {
            s = "_lte";
        }
        else {
            s = "_se";
        }
        final jdy e0 = this.E0;
        I((lmz)e0);
        final poz h = e0.H(s6z.c0(), s);
        poz poz;
        if (h != null && h.e != null) {
            final String c0 = s6z.c0();
            Objects.requireNonNull((ca7)this.c());
            poz = new poz(c0, "auto", s, System.currentTimeMillis(), (long)h.e + n);
        }
        else {
            final String c2 = s6z.c0();
            Objects.requireNonNull((ca7)this.c());
            poz = new poz(c2, "auto", s, System.currentTimeMillis(), n);
        }
        final z7z v = d8z.v();
        v.n(s);
        Objects.requireNonNull((ca7)this.c());
        v.o(System.currentTimeMillis());
        v.m((long)poz.e);
        final d8z d8z = (d8z)v.j();
        final int u = hoz.u(s6z, s);
        if (u >= 0) {
            if (((mjz)s6z).E0) {
                ((mjz)s6z).l();
                ((mjz)s6z).E0 = false;
            }
            w6z.A0((w6z)((mjz)s6z).D0, u, d8z);
        }
        else {
            if (((mjz)s6z).E0) {
                ((mjz)s6z).l();
                ((mjz)s6z).E0 = false;
            }
            w6z.B0((w6z)((mjz)s6z).D0, d8z);
        }
        if (n > 0L) {
            final jdy e2 = this.E0;
            I((lmz)e2);
            e2.r(poz);
            String s2;
            if (!b) {
                s2 = "lifetime";
            }
            else {
                s2 = "session-scoped";
            }
            this.b().P0.c("Updated engagement user property. scope, value", (Object)s2, poz.e);
        }
    }
    
    public final void D() {
        this.a().g();
        this.g();
        if (this.Q0 > 0L) {
            Objects.requireNonNull((ca7)this.c());
            final long n = 3600000L - Math.abs(SystemClock.elapsedRealtime() - this.Q0);
            if (n > 0L) {
                this.b().P0.b("Upload has been suspended. Will update scheduling later in approximately ms", (Object)n);
                this.N().a();
                final gmz g0 = this.G0;
                I((lmz)g0);
                g0.k();
                return;
            }
            this.Q0 = 0L;
        }
        if (!this.N0.j() || !this.F()) {
            this.b().P0.a("Nothing to upload or uploading impossible");
            this.N().a();
            final gmz g2 = this.G0;
            I((lmz)g2);
            g2.k();
            return;
        }
        Objects.requireNonNull((ca7)this.c());
        final long currentTimeMillis = System.currentTimeMillis();
        this.K();
        final long max = Math.max(0L, (long)fzy.B.a((Object)null));
        final jdy e0 = this.E0;
        I((lmz)e0);
        boolean b = false;
        Label_0242: {
            if (e0.u("select count(1) > 0 from raw_events where realtime = 1", (String[])null) == 0L) {
                final jdy e2 = this.E0;
                I((lmz)e2);
                if (e2.u("select count(1) > 0 from queue where has_realtime = 1", (String[])null) == 0L) {
                    b = false;
                    break Label_0242;
                }
            }
            b = true;
        }
        long n2;
        if (b) {
            final String i = this.K().i("debug.firebase.analytics.app");
            if (!TextUtils.isEmpty((CharSequence)i) && !".none.".equals(i)) {
                this.K();
                n2 = Math.max(0L, (long)fzy.w.a((Object)null));
            }
            else {
                this.K();
                n2 = Math.max(0L, (long)fzy.v.a((Object)null));
            }
        }
        else {
            this.K();
            n2 = Math.max(0L, (long)fzy.u.a((Object)null));
        }
        final long a = this.K0.L0.a();
        final long a2 = this.K0.M0.a();
        final jdy e3 = this.E0;
        I((lmz)e3);
        final long x = e3.x("select max(bundle_end_timestamp) from queue", (String[])null, 0L);
        final jdy e4 = this.E0;
        I((lmz)e4);
        final long max2 = Math.max(x, e4.x("select max(timestamp) from raw_events", (String[])null, 0L));
        long n6 = 0L;
        Label_0650: {
            if (max2 != 0L) {
                final long n3 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                final long abs = Math.abs(a - currentTimeMillis);
                final long n4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                final long max3 = Math.max(currentTimeMillis - abs, n4);
                final long n5 = n6 = max + n3;
                if (b) {
                    n6 = n5;
                    if (max3 > 0L) {
                        n6 = Math.min(n3, max3) + n2;
                    }
                }
                final hoz i2 = this.I0;
                I((lmz)i2);
                if (!i2.K(max3, n2)) {
                    n6 = max3 + n2;
                }
                if (n4 == 0L || n4 < n3) {
                    break Label_0650;
                }
                int n7 = 0;
                while (true) {
                    this.K();
                    if (n7 >= Math.min(20, Math.max(0, (int)fzy.D.a((Object)null)))) {
                        break;
                    }
                    this.K();
                    final long n8 = n6 += Math.max(0L, (long)fzy.C.a((Object)null)) * (1L << n7);
                    if (n8 > n4) {
                        break Label_0650;
                    }
                    ++n7;
                    n6 = n8;
                }
            }
            n6 = 0L;
        }
        if (n6 == 0L) {
            this.b().P0.a("Next upload time is 0");
            this.N().a();
            final gmz g3 = this.G0;
            I((lmz)g3);
            g3.k();
            return;
        }
        final y2z d0 = this.D0;
        I((lmz)d0);
        if (d0.k()) {
            final long a3 = this.K0.K0.a();
            this.K();
            final long max4 = Math.max(0L, (long)fzy.s.a((Object)null));
            final hoz i3 = this.I0;
            I((lmz)i3);
            long max5 = n6;
            if (!i3.K(a3, max4)) {
                max5 = Math.max(n6, a3 + max4);
            }
            this.N().a();
            Objects.requireNonNull((ca7)this.c());
            long max6;
            if ((max6 = max5 - System.currentTimeMillis()) <= 0L) {
                this.K();
                max6 = Math.max(0L, (long)fzy.x.a((Object)null));
                final q3z l0 = this.K0.L0;
                Objects.requireNonNull((ca7)this.c());
                l0.b(System.currentTimeMillis());
            }
            this.b().P0.b("Upload scheduled in approximately ms", (Object)max6);
            final gmz g4 = this.G0;
            I((lmz)g4);
            ((lmz)g4).h();
            Objects.requireNonNull(((abz)g4).C0);
            final Context c0 = ((abz)g4).C0.C0;
            if (!xoz.X(c0)) {
                ((abz)g4).C0.b().O0.a("Receiver not registered/enabled");
            }
            if (!xoz.Y(c0)) {
                ((abz)g4).C0.b().O0.a("Service not registered/enabled");
            }
            g4.k();
            ((abz)g4).C0.b().P0.b("Scheduling upload, millis", (Object)max6);
            Objects.requireNonNull(((abz)g4).C0.P0);
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            Objects.requireNonNull(((abz)g4).C0);
            if (max6 < Math.max(0L, (long)fzy.y.a((Object)null)) && g4.n().c == 0L) {
                g4.n().c(max6);
            }
            Objects.requireNonNull(((abz)g4).C0);
            if (Build$VERSION.SDK_INT >= 24) {
                final Context c2 = ((abz)g4).C0.C0;
                final ComponentName componentName = new ComponentName(c2, "com.google.android.gms.measurement.AppMeasurementJobService");
                final int j = g4.l();
                final PersistableBundle extras = new PersistableBundle();
                ((BaseBundle)extras).putString("action", "com.google.android.gms.measurement.UPLOAD");
                qly.a(c2, new JobInfo$Builder(j, componentName).setMinimumLatency(max6).setOverrideDeadline(max6 + max6).setExtras(extras).build());
            }
            else {
                final AlarmManager f0 = g4.F0;
                if (f0 != null) {
                    Objects.requireNonNull(((abz)g4).C0);
                    f0.setInexactRepeating(2, elapsedRealtime + max6, Math.max((long)fzy.t.a((Object)null), max6), g4.m());
                }
            }
            return;
        }
        this.b().P0.a("No network");
        final g3z n9 = this.N();
        n9.a.g();
        n9.a.a().g();
        if (!n9.b) {
            n9.a.N0.C0.registerReceiver((BroadcastReceiver)n9, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            final y2z d2 = n9.a.D0;
            I((lmz)d2);
            n9.c = d2.k();
            n9.a.b().P0.b("Registering connectivity change receiver. Network connected", (Object)n9.c);
            n9.b = true;
        }
        final gmz g5 = this.G0;
        I((lmz)g5);
        g5.k();
    }
    
    public final boolean E(long n) {
        final String s = "_npa";
        final String s2 = "_ai";
        final jdy e0 = this.E0;
        I((lmz)e0);
        e0.O();
        try {
            final unz unz = new unz(this);
            final jdy e2 = this.E0;
            I((lmz)e2);
            e2.s(n, this.b1, unz);
            final ArrayList c = unz.c;
            if (c != null && !c.isEmpty()) {
                Object o = ((okz)unz.a).k();
                ((s6z)o).v0();
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                Object o2 = null;
                int n5 = -1;
                Object o3 = null;
                int n6 = -1;
                while (true) {
                    final int size = unz.c.size();
                    final String s3 = s2;
                    if (n3 >= size) {
                        break;
                    }
                    final o4z o4z = (o4z)((okz)unz.c.get(n3)).k();
                    final r6z c2 = this.C0;
                    I((lmz)c2);
                    int n7;
                    if (c2.y(unz.a.J1(), o4z.u())) {
                        this.b().q().c("Dropping blocked raw event. appId", b2z.s(unz.a.J1()), (Object)this.N0.t().d(o4z.u()));
                        final r6z c3 = this.C0;
                        I((lmz)c3);
                        if (!c3.v(unz.a.J1())) {
                            final r6z c4 = this.C0;
                            I((lmz)c4);
                            if (!c4.z(unz.a.J1())) {
                                if (!"_err".equals(o4z.u())) {
                                    this.Q().A((uoz)this.g1, unz.a.J1(), 11, "_ev", o4z.u(), 0);
                                }
                            }
                        }
                        n7 = n3;
                    }
                    else {
                        n7 = n3;
                        if (o4z.u().equals(p7q.f(s3))) {
                            o4z.r(s3);
                            this.b().p().a("Renaming ad_impression to _ai");
                            n7 = n3;
                            if (Log.isLoggable(this.b().v(), 5)) {
                                int n8 = 0;
                                while (true) {
                                    n7 = n3;
                                    if (n8 >= o4z.m()) {
                                        break;
                                    }
                                    if ("ad_platform".equals(o4z.t(n8).y()) && !o4z.t(n8).z().isEmpty() && "admob".equalsIgnoreCase(o4z.t(n8).z())) {
                                        this.b().r().a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    ++n8;
                                }
                            }
                        }
                        final r6z c5 = this.C0;
                        I((lmz)c5);
                        final boolean x = c5.x(unz.a.J1(), o4z.u());
                        Object o4 = null;
                        Object o5 = null;
                        int n10 = 0;
                        boolean b = false;
                        int n11 = 0;
                        Label_1493: {
                            if (!x) {
                                I((lmz)this.I0);
                                final String u = o4z.u();
                                xd.q(u);
                                final int hashCode = u.hashCode();
                                int n9 = 0;
                                Label_0646: {
                                    if (hashCode != 94660) {
                                        if (hashCode != 95025) {
                                            if (hashCode == 95027) {
                                                if (u.equals("_ui")) {
                                                    n9 = 1;
                                                    break Label_0646;
                                                }
                                            }
                                        }
                                        else if (u.equals("_ug")) {
                                            n9 = 2;
                                            break Label_0646;
                                        }
                                    }
                                    else if (u.equals("_in")) {
                                        n9 = 0;
                                        break Label_0646;
                                    }
                                    n9 = -1;
                                }
                                if (n9 != 0 && n9 != 1 && n9 != 2) {
                                    o4 = o;
                                    o5 = o3;
                                    n10 = n6;
                                    b = false;
                                    n11 = n2;
                                    break Label_1493;
                                }
                            }
                            int n12 = 0;
                            int n13 = 0;
                            boolean b2 = false;
                            final Object o6 = o3;
                            s6z s6z;
                            while (true) {
                                final int m = o4z.m();
                                s6z = (s6z)o;
                                if (n12 >= m) {
                                    break;
                                }
                                int n14;
                                if ("_c".equals(o4z.t(n12).y())) {
                                    final e5z e5z = (e5z)((okz)o4z.t(n12)).k();
                                    e5z.m(1L);
                                    o4z.s(n12, (i5z)((mjz)e5z).j());
                                    n14 = 1;
                                }
                                else {
                                    n14 = n13;
                                    if ("_r".equals(o4z.t(n12).y())) {
                                        final e5z e5z2 = (e5z)((okz)o4z.t(n12)).k();
                                        e5z2.m(1L);
                                        o4z.s(n12, (i5z)((mjz)e5z2).j());
                                        b2 = true;
                                        n14 = n13;
                                    }
                                }
                                ++n12;
                                o = s6z;
                                n13 = n14;
                            }
                            final Object o7 = o6;
                            if (n13 == 0 && x) {
                                this.b().p().b("Marking event as conversion", (Object)this.N0.t().d(o4z.u()));
                                final e5z w = i5z.w();
                                w.n("_c");
                                w.m(1L);
                                o4z.p(w);
                            }
                            if (!b2) {
                                this.b().p().b("Marking event as real-time", (Object)this.N0.t().d(o4z.u()));
                                final e5z w2 = i5z.w();
                                w2.n("_r");
                                w2.m(1L);
                                o4z.p(w2);
                            }
                            final jdy e3 = this.E0;
                            I((lmz)e3);
                            if (e3.E(this.x(), unz.a.J1(), false, true).e > this.K().n(unz.a.J1(), fzy.p)) {
                                y(o4z, "_r");
                            }
                            else {
                                n2 = 1;
                            }
                            b = x;
                            o5 = o7;
                            n11 = n2;
                            n10 = n6;
                            o4 = s6z;
                            if (xoz.W(o4z.u())) {
                                b = x;
                                o5 = o7;
                                n11 = n2;
                                n10 = n6;
                                o4 = s6z;
                                if (x) {
                                    final jdy e4 = this.E0;
                                    I((lmz)e4);
                                    b = x;
                                    o5 = o7;
                                    n11 = n2;
                                    n10 = n6;
                                    o4 = s6z;
                                    if (e4.E(this.x(), unz.a.J1(), true, false).c > this.K().n(unz.a.J1(), fzy.o)) {
                                        this.b().q().b("Too many conversions. Not logging as conversion. appId", b2z.s(unz.a.J1()));
                                        Object o8 = null;
                                        int i = 0;
                                        boolean b3 = false;
                                        int n15 = -1;
                                        while (i < o4z.m()) {
                                            final i5z t = o4z.t(i);
                                            Object o9;
                                            int n16;
                                            if ("_c".equals(t.y())) {
                                                o9 = ((okz)t).k();
                                                n16 = i;
                                            }
                                            else {
                                                o9 = o8;
                                                n16 = n15;
                                                if ("_err".equals(t.y())) {
                                                    b3 = true;
                                                    n16 = n15;
                                                    o9 = o8;
                                                }
                                            }
                                            ++i;
                                            o8 = o9;
                                            n15 = n16;
                                        }
                                        Object o10 = o8;
                                        if (b3) {
                                            if (o8 != null) {
                                                o4z.q(n15);
                                                b = x;
                                                o5 = o7;
                                                n11 = n2;
                                                n10 = n6;
                                                o4 = s6z;
                                                break Label_1493;
                                            }
                                            o10 = null;
                                        }
                                        if (o10 != null) {
                                            final e5z e5z3 = (e5z)((mjz)o10).g();
                                            e5z3.n("_err");
                                            e5z3.m(10L);
                                            o4z.s(n15, (i5z)((mjz)e5z3).j());
                                            b = x;
                                            o5 = o7;
                                            n11 = n2;
                                            n10 = n6;
                                            o4 = s6z;
                                        }
                                        else {
                                            this.b().o().b("Did not find conversion parameter. appId", b2z.s(unz.a.J1()));
                                            o4 = s6z;
                                            n10 = n6;
                                            n11 = n2;
                                            o5 = o7;
                                            b = x;
                                        }
                                    }
                                }
                            }
                        }
                        int n17 = n5;
                        Label_1814: {
                            if (b) {
                                final ArrayList list = new ArrayList(o4z.v());
                                int j = 0;
                                int n18 = -1;
                                int n19 = -1;
                                while (j < list.size()) {
                                    int n20;
                                    if ("value".equals(((i5z)list.get(j)).y())) {
                                        n20 = j;
                                    }
                                    else {
                                        n20 = n18;
                                        if ("currency".equals(((i5z)list.get(j)).y())) {
                                            n19 = j;
                                            n20 = n18;
                                        }
                                    }
                                    ++j;
                                    n18 = n20;
                                }
                                if (n18 != -1) {
                                    if (!((i5z)list.get(n18)).N() && !((i5z)list.get(n18)).L()) {
                                        this.b().r().a("Value must be specified with a numeric type.");
                                        o4z.q(n18);
                                        y(o4z, "_c");
                                        w(o4z, 18, "value");
                                    }
                                    else {
                                        Label_1772: {
                                            if (n19 != -1) {
                                                final String z = ((i5z)list.get(n19)).z();
                                                if (z.length() == 3) {
                                                    int codePoint;
                                                    for (int k = 0; k < z.length(); k += Character.charCount(codePoint)) {
                                                        codePoint = z.codePointAt(k);
                                                        if (!Character.isLetter(codePoint)) {
                                                            break Label_1772;
                                                        }
                                                    }
                                                    break Label_1814;
                                                }
                                            }
                                        }
                                        this.b().r().a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        o4z.q(n18);
                                        y(o4z, "_c");
                                        w(o4z, 19, "currency");
                                    }
                                }
                            }
                        }
                        Object o11 = null;
                        int n22 = 0;
                        int n23 = 0;
                        Label_2138: {
                            Label_2126: {
                                while (true) {
                                    Label_2119: {
                                        if ("_e".equals(o4z.u())) {
                                            I((lmz)this.I0);
                                            if (hoz.l((s4z)((mjz)o4z).j(), "_fr") != null) {
                                                break Label_2119;
                                            }
                                            if (o5 != null && Math.abs(((o4z)o5).o() - o4z.o()) <= 1000L) {
                                                final o4z o4z2 = (o4z)((mjz)o5).g();
                                                if (this.G(o4z, o4z2)) {
                                                    ((s6z)o4).F(n10, o4z2);
                                                    o11 = null;
                                                    o3 = null;
                                                }
                                                else {
                                                    final o4z o4z3 = o4z;
                                                    n17 = n4;
                                                    o3 = o5;
                                                    o11 = o4z3;
                                                }
                                                final int n21 = n10;
                                                n22 = n17;
                                                n23 = n21;
                                                break Label_2138;
                                            }
                                            final o4z o4z4 = o4z;
                                            n23 = n10;
                                            final mjz mjz = (mjz)o5;
                                            n22 = n4;
                                            o11 = o4z4;
                                            o3 = mjz;
                                            break Label_2138;
                                        }
                                        else {
                                            if (!"_vs".equals(o4z.u())) {
                                                break Label_2119;
                                            }
                                            I((lmz)this.I0);
                                            if (hoz.l((s4z)((mjz)o4z).j(), "_et") != null) {
                                                break Label_2119;
                                            }
                                            if (o2 == null || Math.abs(((o4z)o2).o() - o4z.o()) > 1000L) {
                                                o3 = o4z;
                                                n22 = n17;
                                                n23 = n4;
                                                o11 = o2;
                                                break Label_2138;
                                            }
                                            final o4z o4z5 = (o4z)((mjz)o2).g();
                                            if (this.G(o4z5, o4z)) {
                                                ((s6z)o4).F(n17, o4z5);
                                                o11 = null;
                                                o3 = null;
                                                break Label_2126;
                                            }
                                            o3 = o4z;
                                            n10 = n4;
                                        }
                                        o11 = o2;
                                        break Label_2126;
                                    }
                                    o3 = o5;
                                    continue;
                                }
                            }
                            final int n24 = n17;
                            n23 = n10;
                            n22 = n24;
                        }
                        unz.c.set(n7, ((mjz)o4z).j());
                        ++n4;
                        ((s6z)o4).o0(o4z);
                        n6 = n23;
                        n5 = n22;
                        o2 = o11;
                        o = o4;
                        n2 = n11;
                    }
                    n3 = n7 + 1;
                }
                long n25 = 0L;
                final int n26 = 0;
                int n28;
                int n29;
                for (int n27 = n4, l = n26; l < n27; l = n29 + 1, n27 = n28, n25 = n) {
                    final s4z j2 = ((s6z)o).j0(l);
                    if ("_e".equals(j2.z())) {
                        I((lmz)this.I0);
                        if (hoz.l(j2, "_fr") != null) {
                            ((s6z)o).m(l);
                            n28 = n27 - 1;
                            n29 = l - 1;
                            n = n25;
                            continue;
                        }
                    }
                    I((lmz)this.I0);
                    final i5z l2 = hoz.l(j2, "_et");
                    n29 = l;
                    n28 = n27;
                    n = n25;
                    if (l2 != null) {
                        Long value;
                        if (l2.N()) {
                            value = l2.v();
                        }
                        else {
                            value = null;
                        }
                        n29 = l;
                        n28 = n27;
                        n = n25;
                        if (value != null) {
                            n29 = l;
                            n28 = n27;
                            n = n25;
                            if (value > 0L) {
                                n = n25 + value;
                                n28 = n27;
                                n29 = l;
                            }
                        }
                    }
                }
                this.C((s6z)o, n25, false);
                final Iterator iterator = ((s6z)o).e0().iterator();
                while (iterator.hasNext()) {
                    if ("_s".equals(((s4z)iterator.next()).z())) {
                        final jdy e5 = this.E0;
                        I((lmz)e5);
                        e5.k(((s6z)o).c0(), "_se");
                        break;
                    }
                }
                if (hoz.u((s6z)o, "_sid") >= 0) {
                    this.C((s6z)o, n25, true);
                }
                else {
                    final int u2 = hoz.u((s6z)o, "_se");
                    if (u2 >= 0) {
                        ((s6z)o).n(u2);
                        this.b().o().b("Session engagement user property is in the bundle without session ID. appId", b2z.s(unz.a.J1()));
                    }
                }
                final hoz i2 = this.I0;
                I((lmz)i2);
                ((abz)i2).C0.b().p().a("Checking account type status for ad personalization signals");
                final r6z c6 = ((jmz)i2).D0.C0;
                I((lmz)c6);
                Label_2807: {
                    if (c6.t(((s6z)o).c0())) {
                        final jdy e6 = ((jmz)i2).D0.E0;
                        I((lmz)e6);
                        final kaz c7 = e6.C(((s6z)o).c0());
                        if (c7 != null && c7.z() && ((abz)i2).C0.q().q()) {
                            ((abz)i2).C0.b().n().a("Turning off ad personalization due to account type");
                            final z7z v = d8z.v();
                            v.n(s);
                            v.o(((abz)i2).C0.q().n());
                            v.m(1L);
                            final d8z d8z = (d8z)v.j();
                            for (int n30 = 0; n30 < ((s6z)o).g0(); ++n30) {
                                if (s.equals(((s6z)o).b0(n30).x())) {
                                    ((s6z)o).Z(n30, d8z);
                                    break Label_2807;
                                }
                            }
                            ((s6z)o).q0(d8z);
                        }
                    }
                }
                ((s6z)o).V(Long.MAX_VALUE);
                ((s6z)o).D(Long.MIN_VALUE);
                for (int n31 = 0; n31 < ((s6z)o).M(); ++n31) {
                    final s4z j3 = ((s6z)o).j0(n31);
                    if (j3.v() < ((s6z)o).i0()) {
                        ((s6z)o).V(j3.v());
                    }
                    if (j3.v() > ((s6z)o).h0()) {
                        ((s6z)o).D(j3.v());
                    }
                }
                ((s6z)o).D0();
                ((s6z)o).s0();
                final l9y h0 = this.H0;
                I((lmz)h0);
                ((s6z)o).k0((Iterable)h0.k(((s6z)o).c0(), ((s6z)o).e0(), ((s6z)o).f0(), Long.valueOf(((s6z)o).i0()), Long.valueOf(((s6z)o).h0())));
                s6z s6z3;
                unz unz3;
                if (this.K().y(unz.a.J1())) {
                    final HashMap<String, hfy> hashMap = new HashMap<String, hfy>();
                    final ArrayList<s4z> list2 = new ArrayList<s4z>();
                    final SecureRandom s4 = this.Q().s();
                    int n32 = 0;
                    final unz unz2 = unz;
                    while (n32 < ((s6z)o).M()) {
                        final o4z o4z6 = (o4z)((okz)((s6z)o).j0(n32)).k();
                        if (o4z6.u().equals("_ep")) {
                            I((lmz)this.I0);
                            final String s5 = (String)hoz.m((s4z)((mjz)o4z6).j(), "_en");
                            hfy hfy;
                            if ((hfy = hashMap.get(s5)) == null) {
                                final jdy e7 = this.E0;
                                I((lmz)e7);
                                final String j4 = unz2.a.J1();
                                xd.t((Object)s5);
                                final hfy g = e7.G(j4, s5);
                                if ((hfy = g) != null) {
                                    hashMap.put(s5, g);
                                    hfy = g;
                                }
                            }
                            if (hfy != null && hfy.i == null) {
                                final Long j5 = hfy.j;
                                if (j5 != null && j5 > 1L) {
                                    I((lmz)this.I0);
                                    hoz.N(o4z6, "_sr", (Object)hfy.j);
                                }
                                final Boolean k2 = hfy.k;
                                if (k2 != null && k2) {
                                    I((lmz)this.I0);
                                    hoz.N(o4z6, "_efs", (Object)1L);
                                }
                                list2.add((s4z)((mjz)o4z6).j());
                            }
                            ((s6z)o).F(n32, o4z6);
                        }
                        else {
                            final r6z c8 = this.C0;
                            I((lmz)c8);
                            final String j6 = unz2.a.J1();
                            final String w3 = c8.w(j6, "measurement.account.time_zone_offset_minutes");
                            Label_3379: {
                                if (!TextUtils.isEmpty((CharSequence)w3)) {
                                    try {
                                        n = Long.parseLong(w3);
                                        break Label_3379;
                                    }
                                    catch (final NumberFormatException ex) {
                                        ((abz)c8).C0.b().q().c("Unable to parse timezone offset. appId", b2z.s(j6), (Object)ex);
                                    }
                                }
                                n = 0L;
                            }
                            final long o12 = this.Q().o0(o4z6.o(), n);
                            final s4z s4z = (s4z)((mjz)o4z6).j();
                            int p = 0;
                            Label_3523: {
                                if (!TextUtils.isEmpty((CharSequence)"_dbg")) {
                                    for (final i5z i5z : s4z.A()) {
                                        if ("_dbg".equals(i5z.y())) {
                                            if (!Long.valueOf(1L).equals(i5z.v())) {
                                                break;
                                            }
                                            p = 1;
                                            break Label_3523;
                                        }
                                    }
                                }
                                final r6z c9 = this.C0;
                                I((lmz)c9);
                                p = c9.p(unz2.a.J1(), o4z6.u());
                            }
                            if (p <= 0) {
                                this.b().q().c("Sample rate must be positive. event, rate", (Object)o4z6.u(), (Object)p);
                                list2.add((s4z)((mjz)o4z6).j());
                                ((s6z)o).F(n32, o4z6);
                            }
                            else {
                                hfy g2;
                                if ((g2 = hashMap.get(o4z6.u())) == null) {
                                    final jdy e8 = this.E0;
                                    I((lmz)e8);
                                    if ((g2 = e8.G(unz2.a.J1(), o4z6.u())) == null) {
                                        this.b().q().c("Event being bundled has no eventAggregate. appId, eventName", (Object)unz2.a.J1(), (Object)o4z6.u());
                                        g2 = new hfy(unz2.a.J1(), o4z6.u(), 1L, 1L, 1L, o4z6.o(), 0L, (Long)null, (Long)null, (Long)null, (Boolean)null);
                                    }
                                }
                                I((lmz)this.I0);
                                final Long n33 = (Long)hoz.m((s4z)((mjz)o4z6).j(), "_eid");
                                final Boolean value2 = n33 != null;
                                if (p == 1) {
                                    list2.add((s4z)((mjz)o4z6).j());
                                    if (value2 && (g2.i != null || g2.j != null || g2.k != null)) {
                                        hashMap.put(o4z6.u(), g2.a((Long)null, (Long)null, (Boolean)null));
                                    }
                                    ((s6z)o).F(n32, o4z6);
                                }
                                else {
                                    if (s4.nextInt(p) == 0) {
                                        I((lmz)this.I0);
                                        final Long value3 = (Long)p;
                                        hoz.N(o4z6, "_sr", (Object)value3);
                                        list2.add((s4z)((mjz)o4z6).j());
                                        hfy a = g2;
                                        if (value2) {
                                            a = g2.a((Long)null, value3, (Boolean)null);
                                        }
                                        hashMap.put(o4z6.u(), a.b(o4z6.o(), o12));
                                    }
                                    else {
                                        final Long h2 = g2.h;
                                        if (h2 != null) {
                                            n = h2;
                                        }
                                        else {
                                            n = this.Q().o0(o4z6.n(), n);
                                        }
                                        if (n != o12) {
                                            I((lmz)this.I0);
                                            hoz.N(o4z6, "_efs", (Object)1L);
                                            I((lmz)this.I0);
                                            final Long value4 = (Long)p;
                                            hoz.N(o4z6, "_sr", (Object)value4);
                                            list2.add((s4z)((mjz)o4z6).j());
                                            hfy a2 = g2;
                                            if (value2) {
                                                a2 = g2.a((Long)null, value4, Boolean.TRUE);
                                            }
                                            hashMap.put(o4z6.u(), a2.b(o4z6.o(), o12));
                                        }
                                        else if (value2) {
                                            hashMap.put(o4z6.u(), g2.a(n33, (Long)null, (Boolean)null));
                                        }
                                    }
                                    ((s6z)o).F(n32, o4z6);
                                }
                            }
                        }
                        ++n32;
                    }
                    final s6z s6z2 = (s6z)o;
                    if (list2.size() < s6z2.M()) {
                        s6z2.v0();
                        s6z2.l0((Iterable)list2);
                    }
                    final Iterator<Map.Entry<String, hfy>> iterator3 = hashMap.entrySet().iterator();
                    while (true) {
                        s6z3 = s6z2;
                        unz3 = unz2;
                        if (!iterator3.hasNext()) {
                            break;
                        }
                        final Map.Entry<K, hfy> entry = iterator3.next();
                        final jdy e9 = this.E0;
                        I((lmz)e9);
                        e9.n((hfy)entry.getValue());
                    }
                }
                else {
                    s6z3 = (s6z)o;
                    unz3 = unz;
                }
                final String j7 = unz3.a.J1();
                final jdy e10 = this.E0;
                I((lmz)e10);
                final kaz c10 = e10.C(j7);
                if (c10 == null) {
                    this.b().o().b("Bundling raw events w/o app info. appId", b2z.s(unz3.a.J1()));
                }
                else if (s6z3.M() > 0) {
                    final long h3 = c10.H();
                    if (h3 != 0L) {
                        s6z3.O(h3);
                    }
                    else {
                        s6z3.z0();
                    }
                    n = c10.J();
                    if (n == 0L) {
                        n = h3;
                    }
                    if (n != 0L) {
                        s6z3.P(n);
                    }
                    else {
                        s6z3.A0();
                    }
                    c10.b();
                    s6z3.v((int)c10.I());
                    c10.u(s6z3.i0());
                    c10.s(s6z3.h0());
                    final String l3 = c10.L();
                    if (l3 != null) {
                        s6z3.J(l3);
                    }
                    else {
                        s6z3.w0();
                    }
                    final jdy e11 = this.E0;
                    I((lmz)e11);
                    e11.m(c10);
                }
                if (s6z3.M() > 0) {
                    Objects.requireNonNull(this.N0);
                    final r6z c11 = this.C0;
                    I((lmz)c11);
                    final r2z q = c11.q(unz3.a.J1());
                    if (q != null && q.J()) {
                        s6z3.x(q.u());
                    }
                    else if (unz3.a.y().isEmpty()) {
                        s6z3.x(-1L);
                    }
                    else {
                        this.b().q().b("Did not find measurement config or missing version info. appId", b2z.s(unz3.a.J1()));
                    }
                    final jdy e12 = this.E0;
                    I((lmz)e12);
                    final w6z w6z = (w6z)((mjz)s6z3).j();
                    ((abz)e12).g();
                    ((lmz)e12).h();
                    xd.t((Object)w6z);
                    xd.q(w6z.J1());
                    xd.v(w6z.b1());
                    e12.R();
                    n = ((ca7)((abz)e12).C0.c()).f();
                    final long x2 = w6z.x1();
                    Objects.requireNonNull(((abz)e12).C0);
                    Label_4761: {
                        if (x2 >= n - jby.h()) {
                            final long x3 = w6z.x1();
                            Objects.requireNonNull(((abz)e12).C0);
                            if (x3 <= jby.h() + n) {
                                break Label_4761;
                            }
                        }
                        ((abz)e12).C0.b().q().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", b2z.s(w6z.J1()), (Object)n, (Object)w6z.x1());
                    }
                    final byte[] i3 = ((ffz)w6z).i();
                    try {
                        final hoz i4 = ((jmz)e12).D0.I0;
                        I((lmz)i4);
                        final byte[] m2 = i4.M(i3);
                        ((abz)e12).C0.b().p().b("Saving bundle, size", (Object)m2.length);
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", w6z.J1());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(w6z.x1()));
                        contentValues.put("data", m2);
                        contentValues.put("has_realtime", Integer.valueOf(n2));
                        if (w6z.h1()) {
                            contentValues.put("retry_count", Integer.valueOf(w6z.q1()));
                        }
                        try {
                            if (e12.A().insert("queue", (String)null, contentValues) == -1L) {
                                ((abz)e12).C0.b().o().b("Failed to insert bundle (got -1). appId", b2z.s(w6z.J1()));
                            }
                        }
                        catch (final SQLiteException ex2) {
                            ((abz)e12).C0.b().o().c("Error storing bundle. appId", b2z.s(w6z.J1()), (Object)ex2);
                        }
                    }
                    catch (final IOException ex3) {
                        ((abz)e12).C0.b().o().c("Data loss. Failed to serialize bundle. appId", b2z.s(w6z.J1()), (Object)ex3);
                    }
                }
                final jdy e13 = this.E0;
                I((lmz)e13);
                final ArrayList b4 = unz3.b;
                xd.t((Object)b4);
                ((abz)e13).g();
                ((lmz)e13).h();
                final StringBuilder sb = new StringBuilder("rowid in (");
                for (int n34 = 0; n34 < b4.size(); ++n34) {
                    if (n34 != 0) {
                        sb.append(",");
                    }
                    sb.append((long)b4.get(n34));
                }
                sb.append(")");
                final int delete = e13.A().delete("raw_events", sb.toString(), (String[])null);
                if (delete != b4.size()) {
                    ((abz)e13).C0.b().o().c("Deleted fewer rows from raw events table than expected", (Object)delete, (Object)b4.size());
                }
                final jdy e14 = this.E0;
                I((lmz)e14);
                final SQLiteDatabase a3 = e14.A();
                try {
                    a3.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", (Object[])new String[] { j7, j7 });
                }
                catch (final SQLiteException ex4) {
                    ((abz)e14).C0.b().o().c("Failed to remove unused event metadata. appId", b2z.s(j7), (Object)ex4);
                }
                final jdy e15 = this.E0;
                I((lmz)e15);
                e15.l();
                return true;
            }
            final jdy e16 = this.E0;
            I((lmz)e16);
            e16.l();
            return false;
        }
        finally {
            final jdy e17 = this.E0;
            I((lmz)e17);
            e17.P();
        }
    }
    
    public final boolean F() {
        this.a().g();
        this.g();
        final jdy e0 = this.E0;
        I((lmz)e0);
        if (e0.u("select count(1) > 0 from raw_events", (String[])null) == 0L) {
            final jdy e2 = this.E0;
            I((lmz)e2);
            if (TextUtils.isEmpty((CharSequence)e2.J())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean G(final o4z o4z, final o4z o4z2) {
        xd.k("_e".equals(o4z.u()));
        I((lmz)this.I0);
        final i5z l = hoz.l((s4z)((mjz)o4z).j(), "_sc");
        String z = null;
        Object z2;
        if (l == null) {
            z2 = null;
        }
        else {
            z2 = l.z();
        }
        I((lmz)this.I0);
        final i5z i = hoz.l((s4z)((mjz)o4z2).j(), "_pc");
        if (i != null) {
            z = i.z();
        }
        if (z != null && z.equals(z2)) {
            xd.k("_e".equals(o4z.u()));
            I((lmz)this.I0);
            final i5z j = hoz.l((s4z)((mjz)o4z).j(), "_et");
            if (j != null && j.N()) {
                if (j.v() > 0L) {
                    final long v = j.v();
                    I((lmz)this.I0);
                    final i5z k = hoz.l((s4z)((mjz)o4z2).j(), "_et");
                    long n = v;
                    if (k != null) {
                        n = v;
                        if (k.v() > 0L) {
                            n = v + k.v();
                        }
                    }
                    I((lmz)this.I0);
                    hoz.N(o4z2, "_et", (Object)n);
                    I((lmz)this.I0);
                    hoz.N(o4z, "_fr", (Object)1L);
                }
            }
            return true;
        }
        return false;
    }
    
    public final kaz J(final hwz hwz) {
        final qby e0 = qby.E0;
        this.a().g();
        this.g();
        Objects.requireNonNull(hwz, "null reference");
        xd.q(hwz.C0);
        dvz.c();
        if (this.K().t(hwz.C0, fzy.F0) && !hwz.Y0.isEmpty()) {
            this.d1.put(hwz.C0, new znz(this, hwz.Y0));
        }
        final jdy e2 = this.E0;
        I((lmz)e2);
        final kaz c = e2.C(hwz.C0);
        final zby c2 = this.L(hwz.C0).c(zby.b(hwz.X0));
        final qby d0 = qby.D0;
        String m;
        if (c2.f(d0)) {
            m = this.K0.m(hwz.C0);
        }
        else {
            m = "";
        }
        kaz kaz2 = null;
        Label_0573: {
            if (c == null) {
                final kaz kaz = new kaz(this.N0, hwz.C0);
                if (c2.f(e0)) {
                    kaz.f(this.R(c2));
                }
                kaz2 = kaz;
                if (c2.f(d0)) {
                    kaz.w(m);
                    kaz2 = kaz;
                }
            }
            else {
                if (c2.f(d0) && m != null) {
                    c.a.a().g();
                    if (!m.equals(c.e)) {
                        c.w(m);
                        trz.c();
                        final jby k = this.K();
                        final azy l0 = fzy.l0;
                        if (k.t(null, l0) && this.K().t(null, fzy.q0)) {
                            if (!"00000000-0000-0000-0000-000000000000".equals(this.K0.l(hwz.C0, c2).first)) {
                                c.f(this.R(c2));
                            }
                        }
                        else {
                            c.f(this.R(c2));
                        }
                        trz.c();
                        kaz2 = c;
                        if (!this.K().t(null, l0)) {
                            break Label_0573;
                        }
                        kaz2 = c;
                        if ("00000000-0000-0000-0000-000000000000".equals(this.K0.l(hwz.C0, c2).first)) {
                            break Label_0573;
                        }
                        final jdy e3 = this.E0;
                        I((lmz)e3);
                        kaz2 = c;
                        if (e3.H(hwz.C0, "_id") == null) {
                            break Label_0573;
                        }
                        final jdy e4 = this.E0;
                        I((lmz)e4);
                        kaz2 = c;
                        if (e4.H(hwz.C0, "_lair") == null) {
                            Objects.requireNonNull((ca7)this.c());
                            final poz poz = new poz(hwz.C0, "auto", "_lair", System.currentTimeMillis(), 1L);
                            final jdy e5 = this.E0;
                            I((lmz)e5);
                            e5.r(poz);
                            kaz2 = c;
                        }
                        break Label_0573;
                    }
                }
                kaz2 = c;
                if (TextUtils.isEmpty((CharSequence)c.N())) {
                    kaz2 = c;
                    if (c2.f(e0)) {
                        c.f(this.R(c2));
                        kaz2 = c;
                    }
                }
            }
        }
        kaz2.o(hwz.D0);
        kaz2.c(hwz.S0);
        if (!TextUtils.isEmpty((CharSequence)hwz.M0)) {
            kaz2.n(hwz.M0);
        }
        final long g0 = hwz.G0;
        if (g0 != 0L) {
            kaz2.p(g0);
        }
        if (!TextUtils.isEmpty((CharSequence)hwz.E0)) {
            kaz2.h(hwz.E0);
        }
        kaz2.i(hwz.L0);
        final String f0 = hwz.F0;
        if (f0 != null) {
            kaz2.g(f0);
        }
        kaz2.k(hwz.H0);
        kaz2.v(hwz.J0);
        if (!TextUtils.isEmpty((CharSequence)hwz.I0)) {
            kaz2.q(hwz.I0);
        }
        if (!this.K().t(null, fzy.h0)) {
            kaz2.e(hwz.N0);
        }
        kaz2.d(hwz.Q0);
        final Boolean t0 = hwz.T0;
        kaz2.a.a().g();
        kaz2.D |= (ri4.z0((Object)kaz2.s, (Object)t0) ^ true);
        kaz2.s = t0;
        kaz2.l(hwz.U0);
        mvz.c();
        if (this.K().t(null, fzy.D0)) {
            kaz2.y(hwz.Z0);
        }
        osz.c();
        if (this.K().t(null, fzy.v0)) {
            kaz2.x(hwz.V0);
        }
        else {
            osz.c();
            if (this.K().t(null, fzy.u0)) {
                kaz2.x((List)null);
            }
        }
        kaz2.a.a().g();
        if (kaz2.D) {
            final jdy e6 = this.E0;
            I((lmz)e6);
            e6.m(kaz2);
        }
        return kaz2;
    }
    
    public final jby K() {
        final y7z n0 = this.N0;
        Objects.requireNonNull(n0, "null reference");
        return n0.I0;
    }
    
    public final zby L(final String s) {
        final zby b = zby.b;
        this.a().g();
        this.g();
        Object o;
        if ((o = this.c1.get(s)) == null) {
            final jdy e0 = this.E0;
            I((lmz)e0);
            Objects.requireNonNull(s, "null reference");
            ((abz)e0).g();
            ((lmz)e0).h();
            final SQLiteDatabase a = e0.A();
            o = null;
            try {
                try {
                    final Cursor cursor = (Cursor)(o = a.rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[] { s }));
                    if (cursor.moveToFirst()) {
                        o = cursor;
                        final String string = cursor.getString(0);
                        cursor.close();
                        o = string;
                    }
                    else {
                        cursor.close();
                        o = "G1";
                    }
                    o = zby.b((String)o);
                    this.s(s, (zby)o);
                }
                finally {
                    if (o != null) {
                        ((Cursor)o).close();
                    }
                }
            }
            catch (final SQLiteException ex) {}
        }
        return (zby)o;
    }
    
    public final jdy M() {
        final jdy e0 = this.E0;
        I((lmz)e0);
        return e0;
    }
    
    public final g3z N() {
        final g3z f0 = this.F0;
        if (f0 != null) {
            return f0;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }
    
    public final hoz P() {
        final hoz i0 = this.I0;
        I((lmz)i0);
        return i0;
    }
    
    public final xoz Q() {
        final y7z n0 = this.N0;
        Objects.requireNonNull(n0, "null reference");
        return n0.B();
    }
    
    public final String R(final zby zby) {
        if (zby.f(qby.E0)) {
            final byte[] array = new byte[16];
            this.Q().s().nextBytes(array);
            return String.format(Locale.US, "%032x", new BigInteger(1, array));
        }
        return null;
    }
    
    @Override
    public final o7z a() {
        final y7z n0 = this.N0;
        Objects.requireNonNull(n0, "null reference");
        return n0.a();
    }
    
    @Override
    public final b2z b() {
        final y7z n0 = this.N0;
        Objects.requireNonNull(n0, "null reference");
        return n0.b();
    }
    
    @Override
    public final li4 c() {
        final y7z n0 = this.N0;
        Objects.requireNonNull(n0, "null reference");
        return (li4)n0.P0;
    }
    
    @Override
    public final jth d() {
        throw null;
    }
    
    @Override
    public final Context e() {
        return this.N0.C0;
    }
    
    public final void f() {
        this.a().g();
        this.g();
        if (!this.P0) {
            this.P0 = true;
            this.a().g();
            final FileLock x0 = this.X0;
            final int n = 0;
            boolean b = false;
            Label_0224: {
                Label_0148: {
                    if (x0 != null && x0.isValid()) {
                        this.b().P0.a("Storage concurrent access okay");
                        break Label_0148;
                    }
                    Objects.requireNonNull(((abz)this.E0).C0);
                    final File file = new File(this.N0.C0.getFilesDir(), "google_app_measurement.db");
                    try {
                        final FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                        this.Y0 = channel;
                        final FileLock tryLock = channel.tryLock();
                        this.X0 = tryLock;
                        if (tryLock != null) {
                            this.b().P0.a("Storage concurrent access okay");
                            b = true;
                            break Label_0224;
                        }
                        this.b().H0.a("Storage concurrent data access panic");
                    }
                    catch (final OverlappingFileLockException ex) {
                        this.b().K0.b("Storage lock already acquired", (Object)ex);
                    }
                    catch (final IOException ex2) {
                        this.b().H0.b("Failed to access storage lock file", (Object)ex2);
                    }
                    catch (final FileNotFoundException ex3) {
                        this.b().H0.b("Failed to acquire storage lock", (Object)ex3);
                    }
                }
                b = false;
            }
            if (b) {
                final FileChannel y0 = this.Y0;
                this.a().g();
                int int1;
                if (y0 != null && y0.isOpen()) {
                    final ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        y0.position(0L);
                        final int read = y0.read(allocate);
                        if (read != 4) {
                            int1 = n;
                            if (read != -1) {
                                this.b().K0.b("Unexpected data length. Bytes read", (Object)read);
                                int1 = n;
                            }
                        }
                        else {
                            allocate.flip();
                            int1 = allocate.getInt();
                        }
                    }
                    catch (final IOException ex4) {
                        this.b().H0.b("Failed to read from channel", (Object)ex4);
                        int1 = n;
                    }
                }
                else {
                    this.b().H0.a("Bad channel to read from");
                    int1 = n;
                }
                final xzy r = this.N0.r();
                ((h1z)r).h();
                final int g0 = r.G0;
                this.a().g();
                if (int1 > g0) {
                    this.b().H0.c("Panic: can't downgrade version. Previous, current version", (Object)int1, (Object)g0);
                    return;
                }
                if (int1 < g0) {
                    final FileChannel y2 = this.Y0;
                    this.a().g();
                    Label_0566: {
                        if (y2 != null) {
                            if (y2.isOpen()) {
                                final ByteBuffer allocate2 = ByteBuffer.allocate(4);
                                allocate2.putInt(g0);
                                allocate2.flip();
                                try {
                                    y2.truncate(0L);
                                    y2.write(allocate2);
                                    y2.force(true);
                                    if (y2.size() != 4L) {
                                        this.b().H0.b("Error writing to channel. Bytes written", (Object)y2.size());
                                    }
                                    this.b().P0.c("Storage version upgraded. Previous, current version", (Object)int1, (Object)g0);
                                    return;
                                }
                                catch (final IOException ex5) {
                                    this.b().H0.b("Failed to write to channel", (Object)ex5);
                                    break Label_0566;
                                }
                            }
                        }
                        this.b().H0.a("Bad channel to read from");
                    }
                    this.b().H0.c("Storage version upgrade failed. Previous, current version", (Object)int1, (Object)g0);
                }
            }
        }
    }
    
    public final void g() {
        if (this.O0) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }
    
    public final void h(final kaz kaz) {
        this.a().g();
        if (TextUtils.isEmpty((CharSequence)kaz.R()) && TextUtils.isEmpty((CharSequence)kaz.K())) {
            final String m = kaz.M();
            Objects.requireNonNull(m, "null reference");
            this.l(m, 204, null, null, null);
            return;
        }
        final fnz l0 = this.L0;
        final Uri$Builder uri$Builder = new Uri$Builder();
        String s;
        if (TextUtils.isEmpty((CharSequence)(s = kaz.R()))) {
            s = kaz.K();
        }
        final azy f = fzy.f;
        final Map map = null;
        final Uri$Builder appendQueryParameter = uri$Builder.scheme((String)f.a((Object)null)).encodedAuthority((String)fzy.g.a((Object)null)).path("config/app/".concat(String.valueOf(s))).appendQueryParameter("platform", "android");
        l0.C0.I0.p();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(64000L)).appendQueryParameter("runtime_version", "0");
        dvz.c();
        if (!l0.C0.I0.t(kaz.M(), fzy.w0)) {
            uri$Builder.appendQueryParameter("app_instance_id", kaz.N());
        }
        final String string = uri$Builder.build().toString();
        try {
            final String i = kaz.M();
            Objects.requireNonNull(i, "null reference");
            final URL url = new URL(string);
            this.b().P0.b("Fetching remote configuration", (Object)i);
            final r6z c0 = this.C0;
            I((lmz)c0);
            final r2z q = c0.q(i);
            final r6z c2 = this.C0;
            I((lmz)c2);
            ((abz)c2).g();
            final String s2 = (String)((l7q)c2.O0).getOrDefault((Object)i, (Object)null);
            Object o = map;
            if (q != null) {
                if (!TextUtils.isEmpty((CharSequence)s2)) {
                    o = new at0();
                    ((l7q)o).put((Object)"If-Modified-Since", (Object)s2);
                }
                else {
                    o = null;
                }
                dvz.c();
                if (this.K().t(null, fzy.I0)) {
                    final r6z c3 = this.C0;
                    I((lmz)c3);
                    ((abz)c3).g();
                    final String s3 = (String)((l7q)c3.P0).getOrDefault((Object)i, (Object)null);
                    if (!TextUtils.isEmpty((CharSequence)s3)) {
                        Object o2;
                        if ((o2 = o) == null) {
                            o2 = new at0();
                        }
                        o = o2;
                        ((l7q)o).put((Object)"If-None-Match", (Object)s3);
                    }
                }
            }
            this.U0 = true;
            final y2z d0 = this.D0;
            I((lmz)d0);
            final p4j p4j = new p4j(this);
            ((abz)d0).g();
            ((lmz)d0).h();
            ((abz)d0).C0.a().p((Runnable)new u2z(d0, i, url, (byte[])null, (Map)o, (j2z)p4j));
        }
        catch (final MalformedURLException ex) {
            this.b().H0.c("Failed to parse config URL. Not fetching. appId", b2z.s(kaz.M()), (Object)string);
        }
    }
    
    public final void i(hgy hgy, final hwz hwz) {
        final String s = "null reference";
        Objects.requireNonNull(hwz, "null reference");
        xd.q(hwz.C0);
        this.a().g();
        this.g();
        final String c0 = hwz.C0;
        hgy a = hgy;
        final long f0 = a.F0;
        jvz.c();
        final jby k = this.K();
        final azy r0 = fzy.r0;
        final egz egz = null;
        if (k.t(null, r0)) {
            final f2z b = f2z.b(hgy);
            this.a().g();
            egz e1 = egz;
            if (this.e1 != null) {
                final String f2 = this.f1;
                e1 = egz;
                if (f2 != null) {
                    if (!f2.equals(c0)) {
                        e1 = egz;
                    }
                    else {
                        e1 = this.e1;
                    }
                }
            }
            xoz.x(e1, b.d, false);
            a = b.a();
        }
        I((lmz)this.I0);
        if (!hoz.k(a, hwz)) {
            return;
        }
        if (!hwz.J0) {
            this.J(hwz);
            return;
        }
        final List v0 = hwz.V0;
        if (v0 != null) {
            if (!v0.contains(a.C0)) {
                this.b().O0.d("Dropping non-safelisted event. appId, event name, origin", (Object)c0, (Object)a.C0, (Object)a.E0);
                return;
            }
            final Bundle r2 = a.D0.r();
            ((BaseBundle)r2).putLong("ga_safelisted", 1L);
            hgy = new hgy(a.C0, new vfy(r2), a.E0, a.F0);
        }
        else {
            hgy = a;
        }
        final jdy e2 = this.E0;
        I((lmz)e2);
        e2.O();
        try {
            final jdy e3 = this.E0;
            I((lmz)e3);
            xd.q(c0);
            ((abz)e3).g();
            ((lmz)e3).h();
            final long n = lcmp(f0, 0L);
            List<aay> list;
            if (n < 0) {
                ((abz)e3).C0.b().K0.c("Invalid time querying timed out conditional properties", b2z.s(c0), (Object)f0);
                list = Collections.emptyList();
            }
            else {
                list = e3.L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[] { c0, String.valueOf(f0) });
            }
            for (final aay aay : list) {
                if (aay != null) {
                    this.b().P0.d("User property timed out", (Object)aay.C0, (Object)this.N0.O0.f(aay.E0.D0), aay.E0.r());
                    final hgy i0 = aay.I0;
                    if (i0 != null) {
                        this.v(new hgy(i0, f0), hwz);
                    }
                    final jdy e4 = this.E0;
                    I((lmz)e4);
                    e4.v(c0, aay.E0.D0);
                }
            }
            final jdy e5 = this.E0;
            I((lmz)e5);
            xd.q(c0);
            ((abz)e5).g();
            ((lmz)e5).h();
            List<Object> list2;
            if (n < 0) {
                ((abz)e5).C0.b().K0.c("Invalid time querying expired conditional properties", b2z.s(c0), (Object)f0);
                list2 = Collections.emptyList();
            }
            else {
                list2 = e5.L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[] { c0, String.valueOf(f0) });
            }
            final ArrayList list3 = new ArrayList<hgy>(list2.size());
            for (final aay aay2 : list2) {
                if (aay2 != null) {
                    this.b().P0.d("User property expired", (Object)aay2.C0, (Object)this.N0.O0.f(aay2.E0.D0), aay2.E0.r());
                    final jdy e6 = this.E0;
                    I((lmz)e6);
                    e6.k(c0, aay2.E0.D0);
                    final hgy m0 = aay2.M0;
                    if (m0 != null) {
                        list3.add(m0);
                    }
                    final jdy e7 = this.E0;
                    I((lmz)e7);
                    e7.v(c0, aay2.E0.D0);
                }
            }
            final Iterator<hgy> iterator3 = list3.iterator();
            while (iterator3.hasNext()) {
                this.v(new hgy((hgy)iterator3.next(), f0), hwz);
            }
            final jdy e8 = this.E0;
            I((lmz)e8);
            final String c2 = hgy.C0;
            xd.q(c0);
            xd.q(c2);
            ((abz)e8).g();
            ((lmz)e8).h();
            List<Object> list4;
            if (n < 0) {
                ((abz)e8).C0.b().K0.d("Invalid time querying triggered conditional properties", b2z.s(c0), (Object)((abz)e8).C0.O0.d(c2), (Object)f0);
                list4 = Collections.emptyList();
            }
            else {
                list4 = e8.L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[] { c0, c2, String.valueOf(f0) });
            }
            final ArrayList list5 = new ArrayList<hgy>(list4.size());
            final Iterator iterator4 = list4.iterator();
            final String s2 = s;
            while (iterator4.hasNext()) {
                final aay aay3 = (aay)iterator4.next();
                if (aay3 != null) {
                    final koz e9 = aay3.E0;
                    final String c3 = aay3.C0;
                    Objects.requireNonNull(c3, s2);
                    final String d0 = aay3.D0;
                    final String d2 = e9.D0;
                    final Object r3 = e9.r();
                    Objects.requireNonNull(r3, s2);
                    final poz poz = new poz(c3, d0, d2, f0, r3);
                    final jdy e10 = this.E0;
                    I((lmz)e10);
                    if (e10.r(poz)) {
                        this.b().P0.d("User property triggered", (Object)aay3.C0, (Object)this.N0.O0.f(poz.c), poz.e);
                    }
                    else {
                        this.b().H0.d("Too many active user properties, ignoring", b2z.s(aay3.C0), (Object)this.N0.O0.f(poz.c), poz.e);
                    }
                    final hgy k2 = aay3.K0;
                    if (k2 != null) {
                        list5.add(k2);
                    }
                    aay3.E0 = new koz(poz);
                    aay3.G0 = true;
                    final jdy e11 = this.E0;
                    I((lmz)e11);
                    e11.q(aay3);
                }
            }
            this.v(hgy, hwz);
            final Iterator<hgy> iterator5 = list5.iterator();
            while (iterator5.hasNext()) {
                this.v(new hgy((hgy)iterator5.next(), f0), hwz);
            }
            final jdy e12 = this.E0;
            I((lmz)e12);
            e12.l();
        }
        finally {
            final jdy e13 = this.E0;
            I((lmz)e13);
            e13.P();
        }
    }
    
    public final void j(final hgy hgy, final String s) {
        final jdy e0 = this.E0;
        I((lmz)e0);
        final kaz c = e0.C(s);
        if (c != null && !TextUtils.isEmpty((CharSequence)c.P())) {
            final Boolean a = this.A(c);
            if (a == null) {
                if (!"_ui".equals(hgy.C0)) {
                    this.b().K0.b("Could not find package. appId", b2z.s(s));
                }
            }
            else if (!a) {
                this.b().H0.b("App version does not match; dropping event. appId", b2z.s(s));
                return;
            }
            final String r = c.R();
            final String p2 = c.P();
            final long b = c.B();
            final String o = c.O();
            final long g = c.G();
            final long d = c.D();
            final boolean a2 = c.A();
            final String q = c.Q();
            final long r2 = c.r();
            final boolean z = c.z();
            final String k = c.K();
            c.a.a().g();
            this.k(hgy, new hwz(s, r, p2, b, o, g, d, (String)null, a2, false, q, r2, 0L, 0, z, false, k, c.s, c.E(), c.a(), this.L(s).e(), "", (String)null));
            return;
        }
        this.b().O0.b("No app data available; dropping event", (Object)s);
    }
    
    public final void k(final hgy hgy, final hwz hwz) {
        xd.q(hwz.C0);
        final f2z b = f2z.b(hgy);
        final xoz q = this.Q();
        final Bundle d = b.d;
        final jdy e0 = this.E0;
        I((lmz)e0);
        q.y(d, e0.B(hwz.C0));
        this.Q().z(b, this.K().m(hwz.C0));
        final hgy a = b.a();
        if ("_cmp".equals(a.C0)) {
            if ("referrer API v2".equals(a.D0.v("_cis"))) {
                final String v = a.D0.v("gclid");
                if (!TextUtils.isEmpty((CharSequence)v)) {
                    this.t(new koz("_lgclid", a.F0, v, "auto"), hwz);
                }
            }
        }
        this.i(a, hwz);
    }
    
    public final void l(final String s, int n, final Throwable t, final byte[] array, final Map map) {
        this.a().g();
        this.g();
        xd.q(s);
        byte[] array2 = array;
        Label_0030: {
            if (array != null) {
                break Label_0030;
            }
            try {
                array2 = new byte[0];
                final x0z p5 = this.b().P0;
                final Integer value = array2.length;
                p5.b("onConfigFetched. Response size", (Object)value);
                final jdy e0 = this.E0;
                I((lmz)e0);
                e0.O();
                try {
                    final jdy e2 = this.E0;
                    I((lmz)e2);
                    final kaz c = e2.C(s);
                    int n2 = n;
                    Label_0148: {
                        int n3 = 0;
                        Label_0142: {
                            if (n != 200 && (n2 = n) != 204) {
                                if ((n3 = n) != 304) {
                                    break Label_0142;
                                }
                                n2 = 304;
                            }
                            n3 = n2;
                            if (t == null) {
                                n = 1;
                                break Label_0148;
                            }
                        }
                        n = 0;
                        n2 = n3;
                    }
                    if (c == null) {
                        this.b().K0.b("App does not exist in onConfigFetched. appId", b2z.s(s));
                    }
                    else if (n == 0 && n2 != 404) {
                        Objects.requireNonNull((ca7)this.c());
                        c.m(System.currentTimeMillis());
                        final jdy e3 = this.E0;
                        I((lmz)e3);
                        e3.m(c);
                        this.b().P0.c("Fetching config failed. code, error", (Object)n2, (Object)t);
                        final r6z c2 = this.C0;
                        I((lmz)c2);
                        ((abz)c2).g();
                        ((l7q)c2.O0).put((Object)s, (Object)null);
                        final q3z m0 = this.K0.M0;
                        Objects.requireNonNull((ca7)this.c());
                        m0.b(System.currentTimeMillis());
                        if (n2 == 503 || n2 == 429) {
                            final q3z k0 = this.K0.K0;
                            Objects.requireNonNull((ca7)this.c());
                            k0.b(System.currentTimeMillis());
                        }
                        this.D();
                    }
                    else {
                        List list;
                        if (map != null) {
                            list = map.get("Last-Modified");
                        }
                        else {
                            list = null;
                        }
                        String s2;
                        if (list != null && !list.isEmpty()) {
                            s2 = (String)list.get(0);
                        }
                        else {
                            s2 = null;
                        }
                        dvz.c();
                        String s3 = null;
                        Label_0474: {
                            if (this.K().t(null, fzy.I0)) {
                                List list2;
                                if (map != null) {
                                    list2 = map.get("ETag");
                                }
                                else {
                                    list2 = null;
                                }
                                if (list2 != null && !list2.isEmpty()) {
                                    s3 = (String)list2.get(0);
                                    break Label_0474;
                                }
                            }
                            s3 = null;
                        }
                        if (n2 != 404 && n2 != 304) {
                            final r6z c3 = this.C0;
                            I((lmz)c3);
                            c3.A(s, array2, s2, s3);
                        }
                        else {
                            final r6z c4 = this.C0;
                            I((lmz)c4);
                            if (c4.q(s) == null) {
                                final r6z c5 = this.C0;
                                I((lmz)c5);
                                c5.A(s, (byte[])null, (String)null, (String)null);
                            }
                        }
                        Objects.requireNonNull((ca7)this.c());
                        c.j(System.currentTimeMillis());
                        final jdy e4 = this.E0;
                        I((lmz)e4);
                        e4.m(c);
                        if (n2 == 404) {
                            this.b().M0.b("Config not found. Using empty config. appId", (Object)s);
                        }
                        else {
                            this.b().P0.c("Successfully fetched config. Got network response. code, size", (Object)n2, (Object)value);
                        }
                        final y2z d0 = this.D0;
                        I((lmz)d0);
                        if (d0.k() && this.F()) {
                            this.u();
                        }
                        else {
                            this.D();
                        }
                    }
                    final jdy e5 = this.E0;
                    I((lmz)e5);
                    e5.l();
                }
                finally {
                    final jdy e6 = this.E0;
                    I((lmz)e6);
                    e6.P();
                }
            }
            finally {
                this.U0 = false;
                this.B();
            }
        }
    }
    
    public final void m(final hwz hwz) {
        this.a().g();
        this.g();
        Objects.requireNonNull(hwz, "null reference");
        xd.q(hwz.C0);
        if (H(hwz)) {
            final jdy e0 = this.E0;
            I((lmz)e0);
            final kaz c = e0.C(hwz.C0);
            if (c != null && TextUtils.isEmpty((CharSequence)c.R()) && !TextUtils.isEmpty((CharSequence)hwz.D0)) {
                c.j(0L);
                final jdy e2 = this.E0;
                I((lmz)e2);
                e2.m(c);
                final r6z c2 = this.C0;
                I((lmz)c2);
                final String c3 = hwz.C0;
                ((abz)c2).g();
                ((l7q)c2.J0).remove((Object)c3);
            }
            if (!hwz.J0) {
                this.J(hwz);
                return;
            }
            long n;
            if ((n = hwz.O0) == 0L) {
                Objects.requireNonNull((ca7)this.c());
                n = System.currentTimeMillis();
            }
            final pey q = this.N0.q();
            ((abz)q).g();
            q.H0 = null;
            q.I0 = 0L;
            int p;
            final int n2 = p = hwz.P0;
            if (n2 != 0 && (p = n2) != 1) {
                this.b().K0.c("Incorrect app type, assuming installed app. appId, appType", b2z.s(hwz.C0), (Object)n2);
                p = 0;
            }
            final jdy e3 = this.E0;
            I((lmz)e3);
            e3.O();
            try {
                final jdy e4 = this.E0;
                I((lmz)e4);
                final poz h = e4.H(hwz.C0, "_npa");
                if (h == null || "auto".equals(h.b)) {
                    final Boolean t0 = hwz.T0;
                    if (t0 != null) {
                        long n3;
                        if (!t0) {
                            n3 = 0L;
                        }
                        else {
                            n3 = 1L;
                        }
                        final koz koz = new koz("_npa", n, n3, "auto");
                        if (h == null || !h.e.equals(koz.F0)) {
                            this.t(koz, hwz);
                        }
                    }
                    else if (h != null) {
                        this.o(new koz("_npa", n, null, "auto"), hwz);
                    }
                }
                final jdy e5 = this.E0;
                I((lmz)e5);
                final String c4 = hwz.C0;
                Objects.requireNonNull(c4, "null reference");
                final kaz c5 = e5.C(c4);
                kaz kaz;
                if (c5 != null) {
                    kaz = c5;
                    if (this.Q().Z(hwz.D0, c5.R(), hwz.S0, c5.K())) {
                        this.b().K0.b("New GMP App Id passed in. Removing cached database data. appId", b2z.s(c5.M()));
                        final jdy e6 = this.E0;
                        I((lmz)e6);
                        final String m = c5.M();
                        ((lmz)e6).h();
                        ((abz)e6).g();
                        xd.q(m);
                        try {
                            final SQLiteDatabase a = e6.A();
                            final String[] array = { m };
                            final int n4 = a.delete("events", "app_id=?", array) + a.delete("user_attributes", "app_id=?", array) + a.delete("conditional_properties", "app_id=?", array) + a.delete("apps", "app_id=?", array) + a.delete("raw_events", "app_id=?", array) + a.delete("raw_events_metadata", "app_id=?", array) + a.delete("event_filters", "app_id=?", array) + a.delete("property_filters", "app_id=?", array) + a.delete("audience_filter_values", "app_id=?", array) + a.delete("consent_settings", "app_id=?", array);
                            if (n4 > 0) {
                                ((abz)e6).C0.b().P0.c("Deleted application data. app, records", (Object)m, (Object)n4);
                            }
                        }
                        catch (final SQLiteException ex) {
                            ((abz)e6).C0.b().H0.c("Error deleting application data. appId, error", b2z.s(m), (Object)ex);
                        }
                        kaz = null;
                    }
                }
                else {
                    kaz = c5;
                }
                if (kaz != null) {
                    final boolean b = kaz.B() != -2147483648L && kaz.B() != hwz.L0;
                    final String p2 = kaz.P();
                    if ((kaz.B() == -2147483648L && p2 != null && !p2.equals(hwz.E0)) | b) {
                        final Bundle bundle = new Bundle();
                        ((BaseBundle)bundle).putString("_pv", p2);
                        this.i(new hgy("_au", new vfy(bundle), "auto", n), hwz);
                    }
                }
                this.J(hwz);
                hfy hfy;
                boolean b2;
                if (p == 0) {
                    final jdy e7 = this.E0;
                    I((lmz)e7);
                    hfy = e7.G(hwz.C0, "_f");
                    b2 = false;
                }
                else {
                    final jdy e8 = this.E0;
                    I((lmz)e8);
                    hfy = e8.G(hwz.C0, "_v");
                    b2 = true;
                }
                if (hfy == null) {
                    final long n5 = (n / 3600000L + 1L) * 3600000L;
                    if (!b2) {
                        this.t(new koz("_fot", n, n5, "auto"), hwz);
                        this.a().g();
                        final r4z m2 = this.M0;
                        Objects.requireNonNull(m2, "null reference");
                        final String c6 = hwz.C0;
                        if (c6 != null && !c6.isEmpty()) {
                            m2.a.a().g();
                            if (!m2.a()) {
                                m2.a.b().N0.a("Install Referrer Reporter is not available");
                            }
                            else {
                                final n4z n4z = new n4z(m2, c6);
                                m2.a.a().g();
                                final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                final PackageManager packageManager = m2.a.C0.getPackageManager();
                                if (packageManager == null) {
                                    m2.a.b().L0.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                }
                                else {
                                    final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                        final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            final String packageName = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(packageName) && m2.a()) {
                                                final Intent intent2 = new Intent(intent);
                                                try {
                                                    final boolean a2 = sh6.b().a(m2.a.C0, intent2, (ServiceConnection)n4z, 1);
                                                    final x0z p3 = m2.a.b().P0;
                                                    String s;
                                                    if (!a2) {
                                                        s = "not available";
                                                    }
                                                    else {
                                                        s = "available";
                                                    }
                                                    p3.b("Install Referrer Service is", (Object)s);
                                                }
                                                catch (final RuntimeException ex2) {
                                                    m2.a.b().H0.b("Exception occurred while binding to Install Referrer Service", (Object)ex2.getMessage());
                                                }
                                            }
                                            else {
                                                m2.a.b().K0.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                    else {
                                        m2.a.b().N0.a("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                }
                            }
                        }
                        else {
                            m2.a.b().L0.a("Install Referrer Reporter was called with invalid app package name");
                        }
                        this.a().g();
                        this.g();
                        final Bundle bundle2 = new Bundle();
                        ((BaseBundle)bundle2).putLong("_c", 1L);
                        ((BaseBundle)bundle2).putLong("_r", 1L);
                        ((BaseBundle)bundle2).putLong("_uwa", 0L);
                        ((BaseBundle)bundle2).putLong("_pfo", 0L);
                        ((BaseBundle)bundle2).putLong("_sys", 0L);
                        ((BaseBundle)bundle2).putLong("_sysu", 0L);
                        ((BaseBundle)bundle2).putLong("_et", 1L);
                        if (hwz.R0) {
                            ((BaseBundle)bundle2).putLong("_dac", 1L);
                        }
                        final String c7 = hwz.C0;
                        Objects.requireNonNull(c7, "null reference");
                        final jdy e9 = this.E0;
                        I((lmz)e9);
                        xd.q(c7);
                        ((abz)e9).g();
                        ((lmz)e9).h();
                        long y = e9.y(c7);
                        long n6;
                        if (this.N0.C0.getPackageManager() == null) {
                            this.b().H0.b("PackageManager is null, first open report might be inaccurate. appId", b2z.s(c7));
                            n6 = y;
                        }
                        else {
                            PackageInfo b3;
                            try {
                                b3 = ntx.a(this.N0.C0).b(c7, 0);
                            }
                            catch (final PackageManager$NameNotFoundException ex3) {
                                this.b().H0.c("Package info is null, first open report might be inaccurate. appId", b2z.s(c7), (Object)ex3);
                                b3 = null;
                            }
                            if (b3 != null) {
                                final long firstInstallTime = b3.firstInstallTime;
                                if (firstInstallTime != 0L) {
                                    boolean b4;
                                    if (firstInstallTime != b3.lastUpdateTime) {
                                        long n7;
                                        if (this.K().t(null, fzy.d0)) {
                                            n7 = y;
                                            if (y == 0L) {
                                                ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                                n7 = 0L;
                                            }
                                        }
                                        else {
                                            ((BaseBundle)bundle2).putLong("_uwa", 1L);
                                            n7 = y;
                                        }
                                        b4 = false;
                                        y = n7;
                                    }
                                    else {
                                        b4 = true;
                                    }
                                    long n8;
                                    if (!b4) {
                                        n8 = 0L;
                                    }
                                    else {
                                        n8 = 1L;
                                    }
                                    this.t(new koz("_fi", n, n8, "auto"), hwz);
                                }
                            }
                            ApplicationInfo a3;
                            try {
                                a3 = ntx.a(this.N0.C0).a(c7, 0);
                            }
                            catch (final PackageManager$NameNotFoundException ex4) {
                                this.b().H0.c("Application info is null, first open report might be inaccurate. appId", b2z.s(c7), (Object)ex4);
                                a3 = null;
                            }
                            n6 = y;
                            if (a3 != null) {
                                if ((a3.flags & 0x1) != 0x0) {
                                    ((BaseBundle)bundle2).putLong("_sys", 1L);
                                }
                                n6 = y;
                                if ((a3.flags & 0x80) != 0x0) {
                                    ((BaseBundle)bundle2).putLong("_sysu", 1L);
                                    n6 = y;
                                }
                            }
                        }
                        if (n6 >= 0L) {
                            ((BaseBundle)bundle2).putLong("_pfo", n6);
                        }
                        this.k(new hgy("_f", new vfy(bundle2), "auto", n), hwz);
                    }
                    else {
                        this.t(new koz("_fvt", n, n5, "auto"), hwz);
                        this.a().g();
                        this.g();
                        final Bundle bundle3 = new Bundle();
                        ((BaseBundle)bundle3).putLong("_c", 1L);
                        ((BaseBundle)bundle3).putLong("_r", 1L);
                        ((BaseBundle)bundle3).putLong("_et", 1L);
                        if (hwz.R0) {
                            ((BaseBundle)bundle3).putLong("_dac", 1L);
                        }
                        this.k(new hgy("_v", new vfy(bundle3), "auto", n), hwz);
                    }
                }
                else if (hwz.K0) {
                    this.k(new hgy("_cd", new vfy(new Bundle()), "auto", n), hwz);
                }
                final jdy e10 = this.E0;
                I((lmz)e10);
                e10.l();
            }
            finally {
                final jdy e11 = this.E0;
                I((lmz)e11);
                e11.P();
            }
        }
    }
    
    public final void n(final aay aay, final hwz hwz) {
        Objects.requireNonNull(aay, "null reference");
        xd.q(aay.C0);
        xd.t((Object)aay.E0);
        xd.q(aay.E0.D0);
        this.a().g();
        this.g();
        if (!H(hwz)) {
            return;
        }
        if (hwz.J0) {
            final jdy e0 = this.E0;
            I((lmz)e0);
            e0.O();
            try {
                this.J(hwz);
                final String c0 = aay.C0;
                Objects.requireNonNull(c0, "null reference");
                final jdy e2 = this.E0;
                I((lmz)e2);
                final aay d = e2.D(c0, aay.E0.D0);
                if (d != null) {
                    this.b().O0.c("Removing conditional user property", (Object)aay.C0, (Object)this.N0.O0.f(aay.E0.D0));
                    final jdy e3 = this.E0;
                    I((lmz)e3);
                    e3.v(c0, aay.E0.D0);
                    if (d.G0) {
                        final jdy e4 = this.E0;
                        I((lmz)e4);
                        e4.k(c0, aay.E0.D0);
                    }
                    final hgy m0 = aay.M0;
                    if (m0 != null) {
                        final vfy d2 = m0.D0;
                        Bundle r;
                        if (d2 != null) {
                            r = d2.r();
                        }
                        else {
                            r = null;
                        }
                        final xoz q = this.Q();
                        final hgy m2 = aay.M0;
                        Objects.requireNonNull(m2, "null reference");
                        final hgy s0 = q.s0(c0, m2.C0, r, d.D0, aay.M0.F0, true);
                        Objects.requireNonNull(s0, "null reference");
                        this.v(s0, hwz);
                    }
                }
                else {
                    this.b().K0.c("Conditional user property doesn't exist", b2z.s(aay.C0), (Object)this.N0.O0.f(aay.E0.D0));
                }
                final jdy e5 = this.E0;
                I((lmz)e5);
                e5.l();
                return;
            }
            finally {
                final jdy e6 = this.E0;
                I((lmz)e6);
                e6.P();
            }
        }
        this.J(hwz);
    }
    
    public final void o(final koz koz, final hwz hwz) {
        this.a().g();
        this.g();
        if (!H(hwz)) {
            return;
        }
        if (!hwz.J0) {
            this.J(hwz);
            return;
        }
        if ("_npa".equals(koz.D0) && hwz.T0 != null) {
            this.b().O0.a("Falling back to manifest metadata value for ad personalization");
            Objects.requireNonNull((ca7)this.c());
            final long currentTimeMillis = System.currentTimeMillis();
            long n;
            if (!hwz.T0) {
                n = 0L;
            }
            else {
                n = 1L;
            }
            this.t(new koz("_npa", currentTimeMillis, n, "auto"), hwz);
            return;
        }
        this.b().O0.b("Removing user property", (Object)this.N0.O0.f(koz.D0));
        final jdy e0 = this.E0;
        I((lmz)e0);
        e0.O();
        try {
            this.J(hwz);
            trz.c();
            if (this.N0.I0.t(null, fzy.l0) && this.N0.I0.t(null, fzy.n0) && "_id".equals(koz.D0)) {
                final jdy e2 = this.E0;
                I((lmz)e2);
                final String c0 = hwz.C0;
                Objects.requireNonNull(c0, "null reference");
                e2.k(c0, "_lair");
            }
            final jdy e3 = this.E0;
            I((lmz)e3);
            final String c2 = hwz.C0;
            Objects.requireNonNull(c2, "null reference");
            e3.k(c2, koz.D0);
            final jdy e4 = this.E0;
            I((lmz)e4);
            e4.l();
            this.b().O0.b("User property removed", (Object)this.N0.O0.f(koz.D0));
        }
        finally {
            final jdy e5 = this.E0;
            I((lmz)e5);
            e5.P();
        }
    }
    
    public final void p(final hwz hwz) {
        if (this.Z0 != null) {
            (this.a1 = new ArrayList()).addAll(this.Z0);
        }
        final jdy e0 = this.E0;
        I((lmz)e0);
        final String c0 = hwz.C0;
        Objects.requireNonNull(c0, "null reference");
        xd.q(c0);
        ((abz)e0).g();
        ((lmz)e0).h();
        try {
            final SQLiteDatabase a = e0.A();
            final String[] array = { c0 };
            final int n = a.delete("apps", "app_id=?", array) + a.delete("events", "app_id=?", array) + a.delete("user_attributes", "app_id=?", array) + a.delete("conditional_properties", "app_id=?", array) + a.delete("raw_events", "app_id=?", array) + a.delete("raw_events_metadata", "app_id=?", array) + a.delete("queue", "app_id=?", array) + a.delete("audience_filter_values", "app_id=?", array) + a.delete("main_event_params", "app_id=?", array) + a.delete("default_event_params", "app_id=?", array);
            if (n > 0) {
                ((abz)e0).C0.b().P0.c("Reset analytics data. app, records", (Object)c0, (Object)n);
            }
        }
        catch (final SQLiteException ex) {
            ((abz)e0).C0.b().H0.c("Error resetting analytics data. appId, error", b2z.s(c0), (Object)ex);
        }
        if (hwz.J0) {
            this.m(hwz);
        }
    }
    
    public final void q(final String f1, final egz e1) {
        this.a().g();
        final String f2 = this.f1;
        if (f2 != null && !f2.equals(f1) && e1 == null) {
            return;
        }
        this.f1 = f1;
        this.e1 = e1;
    }
    
    public final void r(aay aay, final hwz hwz) {
        Objects.requireNonNull(aay, "null reference");
        xd.q(aay.C0);
        xd.t((Object)aay.D0);
        xd.t((Object)aay.E0);
        xd.q(aay.E0.D0);
        this.a().g();
        this.g();
        if (!H(hwz)) {
            return;
        }
        if (!hwz.J0) {
            this.J(hwz);
            return;
        }
        aay = new aay(aay);
        boolean b = false;
        aay.G0 = false;
        final jdy e0 = this.E0;
        I((lmz)e0);
        e0.O();
        try {
            final jdy e2 = this.E0;
            I((lmz)e2);
            final String c0 = aay.C0;
            Objects.requireNonNull(c0, "null reference");
            final aay d = e2.D(c0, aay.E0.D0);
            if (d != null && !d.D0.equals(aay.D0)) {
                this.b().K0.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", (Object)this.N0.O0.f(aay.E0.D0), (Object)aay.D0, (Object)d.D0);
            }
            if (d != null && d.G0) {
                aay.D0 = d.D0;
                aay.F0 = d.F0;
                aay.J0 = d.J0;
                aay.H0 = d.H0;
                aay.K0 = d.K0;
                aay.G0 = true;
                final koz e3 = aay.E0;
                aay.E0 = new koz(e3.D0, d.E0.E0, e3.r(), d.E0.H0);
            }
            else if (TextUtils.isEmpty((CharSequence)aay.H0)) {
                final koz e4 = aay.E0;
                aay.E0 = new koz(e4.D0, aay.F0, e4.r(), aay.E0.H0);
                aay.G0 = true;
                b = true;
            }
            if (aay.G0) {
                final koz e5 = aay.E0;
                final String c2 = aay.C0;
                Objects.requireNonNull(c2, "null reference");
                final String d2 = aay.D0;
                final String d3 = e5.D0;
                final long e6 = e5.E0;
                final Object r = e5.r();
                Objects.requireNonNull(r, "null reference");
                final poz poz = new poz(c2, d2, d3, e6, r);
                final jdy e7 = this.E0;
                I((lmz)e7);
                if (e7.r(poz)) {
                    this.b().O0.d("User property updated immediately", (Object)aay.C0, (Object)this.N0.O0.f(poz.c), poz.e);
                }
                else {
                    this.b().H0.d("(2)Too many active user properties, ignoring", b2z.s(aay.C0), (Object)this.N0.O0.f(poz.c), poz.e);
                }
                if (b) {
                    final hgy k0 = aay.K0;
                    if (k0 != null) {
                        this.v(new hgy(k0, aay.F0), hwz);
                    }
                }
            }
            final jdy e8 = this.E0;
            I((lmz)e8);
            if (e8.q(aay)) {
                this.b().O0.d("Conditional property added", (Object)aay.C0, (Object)this.N0.O0.f(aay.E0.D0), aay.E0.r());
            }
            else {
                this.b().H0.d("Too many conditional properties, ignoring", b2z.s(aay.C0), (Object)this.N0.O0.f(aay.E0.D0), aay.E0.r());
            }
            final jdy e9 = this.E0;
            I((lmz)e9);
            e9.l();
        }
        finally {
            final jdy e10 = this.E0;
            I((lmz)e10);
            e10.P();
        }
    }
    
    public final void s(final String s, final zby zby) {
        this.a().g();
        this.g();
        this.c1.put(s, zby);
        final jdy e0 = this.E0;
        I((lmz)e0);
        Objects.requireNonNull(s, "null reference");
        ((abz)e0).g();
        ((lmz)e0).h();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("consent_state", zby.e());
        try {
            if (e0.A().insertWithOnConflict("consent_settings", (String)null, contentValues, 5) == -1L) {
                ((abz)e0).C0.b().H0.b("Failed to insert/update consent setting (got -1). appId", b2z.s(s));
            }
        }
        catch (final SQLiteException ex) {
            ((abz)e0).C0.b().H0.c("Error storing consent setting. appId, error", b2z.s(s), (Object)ex);
        }
    }
    
    public final void t(final koz koz, final hwz hwz) {
        this.a().g();
        this.g();
        if (!H(hwz)) {
            return;
        }
        if (!hwz.J0) {
            this.J(hwz);
            return;
        }
        final int k0 = this.Q().k0(koz.D0);
        if (k0 != 0) {
            final xoz q = this.Q();
            final String d0 = koz.D0;
            this.K();
            final String q2 = q.q(d0, 24, true);
            final String d2 = koz.D0;
            int length;
            if (d2 != null) {
                length = d2.length();
            }
            else {
                length = 0;
            }
            this.Q().A((uoz)this.g1, hwz.C0, k0, "_ev", q2, length);
            return;
        }
        final int g0 = this.Q().g0(koz.D0, koz.r());
        if (g0 != 0) {
            final xoz q3 = this.Q();
            final String d3 = koz.D0;
            this.K();
            final String q4 = q3.q(d3, 24, true);
            final Object r = koz.r();
            int length2;
            if (r != null && (r instanceof String || r instanceof CharSequence)) {
                length2 = r.toString().length();
            }
            else {
                length2 = 0;
            }
            this.Q().A((uoz)this.g1, hwz.C0, g0, "_ev", q4, length2);
            return;
        }
        final Object o = this.Q().o(koz.D0, koz.r());
        if (o == null) {
            return;
        }
        if ("_sid".equals(koz.D0)) {
            final long e0 = koz.E0;
            final String h0 = koz.H0;
            final String c0 = hwz.C0;
            Objects.requireNonNull(c0, "null reference");
            final jdy e2 = this.E0;
            I((lmz)e2);
            final poz h2 = e2.H(c0, "_sno");
            long n = 0L;
            Label_0436: {
                if (h2 != null) {
                    final Object e3 = h2.e;
                    if (e3 instanceof Long) {
                        n = (long)e3;
                        break Label_0436;
                    }
                }
                if (h2 != null) {
                    this.b().K0.b("Retrieved last session number from database does not contain a valid (long) value", h2.e);
                }
                final jdy e4 = this.E0;
                I((lmz)e4);
                final hfy g2 = e4.G(c0, "_s");
                if (g2 != null) {
                    n = g2.c;
                    this.b().P0.b("Backfill the session number. Last used session number", (Object)n);
                }
                else {
                    n = 0L;
                }
            }
            this.t(new koz("_sno", e0, n + 1L, h0), hwz);
        }
        final String c2 = hwz.C0;
        Objects.requireNonNull(c2, "null reference");
        final String h3 = koz.H0;
        Objects.requireNonNull(h3, "null reference");
        final poz poz = new poz(c2, h3, koz.D0, koz.E0, o);
        this.b().P0.c("Setting user property", (Object)this.N0.O0.f(poz.c), o);
        final jdy e5 = this.E0;
        I((lmz)e5);
        e5.O();
        try {
            trz.c();
            if (this.N0.I0.t(null, fzy.l0) && "_id".equals(poz.c)) {
                if (this.N0.I0.t(null, fzy.o0)) {
                    final jdy e6 = this.E0;
                    I((lmz)e6);
                    final poz h4 = e6.H(hwz.C0, "_id");
                    if (h4 != null && !poz.e.equals(h4.e)) {
                        final jdy e7 = this.E0;
                        I((lmz)e7);
                        e7.k(hwz.C0, "_lair");
                    }
                }
                else {
                    final jdy e8 = this.E0;
                    I((lmz)e8);
                    e8.k(hwz.C0, "_lair");
                }
            }
            this.J(hwz);
            final jdy e9 = this.E0;
            I((lmz)e9);
            final boolean r2 = e9.r(poz);
            final jdy e10 = this.E0;
            I((lmz)e10);
            e10.l();
            if (!r2) {
                this.b().H0.c("Too many unique user properties are set. Ignoring user property", (Object)this.N0.O0.f(poz.c), poz.e);
                this.Q().A((uoz)this.g1, hwz.C0, 9, (String)null, (String)null, 0);
            }
        }
        finally {
            final jdy e11 = this.E0;
            I((lmz)e11);
            e11.P();
        }
    }
    
    public final void u() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_1       
        //     4: aload_0        
        //     5: invokevirtual   boz.a:()Lo7z;
        //     8: invokevirtual   o7z.g:()V
        //    11: aload_0        
        //    12: invokevirtual   boz.g:()V
        //    15: aload_0        
        //    16: iconst_1       
        //    17: putfield        boz.W0:Z
        //    20: aload_0        
        //    21: getfield        boz.N0:Ly7z;
        //    24: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    27: pop            
        //    28: aload_0        
        //    29: getfield        boz.N0:Ly7z;
        //    32: invokevirtual   y7z.z:()Lskz;
        //    35: invokevirtual   skz.v:()Ljava/lang/Boolean;
        //    38: astore_2       
        //    39: aload_2        
        //    40: ifnonnull       64
        //    43: aload_0        
        //    44: invokevirtual   boz.b:()Lb2z;
        //    47: invokevirtual   b2z.q:()Lx0z;
        //    50: ldc_w           "Upload data called on the client side before use of service was decided"
        //    53: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //    56: aload_0        
        //    57: iconst_0       
        //    58: putfield        boz.W0:Z
        //    61: goto            2871
        //    64: aload_2        
        //    65: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    68: ifeq            92
        //    71: aload_0        
        //    72: invokevirtual   boz.b:()Lb2z;
        //    75: invokevirtual   b2z.o:()Lx0z;
        //    78: ldc_w           "Upload called in the client side when service should be used"
        //    81: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //    84: aload_0        
        //    85: iconst_0       
        //    86: putfield        boz.W0:Z
        //    89: goto            2871
        //    92: aload_0        
        //    93: getfield        boz.Q0:J
        //    96: lconst_0       
        //    97: lcmp           
        //    98: ifle            113
        //   101: aload_0        
        //   102: invokevirtual   boz.D:()V
        //   105: aload_0        
        //   106: iconst_0       
        //   107: putfield        boz.W0:Z
        //   110: goto            2871
        //   113: aload_0        
        //   114: invokevirtual   boz.a:()Lo7z;
        //   117: invokevirtual   o7z.g:()V
        //   120: aload_0        
        //   121: getfield        boz.Z0:Ljava/util/ArrayList;
        //   124: ifnull          148
        //   127: aload_0        
        //   128: invokevirtual   boz.b:()Lb2z;
        //   131: invokevirtual   b2z.p:()Lx0z;
        //   134: ldc_w           "Uploading requested multiple times"
        //   137: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //   140: aload_0        
        //   141: iconst_0       
        //   142: putfield        boz.W0:Z
        //   145: goto            2871
        //   148: aload_0        
        //   149: getfield        boz.D0:Ly2z;
        //   152: astore_2       
        //   153: aload_2        
        //   154: invokestatic    boz.I:(Llmz;)Llmz;
        //   157: pop            
        //   158: aload_2        
        //   159: invokevirtual   y2z.k:()Z
        //   162: ifne            190
        //   165: aload_0        
        //   166: invokevirtual   boz.b:()Lb2z;
        //   169: invokevirtual   b2z.p:()Lx0z;
        //   172: ldc_w           "Network not connected, ignoring upload request"
        //   175: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //   178: aload_0        
        //   179: invokevirtual   boz.D:()V
        //   182: aload_0        
        //   183: iconst_0       
        //   184: putfield        boz.W0:Z
        //   187: goto            2871
        //   190: aload_0        
        //   191: invokevirtual   boz.c:()Lli4;
        //   194: checkcast       Lca7;
        //   197: invokevirtual   ca7.f:()J
        //   200: lstore_3       
        //   201: aload_0        
        //   202: invokevirtual   boz.K:()Ljby;
        //   205: astore_2       
        //   206: getstatic       fzy.R:Lazy;
        //   209: astore          5
        //   211: aconst_null    
        //   212: astore          6
        //   214: aload_2        
        //   215: aconst_null    
        //   216: aload           5
        //   218: invokevirtual   jby.n:(Ljava/lang/String;Lazy;)I
        //   221: istore          7
        //   223: aload_0        
        //   224: invokevirtual   boz.K:()Ljby;
        //   227: pop            
        //   228: invokestatic    jby.A:()J
        //   231: lstore          8
        //   233: iconst_0       
        //   234: istore          10
        //   236: iload           10
        //   238: iload           7
        //   240: if_icmpge       260
        //   243: aload_0        
        //   244: lload_3        
        //   245: lload           8
        //   247: lsub           
        //   248: invokevirtual   boz.E:(J)Z
        //   251: ifeq            260
        //   254: iinc            10, 1
        //   257: goto            236
        //   260: aload_0        
        //   261: getfield        boz.K0:Lwkz;
        //   264: getfield        wkz.L0:Lq3z;
        //   267: invokevirtual   q3z.a:()J
        //   270: lstore          8
        //   272: lload           8
        //   274: lconst_0       
        //   275: lcmp           
        //   276: ifeq            302
        //   279: aload_0        
        //   280: invokevirtual   boz.b:()Lb2z;
        //   283: invokevirtual   b2z.n:()Lx0z;
        //   286: ldc_w           "Uploading events. Elapsed time since last upload attempt (ms)"
        //   289: lload_3        
        //   290: lload           8
        //   292: lsub           
        //   293: invokestatic    java/lang/Math.abs:(J)J
        //   296: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   299: invokevirtual   x0z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   302: aload_0        
        //   303: getfield        boz.E0:Ljdy;
        //   306: astore_2       
        //   307: aload_2        
        //   308: invokestatic    boz.I:(Llmz;)Llmz;
        //   311: pop            
        //   312: aload_2        
        //   313: invokevirtual   jdy.J:()Ljava/lang/String;
        //   316: astore          11
        //   318: aload           11
        //   320: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   323: istore          12
        //   325: ldc2_w          -1
        //   328: lstore          8
        //   330: iload           12
        //   332: ifne            2665
        //   335: aload_0        
        //   336: getfield        boz.b1:J
        //   339: ldc2_w          -1
        //   342: lcmp           
        //   343: ifne            486
        //   346: aload_0        
        //   347: getfield        boz.E0:Ljdy;
        //   350: astore          13
        //   352: aload           13
        //   354: invokestatic    boz.I:(Llmz;)Llmz;
        //   357: pop            
        //   358: aload           13
        //   360: invokevirtual   jdy.A:()Landroid/database/sqlite/SQLiteDatabase;
        //   363: ldc_w           "select rowid from raw_events order by rowid desc limit 1;"
        //   366: aconst_null    
        //   367: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   370: astore_2       
        //   371: aload_2        
        //   372: astore          6
        //   374: aload_2        
        //   375: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   380: ifne            386
        //   383: goto            451
        //   386: aload_2        
        //   387: astore          6
        //   389: aload_2        
        //   390: iconst_0       
        //   391: invokeinterface android/database/Cursor.getLong:(I)J
        //   396: lstore          14
        //   398: lload           14
        //   400: lstore          8
        //   402: goto            451
        //   405: astore          5
        //   407: goto            421
        //   410: astore_1       
        //   411: aload           6
        //   413: astore_2       
        //   414: goto            474
        //   417: astore          5
        //   419: aconst_null    
        //   420: astore_2       
        //   421: aload_2        
        //   422: astore          6
        //   424: aload           13
        //   426: getfield        abz.C0:Ly7z;
        //   429: invokevirtual   y7z.b:()Lb2z;
        //   432: invokevirtual   b2z.o:()Lx0z;
        //   435: ldc_w           "Error querying raw events"
        //   438: aload           5
        //   440: invokevirtual   x0z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   443: lload           8
        //   445: lstore          14
        //   447: aload_2        
        //   448: ifnull          461
        //   451: aload_2        
        //   452: invokeinterface android/database/Cursor.close:()V
        //   457: lload           8
        //   459: lstore          14
        //   461: aload_0        
        //   462: lload           14
        //   464: putfield        boz.b1:J
        //   467: goto            486
        //   470: astore_1       
        //   471: aload           6
        //   473: astore_2       
        //   474: aload_2        
        //   475: ifnull          484
        //   478: aload_2        
        //   479: invokeinterface android/database/Cursor.close:()V
        //   484: aload_1        
        //   485: athrow         
        //   486: aload_0        
        //   487: invokevirtual   boz.K:()Ljby;
        //   490: aload           11
        //   492: getstatic       fzy.h:Lazy;
        //   495: invokevirtual   jby.n:(Ljava/lang/String;Lazy;)I
        //   498: istore          10
        //   500: iconst_0       
        //   501: aload_0        
        //   502: invokevirtual   boz.K:()Ljby;
        //   505: aload           11
        //   507: getstatic       fzy.i:Lazy;
        //   510: invokevirtual   jby.n:(Ljava/lang/String;Lazy;)I
        //   513: invokestatic    java/lang/Math.max:(II)I
        //   516: istore          7
        //   518: aload_0        
        //   519: getfield        boz.E0:Ljdy;
        //   522: astore          16
        //   524: aload           16
        //   526: invokestatic    boz.I:(Llmz;)Llmz;
        //   529: pop            
        //   530: aload           16
        //   532: invokevirtual   abz.g:()V
        //   535: aload           16
        //   537: invokevirtual   lmz.h:()V
        //   540: iload           10
        //   542: ifle            551
        //   545: iconst_1       
        //   546: istore          12
        //   548: goto            554
        //   551: iconst_0       
        //   552: istore          12
        //   554: iload           12
        //   556: invokestatic    xd.k:(Z)V
        //   559: iload           7
        //   561: ifle            570
        //   564: iconst_1       
        //   565: istore          12
        //   567: goto            573
        //   570: iconst_0       
        //   571: istore          12
        //   573: iload           12
        //   575: invokestatic    xd.k:(Z)V
        //   578: aload           11
        //   580: invokestatic    xd.q:(Ljava/lang/String;)Ljava/lang/String;
        //   583: pop            
        //   584: aload           16
        //   586: invokevirtual   jdy.A:()Landroid/database/sqlite/SQLiteDatabase;
        //   589: ldc_w           "queue"
        //   592: iconst_3       
        //   593: anewarray       Ljava/lang/String;
        //   596: dup            
        //   597: iconst_0       
        //   598: ldc_w           "rowid"
        //   601: aastore        
        //   602: dup            
        //   603: iconst_1       
        //   604: ldc_w           "data"
        //   607: aastore        
        //   608: dup            
        //   609: iconst_2       
        //   610: ldc_w           "retry_count"
        //   613: aastore        
        //   614: ldc_w           "app_id=?"
        //   617: iconst_1       
        //   618: anewarray       Ljava/lang/String;
        //   621: dup            
        //   622: iconst_0       
        //   623: aload           11
        //   625: aastore        
        //   626: aconst_null    
        //   627: aconst_null    
        //   628: ldc_w           "rowid"
        //   631: iload           10
        //   633: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   636: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   639: astore          5
        //   641: aload_1        
        //   642: astore          6
        //   644: lload_3        
        //   645: lstore          8
        //   647: aload           5
        //   649: astore_2       
        //   650: aload           5
        //   652: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   657: ifne            689
        //   660: aload_1        
        //   661: astore          6
        //   663: lload_3        
        //   664: lstore          8
        //   666: aload           5
        //   668: astore_2       
        //   669: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   672: astore          13
        //   674: aload           5
        //   676: invokeinterface android/database/Cursor.close:()V
        //   681: aload_1        
        //   682: astore_2       
        //   683: aload           13
        //   685: astore_1       
        //   686: goto            1331
        //   689: aload_1        
        //   690: astore          6
        //   692: lload_3        
        //   693: lstore          8
        //   695: aload           5
        //   697: astore_2       
        //   698: new             Ljava/util/ArrayList;
        //   701: astore          13
        //   703: aload_1        
        //   704: astore          6
        //   706: lload_3        
        //   707: lstore          8
        //   709: aload           5
        //   711: astore_2       
        //   712: aload           13
        //   714: invokespecial   java/util/ArrayList.<init>:()V
        //   717: iconst_0       
        //   718: istore          10
        //   720: aload_1        
        //   721: astore          6
        //   723: lload_3        
        //   724: lstore          8
        //   726: aload           5
        //   728: astore_2       
        //   729: aload           5
        //   731: iconst_0       
        //   732: invokeinterface android/database/Cursor.getLong:(I)J
        //   737: lstore          14
        //   739: aload_1        
        //   740: astore          6
        //   742: lload_3        
        //   743: lstore          8
        //   745: aload           5
        //   747: astore_2       
        //   748: aload           5
        //   750: iconst_1       
        //   751: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   756: astore          17
        //   758: aload_1        
        //   759: astore          6
        //   761: lload_3        
        //   762: lstore          8
        //   764: aload           5
        //   766: astore_2       
        //   767: aload           16
        //   769: getfield        jmz.D0:Lboz;
        //   772: getfield        boz.I0:Lhoz;
        //   775: astore          18
        //   777: aload_1        
        //   778: astore          6
        //   780: lload_3        
        //   781: lstore          8
        //   783: aload           5
        //   785: astore_2       
        //   786: aload           18
        //   788: invokestatic    boz.I:(Llmz;)Llmz;
        //   791: pop            
        //   792: aload_1        
        //   793: astore          6
        //   795: lload_3        
        //   796: lstore          8
        //   798: aload           5
        //   800: astore_2       
        //   801: new             Ljava/io/ByteArrayInputStream;
        //   804: astore          19
        //   806: aload_1        
        //   807: astore          6
        //   809: lload_3        
        //   810: lstore          8
        //   812: aload           5
        //   814: astore_2       
        //   815: aload           19
        //   817: aload           17
        //   819: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   822: aload_1        
        //   823: astore          6
        //   825: lload_3        
        //   826: lstore          8
        //   828: aload           5
        //   830: astore_2       
        //   831: new             Ljava/util/zip/GZIPInputStream;
        //   834: astore          17
        //   836: aload_1        
        //   837: astore          6
        //   839: lload_3        
        //   840: lstore          8
        //   842: aload           5
        //   844: astore_2       
        //   845: aload           17
        //   847: aload           19
        //   849: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;)V
        //   852: lload_3        
        //   853: lstore          8
        //   855: aload           5
        //   857: astore_2       
        //   858: new             Ljava/io/ByteArrayOutputStream;
        //   861: astore          20
        //   863: aload           5
        //   865: astore_2       
        //   866: aload           20
        //   868: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   871: aload           5
        //   873: astore_2       
        //   874: sipush          1024
        //   877: newarray        B
        //   879: astore          21
        //   881: aload           17
        //   883: astore          6
        //   885: aload           5
        //   887: astore_2       
        //   888: aload           6
        //   890: aload           21
        //   892: invokevirtual   java/io/InputStream.read:([B)I
        //   895: istore          22
        //   897: iload           22
        //   899: ifgt            1078
        //   902: aload           5
        //   904: astore_2       
        //   905: aload           6
        //   907: invokevirtual   java/util/zip/GZIPInputStream.close:()V
        //   910: aload           5
        //   912: astore_2       
        //   913: aload           19
        //   915: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   918: aload           5
        //   920: astore_2       
        //   921: aload           20
        //   923: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   926: astore          6
        //   928: aload           5
        //   930: astore_2       
        //   931: aload           13
        //   933: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   936: ifne            960
        //   939: aload           5
        //   941: astore_2       
        //   942: aload           6
        //   944: arraylength    
        //   945: istore          22
        //   947: iload           22
        //   949: iload           10
        //   951: iadd           
        //   952: iload           7
        //   954: if_icmple       960
        //   957: goto            1220
        //   960: aload           5
        //   962: astore_2       
        //   963: invokestatic    w6z.F1:()Ls6z;
        //   966: aload           6
        //   968: invokestatic    hoz.B:(Lvnz;[B)Lvnz;
        //   971: checkcast       Ls6z;
        //   974: astore          17
        //   976: aload           5
        //   978: astore_2       
        //   979: aload           5
        //   981: iconst_2       
        //   982: invokeinterface android/database/Cursor.isNull:(I)Z
        //   987: ifne            1007
        //   990: aload           5
        //   992: astore_2       
        //   993: aload           17
        //   995: aload           5
        //   997: iconst_2       
        //   998: invokeinterface android/database/Cursor.getInt:(I)I
        //  1003: invokevirtual   s6z.S:(I)Ls6z;
        //  1006: pop            
        //  1007: aload           5
        //  1009: astore_2       
        //  1010: iload           10
        //  1012: aload           6
        //  1014: arraylength    
        //  1015: iadd           
        //  1016: istore          10
        //  1018: aload           5
        //  1020: astore_2       
        //  1021: aload           13
        //  1023: aload           17
        //  1025: invokevirtual   mjz.j:()Lokz;
        //  1028: checkcast       Lw6z;
        //  1031: lload           14
        //  1033: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1036: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //  1039: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1042: pop            
        //  1043: goto            1190
        //  1046: astore          6
        //  1048: aload           5
        //  1050: astore_2       
        //  1051: aload           16
        //  1053: getfield        abz.C0:Ly7z;
        //  1056: invokevirtual   y7z.b:()Lb2z;
        //  1059: invokevirtual   b2z.o:()Lx0z;
        //  1062: ldc_w           "Failed to merge queued bundle. appId"
        //  1065: aload           11
        //  1067: invokestatic    b2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //  1070: aload           6
        //  1072: invokevirtual   x0z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1075: goto            1190
        //  1078: aload           5
        //  1080: astore_2       
        //  1081: aload           20
        //  1083: aload           21
        //  1085: iconst_0       
        //  1086: iload           22
        //  1088: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //  1091: goto            885
        //  1094: astore          6
        //  1096: goto            1125
        //  1099: astore_2       
        //  1100: lload           8
        //  1102: lstore_3       
        //  1103: aload_2        
        //  1104: astore          13
        //  1106: aload_1        
        //  1107: astore          6
        //  1109: lload_3        
        //  1110: lstore          8
        //  1112: goto            1266
        //  1115: astore          6
        //  1117: goto            1096
        //  1120: astore          6
        //  1122: goto            1096
        //  1125: aload           5
        //  1127: astore_2       
        //  1128: aload           18
        //  1130: getfield        abz.C0:Ly7z;
        //  1133: invokevirtual   y7z.b:()Lb2z;
        //  1136: invokevirtual   b2z.o:()Lx0z;
        //  1139: ldc_w           "Failed to ungzip content"
        //  1142: aload           6
        //  1144: invokevirtual   x0z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1147: aload           5
        //  1149: astore_2       
        //  1150: aload           6
        //  1152: athrow         
        //  1153: astore          6
        //  1155: goto            1163
        //  1158: astore          6
        //  1160: goto            1155
        //  1163: aload           5
        //  1165: astore_2       
        //  1166: aload           16
        //  1168: getfield        abz.C0:Ly7z;
        //  1171: invokevirtual   y7z.b:()Lb2z;
        //  1174: invokevirtual   b2z.o:()Lx0z;
        //  1177: ldc_w           "Failed to unzip queued bundle. appId"
        //  1180: aload           11
        //  1182: invokestatic    b2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //  1185: aload           6
        //  1187: invokevirtual   x0z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1190: aload           5
        //  1192: astore_2       
        //  1193: aload           5
        //  1195: invokeinterface android/database/Cursor.moveToNext:()Z
        //  1200: istore          12
        //  1202: iload           12
        //  1204: ifeq            1220
        //  1207: iload           10
        //  1209: iload           7
        //  1211: if_icmple       1217
        //  1214: goto            1220
        //  1217: goto            720
        //  1220: aload_1        
        //  1221: astore_2       
        //  1222: aload           5
        //  1224: invokeinterface android/database/Cursor.close:()V
        //  1229: aload           13
        //  1231: astore_1       
        //  1232: goto            1331
        //  1235: astore_2       
        //  1236: goto            1103
        //  1239: astore_2       
        //  1240: aload           6
        //  1242: astore_1       
        //  1243: lload           8
        //  1245: lstore_3       
        //  1246: goto            1103
        //  1249: astore_1       
        //  1250: aconst_null    
        //  1251: astore_2       
        //  1252: goto            2653
        //  1255: astore          13
        //  1257: aconst_null    
        //  1258: astore          5
        //  1260: lload_3        
        //  1261: lstore          8
        //  1263: aload_1        
        //  1264: astore          6
        //  1266: aload           5
        //  1268: astore_2       
        //  1269: aload           16
        //  1271: getfield        abz.C0:Ly7z;
        //  1274: invokevirtual   y7z.b:()Lb2z;
        //  1277: invokevirtual   b2z.o:()Lx0z;
        //  1280: ldc_w           "Error querying bundles. appId"
        //  1283: aload           11
        //  1285: invokestatic    b2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //  1288: aload           13
        //  1290: invokevirtual   x0z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1293: aload           5
        //  1295: astore_2       
        //  1296: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //  1299: astore          13
        //  1301: aload           13
        //  1303: astore_1       
        //  1304: aload           6
        //  1306: astore_2       
        //  1307: lload           8
        //  1309: lstore_3       
        //  1310: aload           5
        //  1312: ifnull          1331
        //  1315: aload           5
        //  1317: invokeinterface android/database/Cursor.close:()V
        //  1322: lload           8
        //  1324: lstore_3       
        //  1325: aload           6
        //  1327: astore_2       
        //  1328: aload           13
        //  1330: astore_1       
        //  1331: aload_1        
        //  1332: invokeinterface java/util/List.isEmpty:()Z
        //  1337: ifne            2866
        //  1340: aload_1        
        //  1341: astore          6
        //  1343: aload_0        
        //  1344: aload           11
        //  1346: invokevirtual   boz.L:(Ljava/lang/String;)Lzby;
        //  1349: aload_2        
        //  1350: invokevirtual   zby.f:(Lqby;)Z
        //  1353: ifeq            1507
        //  1356: aload_1        
        //  1357: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1362: astore          5
        //  1364: aload           5
        //  1366: invokeinterface java/util/Iterator.hasNext:()Z
        //  1371: ifeq            1413
        //  1374: aload           5
        //  1376: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1381: checkcast       Landroid/util/Pair;
        //  1384: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1387: checkcast       Lw6z;
        //  1390: astore          6
        //  1392: aload           6
        //  1394: invokevirtual   w6z.C:()Ljava/lang/String;
        //  1397: invokevirtual   java/lang/String.isEmpty:()Z
        //  1400: ifne            1364
        //  1403: aload           6
        //  1405: invokevirtual   w6z.C:()Ljava/lang/String;
        //  1408: astore          5
        //  1410: goto            1416
        //  1413: aconst_null    
        //  1414: astore          5
        //  1416: aload_1        
        //  1417: astore          6
        //  1419: aload           5
        //  1421: ifnull          1507
        //  1424: iconst_0       
        //  1425: istore          10
        //  1427: aload_1        
        //  1428: astore          6
        //  1430: iload           10
        //  1432: aload_1        
        //  1433: invokeinterface java/util/List.size:()I
        //  1438: if_icmpge       1507
        //  1441: aload_1        
        //  1442: iload           10
        //  1444: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1449: checkcast       Landroid/util/Pair;
        //  1452: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1455: checkcast       Lw6z;
        //  1458: astore          6
        //  1460: aload           6
        //  1462: invokevirtual   w6z.C:()Ljava/lang/String;
        //  1465: invokevirtual   java/lang/String.isEmpty:()Z
        //  1468: ifeq            1474
        //  1471: goto            1501
        //  1474: aload           6
        //  1476: invokevirtual   w6z.C:()Ljava/lang/String;
        //  1479: aload           5
        //  1481: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1484: ifne            1501
        //  1487: aload_1        
        //  1488: iconst_0       
        //  1489: iload           10
        //  1491: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //  1496: astore          6
        //  1498: goto            1507
        //  1501: iinc            10, 1
        //  1504: goto            1427
        //  1507: invokestatic    o6z.s:()Lr5z;
        //  1510: astore          5
        //  1512: aload           6
        //  1514: invokeinterface java/util/List.size:()I
        //  1519: istore          22
        //  1521: new             Ljava/util/ArrayList;
        //  1524: astore          13
        //  1526: aload           13
        //  1528: aload           6
        //  1530: invokeinterface java/util/List.size:()I
        //  1535: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1538: aload_0        
        //  1539: invokevirtual   boz.K:()Ljby;
        //  1542: aload           11
        //  1544: invokevirtual   jby.u:(Ljava/lang/String;)Z
        //  1547: ifeq            1569
        //  1550: aload_0        
        //  1551: aload           11
        //  1553: invokevirtual   boz.L:(Ljava/lang/String;)Lzby;
        //  1556: aload_2        
        //  1557: invokevirtual   zby.f:(Lqby;)Z
        //  1560: ifeq            1569
        //  1563: iconst_1       
        //  1564: istore          10
        //  1566: goto            1572
        //  1569: iconst_0       
        //  1570: istore          10
        //  1572: aload_0        
        //  1573: aload           11
        //  1575: invokevirtual   boz.L:(Ljava/lang/String;)Lzby;
        //  1578: aload_2        
        //  1579: invokevirtual   zby.f:(Lqby;)Z
        //  1582: istore          23
        //  1584: aload_0        
        //  1585: aload           11
        //  1587: invokevirtual   boz.L:(Ljava/lang/String;)Lzby;
        //  1590: getstatic       qby.E0:Lqby;
        //  1593: invokevirtual   zby.f:(Lqby;)Z
        //  1596: istore          12
        //  1598: invokestatic    mvz.c:()V
        //  1601: aload_0        
        //  1602: invokevirtual   boz.K:()Ljby;
        //  1605: aconst_null    
        //  1606: getstatic       fzy.D0:Lazy;
        //  1609: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1612: istore          24
        //  1614: iconst_0       
        //  1615: istore          7
        //  1617: iload           7
        //  1619: iload           22
        //  1621: if_icmpge       2193
        //  1624: aload           6
        //  1626: iload           7
        //  1628: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1633: checkcast       Landroid/util/Pair;
        //  1636: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  1639: checkcast       Lw6z;
        //  1642: invokevirtual   okz.k:()Lmjz;
        //  1645: checkcast       Ls6z;
        //  1648: astore_2       
        //  1649: aload           13
        //  1651: aload           6
        //  1653: iload           7
        //  1655: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1660: checkcast       Landroid/util/Pair;
        //  1663: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  1666: checkcast       Ljava/lang/Long;
        //  1669: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1672: pop            
        //  1673: aload_0        
        //  1674: invokevirtual   boz.K:()Ljby;
        //  1677: invokevirtual   jby.p:()V
        //  1680: aload_2        
        //  1681: invokevirtual   s6z.Y:()Ls6z;
        //  1684: pop            
        //  1685: aload_2        
        //  1686: lload_3        
        //  1687: invokevirtual   s6z.X:(J)Ls6z;
        //  1690: pop            
        //  1691: aload_0        
        //  1692: getfield        boz.N0:Ly7z;
        //  1695: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1698: pop            
        //  1699: aload_2        
        //  1700: invokevirtual   s6z.T:()Ls6z;
        //  1703: pop            
        //  1704: iload           10
        //  1706: ifne            1714
        //  1709: aload_2        
        //  1710: invokevirtual   s6z.u0:()Ls6z;
        //  1713: pop            
        //  1714: iload           23
        //  1716: ifne            1729
        //  1719: aload_2        
        //  1720: invokevirtual   s6z.B0:()Ls6z;
        //  1723: pop            
        //  1724: aload_2        
        //  1725: invokevirtual   s6z.x0:()Ls6z;
        //  1728: pop            
        //  1729: iload           12
        //  1731: ifne            1739
        //  1734: aload_2        
        //  1735: invokevirtual   s6z.r0:()Ls6z;
        //  1738: pop            
        //  1739: invokestatic    dvz.c:()V
        //  1742: aload_0        
        //  1743: invokevirtual   boz.K:()Ljby;
        //  1746: aload           11
        //  1748: getstatic       fzy.y0:Lazy;
        //  1751: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1754: ifeq            1784
        //  1757: aload_0        
        //  1758: getfield        boz.C0:Lr6z;
        //  1761: astore_1       
        //  1762: aload_1        
        //  1763: invokestatic    boz.I:(Llmz;)Llmz;
        //  1766: pop            
        //  1767: aload_1        
        //  1768: aload           11
        //  1770: invokevirtual   r6z.s:(Ljava/lang/String;)Ljava/util/Set;
        //  1773: astore_1       
        //  1774: aload_1        
        //  1775: ifnull          1784
        //  1778: aload_2        
        //  1779: aload_1        
        //  1780: invokevirtual   s6z.n0:(Ljava/lang/Iterable;)Ls6z;
        //  1783: pop            
        //  1784: aload_0        
        //  1785: invokevirtual   boz.K:()Ljby;
        //  1788: aload           11
        //  1790: getstatic       fzy.A0:Lazy;
        //  1793: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1796: ifeq            1847
        //  1799: aload_0        
        //  1800: getfield        boz.C0:Lr6z;
        //  1803: astore_1       
        //  1804: aload_1        
        //  1805: invokestatic    boz.I:(Llmz;)Llmz;
        //  1808: pop            
        //  1809: aload_1        
        //  1810: aload           11
        //  1812: invokevirtual   r6z.C:(Ljava/lang/String;)Z
        //  1815: ifeq            1823
        //  1818: aload_2        
        //  1819: invokevirtual   s6z.t0:()Ls6z;
        //  1822: pop            
        //  1823: aload_0        
        //  1824: getfield        boz.C0:Lr6z;
        //  1827: astore_1       
        //  1828: aload_1        
        //  1829: invokestatic    boz.I:(Llmz;)Llmz;
        //  1832: pop            
        //  1833: aload_1        
        //  1834: aload           11
        //  1836: invokevirtual   r6z.F:(Ljava/lang/String;)Z
        //  1839: ifeq            1847
        //  1842: aload_2        
        //  1843: invokevirtual   s6z.y0:()Ls6z;
        //  1846: pop            
        //  1847: aload_0        
        //  1848: invokevirtual   boz.K:()Ljby;
        //  1851: aload           11
        //  1853: getstatic       fzy.B0:Lazy;
        //  1856: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1859: ifeq            1903
        //  1862: aload_0        
        //  1863: getfield        boz.C0:Lr6z;
        //  1866: astore_1       
        //  1867: aload_1        
        //  1868: invokestatic    boz.I:(Llmz;)Llmz;
        //  1871: pop            
        //  1872: aload_1        
        //  1873: aload           11
        //  1875: invokevirtual   r6z.G:(Ljava/lang/String;)Z
        //  1878: ifeq            1903
        //  1881: aload_2        
        //  1882: ldc_w           "_id"
        //  1885: invokestatic    hoz.u:(Ls6z;Ljava/lang/String;)I
        //  1888: istore          25
        //  1890: iload           25
        //  1892: iconst_m1      
        //  1893: if_icmpeq       1903
        //  1896: aload_2        
        //  1897: iload           25
        //  1899: invokevirtual   s6z.n:(I)Ls6z;
        //  1902: pop            
        //  1903: aload_0        
        //  1904: invokevirtual   boz.K:()Ljby;
        //  1907: aload           11
        //  1909: getstatic       fzy.C0:Lazy;
        //  1912: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1915: ifeq            1942
        //  1918: aload_0        
        //  1919: getfield        boz.C0:Lr6z;
        //  1922: astore_1       
        //  1923: aload_1        
        //  1924: invokestatic    boz.I:(Llmz;)Llmz;
        //  1927: pop            
        //  1928: aload_1        
        //  1929: aload           11
        //  1931: invokevirtual   r6z.E:(Ljava/lang/String;)Z
        //  1934: ifeq            1942
        //  1937: aload_2        
        //  1938: invokevirtual   s6z.u0:()Ls6z;
        //  1941: pop            
        //  1942: aload_0        
        //  1943: invokevirtual   boz.K:()Ljby;
        //  1946: aload           11
        //  1948: getstatic       fzy.F0:Lazy;
        //  1951: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1954: ifeq            2082
        //  1957: aload_0        
        //  1958: getfield        boz.C0:Lr6z;
        //  1961: astore_1       
        //  1962: aload_1        
        //  1963: invokestatic    boz.I:(Llmz;)Llmz;
        //  1966: pop            
        //  1967: aload_1        
        //  1968: aload           11
        //  1970: invokevirtual   r6z.B:(Ljava/lang/String;)Z
        //  1973: ifeq            2082
        //  1976: aload_2        
        //  1977: invokevirtual   s6z.r0:()Ls6z;
        //  1980: pop            
        //  1981: aload_0        
        //  1982: invokevirtual   boz.K:()Ljby;
        //  1985: aload           11
        //  1987: getstatic       fzy.G0:Lazy;
        //  1990: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  1993: ifeq            2082
        //  1996: aload_0        
        //  1997: getfield        boz.d1:Ljava/util/HashMap;
        //  2000: aload           11
        //  2002: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2005: checkcast       Lznz;
        //  2008: astore_1       
        //  2009: aload_1        
        //  2010: ifnull          2050
        //  2013: aload_1        
        //  2014: getfield        znz.b:J
        //  2017: aload_0        
        //  2018: invokevirtual   boz.K:()Ljby;
        //  2021: aload           11
        //  2023: getstatic       fzy.T:Lazy;
        //  2026: invokevirtual   jby.q:(Ljava/lang/String;Lazy;)J
        //  2029: ladd           
        //  2030: aload_0        
        //  2031: invokevirtual   boz.c:()Lli4;
        //  2034: checkcast       Lca7;
        //  2037: invokevirtual   ca7.g:()J
        //  2040: lcmp           
        //  2041: ifge            2047
        //  2044: goto            2050
        //  2047: goto            2070
        //  2050: new             Lznz;
        //  2053: astore_1       
        //  2054: aload_1        
        //  2055: aload_0        
        //  2056: invokespecial   znz.<init>:(Lboz;)V
        //  2059: aload_0        
        //  2060: getfield        boz.d1:Ljava/util/HashMap;
        //  2063: aload           11
        //  2065: aload_1        
        //  2066: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  2069: pop            
        //  2070: aload_2        
        //  2071: aload_1        
        //  2072: getfield        znz.a:Ljava/lang/String;
        //  2075: invokevirtual   s6z.E:(Ljava/lang/String;)Ls6z;
        //  2078: pop            
        //  2079: goto            2082
        //  2082: aload_0        
        //  2083: invokevirtual   boz.K:()Ljby;
        //  2086: aload           11
        //  2088: getstatic       fzy.H0:Lazy;
        //  2091: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  2094: ifeq            2121
        //  2097: aload_0        
        //  2098: getfield        boz.C0:Lr6z;
        //  2101: astore_1       
        //  2102: aload_1        
        //  2103: invokestatic    boz.I:(Llmz;)Llmz;
        //  2106: pop            
        //  2107: aload_1        
        //  2108: aload           11
        //  2110: invokevirtual   r6z.D:(Ljava/lang/String;)Z
        //  2113: ifeq            2121
        //  2116: aload_2        
        //  2117: invokevirtual   s6z.C0:()Ls6z;
        //  2120: pop            
        //  2121: iload           24
        //  2123: ifne            2131
        //  2126: aload_2        
        //  2127: invokevirtual   s6z.C0:()Ls6z;
        //  2130: pop            
        //  2131: aload_0        
        //  2132: invokevirtual   boz.K:()Ljby;
        //  2135: aload           11
        //  2137: getstatic       fzy.V:Lazy;
        //  2140: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  2143: ifeq            2180
        //  2146: aload_2        
        //  2147: invokevirtual   mjz.j:()Lokz;
        //  2150: checkcast       Lw6z;
        //  2153: invokevirtual   ffz.i:()[B
        //  2156: astore_1       
        //  2157: aload_0        
        //  2158: getfield        boz.I0:Lhoz;
        //  2161: astore          17
        //  2163: aload           17
        //  2165: invokestatic    boz.I:(Llmz;)Llmz;
        //  2168: pop            
        //  2169: aload_2        
        //  2170: aload           17
        //  2172: aload_1        
        //  2173: invokevirtual   hoz.v:([B)J
        //  2176: invokevirtual   s6z.w:(J)Ls6z;
        //  2179: pop            
        //  2180: aload           5
        //  2182: aload_2        
        //  2183: invokevirtual   r5z.m:(Ls6z;)Lr5z;
        //  2186: pop            
        //  2187: iinc            7, 1
        //  2190: goto            1617
        //  2193: aload_0        
        //  2194: invokevirtual   boz.b:()Lb2z;
        //  2197: invokevirtual   b2z.v:()Ljava/lang/String;
        //  2200: iconst_2       
        //  2201: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //  2204: ifeq            2233
        //  2207: aload_0        
        //  2208: getfield        boz.I0:Lhoz;
        //  2211: astore_1       
        //  2212: aload_1        
        //  2213: invokestatic    boz.I:(Llmz;)Llmz;
        //  2216: pop            
        //  2217: aload_1        
        //  2218: aload           5
        //  2220: invokevirtual   mjz.j:()Lokz;
        //  2223: checkcast       Lo6z;
        //  2226: invokevirtual   hoz.C:(Lo6z;)Ljava/lang/String;
        //  2229: astore_2       
        //  2230: goto            2235
        //  2233: aconst_null    
        //  2234: astore_2       
        //  2235: aload_0        
        //  2236: getfield        boz.I0:Lhoz;
        //  2239: invokestatic    boz.I:(Llmz;)Llmz;
        //  2242: pop            
        //  2243: aload           5
        //  2245: invokevirtual   mjz.j:()Lokz;
        //  2248: checkcast       Lo6z;
        //  2251: invokevirtual   ffz.i:()[B
        //  2254: astore          17
        //  2256: aload_0        
        //  2257: getfield        boz.L0:Lfnz;
        //  2260: astore_1       
        //  2261: invokestatic    dvz.c:()V
        //  2264: aload_1        
        //  2265: getfield        abz.C0:Ly7z;
        //  2268: invokevirtual   y7z.p:()Ljby;
        //  2271: aload           11
        //  2273: getstatic       fzy.z0:Lazy;
        //  2276: invokevirtual   jby.t:(Ljava/lang/String;Lazy;)Z
        //  2279: ifeq            2409
        //  2282: aload_1        
        //  2283: getfield        jmz.D0:Lboz;
        //  2286: getfield        boz.C0:Lr6z;
        //  2289: astore_1       
        //  2290: aload_1        
        //  2291: invokestatic    boz.I:(Llmz;)Llmz;
        //  2294: pop            
        //  2295: aload_1        
        //  2296: aload           11
        //  2298: invokevirtual   r6z.r:(Ljava/lang/String;)Ljava/lang/String;
        //  2301: astore          6
        //  2303: aload           6
        //  2305: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2308: ifne            2395
        //  2311: getstatic       fzy.r:Lazy;
        //  2314: aconst_null    
        //  2315: invokevirtual   azy.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2318: checkcast       Ljava/lang/String;
        //  2321: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //  2324: astore          16
        //  2326: aload           16
        //  2328: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //  2331: astore_1       
        //  2332: aload           16
        //  2334: invokevirtual   android/net/Uri.getAuthority:()Ljava/lang/String;
        //  2337: astore          18
        //  2339: new             Ljava/lang/StringBuilder;
        //  2342: astore          16
        //  2344: aload           16
        //  2346: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2349: aload           16
        //  2351: aload           6
        //  2353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2356: pop            
        //  2357: aload           16
        //  2359: ldc_w           "."
        //  2362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2365: pop            
        //  2366: aload           16
        //  2368: aload           18
        //  2370: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2373: pop            
        //  2374: aload_1        
        //  2375: aload           16
        //  2377: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2380: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  2383: pop            
        //  2384: aload_1        
        //  2385: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  2388: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  2391: astore_1       
        //  2392: goto            2420
        //  2395: getstatic       fzy.r:Lazy;
        //  2398: aconst_null    
        //  2399: invokevirtual   azy.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2402: checkcast       Ljava/lang/String;
        //  2405: astore_1       
        //  2406: goto            2420
        //  2409: getstatic       fzy.r:Lazy;
        //  2412: aconst_null    
        //  2413: invokevirtual   azy.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2416: checkcast       Ljava/lang/String;
        //  2419: astore_1       
        //  2420: new             Ljava/net/URL;
        //  2423: astore          16
        //  2425: aload           16
        //  2427: aload_1        
        //  2428: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //  2431: aload           13
        //  2433: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //  2436: iconst_1       
        //  2437: ixor           
        //  2438: invokestatic    xd.k:(Z)V
        //  2441: aload_0        
        //  2442: getfield        boz.Z0:Ljava/util/ArrayList;
        //  2445: ifnull          2464
        //  2448: aload_0        
        //  2449: invokevirtual   boz.b:()Lb2z;
        //  2452: invokevirtual   b2z.o:()Lx0z;
        //  2455: ldc_w           "Set uploading progress before finishing the previous upload"
        //  2458: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //  2461: goto            2482
        //  2464: new             Ljava/util/ArrayList;
        //  2467: astore          6
        //  2469: aload           6
        //  2471: aload           13
        //  2473: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //  2476: aload_0        
        //  2477: aload           6
        //  2479: putfield        boz.Z0:Ljava/util/ArrayList;
        //  2482: aload_0        
        //  2483: getfield        boz.K0:Lwkz;
        //  2486: getfield        wkz.M0:Lq3z;
        //  2489: lload_3        
        //  2490: invokevirtual   q3z.b:(J)V
        //  2493: ldc_w           "?"
        //  2496: astore          6
        //  2498: iload           22
        //  2500: ifle            2513
        //  2503: aload           5
        //  2505: invokevirtual   r5z.n:()Lw6z;
        //  2508: invokevirtual   w6z.J1:()Ljava/lang/String;
        //  2511: astore          6
        //  2513: aload_0        
        //  2514: invokevirtual   boz.b:()Lb2z;
        //  2517: invokevirtual   b2z.p:()Lx0z;
        //  2520: ldc_w           "Uploading data. app, uncompressed size, data"
        //  2523: aload           6
        //  2525: aload           17
        //  2527: arraylength    
        //  2528: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2531: aload_2        
        //  2532: invokevirtual   x0z.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //  2535: aload_0        
        //  2536: iconst_1       
        //  2537: putfield        boz.V0:Z
        //  2540: aload_0        
        //  2541: getfield        boz.D0:Ly2z;
        //  2544: astore_2       
        //  2545: aload_2        
        //  2546: invokestatic    boz.I:(Llmz;)Llmz;
        //  2549: pop            
        //  2550: new             Lv53;
        //  2553: astore          13
        //  2555: aload           13
        //  2557: aload_0        
        //  2558: aload           11
        //  2560: iconst_3       
        //  2561: invokespecial   v53.<init>:(Ljava/lang/Object;Ljava/lang/Object;I)V
        //  2564: aload_2        
        //  2565: invokevirtual   abz.g:()V
        //  2568: aload_2        
        //  2569: invokevirtual   lmz.h:()V
        //  2572: aload           16
        //  2574: invokestatic    xd.t:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2577: pop            
        //  2578: aload           17
        //  2580: invokestatic    xd.t:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2583: pop            
        //  2584: aload           13
        //  2586: invokestatic    xd.t:(Ljava/lang/Object;)Ljava/lang/Object;
        //  2589: pop            
        //  2590: aload_2        
        //  2591: getfield        abz.C0:Ly7z;
        //  2594: invokevirtual   y7z.a:()Lo7z;
        //  2597: astore          5
        //  2599: new             Lu2z;
        //  2602: astore          6
        //  2604: aload           6
        //  2606: aload_2        
        //  2607: aload           11
        //  2609: aload           16
        //  2611: aload           17
        //  2613: aconst_null    
        //  2614: aload           13
        //  2616: invokespecial   u2z.<init>:(Ly2z;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;Lj2z;)V
        //  2619: aload           5
        //  2621: aload           6
        //  2623: invokevirtual   o7z.p:(Ljava/lang/Runnable;)V
        //  2626: goto            2866
        //  2629: astore_2       
        //  2630: aload_0        
        //  2631: invokevirtual   boz.b:()Lb2z;
        //  2634: invokevirtual   b2z.o:()Lx0z;
        //  2637: ldc_w           "Failed to parse upload URL. Not uploading. appId"
        //  2640: aload           11
        //  2642: invokestatic    b2z.s:(Ljava/lang/String;)Ljava/lang/Object;
        //  2645: aload_1        
        //  2646: invokevirtual   x0z.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  2649: goto            2866
        //  2652: astore_1       
        //  2653: aload_2        
        //  2654: ifnull          2663
        //  2657: aload_2        
        //  2658: invokeinterface android/database/Cursor.close:()V
        //  2663: aload_1        
        //  2664: athrow         
        //  2665: aload_0        
        //  2666: ldc2_w          -1
        //  2669: putfield        boz.b1:J
        //  2672: aload_0        
        //  2673: getfield        boz.E0:Ljdy;
        //  2676: astore          5
        //  2678: aload           5
        //  2680: invokestatic    boz.I:(Llmz;)Llmz;
        //  2683: pop            
        //  2684: aload_0        
        //  2685: invokevirtual   boz.K:()Ljby;
        //  2688: pop            
        //  2689: invokestatic    jby.A:()J
        //  2692: lstore          8
        //  2694: aload           5
        //  2696: invokevirtual   abz.g:()V
        //  2699: aload           5
        //  2701: invokevirtual   lmz.h:()V
        //  2704: aload           5
        //  2706: invokevirtual   jdy.A:()Landroid/database/sqlite/SQLiteDatabase;
        //  2709: ldc_w           "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
        //  2712: iconst_1       
        //  2713: anewarray       Ljava/lang/String;
        //  2716: dup            
        //  2717: iconst_0       
        //  2718: lload_3        
        //  2719: lload           8
        //  2721: lsub           
        //  2722: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  2725: aastore        
        //  2726: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //  2729: astore_1       
        //  2730: aload_1        
        //  2731: astore_2       
        //  2732: aload_1        
        //  2733: invokeinterface android/database/Cursor.moveToFirst:()Z
        //  2738: ifne            2763
        //  2741: aload_1        
        //  2742: astore_2       
        //  2743: aload           5
        //  2745: getfield        abz.C0:Ly7z;
        //  2748: invokevirtual   y7z.b:()Lb2z;
        //  2751: invokevirtual   b2z.p:()Lx0z;
        //  2754: ldc_w           "No expired configs for apps with pending events"
        //  2757: invokevirtual   x0z.a:(Ljava/lang/String;)V
        //  2760: goto            2826
        //  2763: aload_1        
        //  2764: astore_2       
        //  2765: aload_1        
        //  2766: iconst_0       
        //  2767: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //  2772: astore          6
        //  2774: aload_1        
        //  2775: invokeinterface android/database/Cursor.close:()V
        //  2780: aload           6
        //  2782: astore_1       
        //  2783: goto            2834
        //  2786: astore          6
        //  2788: goto            2801
        //  2791: astore_1       
        //  2792: aconst_null    
        //  2793: astore_2       
        //  2794: goto            2877
        //  2797: astore          6
        //  2799: aconst_null    
        //  2800: astore_1       
        //  2801: aload_1        
        //  2802: astore_2       
        //  2803: aload           5
        //  2805: getfield        abz.C0:Ly7z;
        //  2808: invokevirtual   y7z.b:()Lb2z;
        //  2811: invokevirtual   b2z.o:()Lx0z;
        //  2814: ldc_w           "Error selecting expired configs"
        //  2817: aload           6
        //  2819: invokevirtual   x0z.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  2822: aload_1        
        //  2823: ifnull          2832
        //  2826: aload_1        
        //  2827: invokeinterface android/database/Cursor.close:()V
        //  2832: aconst_null    
        //  2833: astore_1       
        //  2834: aload_1        
        //  2835: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2838: ifne            2866
        //  2841: aload_0        
        //  2842: getfield        boz.E0:Ljdy;
        //  2845: astore_2       
        //  2846: aload_2        
        //  2847: invokestatic    boz.I:(Llmz;)Llmz;
        //  2850: pop            
        //  2851: aload_2        
        //  2852: aload_1        
        //  2853: invokevirtual   jdy.C:(Ljava/lang/String;)Lkaz;
        //  2856: astore_1       
        //  2857: aload_1        
        //  2858: ifnull          2866
        //  2861: aload_0        
        //  2862: aload_1        
        //  2863: invokevirtual   boz.h:(Lkaz;)V
        //  2866: aload_0        
        //  2867: iconst_0       
        //  2868: putfield        boz.W0:Z
        //  2871: aload_0        
        //  2872: invokevirtual   boz.B:()V
        //  2875: return         
        //  2876: astore_1       
        //  2877: aload_2        
        //  2878: ifnull          2887
        //  2881: aload_2        
        //  2882: invokeinterface android/database/Cursor.close:()V
        //  2887: aload_1        
        //  2888: athrow         
        //  2889: astore_1       
        //  2890: aload_0        
        //  2891: iconst_0       
        //  2892: putfield        boz.W0:Z
        //  2895: aload_0        
        //  2896: invokevirtual   boz.B:()V
        //  2899: aload_1        
        //  2900: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     39     2889   2901   Any
        //  43     56     2889   2901   Any
        //  64     84     2889   2901   Any
        //  92     105    2889   2901   Any
        //  113    140    2889   2901   Any
        //  148    182    2889   2901   Any
        //  190    211    2889   2901   Any
        //  214    233    2889   2901   Any
        //  243    254    2889   2901   Any
        //  260    272    2889   2901   Any
        //  279    302    2889   2901   Any
        //  302    325    2889   2901   Any
        //  335    358    2889   2901   Any
        //  358    371    417    421    Landroid/database/sqlite/SQLiteException;
        //  358    371    410    417    Any
        //  374    383    405    410    Landroid/database/sqlite/SQLiteException;
        //  374    383    470    474    Any
        //  389    398    405    410    Landroid/database/sqlite/SQLiteException;
        //  389    398    470    474    Any
        //  424    443    470    474    Any
        //  451    457    2889   2901   Any
        //  461    467    2889   2901   Any
        //  478    484    2889   2901   Any
        //  484    486    2889   2901   Any
        //  486    540    2889   2901   Any
        //  554    559    2889   2901   Any
        //  573    584    2889   2901   Any
        //  584    641    1255   1266   Landroid/database/sqlite/SQLiteException;
        //  584    641    1249   1255   Any
        //  650    660    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  650    660    2652   2653   Any
        //  669    674    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  669    674    2652   2653   Any
        //  674    681    2889   2901   Any
        //  698    703    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  698    703    2652   2653   Any
        //  712    717    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  712    717    2652   2653   Any
        //  729    739    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  729    739    2652   2653   Any
        //  748    758    1158   1163   Ljava/io/IOException;
        //  748    758    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  748    758    2652   2653   Any
        //  767    777    1158   1163   Ljava/io/IOException;
        //  767    777    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  767    777    2652   2653   Any
        //  786    792    1158   1163   Ljava/io/IOException;
        //  786    792    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  786    792    2652   2653   Any
        //  801    806    1120   1125   Ljava/io/IOException;
        //  801    806    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  801    806    2652   2653   Any
        //  815    822    1120   1125   Ljava/io/IOException;
        //  815    822    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  815    822    2652   2653   Any
        //  831    836    1120   1125   Ljava/io/IOException;
        //  831    836    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  831    836    2652   2653   Any
        //  845    852    1120   1125   Ljava/io/IOException;
        //  845    852    1239   1249   Landroid/database/sqlite/SQLiteException;
        //  845    852    2652   2653   Any
        //  858    863    1115   1120   Ljava/io/IOException;
        //  858    863    1099   1103   Landroid/database/sqlite/SQLiteException;
        //  858    863    2652   2653   Any
        //  866    871    1115   1120   Ljava/io/IOException;
        //  866    871    1099   1103   Landroid/database/sqlite/SQLiteException;
        //  866    871    2652   2653   Any
        //  874    881    1115   1120   Ljava/io/IOException;
        //  874    881    1099   1103   Landroid/database/sqlite/SQLiteException;
        //  874    881    2652   2653   Any
        //  888    897    1094   1096   Ljava/io/IOException;
        //  888    897    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  888    897    2652   2653   Any
        //  905    910    1094   1096   Ljava/io/IOException;
        //  905    910    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  905    910    2652   2653   Any
        //  913    918    1094   1096   Ljava/io/IOException;
        //  913    918    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  913    918    2652   2653   Any
        //  921    928    1094   1096   Ljava/io/IOException;
        //  921    928    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  921    928    2652   2653   Any
        //  931    939    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  931    939    2652   2653   Any
        //  942    947    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  942    947    2652   2653   Any
        //  963    976    1046   1078   Ljava/io/IOException;
        //  963    976    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  963    976    2652   2653   Any
        //  979    990    1235   1239   Landroid/database/sqlite/SQLiteException;
        //  979    990    2652   2653   Any
        //  993    1007   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  993    1007   2652   2653   Any
        //  1010   1018   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1010   1018   2652   2653   Any
        //  1021   1043   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1021   1043   2652   2653   Any
        //  1051   1075   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1051   1075   2652   2653   Any
        //  1081   1091   1094   1096   Ljava/io/IOException;
        //  1081   1091   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1081   1091   2652   2653   Any
        //  1128   1147   1153   1155   Ljava/io/IOException;
        //  1128   1147   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1128   1147   2652   2653   Any
        //  1150   1153   1153   1155   Ljava/io/IOException;
        //  1150   1153   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1150   1153   2652   2653   Any
        //  1166   1190   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1166   1190   2652   2653   Any
        //  1193   1202   1235   1239   Landroid/database/sqlite/SQLiteException;
        //  1193   1202   2652   2653   Any
        //  1222   1229   2889   2901   Any
        //  1269   1293   2652   2653   Any
        //  1296   1301   2652   2653   Any
        //  1315   1322   2889   2901   Any
        //  1331   1340   2889   2901   Any
        //  1343   1364   2889   2901   Any
        //  1364   1410   2889   2901   Any
        //  1430   1471   2889   2901   Any
        //  1474   1498   2889   2901   Any
        //  1507   1563   2889   2901   Any
        //  1572   1614   2889   2901   Any
        //  1624   1704   2889   2901   Any
        //  1709   1714   2889   2901   Any
        //  1719   1729   2889   2901   Any
        //  1734   1739   2889   2901   Any
        //  1739   1774   2889   2901   Any
        //  1778   1784   2889   2901   Any
        //  1784   1823   2889   2901   Any
        //  1823   1847   2889   2901   Any
        //  1847   1890   2889   2901   Any
        //  1896   1903   2889   2901   Any
        //  1903   1942   2889   2901   Any
        //  1942   2009   2889   2901   Any
        //  2013   2044   2889   2901   Any
        //  2050   2070   2889   2901   Any
        //  2070   2079   2889   2901   Any
        //  2082   2121   2889   2901   Any
        //  2126   2131   2889   2901   Any
        //  2131   2180   2889   2901   Any
        //  2180   2187   2889   2901   Any
        //  2193   2230   2889   2901   Any
        //  2235   2392   2889   2901   Any
        //  2395   2406   2889   2901   Any
        //  2409   2420   2889   2901   Any
        //  2420   2461   2629   2652   Ljava/net/MalformedURLException;
        //  2420   2461   2889   2901   Any
        //  2464   2482   2629   2652   Ljava/net/MalformedURLException;
        //  2464   2482   2889   2901   Any
        //  2482   2493   2629   2652   Ljava/net/MalformedURLException;
        //  2482   2493   2889   2901   Any
        //  2503   2513   2629   2652   Ljava/net/MalformedURLException;
        //  2503   2513   2889   2901   Any
        //  2513   2626   2629   2652   Ljava/net/MalformedURLException;
        //  2513   2626   2889   2901   Any
        //  2630   2649   2889   2901   Any
        //  2657   2663   2889   2901   Any
        //  2663   2665   2889   2901   Any
        //  2665   2704   2889   2901   Any
        //  2704   2730   2797   2801   Landroid/database/sqlite/SQLiteException;
        //  2704   2730   2791   2797   Any
        //  2732   2741   2786   2791   Landroid/database/sqlite/SQLiteException;
        //  2732   2741   2876   2877   Any
        //  2743   2760   2786   2791   Landroid/database/sqlite/SQLiteException;
        //  2743   2760   2876   2877   Any
        //  2765   2774   2786   2791   Landroid/database/sqlite/SQLiteException;
        //  2765   2774   2876   2877   Any
        //  2774   2780   2889   2901   Any
        //  2803   2822   2876   2877   Any
        //  2826   2832   2889   2901   Any
        //  2834   2857   2889   2901   Any
        //  2861   2866   2889   2901   Any
        //  2881   2887   2889   2901   Any
        //  2887   2889   2889   2901   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0386:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void v(hgy ex, hwz e0) {
        xd.t((Object)e0);
        xd.q(e0.C0);
        final long nanoTime = System.nanoTime();
        this.a().g();
        this.g();
        final String c0 = e0.C0;
        I((lmz)this.I0);
        if (!hoz.k((hgy)ex, e0)) {
            return;
        }
        if (e0.J0) {
            final r6z c2 = this.C0;
            I((lmz)c2);
            if (c2.y(c0, ((hgy)ex).C0)) {
                this.b().q().c("Dropping blocked event. appId", b2z.s(c0), (Object)this.N0.t().d(((hgy)ex).C0));
                final r6z c3 = this.C0;
                I((lmz)c3);
                if (!c3.v(c0)) {
                    final r6z c4 = this.C0;
                    I((lmz)c4);
                    if (!c4.z(c0)) {
                        if (!"_err".equals(((hgy)ex).C0)) {
                            this.Q().A((uoz)this.g1, c0, 11, "_ev", ((hgy)ex).C0, 0);
                        }
                        return;
                    }
                }
                final jdy e2 = this.E0;
                I((lmz)e2);
                final kaz c5 = e2.C(c0);
                if (c5 != null) {
                    final long abs = Math.abs(((ca7)this.c()).f() - Math.max(c5.F(), c5.C()));
                    this.K();
                    if (abs > (long)fzy.A.a((Object)null)) {
                        this.b().n().a("Fetching config for blocked app");
                        this.h(c5);
                    }
                }
                return;
            }
            final f2z b = f2z.b((hgy)ex);
            this.Q().z(b, this.K().m(c0));
            final hgy a = b.a();
            if (Log.isLoggable(this.b().v(), 2)) {
                this.b().p().b("Logging event", (Object)this.N0.t().c(a));
            }
            final jdy e3 = this.E0;
            I((lmz)e3);
            e3.O();
            try {
                this.J(e0);
                trz.c();
                if (!this.K().t(null, fzy.l0) && this.K().t(null, fzy.m0)) {
                    final jdy e4 = this.E0;
                    I((lmz)e4);
                    e4.k(e0.C0, "_lair");
                }
                boolean b2 = "ecommerce_purchase".equals(a.C0) || "purchase".equals(a.C0) || "refund".equals(a.C0);
                String s = null;
                Label_1060: {
                    if (!"_iap".equals(a.C0)) {
                        if (!b2) {
                            s = "_err";
                            break Label_1060;
                        }
                        b2 = true;
                    }
                    final String v = a.D0.v("currency");
                    long n3;
                    if (b2) {
                        double n = a.D0.s() * 1000000.0;
                        if (n == 0.0) {
                            n = a.D0.t() * 1000000.0;
                        }
                        if (n > 9.223372036854776E18 || n < -9.223372036854776E18) {
                            this.b().q().c("Data lost. Currency value is too big. appId", b2z.s(c0), (Object)n);
                            final jdy e5 = this.E0;
                            I((lmz)e5);
                            e5.l();
                            return;
                        }
                        final long n2 = n3 = Math.round(n);
                        if ("refund".equals(a.C0)) {
                            n3 = -n2;
                        }
                    }
                    else {
                        n3 = a.D0.t();
                    }
                    if (!TextUtils.isEmpty((CharSequence)v)) {
                        final String upperCase = v.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            ex = (SQLiteException)"_ltv_".concat(upperCase);
                            final jdy e6 = this.E0;
                            I((lmz)e6);
                            final poz h = e6.H(c0, (String)ex);
                            while (true) {
                                Label_0828: {
                                    if (h == null) {
                                        break Label_0828;
                                    }
                                    final Object e7 = h.e;
                                    if (!(e7 instanceof Long)) {
                                        break Label_0828;
                                    }
                                    final poz poz = new poz(c0, a.E0, (String)ex, ((ca7)this.c()).f(), (long)e7 + n3);
                                    final String s2 = "_err";
                                    final jdy e8 = this.E0;
                                    I((lmz)e8);
                                    s = s2;
                                    if (!e8.r(poz)) {
                                        this.b().o().d("Too many unique user properties are set. Ignoring user property. appId", b2z.s(c0), (Object)this.N0.t().f(poz.c), poz.e);
                                        this.Q().A((uoz)this.g1, c0, 9, (String)null, (String)null, 0);
                                        s = s2;
                                    }
                                    break Label_1060;
                                }
                                final jdy e9 = this.E0;
                                I((lmz)e9);
                                final int n4 = this.K().n(c0, fzy.F);
                                xd.q(c0);
                                ((abz)e9).g();
                                ((lmz)e9).h();
                                try {
                                    e9.A().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", (Object[])new String[] { c0, c0, String.valueOf(n4 - 1) });
                                }
                                catch (final SQLiteException ex2) {
                                    ((abz)e9).C0.b().o().c("Error pruning currencies. appId", b2z.s(c0), (Object)ex2);
                                }
                                final poz poz = new poz(c0, a.E0, (String)ex, ((ca7)this.c()).f(), n3);
                                continue;
                            }
                        }
                    }
                    s = "_err";
                }
                final boolean w = xoz.W(a.C0);
                final boolean equals = s.equals(a.C0);
                this.Q();
                final vfy d0 = a.D0;
                long n5;
                if (d0 == null) {
                    n5 = 0L;
                }
                else {
                    final Iterator iterator = ((BaseBundle)d0.C0).keySet().iterator();
                    long n6 = 0L;
                    while (true) {
                        n5 = n6;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final Object u = d0.u((String)iterator.next());
                        if (!(u instanceof Parcelable[])) {
                            continue;
                        }
                        n6 += ((Parcelable[])u).length;
                    }
                }
                final jdy e10 = this.E0;
                I((lmz)e10);
                final pcy f = e10.F(this.x(), c0, n5 + 1L, true, w, false, equals, false);
                final long b3 = f.b;
                this.K();
                final long n7 = b3 - (int)fzy.l.a((Object)null);
                if (n7 > 0L) {
                    if (n7 % 1000L == 1L) {
                        this.b().o().c("Data loss. Too many events logged. appId, count", b2z.s(c0), (Object)f.b);
                    }
                    final jdy e11 = this.E0;
                    I((lmz)e11);
                    e11.l();
                    return;
                }
                if (w) {
                    final long a2 = f.a;
                    this.K();
                    final long n8 = a2 - (int)fzy.n.a((Object)null);
                    if (n8 > 0L) {
                        if (n8 % 1000L == 1L) {
                            this.b().o().c("Data loss. Too many public events logged. appId, count", b2z.s(c0), (Object)f.a);
                        }
                        this.Q().A((uoz)this.g1, c0, 16, "_ev", a.C0, 0);
                        final jdy e12 = this.E0;
                        I((lmz)e12);
                        e12.l();
                        return;
                    }
                }
                if (equals) {
                    final long n9 = f.d - Math.max(0, Math.min(1000000, this.K().n(e0.C0, fzy.m)));
                    if (n9 > 0L) {
                        if (n9 == 1L) {
                            this.b().o().c("Too many error events logged. appId, count", b2z.s(c0), (Object)f.d);
                        }
                        final jdy e13 = this.E0;
                        I((lmz)e13);
                        e13.l();
                        return;
                    }
                }
                final Bundle r = a.D0.r();
                this.Q().B(r, "_o", (Object)a.E0);
                if (this.Q().S(c0)) {
                    final xoz q = this.Q();
                    final Long value = 1L;
                    q.B(r, "_dbg", (Object)value);
                    this.Q().B(r, "_r", (Object)value);
                }
                if ("_s".equals(a.C0)) {
                    final jdy e14 = this.E0;
                    I((lmz)e14);
                    final poz h2 = e14.H(e0.C0, "_sno");
                    if (h2 != null && h2.e instanceof Long) {
                        this.Q().B(r, "_sno", h2.e);
                    }
                }
                final jdy e15 = this.E0;
                I((lmz)e15);
                xd.q(c0);
                ((abz)e15).g();
                ((lmz)e15).h();
                long n10 = 0L;
                Label_1821: {
                    try {
                        ex = (SQLiteException)e15.A();
                        final int min = Math.min(1000000, ((abz)e15).C0.p().n(c0, fzy.q));
                        try {
                            n10 = ((SQLiteDatabase)ex).delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[] { c0, String.valueOf(Math.max(0, min)) });
                            break Label_1821;
                        }
                        catch (final SQLiteException ex3) {}
                    }
                    catch (final SQLiteException ex) {}
                    ((abz)e15).C0.b().o().c("Error deleting over the limit events. appId", b2z.s(c0), (Object)ex);
                    n10 = 0L;
                }
                if (n10 > 0L) {
                    this.b().q().c("Data lost. Too many events stored on disk, deleted. appId", b2z.s(c0), (Object)n10);
                }
                ex = new(yey.class)();
                final y7z n11 = this.N0;
                final String e16 = a.E0;
                final String c6 = a.C0;
                final long f2 = a.F0;
                final int n12 = 0;
                new yey(n11, e16, c0, c6, f2, r);
                final jdy e17 = this.E0;
                I((lmz)e17);
                final hfy g = e17.G(c0, ((yey)ex).b);
                hfy c7;
                if (g == null) {
                    final jdy e18 = this.E0;
                    I((lmz)e18);
                    if (e18.z(c0) >= this.K().k(c0) && w) {
                        this.b().o().d("Too many event names used, ignoring event. appId, name, supported count", b2z.s(c0), (Object)this.N0.t().d(((yey)ex).b), (Object)this.K().k(c0));
                        this.Q().A((uoz)this.g1, c0, 8, (String)null, (String)null, 0);
                        return;
                    }
                    c7 = new hfy(c0, ((yey)ex).b, 0L, 0L, 0L, ((yey)ex).d, 0L, (Long)null, (Long)null, (Long)null, (Boolean)null);
                }
                else {
                    ex = (SQLiteException)((yey)ex).a(this.N0, g.f);
                    c7 = g.c(((yey)ex).d);
                }
                final jdy e19 = this.E0;
                I((lmz)e19);
                e19.n(c7);
                this.a().g();
                this.g();
                xd.t((Object)ex);
                xd.t((Object)e0);
                xd.q(((yey)ex).a);
                xd.k(((yey)ex).a.equals(e0.C0));
                final s6z f3 = w6z.F1();
                f3.Q();
                f3.N();
                if (!TextUtils.isEmpty((CharSequence)e0.C0)) {
                    f3.q(e0.C0);
                }
                if (!TextUtils.isEmpty((CharSequence)e0.F0)) {
                    f3.s(e0.F0);
                }
                if (!TextUtils.isEmpty((CharSequence)e0.E0)) {
                    f3.t(e0.E0);
                }
                mvz.c();
                if (this.K().t(null, fzy.D0) && !TextUtils.isEmpty((CharSequence)e0.Z0)) {
                    f3.U(e0.Z0);
                }
                final long l0 = e0.L0;
                if (l0 != -2147483648L) {
                    f3.u((int)l0);
                }
                f3.I(e0.G0);
                if (!TextUtils.isEmpty((CharSequence)e0.D0)) {
                    f3.H(e0.D0);
                }
                final String c8 = e0.C0;
                xd.t((Object)c8);
                f3.y(this.L(c8).c(zby.b(e0.X0)).e());
                if (f3.d0().isEmpty() && !TextUtils.isEmpty((CharSequence)e0.S0)) {
                    f3.o(e0.S0);
                }
                final long h3 = e0.H0;
                if (h3 != 0L) {
                    f3.z(h3);
                }
                f3.C(e0.U0);
                final hoz i0 = this.I0;
                I((lmz)i0);
                final Map b4 = fzy.b(((jmz)i0).D0.N0.e());
                Iterable iterable = null;
                Label_2669: {
                    if (b4 != null) {
                        if (!b4.isEmpty()) {
                            final ArrayList list = new ArrayList();
                            final int intValue = (int)fzy.Q.a((Object)null);
                            for (final Map.Entry<String, V> entry : b4.entrySet()) {
                                if (entry.getKey().startsWith("measurement.id.")) {
                                    try {
                                        final int int1 = Integer.parseInt((String)entry.getValue());
                                        if (int1 == 0) {
                                            continue;
                                        }
                                        list.add(int1);
                                        if (list.size() < intValue) {
                                            continue;
                                        }
                                        ((abz)i0).C0.b().q().b("Too many experiment IDs. Number of IDs", (Object)list.size());
                                    }
                                    catch (final NumberFormatException ex4) {
                                        ((abz)i0).C0.b().q().b("Experiment ID NumberFormatException", (Object)ex4);
                                        continue;
                                    }
                                    break;
                                }
                            }
                            iterable = list;
                            if (!list.isEmpty()) {
                                break Label_2669;
                            }
                        }
                    }
                    iterable = null;
                }
                if (iterable != null) {
                    f3.m0(iterable);
                }
                final String c9 = e0.C0;
                xd.t((Object)c9);
                final zby c10 = this.L(c9).c(zby.b(e0.X0));
                final qby d2 = qby.D0;
                if (c10.f(d2)) {
                    final Pair j = this.K0.l(e0.C0, c10);
                    if (!TextUtils.isEmpty((CharSequence)j.first) && e0.Q0) {
                        f3.R((String)j.first);
                        final Object second = j.second;
                        if (second != null) {
                            f3.K((boolean)second);
                        }
                    }
                }
                this.N0.q().j();
                final String model = Build.MODEL;
                f3.A();
                this.N0.q().j();
                final String release = Build$VERSION.RELEASE;
                f3.L();
                f3.W((int)this.N0.q().o());
                f3.a0(this.N0.q().p());
                final jby k = this.K();
                final azy h4 = fzy.h0;
                if (!k.t(null, h4)) {
                    f3.p(e0.N0);
                }
                if (this.N0.h()) {
                    f3.c0();
                    if (!TextUtils.isEmpty((CharSequence)null)) {
                        f3.B();
                        throw null;
                    }
                }
                final jdy e20 = this.E0;
                I((lmz)e20);
                kaz c11;
                if ((c11 = e20.C(e0.C0)) == null) {
                    c11 = new kaz(this.N0, e0.C0);
                    c11.f(this.R(c10));
                    c11.n(e0.M0);
                    c11.o(e0.D0);
                    if (c10.f(d2)) {
                        c11.w(this.K0.m(e0.C0));
                    }
                    c11.t(0L);
                    c11.u(0L);
                    c11.s(0L);
                    c11.h(e0.E0);
                    c11.i(e0.L0);
                    c11.g(e0.F0);
                    c11.p(e0.G0);
                    c11.k(e0.H0);
                    c11.v(e0.J0);
                    if (!this.K().t(null, h4)) {
                        c11.e(e0.N0);
                    }
                    c11.l(e0.U0);
                    final jdy e21 = this.E0;
                    I((lmz)e21);
                    e21.m(c11);
                }
                if (c10.f(qby.E0) && !TextUtils.isEmpty((CharSequence)c11.N())) {
                    final String n13 = c11.N();
                    xd.t((Object)n13);
                    f3.r(n13);
                }
                if (!TextUtils.isEmpty((CharSequence)c11.Q())) {
                    final String q2 = c11.Q();
                    xd.t((Object)q2);
                    f3.G(q2);
                }
                final jdy e22 = this.E0;
                I((lmz)e22);
                final List m = e22.M(e0.C0);
                for (int n14 = 0; n14 < m.size(); ++n14) {
                    final z7z v2 = d8z.v();
                    v2.n(m.get(n14).c);
                    v2.o(m.get(n14).d);
                    final hoz i2 = this.I0;
                    I((lmz)i2);
                    i2.I(v2, m.get(n14).e);
                    f3.p0(v2);
                }
                Label_3946: {
                    try {
                        Object o = this.E0;
                        I((lmz)o);
                        e0 = (hwz)((mjz)f3).j();
                        ((abz)o).g();
                        ((lmz)o).h();
                        xd.t((Object)e0);
                        xd.q(((w6z)e0).J1());
                        final byte[] i3 = ((ffz)e0).i();
                        final hoz i4 = ((jmz)o).D0.I0;
                        I((lmz)i4);
                        final long v3 = i4.v(i3);
                        final ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", ((w6z)e0).J1());
                        contentValues.put("metadata_fingerprint", Long.valueOf(v3));
                        contentValues.put("metadata", i3);
                        try {
                            final SQLiteDatabase a3 = ((jdy)o).A();
                            try {
                                try {
                                    a3.insertWithOnConflict("raw_events_metadata", (String)null, contentValues, 4);
                                    e0 = (hwz)this.E0;
                                    I((lmz)e0);
                                    o = ((BaseBundle)((yey)ex).f.C0).keySet().iterator();
                                Label_3671:
                                    while (true) {
                                        while (true) {
                                            while (((Iterator)o).hasNext()) {
                                                if ("_r".equals(((Iterator<Object>)o).next())) {
                                                    final int n15 = 1;
                                                    ((abz)e0).g();
                                                    ((lmz)e0).h();
                                                    xd.t((Object)ex);
                                                    xd.q(((yey)ex).a);
                                                    o = ((jmz)e0).D0.I0;
                                                    I((lmz)o);
                                                    final byte[] i5 = ((ffz)((hoz)o).A((yey)ex)).i();
                                                    o = new ContentValues();
                                                    ((ContentValues)o).put("app_id", ((yey)ex).a);
                                                    ((ContentValues)o).put("name", ((yey)ex).b);
                                                    ((ContentValues)o).put("timestamp", Long.valueOf(((yey)ex).d));
                                                    ((ContentValues)o).put("metadata_fingerprint", Long.valueOf(v3));
                                                    ((ContentValues)o).put("data", i5);
                                                    ((ContentValues)o).put("realtime", Integer.valueOf(n15));
                                                    try {
                                                        if (((jdy)e0).A().insert("raw_events", (String)null, (ContentValues)o) == -1L) {
                                                            ((abz)e0).C0.b().o().b("Failed to insert raw event (got -1). appId", b2z.s(((yey)ex).a));
                                                        }
                                                        else {
                                                            this.Q0 = 0L;
                                                        }
                                                    }
                                                    catch (final SQLiteException o) {
                                                        ((abz)e0).C0.b().o().c("Error storing raw event. appId", b2z.s(((yey)ex).a), o);
                                                    }
                                                    break Label_3946;
                                                }
                                            }
                                            o = this.C0;
                                            I((lmz)o);
                                            final boolean x = ((r6z)o).x(((yey)ex).a, ((yey)ex).b);
                                            o = this.E0;
                                            I((lmz)o);
                                            o = ((jdy)o).E(this.x(), ((yey)ex).a, false, false);
                                            int n15 = n12;
                                            if (!x) {
                                                continue Label_3671;
                                            }
                                            n15 = n12;
                                            if (((pcy)o).e < this.K().n(((yey)ex).a, fzy.p)) {
                                                continue;
                                            }
                                            break;
                                        }
                                        continue Label_3671;
                                    }
                                }
                                catch (final IOException ex) {}
                            }
                            catch (final SQLiteException ex) {}
                        }
                        catch (final SQLiteException ex5) {}
                        ((abz)o).C0.b().o().c("Error storing raw event metadata. appId", b2z.s(((w6z)e0).J1()), (Object)ex);
                        throw ex;
                    }
                    catch (final IOException ex6) {}
                    this.b().o().c("Data loss. Failed to insert raw event metadata. appId", b2z.s(f3.c0()), (Object)ex);
                }
                final jdy e23 = this.E0;
                I((lmz)e23);
                e23.l();
                final jdy e24 = this.E0;
                I((lmz)e24);
                e24.P();
                this.D();
                this.b().p().b("Background event processing time, ms", (Object)((System.nanoTime() - nanoTime + 500000L) / 1000000L));
                return;
            }
            finally {
                final jdy e25 = this.E0;
                I((lmz)e25);
                e25.P();
            }
        }
        this.J(e0);
    }
    
    public final long x() {
        Objects.requireNonNull((ca7)this.c());
        final long currentTimeMillis = System.currentTimeMillis();
        final wkz k0 = this.K0;
        ((lmz)k0).h();
        ((abz)k0).g();
        long a;
        if ((a = k0.N0.a()) == 0L) {
            a = ((abz)k0).C0.B().s().nextInt(86400000) + 1L;
            k0.N0.b(a);
        }
        return (currentTimeMillis + a) / 1000L / 60L / 60L / 24L;
    }
    
    public final hwz z(final String s) {
        final jdy e0 = this.E0;
        I((lmz)e0);
        final kaz c = e0.C(s);
        if (c == null || TextUtils.isEmpty((CharSequence)c.P())) {
            this.b().O0.b("No app data available; dropping", (Object)s);
            return null;
        }
        final Boolean a = this.A(c);
        if (a != null && !a) {
            this.b().H0.b("App version does not match; dropping. appId", b2z.s(s));
            return null;
        }
        final String r = c.R();
        final String p = c.P();
        final long b = c.B();
        final String o = c.O();
        final long g = c.G();
        final long d = c.D();
        final boolean a2 = c.A();
        final String q = c.Q();
        final long r2 = c.r();
        final boolean z = c.z();
        final String k = c.K();
        c.a.a().g();
        return new hwz(s, r, p, b, o, g, d, (String)null, a2, false, q, r2, 0L, 0, z, false, k, c.s, c.E(), c.a(), this.L(s).e(), "", (String)null);
    }
}

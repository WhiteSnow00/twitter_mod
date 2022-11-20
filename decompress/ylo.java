import java.util.concurrent.Executor;
import android.os.RemoteException;
import java.util.Objects;
import android.os.Message;
import android.util.Log;
import android.os.Parcelable;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.content.Context;
import android.os.Bundle;
import java.util.regex.Pattern;
import android.app.PendingIntent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ylo
{
    public static int h;
    public static PendingIntent i;
    public static final Pattern j;
    public final d8q<String, zbs<Bundle>> a;
    public final Context b;
    public final wyz c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger e;
    public Messenger f;
    public psy g;
    
    static {
        j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public ylo(final Context b) {
        this.a = new d8q<String, zbs<Bundle>>();
        this.b = b;
        this.c = new wyz(b);
        this.e = new Messenger((Handler)new day(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        d.setKeepAliveTime(60L, TimeUnit.SECONDS);
        d.allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    public final ubs<Bundle> a(final Bundle bundle) {
        synchronized (ylo.class) {
            final int h = ylo.h;
            ylo.h = h + 1;
            final String string = Integer.toString(h);
            monitorexit(ylo.class);
            final zbs zbs = new zbs();
            Object a = this.a;
            synchronized (a) {
                this.a.put(string, (zbs<Bundle>)zbs);
                monitorexit(a);
                a = new Intent();
                ((Intent)a).setPackage("com.google.android.gms");
                if (this.c.a() == 2) {
                    ((Intent)a).setAction("com.google.iid.TOKEN_REQUEST");
                }
                else {
                    ((Intent)a).setAction("com.google.android.c2dm.intent.REGISTER");
                }
                ((Intent)a).putExtras(bundle);
                final Context b = this.b;
                synchronized (ylo.class) {
                    if (ylo.i == null) {
                        final Intent intent = new Intent();
                        intent.setPackage("com.google.example.invalidpackage");
                        ylo.i = PendingIntent.getBroadcast(b, 0, intent, o8y.a);
                    }
                    ((Intent)a).putExtra("app", (Parcelable)ylo.i);
                    monitorexit(ylo.class);
                    ((Intent)a).putExtra("kid", ta0.z(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
                    if (Log.isLoggable("Rpc", 3)) {
                        final String value = String.valueOf(((Intent)a).getExtras());
                        final StringBuilder sb = new StringBuilder(value.length() + 8);
                        sb.append("Sending ");
                        sb.append(value);
                        Log.d("Rpc", sb.toString());
                    }
                    ((Intent)a).putExtra("google.messenger", (Parcelable)this.e);
                    Label_0387: {
                        if (this.f != null || this.g != null) {
                            final Message obtain = Message.obtain();
                            obtain.obj = a;
                            try {
                                final Messenger f = this.f;
                                if (f != null) {
                                    f.send(obtain);
                                    break Label_0387;
                                }
                                final Messenger d0 = this.g.D0;
                                Objects.requireNonNull(d0);
                                d0.send(obtain);
                                break Label_0387;
                            }
                            catch (final RemoteException ex) {
                                if (Log.isLoggable("Rpc", 3)) {
                                    Log.d("Rpc", "Messenger failed, fallback to startService");
                                }
                            }
                        }
                        if (this.c.a() == 2) {
                            this.b.sendBroadcast((Intent)a);
                        }
                        else {
                            this.b.startService((Intent)a);
                        }
                    }
                    zbs.a.v(h100.D0, (ghj)new gmg((Object)this, (Object)string, (Object)this.d.schedule((Runnable)new pez((Object)zbs, 1), 30L, TimeUnit.SECONDS)));
                    return zbs.a;
                }
            }
        }
    }
    
    public final void b(String s, final Bundle bundle) {
        synchronized (this.a) {
            final zbs zbs = this.a.remove(s);
            if (zbs == null) {
                s = String.valueOf(s);
                if (s.length() != 0) {
                    s = "Missing callback for ".concat(s);
                }
                else {
                    s = new String("Missing callback for ");
                }
                Log.w("Rpc", s);
                return;
            }
            zbs.b((Object)bundle);
        }
    }
}

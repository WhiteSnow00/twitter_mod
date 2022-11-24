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

public final class smo
{
    public static int h;
    public static PendingIntent i;
    public static final Pattern j;
    public final z8q<String, rcs<Bundle>> a;
    public final Context b;
    public final wzz c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger e;
    public Messenger f;
    public mty g;
    
    static {
        j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public smo(final Context b) {
        this.a = (z8q<String, rcs<Bundle>>)new z8q();
        this.b = b;
        this.c = new wzz(b);
        this.e = new Messenger((Handler)new xay(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor d = new ScheduledThreadPoolExecutor(1);
        d.setKeepAliveTime(60L, TimeUnit.SECONDS);
        d.allowCoreThreadTimeOut(true);
        this.d = d;
    }
    
    public final mcs<Bundle> a(final Bundle bundle) {
        synchronized (smo.class) {
            final int h = smo.h;
            smo.h = h + 1;
            final String string = Integer.toString(h);
            monitorexit(smo.class);
            final rcs rcs = new rcs();
            Object a = this.a;
            synchronized (a) {
                this.a.put((Object)string, (Object)rcs);
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
                synchronized (smo.class) {
                    if (smo.i == null) {
                        final Intent intent = new Intent();
                        intent.setPackage("com.google.example.invalidpackage");
                        smo.i = PendingIntent.getBroadcast(b, 0, intent, i9y.a);
                    }
                    ((Intent)a).putExtra("app", (Parcelable)smo.i);
                    monitorexit(smo.class);
                    ((Intent)a).putExtra("kid", wa0.y(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
                    if (Log.isLoggable("Rpc", 3)) {
                        final String value = String.valueOf(((Intent)a).getExtras());
                        final StringBuilder sb = new StringBuilder(value.length() + 8);
                        sb.append("Sending ");
                        sb.append(value);
                        Log.d("Rpc", sb.toString());
                    }
                    ((Intent)a).putExtra("google.messenger", (Parcelable)this.e);
                    Label_0388: {
                        if (this.f != null || this.g != null) {
                            final Message obtain = Message.obtain();
                            obtain.obj = a;
                            try {
                                final Messenger f = this.f;
                                if (f != null) {
                                    f.send(obtain);
                                    break Label_0388;
                                }
                                final Messenger f2 = this.g.F0;
                                Objects.requireNonNull(f2);
                                f2.send(obtain);
                                break Label_0388;
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
                    rcs.a.v((Executor)h200.F0, (uhj<TResult>)new zmg(this, string, this.d.schedule((Runnable)new hfz((Object)rcs, 1), 30L, TimeUnit.SECONDS)));
                    return (mcs<Bundle>)rcs.a;
                }
            }
        }
    }
    
    public final void b(String s, final Bundle bundle) {
        synchronized (this.a) {
            final rcs rcs = (rcs)this.a.remove((Object)s);
            if (rcs == null) {
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
            rcs.b(bundle);
        }
    }
}

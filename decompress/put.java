import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Objects;
import android.os.Build$VERSION;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledExecutorService;
import java.util.ArrayDeque;
import java.util.Map;
import com.google.firebase.messaging.FirebaseMessaging;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class put
{
    public static final long i;
    public static final int j = 0;
    public final Context a;
    public final r9h b;
    public final m5c c;
    public final FirebaseMessaging d;
    public final Map<String, ArrayDeque<rcs<Void>>> e;
    public final ScheduledExecutorService f;
    public boolean g;
    public final nut h;
    
    static {
        i = TimeUnit.HOURS.toSeconds(8L);
    }
    
    public put(final FirebaseMessaging d, final r9h b, final nut h, final m5c c, final Context a, final ScheduledExecutorService f) {
        this.e = new ws0();
        this.g = false;
        this.d = d;
        this.b = b;
        this.h = h;
        this.c = c;
        this.a = a;
        this.f = f;
    }
    
    public static <T> void a(final mcs<T> ex) throws IOException {
        try {
            mds.b((mcs)ex, 30L, TimeUnit.SECONDS);
        }
        catch (final TimeoutException ex) {
            goto Label_0017;
        }
        catch (final InterruptedException ex2) {}
        catch (final ExecutionException ex3) {
            final Throwable cause = ex3.getCause();
            if (cause instanceof IOException) {
                throw (IOException)cause;
            }
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            throw new IOException(ex3);
        }
    }
    
    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build$VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
    
    public final void b(final String s) throws IOException {
        final m5c c = this.c;
        final String a = this.d.a();
        Objects.requireNonNull(c);
        final Bundle bundle = new Bundle();
        final StringBuilder sb = new StringBuilder();
        sb.append("/topics/");
        sb.append(s);
        ((BaseBundle)bundle).putString("gcm.topic", sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("/topics/");
        sb2.append(s);
        a(c.a(c.c(a, sb2.toString(), bundle)));
    }
    
    public final void c(final String s) throws IOException {
        final m5c c = this.c;
        final String a = this.d.a();
        Objects.requireNonNull(c);
        final Bundle bundle = new Bundle();
        final StringBuilder sb = new StringBuilder();
        sb.append("/topics/");
        sb.append(s);
        ((BaseBundle)bundle).putString("gcm.topic", sb.toString());
        ((BaseBundle)bundle).putString("delete", "1");
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("/topics/");
        sb2.append(s);
        a(c.a(c.c(a, sb2.toString(), bundle)));
    }
    
    public final void e(final boolean g) {
        synchronized (this) {
            this.g = g;
        }
    }
    
    public final boolean f() throws IOException {
        while (true) {
            synchronized (this) {
                final lpt a = this.h.a();
                final boolean b = true;
                if (a == null) {
                    if (d()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
                monitorexit(this);
                int n2;
                try {
                    final String b2 = a.b;
                    int n = -1;
                    final int hashCode = b2.hashCode();
                    if (hashCode != 83) {
                        if (hashCode == 85) {
                            if (b2.equals("U")) {
                                n = 1;
                            }
                        }
                    }
                    else if (b2.equals("S")) {
                        n = 0;
                    }
                    if (n != 0) {
                        if (n != 1) {
                            n2 = (b ? 1 : 0);
                            if (d()) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unknown topic operation");
                                sb.append(a);
                                sb.append(".");
                                Log.d("FirebaseMessaging", sb.toString());
                                n2 = (b ? 1 : 0);
                            }
                        }
                        else {
                            this.c(a.a);
                            n2 = (b ? 1 : 0);
                            if (d()) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unsubscribe from topic: ");
                                sb2.append(a.a);
                                sb2.append(" succeeded.");
                                Log.d("FirebaseMessaging", sb2.toString());
                                n2 = (b ? 1 : 0);
                            }
                        }
                    }
                    else {
                        this.b(a.a);
                        n2 = (b ? 1 : 0);
                        if (d()) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("Subscribe to topic: ");
                            sb3.append(a.a);
                            sb3.append(" succeeded.");
                            Log.d("FirebaseMessaging", sb3.toString());
                            n2 = (b ? 1 : 0);
                        }
                    }
                }
                catch (final IOException ex) {
                    if (!"SERVICE_NOT_AVAILABLE".equals(ex.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(ex.getMessage())) {
                        if (ex.getMessage() != null) {
                            throw ex;
                        }
                        Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    }
                    else {
                        final StringBuilder f = ehk.f("Topic operation failed: ");
                        f.append(ex.getMessage());
                        f.append(". Will retry Topic operation.");
                        Log.e("FirebaseMessaging", f.toString());
                    }
                    n2 = 0;
                }
                if (n2 == 0) {
                    return false;
                }
                final nut h = this.h;
                synchronized (h) {
                    final ryp a2 = h.a;
                    final String c = a.c;
                    ArrayDeque d = a2.d;
                    synchronized (d) {
                        if (a2.d.remove(c)) {
                            a2.e.execute((Runnable)new oit((Object)a2, 5));
                        }
                        monitorexit(d);
                        monitorexit(h);
                        synchronized (this.e) {
                            final String c2 = a.c;
                            if (!this.e.containsKey((Object)c2)) {
                                continue;
                            }
                            d = (ArrayDeque)this.e.getOrDefault((Object)c2, (Object)null);
                            final rcs rcs = d.poll();
                            if (rcs != null) {
                                rcs.b(null);
                            }
                            if (!d.isEmpty()) {
                                continue;
                            }
                            this.e.remove((Object)c2);
                            continue;
                        }
                    }
                }
            }
        }
    }
    
    public final void g(final long n) {
        this.f.schedule((Runnable)new qut(this, this.a, this.b, Math.min(Math.max(30L, 2L * n), put.i)), n, TimeUnit.SECONDS);
        this.e(true);
    }
}

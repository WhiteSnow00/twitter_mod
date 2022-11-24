import android.os.BaseBundle;
import java.io.IOException;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageInfo;
import java.util.concurrent.ExecutionException;
import android.util.Log;
import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;
import android.util.Base64;
import java.security.MessageDigest;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m5c
{
    public final a1b a;
    public final r9h b;
    public final smo c;
    public final qml<f9w> d;
    public final qml<ijc> e;
    public final i1b f;
    
    public m5c(final a1b a, final r9h b, final qml<f9w> d, final qml<ijc> e, final i1b f) {
        a.a();
        final smo c = new smo(a.a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final mcs<String> a(final mcs<Bundle> mcs) {
        return (mcs<String>)mcs.k((Executor)g5a.H0, (lp6)new l71((Object)this, 8));
    }
    
    public final void b(String ex, String c, final Bundle bundle) throws ExecutionException, InterruptedException {
        ((BaseBundle)bundle).putString("scope", c);
        ((BaseBundle)bundle).putString("sender", (String)ex);
        ((BaseBundle)bundle).putString("subtype", (String)ex);
        final a1b a = this.a;
        a.a();
        ((BaseBundle)bundle).putString("gmp_app_id", a.c.b);
        ex = (NoSuchAlgorithmException)this.b;
        synchronized (ex) {
            if (((r9h)ex).d == 0) {
                final PackageInfo c2 = ((r9h)ex).c("com.google.android.gms");
                if (c2 != null) {
                    ((r9h)ex).d = c2.versionCode;
                }
            }
            final int d = ((r9h)ex).d;
            monitorexit(ex);
            ((BaseBundle)bundle).putString("gmsv", Integer.toString(d));
            ((BaseBundle)bundle).putString("osv", Integer.toString(Build$VERSION.SDK_INT));
            ((BaseBundle)bundle).putString("app_ver", this.b.a());
            ex = (NoSuchAlgorithmException)this.b;
            synchronized (ex) {
                if (((r9h)ex).c == null) {
                    ((r9h)ex).e();
                }
                c = ((r9h)ex).c;
                monitorexit(ex);
                ((BaseBundle)bundle).putString("app_ver_name", c);
                ex = (NoSuchAlgorithmException)this.a;
                ((a1b)ex).a();
                ex = (NoSuchAlgorithmException)((a1b)ex).b;
                try {
                    ex = (NoSuchAlgorithmException)Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((String)ex).getBytes()), 11);
                }
                catch (NoSuchAlgorithmException ex) {
                    ex = (NoSuchAlgorithmException)"[HASH-ERROR]";
                }
                ((BaseBundle)bundle).putString("firebase-app-name-hash", (String)ex);
                Label_0259: {
                    try {
                        ex = (NoSuchAlgorithmException)((ntd)mds.a(this.f.l())).a();
                        if (!TextUtils.isEmpty((CharSequence)ex)) {
                            ((BaseBundle)bundle).putString("Goog-Firebase-Installations-Auth", (String)ex);
                            break Label_0259;
                        }
                        Log.w("FirebaseMessaging", "FIS auth token is empty");
                        break Label_0259;
                    }
                    catch (final InterruptedException ex) {}
                    catch (final ExecutionException ex2) {}
                    Log.e("FirebaseMessaging", "Failed to get FIS auth token", (Throwable)ex);
                }
                ((BaseBundle)bundle).putString("appid", (String)mds.a(this.f.getId()));
                ((BaseBundle)bundle).putString("cliv", "fcm-23.0.5");
                ex = (NoSuchAlgorithmException)this.e.get();
                final f9w f9w = (f9w)this.d.get();
                if (ex != null && f9w != null) {
                    final int a2 = ((ijc)ex).a();
                    if (a2 != 1) {
                        ((BaseBundle)bundle).putString("Firebase-Client-Log-Type", Integer.toString(lb0.G(a2)));
                        ((BaseBundle)bundle).putString("Firebase-Client", f9w.a());
                    }
                }
            }
        }
    }
    
    public final mcs<Bundle> c(String ex, String c, final Bundle bundle) {
        try {
            this.b((String)ex, c, bundle);
            final smo c2 = this.c;
            c = (String)c2.c;
            synchronized (c) {
                if (((wzz)c).b == 0) {
                    PackageInfo b;
                    try {
                        b = wux.a(((wzz)c).a).b("com.google.android.gms", 0);
                    }
                    catch (final PackageManager$NameNotFoundException ex2) {
                        final String value = String.valueOf(ex2);
                        final StringBuilder sb = new StringBuilder(value.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(value);
                        Log.w("Metadata", sb.toString());
                        b = null;
                    }
                    if (b != null) {
                        ((wzz)c).b = b.versionCode;
                    }
                }
                final int b2 = ((wzz)c).b;
                monitorexit(c);
                if (b2 < 12000000) {
                    if (c2.c.a() != 0) {
                        ex = (ExecutionException)c2.a(bundle).m((Executor)h200.F0, (lp6)new su6((Object)c2, (Object)bundle));
                        return (mcs<Bundle>)ex;
                    }
                    ex = (ExecutionException)mds.d((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
                    return (mcs<Bundle>)ex;
                }
                ex = (ExecutionException)hzz.a(c2.b);
                synchronized (ex) {
                    final int n = ((hzz)ex).a++;
                    monitorexit(ex);
                    ex = (ExecutionException)((hzz)ex).b((wvz)new kyz(n, bundle)).k((Executor)h200.F0, (lp6)nwx.H0);
                    return (mcs<Bundle>)ex;
                }
            }
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex3) {}
        return (mcs<Bundle>)mds.d((Exception)ex);
    }
}

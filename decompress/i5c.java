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

public final class i5c
{
    public final b1b a;
    public final y8h b;
    public final klo c;
    public final rll<h8w> d;
    public final rll<gjc> e;
    public final j1b f;
    
    public i5c(final b1b a, final y8h b, final rll<h8w> d, final rll<gjc> e, final j1b f) {
        a.a();
        final klo c = new klo(a.a);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final zas<String> a(final zas<Bundle> zas) {
        return (zas<String>)zas.k((Executor)v4a.E0, (zo6)new l71((Object)this, 8));
    }
    
    public final void b(String ex, String c, final Bundle bundle) throws ExecutionException, InterruptedException {
        ((BaseBundle)bundle).putString("scope", c);
        ((BaseBundle)bundle).putString("sender", (String)ex);
        ((BaseBundle)bundle).putString("subtype", (String)ex);
        final b1b a = this.a;
        a.a();
        ((BaseBundle)bundle).putString("gmp_app_id", a.c.b);
        ex = (NoSuchAlgorithmException)this.b;
        synchronized (ex) {
            if (((y8h)ex).d == 0) {
                final PackageInfo c2 = ((y8h)ex).c("com.google.android.gms");
                if (c2 != null) {
                    ((y8h)ex).d = c2.versionCode;
                }
            }
            final int d = ((y8h)ex).d;
            monitorexit(ex);
            ((BaseBundle)bundle).putString("gmsv", Integer.toString(d));
            ((BaseBundle)bundle).putString("osv", Integer.toString(Build$VERSION.SDK_INT));
            ((BaseBundle)bundle).putString("app_ver", this.b.a());
            ex = (NoSuchAlgorithmException)this.b;
            synchronized (ex) {
                if (((y8h)ex).c == null) {
                    ((y8h)ex).e();
                }
                c = ((y8h)ex).c;
                monitorexit(ex);
                ((BaseBundle)bundle).putString("app_ver_name", c);
                ex = (NoSuchAlgorithmException)this.a;
                ((b1b)ex).a();
                ex = (NoSuchAlgorithmException)((b1b)ex).b;
                try {
                    ex = (NoSuchAlgorithmException)Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(((String)ex).getBytes()), 11);
                }
                catch (NoSuchAlgorithmException ex) {
                    ex = (NoSuchAlgorithmException)"[HASH-ERROR]";
                }
                ((BaseBundle)bundle).putString("firebase-app-name-hash", (String)ex);
                Label_0259: {
                    try {
                        ex = (NoSuchAlgorithmException)((htd)zbs.a(this.f.k())).a();
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
                ((BaseBundle)bundle).putString("appid", (String)zbs.a((zas)this.f.getId()));
                ((BaseBundle)bundle).putString("cliv", "fcm-23.0.5");
                ex = (NoSuchAlgorithmException)this.e.get();
                final h8w h8w = (h8w)this.d.get();
                if (ex != null && h8w != null) {
                    final int a2 = ((gjc)ex).a();
                    if (a2 != 1) {
                        ((BaseBundle)bundle).putString("Firebase-Client-Log-Type", Integer.toString(nb0.D(a2)));
                        ((BaseBundle)bundle).putString("Firebase-Client", h8w.a());
                    }
                }
            }
        }
    }
    
    public final zas<Bundle> c(String ex, String c, final Bundle bundle) {
        try {
            this.b((String)ex, c, bundle);
            final klo c2 = this.c;
            c = (String)c2.c;
            synchronized (c) {
                if (((lyz)c).b == 0) {
                    PackageInfo b;
                    try {
                        b = ntx.a(((lyz)c).a).b("com.google.android.gms", 0);
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
                        ((lyz)c).b = b.versionCode;
                    }
                }
                final int b2 = ((lyz)c).b;
                monitorexit(c);
                if (b2 < 12000000) {
                    if (c2.c.a() != 0) {
                        ex = (ExecutionException)c2.a(bundle).m((Executor)w000.C0, (zo6)new jk0(c2, bundle));
                        return (zas<Bundle>)ex;
                    }
                    ex = (ExecutionException)zbs.d((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
                    return (zas<Bundle>)ex;
                }
                ex = (ExecutionException)wxz.a(c2.b);
                synchronized (ex) {
                    final int n = ((wxz)ex).d++;
                    monitorexit(ex);
                    ex = (ExecutionException)((wxz)ex).b((kuz)new zwz(n, bundle)).k((Executor)w000.C0, (zo6)x3j.H0);
                    return (zas<Bundle>)ex;
                }
            }
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex3) {}
        return (zas<Bundle>)zbs.d((Exception)ex);
    }
}

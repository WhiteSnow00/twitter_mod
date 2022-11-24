import android.content.SharedPreferences$Editor;
import java.io.Writer;
import org.json.JSONObject;
import java.util.Map;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.File;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yop implements qur<Void, Void>
{
    public final zop F0;
    
    public yop(final zop f0) {
        this.F0 = f0;
    }
    
    public final mcs e(Object f) throws Exception {
        final Void void1 = (Void)f;
        final zop f2 = this.F0;
        f = f2.f;
        final upp b = f2.b;
        Objects.requireNonNull(f);
        Object o = null;
        JSONObject e;
        try {
            final Map c = ((seg)f).c(b);
            final twj twj = (twj)((seg)f).G0;
            final String s = (String)((seg)f).F0;
            Objects.requireNonNull(twj);
            final wrc wrc = new wrc(s, c);
            wrc.c("User-Agent", "Crashlytics Android SDK/18.2.11");
            wrc.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            ((seg)f).a(wrc, b);
            final r1n r1n = (r1n)((seg)f).H0;
            final StringBuilder sb = new StringBuilder();
            sb.append("Requesting settings from ");
            sb.append((String)((seg)f).F0);
            r1n.x(sb.toString());
            final r1n r1n2 = (r1n)((seg)f).H0;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings query params were: ");
            sb2.append(c);
            r1n2.l0(sb2.toString());
            e = ((seg)f).e(wrc.b());
        }
        catch (final IOException ex) {
            ((r1n)((seg)f).H0).z("Settings request failed.", (Throwable)ex);
            e = null;
        }
        if (e != null) {
            final top a = this.F0.c.a(e);
            final gdg e2 = this.F0.e;
            final long c2 = a.c;
            Objects.requireNonNull(e2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", (Throwable)null);
            }
            Label_0466: {
                try {
                    e.put("expires_at", c2);
                    f = (o = new FileWriter((File)e2.F0));
                    try {
                        final Object o2 = f;
                        final JSONObject jsonObject = e;
                        final String s2 = jsonObject.toString();
                        ((Writer)o2).write(s2);
                        o = f;
                        final Object o3 = f;
                        ((Writer)o3).flush();
                    }
                    catch (final Exception ex2) {}
                }
                catch (final Exception ex2) {
                    f = null;
                }
                finally {
                    break Label_0466;
                }
                try {
                    final Object o2 = f;
                    final JSONObject jsonObject = e;
                    final String s2 = jsonObject.toString();
                    ((Writer)o2).write(s2);
                    o = f;
                    final Object o3 = f;
                    ((Writer)o3).flush();
                    while (true) {
                        fy4.a((Closeable)f, "Failed to close settings writer.");
                        this.F0.c(e, "Loaded settings: ");
                        o = this.F0;
                        final String f3 = ((zop)o).b.f;
                        o = fy4.h(((zop)o).a).edit();
                        ((SharedPreferences$Editor)o).putString("existing_instance_identifier", f3);
                        ((SharedPreferences$Editor)o).apply();
                        this.F0.h.set(a);
                        this.F0.i.get().d(a);
                        return mds.e((Object)null);
                        o = f;
                        final Exception ex2;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", (Throwable)ex2);
                        continue;
                    }
                }
                finally {}
            }
            fy4.a((Closeable)o, "Failed to close settings writer.");
        }
        return mds.e((Object)null);
    }
}

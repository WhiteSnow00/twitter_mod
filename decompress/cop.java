import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cop implements yop
{
    public final Context a;
    public final zop b;
    public final jop c;
    public final yvl d;
    public final mcg e;
    public final ydg f;
    public final t68 g;
    public final AtomicReference<wnp> h;
    public final AtomicReference<zbs<wnp>> i;
    
    public cop(final Context a, final zop b, final yvl d, final jop c, final mcg e, final ydg f, final t68 g) {
        final AtomicReference h = new AtomicReference();
        this.h = h;
        this.i = new AtomicReference<zbs<wnp>>((zbs<wnp>)new zbs());
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
        this.f = f;
        this.g = g;
        h.set(pj8.b(d));
    }
    
    public final wnp a(int n) {
        final wnp wnp = null;
        final wnp wnp2 = null;
        wnp a = wnp;
        Label_0209: {
            Label_0180: {
                Label_0164: {
                    try {
                        if (ib0.e(2, n)) {
                            return a;
                        }
                        final JSONObject f = this.e.F();
                        if (f == null) {
                            break Label_0180;
                        }
                        a = this.c.a(f);
                        if (a == null) {
                            break Label_0164;
                        }
                        this.c(f, "Loaded cached settings: ");
                        Objects.requireNonNull(this.d);
                        final long currentTimeMillis = System.currentTimeMillis();
                        if (!ib0.e(3, n)) {
                            if (a.c < currentTimeMillis) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                a = wnp;
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable)null);
                                    a = wnp;
                                    return a;
                                }
                                return a;
                            }
                        }
                    }
                    catch (final Exception ex) {
                        a = wnp2;
                        break Label_0209;
                    }
                    try {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable)null);
                        }
                        return a;
                    }
                    catch (final Exception ex) {
                        break Label_0209;
                    }
                }
                Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", (Throwable)null);
                a = wnp;
                return a;
            }
            a = wnp;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable)null);
                a = wnp;
                return a;
            }
            return a;
        }
        final Exception ex;
        Log.e("FirebaseCrashlytics", "Failed to get cached settings", (Throwable)ex);
        return a;
    }
    
    public final wnp b() {
        return this.h.get();
    }
    
    public final void c(final JSONObject jsonObject, final String s) throws JSONException {
        final StringBuilder j = fu8.j(s);
        j.append(jsonObject.toString());
        final String string = j.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, (Throwable)null);
        }
    }
}

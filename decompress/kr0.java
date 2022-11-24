import android.content.pm.PackageManager$NameNotFoundException;
import java.io.IOException;
import android.os.StrictMode$ThreadPolicy;
import java.io.File;
import android.util.Log;
import com.facebook.soloader.c;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kr0 extends sjq
{
    public Context a;
    public int b;
    public c c;
    
    public kr0(final Context a, final int b) {
        final Context applicationContext = a.getApplicationContext();
        this.a = applicationContext;
        if (applicationContext == null) {
            final StringBuilder f = ehk.f("context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: ");
            f.append(a.getApplicationInfo().nativeLibraryDir);
            Log.w("SoLoader", f.toString());
            this.a = a;
        }
        this.b = b;
        this.c = new c(new File(this.a.getApplicationInfo().nativeLibraryDir), b);
    }
    
    public static File d(final Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }
    
    @Override
    public final int a(final String s, final int n, final StrictMode$ThreadPolicy strictMode$ThreadPolicy) throws IOException {
        return this.c.a(s, n, strictMode$ThreadPolicy);
    }
    
    @Override
    public final void b(final int n) throws IOException {
        ((sjq)this.c).b(n);
    }
    
    public final boolean c() throws IOException {
        final File a = this.c.a;
        final Context e = this.e();
        final File d = d(e);
        if (!a.equals(d)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Native library directory updated from ");
            sb.append(a);
            sb.append(" to ");
            sb.append(d);
            Log.d("SoLoader", sb.toString());
            final int b = this.b | 0x1;
            this.b = b;
            this.c = new c(d, b);
            this.a = e;
            return true;
        }
        return false;
    }
    
    public final Context e() {
        try {
            final Context a = this.a;
            return a.createPackageContext(a.getPackageName(), 0);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new RuntimeException((Throwable)ex);
        }
    }
    
    @Override
    public final String toString() {
        return this.c.toString();
    }
}

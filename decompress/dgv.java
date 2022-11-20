import java.io.Serializable;
import java.util.Locale;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import android.content.pm.PackageInfo;
import java.io.IOException;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgv
{
    public final sds a;
    public final String b;
    public final String c;
    
    public dgv(final Context context, sds a, final iu8 iu8) {
        final PackageInfo f = o70.f(context);
        q3j.b0();
        this.a = a;
        final StringBuilder sb = new StringBuilder("TwitterAndroid");
        a = null;
        if (f == null) {
            goto Label_0361;
        }
        final xk0 b = wk0.b();
        b.c();
        sb.append('/');
        sb.append("9.65.5-release.0");
        sb.append(" (");
        sb.append(f.versionCode);
        sb.append('-');
        b.t();
        sb.append("r-");
        b.f();
        sb.append(0);
        sb.append(')');
        final File file = new File("/system/vendor/twitter/preload");
        if (!file.exists()) {
            goto Label_0214;
        }
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                bufferedReader.readLine();
                h1e.a((Closeable)bufferedReader);
            }
            catch (final IOException s) {}
        }
        catch (final IOException ex) {}
    }
    
    public static dgv a() {
        return zh8.e().a7();
    }
    
    public static String b(String encode) {
        if (ikr.e((CharSequence)encode)) {
            return encode;
        }
        try {
            encode = URLEncoder.encode(encode, "UTF-8");
            return encode;
        }
        catch (final UnsupportedEncodingException ex) {
            return null;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        final Locale english = Locale.ENGLISH;
        final String c = this.c;
        String s;
        if (this.a.k()) {
            s = "1";
        }
        else {
            s = "0";
        }
        sb.append(String.format(english, c, s));
        return sb.toString();
    }
}

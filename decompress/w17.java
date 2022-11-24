import java.util.Map;
import org.json.JSONObject;
import java.util.HashMap;
import android.util.Log;
import java.io.IOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.File;
import android.content.Context;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w17
{
    public static final Charset d;
    public final Context a;
    public final dai b;
    public final qya c;
    
    static {
        d = Charset.forName("UTF-8");
    }
    
    public w17(final Context a, final dai b, final qya c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static File b(File file, final String s) {
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (int length = listFiles.length, i = 0; i < length; ++i) {
            file = listFiles[i];
            if (file.getName().endsWith(s)) {
                return file;
            }
        }
        return null;
    }
    
    public static void f(final qya qya, String ex, final String s, String s2) {
        final File file = new File(qya.d((String)ex), s2);
        ex = null;
        s2 = null;
        try {
            final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), w17.d));
            try {
                bufferedWriter.write(s);
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to close ");
                sb.append(file);
                fy4.a((Closeable)bufferedWriter, sb.toString());
            }
            catch (final IOException ex) {}
        }
        catch (final IOException ex2) {
            goto Label_0137;
        }
    }
    
    public final vnp a(String s) {
        final File d = this.c.d(s);
        final File file = new File(d, "pending");
        final StringBuilder f = ehk.f("Minidump directory: ");
        f.append(file.getAbsolutePath());
        s = f.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", s, (Throwable)null);
        }
        final File b = b(file, ".dmp");
        final StringBuilder f2 = ehk.f("Minidump file ");
        if (b != null && b.exists()) {
            s = "exists";
        }
        else {
            s = "does not exist";
        }
        f2.append(s);
        s = f2.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", s, (Throwable)null);
        }
        final vnp$a vnp$a = new vnp$a();
        if (d.exists() && file.exists()) {
            vnp$a.a = b(file, ".dmp");
            vnp$a.b = b(d, ".device_info");
            vnp$a.c = new File(d, "session.json");
            vnp$a.d = new File(d, "app.json");
            vnp$a.e = new File(d, "device.json");
            vnp$a.f = new File(d, "os.json");
        }
        return new vnp(vnp$a);
    }
    
    public final void c(final String s, String string, final long n) {
        final HashMap hashMap = new HashMap();
        hashMap.put("session_id", s);
        hashMap.put("generator", string);
        hashMap.put("started_at_seconds", n);
        string = new JSONObject((Map)hashMap).toString();
        f(this.c, s, string, "session.json");
    }
    
    public final void d(final String s, final jbr$a jbr$a) {
        final String a = jbr$a.a();
        final String e = jbr$a.e();
        final String f = jbr$a.f();
        final String d = jbr$a.d();
        final int b = jbr$a.b();
        final iu8 c = jbr$a.c();
        if (c.b == null) {
            c.b = new iu8$a(c);
        }
        final String a2 = c.b.a;
        final iu8 c2 = jbr$a.c();
        if (c2.b == null) {
            c2.b = new iu8$a(c2);
        }
        final String b2 = c2.b.b;
        final HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", a);
        hashMap.put("version_code", e);
        hashMap.put("version_name", f);
        hashMap.put("install_uuid", d);
        hashMap.put("delivery_mechanism", b);
        String s2;
        if ((s2 = a2) == null) {
            s2 = "";
        }
        hashMap.put("development_platform", s2);
        String s3;
        if ((s3 = b2) == null) {
            s3 = "";
        }
        hashMap.put("development_platform_version", s3);
        f(this.c, s, new JSONObject((Map)hashMap).toString(), "app.json");
    }
    
    public final void e(final String s, final jbr$b jbr$b) {
        final int a = jbr$b.a();
        final String f = jbr$b.f();
        final int b = jbr$b.b();
        final long i = jbr$b.i();
        final long c = jbr$b.c();
        final boolean d = jbr$b.d();
        final int h = jbr$b.h();
        final String e = jbr$b.e();
        final String g = jbr$b.g();
        final HashMap hashMap = new HashMap();
        hashMap.put("arch", a);
        hashMap.put("build_model", f);
        hashMap.put("available_processors", b);
        hashMap.put("total_ram", i);
        hashMap.put("disk_space", c);
        hashMap.put("is_emulator", d);
        hashMap.put("state", h);
        hashMap.put("build_manufacturer", e);
        hashMap.put("build_product", g);
        f(this.c, s, new JSONObject((Map)hashMap).toString(), "device.json");
    }
    
    public final void g(final String s, final jbr$c jbr$c) {
        final String c = jbr$c.c();
        final String b = jbr$c.b();
        final boolean a = jbr$c.a();
        final HashMap hashMap = new HashMap();
        hashMap.put("version", c);
        hashMap.put("build_version", b);
        hashMap.put("is_rooted", a);
        f(this.c, s, new JSONObject((Map)hashMap).toString(), "os.json");
    }
}

import android.os.StrictMode$ThreadPolicy;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.StrictMode;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h0l
{
    public static String a;
    public static int b;
    
    public static String a() {
        if (h0l.a != null) {
            goto Label_0166;
        }
        int b;
        if ((b = h0l.b) == 0) {
            b = (h0l.b = Process.myPid());
        }
        String s = null;
        if (b <= 0) {
            goto Label_0162;
        }
        try {
            final StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(b);
            sb.append("/cmdline");
            final String string = sb.toString();
            final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                try {
                    s = bufferedReader.readLine();
                    xd.t((Object)s);
                    s = s.trim();
                }
                catch (final IOException s) {}
            }
            finally {}
        }
        catch (final IOException ex) {}
    }
}

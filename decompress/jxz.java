import java.io.File;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxz
{
    public final Context a;
    
    public jxz(final Context a) {
        this.a = a;
    }
    
    public static long a(final File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        final File[] listFiles = file.listFiles();
        long n2;
        long n = n2 = 0L;
        if (listFiles != null) {
            final int length = listFiles.length;
            int n3 = 0;
            while (true) {
                n2 = n;
                if (n3 >= length) {
                    break;
                }
                n += a(listFiles[n3]);
                ++n3;
            }
        }
        return n2;
    }
}

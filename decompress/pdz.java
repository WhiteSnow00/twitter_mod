import java.util.Iterator;
import java.util.Objects;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pdz implements sbz
{
    public static final at0 a;
    
    static {
        a = new at0();
    }
    
    public static pdz b() {
        if (!paz.a()) {
            synchronized (pdz.class) {
                final pdz pdz = (pdz)((l7q)pdz.a).getOrDefault((Object)null, (Object)null);
                if (pdz != null) {
                    return pdz;
                }
                final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                }
                finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
        }
        throw null;
    }
    
    public static void c() {
        synchronized (pdz.class) {
            final at0 a = pdz.a;
            final Iterator<Object> iterator = ((at0.e)a.values()).iterator();
            if (!iterator.hasNext()) {
                ((l7q)a).clear();
                return;
            }
            Objects.requireNonNull((Object)iterator.next());
            throw null;
        }
    }
    
    public final Object a(final String s) {
        throw null;
    }
}

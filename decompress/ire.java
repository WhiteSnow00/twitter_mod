import java.util.Iterator;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ire
{
    public final Map<String, String> a;
    public final int b;
    public final int c;
    
    public ire(final int c) {
        this.a = new HashMap();
        this.b = 64;
        this.c = c;
    }
    
    public static String a(String s, final int n) {
        String s2 = s;
        if (s != null) {
            s = (s2 = s.trim());
            if (s.length() > n) {
                s2 = s.substring(0, n);
            }
        }
        return s2;
    }
    
    public final boolean b(String a, final String s) {
        monitorenter(this);
        Label_0180: {
            if (a == null) {
                break Label_0180;
            }
            try {
                final String a2 = a(a, this.c);
                if (this.a.size() >= this.b && !this.a.containsKey(a2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Ignored entry \"");
                    sb.append(a);
                    sb.append("\" when adding custom keys. Maximum allowable: ");
                    sb.append(this.b);
                    Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)null);
                    return false;
                }
                a = a(s, this.c);
                final String s2 = this.a.get(a2);
                boolean equals;
                if (s2 == null) {
                    equals = (a == null);
                }
                else {
                    equals = s2.equals(a);
                }
                if (equals) {
                    return false;
                }
                final HashMap a3 = this.a;
                if (s == null) {
                    a = "";
                }
                a3.put(a2, a);
                return true;
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void c(final Map<String, String> map) {
        synchronized (this) {
            final Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
                final String s = entry.getKey();
                if (s == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                final String a = a(s, this.c);
                if (this.a.size() >= this.b && !this.a.containsKey(a)) {
                    ++n;
                }
                else {
                    final String s2 = (String)entry.getValue();
                    final HashMap a2 = this.a;
                    String a3;
                    if (s2 == null) {
                        a3 = "";
                    }
                    else {
                        a3 = a(s2, this.c);
                    }
                    a2.put(a, a3);
                }
            }
            if (n > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Ignored ");
                sb.append(n);
                sb.append(" entries when adding custom keys. Maximum allowable: ");
                sb.append(this.b);
                Log.w("FirebaseCrashlytics", sb.toString(), (Throwable)null);
            }
        }
    }
}

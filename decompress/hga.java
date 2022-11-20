import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hga
{
    public static final HashSet<String> a;
    public static String b;
    
    static {
        a = new HashSet<String>();
        hga.b = "goog.exo.core";
    }
    
    public static void a(final String s) {
        synchronized (hga.class) {
            if (hga.a.add(s)) {
                final String b = hga.b;
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + s.length());
                sb.append(b);
                sb.append(", ");
                sb.append(s);
                hga.b = sb.toString();
            }
        }
    }
}

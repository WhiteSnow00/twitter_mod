import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ms
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public static final String a(final a a, final String s, final boolean b) {
            Objects.requireNonNull(a);
            String c;
            if (s != null) {
                c = s;
                if (b) {
                    c = l7k.c(s, ",");
                }
            }
            else {
                c = null;
            }
            return c;
        }
    }
}

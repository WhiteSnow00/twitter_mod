// 
// Decompiled by Procyon v0.6.0
// 

public abstract class o9g
{
    public static final Object a;
    public static volatile o9g b;
    
    static {
        a = new Object();
    }
    
    public static o9g e() {
        synchronized (o9g.a) {
            if (o9g.b == null) {
                o9g.b = (o9g)new o9g.o9g$a(3);
            }
            return o9g.b;
        }
    }
    
    public static String g(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public abstract void a(final String p0, final String p1);
    
    public abstract void b(final String p0, final String p1, final Throwable p2);
    
    public abstract void c(final String p0, final String p1);
    
    public abstract void d(final String p0, final String p1, final Throwable p2);
    
    public abstract void f(final String p0, final String p1);
    
    public abstract void h(final String p0, final String p1);
}

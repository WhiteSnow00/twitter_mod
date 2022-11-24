import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class taf
{
    public static t16<?> a(final String s, final String s2) {
        final kb1 kb1 = new kb1(s, s2);
        final t16$b b = t16.b((Class)qaf.class);
        b.e = (k26)new s16((Object)kb1);
        return (t16<?>)b.b();
    }
    
    public static t16<?> b(final String s, final a<Context> a) {
        final t16$b b = t16.b((Class)qaf.class);
        b.a(new up8((Class)Context.class, 1, 0));
        b.e = (k26)new saf(s, (a)a);
        return (t16<?>)b.b();
    }
    
    public interface a<T>
    {
        String g(final T p0);
    }
}

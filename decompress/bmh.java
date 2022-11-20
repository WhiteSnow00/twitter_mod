import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bmh
{
    public static final a Companion;
    public static final joh.d b;
    public final omy a;
    
    static {
        Companion = new a();
        b = new joh.d();
    }
    
    public bmh(final Context context, final omy a) {
        czd.f((Object)context, "context");
        this.a = a;
    }
    
    public final boolean a(final String s, final h9w h9w) {
        final boolean b = false;
        final boolean b2 = s == null || s.length() == 0;
        boolean b3 = b;
        if (b2 ^ true) {
            b3 = b;
            if (mq4.Y((Iterable)h9w.a, (Object)s)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public static final class a
    {
    }
}

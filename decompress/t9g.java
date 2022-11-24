import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9g
{
    public static final Set<String> a;
    
    static {
        t9g.a = new HashSet();
    }
    
    public final void a(final String s, final Throwable t) {
        final HashSet a = t9g.a;
        if (a.contains(s)) {
            return;
        }
        Log.w("LOTTIE", s, t);
        a.add(s);
    }
}

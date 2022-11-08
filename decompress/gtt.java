import android.text.TextUtils;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtt
{
    public static WeakReference<gtt> c;
    public dxp a;
    public final Executor b;
    
    public gtt(final SharedPreferences sharedPreferences, final Executor b) {
        this.b = b;
    }
    
    public final dot a() {
        synchronized (this) {
            final dxp a = this.a;
            Object o = a.d;
            synchronized (o) {
                final String s = a.d.peek();
                monitorexit(o);
                o = dot.d;
                final boolean empty = TextUtils.isEmpty((CharSequence)s);
                o = null;
                if (!empty) {
                    final String[] split = s.split("!", -1);
                    if (split.length == 2) {
                        o = new dot(split[0], split[1]);
                    }
                }
                return (dot)o;
            }
        }
    }
}

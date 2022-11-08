import java.util.Iterator;
import com.twitter.core.ui.styles.icons.implementation.Icon;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vzi
{
    public static final a Companion;
    public static final Map<String, Icon> a;
    
    static {
        Companion = new a();
        a = kq9.X0(new gvj((Object)"error_circle", (Object)gpc.J));
    }
    
    public static final class a
    {
        public final String a(final int n) {
            final Iterator<Object> iterator = vzi.a.entrySet().iterator();
            while (true) {
                Map.Entry<String, Icon> next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    final String s = null;
                    if (!hasNext) {
                        next = null;
                        final Map.Entry<String, V> entry = (Map.Entry<String, V>)next;
                        String s2 = s;
                        if (entry != null) {
                            s2 = entry.getKey();
                        }
                        return s2;
                    }
                    next = iterator.next();
                } while (((Map.Entry<K, Icon>)next).getValue().getDrawableRes() != n);
                continue;
            }
        }
    }
}

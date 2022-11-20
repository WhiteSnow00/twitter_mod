import java.util.Iterator;
import java.util.ArrayList;
import android.app.NotificationChannel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sp3
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final List<String> a(final List<NotificationChannel> list) {
            czd.f((Object)list, "list");
            final ArrayList list2 = new ArrayList(iq4.H((Iterable)list, 10));
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)iterator.next().getId());
            }
            return mq4.E0((Iterable)list2);
        }
    }
}

import java.util.Iterator;
import java.util.ArrayList;
import android.app.NotificationChannel;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kq3
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public final List<String> a(final List<NotificationChannel> list) {
            zzd.f((Object)list, "list");
            final ArrayList list2 = new ArrayList(kr4.h1((Iterable)list, 10));
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)iterator.next().getId());
            }
            return or4.e2((Iterable)list2);
        }
    }
}

import java.util.Iterator;
import com.google.android.gms.common.api.ApiException;
import java.util.HashMap;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f1y
{
    public final Map<BasePendingResult<?>, Boolean> a;
    public final Map<zbs<?>, Boolean> b;
    
    public f1y() {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public final void a(final boolean b, final Status status) {
        Object o = this.a;
        synchronized (o) {
            final HashMap hashMap = new HashMap(this.a);
            monitorexit(o);
            Object o2 = this.b;
            synchronized (o2) {
                o = new HashMap<Object, Object>(this.b);
                monitorexit(o2);
                o2 = hashMap.entrySet().iterator();
                while (((Iterator)o2).hasNext()) {
                    final Map.Entry<K, Boolean> entry = (Map.Entry<K, Boolean>)((Iterator)o2).next();
                    if (b || entry.getValue()) {
                        ((BasePendingResult)entry.getKey()).e(status);
                    }
                }
                o = ((HashMap<Object, Object>)o).entrySet().iterator();
                while (((Iterator)o).hasNext()) {
                    final Map.Entry<K, Boolean> entry2 = ((Iterator<Map.Entry<K, Boolean>>)o).next();
                    if (b || entry2.getValue()) {
                        ((zbs)entry2.getKey()).c((Exception)new ApiException(status));
                    }
                }
            }
        }
    }
}

import java.util.ArrayList;
import java.util.LinkedHashMap;
import android.content.Intent;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ko extends jo<String[], Map<String, Boolean>>
{
    public static final ko.ko$a Companion;
    
    static {
        Companion = new ko.ko$a();
    }
    
    @Override
    public final Intent a(final Context context, final Object o) {
        final String[] array = (String[])o;
        e0e.f((Object)context, "context");
        e0e.f((Object)array, "input");
        return ko.Companion.a(array);
    }
    
    @Override
    public final a b(final Context context, final Object o) {
        final String[] array = (String[])o;
        e0e.f((Object)context, "context");
        e0e.f((Object)array, "input");
        final int length = array.length;
        final int n = 0;
        final int n2 = 1;
        a a;
        if (length == 0) {
            a = new a((T)m3a.F0);
        }
        else {
            final int length2 = array.length;
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n2;
                if (n3 >= length2) {
                    break;
                }
                if (qo6.a(context, array[n3]) != 0) {
                    n4 = 0;
                    break;
                }
                ++n3;
            }
            if (n4 != 0) {
                int e;
                if ((e = vmw.E(array.length)) < 16) {
                    e = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (int length3 = array.length, i = n; i < length3; ++i) {
                    linkedHashMap.put((Object)array[i], (Object)Boolean.TRUE);
                }
                a = new a((T)linkedHashMap);
            }
            else {
                a = null;
            }
        }
        return a;
    }
    
    @Override
    public final Object c(int i, final Intent intent) {
        Object o;
        if (i != -1) {
            o = m3a.F0;
        }
        else if (intent == null) {
            o = m3a.F0;
        }
        else {
            final String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                final ArrayList list = new ArrayList<Boolean>(intArrayExtra.length);
                int length;
                for (length = intArrayExtra.length, i = 0; i < length; ++i) {
                    list.add(intArrayExtra[i] == 0);
                }
                o = mlg.Z((Iterable)rr4.q2((Iterable)ft0.V0((Object[])stringArrayExtra), (Iterable)list));
            }
            else {
                o = m3a.F0;
            }
        }
        return o;
    }
}

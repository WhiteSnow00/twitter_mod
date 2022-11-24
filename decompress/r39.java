import android.util.SizeF;
import android.util.Size;
import android.os.Binder;
import android.util.SparseArray;
import android.os.Parcelable;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r39
{
    public static final Class<?>[] a;
    
    static {
        a = new Class[] { Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class };
    }
    
    public static final boolean a(Object value) {
        final boolean b = value instanceof bjq;
        boolean a = true;
        if (b) {
            final bjq bjq = (bjq)value;
            if (bjq.a() != vei.a && bjq.a() != jmr.a && bjq.a() != r8m.a) {
                return false;
            }
            value = ((fvh)bjq).getValue();
            if (value != null) {
                a = a(value);
            }
            return a;
        }
        else {
            if (value instanceof utb && value instanceof Serializable) {
                return false;
            }
            final Class<?>[] a2 = r39.a;
            for (int i = 0; i < 7; ++i) {
                if (a2[i].isInstance(value)) {
                    return true;
                }
            }
            return false;
        }
    }
}

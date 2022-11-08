import android.view.View;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpb
{
    public static final upb a;
    public static final ypb b;
    
    static {
        a = new upb();
        ypb b2;
        try {
            b2 = zpb.class.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (final Exception ex) {
            b2 = null;
        }
        b = b2;
    }
    
    public static void a(final ArrayList<View> list, final int visibility) {
        if (list == null) {
            return;
        }
        for (int i = list.size() - 1; i >= 0; --i) {
            ((View)list.get(i)).setVisibility(visibility);
        }
    }
}

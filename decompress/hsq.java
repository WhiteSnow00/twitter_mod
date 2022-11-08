import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import j$.util.Map$_EL;
import java.util.List;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.GradientDrawable;
import java.util.Map;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hsq
{
    public static final hsq a;
    public static final u3s b;
    public static final u3s c;
    public static final u3s d;
    public static final u3s e;
    public static final u3s f;
    public static final u3s g;
    public static final u3s h;
    public static final u3s i;
    
    static {
        a = new hsq();
        b = (u3s)rp2.z0((otb)hsq$a.C0);
        c = (u3s)rp2.z0((otb)hsq$e.C0);
        d = (u3s)rp2.z0((otb)hsq$b.C0);
        e = (u3s)rp2.z0((otb)hsq$c.C0);
        f = (u3s)rp2.z0((otb)hsq$d.C0);
        g = (u3s)rp2.z0((otb)hsq$f.C0);
        h = (u3s)rp2.z0((otb)hsq$g.C0);
        i = (u3s)rp2.z0((otb)hsq$h.C0);
    }
    
    public final GradientDrawable a(final Context context, final abr abr, final Map<abr, GradientDrawable> map, final Integer n) {
        final abr h0 = abr.H0;
        abr abr2;
        if (abr == null) {
            abr2 = h0;
        }
        else {
            abr2 = abr;
        }
        GradientDrawable value;
        if ((value = map.get(abr2)) == null) {
            final GradientDrawable$Orientation bl_TR = GradientDrawable$Orientation.BL_TR;
            final u3s g = hsq.g;
            final List list = (List)Map$_EL.getOrDefault((Map)g.getValue(), (Object)abr, ((Map)g.getValue()).get(h0));
            int[] l2;
            if (list != null) {
                final ArrayList list2 = new ArrayList<Integer>(kr4.h1((Iterable)list, 10));
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    list2.add(eo6.b(context, ((Number)iterator.next()).intValue()));
                }
                l2 = or4.l2((Collection)list2);
            }
            else {
                l2 = null;
            }
            value = new GradientDrawable(bl_TR, l2);
            float floatValue;
            if (n != null) {
                floatValue = Float.valueOf((float)context.getResources().getDimensionPixelSize(n.intValue())).floatValue();
            }
            else {
                floatValue = 0.0f;
            }
            value.setCornerRadius(floatValue);
            map.put(abr2, value);
        }
        return value;
    }
}

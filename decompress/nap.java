import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nap implements c5c
{
    public final Resources a;
    public final oap b;
    
    public nap(final Resources a, final oap b) {
        e0e.f((Object)a, "resources");
        e0e.f((Object)b, "providerDelegate");
        this.a = a;
        this.b = b;
    }
    
    public final List<x9p> a(final List<? extends x9p> list) {
        final x9p$a k0 = x9p$a.K0;
        e0e.f((Object)list, "items");
        final ArrayList list2 = new ArrayList();
        final x9p$a f0 = x9p$a.F0;
        final Iterator<? extends x9p> iterator = list.iterator();
        Enum enum1 = (Enum)f0;
        while (iterator.hasNext()) {
            final x9p x9p = (x9p)iterator.next();
            final x9p$a a = x9p.a;
            e0e.e((Object)a, "item.type");
            Object o;
            if (a != (o = enum1)) {
                final x9p$a j0 = x9p$a.J0;
                final boolean b = false;
                final boolean b2 = a == j0 && enum1 == k0;
                final Object o2 = null;
                Object o3 = null;
                Label_0165: {
                    if (!b2) {
                        final int ordinal = enum1.ordinal();
                        if (ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6 || ordinal == 9) {
                            o3 = new e49();
                            break Label_0165;
                        }
                    }
                    o3 = null;
                }
                if (o3 != null) {
                    list2.add(o3);
                }
                final Resources a2 = this.a;
                int n = b ? 1 : 0;
                if (a == j0) {
                    n = (b ? 1 : 0);
                    if (enum1 == k0) {
                        n = 1;
                    }
                }
                Object o4;
                if (n != 0) {
                    o4 = o2;
                }
                else {
                    final int ordinal2 = ((Enum)a).ordinal();
                    if (ordinal2 != 3) {
                        if (ordinal2 != 4 && ordinal2 != 5) {
                            o4 = o2;
                        }
                        else {
                            o4 = new xic(a2.getString(2131956921), 1);
                        }
                    }
                    else {
                        o4 = new xic(a2.getString(2131957386), 2);
                    }
                }
                if (o4 != null) {
                    list2.add(o4);
                }
                o = a;
            }
            list2.add(x9p);
            enum1 = (Enum)o;
        }
        return list2;
    }
    
    public final List<x9p> b(final String s) {
        e0e.f((Object)s, "untrimmedQuery");
        fj1.e();
        final String k0 = eg8.K0(s);
        final ptl ptl = new ptl(k0, 0, 2, (wg8)null);
        List list;
        if (flr.g((CharSequence)k0)) {
            list = this.b.b(s, k0, ptl);
        }
        else {
            list = this.b.a(s, ptl);
        }
        return list;
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.filament.utils.Float3;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zjf
{
    public static l6j a(final l6j l6j, final xbm xbm) {
        czd.f((Object)xbm, "releaseCompletable");
        xbm.i((oj)new qbk(l6j, 25));
        return l6j;
    }
    
    public static cua$c b(final dxm dxm, final cua$c cua$c, final exm exm) {
        czd.f((Object)exm, "feedback");
        final lvj e = dxm.e(exm);
        final exm f = (exm)e.D0;
        final Object e2 = e.E0;
        cua$c cua$c2 = cua$c;
        if (e2 != null) {
            final cua$c$a cua$c$a = new cua$c$a();
            cua$c$a.a = cua$c.a;
            cua$c$a.b = cua$c.b;
            cua$c$a.c = cua$c.c;
            cua$c$a.d = cua$c.d;
            cua$c$a.e = cua$c.e;
            cua$c$a.f = f;
            cua$c$a.e = dxm.c(e2);
            final String b = dxm.b(e2);
            if (b != null) {
                cua$c$a.b = b;
            }
            cua$c2 = (cua$c)((n4j)cua$c$a).e();
        }
        return cua$c2;
    }
    
    public static cua c(final dxm dxm, final cua cua, final exm exm) {
        czd.f((Object)exm, "behavior");
        final lvj e = dxm.e(exm);
        final exm k = (exm)e.D0;
        final Object e2 = e.E0;
        cua cua2 = cua;
        if (e2 != null) {
            final cua$a a = cua.a();
            a.k = k;
            a.j = dxm.c(e2);
            final String b = dxm.b(e2);
            if (b != null) {
                a.b = b;
            }
            final String d = dxm.d(e2);
            if (d != null) {
                a.c = d;
            }
            cua2 = (cua)((n4j)a).e();
        }
        return cua2;
    }
    
    public static l6j d(final l6j l6j, final r8x r8x, final boolean b) {
        czd.f((Object)r8x, "lifecycle");
        return (l6j)new j6j(l6j, b, r8x);
    }
    
    public static l6j e(final l6j l6j, final qsb qsb) {
        czd.f((Object)qsb, "function");
        return (l6j)new k6j(l6j, qsb);
    }
    
    public static pgi f(final pgi pgi, String title, String description, z6d i, String e, String b, String d, String f, String h, String k, String a, fi3 j, rii g, final int n, final Object o) {
        g = null;
        if ((n & 0x1) != 0x0) {
            title = pgi.getTitle();
        }
        else {
            title = null;
        }
        if ((n & 0x2) != 0x0) {
            description = pgi.getDescription();
        }
        else {
            description = null;
        }
        if ((n & 0x4) != 0x0) {
            i = pgi.i();
        }
        else {
            i = null;
        }
        if ((n & 0x8) != 0x0) {
            e = pgi.e();
        }
        else {
            e = null;
        }
        if ((n & 0x10) != 0x0) {
            b = pgi.b();
        }
        else {
            b = null;
        }
        if ((n & 0x20) != 0x0) {
            d = pgi.d();
        }
        else {
            d = null;
        }
        if ((n & 0x40) != 0x0) {
            f = pgi.f();
        }
        if ((n & 0x80) != 0x0) {
            h = pgi.h();
        }
        if ((n & 0x100) != 0x0) {
            k = pgi.k();
        }
        if ((n & 0x200) != 0x0) {
            a = pgi.a();
        }
        else {
            a = null;
        }
        if ((n & 0x400) != 0x0) {
            j = pgi.j();
        }
        if ((n & 0x800) != 0x0) {
            g = pgi.g();
        }
        return pgi.c(title, description, i, e, b, d, f, h, k, a, j, g);
    }
    
    public static float g(final Float3 float3, final float n, final float n2) {
        return float3.getZ() * n + n2;
    }
    
    public static String h(final String s, final int n, final String s2, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(n);
        sb.append(s2);
        sb.append(n2);
        return sb.toString();
    }
    
    public static ArrayList i(final int n, final HashMap hashMap, final ArrayList list, final int n2, final String s) {
        hashMap.put(n, list);
        final ArrayList list2 = new ArrayList(n2);
        list2.add(s);
        return list2;
    }
    
    public static String j(final int n) {
        if (n == 1) {
            return "ASSET";
        }
        if (n == 2) {
            return "PROFILE";
        }
        return "null";
    }
}

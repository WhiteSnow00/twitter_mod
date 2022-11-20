import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hur implements ypa<List<f9p>, List<gfv>>
{
    public static gfv f(final f9p f9p) {
        final gfv gfv = new gfv();
        final viw g = f9p.g;
        if (g != null) {
            gfv.a = g.a;
            gfv.c = 3;
            if (f9p instanceof wiw) {
                final rlv k = ((wiw)f9p).k;
                if (k != null) {
                    gfv.v1 = ((Enum)k.a()).name().toLowerCase(m5s.d());
                }
            }
        }
        else {
            final tqt h = f9p.h;
            if (h != null) {
                gfv.a = Long.parseLong(h.b);
                gfv.b = f9p.h.a;
                gfv.c = 36;
            }
            else if (f9p instanceof eca) {
                gfv.b = f9p.e;
                gfv.c = 16;
            }
            else if (f9p instanceof zp3) {
                gfv.b = f9p.e;
                gfv.c = 11;
                gfv.a = f9p.j;
            }
            else {
                gfv.b = f9p.c;
                gfv.c = 12;
            }
        }
        return gfv;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.g((List<f9p>)o);
    }
    
    public final List<gfv> g(final List<f9p> list) {
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final f9p f9p = list.get(i);
            if (f9p instanceof am3) {
                list2.addAll(new q4e(((am3)f9p).k, (gtb)new gur(i + 1)).s3());
            }
            else {
                final gfv f = f(f9p);
                f.f = i + 1;
                f.k = f9p.i;
                list2.add(f);
            }
        }
        return list2;
    }
}

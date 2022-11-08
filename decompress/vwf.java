import tv.periscope.model.b;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwf
{
    public static boolean a(final hfv hfv) {
        return hfv != null && (tdy.Y(hfv.H1) || tdy.Z(hfv.H1));
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final int c;
        public final List<dm3> d;
        public final o1g e;
        
        public a(final String a, final String b, final int c, final o1g e, final List<dm3> d) {
            this.a = a;
            this.b = b;
            this.e = e;
            this.c = c;
            this.d = d;
        }
    }
    
    public static final class b
    {
        public final Map<String, tv.periscope.model.b> a;
        public final Map<String, fpf> b;
        public final Map<String, qof> c;
        public final Map<String, mdq> d;
        public final Map<String, rh0> e;
        public final Map<String, hfv> f;
        
        public b(final Map<String, tv.periscope.model.b> map, final Map<String, fpf> map2, final Map<String, qof> map3, final Map<String, mdq> map4, final Map<String, rh0> map5, final Map<String, hfv> map6) {
            Object c0 = map;
            if (map == null) {
                c0 = a3a.C0;
            }
            this.a = (Map<String, tv.periscope.model.b>)c0;
            Object c2;
            if ((c2 = map2) == null) {
                c2 = a3a.C0;
            }
            this.b = (Map<String, fpf>)c2;
            Object c3;
            if ((c3 = map3) == null) {
                c3 = a3a.C0;
            }
            this.c = (Map<String, qof>)c3;
            Object c4;
            if ((c4 = map4) == null) {
                c4 = a3a.C0;
            }
            this.d = (Map<String, mdq>)c4;
            Object c5;
            if ((c5 = map5) == null) {
                c5 = a3a.C0;
            }
            this.e = (Map<String, rh0>)c5;
            Object c6;
            if ((c6 = map6) == null) {
                c6 = a3a.C0;
            }
            this.f = (Map<String, hfv>)c6;
        }
    }
}

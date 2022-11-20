import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5z implements p4j<vfz>
{
    public static final f5z a;
    public static final hwa b;
    public static final hwa c;
    public static final hwa d;
    public static final hwa e;
    public static final hwa f;
    public static final hwa g;
    public static final hwa h;
    public static final hwa i;
    public static final hwa j;
    public static final hwa k;
    
    static {
        a = new f5z();
        b = new hwa("durationMs", i81.w(oqf.o((Class)ary.class, new dqy(1))), (hwa$a)null);
        c = new hwa("errorCode", i81.w(oqf.o((Class)ary.class, new dqy(2))), (hwa$a)null);
        d = new hwa("isColdCall", i81.w(oqf.o((Class)ary.class, new dqy(3))), (hwa$a)null);
        e = new hwa("autoManageModelOnBackground", i81.w(oqf.o((Class)ary.class, new dqy(4))), (hwa$a)null);
        f = new hwa("autoManageModelOnLowMemory", i81.w(oqf.o((Class)ary.class, new dqy(5))), (hwa$a)null);
        g = new hwa("isNnApiEnabled", i81.w(oqf.o((Class)ary.class, new dqy(6))), (hwa$a)null);
        h = new hwa("eventsCount", i81.w(oqf.o((Class)ary.class, new dqy(7))), (hwa$a)null);
        i = new hwa("otherErrors", i81.w(oqf.o((Class)ary.class, new dqy(8))), (hwa$a)null);
        j = new hwa("remoteConfigValueForAcceleration", i81.w(oqf.o((Class)ary.class, new dqy(9))), (hwa$a)null);
        k = new hwa("isAccelerated", i81.w(oqf.o((Class)ary.class, new dqy(10))), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final vfz vfz = (vfz)o;
        final q4j q4j = (q4j)o2;
        q4j.a(f5z.b, vfz.a);
        q4j.a(f5z.c, vfz.b);
        q4j.a(f5z.d, vfz.c);
        q4j.a(f5z.e, vfz.d);
        q4j.a(f5z.f, vfz.e);
        q4j.a(f5z.g, null);
        q4j.a(f5z.h, null);
        q4j.a(f5z.i, null);
        q4j.a(f5z.j, null);
        q4j.a(f5z.k, null);
    }
}

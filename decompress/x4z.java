import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x4z implements p4j<kfz>
{
    public static final x4z a;
    public static final hwa b;
    public static final hwa c;
    public static final hwa d;
    public static final hwa e;
    
    static {
        a = new x4z();
        b = new hwa("imageFormat", i81.w(oqf.o((Class)ary.class, new dqy(1))), (hwa$a)null);
        c = new hwa("originalImageSize", i81.w(oqf.o((Class)ary.class, new dqy(2))), (hwa$a)null);
        d = new hwa("compressedImageSize", i81.w(oqf.o((Class)ary.class, new dqy(3))), (hwa$a)null);
        e = new hwa("isOdmlImage", i81.w(oqf.o((Class)ary.class, new dqy(4))), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final kfz kfz = (kfz)o;
        final q4j q4j = (q4j)o2;
        q4j.a(x4z.b, kfz.a);
        q4j.a(x4z.c, kfz.b);
        q4j.a(x4z.d, null);
        q4j.a(x4z.e, null);
    }
}

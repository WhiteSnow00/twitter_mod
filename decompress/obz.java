import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class obz implements p4j<nlz>
{
    public static final obz a;
    public static final hwa b;
    public static final hwa c;
    public static final hwa d;
    
    static {
        a = new obz();
        b = new hwa("languageOption", i81.w(oqf.o((Class)ary.class, new dqy(3))), (hwa$a)null);
        c = new hwa("isUsingLegacyApi", i81.w(oqf.o((Class)ary.class, new dqy(4))), (hwa$a)null);
        d = new hwa("sdkVersion", i81.w(oqf.o((Class)ary.class, new dqy(5))), (hwa$a)null);
    }
    
    public final void a(final Object o, final Object o2) throws IOException {
        final nlz nlz = (nlz)o;
        final q4j q4j = (q4j)o2;
        q4j.a(obz.b, nlz.a);
        q4j.a(obz.c, null);
        q4j.a(obz.d, null);
    }
}

import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgs
{
    public static final String a;
    
    static {
        a = vkr.X((CharSequence)"H", 10);
    }
    
    public static final long a(final sjs sjs, final lo8 lo8, final pjb$b pjb$b, final String s, final int n) {
        czd.f((Object)sjs, "style");
        czd.f((Object)lo8, "density");
        czd.f((Object)pjb$b, "fontFamilyResolver");
        czd.f((Object)s, "text");
        final f2a d0 = f2a.D0;
        final long c = uoz.c(0, 0, 15);
        final f50 f50 = new f50(s, sjs, (List<xc0$b<i0r>>)d0, (List<xc0$b<bhk>>)d0, pjb$b, lo8);
        return rp9.t(xli.A(f50.c()), xli.A(new e50(f50, n, false, c).getHeight()));
    }
}

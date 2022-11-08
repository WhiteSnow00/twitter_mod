import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dl3 implements xq<cl3>
{
    public static final dl3 a;
    
    static {
        a = new dl3();
    }
    
    @Override
    public final void a(final qle qle, final bb7 bb7, final Object o) {
        final cl3 cl3 = (cl3)o;
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)cl3, "value");
        qle.i2(cl3.C0);
    }
    
    @Override
    public final Object b(final eie eie, final bb7 bb7) {
        final String b = br.B(eie, "reader", bb7, "customScalarAdapters");
        Objects.requireNonNull(cl3.Companion);
        while (true) {
            for (final cl3 cl3 : cl3.values()) {
                if (zzd.a((Object)cl3.C0, (Object)b)) {
                    cl3 d0 = cl3;
                    if (cl3 == null) {
                        d0 = cl3.D0;
                    }
                    return d0;
                }
            }
            cl3 cl3 = null;
            continue;
        }
    }
}

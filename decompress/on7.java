import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class on7 implements xq<in7$e>
{
    public static final on7 a;
    public static final List<String> b;
    
    static {
        a = new on7();
        b = tdy.v0((Object[])new String[] { "message", "reason", "conversation_validation_failure_type", "user_validation_failure_type" });
    }
    
    public final in7$e c(final eie eie, final bb7 bb7) {
        zzd.f((Object)eie, "reader");
        zzd.f((Object)bb7, "customScalarAdapters");
        final su6 su7;
        final su6 su6 = su7 = null;
        su6 su8;
        Object o = su8 = su7;
        Object o2 = su7;
        Object d0 = su6;
    Label_0036:
        while (true) {
            final int k3 = eie.k3((List)on7.b);
            if (k3 != 0) {
                if (k3 == 1) {
                    final String s1 = eie.S1();
                    zzd.c((Object)s1);
                    Objects.requireNonNull(gn7.Companion);
                    final gn7[] values = gn7.values();
                    final int length = values.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final gn7 gn7 = values[i];
                            if (zzd.a((Object)gn7.C0, (Object)s1)) {
                                d0 = gn7;
                                if (gn7 == null) {
                                    d0 = gn7.D0;
                                    continue Label_0036;
                                }
                                continue Label_0036;
                            }
                            else {
                                ++i;
                            }
                        }
                        final gn7 gn7 = null;
                        continue;
                    }
                }
                if (k3 != 2) {
                    if (k3 != 3) {
                        break;
                    }
                    o = ar.b((xq<yjw>)zjw.a).b(eie, bb7);
                }
                else {
                    su8 = ar.b((xq<su6>)tu6.a).b(eie, bb7);
                }
            }
            else {
                o2 = ar.i.b(eie, bb7);
            }
        }
        zzd.c(d0);
        return new in7$e((String)o2, (gn7)d0, su8, (yjw)o);
    }
    
    public final void d(final qle qle, final bb7 bb7, final in7$e in7$e) {
        zzd.f((Object)qle, "writer");
        zzd.f((Object)bb7, "customScalarAdapters");
        zzd.f((Object)in7$e, "value");
        qle.A1("message");
        ar.i.a(qle, bb7, in7$e.a);
        qle.A1("reason");
        final gn7 b = in7$e.b;
        zzd.f((Object)b, "value");
        qle.i2(b.C0);
        qle.A1("conversation_validation_failure_type");
        ar.b((xq<su6>)tu6.a).a(qle, bb7, in7$e.c);
        qle.A1("user_validation_failure_type");
        ar.b((xq<yjw>)zjw.a).a(qle, bb7, in7$e.d);
    }
}

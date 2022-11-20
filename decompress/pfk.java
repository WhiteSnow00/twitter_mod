import java.io.IOException;
import java.io.Serializable;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pfk extends ywj<ofk>
{
    public static final Map<String, Class<? extends ofk$a>> a;
    
    static {
        final qjg t = qjg.t();
        for (final qfk qfk : qfk.values()) {
            final Class<? extends ofk$a> e0 = qfk.E0;
            if (e0 != null) {
                t.w((Object)qfk.D0, (Object)e0);
            }
        }
        a = (Map)((n4j)t).e();
    }
    
    public final Object parse(final tge tge) throws IOException {
        if (tge.e() == null) {
            tge.h0();
        }
        final vie e = tge.e();
        final vie l0 = vie.L0;
        final Object o = null;
        Object o2;
        if (e != l0) {
            tge.l0();
            o2 = o;
        }
        else {
            n4j n4j = null;
            qfk a;
            Serializable b = a = null;
            while (tge.h0() != vie.M0) {
                final String d = tge.d();
                tge.h0();
                final boolean equals = "payload".equals(d);
                final int n = 0;
                int n2 = 1;
                n4j n4j2 = null;
                String s = null;
                qfk f0 = null;
                Label_0514: {
                    if (equals) {
                        if (tge.e() == null) {
                            tge.h0();
                        }
                        if (tge.e() != vie.L0) {
                            tge.l0();
                            n4j2 = null;
                            s = (String)b;
                            f0 = a;
                        }
                        else {
                            Object o3 = null;
                            while (true) {
                                n4j2 = (n4j)o3;
                                s = (String)b;
                                f0 = a;
                                if (tge.h0() == vie.M0) {
                                    break;
                                }
                                final String d2 = tge.d();
                                tge.h0();
                                final Map<String, Class<? extends ofk$a>> a2 = pfk.a;
                                Object o4 = o3;
                                if (a2.containsKey(d2)) {
                                    if (o3 != null) {
                                        throw new JsonParseException("'payload' can only contain 1 known object", tge.c());
                                    }
                                    if (!qfk.L0.contains(d2)) {
                                        final Object c = gih.c(tge, (Class)a2.get(d2), false);
                                        final int a3 = c5j.a;
                                        o4 = c;
                                    }
                                    else {
                                        o4 = new qzb$a();
                                        final qjg t = qjg.t();
                                        while (tge.h0() != vie.M0) {
                                            final String j = tge.j();
                                            final int ordinal = ((Enum)tge.h0()).ordinal();
                                            if (ordinal != 1 && ordinal != 3) {
                                                if (ordinal != 7) {
                                                    continue;
                                                }
                                                if (j == null) {
                                                    continue;
                                                }
                                                t.w((Object)j, (Object)tge.j());
                                            }
                                            else {
                                                tge.l0();
                                            }
                                        }
                                        ((qzb$a)o4).c = (Map)((n4j)t).e();
                                    }
                                }
                                tge.l0();
                                o3 = o4;
                            }
                        }
                    }
                    else {
                        n4j2 = n4j;
                        s = (String)b;
                        f0 = a;
                        if ("topic".equals(d)) {
                            final String t2 = tge.T("");
                            final String[] split = t2.split("/");
                            n4j2 = n4j;
                            s = t2;
                            f0 = a;
                            if (split.length > 2) {
                                if ("system".equals(split[1])) {
                                    n2 = 2;
                                }
                                final String s2 = split[n2];
                                final qfk[] values = qfk.values();
                                for (int length = values.length, i = n; i < length; ++i) {
                                    f0 = values[i];
                                    if (f0.D0.equals(s2)) {
                                        n4j2 = n4j;
                                        s = t2;
                                        break Label_0514;
                                    }
                                }
                                f0 = qfk.F0;
                                s = t2;
                                n4j2 = n4j;
                            }
                        }
                    }
                }
                tge.l0();
                n4j = n4j2;
                b = s;
                a = f0;
            }
            if (n4j == null || b == null || a == null) {
                throw new JsonParseException("JSON for PipelineEvent missing expected values", tge.c());
            }
            ((ofk$a)n4j).a = a;
            final int a4 = c5j.a;
            ((ofk$a)n4j).b = (String)b;
            o2 = n4j.e();
        }
        return o2;
    }
}

import java.io.IOException;
import java.io.Serializable;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgk extends nxj<bgk>
{
    public static final Map<String, Class<? extends bgk$a>> a;
    
    static {
        final kkg t = kkg.t();
        for (final dgk dgk : dgk.values()) {
            final Class<? extends bgk$a> g0 = dgk.G0;
            if (g0 != null) {
                t.w((Object)dgk.F0, (Object)g0);
            }
        }
        a = (Map)((z4j)t).e();
    }
    
    public final Object parse(final qhe qhe) throws IOException {
        if (qhe.e() == null) {
            qhe.i0();
        }
        final rje e = qhe.e();
        final rje n0 = rje.N0;
        final Object o = null;
        Object o2;
        if (e != n0) {
            qhe.m0();
            o2 = o;
        }
        else {
            z4j z4j = null;
            dgk a;
            Serializable b = a = null;
            while (qhe.i0() != rje.O0) {
                final String d = qhe.d();
                qhe.i0();
                final boolean equals = "payload".equals(d);
                final int n2 = 0;
                int n3 = 1;
                z4j z4j2 = null;
                String s = null;
                dgk h0 = null;
                Label_0514: {
                    if (equals) {
                        if (qhe.e() == null) {
                            qhe.i0();
                        }
                        if (qhe.e() != rje.N0) {
                            qhe.m0();
                            z4j2 = null;
                            s = (String)b;
                            h0 = a;
                        }
                        else {
                            Object o3 = null;
                            while (true) {
                                z4j2 = (z4j)o3;
                                s = (String)b;
                                h0 = a;
                                if (qhe.i0() == rje.O0) {
                                    break;
                                }
                                final String d2 = qhe.d();
                                qhe.i0();
                                final Map<String, Class<? extends bgk$a>> a2 = cgk.a;
                                Object o4 = o3;
                                if (a2.containsKey(d2)) {
                                    if (o3 != null) {
                                        throw new JsonParseException("'payload' can only contain 1 known object", qhe.c());
                                    }
                                    if (!dgk.N0.contains(d2)) {
                                        final bgk$a c = uih.c(qhe, a2.get(d2), false);
                                        final int a3 = o5j.a;
                                        o4 = c;
                                    }
                                    else {
                                        o4 = new r0c$a();
                                        final kkg t = kkg.t();
                                        while (qhe.i0() != rje.O0) {
                                            final String j = qhe.j();
                                            final int ordinal = qhe.i0().ordinal();
                                            if (ordinal != 1 && ordinal != 3) {
                                                if (ordinal != 7) {
                                                    continue;
                                                }
                                                if (j == null) {
                                                    continue;
                                                }
                                                t.w((Object)j, (Object)qhe.j());
                                            }
                                            else {
                                                qhe.m0();
                                            }
                                        }
                                        ((r0c$a)o4).c = (Map)((z4j)t).e();
                                    }
                                }
                                qhe.m0();
                                o3 = o4;
                            }
                        }
                    }
                    else {
                        z4j2 = z4j;
                        s = (String)b;
                        h0 = a;
                        if ("topic".equals(d)) {
                            final String t2 = qhe.T("");
                            final String[] split = t2.split("/");
                            z4j2 = z4j;
                            s = t2;
                            h0 = a;
                            if (split.length > 2) {
                                if ("system".equals(split[1])) {
                                    n3 = 2;
                                }
                                final String s2 = split[n3];
                                final dgk[] values = dgk.values();
                                for (int length = values.length, i = n2; i < length; ++i) {
                                    h0 = values[i];
                                    if (h0.F0.equals(s2)) {
                                        z4j2 = z4j;
                                        s = t2;
                                        break Label_0514;
                                    }
                                }
                                h0 = dgk.H0;
                                s = t2;
                                z4j2 = z4j;
                            }
                        }
                    }
                }
                qhe.m0();
                z4j = z4j2;
                b = s;
                a = h0;
            }
            if (z4j == null || b == null || a == null) {
                throw new JsonParseException("JSON for PipelineEvent missing expected values", qhe.c());
            }
            ((bgk$a)z4j).a = a;
            final int a4 = o5j.a;
            ((bgk$a)z4j).b = (String)b;
            o2 = z4j.e();
        }
        return o2;
    }
}

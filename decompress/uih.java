import java.util.Map;
import java.util.Collection;
import com.bluelinelabs.logansquare.JsonMapper;
import java.util.List;
import java.io.InputStream;
import com.twitter.model.json.common.JsonModelRegistry;
import java.io.IOException;
import com.bluelinelabs.logansquare.LoganSquare;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uih
{
    public static final tfe a;
    public static ThreadLocal<Boolean> b;
    
    static {
        a = new tfe();
        uih.b = new ThreadLocal<Boolean>() {
            public final /* bridge */ Object initialValue() {
                return Boolean.FALSE;
            }
        };
    }
    
    public static qhe a(final String s) {
        try {
            final qhe g = LoganSquare.JSON_FACTORY.g(s);
            g.i0();
            return g;
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
            return null;
        }
    }
    
    public static <T> jxj<T> b(final Class<T> clazz) {
        JsonModelRegistry.a();
        return (jxj<T>)new ke4((Object)LoganSquare.typeConverterFor((Class)clazz), 5);
    }
    
    public static <T> T c(final qhe qhe, final Class<T> clazz, final boolean b) {
        if (yih.a(clazz)) {
            return f(qhe, clazz, b);
        }
        T t = null;
        try {
            try {
                uih.b.set(b);
                ((ke4)b(clazz)).f(qhe);
                uih.b.set(Boolean.FALSE);
            }
            finally {}
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
            uih.b.set(Boolean.FALSE);
            t = null;
        }
        return t;
        uih.b.set(Boolean.FALSE);
    }
    
    public static <T> T d(final InputStream inputStream, final Class<T> clazz) {
        T c = null;
        qhe e;
        try {
            e = LoganSquare.JSON_FACTORY.e(inputStream);
            e.i0();
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
            e = null;
        }
        if (e != null) {
            c = c(e, clazz, false);
        }
        return c;
    }
    
    public static <T> T e(final String s, final Class<T> clazz, final boolean b) {
        final qhe a = a(s);
        T c;
        if (a != null) {
            c = c(a, clazz, b);
        }
        else {
            c = null;
        }
        return c;
    }
    
    public static <J extends nge> J f(final qhe qhe, final Class<J> clazz, final boolean b) {
        JsonModelRegistry.a();
        try {
            try {
                uih.b.set(b);
                final nge nge = (nge)LoganSquare.mapperFor((Class)clazz).parse(qhe);
                uih.b.set(Boolean.FALSE);
                return (J)nge;
            }
            finally {}
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
            uih.b.set(Boolean.FALSE);
            return null;
        }
        uih.b.set(Boolean.FALSE);
    }
    
    public static <T> List<T> g(final qhe qhe, final Class<T> clazz, boolean h) {
        h = (boolean)ojf.H();
        Collection collection;
        if (yih.a(clazz)) {
            JsonModelRegistry.a();
            final JsonMapper mapper = LoganSquare.mapperFor((Class)clazz);
            try {
                try {
                    uih.b.set(Boolean.FALSE);
                    if (qhe.e() == rje.P0) {
                        while (qhe.i0() != rje.Q0) {
                            ((ojf)h).p((Object)mapper.parse(qhe));
                        }
                    }
                }
                finally {}
            }
            catch (final IOException ex) {
                r9a.d((Throwable)ex);
            }
            uih.b.set(Boolean.FALSE);
            collection = ((ojf$a)h).g();
            return (List<T>)collection;
            uih.b.set(Boolean.FALSE);
        }
        else {
            final jxj<T> b = b(clazz);
            try {
                try {
                    uih.b.set(Boolean.FALSE);
                    if (qhe.e() == rje.P0) {
                        while (qhe.i0() != rje.Q0) {
                            ((ojf)h).p(((ke4)b).f(qhe));
                        }
                    }
                }
                finally {}
            }
            catch (final IOException ex2) {
                r9a.d((Throwable)ex2);
            }
            uih.b.set(Boolean.FALSE);
            collection = ((ojf$a)h).g();
            return (List<T>)collection;
            uih.b.set(Boolean.FALSE);
        }
        return (List<T>)collection;
    }
    
    public static <T> Map<String, T> h(final qhe qhe, final Class<T> clazz) {
        return i(qhe, (Class)clazz, kkg.t());
    }
    
    public static <T> Map<String, T> i(final qhe qhe, final Class<T> clazz, final boolean b, final kkg<String, T> kkg) {
        if (!yih.a(clazz)) {
            return k(qhe, (jxj)b(clazz), (kkg)b);
        }
        JsonModelRegistry.a();
        final JsonMapper mapper = LoganSquare.mapperFor((Class)clazz);
        try {
            try {
                uih.b.set(Boolean.FALSE);
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() != rje.X0) {
                        ((kkg)b).w((Object)j, (Object)mapper.parse(qhe));
                    }
                }
            }
            finally {}
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
        }
        uih.b.set(Boolean.FALSE);
        return (Map)((z4j)b).e();
        uih.b.set(Boolean.FALSE);
    }
    
    public static <T> Iterable<T> j(final qhe qhe, final Class<T> clazz) {
        return i(qhe, (Class)clazz, kkg.t()).values();
    }
    
    public static <T> Map<String, T> k(final qhe qhe, final jxj<T> jxj, final boolean b, final kkg<String, T> kkg) {
        try {
            try {
                uih.b.set(Boolean.FALSE);
                while (qhe.i0() != rje.O0) {
                    final String j = qhe.j();
                    qhe.i0();
                    if (qhe.e() != rje.X0) {
                        ((kkg)b).w((Object)j, jxj.f(qhe));
                    }
                }
            }
            finally {}
        }
        catch (final IOException ex) {
            r9a.d((Throwable)ex);
        }
        uih.b.set(Boolean.FALSE);
        return (Map)((z4j)b).e();
        uih.b.set(Boolean.FALSE);
    }
}

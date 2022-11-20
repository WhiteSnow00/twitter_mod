import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.io.OutputStream;
import java.util.Map;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c100 implements q4j
{
    public static final Charset f;
    public static final hwa g;
    public static final hwa h;
    public static final p4j<Map.Entry<Object, Object>> i;
    public OutputStream a;
    public final Map<Class<?>, p4j<?>> b;
    public final Map<Class<?>, oow<?>> c;
    public final p4j<Object> d;
    public final xay e;
    
    static {
        final zzz d0 = zzz.D0;
        f = Charset.forName("UTF-8");
        final dyz dyz = new dyz(1, d0);
        final HashMap hashMap = new HashMap();
        hashMap.put(k000.class, dyz);
        g = new hwa("key", i81.w(hashMap), (hwa$a)null);
        final dyz dyz2 = new dyz(2, d0);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(k000.class, dyz2);
        h = new hwa("value", i81.w(hashMap2), (hwa$a)null);
        c100.i = t000.a;
    }
    
    public c100(final OutputStream a, final Map<Class<?>, p4j<?>> b, final Map<Class<?>, oow<?>> c, final p4j<Object> d) {
        this.e = new xay(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static int i(final hwa hwa) {
        final k000 k000 = (k000)hwa.a((Class)k000.class);
        if (k000 != null) {
            return ((dyz)k000).b;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public static ByteBuffer k(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    @Override
    public final q4j a(final hwa hwa, final Object o) throws IOException {
        this.b(hwa, o, true);
        return this;
    }
    
    public final q4j b(final hwa c, final Object o, final boolean b) throws IOException {
        if (o == null) {
            return this;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return this;
            }
            this.l(i(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(c100.f);
            this.l(bytes.length);
            this.a.write(bytes);
            return this;
        }
        else {
            if (o instanceof Collection) {
                final Iterator iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.b(c, iterator.next(), false);
                }
                return this;
            }
            if (o instanceof Map) {
                final Iterator iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.j((p4j<Map.Entry>)c100.i, c, (Map.Entry)iterator2.next(), false);
                }
                return this;
            }
            if (o instanceof Double) {
                final double doubleValue = (double)o;
                if (!b || doubleValue != 0.0) {
                    this.l(i(c) << 3 | 0x1);
                    this.a.write(k(8).putDouble(doubleValue).array());
                }
                return this;
            }
            if (o instanceof Float) {
                final float floatValue = (float)o;
                if (!b || floatValue != 0.0f) {
                    this.l(i(c) << 3 | 0x5);
                    this.a.write(k(4).putFloat(floatValue).array());
                }
                return this;
            }
            if (o instanceof Number) {
                this.g(c, ((Number)o).longValue(), b);
                return this;
            }
            if (o instanceof Boolean) {
                this.c(c, ((boolean)o) ? 1 : 0, b);
                return this;
            }
            if (o instanceof byte[]) {
                final byte[] array = (byte[])o;
                if (b && array.length == 0) {
                    return this;
                }
                this.l(i(c) << 3 | 0x2);
                this.l(array.length);
                this.a.write(array);
                return this;
            }
            else {
                final p4j p4j = this.b.get(o.getClass());
                if (p4j != null) {
                    this.j((p4j<Object>)p4j, c, o, b);
                    return this;
                }
                final oow oow = this.c.get(o.getClass());
                if (oow != null) {
                    final xay e = this.e;
                    e.a = false;
                    e.c = c;
                    e.b = b;
                    ((q3a<Object, xay>)oow).a(o, e);
                    return this;
                }
                if (o instanceof qzz) {
                    this.c(c, ((qzz)o).a(), true);
                    return this;
                }
                if (o instanceof Enum) {
                    this.c(c, ((Enum)o).ordinal(), true);
                    return this;
                }
                this.j(this.d, c, o, b);
                return this;
            }
        }
    }
    
    public final c100 c(final hwa hwa, final int n, final boolean b) throws IOException {
        if (b && n == 0) {
            return this;
        }
        final k000 k000 = (k000)hwa.a((Class)k000.class);
        if (k000 != null) {
            final dyz dyz = (dyz)k000;
            final int ordinal = ((Enum)dyz.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(dyz.b << 3 | 0x5);
                        this.a.write(k(4).putInt(n).array());
                    }
                }
                else {
                    this.l(dyz.b << 3);
                    this.l(n + n ^ n >> 31);
                }
            }
            else {
                this.l(dyz.b << 3);
                this.l(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    @Override
    public final /* bridge */ q4j d(final hwa hwa, final boolean b) throws IOException {
        this.c(hwa, b ? 1 : 0, true);
        return this;
    }
    
    @Override
    public final /* bridge */ q4j e(final hwa hwa, final int n) throws IOException {
        this.c(hwa, n, true);
        return this;
    }
    
    @Override
    public final /* bridge */ q4j f(final hwa hwa, final long n) throws IOException {
        this.g(hwa, n, true);
        return this;
    }
    
    public final c100 g(final hwa hwa, final long n, final boolean b) throws IOException {
        if (b && n == 0L) {
            return this;
        }
        final k000 k000 = (k000)hwa.a((Class)k000.class);
        if (k000 != null) {
            final dyz dyz = (dyz)k000;
            final int ordinal = ((Enum)dyz.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(dyz.b << 3 | 0x1);
                        this.a.write(k(8).putLong(n).array());
                    }
                }
                else {
                    this.l(dyz.b << 3);
                    this.m(n >> 63 ^ n + n);
                }
            }
            else {
                this.l(dyz.b << 3);
                this.m(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public final c100 h(final Object o) throws IOException {
        final p4j p4j = this.b.get(o.getClass());
        if (p4j != null) {
            ((q3a<Object, c100>)p4j).a(o, this);
            return this;
        }
        final String value = String.valueOf(o.getClass());
        throw new EncodingException(ed.B(new StringBuilder(value.length() + 15), "No encoder for ", value));
    }
    
    public final <T> c100 j(final p4j<T> q3a, final hwa hwa, final T t, final boolean b) throws IOException {
        final ezz a = new ezz();
        try {
            final OutputStream a2 = this.a;
            this.a = a;
            try {
                q3a.a(t, this);
                this.a = a2;
                final long d0 = a.D0;
                a.close();
                if (b && d0 == 0L) {
                    return this;
                }
                this.l(i(hwa) << 3 | 0x2);
                this.m(d0);
                q3a.a(t, this);
                return this;
            }
            finally {
                this.a = a2;
            }
        }
        finally {
            try {
                a.close();
            }
            finally {
                final Throwable t2;
                ((Throwable)q3a).addSuppressed(t2);
            }
        }
    }
    
    public final void l(int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0x0L) {
            this.a.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write(n & 0x7F);
    }
    
    public final void m(long n) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.a.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write((int)n & 0x7F);
    }
}

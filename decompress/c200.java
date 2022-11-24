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

public final class c200 implements c5j
{
    public static final Charset f;
    public static final lxa g;
    public static final lxa h;
    public static final b5j<Map.Entry<Object, Object>> i;
    public OutputStream a;
    public final Map<Class<?>, b5j<?>> b;
    public final Map<Class<?>, dpw<?>> c;
    public final b5j<Object> d;
    public final rby e;
    
    static {
        final z000 f2 = z000.F0;
        f = Charset.forName("UTF-8");
        final czz czz = new czz(1, f2);
        final HashMap hashMap = new HashMap();
        hashMap.put(k100.class, czz);
        g = new lxa("key", wa0.A(hashMap), null);
        final czz czz2 = new czz(2, f2);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(k100.class, czz2);
        h = new lxa("value", wa0.A(hashMap2), null);
        c200.i = t100.a;
    }
    
    public c200(final OutputStream a, final Map<Class<?>, b5j<?>> b, final Map<Class<?>, dpw<?>> c, final b5j<Object> d) {
        this.e = new rby(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static int i(final lxa lxa) {
        final k100 k100 = lxa.a(k100.class);
        if (k100 != null) {
            return ((czz)k100).b;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public static ByteBuffer k(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    @Override
    public final c5j a(final lxa lxa, final Object o) throws IOException {
        this.b(lxa, o, true);
        return this;
    }
    
    public final c5j b(final lxa c, final Object o, final boolean b) throws IOException {
        if (o == null) {
            return this;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return this;
            }
            this.l(i(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(c200.f);
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
                    this.j((b5j<Map.Entry>)c200.i, c, (Map.Entry)iterator2.next(), false);
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
                final b5j b5j = this.b.get(o.getClass());
                if (b5j != null) {
                    this.j(b5j, c, o, b);
                    return this;
                }
                final dpw dpw = this.c.get(o.getClass());
                if (dpw != null) {
                    final rby e = this.e;
                    e.a = false;
                    e.c = c;
                    e.b = b;
                    ((s4a)dpw).a(o, (Object)e);
                    return this;
                }
                if (o instanceof q000) {
                    this.c(c, ((q000)o).a(), true);
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
    
    public final c200 c(final lxa lxa, final int n, final boolean b) throws IOException {
        if (b && n == 0) {
            return this;
        }
        final k100 k100 = lxa.a(k100.class);
        if (k100 != null) {
            final czz czz = (czz)k100;
            final int ordinal = ((Enum)czz.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(czz.b << 3 | 0x5);
                        this.a.write(k(4).putInt(n).array());
                    }
                }
                else {
                    this.l(czz.b << 3);
                    this.l(n + n ^ n >> 31);
                }
            }
            else {
                this.l(czz.b << 3);
                this.l(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    @Override
    public final /* bridge */ c5j d(final lxa lxa, final boolean b) throws IOException {
        this.c(lxa, b ? 1 : 0, true);
        return this;
    }
    
    @Override
    public final /* bridge */ c5j e(final lxa lxa, final int n) throws IOException {
        this.c(lxa, n, true);
        return this;
    }
    
    @Override
    public final /* bridge */ c5j f(final lxa lxa, final long n) throws IOException {
        this.g(lxa, n, true);
        return this;
    }
    
    public final c200 g(final lxa lxa, final long n, final boolean b) throws IOException {
        if (b && n == 0L) {
            return this;
        }
        final k100 k100 = lxa.a(k100.class);
        if (k100 != null) {
            final czz czz = (czz)k100;
            final int ordinal = ((Enum)czz.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(czz.b << 3 | 0x1);
                        this.a.write(k(8).putLong(n).array());
                    }
                }
                else {
                    this.l(czz.b << 3);
                    this.m(n >> 63 ^ n + n);
                }
            }
            else {
                this.l(czz.b << 3);
                this.m(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public final c200 h(final Object o) throws IOException {
        final b5j b5j = this.b.get(o.getClass());
        if (b5j != null) {
            ((s4a)b5j).a(o, (Object)this);
            return this;
        }
        final String value = String.valueOf(o.getClass());
        throw new EncodingException(m51.y(new StringBuilder(value.length() + 15), "No encoder for ", value));
    }
    
    public final <T> c200 j(final b5j<T> s4a, final lxa lxa, final T t, final boolean b) throws IOException {
        final e000 a = new e000();
        try {
            final OutputStream a2 = this.a;
            this.a = (OutputStream)a;
            try {
                s4a.a((Object)t, (Object)this);
                this.a = a2;
                final long f0 = a.F0;
                ((OutputStream)a).close();
                if (b && f0 == 0L) {
                    return this;
                }
                this.l(i(lxa) << 3 | 0x2);
                this.m(f0);
                s4a.a((Object)t, (Object)this);
                return this;
            }
            finally {
                this.a = a2;
            }
        }
        finally {
            try {
                ((OutputStream)a).close();
            }
            finally {
                final Throwable t2;
                ((Throwable)s4a).addSuppressed(t2);
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

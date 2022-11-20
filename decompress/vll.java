import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import com.google.firebase.encoders.EncodingException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import java.util.Map;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vll implements q4j
{
    public static final Charset f;
    public static final hwa g;
    public static final hwa h;
    public static final p4j<Map.Entry<Object, Object>> i;
    public OutputStream a;
    public final Map<Class<?>, p4j<?>> b;
    public final Map<Class<?>, oow<?>> c;
    public final p4j<Object> d;
    public final yll e;
    
    static {
        f = Charset.forName("UTF-8");
        g = new hwa("key", i81.w(wk0.B((Class)tll.class, new ex0(1))), (hwa$a)null);
        h = new hwa("value", i81.w(wk0.B((Class)tll.class, new ex0(2))), (hwa$a)null);
        vll.i = ull.a;
    }
    
    public vll(final OutputStream a, final Map<Class<?>, p4j<?>> b, final Map<Class<?>, oow<?>> c, final p4j<Object> d) {
        this.e = new yll(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static ByteBuffer h(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public static int j(final hwa hwa) {
        final tll tll = (tll)hwa.a((Class)tll.class);
        if (tll != null) {
            return ((ex0)tll).b;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    @Override
    public final q4j a(final hwa hwa, final Object o) throws IOException {
        return this.b(hwa, o, true);
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
            this.k(j(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(vll.f);
            this.k(bytes.length);
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
                    this.i((p4j<Map.Entry>)vll.i, c, (Map.Entry)iterator2.next(), false);
                }
                return this;
            }
            if (o instanceof Double) {
                final double doubleValue = (double)o;
                if (!b || doubleValue != 0.0) {
                    this.k(j(c) << 3 | 0x1);
                    this.a.write(h(8).putDouble(doubleValue).array());
                }
                return this;
            }
            if (o instanceof Float) {
                final float floatValue = (float)o;
                if (!b || floatValue != 0.0f) {
                    this.k(j(c) << 3 | 0x5);
                    this.a.write(h(4).putFloat(floatValue).array());
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
                this.k(j(c) << 3 | 0x2);
                this.k(array.length);
                this.a.write(array);
                return this;
            }
            else {
                final p4j p4j = this.b.get(o.getClass());
                if (p4j != null) {
                    this.i((p4j<Object>)p4j, c, o, b);
                    return this;
                }
                final oow oow = this.c.get(o.getClass());
                if (oow != null) {
                    final yll e = this.e;
                    e.a = false;
                    e.c = c;
                    e.b = b;
                    ((q3a<Object, yll>)oow).a(o, e);
                    return this;
                }
                if (o instanceof qll) {
                    this.c(c, ((qll)o).getNumber(), true);
                    return this;
                }
                if (o instanceof Enum) {
                    this.c(c, ((Enum)o).ordinal(), true);
                    return this;
                }
                this.i(this.d, c, o, b);
                return this;
            }
        }
    }
    
    public final vll c(final hwa hwa, final int n, final boolean b) throws IOException {
        if (b && n == 0) {
            return this;
        }
        final tll tll = (tll)hwa.a((Class)tll.class);
        if (tll != null) {
            this.k(((ex0)tll).b << 3);
            this.k(n);
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    @Override
    public final q4j d(final hwa hwa, final boolean b) throws IOException {
        this.c(hwa, b ? 1 : 0, true);
        return this;
    }
    
    @Override
    public final q4j e(final hwa hwa, final int n) throws IOException {
        this.c(hwa, n, true);
        return this;
    }
    
    @Override
    public final q4j f(final hwa hwa, final long n) throws IOException {
        this.g(hwa, n, true);
        return this;
    }
    
    public final vll g(final hwa hwa, final long n, final boolean b) throws IOException {
        if (b && n == 0L) {
            return this;
        }
        final tll tll = (tll)hwa.a((Class)tll.class);
        if (tll != null) {
            this.k(((ex0)tll).b << 3);
            this.l(n);
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public final <T> vll i(final p4j<T> q3a, final hwa hwa, final T t, final boolean b) throws IOException {
        final v6f a = new v6f();
        try {
            final OutputStream a2 = this.a;
            this.a = (OutputStream)a;
            try {
                q3a.a(t, this);
                this.a = a2;
                final long d0 = a.D0;
                ((OutputStream)a).close();
                if (b && d0 == 0L) {
                    return this;
                }
                this.k(j(hwa) << 3 | 0x2);
                this.l(d0);
                q3a.a(t, this);
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
                ((Throwable)q3a).addSuppressed(t2);
            }
        }
    }
    
    public final void k(int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0x0L) {
            this.a.write((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write(n & 0x7F);
    }
    
    public final void l(long n) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.a.write(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.a.write((int)n & 0x7F);
    }
}

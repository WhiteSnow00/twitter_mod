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

public final class yqy implements k4j
{
    public static final Charset f;
    public static final lxa g;
    public static final lxa h;
    public static final j4j<Map.Entry<Object, Object>> i;
    public OutputStream a;
    public final Map<Class<?>, j4j<?>> b;
    public final Map<Class<?>, tnw<?>> c;
    public final j4j<Object> d;
    public final iry e;
    
    static {
        f = Charset.forName("UTF-8");
        final vpy vpy = new vpy(0);
        vpy.b = 1;
        final qqy f2 = vpy.f();
        final HashMap hashMap = new HashMap();
        hashMap.put(qqy.class, f2);
        g = new lxa("key", xa0.C(hashMap), (lxa$a)null);
        final vpy vpy2 = new vpy(0);
        vpy2.b = 2;
        final qqy f3 = vpy2.f();
        final HashMap hashMap2 = new HashMap();
        hashMap2.put(qqy.class, f3);
        h = new lxa("value", xa0.C(hashMap2), (lxa$a)null);
        yqy.i = uqy.a;
    }
    
    public yqy(final OutputStream a, final Map<Class<?>, j4j<?>> b, final Map<Class<?>, tnw<?>> c, final j4j<Object> d) {
        this.e = new iry(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static int i(final lxa lxa) {
        final qqy qqy = (qqy)lxa.a((Class)qqy.class);
        if (qqy != null) {
            return ((rpy)qqy).b;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public static ByteBuffer k(final int n) {
        return ByteBuffer.allocate(n).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    public final k4j a(final lxa lxa, final Object o) throws IOException {
        this.b(lxa, o, true);
        return (k4j)this;
    }
    
    public final k4j b(final lxa c, final Object o, final boolean b) throws IOException {
        if (o == null) {
            return (k4j)this;
        }
        if (o instanceof CharSequence) {
            final CharSequence charSequence = (CharSequence)o;
            if (b && charSequence.length() == 0) {
                return (k4j)this;
            }
            this.l(i(c) << 3 | 0x2);
            final byte[] bytes = charSequence.toString().getBytes(yqy.f);
            this.l(bytes.length);
            this.a.write(bytes);
            return (k4j)this;
        }
        else {
            if (o instanceof Collection) {
                final Iterator iterator = ((Collection)o).iterator();
                while (iterator.hasNext()) {
                    this.b(c, iterator.next(), false);
                }
                return (k4j)this;
            }
            if (o instanceof Map) {
                final Iterator iterator2 = ((Map)o).entrySet().iterator();
                while (iterator2.hasNext()) {
                    this.j((j4j<Map.Entry>)yqy.i, c, (Map.Entry)iterator2.next(), false);
                }
                return (k4j)this;
            }
            if (o instanceof Double) {
                final double doubleValue = (double)o;
                if (!b || doubleValue != 0.0) {
                    this.l(i(c) << 3 | 0x1);
                    this.a.write(k(8).putDouble(doubleValue).array());
                }
                return (k4j)this;
            }
            if (o instanceof Float) {
                final float floatValue = (float)o;
                if (!b || floatValue != 0.0f) {
                    this.l(i(c) << 3 | 0x5);
                    this.a.write(k(4).putFloat(floatValue).array());
                }
                return (k4j)this;
            }
            if (o instanceof Number) {
                this.g(c, ((Number)o).longValue(), b);
                return (k4j)this;
            }
            if (o instanceof Boolean) {
                this.c(c, ((boolean)o) ? 1 : 0, b);
                return (k4j)this;
            }
            if (o instanceof byte[]) {
                final byte[] array = (byte[])o;
                if (b && array.length == 0) {
                    return (k4j)this;
                }
                this.l(i(c) << 3 | 0x2);
                this.l(array.length);
                this.a.write(array);
                return (k4j)this;
            }
            else {
                final j4j j4j = this.b.get(o.getClass());
                if (j4j != null) {
                    this.j(j4j, c, o, b);
                    return (k4j)this;
                }
                final tnw tnw = this.c.get(o.getClass());
                if (tnw != null) {
                    final iry e = this.e;
                    e.a = false;
                    e.c = c;
                    e.b = b;
                    ((g4a)tnw).a(o, (Object)e);
                    return (k4j)this;
                }
                if (o instanceof gqy) {
                    this.c(c, ((gqy)o).a(), true);
                    return (k4j)this;
                }
                if (o instanceof Enum) {
                    this.c(c, ((Enum)o).ordinal(), true);
                    return (k4j)this;
                }
                this.j(this.d, c, o, b);
                return (k4j)this;
            }
        }
    }
    
    public final yqy c(final lxa lxa, final int n, final boolean b) throws IOException {
        if (b && n == 0) {
            return this;
        }
        final qqy qqy = (qqy)lxa.a((Class)qqy.class);
        if (qqy != null) {
            final rpy rpy = (rpy)qqy;
            final int ordinal = ((Enum)rpy.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(rpy.b << 3 | 0x5);
                        this.a.write(k(4).putInt(n).array());
                    }
                }
                else {
                    this.l(rpy.b << 3);
                    this.l(n + n ^ n >> 31);
                }
            }
            else {
                this.l(rpy.b << 3);
                this.l(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public final yqy g(final lxa lxa, final long n, final boolean b) throws IOException {
        if (b && n == 0L) {
            return this;
        }
        final qqy qqy = (qqy)lxa.a((Class)qqy.class);
        if (qqy != null) {
            final rpy rpy = (rpy)qqy;
            final int ordinal = ((Enum)rpy.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        this.l(rpy.b << 3 | 0x1);
                        this.a.write(k(8).putLong(n).array());
                    }
                }
                else {
                    this.l(rpy.b << 3);
                    this.m(n >> 63 ^ n + n);
                }
            }
            else {
                this.l(rpy.b << 3);
                this.m(n);
            }
            return this;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
    
    public final yqy h(final Object o) throws IOException {
        final j4j j4j = this.b.get(o.getClass());
        if (j4j != null) {
            ((g4a)j4j).a(o, (Object)this);
            return this;
        }
        final String value = String.valueOf(o.getClass());
        throw new EncodingException(hi.I(new StringBuilder(value.length() + 15), "No encoder for ", value));
    }
    
    public final <T> yqy j(final j4j<T> g4a, final lxa lxa, final T t, final boolean b) throws IOException {
        final bqy a = new bqy();
        try {
            final OutputStream a2 = this.a;
            this.a = (OutputStream)a;
            try {
                g4a.a((Object)t, (Object)this);
                this.a = a2;
                final long c0 = a.C0;
                ((OutputStream)a).close();
                if (b && c0 == 0L) {
                    return this;
                }
                this.l(i(lxa) << 3 | 0x2);
                this.m(c0);
                g4a.a((Object)t, (Object)this);
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
                ((Throwable)g4a).addSuppressed(t2);
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

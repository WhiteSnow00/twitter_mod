import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irz
{
    public static final Unsafe a;
    public static final Class b;
    public static final hrz c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;
    
    static {
        final Unsafe unsafe = a = k();
        b = wfz.a();
        final Class<Long> type = Long.TYPE;
        final boolean u = u(type);
        boolean u2 = u(Integer.TYPE);
        Object c2 = null;
        Label_0071: {
            if (unsafe != null) {
                if (u) {
                    c2 = new grz(unsafe);
                    break Label_0071;
                }
                if (u2) {
                    c2 = new frz(unsafe);
                    break Label_0071;
                }
            }
            c2 = null;
        }
        c = (hrz)c2;
        final boolean b2 = true;
        Label_0153: {
            if (c2 != null) {
                final Unsafe a2 = ((hrz)c2).a;
                try {
                    final Class<? extends Unsafe> class1 = a2.getClass();
                    class1.getMethod("objectFieldOffset", Field.class);
                    class1.getMethod("getLong", Object.class, type);
                    if (b() != null) {
                        u2 = true;
                        break Label_0153;
                    }
                }
                finally {
                    final Throwable t;
                    l(t);
                }
            }
            u2 = false;
        }
        d = u2;
        final hrz c3 = irz.c;
        Label_0377: {
            if (c3 != null) {
                final Unsafe a3 = c3.a;
                try {
                    final Class<? extends Unsafe> class2 = a3.getClass();
                    class2.getMethod("objectFieldOffset", Field.class);
                    class2.getMethod("arrayBaseOffset", Class.class);
                    class2.getMethod("arrayIndexScale", Class.class);
                    final Class<Long> type2 = Long.TYPE;
                    class2.getMethod("getInt", Object.class, type2);
                    class2.getMethod("putInt", Object.class, type2, Integer.TYPE);
                    class2.getMethod("getLong", Object.class, type2);
                    class2.getMethod("putLong", Object.class, type2, type2);
                    class2.getMethod("getObject", Object.class, type2);
                    class2.getMethod("putObject", Object.class, type2, Object.class);
                    u2 = true;
                    break Label_0377;
                }
                finally {
                    final Throwable t2;
                    l(t2);
                }
            }
            u2 = false;
        }
        e = u2;
        f = w(byte[].class);
        w(boolean[].class);
        a(boolean[].class);
        w(int[].class);
        a(int[].class);
        w(long[].class);
        a(long[].class);
        w(float[].class);
        a(float[].class);
        w(double[].class);
        a(double[].class);
        w(Object[].class);
        a(Object[].class);
        final Field b3 = b();
        if (b3 != null) {
            final hrz c4 = irz.c;
            if (c4 != null) {
                c4.l(b3);
            }
        }
        g = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b2);
    }
    
    public static int a(final Class clazz) {
        if (irz.e) {
            return irz.c.i(clazz);
        }
        return -1;
    }
    
    public static Field b() {
        final int a = wfz.a;
        Field field;
        try {
            Buffer.class.getDeclaredField("effectiveDirectAddress");
        }
        finally {
            field = null;
        }
        if (field != null) {
            return field;
        }
        Field field2;
        try {
            Buffer.class.getDeclaredField("address");
        }
        finally {
            field2 = null;
        }
        if (field2 != null && field2.getType() == Long.TYPE) {
            return field2;
        }
        return null;
    }
    
    public static void c(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final hrz c = irz.c;
        final int j = c.j(o, n2);
        final int n3 = (~(int)n & 0x3) << 3;
        c.n(o, n2, (0xFF & b) << n3 | (j & ~(255 << n3)));
    }
    
    public static void d(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final hrz c = irz.c;
        final int j = c.j(o, n2);
        final int n3 = ((int)n & 0x3) << 3;
        c.n(o, n2, (0xFF & b) << n3 | (j & ~(255 << n3)));
    }
    
    public static double e(final Object o, final long n) {
        return irz.c.a(o, n);
    }
    
    public static float f(final Object o, final long n) {
        return irz.c.b(o, n);
    }
    
    public static int g(final Object o, final long n) {
        return irz.c.j(o, n);
    }
    
    public static long h(final Object o, final long n) {
        return irz.c.k(o, n);
    }
    
    public static Object i(final Class clazz) {
        try {
            return irz.a.allocateInstance(clazz);
        }
        catch (final InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static Object j(final Object o, final long n) {
        return irz.c.m(o, n);
    }
    
    public static Unsafe k() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new erz());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    public static /* bridge */ void l(final Throwable t) {
        Logger.getLogger(irz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(t.toString()));
    }
    
    public static void m(final Object o, final long n, final boolean b) {
        irz.c.c(o, n, b);
    }
    
    public static void n(final Object o, final long n, final double n2) {
        irz.c.e(o, n, n2);
    }
    
    public static void o(final Object o, final long n, final float n2) {
        irz.c.f(o, n, n2);
    }
    
    public static void p(final Object o, final long n, final int n2) {
        irz.c.n(o, n, n2);
    }
    
    public static void q(final Object o, final long n, final long n2) {
        irz.c.o(o, n, n2);
    }
    
    public static void r(final Object o, final long n, final Object o2) {
        irz.c.p(o, n, o2);
    }
    
    public static /* bridge */ boolean s(final Object o, final long n) {
        return (byte)(irz.c.j(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((~n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    public static /* bridge */ boolean t(final Object o, final long n) {
        return (byte)(irz.c.j(o, 0xFFFFFFFFFFFFFFFCL & n) >>> (int)((n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    public static boolean u(final Class clazz) {
        final int a = wfz.a;
        try {
            final Class b = irz.b;
            final Class<Boolean> type = Boolean.TYPE;
            b.getMethod("peekLong", clazz, type);
            b.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class<Integer> type2 = Integer.TYPE;
            b.getMethod("pokeInt", clazz, type2, type);
            b.getMethod("peekInt", clazz, type);
            b.getMethod("pokeByte", clazz, Byte.TYPE);
            b.getMethod("peekByte", clazz);
            b.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            b.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    public static boolean v(final Object o, final long n) {
        return irz.c.g(o, n);
    }
    
    public static int w(final Class clazz) {
        if (irz.e) {
            return irz.c.h(clazz);
        }
        return -1;
    }
}

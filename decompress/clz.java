import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class clz<MessageType extends clz<MessageType, BuilderType>, BuilderType extends akz<MessageType, BuilderType>> extends tfz<MessageType, BuilderType>
{
    private static final Map zza;
    public zqz zzc;
    public int zzd;
    
    static {
        zza = (Map)new ConcurrentHashMap();
    }
    
    public clz() {
        this.zzc = zqz.f;
        this.zzd = -1;
    }
    
    public static clz l(final Class clazz) {
        final Map zza = clz.zza;
        clz clz;
        if ((clz = zza.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                clz = zza.get(clazz);
            }
            catch (final ClassNotFoundException ex) {
                throw new IllegalStateException("Class initialization cannot fail.", ex);
            }
        }
        clz clz2;
        if ((clz2 = clz) == null) {
            clz2 = (clz)((clz)irz.i(clazz)).r(6);
            if (clz2 == null) {
                throw new IllegalStateException();
            }
            zza.put(clazz, clz2);
        }
        return clz2;
    }
    
    public static plz m(final plz plz) {
        final ymz ymz = (ymz)plz;
        final int f0 = ymz.F0;
        int n;
        if (f0 == 0) {
            n = 10;
        }
        else {
            n = f0 + f0;
        }
        return ymz.i(n);
    }
    
    public static rlz n(final rlz rlz) {
        final int size = rlz.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return rlz.V(n);
    }
    
    public static Object o(final Method method, final Object o, final Object... array) {
        try {
            return method.invoke(o, array);
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ex2);
        }
    }
    
    public static void p(final Class clazz, final clz clz) {
        clz.zza.put(clazz, clz);
    }
    
    public final joz a() {
        return (joz)this.r(5);
    }
    
    public final int b() {
        return this.zzd;
    }
    
    public final int c() {
        int zzd;
        if ((zzd = this.zzd) == -1) {
            zzd = gpz.c.a((Class)this.getClass()).b((Object)this);
            this.zzd = zzd;
        }
        return zzd;
    }
    
    public final joz d() {
        final akz akz = (akz)this.r(5);
        akz.h(this);
        return (joz)akz;
    }
    
    public final loz e() {
        return (loz)this.r(6);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && gpz.c.a((Class)this.getClass()).i((Object)this, (Object)o));
    }
    
    public final void h(final int zzd) {
        this.zzd = zzd;
    }
    
    public final int hashCode() {
        final int zzb = super.zzb;
        if (zzb != 0) {
            return zzb;
        }
        return super.zzb = gpz.c.a((Class)this.getClass()).e((Object)this);
    }
    
    public final akz j() {
        return (akz)this.r(5);
    }
    
    public final akz k() {
        final akz akz = (akz)this.r(5);
        akz.h(this);
        return akz;
    }
    
    public final void q(final jiz jiz) throws IOException {
        final opz a = gpz.c.a((Class)this.getClass());
        final niz w0 = jiz.W0;
        Object o;
        if (w0 != null) {
            o = w0;
        }
        else {
            o = new niz(jiz);
        }
        a.d((Object)this, (gsz)o);
    }
    
    public abstract Object r(final int p0);
    
    public final String toString() {
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        qoz.c((loz)this, sb, 0);
        return sb.toString();
    }
}

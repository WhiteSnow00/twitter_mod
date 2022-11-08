import java.util.List;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class okz<MessageType extends okz<MessageType, BuilderType>, BuilderType extends mjz<MessageType, BuilderType>> extends ffz<MessageType, BuilderType>
{
    private static final Map zza;
    public lqz zzc;
    public int zzd;
    
    static {
        zza = (Map)new ConcurrentHashMap();
    }
    
    public okz() {
        this.zzc = lqz.f;
        this.zzd = -1;
    }
    
    public static okz l(final Class clazz) {
        final Map zza = okz.zza;
        okz okz;
        if ((okz = zza.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                okz = zza.get(clazz);
            }
            catch (final ClassNotFoundException ex) {
                throw new IllegalStateException("Class initialization cannot fail.", ex);
            }
        }
        okz okz2;
        if ((okz2 = okz) == null) {
            okz2 = (okz)((okz)uqz.i(clazz)).r(6);
            if (okz2 == null) {
                throw new IllegalStateException();
            }
            zza.put(clazz, okz2);
        }
        return okz2;
    }
    
    public static blz m(final blz blz) {
        final kmz kmz = (kmz)blz;
        final int e0 = kmz.E0;
        int n;
        if (e0 == 0) {
            n = 10;
        }
        else {
            n = e0 + e0;
        }
        return kmz.i(n);
    }
    
    public static dlz n(final dlz dlz) {
        final int size = ((List)dlz).size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return dlz.W(n);
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
    
    public static void p(final Class clazz, final okz okz) {
        okz.zza.put(clazz, okz);
    }
    
    public final int b() {
        return this.zzd;
    }
    
    public final int c() {
        int zzd;
        if ((zzd = this.zzd) == -1) {
            zzd = soz.c.a((Class)this.getClass()).g(this);
            this.zzd = zzd;
        }
        return zzd;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && soz.c.a((Class)this.getClass()).m(this, o));
    }
    
    public final void h(final int zzd) {
        this.zzd = zzd;
    }
    
    public final int hashCode() {
        final int zzb = super.zzb;
        if (zzb != 0) {
            return zzb;
        }
        return super.zzb = soz.c.a((Class)this.getClass()).j(this);
    }
    
    public final mjz j() {
        return (mjz)this.r(5);
    }
    
    public final mjz k() {
        final mjz mjz = (mjz)this.r(5);
        mjz.h(this);
        return mjz;
    }
    
    public final void q(final vhz vhz) throws IOException {
        final apz a = soz.c.a((Class)this.getClass());
        final zhz x0 = vhz.X0;
        Object o;
        if (x0 != null) {
            o = x0;
        }
        else {
            o = new zhz(vhz);
        }
        a.i(this, (srz)o);
    }
    
    public abstract Object r(final int p0);
    
    public final String toString() {
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        coz.c((xnz)this, sb, 0);
        return sb.toString();
    }
}

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.Callable;
import android.content.Context;
import java.util.Objects;
import java.lang.reflect.Field;
import android.util.Base64;
import android.os.Parcel;
import androidx.work.impl.WorkDatabase;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dh3 implements dsy, imb
{
    public Object F0;
    
    public dh3(final int n) {
        if (n == 4) {
            this.F0 = new HashSet();
            return;
        }
        if (n == 6) {
            return;
        }
        if (n == 14) {
            this.F0 = new ArrayList();
            return;
        }
        if (n != 16) {
            this.F0 = new e20();
            return;
        }
        this.F0 = Pattern.compile("[\\p{Punct}&&[^#@]]");
    }
    
    public dh3(final WorkDatabase f0) {
        e0e.f((Object)f0, "workDatabase");
        this.F0 = f0;
    }
    
    public dh3(final cg4 f0) {
        e0e.f((Object)f0, "clientEventConfigurationProvider");
        this.F0 = f0;
    }
    
    public dh3(final Object f0) {
        this.F0 = f0;
    }
    
    public dh3(final String s) {
        final Parcel obtain = Parcel.obtain();
        e0e.e((Object)obtain, "obtain()");
        this.F0 = obtain;
        final byte[] decode = Base64.decode(s, 0);
        ((Parcel)this.F0).unmarshall(decode, 0, decode.length);
        ((Parcel)this.F0).setDataPosition(0);
    }
    
    public dh3(final Field f0) {
        Objects.requireNonNull(f0);
        this.F0 = f0;
    }
    
    public dh3(final lsx f0) {
        e0e.f((Object)f0, "workManager");
        this.F0 = f0;
    }
    
    public dh3(final nda f0) {
        e0e.f((Object)f0, "userEventReporter");
        this.F0 = f0;
    }
    
    public dh3(final sbw f0) {
        this.F0 = f0;
    }
    
    public final /* bridge */ Object a() {
        final Context b = ((vby)this.F0).b();
        return new hky(b, b.getPackageName());
    }
    
    public final int b() {
        return ((Parcel)this.F0).dataAvail();
    }
    
    public final byte c() {
        return ((Parcel)this.F0).readByte();
    }
    
    public final long d() {
        final long long1 = ((Parcel)this.F0).readLong();
        final sr4$a companion = sr4.Companion;
        return long1;
    }
    
    public final float e() {
        return ((Parcel)this.F0).readFloat();
    }
    
    public final int f(final String s) {
        if (s != null && ((Pattern)this.F0).matcher(s).find()) {
            return 2;
        }
        return 0;
    }
    
    public final long g() {
        final byte c = this.c();
        long n;
        if (c == 1) {
            Objects.requireNonNull(qks.Companion);
            n = 4294967296L;
        }
        else if (c == 2) {
            Objects.requireNonNull(qks.Companion);
            n = 8589934592L;
        }
        else {
            Objects.requireNonNull(qks.Companion);
            n = 0L;
        }
        Objects.requireNonNull(qks.Companion);
        if (qks.a(n, 0L)) {
            Objects.requireNonNull(pks.Companion);
            return pks.c;
        }
        return ma7.I(n, this.e());
    }
    
    public final m6 h() {
        return ((i4)this.F0).d1;
    }
    
    public final int i(final int n) {
        final Object p = ((ldn)this.F0).p((Callable)new l5d(this, n));
        e0e.e(p, "workDatabase.runInTransa\u2026            id\n        })");
        return ((Number)p).intValue();
    }
    
    public final void j(final nbf a) {
        final cm8 cm8 = (cm8)this.F0;
        cm8.a = (T)a;
        for (final e5y e5y : cm8.c) {
            final nbf a2 = ((cm8)this.F0).a;
            e5y.c();
        }
        ((cm8)this.F0).c.clear();
        ((cm8)this.F0).b = null;
    }
    
    public final void k() {
        final fg4 fg4 = (fg4)this.F0;
        ((o1p)fg4).q(new String[] { "trendsplus", "search", "menu", "change_location", "click" });
        sbw.b((tlm)fg4);
    }
    
    public final zf4 l(final String s) {
        final ag4 b = ag4.b;
        e0e.f((Object)s, "<this>");
        Object m;
        try {
            m = qsz.m(qi1.a(s), (ara)b);
        }
        catch (final Exception ex) {
            r9a.d((Throwable)ex);
            m = null;
        }
        return (zf4)m;
    }
    
    public final void m(final Object o) {
        synchronized (this) {
            final Iterator iterator = ((Set)this.F0).iterator();
            while (iterator.hasNext()) {
                ((nar<Object>)iterator.next()).a(o);
            }
        }
    }
}

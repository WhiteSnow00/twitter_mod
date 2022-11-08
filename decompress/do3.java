import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class do3 implements v00<fo3>
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public final v00$a a(final UserIdentifier userIdentifier, final List<fo3> list) {
        zzd.f((Object)userIdentifier, "owner");
        final b73$a b73$a = new b73$a();
        final b73$b i0 = b73.I0;
        final t3s a = mq1.a;
        b73$a.a(i0, (Object)System.currentTimeMillis());
        b73$a.a(b73.J0, (Object)0);
        if (b73$a.a == null) {
            final StringBuilder g = w48.g("Required field 'createdAtMs' was not present! Struct: ");
            g.append(b73$a.toString());
            throw new IllegalArgumentException(g.toString());
        }
        if (b73$a.b == null) {
            final StringBuilder g2 = w48.g("Required field 'retryAttempt' was not present! Struct: ");
            g2.append(b73$a.toString());
            throw new IllegalArgumentException(g2.toString());
        }
        final Long a2 = b73$a.a;
        final Short b = b73$a.b;
        final b73 b2 = new b73();
        if (a2 != null) {
            b2.C0 = a2;
            b2.E0.set(0, true);
        }
        if (b != null) {
            b2.D0 = b;
            b2.E0.set(1, true);
        }
        final a73$a a73$a = new a73$a();
        a73$a.a(a73.H0, (Object)b2);
        final a73$b i2 = a73.I0;
        final ArrayList list2 = new ArrayList<vba>(kr4.h1((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().a);
        }
        a73$a.a(i2, (Object)list2);
        if (a73$a.a == null) {
            final StringBuilder g3 = w48.g("Required field 'header' was not present! Struct: ");
            g3.append(a73$a.toString());
            throw new IllegalArgumentException(g3.toString());
        }
        if (a73$a.b != null) {
            final a63 j = new a63(m0n.z0((n5s)new a73(a73$a.a, a73$a.b)), fn6.J0);
            final yrc f = yrc.f(userIdentifier);
            f.d("https://api.twitter.com/1.1/jot/ces/p2");
            f.h = xrc$b.F0;
            final int a3 = w4j.a;
            f.q = (isc)ldv.c();
            f.i = (src)j;
            final xrc e = f.e();
            e.E("Accept", "application/octet-stream");
            e.d();
            return new v00$a(e.z(), e.n.a);
        }
        final StringBuilder g4 = w48.g("Required field 'events' was not present! Struct: ");
        g4.append(a73$a.toString());
        throw new IllegalArgumentException(g4.toString());
    }
    
    public static final class a
    {
    }
}

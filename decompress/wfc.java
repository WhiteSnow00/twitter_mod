import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.List;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfc
{
    public static final a Companion;
    public final ConcurrentHashMap<String, List<jfc>> a;
    
    static {
        Companion = new a();
    }
    
    public wfc() {
        this(null, (cgc)new fpi());
    }
    
    public wfc(final dgc dgc, final cgc cgc) {
        this.a = (ConcurrentHashMap<String, List<jfc>>)new ConcurrentHashMap();
        cgc.a();
        if (dgc != null) {
            final t5j startWith = ((t5j)dgc.e).startWith((fbj)dgc.a().P());
            if (startWith != null) {
                final t5j subscribeOn = startWith.subscribeOn(jxo.a());
                if (subscribeOn != null) {
                    subscribeOn.subscribe((rk6)new rm8((stb)new vfc((Object)this), 10));
                }
            }
        }
    }
    
    public static final wfc a() {
        Objects.requireNonNull(wfc.Companion);
        final wfc a0 = ((agc)((n5j)cr0.a()).B((Class)agc.class)).A0();
        e0e.e((Object)a0, "get().hashflagCache");
        return a0;
    }
    
    public final fb0 b(final String s) {
        e0e.f((Object)s, "hashtag");
        final jfc c = this.c(s, (stb<? super jfc, Boolean>)new xfc());
        fb0 a;
        if (c != null) {
            a = c.a("Like");
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final jfc c(String l, final stb<? super jfc, Boolean> stb) {
        final Locale english = Locale.ENGLISH;
        l = a88.l(english, "ENGLISH", l, english, "this as java.lang.String).toLowerCase(locale)");
        final List list = (List)this.a.get((Object)l);
        jfc jfc = null;
        final jfc jfc2 = null;
        if (list != null) {
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                final jfc jfc3 = (jfc)next;
                Objects.requireNonNull(jfc3);
                final g5s a = nq1.a;
                final long n = System.currentTimeMillis() / 1000L;
                final long c = jfc3.c;
                final boolean b = false;
                final boolean b2 = n > c && n < jfc3.d;
                int n2 = b ? 1 : 0;
                if (b2) {
                    final boolean b3 = stb == null || (boolean)stb.invoke((Object)jfc3);
                    n2 = (b ? 1 : 0);
                    if (b3) {
                        n2 = 1;
                    }
                }
                if (n2 != 0) {
                    list2.add(next);
                }
            }
            final Iterator iterator2 = list2.iterator();
            Object next2;
            if (!iterator2.hasNext()) {
                next2 = jfc2;
            }
            else {
                next2 = iterator2.next();
                if (iterator2.hasNext()) {
                    long c2 = ((jfc)next2).c;
                    jfc jfc4 = (jfc)next2;
                    do {
                        final Object next3 = iterator2.next();
                        final long c3 = ((jfc)next3).c;
                        next2 = jfc4;
                        long n3 = c2;
                        if (c2 < c3) {
                            next2 = next3;
                            n3 = c3;
                        }
                        jfc4 = (jfc)next2;
                        c2 = n3;
                    } while (iterator2.hasNext());
                }
            }
            jfc = (jfc)next2;
        }
        return jfc;
    }
    
    public final boolean d() {
        return ((Map)this.a).isEmpty() ^ true;
    }
    
    public final boolean e(String a) {
        e0e.f((Object)a, "hashtag");
        final jfc c = this.c(a, (stb<? super jfc, Boolean>)yfc.F0);
        if (c != null) {
            a = c.a;
        }
        else {
            a = null;
        }
        return a != null;
    }
    
    public static final class a
    {
    }
}

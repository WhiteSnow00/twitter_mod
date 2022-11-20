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

public final class uec
{
    public static final a Companion;
    public final ConcurrentHashMap<String, List<hec>> a;
    
    static {
        Companion = new a();
    }
    
    public uec() {
        this(null, (afc)new ooi());
    }
    
    public uec(final bfc bfc, final afc afc) {
        this.a = (ConcurrentHashMap<String, List<hec>>)new ConcurrentHashMap();
        afc.a();
        if (bfc != null) {
            final h5j startWith = ((h5j)bfc.e).startWith((taj)bfc.a().P());
            if (startWith != null) {
                final h5j subscribeOn = startWith.subscribeOn(owo.a());
                if (subscribeOn != null) {
                    subscribeOn.subscribe((lj6)new qpl((qsb)new tec((Object)this), 7));
                }
            }
        }
    }
    
    public static final uec a() {
        Objects.requireNonNull(uec.Companion);
        final uec a0 = ((yec)((b5j)br0.a()).B((Class)yec.class)).A0();
        czd.e((Object)a0, "get().hashflagCache");
        return a0;
    }
    
    public final cb0 b(final String s) {
        czd.f((Object)s, "hashtag");
        final hec c = this.c(s, (qsb<? super hec, Boolean>)new vec());
        cb0 a;
        if (c != null) {
            a = c.a("Like");
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final hec c(String m, final qsb<? super hec, Boolean> qsb) {
        final Locale english = Locale.ENGLISH;
        m = oqf.m(english, "ENGLISH", m, english, "this as java.lang.String).toLowerCase(locale)");
        final List list = (List)this.a.get((Object)m);
        hec hec = null;
        final hec hec2 = null;
        if (list != null) {
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                final hec hec3 = (hec)next;
                Objects.requireNonNull(hec3);
                final m4s a = hq1.a;
                final long n = System.currentTimeMillis() / 1000L;
                final long c = hec3.c;
                final boolean b = false;
                final boolean b2 = n > c && n < hec3.d;
                int n2 = b ? 1 : 0;
                if (b2) {
                    final boolean b3 = qsb == null || (boolean)qsb.invoke((Object)hec3);
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
                next2 = hec2;
            }
            else {
                next2 = iterator2.next();
                if (iterator2.hasNext()) {
                    long c2 = ((hec)next2).c;
                    hec hec4 = (hec)next2;
                    do {
                        final Object next3 = iterator2.next();
                        final long c3 = ((hec)next3).c;
                        next2 = hec4;
                        long n3 = c2;
                        if (c2 < c3) {
                            next2 = next3;
                            n3 = c3;
                        }
                        hec4 = (hec)next2;
                        c2 = n3;
                    } while (iterator2.hasNext());
                }
            }
            hec = (hec)next2;
        }
        return hec;
    }
    
    public final boolean d() {
        return ((Map)this.a).isEmpty() ^ true;
    }
    
    public final boolean e(String a) {
        czd.f((Object)a, "hashtag");
        final hec c = this.c(a, (qsb<? super hec, Boolean>)wec.D0);
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

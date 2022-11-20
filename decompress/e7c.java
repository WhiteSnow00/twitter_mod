import java.util.Arrays;
import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class e7c<OBJECT> extends wge<OBJECT, kbv>
{
    public static final a Companion;
    public final Set<f6c> G0;
    
    static {
        Companion = new a();
    }
    
    public e7c() {
        this(null, 1, null);
    }
    
    public e7c(final Set<f6c> g0) {
        czd.f((Object)g0, "acceptableErrorPaths");
        this.G0 = g0;
    }
    
    public e7c(final Set set, final int n, final rf8 rf8) {
        final p2a d0 = p2a.D0;
        this.G0 = (Set<f6c>)d0;
    }
    
    public static final <OBJECT> e7c<OBJECT> c(final Class<? extends fih<OBJECT>> clazz, final String s) {
        Objects.requireNonNull(e7c.Companion);
        return (e7c<OBJECT>)new e7c.e7c$b((Class)clazz, new String[] { s });
    }
    
    public final OBJECT a(final tge tge) throws IOException {
        final ArrayList list = new ArrayList();
        vie vie = tge.h0();
        final OBJECT object = null;
        String s = null;
        OBJECT object2 = null;
        while (vie != null) {
            final int ordinal = ((Enum)vie).ordinal();
            String j;
            OBJECT d;
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal != 5) {
                        j = s;
                        d = object2;
                    }
                    else {
                        j = tge.j();
                        d = object2;
                    }
                }
                else if (czd.a((Object)s, (Object)"errors")) {
                    final t6c t6c = new t6c();
                    while (true) {
                        j = s;
                        d = object2;
                        if (tge.h0() == vie.O0) {
                            break;
                        }
                        final r6c b = t6c.b(tge);
                        if (b == null) {
                            continue;
                        }
                        list.add(b);
                    }
                }
                else {
                    tge.l0();
                    j = s;
                    d = object2;
                }
            }
            else if (czd.a((Object)s, (Object)"data")) {
                d = this.d(tge);
                j = s;
            }
            else {
                tge.l0();
                d = object2;
                j = s;
            }
            vie = tge.h0();
            s = j;
            object2 = d;
        }
        final ArrayList<r6c> list2 = new ArrayList<r6c>();
        for (final Object next : list) {
            final r6c r6c = (r6c)next;
            final Set<f6c> g0 = this.G0;
            final boolean b2 = g0 instanceof Collection;
            final int n = 0;
            int n2 = 0;
            Label_0567: {
                if (b2 && g0.isEmpty()) {
                    n2 = n;
                }
                else {
                    final Iterator iterator2 = g0.iterator();
                    boolean b3;
                    do {
                        n2 = n;
                        if (!iterator2.hasNext()) {
                            break Label_0567;
                        }
                        final f6c f6c = (f6c)iterator2.next();
                        Object o;
                        if ((o = r6c.c) == null) {
                            o = f2a.D0;
                        }
                        Objects.requireNonNull(f6c);
                        Label_0554: {
                            if (!f6c.b || ((List)o).size() >= f6c.a.size()) {
                                if (f6c.b || ((List)o).size() == f6c.a.size()) {
                                    final ArrayList list3 = (ArrayList)mq4.U0((Iterable)f6c.a, (Iterable)o);
                                    if (!list3.isEmpty()) {
                                        for (final lvj lvj : list3) {
                                            final f6c$a f6c$a = (f6c$a)lvj.D0;
                                            final r6c$b r6c$b = (r6c$b)lvj.E0;
                                            boolean a = false;
                                            Label_0549: {
                                                if (f6c$a instanceof f6c$a$a && r6c$b instanceof r6c$b$a) {
                                                    Objects.requireNonNull((f6c$a$a)f6c$a);
                                                    if (((r6c$b$a)r6c$b).a == 0) {
                                                        a = true;
                                                        break Label_0549;
                                                    }
                                                }
                                                else if (f6c$a instanceof f6c$a$b && r6c$b instanceof r6c$b$b) {
                                                    a = czd.a((Object)((f6c$a$b)f6c$a).a, (Object)((r6c$b$b)r6c$b).a);
                                                    break Label_0549;
                                                }
                                                a = false;
                                            }
                                            if (!a) {
                                                break Label_0554;
                                            }
                                        }
                                    }
                                    b3 = true;
                                    continue;
                                }
                            }
                        }
                        b3 = false;
                    } while (!b3);
                    n2 = 1;
                }
            }
            if ((n2 ^ 0x1) != 0x0) {
                list2.add((r6c)next);
            }
        }
        final ArrayList list4 = new ArrayList<hbv>(iq4.H((Iterable)list2, 10));
        final Iterator<r6c> iterator4 = list2.iterator();
        while (iterator4.hasNext()) {
            list4.add(lp.l0((r6c)iterator4.next()));
        }
        wk0.b().t();
        if (object2 != null && list4.isEmpty()) {
            ((asc)this).E0 = null;
        }
        else {
            ((asc)this).E0 = new kbv((List<hbv>)list4);
            object2 = object;
        }
        return object2;
    }
    
    public final Object b(final tge tge, final int n) {
        return gih.c(tge, (Class)kbv.class, false);
    }
    
    public abstract OBJECT d(final tge p0);
    
    public static final class a
    {
        public final <OBJECT> e7c<OBJECT> a(final TypeConverter<OBJECT> typeConverter, final f7c f7c, final Set<f6c> set) {
            czd.f((Object)f7c, "parsingPath");
            czd.f((Object)set, "acceptableErrorPaths");
            return (e7c<OBJECT>)new e7c$e((TypeConverter)typeConverter, f7c, (Set)set);
        }
        
        public final <OBJECT> e7c<OBJECT> b(final Class<OBJECT> clazz, final String... array) {
            czd.f((Object)clazz, "objectClass");
            return (e7c<OBJECT>)new e7c$c((Class)clazz, (String[])Arrays.copyOf(array, array.length));
        }
    }
}

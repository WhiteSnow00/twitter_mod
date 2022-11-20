import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mt7 implements xq<kt7>
{
    public static final mt7 a;
    public static final List<String> b;
    
    static {
        a = new mt7();
        b = s9i.s("id", "reaction_key", "created_at_millis", "sender_results");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (kt7)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final kt7 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        Object o = null;
        String s = null;
        String s2;
        Object o2 = s2 = null;
        while (true) {
            final int j3 = ohe.j3((List)mt7.b);
            if (j3 != 0) {
                if (j3 != 1) {
                    if (j3 != 2) {
                        if (j3 != 3) {
                            break;
                        }
                        final nt7 a = nt7.a;
                        final ar$g a2 = ar.a;
                        o2 = new m4j((xq)a, false).b(ohe, fa7);
                    }
                    else {
                        Objects.requireNonNull(c3j.Companion);
                        s2 = (String)x70.B(fa7, c3j.a, ohe, fa7);
                    }
                }
                else {
                    s = (String)ar.a.b(ohe, fa7);
                }
            }
            else {
                Objects.requireNonNull(c3j.Companion);
                o = fa7.a(c3j.a).b(ohe, fa7);
            }
        }
        czd.c(o);
        czd.c((Object)s);
        czd.c(o2);
        return new kt7((String)o, s, s2, (kt7.a)o2);
    }
    
    public final void d(final ale ale, final fa7 fa7, final kt7 kt7) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)kt7, "value");
        ale.z1("id");
        Objects.requireNonNull(c3j.Companion);
        final ga7 a = c3j.a;
        fa7.a(a).a(ale, fa7, (Object)kt7.a);
        ale.z1("reaction_key");
        ar.a.a(ale, fa7, (Object)kt7.b);
        ale.z1("created_at_millis");
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)kt7.c);
        ale.z1("sender_results");
        final nt7 a2 = nt7.a;
        final kt7.a d = kt7.d;
        ale.F();
        ((xq)a2).a(ale, fa7, (Object)d);
        ale.P();
    }
}

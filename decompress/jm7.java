import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jm7 implements xq<im7>
{
    public static final jm7 a;
    public static final List<String> b;
    
    static {
        a = new jm7();
        b = s9i.s("message_id", "dm", "possibly_spam", "is_spam_hide", "custom_profile_id", "marked_as_abuse", "sender_registration_token", "initial_low_quality_state", "is_new_one_to_one_convo");
    }
    
    public final /* bridge */ void a(final ale ale, final fa7 fa7, final Object o) {
        this.d(ale, fa7, (im7)o);
    }
    
    public final /* bridge */ Object b(final ohe ohe, final fa7 fa7) {
        return this.c(ohe, fa7);
    }
    
    public final im7 c(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        String s = null;
        Object o2;
        Object o = o2 = null;
        Object o4;
        Object o3 = o4 = o2;
        Object o6;
        Object o5 = o6 = o4;
        Object o8;
        Object o7 = o8 = o6;
        while (true) {
            switch (ohe.j3((List)jm7.b)) {
                default: {
                    return new im7(s, (im7$a)o, (Boolean)o2, (Boolean)o3, (String)o4, (Boolean)o5, (String)o6, (im7$b)o7, (Boolean)o8);
                }
                case 8: {
                    o8 = ar.l.b(ohe, fa7);
                    continue;
                }
                case 7: {
                    o7 = ar.b((xq)ar.c((xq)lm7.a, true)).b(ohe, fa7);
                    continue;
                }
                case 6: {
                    o6 = ar.i.b(ohe, fa7);
                    continue;
                }
                case 5: {
                    o5 = ar.l.b(ohe, fa7);
                    continue;
                }
                case 4: {
                    Objects.requireNonNull(c3j.Companion);
                    o4 = x70.B(fa7, c3j.a, ohe, fa7);
                    continue;
                }
                case 3: {
                    o3 = ar.l.b(ohe, fa7);
                    continue;
                }
                case 2: {
                    o2 = ar.l.b(ohe, fa7);
                    continue;
                }
                case 1: {
                    o = ar.b((xq)ar.c((xq)km7.a, true)).b(ohe, fa7);
                    continue;
                }
                case 0: {
                    Objects.requireNonNull(c3j.Companion);
                    s = (String)x70.B(fa7, c3j.a, ohe, fa7);
                    continue;
                }
            }
        }
    }
    
    public final void d(final ale ale, final fa7 fa7, final im7 im7) {
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)im7, "value");
        ale.z1("message_id");
        final c3j$a companion = c3j.Companion;
        Objects.requireNonNull(companion);
        final ga7 a = c3j.a;
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)im7.a);
        ale.z1("dm");
        ar.b((xq)ar.c((xq)km7.a, true)).a(ale, fa7, (Object)im7.b);
        ale.z1("possibly_spam");
        final i2j l = ar.l;
        l.a(ale, fa7, (Object)im7.c);
        ale.z1("is_spam_hide");
        l.a(ale, fa7, (Object)im7.d);
        ale.z1("custom_profile_id");
        Objects.requireNonNull(companion);
        ar.b((xq)fa7.a(a)).a(ale, fa7, (Object)im7.e);
        ale.z1("marked_as_abuse");
        l.a(ale, fa7, (Object)im7.f);
        ale.z1("sender_registration_token");
        ar.i.a(ale, fa7, (Object)im7.g);
        ale.z1("initial_low_quality_state");
        ar.b((xq)ar.c((xq)lm7.a, true)).a(ale, fa7, (Object)im7.h);
        ale.z1("is_new_one_to_one_convo");
        l.a(ale, fa7, (Object)im7.i);
    }
}

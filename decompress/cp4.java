import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cp4 implements xq<yo4.c>
{
    public static final cp4 a;
    public static final List<String> b;
    
    static {
        a = new cp4();
        b = s9i.s("collab_invitation_status", "collaborator_results");
    }
    
    public final void a(final ale ale, final fa7 fa7, final Object o) {
        final yo4.c c = (yo4.c)o;
        czd.f((Object)ale, "writer");
        czd.f((Object)fa7, "customScalarAdapters");
        czd.f((Object)c, "value");
        ale.z1("collab_invitation_status");
        final in4 a = c.a;
        czd.f((Object)a, "value");
        ale.h2(a.D0);
        ale.z1("collaborator_results");
        ar.c((xq)zo4.a, true).a(ale, fa7, (Object)c.b);
    }
    
    public final Object b(final ohe ohe, final fa7 fa7) {
        czd.f((Object)ohe, "reader");
        czd.f((Object)fa7, "customScalarAdapters");
        in4 e0 = null;
        yo4.a a = null;
    Label_0018:
        while (true) {
            final int j3 = ohe.j3((List)cp4.b);
            if (j3 == 0) {
                final String r1 = ohe.R1();
                czd.c((Object)r1);
                Objects.requireNonNull(in4.Companion);
                final in4[] values = in4.values();
                final int length = values.length;
                int i = 0;
                while (true) {
                    while (i < length) {
                        final in4 in4 = values[i];
                        if (czd.a((Object)in4.D0, (Object)r1)) {
                            e0 = in4;
                            if (in4 == null) {
                                e0 = in4.E0;
                                continue Label_0018;
                            }
                            continue Label_0018;
                        }
                        else {
                            ++i;
                        }
                    }
                    final in4 in4 = null;
                    continue;
                }
            }
            if (j3 != 1) {
                break;
            }
            a = (yo4.a)ar.c((xq)zo4.a, true).b(ohe, fa7);
        }
        czd.c((Object)e0);
        czd.c((Object)a);
        return new yo4.c(e0, a);
    }
}

import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o79 implements kpw<n79>
{
    public static final o79 F0;
    public static final jie.a G0;
    
    static {
        F0 = new o79();
        G0 = jie.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");
    }
    
    public final Object h(final jie jie, float n) throws IOException {
        jie.b();
        String s1 = null;
        String s2 = null;
        float n2 = 0.0f;
        int n3 = 3;
        int q0 = 0;
        float n4 = 0.0f;
        float n5 = 0.0f;
        int a = 0;
        int a2 = 0;
        n = 0.0f;
        boolean k1 = true;
        while (jie.hasNext()) {
            switch (jie.f(o79.G0)) {
                default: {
                    jie.h();
                    jie.h0();
                    continue;
                }
                case 10: {
                    k1 = jie.K1();
                    continue;
                }
                case 9: {
                    n = (float)jie.n2();
                    continue;
                }
                case 8: {
                    a2 = mle.a(jie);
                    continue;
                }
                case 7: {
                    a = mle.a(jie);
                    continue;
                }
                case 6: {
                    n5 = (float)jie.n2();
                    continue;
                }
                case 5: {
                    n4 = (float)jie.n2();
                    continue;
                }
                case 4: {
                    q0 = jie.Q0();
                    continue;
                }
                case 3: {
                    final int q2 = jie.Q0();
                    if (q2 <= 2 && q2 >= 0) {
                        n3 = lb0.I(3)[q2];
                        continue;
                    }
                    n3 = 3;
                    continue;
                }
                case 2: {
                    n2 = (float)jie.n2();
                    continue;
                }
                case 1: {
                    s2 = jie.S1();
                    continue;
                }
                case 0: {
                    s1 = jie.S1();
                    continue;
                }
            }
        }
        jie.d();
        return new n79(s1, s2, n2, n3, q0, n4, n5, a, a2, n, k1);
    }
}

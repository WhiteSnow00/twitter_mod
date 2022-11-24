import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g90 implements zqg
{
    public final h90<?> a;
    
    public g90(final h90<?> a) {
        this.a = a;
    }
    
    @Override
    public final int a(final b0e b0e, final List<? extends jzd> list, int intValue) {
        e0e.f((Object)b0e, "<this>");
        final Integer n = (Integer)glp.D0(glp.B0(rr4.s1((Iterable)list), (stb)new g90$b(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, long f) {
        e0e.f((Object)crg, "$this$measure");
        e0e.f((Object)list, "measurables");
        int size = list.size();
        final khk[] array = new khk[size];
        final int size2 = list.size();
        final int n = 0;
        int n2 = 0;
        khk khk;
        while (true) {
            khk = null;
            h90$a h90$a = null;
            boolean b = true;
            if (n2 >= size2) {
                break;
            }
            final wqg wqg = list.get(n2);
            final Object m = ((jzd)wqg).m();
            if (m instanceof h90$a) {
                h90$a = (h90$a)m;
            }
            if (h90$a == null || !h90$a.F0) {
                b = false;
            }
            if (b) {
                array[n2] = wqg.W(f);
            }
            ++n2;
        }
        for (int size3 = list.size(), i = 0; i < size3; ++i) {
            final wqg wqg2 = list.get(i);
            if (array[i] == null) {
                array[i] = wqg2.W(f);
            }
        }
        khk khk2;
        if (size == 0) {
            khk2 = null;
        }
        else {
            khk khk3 = array[0];
            final int n3 = size - 1;
            if (n3 == 0) {
                khk2 = khk3;
            }
            else {
                int f2;
                if (khk3 != null) {
                    f2 = khk3.F0;
                }
                else {
                    f2 = 0;
                }
                final gud j = ((iud)new kud(1, n3)).j();
                int n4 = f2;
                while (true) {
                    khk2 = khk3;
                    if (!((jud)j).H0) {
                        break;
                    }
                    final khk khk4 = array[j.a()];
                    int f3;
                    if (khk4 != null) {
                        f3 = khk4.F0;
                    }
                    else {
                        f3 = 0;
                    }
                    if (n4 >= f3) {
                        continue;
                    }
                    khk3 = khk4;
                    n4 = f3;
                }
            }
        }
        int f4;
        if (khk2 != null) {
            f4 = khk2.F0;
        }
        else {
            f4 = 0;
        }
        khk khk5;
        if (size == 0) {
            khk5 = khk;
        }
        else {
            khk khk6 = array[0];
            if (--size == 0) {
                khk5 = khk6;
            }
            else {
                int g0;
                if (khk6 != null) {
                    g0 = khk6.G0;
                }
                else {
                    g0 = 0;
                }
                final gud k = ((iud)new kud(1, size)).j();
                int n5 = g0;
                while (true) {
                    khk5 = khk6;
                    if (!((jud)k).H0) {
                        break;
                    }
                    final khk khk7 = array[k.a()];
                    int g2;
                    if (khk7 != null) {
                        g2 = khk7.G0;
                    }
                    else {
                        g2 = 0;
                    }
                    if (n5 >= g2) {
                        continue;
                    }
                    khk6 = khk7;
                    n5 = g2;
                }
            }
        }
        int g3 = n;
        if (khk5 != null) {
            g3 = khk5.G0;
        }
        final h90<?> a = this.a;
        f = shw.f(f4, g3);
        ((cjq<nud>)a.c).setValue(new nud(f));
        return crg.J(f4, g3, (Map)m3a.F0, (stb)new g90$c(array, this, f4, g3));
    }
    
    @Override
    public final int c(final b0e b0e, final List<? extends jzd> list, int intValue) {
        e0e.f((Object)b0e, "<this>");
        final Integer n = (Integer)glp.D0(glp.B0(rr4.s1((Iterable)list), (stb)new g90$e(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int d(final b0e b0e, final List<? extends jzd> list, int intValue) {
        e0e.f((Object)b0e, "<this>");
        final Integer n = (Integer)glp.D0(glp.B0(rr4.s1((Iterable)list), (stb)new g90$a(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
    
    @Override
    public final int e(final b0e b0e, final List<? extends jzd> list, int intValue) {
        e0e.f((Object)b0e, "<this>");
        final Integer n = (Integer)glp.D0(glp.B0(rr4.s1((Iterable)list), (stb)new g90$d(intValue)));
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        return intValue;
    }
}

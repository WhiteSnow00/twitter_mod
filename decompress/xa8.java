// 
// Decompiled by Procyon v0.6.0
// 

public final class xa8 implements kzt<sa8, wow>
{
    public final ua8 a;
    public final String b;
    public final String c;
    
    public xa8(final ua8 a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(Object o) {
        final sa8 sa8 = (sa8)o;
        e0e.f((Object)sa8, "date");
        final ua8 a = this.a;
        final int n = 1;
        final boolean b = false;
        boolean b3 = false;
        Label_0064: {
            if (a != null) {
                final sa8 b2 = a.b;
                if (b2 != null) {
                    final sa8$a d = sa8.d;
                    if (kwe.J0.compare((Object)sa8, (Object)b2) > 0) {
                        b3 = true;
                        break Label_0064;
                    }
                }
            }
            b3 = false;
        }
        final ua8 a2 = this.a;
        int n2 = b ? 1 : 0;
        if (a2 != null) {
            final sa8 a3 = a2.a;
            n2 = (b ? 1 : 0);
            if (a3 != null) {
                final sa8$a d2 = sa8.d;
                if (kwe.J0.compare((Object)sa8, (Object)a3) < 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
        }
        if (b3) {
            o = new wow(3, this.b);
        }
        else if (n2 != 0) {
            o = new wow(3, this.c);
        }
        else {
            o = new wow(2, (String)null);
        }
        return o;
    }
}

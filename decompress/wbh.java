// 
// Decompiled by Procyon v0.6.0
// 

public final class wbh
{
    public static final nmp<wbh> i;
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    @d6d
    public final int h;
    
    static {
        wbh.i = new wbh.wbh$b();
    }
    
    public wbh(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
        this.g = a.g;
        this.h = a.h;
    }
    
    public static wbh a(final qgv qgv) {
        if (qgv == null) {
            return null;
        }
        final a a = new a();
        a.a = qgv.F0;
        a.b = qgv.M0;
        a.c = qgv.c();
        a.d = qgv.G0;
        a.e = qgv.P0;
        a.f = Boolean.TRUE.equals(qgv.h());
        a.g = qgv.O0;
        a.h = qgv.K1;
        return (wbh)a.e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof wbh)) {
                return b2;
            }
            final boolean b3 = this.a == ((wbh)o).a;
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return o5j.d(this.a);
    }
    
    public static final class a extends z4j<wbh>
    {
        public long a;
        public String b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;
        public boolean g;
        public int h;
        
        public final Object i() {
            return new wbh(this);
        }
    }
}

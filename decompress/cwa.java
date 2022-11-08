import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwa
{
    public static final alp<cwa> d;
    public final List<iva> a;
    public final String b;
    public final vva c;
    
    static {
        cwa.d = new cwa.cwa$b();
    }
    
    public cwa(final a a) {
        final List<iva> a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        String b;
        if ((b = a.b) == null) {
            b = "";
        }
        this.b = b;
        this.c = a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && cwa.class == o.getClass()) {
            final cwa cwa = (cwa)o;
            if (!w4j.a((Object)this.a, (Object)cwa.a) || !w4j.a((Object)this.b, (Object)cwa.b) || !w4j.a((Object)this.c, (Object)cwa.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends h4j<cwa>
    {
        public List<iva> a;
        public String b;
        public vva c;
        
        public a() {
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.a = (List<iva>)d0;
        }
        
        public final Object i() {
            return new cwa(this);
        }
    }
}

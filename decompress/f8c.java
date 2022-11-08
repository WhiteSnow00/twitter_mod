import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f8c
{
    public static final alp<f8c> e;
    public final String a;
    public final e8c b;
    public final Map<String, Object> c;
    public final Map<String, Object> d;
    
    static {
        f8c.e = new f8c.f8c$b();
    }
    
    public f8c(final a a) {
        final String a2 = a.a;
        pf8.r(a2);
        this.a = a2;
        this.b = a.b;
        this.c = (Map)((h4j)a.c).e();
        this.d = (Map)((h4j)a.d).e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && f8c.class == o.getClass()) {
            final f8c f8c = (f8c)o;
            if (!this.a.equals(f8c.a) || !this.b.equals((Object)f8c.b) || !this.c.equals(f8c.c) || !this.d.equals(f8c.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
    
    public static final class a extends h4j<f8c>
    {
        public String a;
        public e8c b;
        public sjg<String, Object> c;
        public sjg<String, Object> d;
        
        public a() {
            this.b = new e8c(new String[0]);
            this.c = (sjg$a)sjg.t();
            this.d = (sjg$a)sjg.t();
        }
        
        public a(final f8c f8c) {
            this.b = new e8c(new String[0]);
            this.c = (sjg$a)sjg.t();
            this.d = (sjg$a)sjg.t();
            this.a = f8c.a;
            this.b = f8c.b;
            this.c = (sjg$a)sjg.u((Map)f8c.c);
            this.d = (sjg$a)sjg.u((Map)f8c.d);
        }
        
        public final Object i() {
            return new f8c(this);
        }
        
        public final boolean l() {
            return pjr.g((CharSequence)this.a);
        }
        
        public final a o(final String s, final Object o) {
            ((sjg)this.c).w((Object)s, o);
            return this;
        }
        
        public final a p(final String s, final String s2) {
            ((sjg)this.c).w((Object)s, (Object)s2);
            return this;
        }
        
        public final a q(final Map<String, Object> map) {
            ((sjg)this.c).x((Map)map);
            return this;
        }
        
        public final a r(final String... array) {
            this.b = new e8c(array);
            return this;
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public class vyo<T extends vyo<T>>
{
    public static final js2<vyo, a<vyo, a>> g;
    public static final alp<vyo> h;
    public int a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        vyo.h = (jx6)hx6.b(new pkp[] { new pkp((Class)jev.class, (alp)new jev$b()), new pkp((Class)vyo.class, (alp)(vyo.g = new vyo.vyo$c())) });
    }
    
    public vyo() {
        this.d = "";
        this.e = "";
        this.f = "";
    }
    
    public vyo(final a a) {
        this.d = "";
        this.e = "";
        this.f = "";
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        final String d = a.d;
        pf8.r(d);
        this.d = d;
        final String e = a.e;
        pf8.r(e);
        this.e = e;
        final String f = a.f;
        pf8.r(f);
        this.f = f;
    }
    
    public final T a(String f) {
        if (f == null) {
            f = "";
        }
        this.f = f;
        final int a = w4j.a;
        return (T)this;
    }
    
    public final T b(final long n) {
        this.b = String.valueOf(n);
        final int a = w4j.a;
        return (T)this;
    }
    
    public final T c(String d) {
        if (d == null) {
            d = "";
        }
        this.d = d;
        final int a = w4j.a;
        return (T)this;
    }
    
    public final T d(String e) {
        if (e == null) {
            e = "";
        }
        this.e = e;
        final int a = w4j.a;
        return (T)this;
    }
    
    public abstract static class a<T extends vyo, B extends a> extends h4j<T>
    {
        public int a;
        public String b;
        public int c;
        public String d;
        public String e;
        public String f;
    }
}

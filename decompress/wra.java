import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wra extends j0p
{
    public static final rlp<wra> c;
    public final String a;
    public final String b;
    
    static {
        wra.c = new b();
    }
    
    public wra() {
        this.a = "";
        this.b = "";
    }
    
    public wra(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public final void a(final afe afe) throws IOException {
        final boolean e = ikr.e((CharSequence)this.a);
        final String s = "";
        String a;
        if (e) {
            a = "";
        }
        else {
            a = this.a;
        }
        afe.t0("newRegistrationToken", a);
        String b;
        if (ikr.e((CharSequence)this.b)) {
            b = s;
        }
        else {
            b = this.b;
        }
        afe.t0("oldRegistrationToken", b);
    }
    
    public static final class a extends n4j<wra>
    {
        public String a;
        public String b;
        
        public final Object i() {
            return new wra(this);
        }
    }
    
    public static final class b extends zr2<wra, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final wra wra = (wra)o;
            wlp.E(wra.a);
            wlp.E(wra.b);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            a.a = vlp.G();
            a.b = vlp.G();
        }
    }
}

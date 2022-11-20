import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfv
{
    public static final rlp<zfv> g;
    public final int a;
    public final int b;
    public final List<String> c;
    public final cgv d;
    public final hfv e;
    public final rlv f;
    
    static {
        zfv.g = new b();
    }
    
    public zfv(final zfv$a zfv$a) {
        this.a = zfv$a.a;
        this.b = zfv$a.b;
        this.c = rif.x(zfv$a.c);
        this.d = zfv$a.d;
        this.e = zfv$a.e;
        this.f = zfv$a.f;
    }
    
    public static final class b extends zr2<zfv, zfv$a>
    {
        public b() {
            super(1);
        }
        
        public final void f(wlp x, final Object o) throws IOException {
            final zfv zfv = (zfv)o;
            x = x.x(zfv.a).x(zfv.b);
            final List<String> c = zfv.c;
            final vp4$a vp4$a = new vp4$a((rlp)lw6.f);
            Objects.requireNonNull(x);
            ((y4j)vp4$a).c(x, (Object)c);
            final int a = c5j.a;
            ((y4j)cgv.N1).c(x, (Object)zfv.d);
            ((y4j)hfv.s).c(x, (Object)zfv.e);
            x.A((Object)zfv.f, (rlp)rlv.c);
        }
        
        public final n4j g() {
            return (n4j)new zfv$a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final zfv$a zfv$a = (zfv$a)n4j;
            zfv$a.a = vlp.x();
            if (n < 1) {
                vlp.x();
            }
            zfv$a.b = vlp.x();
            zfv$a.c = (List)da8.i(lw6.f, vlp);
            zfv$a.d = (cgv)((y4j)cgv.N1).a(vlp);
            zfv$a.e = (hfv)((y4j)hfv.s).a(vlp);
            if (n < 1) {
                vlp.G();
            }
            zfv$a.f = (rlv)((y4j)rlv.c).a(vlp);
        }
    }
}

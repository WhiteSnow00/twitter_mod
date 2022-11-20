import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fss
{
    public static final y4j<fss> d;
    public static final fss e;
    public zw a;
    public ax b;
    public kov c;
    
    static {
        fss.d = new a();
        e = new fss(zw.E0, kov.E0, ax.D0);
    }
    
    public fss(final zw a, final kov c, final ax b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final boolean a(final fss fss) {
        return this == fss || (fss != null && this.a == fss.a && this.b == fss.b && this.c == fss.c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fss && this.a((fss)o));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.b) + (c5j.f((Object)this.a) + c5j.f((Object)this.c) * 31) * 31;
    }
    
    public static final class a extends y4j<fss>
    {
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            final lw6$h a = lw6.a;
            final mw6 mw6 = new mw6((Class)zw.class);
            Objects.requireNonNull(vlp);
            return new fss((zw)((y4j)mw6).a(vlp), (kov)((y4j)new mw6((Class)kov.class)).a(vlp), (ax)((y4j)new mw6((Class)ax.class)).a(vlp));
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final fss fss = (fss)o;
            final zw a = fss.a;
            final lw6$h a2 = lw6.a;
            final mw6 mw6 = new mw6((Class)zw.class);
            Objects.requireNonNull(wlp);
            ((y4j)mw6).c(wlp, (Object)a);
            final int a3 = c5j.a;
            ((y4j)new mw6((Class)kov.class)).c(wlp, (Object)fss.c);
            ((y4j)new mw6((Class)ax.class)).c(wlp, (Object)fss.b);
        }
    }
}

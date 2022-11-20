import android.annotation.SuppressLint;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bc3
{
    public static final rlp<bc3> d;
    public final int a;
    public final int b;
    public final noj c;
    
    static {
        bc3.d = new b();
    }
    
    public bc3(final a a) {
        this.a = a.a;
        this.b = a.b;
        final noj c = a.c;
        jee.l((Object)c);
        this.c = c;
    }
    
    public final void a(final afe afe) throws IOException {
        afe.q0();
        afe.T("camera_position", this.a);
        afe.T("flash_mode", this.b);
        afe.T("orientation", this.c.D0);
        afe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && bc3.class == o.getClass()) {
            final bc3 bc3 = (bc3)o;
            if (this.a != bc3.a || this.b != bc3.b || this.c != bc3.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return c5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    public static final class a extends n4j<bc3>
    {
        public int a;
        public int b;
        @SuppressLint({ "NullableEnum" })
        public noj c;
        
        public final Object i() {
            return new bc3(this);
        }
        
        public final boolean l() {
            return this.a != 0 && this.b != 0 && this.c != null;
        }
    }
    
    public static final class b extends zr2<bc3, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final bc3 bc3 = (bc3)o;
            wlp.x(bc3.a);
            wlp.x(bc3.b);
            final noj c = bc3.c;
            final lw6$h a = lw6.a;
            ((y4j)new mw6((Class)noj.class)).c(wlp, (Object)c);
            final int a2 = c5j.a;
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            a.a = vlp.x();
            a.b = vlp.x();
            final lw6$h a2 = lw6.a;
            final Object a3 = ((y4j)new mw6((Class)noj.class)).a(vlp);
            jee.l(a3);
            a.c = (noj)a3;
        }
    }
}

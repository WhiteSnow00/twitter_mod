import java.io.IOException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmu
{
    public static final b h;
    public final fym a;
    public final l0h b;
    public final c9t c;
    public final vg1 d;
    public final mmu e;
    public final wkq f;
    public final boolean g;
    
    static {
        h = new b();
    }
    
    public kmu(final a a) {
        final fym a2 = a.a;
        vmw.g((Object)a2);
        this.a = a2;
        this.b = a.b;
        final c9t c = a.c;
        vmw.g((Object)c);
        this.c = c;
        this.d = a.d;
        final mmu e = a.e;
        vmw.g((Object)e);
        this.e = e;
        final wkq f = a.f;
        vmw.g((Object)f);
        this.f = f;
        this.g = a.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && kmu.class == o.getClass()) {
            final int a = o5j.a;
            final kmu kmu = (kmu)o;
            if (!o5j.a((Object)this.a, (Object)kmu.a) || !o5j.a((Object)this.b, (Object)kmu.b) || !o5j.a((Object)this.c, (Object)kmu.c) || !o5j.a((Object)this.d, (Object)kmu.d) || !o5j.a((Object)this.e, (Object)kmu.e) || !o5j.a((Object)this.g, (Object)kmu.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.k((Object)this.a, (Object)this.b, (Object)this.c, (Object)this.d, (Object)this.e, (Object)this.g);
    }
    
    public static final class a extends z4j<kmu>
    {
        public fym a;
        public l0h b;
        public c9t c;
        public vg1 d;
        public mmu e;
        public wkq f;
        public boolean g;
        
        public a() {
            this.e = mmu.G0;
            this.f = wkq.G0;
            this.g = true;
        }
        
        public final Object i() {
            return new kmu(this);
        }
        
        public final boolean k() {
            return this.a != null && this.c != null && this.e != mmu.G0;
        }
    }
    
    public static final class b extends k5j<kmu>
    {
        public b() {
            super(2);
        }
        
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            final a a = new a();
            final fym$c i0 = fym.I0;
            Objects.requireNonNull(rmp);
            a.a = (fym)((k5j)i0).a(rmp);
            a.b = (l0h)l0h.d.a(rmp);
            a.c = (c9t)((k5j)c9t.a).a(rmp);
            a.d = (vg1)((k5j)vg1.d).a(rmp);
            a.e = mmu.b(rmp.z());
            if (n >= 1) {
                a.g = rmp.u();
            }
            if (n >= 2) {
                a.f = wkq.b(rmp.z());
            }
            return a.e();
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final kmu kmu = (kmu)o;
            smp.C((Object)kmu.a, (nmp)fym.I0);
            l0h.d.c(smp, (Object)kmu.b);
            final int a = o5j.a;
            smp.C((Object)kmu.c, (nmp)c9t.a);
            smp.C((Object)kmu.d, (nmp)vg1.d);
            smp.z(kmu.e.F0);
            smp.t(kmu.g);
            smp.z(kmu.f.F0);
        }
    }
}

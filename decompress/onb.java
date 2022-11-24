import java.io.IOException;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onb
{
    public static final nmp<onb> i;
    public final rnb a;
    public final String b;
    public final String c;
    public final qnb d;
    public final String e;
    public final SparseArray<nnb> f;
    public final nnb g;
    public final String h;
    
    static {
        onb.i = new a();
    }
    
    public onb(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
        final rnb a = (rnb)((k5j)rnb.I0).a(rmp);
        vmw.g((Object)a);
        this.a = a;
        this.b = rmp.C();
        this.c = rmp.C();
        final qnb d = (qnb)((k5j)qnb.H0).a(rmp);
        vmw.g((Object)d);
        this.d = d;
        this.e = rmp.C();
        final nnb.b j0 = nnb.J0;
        final SparseArray a2 = m60.a(rmp, (nmp)j0);
        vmw.g((Object)a2);
        this.f = (SparseArray<nnb>)a2;
        final nnb g = (nnb)j0.a(rmp);
        vmw.g((Object)g);
        this.g = g;
        String c;
        if (n >= 1) {
            c = rmp.C();
        }
        else {
            c = "";
        }
        this.h = c;
    }
    
    public onb(final rnb a, final String b, final String c, final qnb d, final String e, final SparseArray<nnb> f, final nnb g, final String h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static final class a extends k5j<onb>
    {
        public a() {
            super(1);
        }
        
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            return new onb(rmp, n);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final onb onb = (onb)o;
            ((k5j)rnb.I0).c(smp, (Object)onb.a);
            smp.G(onb.b);
            smp.G(onb.c);
            ((k5j)qnb.H0).c(smp, (Object)onb.d);
            smp.G(onb.e);
            final SparseArray<nnb> f = onb.f;
            final nnb.b j0 = nnb.J0;
            m60.b(smp, (SparseArray)f, (nmp)j0);
            j0.c(smp, (Object)onb.g);
            String h;
            if ((h = onb.h) == null) {
                h = "";
            }
            smp.G(h);
        }
    }
}

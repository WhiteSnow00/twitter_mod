import android.content.Context;
import com.google.android.gms.common.api.a$g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayz extends b implements e32
{
    public static final mtz k;
    public static final a l;
    
    static {
        l = new a("Blockstore.API", (a.a$a<C, O>)(k = new mtz()), (a.a$g<C>)new a$g());
    }
    
    public ayz(final Context context) {
        super(context, ayz.l, (a.d)a.d.o0, b.a.c);
    }
    
    public final ubs<Integer> e(final yir yir) {
        final ybs.a a = new ybs.a();
        a.c = new yra[] { qyz.a, qyz.c };
        a.a = (ycm<A, zbs<ResultT>>)new m53((Object)this, (Object)yir, 3);
        a.d = 1645;
        a.b = false;
        return this.k(1, (ybs)a.a());
    }
    
    public final ubs<Boolean> f() {
        final ybs.a a = new ybs.a();
        a.c = new yra[] { qyz.b };
        a.a = new f3a(this);
        a.b = false;
        a.d = 1651;
        return this.k(0, (ybs)a.a());
    }
}

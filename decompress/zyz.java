import android.content.Context;
import com.google.android.gms.common.api.a$g;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zyz extends b implements m32
{
    public static final luz k;
    public static final a l;
    
    static {
        l = new a("Blockstore.API", (a.a$a<C, O>)(k = new luz()), (a.a$g<C>)new a$g());
    }
    
    public zyz(final Context context) {
        super(context, zyz.l, (a.d)a.d.q0, b.a.c);
    }
    
    public final mcs<Integer> e(final ujr ujr) {
        final qcs$a qcs$a = new qcs$a();
        qcs$a.c = new gta[] { qzz.a, qzz.c };
        qcs$a.a = (kdm)new a4c((Object)this, (Object)ujr, 3);
        qcs$a.d = 1645;
        qcs$a.b = false;
        return (mcs<Integer>)this.k(1, qcs$a.a());
    }
    
    public final mcs<Boolean> f() {
        final qcs$a qcs$a = new qcs$a();
        qcs$a.c = new gta[] { qzz.b };
        qcs$a.a = (kdm)new h4a(this);
        qcs$a.b = false;
        qcs$a.d = 1651;
        return (mcs<Boolean>)this.k(0, qcs$a.a());
    }
}

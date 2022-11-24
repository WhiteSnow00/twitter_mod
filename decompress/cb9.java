import java.util.Set;
import com.twitter.database.schema.DraftsSchema;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cb9 implements t9j
{
    public final UserIdentifier F0;
    
    public cb9(final UserIdentifier f0) {
        this.F0 = f0;
    }
    
    public final void d(final p7j p7j) {
        final UserIdentifier f0 = this.F0;
        fj1.e();
        final xmq g = ((oxo)((sp1)db9.u0(f0)).T()).g((Class)va9$b.class);
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).t(db9.Y0, new Object[] { 2 });
        Object e = g.e((zsl)((z4j)zsl$a).e());
        final aop$a aop$a = new aop$a(((j1m)e).getCount());
        try {
            while (((j1m)e).moveToNext()) {
                ((aop)aop$a).o((Object)((qas$a)((j1m)e).a()).f0());
            }
            ((j1m)e).close();
            e = ((z4j)aop$a).e();
            if (!((Set)e).isEmpty()) {
                ((u6j$a)p7j).onNext(e);
            }
            ((u6j$a)p7j).a();
        }
        finally {
            ((j1m)e).close();
        }
    }
}

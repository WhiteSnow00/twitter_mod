import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wcl<OBJECT, ERROR> extends t4w<OBJECT, ERROR>
{
    public final cgv a1;
    public cgv b1;
    public y1k c1;
    public final Context d1;
    public final vav e1;
    public int f1;
    public asc<cgv, kbv> g1;
    
    public wcl(final Context d1, final UserIdentifier userIdentifier, final cgv a1) {
        final vav c2 = vav.c2(userIdentifier);
        super(userIdentifier);
        this.d1 = d1;
        this.a1 = a1;
        this.e1 = c2;
    }
    
    public wcl(final Context d1, final UserIdentifier userIdentifier, final cgv a1, final vav e1) {
        super(userIdentifier);
        this.d1 = d1;
        this.a1 = a1;
        this.e1 = e1;
    }
    
    public final String g0() {
        return lcv.a().b;
    }
    
    public final asc<cgv, kbv> j0() {
        final v8g c = v8g.c((Class)cgv.class);
        this.g1 = (v8g$e)c;
        return (asc<cgv, kbv>)c;
    }
    
    public final boolean k0(final xrc xrc) {
        final v8g$e g1 = this.g1;
        if (g1 != null) {
            final cgv cgv = (cgv)((asc)g1).D0;
            if (xrc.b && cgv != null) {
                final cgv$b cgv$b = new cgv$b(cgv);
                Boolean false;
                if (this.c1.a != null) {
                    false = Boolean.FALSE;
                }
                else {
                    false = null;
                }
                ((cgv$a)cgv$b).p(false);
                this.b1 = (cgv)((n4j)cgv$b).e();
                final adw e = zcw.e(((anm)this).Q0);
                if (e != null) {
                    e.b(this.b1);
                }
                final nm6 z = ((anm)this).Z(this.d1);
                this.e1.V3((Collection)rif.v((Object)this.b1), -1L, -1, -1L, (String)null, (String)null, z);
                z.b();
            }
            return xrc.b;
        }
        throw new IllegalStateException();
    }
}

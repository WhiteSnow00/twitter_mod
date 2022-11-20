import java.util.HashMap;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class de6<OBJECT> extends n2t<OBJECT>
{
    public static final Map<String, d2v> n1;
    public final int l1;
    public final orc$a<de6<OBJECT>> m1;
    
    static {
        de6.n1 = (xth$a)xth.a(0);
    }
    
    public de6(final UserIdentifier userIdentifier, final int l1) {
        super(userIdentifier);
        this.l1 = l1;
        this.m1 = new de6$a(this);
    }
    
    public xrc<OBJECT, kbv> b() {
        final String s = this.s();
        Object n1 = de6.n1;
        synchronized (n1) {
            boolean b;
            if (((HashMap)n1).containsKey(s)) {
                b = false;
                monitorexit(n1);
            }
            else {
                ((HashMap)n1).put(s, this);
                monitorexit(n1);
                ((anm<Object, Object>)this).U((wv0$b<? extends wv0<xrc<Object, Object>>>)this.m1);
                b = true;
            }
            if (!b) {
                n1 = new xrc();
                ((xrc)n1).a.putBoolean("cancelled_no_messaging_required", true);
                return (xrc<OBJECT, kbv>)n1;
            }
            return (xrc<OBJECT, kbv>)super.b();
        }
    }
    
    public final void j(final atm<xrc<OBJECT, kbv>> atm) {
        ((anm)this).V0 = false;
        this.P((wv0.wv0$b<? extends wv0<OBJECT>>)this.m1);
        this.u0();
    }
    
    public String s() {
        int l1;
        if ((l1 = this.l1) == 1) {
            l1 = 2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append("_");
        sb.append(l1);
        sb.append("_");
        sb.append(((anm)this).Q0.getId());
        return sb.toString();
    }
    
    public final void u0() {
        final xth$a n1 = de6.n1;
        synchronized (n1) {
            cj1.b((anm<?, ?>)((HashMap<K, anm<?, ?>>)n1).remove(this.s()) == this);
        }
    }
}

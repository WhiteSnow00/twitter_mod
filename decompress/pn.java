import android.app.Activity;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pn implements qn
{
    public final qn D0;
    public final UUID E0;
    
    public pn(final qn d0, final UUID e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final qn A(final UUID uuid) {
        return zc.b((qn)this, uuid);
    }
    
    public final caf E(final qsb qsb) {
        return w1e.b((caf)this, qsb);
    }
    
    public final h5j<rn> a() {
        final h5j takeUntil = ((caf)this.D0).E((qsb)new qsb<rn, Boolean>(this.E0) {
            public final UUID D0;
            
            public final Object invoke(final Object o) {
                final rn rn = (rn)o;
                czd.f((Object)rn, "event");
                final Activity a = rn.a();
                final boolean b = a instanceof jtm;
                Object o2 = null;
                jtm jtm;
                if (b) {
                    jtm = (jtm)a;
                }
                else {
                    jtm = null;
                }
                if (jtm != null) {
                    o2 = jtm.D0("retainer_id");
                }
                return czd.a(o2, (Object)this.D0);
            }
        }).a().takeUntil((ytk)new ht1((qsb)pn$b.D0, 3));
        czd.e((Object)takeUntil, "retainedKey: UUID): Acti\u2026ed && event.isFinishing }");
        return (h5j<rn>)takeUntil;
    }
    
    public final h5j b() {
        return zc.e((qn)this);
    }
    
    public final h5j c() {
        return zc.h((qn)this);
    }
    
    public final h5j h() {
        return zc.j((qn)this);
    }
    
    public final h5j j() {
        return zc.d((qn)this);
    }
    
    public final h5j p() {
        return zc.f((qn)this);
    }
    
    public final h5j q() {
        return zc.g((qn)this);
    }
    
    public final qn w(final Activity activity) {
        return zc.a((qn)this, activity);
    }
}

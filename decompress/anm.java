import android.os.BaseBundle;
import java.util.Iterator;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public class anm<OBJECT, ERROR> extends orc<OBJECT, ERROR> implements gnm<OBJECT, ERROR>
{
    public final UserIdentifier Q0;
    public vba R0;
    public j0p S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    
    public anm() {
        this(UserIdentifier.UNDEFINED);
    }
    
    public anm(final UserIdentifier userIdentifier) {
        this(userIdentifier, (gnm)new a2p((gnm)null));
    }
    
    public anm(final UserIdentifier q0, final gnm<OBJECT, ERROR> gnm) {
        super((wrc)gnm);
        boolean b = true;
        this.U0 = true;
        this.V0 = true;
        this.Q0 = q0;
        if (!x70.b().e() || !UserIdentifier.isCurrentUser(q0)) {
            b = false;
        }
        this.z(b);
        final gnm<OBJECT, ERROR> x = this.X();
        final int a = c5j.a;
        ((wv0)(((a2p)x).F0 = this)).G((qtm)new dj8());
    }
    
    public final wv0 F(final wv0$b wv0$b) {
        super.F((wv0.wv0$b<? extends wv0<Object>>)wv0$b);
        final int a = c5j.a;
        return (wv0)this;
    }
    
    public final /* bridge */ wrc S() {
        return (wrc)this.X();
    }
    
    public final anm<OBJECT, ERROR> U(final wv0$b<? extends wv0<xrc<OBJECT, ERROR>>> wv0$b) {
        super.F((wv0.wv0$b<? extends wv0<Object>>)wv0$b);
        final int a = c5j.a;
        return this;
    }
    
    public final gnm<OBJECT, ERROR> V(final zv0$a<xrc<OBJECT, ERROR>> zv0$a) {
        super.o((zv0$a<Object>)zv0$a);
        final int a = c5j.a;
        return (gnm<OBJECT, ERROR>)this;
    }
    
    public final anm W() {
        final a2p a2p = new a2p((gnm)this);
        return new anm(((aw0)a2p).q(), (gnm<Object, Object>)a2p);
    }
    
    public final gnm<OBJECT, ERROR> X() {
        final wrc s = super.S();
        final int a = c5j.a;
        return (gnm<OBJECT, ERROR>)s;
    }
    
    public final mpm<OBJECT, ERROR> Y() {
        final gnm<OBJECT, ERROR> x = this.X();
        final int a = c5j.a;
        return (mpm<OBJECT, ERROR>)((a2p)x).E0;
    }
    
    public final nm6 Z(final Context context) {
        return new nm6(context.getApplicationContext().getContentResolver());
    }
    
    public final Object a() {
        return xrc.c(0, "Canceled");
    }
    
    public final xrc<OBJECT, ERROR> a() {
        return (xrc<OBJECT, ERROR>)xrc.c(0, "Canceled");
    }
    
    public brc a0(final CharSequence charSequence) {
        return p0f.c((gnm)this, charSequence, (xms)null);
    }
    
    public /* bridge */ Object b() throws InterruptedException {
        return this.b();
    }
    
    public final brc b0(final CharSequence charSequence, final xms xms) {
        return p0f.c((gnm)this, charSequence, (xms)null);
    }
    
    public final /* bridge */ orc c() {
        return this.W();
    }
    
    public final /* bridge */ wv0 c() {
        return (wv0)this.W();
    }
    
    public void c0(final atm<xrc<OBJECT, ERROR>> atm) {
        final Iterator<xrc<OBJECT, ERROR>> iterator = atm.b().iterator();
        while (iterator.hasNext()) {
            final int int1 = ((BaseBundle)iterator.next().a).getInt("scribe_item_count", -1);
            final vba r0 = this.R0;
            if (r0 != null) {
                final af4 af4 = new af4(this.Q0);
                ((u0p)af4).T = r0.toString();
                final int a = c5j.a;
                ((u0p)af4).i(this.S0);
                if (int1 > -1) {
                    ((u0p)af4).X = int1;
                }
                cbw.b((elm)af4);
            }
        }
    }
    
    public void d0(final boolean b) {
    }
    
    public void e(final atm<xrc<OBJECT, ERROR>> atm) {
        this.c0(atm);
        super.e((atm)atm);
    }
    
    public void j(final atm<xrc<OBJECT, ERROR>> atm) {
        this.V0 = false;
    }
    
    public final void k() {
        if (((wv0)this).E0) {
            this.U0 = false;
        }
        else {
            this.X().k();
        }
    }
    
    public final boolean n() {
        boolean b;
        if (!((wv0)this).E0) {
            b = this.X().n();
        }
        else {
            b = this.U0;
        }
        return b;
    }
    
    public final /* bridge */ zv0 o(final zv0$a zv0$a) {
        return (zv0)this.V((zv0$a<xrc<OBJECT, ERROR>>)zv0$a);
    }
    
    public final UserIdentifier q() {
        return this.Q0;
    }
    
    public final boolean u() {
        boolean b;
        if (!((wv0)this).E0) {
            b = this.X().u();
        }
        else {
            b = this.T0;
        }
        return b;
    }
    
    public void w() {
        this.d0(this.V0);
    }
    
    public final void z(final boolean t0) {
        if (((wv0)this).E0) {
            this.T0 = t0;
        }
        else {
            this.X().z(t0);
        }
    }
}

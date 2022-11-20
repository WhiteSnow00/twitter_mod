import java.util.HashMap;
import android.content.DialogInterface;
import android.util.TypedValue;
import java.util.Objects;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import java.util.Map;
import android.content.res.Configuration;
import android.app.Dialog;
import android.app.Activity;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class wk1 extends dk0 implements haf, ndc, jtm, yv8, acc
{
    public static final int m2 = 0;
    public Context Q1;
    public uv8 R1;
    public vv8 S1;
    public wv8 T1;
    public xv8 U1;
    public final upa<Activity, Integer, Dialog> V1;
    public final sz5 W1;
    public final sz5 X1;
    public final sz5 Y1;
    public final gnb$b Z1;
    public final yba<Configuration> a2;
    public final yba<bo> b2;
    public final yba<y6k> c2;
    public final yba<of1> d2;
    public final yba<lmd> e2;
    public final Map<String, Object> f2;
    public UserIdentifier g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public sz5 l2;
    
    public wk1() {
        this((upa<Activity, Integer, Dialog>)f5x.c);
    }
    
    public wk1(final upa<Activity, Integer, Dialog> v1) {
        this.W1 = new sz5();
        this.X1 = new sz5();
        final sz5 y1 = new sz5();
        this.Y1 = y1;
        final xbm$b companion = xbm.Companion;
        this.Z1 = (gnb$b)fnb.a(companion.a((sy5)y1));
        this.a2 = (yba<Configuration>)new yba((z9a)companion.a((sy5)y1), false);
        this.b2 = (yba<bo>)new yba((z9a)companion.a((sy5)y1), false);
        this.c2 = (yba<y6k>)new yba((z9a)companion.a((sy5)y1), false);
        this.d2 = (yba<of1>)new yba((z9a)companion.a((sy5)y1), false);
        this.e2 = (yba<lmd>)new yba((z9a)companion.a((sy5)y1), false);
        this.f2 = (xth$a)xth.a(0);
        this.g2 = UserIdentifier.UNDEFINED;
        this.V1 = v1;
    }
    
    public static <L> L f2(final Class<L> clazz, final Object... array) {
        for (final Object o : array) {
            if (clazz.isInstance(o)) {
                final int a = c5j.a;
                return (L)o;
            }
        }
        return null;
    }
    
    public final xba<lmd> A0() {
        return (xba<lmd>)this.e2;
    }
    
    public void A1(final Bundle bundle) {
        super.A1(bundle);
        this.Z1.g((Fragment)this, bundle);
        final uv8 r1 = this.R1;
        final boolean b = false;
        bundle.putBoolean("state_has_cancel_listener", r1 != null);
        bundle.putBoolean("state_has_created_listener", this.S1 != null);
        boolean b2 = b;
        if (this.T1 != null) {
            b2 = true;
        }
        bundle.putBoolean("state_has_dismiss_listener", b2);
    }
    
    public final sy5 B0() {
        return (sy5)this.X1;
    }
    
    public void B1() {
        this.Z1.h((Fragment)this);
        super.B1();
        final cnb l0 = ((Fragment)this).L0();
        jee.l((Object)l0);
        final Fragment y0 = ((Fragment)this).Y0(true);
        if (this.U1 == null) {
            this.U1 = (xv8)xjr.j((Class)xv8.class, y0, (Activity)l0);
        }
        if (this.R1 == null && this.i2) {
            this.R1 = (uv8)xjr.j((Class)uv8.class, y0, (Activity)l0);
        }
        if (this.T1 == null && this.j2) {
            this.T1 = (wv8)xjr.j((Class)wv8.class, y0, (Activity)l0);
        }
        if (this.S1 == null && this.k2) {
            this.S1 = (vv8)xjr.j((Class)vv8.class, y0, (Activity)l0);
        }
    }
    
    public void C1() {
        super.C1();
        this.Z1.i((Fragment)this);
    }
    
    public final xba<y6k> D() {
        return (xba<y6k>)this.c2;
    }
    
    public final <T> T D0(final String s) {
        final T value = ((HashMap<K, T>)this.f2).get(s);
        final int a = c5j.a;
        return value;
    }
    
    public void E0() {
        ((nv8)this).L1.cancel();
    }
    
    public final xba<of1> J() {
        return (xba<of1>)this.d2;
    }
    
    public final void T(final int n) {
        this.i2(n);
        ((nv8)this).Y1();
    }
    
    public Dialog a2(final Bundle bundle) {
        this.Z1.k((Fragment)this, bundle);
        final upa<Activity, Integer, Dialog> v1 = this.V1;
        final cnb l0 = ((Fragment)this).L0();
        jee.l((Object)l0);
        return this.j2((Dialog)v1.a((Object)l0, (Object)((nv8)this).F1));
    }
    
    public final void c(final Map<String, Object> map) {
        ((HashMap)this.f2).clear();
        if (map != null) {
            ((HashMap<Object, Object>)this.f2).putAll(map);
        }
    }
    
    public void e2(final p p2, final String s) {
        try {
            super.e2(p2, s);
        }
        catch (final IllegalStateException ex) {
            m8a.d((Throwable)ex);
        }
    }
    
    public final sy5 g() {
        return (sy5)this.W1;
    }
    
    public void g1(final Bundle bundle) {
        ((Fragment)this).i1 = true;
        final vv8 s1 = this.S1;
        if (s1 != null) {
            s1.q0(((nv8)this).L1, this.h2().i(), bundle);
        }
    }
    
    public final View g2(final int n) {
        cj1.c(((nv8)this).L1 != null, "Dialog has not been created yet.");
        return ((nv8)this).L1.findViewById(n);
    }
    
    public void h1(final int n, final int n2, final Intent intent) {
        this.b2.e((Object)new bo(n, n2, intent));
        super.h1(n, n2, intent);
    }
    
    public xk1 h2() {
        return new xk1(((Fragment)this).J0);
    }
    
    public void i1(final Activity activity) {
        if (this.isDestroyed()) {
            final z7a a = m8a.b().a;
            a.i((dpo)new vk1(this, a));
        }
        ((Fragment)this).i1 = true;
        final UserIdentifier e = ((vl1)this.h2()).e();
        if (e.isDefined()) {
            this.g2 = e;
        }
        else if (activity instanceof ndc) {
            this.g2 = ((ndc)activity).q();
        }
        else {
            this.g2 = UserIdentifier.getCurrent();
        }
        if (activity instanceof acc) {
            this.l2 = new sz5();
            final acc acc = (acc)activity;
            final h5j v0 = acc.J().v0();
            final yba<of1> d2 = this.d2;
            Objects.requireNonNull(d2);
            f.j(v0, (n93)new csf((Object)d2, 5), (z9a)xbm.g((sy5)this.l2));
            final h5j v2 = acc.A0().v0();
            final yba<lmd> e2 = this.e2;
            Objects.requireNonNull(e2);
            f.j(v2, (n93)new hg1((Object)e2, 7), (z9a)xbm.g((sy5)this.l2));
        }
    }
    
    public final void i2(final int n) {
        final xv8 u1 = this.U1;
        if (u1 != null) {
            u1.k0(((nv8)this).L1, this.h2().i(), n);
        }
    }
    
    public final boolean isDestroyed() {
        return this.h2;
    }
    
    public Dialog j2(final Dialog dialog) {
        final TypedValue typedValue = new TypedValue();
        dialog.getContext().getTheme().resolveAttribute(2130969196, typedValue, true);
        final int resourceId = typedValue.resourceId;
        if (resourceId != 0) {
            dialog.setContentView(resourceId);
        }
        return dialog;
    }
    
    public void k1(final Bundle bundle) {
        this.Z1.a((Fragment)this, bundle);
        super.k1(bundle);
        final cnb l0 = ((Fragment)this).L0();
        jee.l((Object)l0);
        this.Q1 = ((Context)l0).getApplicationContext();
        if (bundle != null) {
            this.i2 = bundle.getBoolean("state_has_cancel_listener");
            this.j2 = bundle.getBoolean("state_has_dismiss_listener");
            this.k2 = bundle.getBoolean("state_has_created_listener");
        }
    }
    
    public final <T extends wk1> T k2(final Fragment fragment) {
        ((Fragment)this).T1(fragment, 0);
        final int a = c5j.a;
        return (T)this;
    }
    
    public void l2(final p p) {
        this.e2(p, null);
    }
    
    public final Map<String, Object> m0() {
        return (Map<String, Object>)this.f2;
    }
    
    public final mnb n0() {
        return (mnb)this.Z1.D0;
    }
    
    public void o1() {
        this.h2 = true;
        ((Fragment)this).i1 = true;
        this.Z1.b((Fragment)this);
        this.Y1.onComplete();
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        final uv8 r1 = this.R1;
        if (r1 != null) {
            r1.s0(dialogInterface, this.h2().i());
        }
        this.X1.onComplete();
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        ((Fragment)this).i1 = true;
        this.a2.e((Object)configuration);
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        final wv8 t1 = this.T1;
        if (t1 != null) {
            t1.R0(dialogInterface, this.h2().i());
        }
        this.W1.onComplete();
        super.onDismiss(dialogInterface);
    }
    
    public final UserIdentifier q() {
        return this.g2;
    }
    
    public void q1() {
        this.Z1.l((Fragment)this);
        super.q1();
    }
    
    public void r1() {
        super.r1();
        final sz5 l2 = this.l2;
        if (l2 != null) {
            l2.onComplete();
            this.l2 = null;
        }
    }
    
    public final xba<Configuration> u() {
        return (xba<Configuration>)this.a2;
    }
    
    public final Object v(final String s, final Object o) {
        Object o2;
        if (o != null) {
            o2 = ((HashMap<String, Object>)this.f2).put(s, o);
        }
        else {
            o2 = ((HashMap<K, Object>)this.f2).remove(s);
        }
        return o2;
    }
    
    public final void w1() {
        ((Fragment)this).i1 = true;
        this.Z1.j((Fragment)this);
        this.Z1.e((Fragment)this);
    }
    
    public final void y1(final int n, final String[] array, final int[] array2) {
        g7k.d().h((Activity)((Fragment)this).H1(), array);
        this.c2.e((Object)y6k.Companion.a(n, array, array2));
    }
    
    public final xba<bo> z() {
        return (xba<bo>)this.b2;
    }
    
    public void z1() {
        this.Z1.f((Fragment)this);
        this.Z1.d((Fragment)this);
        ((Fragment)this).i1 = true;
    }
}

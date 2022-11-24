import android.content.Context;
import androidx.fragment.app.p;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;
import android.content.res.ColorStateList;
import androidx.fragment.app.Fragment;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qum
{
    public it0 a;
    public int b;
    public String c;
    public int d;
    public String e;
    public String f;
    public int g;
    public String h;
    public final hp6 i;
    public final dob j;
    public final e39 k;
    public final cku l;
    public final Fragment m;
    public final fkj n;
    public final int o;
    public int p;
    public ColorStateList q;
    public int r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public final kmu w;
    public final n0j x;
    
    public qum(final qum.qum$a qum$a) {
        final e39 k = new e39();
        this.k = k;
        this.o = qum$a.d;
        final hp6 a = qum$a.a;
        this.i = a;
        this.j = qum$a.b;
        this.m = qum$a.e;
        this.n = qum$a.f;
        this.w = qum$a.g;
        this.x = qum$a.h;
        qum$a.c.i((sj)new azf(k, 4));
        this.l = jba.h(UserIdentifier.getCurrent()).m8().a(a);
    }
    
    public final void a(final Runnable runnable) {
        final bxo j = iqs.j();
        final bxo c = jxo.c();
        if (!this.i.F0.H0) {
            final Resources resources = ((Context)this.j).getResources();
            final e39 k = this.k;
            final hp6 i = this.i;
            kmu w = this.w;
            e0e.f((Object)resources, "res");
            e0e.f((Object)i, "tweet");
            e0e.f((Object)j, "mainScheduler");
            final kmu v0 = i.V0;
            if (v0 != null) {
                w = v0;
            }
            final pk7 pk7 = new pk7();
            u0j a = null;
            Label_0234: {
                if (w != null && w.e == mmu.I0) {
                    final String f0 = w.a.F0;
                    e0e.e((Object)f0, "forwardPivot.text.toString()");
                    if (f0.length() > 0 && pk7.l(i, ita.b().b("soft_interventions_retweet_nudge_enabled", false))) {
                        a = new u0j(2, it0.Companion.a(w, i.D()), w.a.F0, 2131958145, (String)null, 2131232059, ColorStateList.valueOf(resources.getColor(2131100865)), 2131230837, (String)null, 0, resources.getString(2131958147), true, "soft_intervention_nudge", (String)null, 17168);
                        break Label_0234;
                    }
                }
                final u0j a2 = v0j.a;
                a = v0j.a;
            }
            k.c(((bbq)new hcq((idq)bbq.v((Object)a).y(j), (rtb)new pum(this, j, c))).G((rk6)new vtk((Object)this, (Object)runnable, 5), (rk6)lvb.e));
        }
        else {
            runnable.run();
        }
    }
    
    public final p b() {
        final Fragment m = this.m;
        if (m != null) {
            final Fragment a1 = m.a1;
            if (a1 != null) {
                return a1.M0();
            }
        }
        return this.j.P();
    }
    
    public final iba c(final qda qda) {
        String u = this.u;
        if (u == null) {
            u = "";
        }
        iba iba;
        if (this.s) {
            if (qda != null) {
                iba = hba.a(qda, u);
            }
            else {
                iba = hba.a((qda)rz.b, u);
            }
        }
        else {
            iba = hba.a((qda)rz.a, u);
        }
        return iba;
    }
}

import android.os.BaseBundle;
import android.content.Intent;
import java.util.ArrayList;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class num extends jjl
{
    public rjj n2;
    
    public /* bridge */ xk1 h2() {
        return (xk1)this.n2();
    }
    
    public final void i1(final Activity activity) {
        super.i1(activity);
        if (this.n2 == null) {
            final Fragment y0 = ((Fragment)this).Y0(true);
            if (y0 != null) {
                if (y0 instanceof rjj) {
                    this.n2 = (rjj)y0;
                }
            }
            else if (activity instanceof rjj) {
                this.n2 = (rjj)activity;
            }
        }
        this.p2(3);
    }
    
    public /* bridge */ kjl m2() {
        return (kjl)this.n2();
    }
    
    public oum n2() {
        return new oum(((Fragment)this).J0);
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.p2(2);
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final oum n2 = this.n2();
        final long long1 = ((BaseBundle)((vl1)n2).a).getLong("user_id");
        final bo6 bo6 = (bo6)((vl1)n2).a.getParcelable("tweet");
        final boolean boolean1 = ((vl1)n2).a.getBoolean("undo", false);
        final ArrayList integerArrayList = ((vl1)n2).a.getIntegerArrayList("actions");
        int intValue = n;
        if (integerArrayList != null) {
            intValue = (int)integerArrayList.get(n);
        }
        if (intValue != 0) {
            if (intValue == 1) {
                final UserIdentifier fromId = UserIdentifier.fromId(long1);
                jee.l((Object)bo6);
                final boolean boolean2 = ((vl1)n2).a.getBoolean("add_main", false);
                final cnb l0 = ((Fragment)this).L0();
                final bn a = an.a();
                final z66 z66 = new z66();
                z66.t(fromId);
                z66.m(bo6);
                z66.l(bo6.E0);
                z66.q(false);
                final Intent a2 = a.a((Context)l0, z66);
                if (boolean2) {
                    ((jfg)((b5j)br0.a()).B((Class)jfg.class)).r2().a(a2, (Context)l0, fromId);
                }
                else {
                    ((Context)l0).startActivity(a2);
                }
                this.q2(1, fromId.getId(), bo6, boolean1);
            }
        }
        else {
            jee.l((Object)bo6);
            this.r2(long1, bo6, boolean1);
        }
    }
    
    public final void p2(final int n) {
        if (this.n2 == null) {
            return;
        }
        final oum n2 = this.n2();
        this.q2(n, ((BaseBundle)((vl1)n2).a).getLong("user_id"), (bo6)((vl1)n2).a.getParcelable("tweet"), ((vl1)n2).a.getBoolean("undo", false));
    }
    
    public final void q2(final int n, final long n2, final bo6 bo6, final boolean b) {
        final rjj n3 = this.n2;
        if (n3 == null) {
            return;
        }
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        n3.b0(bo6, b);
                    }
                }
                else {
                    n3.l0(bo6, b);
                }
            }
            else {
                n3.t(n2, bo6);
            }
        }
        else {
            n3.w(bo6, b);
        }
    }
    
    public void r2(final long n, final bo6 bo6, final boolean b) {
        final cnb l0 = ((Fragment)this).L0();
        final UserIdentifier fromId = UserIdentifier.fromId(n);
        Object o;
        if (b) {
            o = new zn8((Context)l0, fromId, bo6.D(), bo6.D(), bo6.N2());
        }
        else {
            long g;
            if (bo6.L() != fromId.getId()) {
                g = bo6.G();
            }
            else {
                g = 0L;
            }
            o = new tum((Context)l0, fromId, bo6.D(), g, bo6.E0);
            ((tum)o).o0(Boolean.valueOf(bo6.R()));
            ((tum)o).t1 = bo6.D0.a1;
        }
        final trc c = trc.c();
        final num.num$a num$a = new num.num$a(n, bo6, b, this.n2);
        final int a = c5j.a;
        ((anm)o).U((wv0$b)num$a);
        c.f((orc)o);
    }
}

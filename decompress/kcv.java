import android.content.Context;
import android.view.MenuItem;
import android.view.Menu;
import android.app.Activity;
import android.os.Bundle;
import android.app.SearchManager$OnDismissListener;
import android.app.SearchManager$OnCancelListener;
import android.app.SearchManager;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public class kcv extends u9 implements kmc, uap, bkq
{
    public final mcv S0;
    public final fci<?> T0;
    public final a7g U0;
    public final o9p V0;
    public final ibm W0;
    public final mxe<ypa> X0;
    public final c8p Y0;
    
    public kcv(final Intent intent, final k9x k9x, final Resources resources, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final mcv s0, final mxe<ypa> x0, final a7g u0, final o9p v0, final ibm w0, final fci<?> t0, final c8p y0, final m9p m9p) {
        super(intent, k9x, resources, (v9)s0, cbs, (mxe)mxe, nn, dob, cbf, cbg, layoutInflater, (fda)fda, userIdentifier);
        this.S0 = s0;
        this.X0 = x0;
        final SearchManager searchManager = (SearchManager)((Context)dob).getSystemService("search");
        searchManager.setOnCancelListener((SearchManager$OnCancelListener)icv.a);
        searchManager.setOnDismissListener((SearchManager$OnDismissListener)new jcv(m9p));
        this.U0 = u0;
        (this.V0 = v0).g((uap)this);
        this.W0 = w0;
        this.T0 = t0;
        this.Y0 = y0;
        boolean b;
        if (!swj.a(intent)) {
            intent.replaceExtras((Bundle)null);
            b = false;
        }
        else {
            b = true;
        }
        if (!b) {
            y19.a((Activity)dob);
        }
    }
    
    public void J1() {
        this.V4();
    }
    
    public final void L4() {
        y19.a((Activity)super.G0);
    }
    
    public final boolean M() {
        return this.S0.g;
    }
    
    public boolean N2(final zai zai, final Menu menu) {
        if (this.S0.e) {
            this.V0.k(zai, menu, 2131689481);
        }
        return true;
    }
    
    public void O4(final Intent intent) {
        super.O4(intent);
        if (!swj.a(intent)) {
            intent.replaceExtras((Bundle)null);
        }
    }
    
    public void P4() {
        this.V0.b();
        this.S4().g0();
        s3k.a().I0().a();
        this.W0.h();
        super.P4();
    }
    
    public void Q4() {
        super.Q4();
        this.S4().P();
        this.W0.c();
    }
    
    public final a7g S4() {
        final a7g u0 = this.U0;
        vmw.g((Object)u0);
        return u0;
    }
    
    public final void T4() {
        if (this.X0.get() != null) {
            ((ypa)this.X0.get()).b();
        }
    }
    
    public final void U4(final CharSequence charSequence) {
        this.F4().a(charSequence);
    }
    
    public final void V4() {
        if (this.S0.f && this.X0.get() != null) {
            ((ypa)this.X0.get()).c();
        }
    }
    
    public void Z() {
        this.T4();
    }
    
    public boolean k() {
        if (this.V0.b()) {
            return true;
        }
        if (super.R0) {
            super.R0 = false;
        }
        return false;
    }
    
    public void m0() {
        this.T0.k();
    }
    
    public boolean n(final MenuItem menuItem) {
        final int itemId = menuItem.getItemId();
        boolean b = true;
        if (itemId == 2131432123) {
            final c8p y0 = this.Y0;
            if (y0 == null || !y0.onSearchRequested()) {
                b = false;
            }
            return b;
        }
        if (itemId == 2131430964) {
            final int a = cs2.a;
            final ds2 a2 = ds2.Companion.a();
            if (a2.g()) {
                a2.b();
            }
            else {
                final String h4 = this.H4(2131952188);
                final String e = a2.e();
                final StringBuilder f = ehk.f("Thanks for filing a bug!\n\nSummary: \n\nSteps to reproduce: \n\nExpected results: \n\nActual results: \n\n");
                f.append(a2.d());
                a2.a(h4, e, f.toString(), true).G((rk6)new lem((Object)this, 16), (rk6)lvb.e);
            }
            return true;
        }
        return super.n(menuItem);
    }
    
    public boolean p4() {
        return this instanceof gwb ^ true;
    }
}

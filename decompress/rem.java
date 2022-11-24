import java.util.Objects;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.twitter.account.api.RemoveAccountDialogContentViewArgs;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rem extends u9 implements kmc
{
    public final e39 S0;
    public boolean T0;
    public boolean U0;
    public final String V0;
    public final UserIdentifier W0;
    public final laj<zvv> X0;
    public final kcm Y0;
    
    public rem(final Intent intent, final k9x k9x, final Resources resources, final v9 v9, final cbs cbs, final mxe<tai> mxe, final nn nn, final dob dob, final cbf cbf, final cbg cbg, final LayoutInflater layoutInflater, final fda<h5h> fda, final UserIdentifier userIdentifier, final RemoveAccountDialogContentViewArgs removeAccountDialogContentViewArgs, final kcm y0) {
        super(intent, k9x, resources, v9, cbs, (mxe)mxe, nn, dob, cbf, cbg, layoutInflater, (fda)fda, userIdentifier);
        this.S0 = new e39();
        this.R4(new View((Context)dob));
        final long accountId = removeAccountDialogContentViewArgs.getAccountId();
        final String accountName = removeAccountDialogContentViewArgs.getAccountName();
        if (accountId != -1L && flr.g((CharSequence)accountName)) {
            this.W0 = UserIdentifier.fromId(accountId);
            this.V0 = accountName;
        }
        else {
            this.W0 = UserIdentifier.getCurrent();
            this.V0 = pdw.d().c();
        }
        final laj a = cbs.a((Class)zvv.class);
        this.X0 = (laj<zvv>)a;
        this.Y0 = y0;
        f.a(a.a().subscribe((rk6)new dbg(this, 12)), (gba)y0);
    }
    
    public final void L4() {
        y19.a((Activity)super.G0);
    }
    
    public final void P4() {
        this.S0.a();
        super.P4();
    }
    
    public final void Q4() {
        super.Q4();
        ((Activity)super.G0).showDialog(3);
        this.S0.c(xnf.e().j().subscribe((rk6)new ppa(this, 7)));
    }
    
    public final void S4() {
        final bw0 a = bw0.a();
        final xn8 xn8 = new xn8((Context)super.G0, this.W0);
        Objects.requireNonNull(a);
        a.d(new aw0((dw0<S>)xn8));
        this.U0 = true;
        final fg4 fg4 = new fg4(this.W0);
        ((o1p)fg4).q(new String[] { "settings::::logout" });
        sbw.b((tlm)fg4);
        if (UserIdentifier.getAllCurrentlyLoggedIn().size() == 1) {
            final fg4 fg5 = new fg4(this.W0);
            ((o1p)fg5).q(new String[] { "settings::::logout_last" });
            ((o1p)fg5).b0 = true;
            final int a2 = o5j.a;
            sbw.b((tlm)fg5);
        }
        mqb.h().a(this.W0);
        if (xbg.c(this.W0)) {
            mbg.a(this.W0);
        }
        ((Activity)super.G0).showDialog(1);
    }
    
    public final void m0() {
    }
    
    public final boolean p4() {
        return true;
    }
}

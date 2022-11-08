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

public final class ldm extends x9 implements kmc
{
    public final m29 P0;
    public boolean Q0;
    public boolean R0;
    public final String S0;
    public final UserIdentifier T0;
    public final t9j<tuv> U0;
    public final ibm V0;
    
    public ldm(final Intent intent, final z7x z7x, final Resources resources, final y9 y9, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final RemoveAccountDialogContentViewArgs removeAccountDialogContentViewArgs, final ibm v0) {
        super(intent, z7x, resources, y9, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier);
        this.P0 = new m29();
        this.R4(new View((Context)gob));
        final long accountId = removeAccountDialogContentViewArgs.getAccountId();
        final String accountName = removeAccountDialogContentViewArgs.getAccountName();
        if (accountId != -1L && pjr.g((CharSequence)accountName)) {
            this.T0 = UserIdentifier.fromId(accountId);
            this.S0 = accountName;
        }
        else {
            this.T0 = UserIdentifier.getCurrent();
            this.S0 = ncw.d().b();
        }
        final t9j a = p9s.a((Class)tuv.class);
        this.U0 = (t9j<tuv>)a;
        this.V0 = v0;
        f.a(a.a().subscribe((fk6)new kd1((Object)this, 10)), (raa)v0);
    }
    
    public final void L4() {
        g19.a((Activity)super.D0);
    }
    
    public final void P4() {
        this.P0.a();
        super.P4();
    }
    
    public final void Q4() {
        super.Q4();
        ((Activity)super.D0).showDialog(3);
        this.P0.c(sbl.b().j().subscribe((fk6)new ocs((Object)this, 14)));
    }
    
    public final void S4() {
        final dw0 a = dw0.a();
        final in8 in8 = new in8((Context)super.D0, this.T0);
        Objects.requireNonNull(a);
        a.d((cw0<Object>)new cw0((fw0)in8));
        this.R0 = true;
        final zf4 zf4 = new zf4(this.T0);
        zf4.q(new String[] { "settings::::logout" });
        saw.b((okm)zf4);
        if (UserIdentifier.getAllCurrentlyLoggedIn().size() == 1) {
            final zf4 zf5 = new zf4(this.T0);
            zf5.q(new String[] { "settings::::logout_last" });
            zf5.b0 = true;
            final int a2 = w4j.a;
            saw.b((okm)zf5);
        }
        zi.a().a(this.T0);
        if (nbg.c(this.T0)) {
            cbg.a(this.T0);
        }
        ((Activity)super.D0).showDialog(1);
    }
    
    public final void n0() {
    }
    
    public final boolean p4() {
        return true;
    }
}

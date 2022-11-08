import androidx.appcompat.app.e$a;
import androidx.fragment.app.Fragment;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public class qg6 extends cl1
{
    public Set<Long> m2;
    
    public qg6() {
        final med$b d0 = med.D0;
        final int a = w4j.a;
        this.m2 = (Set<Long>)d0;
    }
    
    public final void A1(final Bundle bundle) {
        super.A1(bundle);
        yvj.k(bundle, "expiredDraftIds", (Object)this.m2, (alp)new ar4((alp)hx6.c));
    }
    
    public final Dialog a2(final Bundle bundle) {
        if (bundle != null) {
            final Set m2 = (Set)tkp.a(bundle.getByteArray("expiredDraftIds"), (alp)new ar4((alp)hx6.c));
            pf8.r(m2);
            this.m2 = m2;
        }
        final String string = ((Fragment)this).U0().getString(2131959215, new Object[] { this.m2.size() });
        final qmg qmg = new qmg((Context)((Fragment)this).L0(), 0);
        ((e$a)qmg).a.g = string;
        return (Dialog)qmg.n(2131957162, (DialogInterface$OnClickListener)new xva((Object)this, 1)).p(2131952335, (DialogInterface$OnClickListener)new pg6((Object)this, 0)).create();
    }
}

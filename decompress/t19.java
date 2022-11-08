import androidx.preference.d;
import android.content.Context;
import android.content.Intent;
import com.twitter.android.settings.theme.ThemeSettingsActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.Preference$e;
import androidx.preference.Preference$d;

// 
// Decompiled by Procyon v0.6.0
// 

public class t19 extends ynd implements Preference$d, Preference$e
{
    public final rd6 X1;
    public Preference Y1;
    public iks Z1;
    
    public t19() {
        this.X1 = new rd6();
    }
    
    public final void Z1(final Bundle bundle, final String s) {
        ((d)this).Y1(2132213781);
        final zf4 zf4 = new zf4();
        zf4.T = nca.g("settings", "display", "", "", "impression").toString();
        final int a = w4j.a;
        saw.b((okm)zf4);
        final iks$a companion = iks.Companion;
        this.Z1 = companion.d();
        final Preference d0 = ((d)this).d0((CharSequence)"dark_mode");
        this.Y1 = d0;
        d0.H0 = (Preference$e)this;
        ((d)this).d0((CharSequence)"twitter_emoji").G0 = (Preference$d)this;
        final gob l0 = ((Fragment)this).L0();
        final p u0 = ((Fragment)this).U0;
        if (l0 != null && u0 != null) {
            final zml zml = new zml();
            companion.d();
            this.X1.a(((b5j)zml).subscribe((fk6)new kd1((Object)this, 13)));
        }
    }
    
    public final void c2() {
        super.c2();
        this.Y1.R((CharSequence)((Fragment)this).W0(cj2.b(this.Z1.e)));
    }
    
    public final void o1() {
        ((vo1)this).T1 = true;
        ((Fragment)this).h1 = true;
        ((vo1)this).K1.b((Fragment)this);
        ((vo1)this).J1.onComplete();
        this.X1.dispose();
    }
    
    public final boolean r0(final Preference preference, final Object o) {
        if (preference.N0.equals("twitter_emoji")) {
            final xil$b xil$b = new xil$b(678);
            ((xil$a)xil$b).H(2131959232);
            ((xil$a)xil$b).A(2131959231);
            ((xil$a)xil$b).F(2131955542);
            ((xil$a)xil$b).C(2131959233);
            final cl1 w = ((dl1$a)xil$b).w();
            w.T1 = (mw8)new zk1((Object)this, 3);
            final int a = w4j.a;
            w.l2(((Fragment)this).U0);
        }
        return true;
    }
    
    public final boolean w0(final Preference preference) {
        if (preference.N0.equals("dark_mode")) {
            ((Fragment)this).V1(new Intent((Context)((Fragment)this).L0(), (Class)ThemeSettingsActivity.class));
        }
        return false;
    }
}

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b48 extends vbv
{
    public final zn7 X0;
    
    public b48(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xba<bo> xba2, final t8p t8p) {
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final zn7 zn7 = (zn7)((u9)this).I4().H("viewParticipantsFragment");
        zn7 x0;
        if (zn7 == null) {
            final Bundle extras = intent.getExtras();
            x0 = new zn7();
            ((Fragment)x0).N1(((vl1)new rk7(extras)).a);
            final a a = new a(((u9)this).I4());
            a.e(2131429268, (Fragment)x0, "viewParticipantsFragment", 1);
            a.c();
        }
        else {
            x0 = zn7;
        }
        this.X0 = x0;
        ro.a(xba2, 1, (n93<bo>)new n3(this, 7));
    }
}

import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qew extends x0c
{
    public qew(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final rnd rnd, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, rnd, a8p);
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final sew sew = new sew();
        final v0c a = v0c.a(intent);
        final rew$a.a a2 = new rew$a.a(null);
        ((qrs$a)a2).v(a.a.c.e);
        a2.B(a.a);
        ((BaseBundle)((zl1$a)a2).a).putLong("moments_list_owner_id", intent.getLongExtra("moments_owner_id", 0L));
        ((BaseBundle)((zl1$a)a2).a).putString("moments_list_owner_username", intent.getStringExtra("moments_owner_username"));
        a2.y(false);
        ((Fragment)sew).N1(((zl1)((h4j)a2).e()).a);
        return new pkf.a((rnd)sew);
    }
}

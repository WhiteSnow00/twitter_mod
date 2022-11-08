import android.content.Context;
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

public final class e9x extends pkf
{
    public e9x(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final h9x h9x = new h9x();
        final d9x d9x = new d9x(((x9)this).K0);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("timeline_arg_timeline_tag", ((dj1)d9x).mIntent.getStringExtra("conversation_id"));
        final int a = w4j.a;
        ((BaseBundle)bundle).putLong("conversation_author_id", ((dj1)d9x).mIntent.getLongExtra("conversation_author_id", UserIdentifier.LOGGED_OUT.getId()));
        ((Fragment)h9x).N1(((zl1)new f9x(bundle)).a);
        return new pkf.a(h9x);
    }
    
    public final CharSequence X4(final Intent intent) {
        final d9x d9x = new d9x(((x9)this).K0);
        String s;
        if (UserIdentifier.isCurrentUser(UserIdentifier.fromId(((dj1)d9x).mIntent.getLongExtra("conversation_author_id", UserIdentifier.LOGGED_OUT.getId())))) {
            s = ((x9)this).H4(2131951845);
        }
        else {
            s = ((Context)((x9)this).D0).getString(2131951846, new Object[] { pjr.l(((dj1)d9x).mIntent.getStringExtra("conversation_author_username")) });
        }
        return s;
    }
    
    public final CharSequence Y4(final Intent intent) {
        return ((x9)this).H4(2131951847);
    }
}

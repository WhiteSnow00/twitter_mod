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

public final class z9x extends yjf
{
    public z9x(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final t8p t8p) {
        super(intent, r8x, resources, kas, pwe, jn, cnb, faf, hag, layoutInflater, xba, userIdentifier, xbv, pwe2, f6g, v8p, vam, obi, i7p, t8p);
    }
    
    @Override
    public final a W4(final Intent intent, final xbv xbv) {
        final cax cax = new cax();
        final y9x y9x = new y9x(((u9)this).L0);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("timeline_arg_timeline_tag", ((xi1)y9x).mIntent.getStringExtra("conversation_id"));
        final int a = c5j.a;
        ((BaseBundle)bundle).putLong("conversation_author_id", ((xi1)y9x).mIntent.getLongExtra("conversation_author_id", UserIdentifier.LOGGED_OUT.getId()));
        ((Fragment)cax).N1(((vl1)new aax(bundle)).a);
        return new a(cax);
    }
    
    @Override
    public final CharSequence X4(final Intent intent) {
        final y9x y9x = new y9x(((u9)this).L0);
        String s;
        if (UserIdentifier.isCurrentUser(UserIdentifier.fromId(((xi1)y9x).mIntent.getLongExtra("conversation_author_id", UserIdentifier.LOGGED_OUT.getId())))) {
            s = ((u9)this).H4(2131951845);
        }
        else {
            s = ((Context)((u9)this).E0).getString(2131951846, new Object[] { ikr.l(((xi1)y9x).mIntent.getStringExtra("conversation_author_username")) });
        }
        return s;
    }
    
    @Override
    public final CharSequence Y4(final Intent intent) {
        return ((u9)this).H4(2131951847);
    }
}

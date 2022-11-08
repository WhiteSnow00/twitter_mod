import androidx.fragment.app.Fragment;
import android.os.Bundle;
import java.util.List;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;
import com.twitter.navigation.timeline.ReplyContextTimelineHostArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhm extends pkf
{
    public final ReplyContextTimelineHostArgs W0;
    
    public bhm(final Intent intent, final z7x z7x, final Resources resources, final p9s p9s, final fxe<z9i> fxe, final kn kn, final gob gob, final uaf uaf, final sag sag, final LayoutInflater layoutInflater, final pca<p4h> pca, final UserIdentifier userIdentifier, final cbv cbv, final fxe<spa> fxe2, final q6g q6g, final c8p c8p, final gam gam, final mbi<?> mbi, final r6p r6p, final ReplyContextTimelineHostArgs w0, final a8p a8p) {
        super(intent, z7x, resources, p9s, (fxe)fxe, kn, gob, uaf, sag, layoutInflater, (pca)pca, userIdentifier, cbv, (fxe)fxe2, q6g, c8p, gam, (mbi)mbi, r6p, a8p);
        this.W0 = w0;
    }
    
    public final pkf.a W4(final Intent intent, final cbv cbv) {
        final ehm ehm = new ehm();
        final chm$a chm$a = new chm$a();
        final List replyingToUserIds = this.W0.getReplyingToUserIds();
        final Bundle a = ((zl1$a)chm$a).a;
        final hx6$j c = hx6.c;
        yvj.k(a, "arg_replying_to_user_ids", (Object)replyingToUserIds, (alp)new xq4$a((alp)c));
        yvj.k(((zl1$a)chm$a).a, "arg_unmentioned_user_ids", (Object)this.W0.getUnmentionedUserIds(), (alp)new xq4$a((alp)c));
        ((qrs$a)chm$a).v(this.W0.getTweetIdString());
        ((Fragment)ehm).N1(((zl1)((h4j)chm$a).e()).a);
        return new pkf.a(ehm);
    }
    
    public final CharSequence Y4(final Intent intent) {
        return ((x9)this).H4(2131952884);
    }
}

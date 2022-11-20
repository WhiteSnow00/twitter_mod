import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yjf extends vbv
{
    public yjf(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final t8p t8p) {
        czd.f((Object)intent, "intent");
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)kas, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)jn, "activityFinisher");
        czd.f((Object)cnb, "activity");
        czd.f((Object)faf, "lifecycleAwareActivity");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)xba, "menuEventObservable");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, r8x, resources, kas, (pwe)pwe, jn, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, t8p);
        final h5j k = r8x.k();
        final w19 w19 = new w19();
        w19.c(k.subscribe((lj6)new f$x1((qsb)new qsb<tmi, fzv>(w19, this, intent, xbv) {
            public final w19 D0;
            public final yjf E0;
            public final Intent F0;
            public final xbv G0;
            
            public final Object invoke(final Object o) {
                final tmi tmi = (tmi)o;
                final bai f4 = ((u9)this.E0).F4();
                CharSequence y4;
                if ((y4 = this.E0.Y4(this.F0)) == null) {
                    y4 = "";
                }
                f4.setTitle(y4);
                ((u9)this.E0).F4().a(this.E0.X4(this.F0));
                if (((u9)this.E0).I4().G(2131429268) == null) {
                    final yjf e0 = this.E0;
                    final a w4 = e0.W4(this.F0, this.G0);
                    final androidx.fragment.app.a a = new androidx.fragment.app.a(((u9)e0).I4());
                    a.e(2131429268, (Fragment)w4.a, w4.b, 1);
                    a.c();
                }
                this.D0.a();
                return fzv.a;
            }
        })));
    }
    
    public abstract a W4(final Intent p0, final xbv p1);
    
    public CharSequence X4(final Intent intent) {
        czd.f((Object)intent, "startIntent");
        return null;
    }
    
    public abstract CharSequence Y4(final Intent p0);
    
    public static final class a
    {
        public final umd a;
        public final String b;
        
        public a(final umd a) {
            czd.f((Object)a, "fragment");
            this.a = a;
            this.b = null;
        }
        
        public a(final umd a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
}

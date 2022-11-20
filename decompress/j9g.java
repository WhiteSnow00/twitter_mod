import android.view.Menu;
import android.view.View;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.view.View$OnTouchListener;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j9g extends wmx
{
    public final jto g1;
    public final n4s h1;
    
    public j9g(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn jn, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final xbm xbm, final jto g1, final Bundle bundle, final m6f m6f, final sds sds, final t8p t8p) {
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)kas, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)jn, "activityFinisher");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)xbm, "releaseCompletable");
        czd.f((Object)g1, "savedStateHandler");
        czd.f((Object)m6f, "legacyUriNavigator");
        czd.f((Object)sds, "telephonyUtil");
        czd.f((Object)t8p, "searchSuggestionCache");
        super(intent, r8x, resources, kas, pwe, jn, cnb, faf, hag, layoutInflater, xba, userIdentifier, xbv, pwe2, f6g, v8p, vam, obi, i7p, xbm, g1, bundle, m6f, sds, t8p);
        this.g1 = g1;
        if (!userIdentifier.isLoggedOutUser()) {
            ((u9)this).D4();
        }
        else {
            ((View)super.e1).setOnTouchListener((View$OnTouchListener)new sih((Object)this, 1));
            final View viewById = ((gml$a$b)((u9)this).c()).E0.findViewById(2131429882);
            czd.e((Object)viewById, "contentView.view.findViewById(R.id.log_in_button)");
            final HorizonComposeButton horizonComposeButton = (HorizonComposeButton)viewById;
            final View viewById2 = ((gml$a$b)((u9)this).c()).E0.findViewById(2131431463);
            czd.e((Object)viewById2, "contentView.view.findViewById(R.id.sign_up_button)");
            final HorizonComposeButton horizonComposeButton2 = (HorizonComposeButton)viewById2;
            horizonComposeButton.setOnClickListener((View$OnClickListener)new ji2((Object)this, 27));
            horizonComposeButton2.setOnClickListener((View$OnClickListener)new esk((Object)this, 23));
        }
        this.h1 = (n4s)pps.n((nsb)new nsb<d1c>(cnb, this) {
            public final cnb D0;
            public final j9g E0;
            
            public final Object invoke() {
                return new d1c((Context)this.D0, (GestureDetector$OnGestureListener)new i9g(this.E0));
            }
        });
    }
    
    @Override
    public final boolean N2(final hai hai, final Menu menu) {
        czd.f((Object)hai, "navComponent");
        czd.f((Object)menu, "menu");
        return true;
    }
    
    public final void Y4(final String s) {
        final cnb e0 = ((u9)this).E0;
        final qdj.a a = new qdj.a((Context)e0);
        final ncs$a m = zh8.m(s);
        m.d = "deeplink";
        a.d = (ncs)((n4j)m).e();
        final Intent a2 = ((qdj)a.e()).a();
        final Object a3 = kn6.a;
        kn6.a.b((Context)e0, a2, null);
    }
}

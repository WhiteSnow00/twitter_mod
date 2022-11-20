import java.util.Arrays;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.RoomHostAnalyticsActivityArgs;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inn extends hhv
{
    public static final inn.inn$a Companion;
    public final jn g1;
    public final vjo h1;
    
    static {
        Companion = new inn.inn$a();
    }
    
    public inn(final Intent intent, final r8x r8x, final Resources resources, final kas kas, final pwe<bai> pwe, final jn g1, final cnb cnb, final faf faf, final hag hag, final LayoutInflater layoutInflater, final xba<q4h> xba, final UserIdentifier userIdentifier, final xbv xbv, final pwe<qoa> pwe2, final f6g f6g, final v8p v8p, final vam vam, final obi<?> obi, final i7p i7p, final cv6 cv6, final xba<bo> xba2, final vjo h1, final RoomHostAnalyticsActivityArgs roomHostAnalyticsActivityArgs, final t8p t8p, final jkq jkq) {
        czd.f((Object)r8x, "viewLifecycle");
        czd.f((Object)resources, "resources");
        czd.f((Object)kas, "requestRepositoryFactory");
        czd.f((Object)pwe, "navManagerLazy");
        czd.f((Object)g1, "activityFinisher");
        czd.f((Object)hag, "loginController");
        czd.f((Object)layoutInflater, "layoutInflater");
        czd.f((Object)userIdentifier, "currentUser");
        czd.f((Object)xbv, "twitterFragmentActivityOptions");
        czd.f((Object)pwe2, "fabPresenter");
        czd.f((Object)f6g, "locationProducer");
        czd.f((Object)v8p, "searchSuggestionController");
        czd.f((Object)vam, "registrableHeadsetPlugReceiver");
        czd.f((Object)obi, "navigator");
        czd.f((Object)cv6, "cookieManagerWrapper");
        czd.f((Object)xba2, "activityResultStream");
        czd.f((Object)h1, "scribeReporter");
        czd.f((Object)roomHostAnalyticsActivityArgs, "args");
        czd.f((Object)t8p, "searchSuggestionCache");
        czd.f((Object)jkq, "softUserConfig");
        super(intent, r8x, resources, kas, (pwe)pwe, g1, cnb, faf, hag, layoutInflater, (xba)xba, userIdentifier, xbv, (pwe)pwe2, f6g, v8p, vam, (obi)obi, i7p, cv6, (xba)xba2, t8p, jkq);
        this.g1 = g1;
        this.h1 = h1;
        final inn.inn$a companion = inn.Companion;
        final String broadcastId = roomHostAnalyticsActivityArgs.getBroadcastId();
        Objects.requireNonNull(companion);
        final String format = String.format("https://twitter.com/i/spaces/%s/analytics", Arrays.copyOf(new Object[] { broadcastId }, 1));
        czd.e((Object)format, "format(this, *args)");
        this.a5(format);
        final h5j k = r8x.k();
        final w19 w19 = new w19();
        w19.c(k.subscribe((lj6)new f$a3((qsb)new inn$b(w19, this, resources))));
    }
    
    public final void a3() {
        vjo.G(this.h1, "end_screen", "analytics", "", "close", null, 48);
        super.a3();
    }
}

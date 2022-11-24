import android.content.Context;
import androidx.fragment.app.Fragment;
import com.twitter.util.user.UserIdentifier;
import com.twitter.android.liveevent.landing.scribe.a;
import com.twitter.model.liveevent.LiveEventConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qzf extends xdu
{
    public final LiveEventConfiguration d0;
    public final jyf e0;
    public final bn f0;
    public final kcm g0;
    public final a h0;
    
    public qzf(final dob dob, final und und, final ydu ydu, final thm thm, final swh swh, final iwp iwp, final hcf hcf, final sfv sfv, final k4f k4f, final evm evm, final LiveEventConfiguration d0, final jyf e0, final bn f0, final kcm g0, final a h0, final tsc tsc, final kbv kbv, final UserIdentifier userIdentifier, final ii7<hp6> ii7, final dsb dsb, final vtt vtt, final t42 t42, final mxe<es6> mxe, final d5q d5q, final xfw xfw, final ocj<vcu> ocj, final fci<?> fci, final qvu qvu, final ewu ewu, final quv quv, final wtv wtv, final yfu yfu, final l5b l5b, final oe5 oe5, final wh5 wh5, final ysq ysq, final evm evm2, final gra<iuu, String> gra, final us5 us5, final rau rau, final nlq nlq, final zv1 zv1, final eh5 eh5, final p6o p6o) {
        e0e.f((Object)ydu, "scribeLogger");
        e0e.f((Object)thm, "replyAction");
        e0e.f((Object)swh, "muteUserAction");
        e0e.f((Object)iwp, "shareTweetAction");
        e0e.f((Object)hcf, "likeTweetNudgeAction");
        e0e.f((Object)k4f, "leaveConversationHelper");
        e0e.f((Object)evm, "protectedRetweetEducationPresenter");
        e0e.f((Object)d0, "configuration");
        e0e.f((Object)e0, "fragmentArgs");
        e0e.f((Object)g0, "releaseCompletable");
        e0e.f((Object)tsc, "httpRequestController");
        e0e.f((Object)kbv, "twitterDatabaseHelper");
        e0e.f((Object)userIdentifier, "currentUserId");
        e0e.f((Object)ii7, "dmComposeHandler");
        e0e.f((Object)dsb, "friendshipCache");
        e0e.f((Object)vtt, "topicsRepository");
        e0e.f((Object)t42, "bookmarkActionHandler");
        e0e.f((Object)mxe, "conversationControlsBottomSheetEduPresenter");
        e0e.f((Object)d5q, "showConversationControlPickerAction");
        e0e.f((Object)xfw, "userNavigationTracker");
        e0e.f((Object)ocj, "tweetActionObserver");
        e0e.f((Object)fci, "navigator");
        e0e.f((Object)qvu, "tweetUploadManager");
        e0e.f((Object)ewu, "tweetUploadTracker");
        e0e.f((Object)quv, "undoSendTimer");
        e0e.f((Object)wtv, "undoNudgePresenter");
        e0e.f((Object)yfu, "tweetDetailActivityLauncher");
        e0e.f((Object)l5b, "fleetsRepository");
        e0e.f((Object)oe5, "communitiesRepository");
        e0e.f((Object)wh5, "communitiesUtils");
        e0e.f((Object)ysq, "spacesLauncher");
        e0e.f((Object)evm2, "trustedFriendsRetweetEduPresenter");
        e0e.f((Object)us5, "communityPinTweetActionHandler");
        e0e.f((Object)rau, "trustedFriendsRepository");
        e0e.f((Object)nlq, "softUserGate");
        e0e.f((Object)zv1, "behavioralEventHelper");
        e0e.f((Object)eh5, "communitiesTweetActionHandler");
        e0e.f((Object)p6o, "roomSendTweetToAudioSpaceManager");
        super(dob, (Fragment)und, ydu, thm, swh, iwp, hcf, sfv, (vvs)null, (cwh)null, k4f, (sjh)null, tsc, kbv, userIdentifier, (ii7)ii7, (xjh)null, dsb, (mxe)mxe, d5q, evm, vtt, t42, g0, (fda)new qzf$a(und), xfw, (ocj)ocj, (dda)null, (fci)fci, qvu, ewu, quv, wtv, yfu, l5b, ysq, oe5, wh5, evm2, (gra)gra, us5, rau, nlq, (o5c)null, eh5, p6o);
        this.d0 = d0;
        this.e0 = e0;
        this.f0 = f0;
        this.g0 = g0;
        this.h0 = h0;
    }
    
    public final void a(final ddu ddu, final hp6 hp6, final vxs vxs) {
        e0e.f((Object)hp6, "tweet");
        final a h0 = this.h0;
        this.m(ddu, hp6, h0.m(h0.i), vxs);
    }
    
    public final void b(final fg4 fg4, final hp6 hp6) {
        e0e.f((Object)hp6, "tweet");
        final bzf bzf = new bzf(this.d0.eventId, this.e0.r(), uyf.c(hp6.F0.Z0), this.e0.s(), this.e0.t(), this.f0, this.g0);
        final Context g = super.g;
        final sfv f = super.f;
        String s;
        if (hp6.l0()) {
            s = "focal";
        }
        else if (hp6.h0()) {
            s = "ancestor";
        }
        else {
            s = null;
        }
        iuk.d(fg4, g, hp6, (vru)bzf, f, s);
    }
    
    public final void v(final hp6 hp6, final dob dob, final ufv ufv, final boolean b, final vxs vxs, final cdu cdu) {
        e0e.f((Object)hp6, "tweet");
        e0e.f((Object)cdu, "actionSource");
        final a h0 = this.h0;
        ufv ufv2 = ufv;
        if (ufv == null) {
            ufv2 = new ufv();
        }
        final String c = h0.c;
        if (c != null) {
            final zxf$a zxf$a = new zxf$a();
            zxf$a.a = c;
            ufv2.h0 = (zxf)((z4j)zxf$a).e();
        }
        final String g = h0.g;
        if (g != null) {
            final rof$a rof$a = new rof$a();
            rof$a.a = g;
            ufv2.i0 = (rof)((z4j)rof$a).e();
        }
        super.v(hp6, dob, ufv2, b, vxs, cdu);
    }
}

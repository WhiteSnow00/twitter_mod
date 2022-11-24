import java.util.Objects;
import java.io.IOException;
import java.util.List;
import tv.periscope.android.api.PsUser;

// 
// Decompiled by Procyon v0.6.0
// 

public final class onl extends k5j<PsUser>
{
    public static final nmp<PsUser> b;
    
    static {
        onl.b = new onl();
    }
    
    public onl() {
        super(1);
    }
    
    public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
        final PsUser psUser = new PsUser();
        psUser.className = rmp.I();
        psUser.id = rmp.I();
        psUser.createdAt = rmp.I();
        psUser.updatedAt = rmp.I();
        psUser.username = rmp.I();
        psUser.displayName = rmp.I();
        psUser.initials = rmp.I();
        psUser.description = rmp.I();
        List d;
        if (n < 1) {
            d = ar4.d(rmp, (nmp)lnl.b);
        }
        else {
            d = (List)((k5j)new ar4$a((nmp)lnl.b)).a(rmp);
        }
        psUser.profileImageUrls = d;
        psUser.numFollowers = rmp.A();
        psUser.numFollowing = rmp.A();
        psUser.isFollowing = rmp.u();
        psUser.isMuted = rmp.u();
        psUser.isBlocked = rmp.u();
        psUser.isTwitterFriend = rmp.u();
        psUser.isFacebookFriend = rmp.u();
        psUser.isGoogleFriend = rmp.u();
        psUser.numHearts = rmp.A();
        psUser.isEmployee = rmp.u();
        psUser.numHeartsGiven = rmp.A();
        psUser.participantIndex = rmp.A();
        psUser.isVerified = rmp.u();
        psUser.twitterId = rmp.I();
        return psUser;
    }
    
    public final void f(final smp smp, final Object o) throws IOException {
        final PsUser psUser = (PsUser)o;
        final smp g = smp.G(psUser.className).G(psUser.id).G(psUser.createdAt).G(psUser.updatedAt).G(psUser.username).G(psUser.displayName).G(psUser.initials).G(psUser.description);
        final List profileImageUrls = psUser.profileImageUrls;
        final ar4$a ar4$a = new ar4$a((nmp)lnl.b);
        Objects.requireNonNull(g);
        ((k5j)ar4$a).c(g, (Object)profileImageUrls);
        final int a = o5j.a;
        g.A(psUser.numFollowers).A(psUser.numFollowing).t(psUser.isFollowing).t(psUser.isMuted).t(psUser.isBlocked).t(psUser.isTwitterFriend).t(psUser.isFacebookFriend).t(psUser.isGoogleFriend).A(psUser.numHearts).t(psUser.isEmployee).A(psUser.numHeartsGiven).A(psUser.participantIndex).t(psUser.isVerified).G(psUser.twitterId);
    }
}

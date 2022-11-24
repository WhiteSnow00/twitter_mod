import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;
import android.content.Context;
import tv.periscope.model.b;
import tv.periscope.android.api.service.GuestServiceApi;
import okhttp3.logging.HttpLoggingInterceptor$Level;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r8n implements r54
{
    public static final d Companion;
    public final baw F0;
    public final vf2 G0;
    public final u54 H0;
    public final HttpLoggingInterceptor$Level I0;
    public final q8n J0;
    public final aba K0;
    public final GuestServiceApi L0;
    public final xun M0;
    public final bxo N0;
    public final kcm O0;
    public final k1n P0;
    public final qdw Q0;
    public awj<? extends b, ? extends qu3> R0;
    public boolean S0;
    
    static {
        Companion = new d();
    }
    
    public r8n(final Context context, final baw f0, final vf2 g0, final u54 h0, final HttpLoggingInterceptor$Level i0, final q8n j0, final aba k0, final GuestServiceApi l0, final xun m0, final znl<w1> znl, final bxo n0, final kcm o0, final l1n l1n, final u1n u1n, final k1n p16, final qdw q0) {
        e0e.f((Object)context, "context");
        e0e.f((Object)f0, "userCache");
        e0e.f((Object)g0, "broadcastCache");
        e0e.f((Object)h0, "chatRoomManager");
        e0e.f((Object)i0, "logLevel");
        e0e.f((Object)j0, "roomChatEventDelegate");
        e0e.f((Object)k0, "eventBus");
        e0e.f((Object)l0, "guestServiceApi");
        e0e.f((Object)m0, "roomPlaybackManager");
        e0e.f((Object)znl, "replayEventPublishSubject");
        e0e.f((Object)n0, "ioScheduler");
        e0e.f((Object)o0, "releaseCompletable");
        e0e.f((Object)l1n, "emojiSentDispatcher");
        e0e.f((Object)u1n, "privateEmojiSentDispatcher");
        e0e.f((Object)p16, "emojiReceivedDispatcher");
        e0e.f((Object)q0, "userInfo");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p16;
        this.Q0 = q0;
        final de6 de6 = new de6();
        de6.d(new b39[] { ((t5j)l1n.a).subscribe((rk6)new cyt((stb)new r8n$a(this), 19)), ((t5j)u1n.a).subscribe((rk6)new xql((stb)new r8n$b(this), 16)), (b39)j98.i(((t5j)znl).doOnNext((rk6)new ucj((stb)new r8n$c(this), 5))) });
        o0.i((sj)new fwt(de6, 6));
    }
    
    public final void a() {
        this.J0.Q0.onComplete();
        this.H0.l();
        this.H0.q((t54)t54.u);
        this.H0.g = (ai6)ai6.x;
        this.K0.k((Object)this);
        this.S0 = false;
    }
    
    public final void b(final b b, final qu3 qu3) {
        this.K0.k((Object)this);
        if (this.H0.g(qu3)) {
            this.c(b, qu3, false, false);
        }
        this.R0 = (awj<? extends b, ? extends qu3>)new awj((Object)b, (Object)qu3);
    }
    
    public final void c(final b b, final qu3 qu3, final boolean b2, final boolean b3) {
        pjk pjk;
        if (b2) {
            pjk = pjk.J0;
        }
        else {
            pjk = pjk.H0;
        }
        this.H0.m(qu3);
        final u54 h0 = this.H0;
        final baw f0 = this.F0;
        final vf2 g0 = this.G0;
        final q8n j0 = this.J0;
        h0.i(f0, g0, (v54$b)j0, (v54$a)j0, (vz3)j0, (i22)null, b.w());
        this.H0.r(this.F0, pjk, (cpk)this.M0, (r54)this, b2, b3);
        this.H0.j(1, pjk, this.I0, b);
    }
    
    public final long y() {
        return 0L;
    }
    
    public static final class d
    {
        public static final String a(final d d, final long n) {
            Objects.requireNonNull(d);
            final String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(n));
            e0e.e((Object)format, "SimpleDateFormat(RFC3339\u2026le.US).format(Date(this))");
            return format;
        }
    }
}

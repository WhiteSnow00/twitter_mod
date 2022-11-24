import com.google.android.material.snackbar.BaseTransientBottomBar;
import androidx.emoji2.text.c$h;
import android.graphics.Typeface;
import androidx.emoji2.text.f$a;
import java.lang.reflect.Method;
import com.google.android.material.snackbar.BaseTransientBottomBar$g;
import com.google.android.material.snackbar.Snackbar;
import android.content.Context;
import com.twitter.features.nudges.tweets.ToxicTweetNudgeActivity$a;
import com.twitter.ui.widget.ObservableScrollView;
import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage$a;
import java.nio.ByteBuffer;
import androidx.emoji2.text.h;
import androidx.emoji2.text.f$b;
import com.twitter.app.dm.inbox.DMInboxController;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View$OnClickListener;
import com.twitter.features.nudges.tweets.ToxicTweetNudgeActivity;
import android.view.Surface;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import android.widget.ImageView;
import com.twitter.tweetdetail.di.view.TweetDetailTimelineViewGraph;
import java.util.Objects;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import tv.periscope.android.hydra.HydraAudioIndicatingProfileImage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlb implements Runnable
{
    public final int F0;
    public final Object G0;
    
    public dlb(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final void run() {
        switch (this.F0) {
            case 20: {
                ((qo2)this.G0).e();
                return;
            }
            case 19: {
                final HydraAudioIndicatingProfileImage hydraAudioIndicatingProfileImage = (HydraAudioIndicatingProfileImage)this.G0;
                final HydraAudioIndicatingProfileImage$a companion = HydraAudioIndicatingProfileImage.Companion;
                e0e.f((Object)hydraAudioIndicatingProfileImage, "this$0");
                hydraAudioIndicatingProfileImage.a();
                return;
            }
            case 18: {
                ((CountDownLatch)this.G0).countDown();
                return;
            }
            case 17: {
                final njt njt = (njt)this.G0;
                final int n1 = njt.N1;
                njt.Z1(true);
                final njt$d d1 = njt.D1;
                if (d1 != null) {
                    ((View)d1).removeCallbacks((Runnable)njt.L1);
                }
                return;
            }
            case 16: {
                final fl1 fl1 = (fl1)this.G0;
                final pbx c = ((o59)fl1).c();
                if (c != null) {
                    c.g((rbx)new fl1$a(fl1.b, fl1.a.e().H0));
                    c.j();
                }
                else {
                    w9.w("Dock animator is null");
                    final rbx b = fl1.b;
                    if (b != null) {
                        b.p((View)fl1.a.e().G0);
                    }
                }
                return;
            }
            case 15: {
                final View view = (View)this.G0;
                view.setFocusable(true);
                view.setFocusableInTouchMode(true);
                view.requestFocus();
                return;
            }
            case 14: {
                final cgu cgu = (cgu)this.G0;
                final piu z1 = cgu.z1;
                Objects.requireNonNull(z1);
                cgu.X4(((TweetDetailTimelineViewGraph)((x9)((und)z1).b1()).n()).R());
                return;
            }
            case 13: {
                final wnq wnq = (wnq)this.G0;
                e0e.f((Object)wnq, "this$0");
                wnq.a(wnq);
                return;
            }
            case 12: {
                final ImageView imageView = (ImageView)this.G0;
                e0e.f((Object)imageView, "$this_animateReaction");
                imageView.setVisibility(4);
                ((View)imageView).clearAnimation();
                return;
            }
            case 11: {
                final g5p g5p = (g5p)this.G0;
                final ObservableScrollView m = g5p.m;
                ((View)m).scrollTo(((View)m).getScrollX(), -g5p.g);
                return;
            }
            case 10: {
                ((mwd)this.G0).H0.s0(true);
                return;
            }
            case 9: {
                final ea4 ea4 = (ea4)this.G0;
                ea4.I0 = true;
                if (ea4.H0 == null) {
                    ea4.H0 = Choreographer.getInstance();
                }
                ea4.H0.postFrameCallback((Choreographer$FrameCallback)ea4);
                return;
            }
            case 8: {
                ((jjk$a)this.G0).F0.G0.p(false);
                return;
            }
            case 7: {
                final y5 y5 = (y5)this.G0;
                final Surface surface = (Surface)y5.s.get();
                if (surface != null && (!ita.c().b("android_mediaplayer_audio_only_playback_enabled", false) || !d4j.d0(y5.L))) {
                    y5.o();
                    y5.f(surface);
                }
                else {
                    y5.o();
                }
                return;
            }
            case 6: {
                final i4 i4 = (i4)this.G0;
                if (i4.I0.g() && i4.I0.d().J()) {
                    i4.N(false);
                }
                return;
            }
            case 5: {
                final ToxicTweetNudgeActivity toxicTweetNudgeActivity = (ToxicTweetNudgeActivity)this.G0;
                final ToxicTweetNudgeActivity$a companion2 = ToxicTweetNudgeActivity.Companion;
                e0e.f((Object)toxicTweetNudgeActivity, "this$0");
                ((vnd)toxicTweetNudgeActivity).finish();
                return;
            }
            case 4: {
                final qt7 qt7 = (qt7)this.G0;
                final int l0 = qt7.L0;
                if (qt7.d()) {
                    qt7.e(true);
                    qt7.h();
                }
                return;
            }
            case 3: {
                final fvl fvl = (fvl)this.G0;
                final ayb c2 = fvl.c;
                final d1x d1x = new d1x((Object)fvl, 11);
                final Context context = ((View)c2.b).getContext();
                final Snackbar a = f6p.a(context, (View)c2.a, context.getResources().getText(2131957041), 0);
                a.k(((BaseTransientBottomBar)a).b.getText(2131959594), (View$OnClickListener)d1x);
                final BaseTransientBottomBar$g c3 = ((BaseTransientBottomBar)a).c;
                ((View)c3).measure(0, 0);
                final int measuredHeight = ((View)c3).getMeasuredHeight();
                int n2;
                if (c2.c.c()) {
                    n2 = -((View)c2.c).getHeight();
                }
                else {
                    n2 = 0;
                }
                final float y6 = ((View)c2.b).getY();
                final float n3 = (float)n2;
                final float y7 = y6 + n3;
                final float y8 = ((View)c2.b).getY();
                final float n4 = (float)measuredHeight;
                ((View)c3).setY(y7);
                ((View)c3).setZ(0.0f);
                c2.a.addView((View)c3, 0);
                ((View)c3).setAlpha(0.0f);
                ((View)c3).animate().alpha(1.0f).translationY(y8 - n4 + n3).setInterpolator((TimeInterpolator)new DecelerateInterpolator()).start();
                f.a(xw0.j(2750L, (sj)new zxb(c2, (View)c3, y7)), (gba)c2.d);
                return;
            }
            case 2: {
                final DMInboxController dmInboxController = (DMInboxController)this.G0;
                e0e.f((Object)dmInboxController, "this$0");
                dmInboxController.d(false);
                return;
            }
            case 1: {
                ((otl)this.G0).F0.a();
                return;
            }
            case 0: {
                final f$b f$b = (f$b)this.G0;
                Object o = f$b.I0;
                synchronized (o) {
                    if (f$b.M0 == null) {
                        monitorexit(o);
                        return;
                    }
                    monitorexit(o);
                    try {
                        o = f$b.c();
                        final int e = ((slb)o).e;
                        if (e == 2) {
                            synchronized (f$b.I0) {
                                monitorexit(f$b.I0);
                            }
                        }
                        if (e == 0) {
                            try {
                                final Method b2 = cwt.b;
                                cwt$a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                final f$a h0 = f$b.H0;
                                final Context f0 = f$b.F0;
                                Objects.requireNonNull(h0);
                                final Typeface b3 = smv.a.b(f0, new slb[] { (slb)o }, 0);
                                o = bnv.e(f$b.F0, ((slb)o).a);
                                if (o != null && b3 != null) {
                                    final h a2 = h.a(b3, (ByteBuffer)o);
                                    cwt$a.b();
                                    synchronized (f$b.I0) {
                                        final c$h m2 = f$b.M0;
                                        if (m2 != null) {
                                            m2.b(a2);
                                        }
                                        monitorexit(f$b.I0);
                                        f$b.a();
                                        return;
                                    }
                                }
                                o = new RuntimeException("Unable to open file.");
                                throw o;
                            }
                            finally {
                                o = cwt.b;
                                cwt$a.b();
                            }
                        }
                        o = new StringBuilder();
                        ((StringBuilder)o).append("fetchFonts result is not OK. (");
                        ((StringBuilder)o).append(e);
                        ((StringBuilder)o).append(")");
                        throw new RuntimeException(((StringBuilder)o).toString());
                    }
                    finally {
                        synchronized (f$b.I0) {
                            final c$h m3 = f$b.M0;
                            if (m3 != null) {
                                final Throwable t;
                                m3.a(t);
                            }
                            monitorexit(f$b.I0);
                            f$b.a();
                            return;
                        }
                    }
                }
                break;
            }
        }
        final o44 o2 = (o44)this.G0;
        o2.w1 = true;
        o2.k1.p();
    }
}

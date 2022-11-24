import androidx.fragment.app.Fragment;
import android.app.Dialog;
import com.twitter.onboarding.ocf.NavigationHandler;
import java.util.List;
import android.app.Activity;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView$c;
import com.twitter.ui.widget.timeline.a;
import com.twitter.ui.widget.timeline.TimelineInlinePromptView;
import android.view.animation.AnimationUtils;
import java.util.Objects;
import tv.periscope.android.common.PeriscopeInterstitialActivity;
import android.view.ViewGroup;
import android.content.Intent;
import android.net.Uri;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import okhttp3.HttpUrl;
import tv.periscope.android.ui.broadcast.replay.c;
import tv.periscope.android.ui.broadcast.replay.ReplayScrubView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w5a implements View$OnClickListener
{
    public final int F0;
    public final Object G0;
    
    public w5a(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        switch (this.F0) {
            default: {
                final ReplayScrubView$c b1 = ((ReplayScrubView)this.G0).b1;
                if (b1 != null) {
                    final c c = (c)b1;
                    if (c.h != null) {
                        final long max = Math.max(0L, c.e.getSeekTo() - tv.periscope.android.ui.broadcast.replay.c.y);
                        final zl2 q0 = ((com.twitter.media.av.broadcast.view.fullscreen.c)c.h).Q0;
                        if (q0.G0.a() instanceof pxp) {
                            final pxp pxp = (pxp)q0.G0.a();
                            if (pxp.g() != null) {
                                final HttpUrl parse = HttpUrl.parse(pxp.g());
                                if (parse != null) {
                                    final String string = parse.newBuilder().addQueryParameter("t", String.valueOf(max / 1000L)).build().toString();
                                    final Activity f0 = q0.F0;
                                    final List w = ojf.w((Object)new trk(q0.I0.g((Context)f0), (trk$a)new n5w((Object)q0, (Object)string, 11)), (Object[])new trk[] { new trk(q0.I0.a((Context)q0.F0), (trk$a)new jf8((Object)q0, (Object)string, 6)), new trk(q0.I0.c((Context)q0.F0), (trk$a)new nea(q0, string, 6)) });
                                    final int size = w.size();
                                    final String[] array = new String[size];
                                    for (int i = 0; i < size; ++i) {
                                        array[i] = ((trk)w.get(i)).a;
                                    }
                                    final jng jng = new jng((Context)f0, 0);
                                    jng.l((CharSequence[])array, (DialogInterface$OnClickListener)new jv2((Object)w, 3));
                                    ((Dialog)jng.create()).show();
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 12: {
                final sw6 sw6 = (sw6)this.G0;
                final Uri parse2 = Uri.parse(sw6.G0.getString(2131956285));
                if (parse2 != null) {
                    final Intent intent = new Intent("android.intent.action.VIEW", parse2);
                    intent.setFlags(268435456);
                    sw6.G0.startActivity(intent);
                }
                return;
            }
            case 11: {
                final pyc pyc = (pyc)this.G0;
                e0e.f((Object)pyc, "this$0");
                pyc.d.E(pyc.c.a());
                return;
            }
            case 10: {
                final pal pal = (pal)this.G0;
                e0e.f((Object)pal, "this$0");
                e0e.e((Object)view, "it");
                if (pal.p.a.getVisibility() == 0) {
                    pal.p.a();
                }
                if (pal.q != null) {
                    final rib$a c2 = ((mgl)pal.d).c();
                    boolean b2;
                    if (c2 instanceof rib$a$c) {
                        final int a = o5j.a;
                        b2 = (((rib$a$c)c2).a ^ true);
                    }
                    else {
                        b2 = false;
                    }
                    if (b2) {
                        final mgl mgl = (mgl)pal.d;
                        if (mgl.k != null) {
                            if (mgl.l != null) {
                                mgl.h.onNext((Object)new rib$a$c(true));
                                final k6z k = mgl.k;
                                mgl.l.f();
                                k.b();
                                mgl.b(true);
                            }
                        }
                        final View a2 = pal.a;
                        if (a2 instanceof ViewGroup) {
                            final ojt p = pal.p;
                            final ViewGroup viewGroup = (ViewGroup)a2;
                            p.b(view, viewGroup, (CharSequence)((View)viewGroup).getResources().getString(2131955976));
                        }
                    }
                    else {
                        final mgl mgl2 = (mgl)pal.d;
                        if (mgl2.k != null) {
                            if (mgl2.l != null) {
                                mgl2.h.onNext((Object)new rib$a$c(false));
                                final k6z j = mgl2.k;
                                mgl2.l.f();
                                j.a();
                                mgl2.b(false);
                            }
                        }
                        final View a3 = pal.a;
                        if (a3 instanceof ViewGroup) {
                            final ojt p2 = pal.p;
                            final ViewGroup viewGroup2 = (ViewGroup)a3;
                            p2.b(view, viewGroup2, (CharSequence)((View)viewGroup2).getResources().getString(2131955975));
                        }
                    }
                }
                return;
            }
            case 9: {
                final PeriscopeInterstitialActivity periscopeInterstitialActivity = (PeriscopeInterstitialActivity)this.G0;
                final int y0 = PeriscopeInterstitialActivity.Y0;
                Objects.requireNonNull(periscopeInterstitialActivity);
                ((Context)periscopeInterstitialActivity).startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((Context)periscopeInterstitialActivity).getString(2131956276))));
                return;
            }
            case 8: {
                final vzw vzw = (vzw)this.G0;
                if (!vzw.i2) {
                    final q4 x2 = vzw.x2;
                    if (x2 != null) {
                        if (x2.e()) {
                            vzw.z2.getAutoPlayableItem().a1();
                            vzw.q2.g((int)vzw.g2);
                            vzw.j2 = true;
                            vzw.p2.setVisibility(0);
                            vzw.p2.startAnimation(AnimationUtils.loadAnimation((Context)((Fragment)vzw).L0(), 2130772003));
                        }
                        else {
                            int c3;
                            if (vzw.j2) {
                                c3 = (int)vzw.g2;
                            }
                            else {
                                c3 = vzw.c2;
                            }
                            vzw.j2 = false;
                            vzw.j2(c3);
                        }
                    }
                }
                return;
            }
            case 7: {
                final TimelineInlinePromptView timelineInlinePromptView = (TimelineInlinePromptView)this.G0;
                final int m0 = TimelineInlinePromptView.M0;
                if (((a)timelineInlinePromptView).F0 != null) {
                    final Object tag = view.getTag();
                    if (tag instanceof iqv) {
                        final iqv iqv = (iqv)tag;
                        ((a)timelineInlinePromptView).F0.a((a)timelineInlinePromptView, iqv.b, iqv.a, false, iqv.c);
                    }
                }
                return;
            }
            case 6: {
                final p7j p7j = (p7j)this.G0;
                e0e.f((Object)p7j, "$emitter");
                ((u6j$a)p7j).onNext((Object)fmt$c.a);
                return;
            }
            case 5: {
                final lxq lxq = (lxq)this.G0;
                final lxq$a companion = lxq.Companion;
                e0e.f((Object)lxq, "this$0");
                ((Dialog)lxq).dismiss();
                return;
            }
            case 4: {
                final ofr ofr = (ofr)this.G0;
                final int w2 = ofr.W0;
                e0e.f((Object)ofr, "this$0");
                ((dk0)ofr).dismiss();
                return;
            }
            case 3: {
                final zcn zcn = (zcn)this.G0;
                e0e.f((Object)zcn, "this$0");
                zcn.N0.a.onNext((Object)kni.a);
                return;
            }
            case 2: {
                final oxn oxn = (oxn)this.G0;
                final oxn.a companion2 = oxn.Companion;
                e0e.f((Object)oxn, "this$0");
                ((dk0)oxn).dismiss();
                return;
            }
            case 1: {
                ((com.twitter.onboarding.ocf.settings.a)this.G0).k();
                return;
            }
            case 0: {
                final y5a y5a = (y5a)this.G0;
                final NavigationHandler l0 = y5a.L0;
                final dtv c4 = y5a.K0.c;
                vmw.g((Object)c4);
                l0.d(new rrd(c4), null);
            }
        }
    }
}

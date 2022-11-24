import com.twitter.trustedfriends.TrustedFriendsMembersContentViewArgs;
import android.content.res.Resources;
import com.twitter.util.user.UserIdentifier;
import com.twitter.navigation.subscriptions.SubscriptionsGlobalSettingsContentViewArgs;
import com.twitter.navigation.subscriptions.ReferringPage;
import com.twitter.navigation.subscriptions.SubscriptionsSignUpContentViewArgs;
import com.twitter.navigation.subscriptions.ReferringPage$Dash;
import android.view.View$OnClickListener;
import com.twitter.brandedlikepreview.BrandedLikePreviewContentViewArgs;
import com.twitter.creator.CreatorContentViewArgs;
import java.util.List;
import com.twitter.users.UsersContentViewArgs;
import com.twitter.users.api.IncomingFriendshipsContentViewArgs;
import com.twitter.safetycenter.SafetyCenterWebviewContentViewArgs;
import android.content.Context;
import com.twitter.business.professionalhome.ProfessionalHomeContentViewArgs;
import com.twitter.ads.AdsCompanionContentViewArgs;
import com.twitter.birdwatch.navigation.BirdwatchWebViewContentViewArgs;
import com.twitter.birdwatch.navigation.BirdwatchHomePageActivityArgs;
import com.twitter.users.timeline.SuperFollowersTimelineContentViewArgs;
import com.twitter.onboarding.connect.tab.PeopleDiscoveryContentViewArgs;
import com.twitter.users.timeline.FollowingTimelineContentViewArgs;
import android.net.Uri;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.delegate.api.DelegateSettingsWebViewContentViewArgs;
import android.app.Activity;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nhg implements fa3
{
    public final int a;
    public final vhg b;
    
    public nhg(final vhg b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(Object o) {
        switch (this.a) {
            default: {
                final vhg b = this.b;
                final kg9 kg9 = (kg9)o;
                Objects.requireNonNull(b);
                final nh9 s1 = nh9.s1;
                final boolean b2 = kg9 instanceof kg9$a;
                boolean b3 = false;
                if (b2) {
                    final nh9 a = ((kg9$a)kg9).a;
                    final qdw d = pdw.d();
                    final UserIdentifier k = d.k();
                    if (a == nh9.F0) {
                        y0n.a((Activity)((u9)b).G0, b.f1, ecg.G0, (qgv)null, (hub)new qhg((Object)b, 0));
                    }
                    else if (a == nh9.M0) {
                        y0n.a((Activity)((u9)b).G0, b.f1, ecg.H0, (qgv)null, (hub)new shg(b, 0));
                    }
                    else if (a == nh9.t1) {
                        ((kcv)b).T0.b((ContentViewArgs)new DelegateSettingsWebViewContentViewArgs(((u9)b).H4(2131959597), ((u9)b).H4(2131959250)));
                    }
                    else if (a == nh9.N0) {
                        ((hgg)b.k1.get()).a();
                    }
                    else if (a == nh9.O0) {
                        ((hgg)b.k1.get()).a();
                    }
                    else if (a == nh9.h1) {
                        ((kcv)b).T0.d((cn)new hsl.a().e());
                        ((Activity)((u9)b).G0).overridePendingTransition(2130772067, 0);
                    }
                    else if (a == nh9.g1) {
                        b.V1.a(k);
                    }
                    else if (a == nh9.T0) {
                        ((kcv)b).T0.b(qjy.k(k, d.getUser(), null));
                    }
                    else if (a == nh9.U0) {
                        ((kcv)b).T0.b((ContentViewArgs)new FollowingTimelineContentViewArgs(k.getId(), (String)null));
                    }
                    else if (a == nh9.L0) {
                        ((kcv)b).T0.b((ContentViewArgs)PeopleDiscoveryContentViewArgs.INSTANCE);
                    }
                    else if (a == nh9.n1) {
                        ((kcv)b).T0.b((ContentViewArgs)new SuperFollowersTimelineContentViewArgs(k, (String)null));
                    }
                    else if (a == nh9.a1) {
                        kqh.a((Activity)((u9)b).G0, k, ((kcv)b).T0, d.c());
                    }
                    else if (a == nh9.H0) {
                        if (ita.b().b("birdwatch_home_page_enabled", false)) {
                            ((kcv)b).T0.b((ContentViewArgs)BirdwatchHomePageActivityArgs.INSTANCE);
                        }
                        else {
                            ((kcv)b).T0.b((ContentViewArgs)BirdwatchWebViewContentViewArgs.createHistoryArgs(d.c()));
                        }
                    }
                    else if (a == nh9.I0) {
                        final q62 w1 = b.W1;
                        if (!w1.c.a(slq.M0)) {
                            if (w1.b.d()) {
                                w1.a.d((cn)new g52.a().e());
                            }
                            else {
                                w1.a.d((cn)((z4j)new z62$a()).e());
                            }
                        }
                    }
                    else if (a != nh9.q1 && a != nh9.r1) {
                        if (a == nh9.X0) {
                            sbw.b((tlm)new fg4(wba.A));
                            final f8w t1 = b.T1;
                            if (!t1.b.a(slq.J0)) {
                                t1.a.d((cn)new d8w());
                            }
                        }
                        else if (a == nh9.G0) {
                            final fci<?> t2 = ((kcv)b).T0;
                            final Resources o2 = ((u9)b).O0;
                            e0e.f((Object)o2, "resources");
                            final String string = o2.getString(2131951921);
                            e0e.e((Object)string, "resources.getString(R.string.ads_companion_url)");
                            t2.b((ContentViewArgs)new AdsCompanionContentViewArgs(string));
                        }
                        else if (a == nh9.e1) {
                            ((kcv)b).T0.b((ContentViewArgs)new ProfessionalHomeContentViewArgs());
                        }
                        else if (a == nh9.f1) {
                            final dob g0 = ((u9)b).G0;
                            ((Context)g0).startActivity(ak1.p((Context)g0, 2));
                        }
                        else if (a == nh9.j1) {
                            ((kcv)b).T0.d((cn)new vpp());
                        }
                        else if (a == nh9.i1) {
                            ((kcv)b).T0.b((ContentViewArgs)new SafetyCenterWebviewContentViewArgs(null, ((u9)b).H4(2131957139)));
                        }
                        else if (a == nh9.V0) {
                            b.U1.a(((u9)b).H4(2131954292));
                        }
                        else if (a == nh9.d1) {
                            if (ita.b().b("android_usergroup_refactor_pending_followers", false)) {
                                ((kcv)b).T0.b((ContentViewArgs)IncomingFriendshipsContentViewArgs.INSTANCE);
                            }
                            else {
                                ((kcv)b).T0.b((ContentViewArgs)new UsersContentViewArgs(-1L, -1L, 18, 0L, (String)null, (List)null, (j84$a)null, (String)null, false, false, (String)null, false, (String)null, (String)null, 0L, false));
                            }
                        }
                        else if (a == nh9.p1) {
                            b.Q1.a();
                        }
                        else if (a == nh9.b1) {
                            ((kcv)b).T0.b((ContentViewArgs)new CreatorContentViewArgs());
                            sbw.b((tlm)h67$k.a);
                        }
                        else if (a == nh9.o1) {
                            ((kcv)b).T0.d((cn)hkt.Companion.a((Context)((u9)b).G0));
                        }
                        else if (a == nh9.J0) {
                            ((kcv)b).T0.b((ContentViewArgs)new BrandedLikePreviewContentViewArgs());
                        }
                        else if (a == nh9.k1) {
                            ((kcv)b).T0.d(plq.a().b((Context)((u9)b).G0, slq.G0));
                        }
                        else if (a == nh9.Y0) {
                            ((kcv)b).T0.d(plq.a().b((Context)((u9)b).G0, slq.H0));
                        }
                        else if (a == s1) {
                            if (b.R1) {
                                final TrustedFriendsMembersContentViewArgs b4 = b.o1.b;
                                if (b4 != null) {
                                    b.q1.d((Object)b4);
                                }
                                else {
                                    b.r1.a((dgd)new q6s(2131959091, (rfd$c)rfd$c$b.b, "", Integer.valueOf(74), (View$OnClickListener)null, (Integer)null, (View$OnClickListener)null));
                                }
                                o = new fg4();
                                ((o1p)o).q(new String[] { "home", "", "", "dash", "twitter_circle_clicked" });
                                sbw.b((tlm)o);
                            }
                        }
                        else if (a == nh9.W0) {
                            b.U1.a(((u9)b).H4(2131953025));
                        }
                        else if (a == nh9.Z0) {
                            b.U1.a(((u9)b).H4(2131953026));
                        }
                        else if (a == nh9.K0) {
                            b.d5(fgg.g);
                            ((qig)b.O1.get()).c();
                        }
                        else if (a == nh9.l1) {
                            b.d5(fgg.h);
                            ((qig)b.O1.get()).c();
                        }
                        else if (a == nh9.m1) {
                            b.d5(fgg.i);
                            ((qig)b.O1.get()).c();
                        }
                    }
                    else {
                        final rpr l1 = b.L1;
                        Objects.requireNonNull(l1);
                        final boolean c = rpr.Companion.c();
                        l1.d.a();
                        l1.d.d();
                        if (c ^ true) {
                            b3 = true;
                        }
                        if (b3) {
                            ((kcv)b).T0.b((ContentViewArgs)new SubscriptionsSignUpContentViewArgs((ReferringPage)ReferringPage$Dash.INSTANCE));
                        }
                        else {
                            ((kcv)b).T0.b((ContentViewArgs)new SubscriptionsGlobalSettingsContentViewArgs(t8m.G0));
                        }
                    }
                }
                else if (kg9 instanceof kg9$c) {
                    b.V1.a(((u9)b).M0);
                }
                else if (kg9 instanceof kg9$d) {
                    final qgv a2 = ((kg9$d)kg9).a;
                    if (pdw.b(a2.f()).g() && zzz.U()) {
                        b.c2.b(a2.f());
                    }
                    else {
                        y0n.a((Activity)((u9)b).G0, b.f1, ecg.F0, a2, (hub)new rhg((Object)b, 0));
                    }
                }
                else if (kg9 instanceof kg9$b && ((kg9$b)kg9).a == s1) {
                    final UserIdentifier i = pdw.d().k();
                    Objects.requireNonNull(a7u.Companion);
                    e0e.f((Object)i, "userIdentifier");
                    gcu gcu;
                    if (i.isRegularUser()) {
                        gcu = fcu.e(i, "duration_fatigue");
                    }
                    else {
                        gcu = fcu.c();
                    }
                    if (!gcu.b("trusted_friends_new_badge_expiration")) {
                        final gcu$c j = gcu.i();
                        final g5s a3 = nq1.a;
                        j.c("trusted_friends_new_badge_expiration", System.currentTimeMillis() + 604800000L).e();
                    }
                }
                return;
            }
            case 0: {
                final vhg b5 = this.b;
                final kni kni = (kni)o;
                b5.h1.a();
            }
        }
    }
}

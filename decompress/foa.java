import com.twitter.weaver.mvi.MviViewModel;
import java.util.List;
import com.twitter.profilemodules.model.business.HourMinute;
import com.twitter.profilemodules.model.business.Weekday;
import com.twitter.media.legacy.widget.AttachmentMediaView$c;
import com.twitter.nft.subsystem.model.NFTOpenseaCollectionMetadata;
import com.twitter.nft.subsystem.model.NFTCollection;
import com.twitter.subsystem.reactions.ui.view.ReactionPickerContainerView$a;
import com.twitter.rooms.entrypoint.RoomEntrypointViewModel;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.profiles.EditProfileAvatarContentViewArgs;
import com.twitter.app.safety.mutedkeywords.composer.b;
import com.twitter.business.model.hours.IntervalPosition;
import com.twitter.util.user.UserIdentifier;
import android.os.ResultReceiver;
import android.widget.TextView;
import android.content.Context;
import com.twitter.app.dm.DMConversationContentViewProvider;
import com.twitter.media.legacy.widget.AttachmentMediaView;
import java.util.Objects;
import com.twitter.onboarding.ocf.NavigationHandler;
import com.twitter.onboarding.ocf.media.SelectBannerSubtaskViewHost;
import android.content.DialogInterface;
import android.app.Dialog;
import com.twitter.subsystem.reactions.ui.view.ReactionPickerContainerView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class foa implements View$OnClickListener
{
    public final int D0;
    public final Object E0;
    public final Object F0;
    
    public foa(final Object e0, final Object f0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void onClick(final View view) {
        final int d0 = this.D0;
        String name = null;
        switch (d0) {
            default: {
                ((qkq)this.F0).a(((qoa)this.E0).a());
                return;
            }
            case 19: {
                ((rq)this.E0).r.c((vtu)this.F0);
                return;
            }
            case 18: {
                final ReactionPickerContainerView reactionPickerContainerView = (ReactionPickerContainerView)this.E0;
                final ozl ozl = (ozl)this.F0;
                final int o0 = ReactionPickerContainerView.O0;
                czd.f((Object)reactionPickerContainerView, "this$0");
                czd.f((Object)ozl, "$type");
                final ReactionPickerContainerView$a l0 = reactionPickerContainerView.L0;
                if (l0 != null) {
                    l0.b(ozl);
                }
                reactionPickerContainerView.J0.clear();
                return;
            }
            case 17: {
                final ven ven = (ven)this.E0;
                final wdn wdn = (wdn)this.F0;
                czd.f((Object)ven, "this$0");
                czd.f((Object)wdn, "$effect");
                ven.X0.onNext((Object)((wdn$j)wdn).d);
                return;
            }
            case 16: {
                final smt smt = (smt)this.E0;
                final rkt rkt = (rkt)this.F0;
                if (((List)smt.E0.b).contains(rkt.a)) {
                    final com.twitter.onboarding.ocf.topicselector.b e0 = smt.E0;
                    final String a = rkt.a;
                    ((List)e0.c).remove(a);
                    ((List)e0.b).remove(a);
                    e0.g.onNext((Object)e0.b);
                    smt.a(rkt.a, "unfollow");
                }
                else {
                    final com.twitter.onboarding.ocf.topicselector.b e2 = smt.E0;
                    final String a2 = rkt.a;
                    if (((List)e2.e).contains(a2)) {
                        ((List<String>)e2.c).add(a2);
                    }
                    ((List<String>)e2.b).add(a2);
                    e2.g.onNext((Object)e2.b);
                    smt.a(rkt.a, "follow");
                }
                smt.b(rkt.a);
                return;
            }
            case 15: {
                final sdj sdj = (sdj)this.E0;
                final Dialog dialog = (Dialog)this.F0;
                czd.f((Object)sdj, "this$0");
                czd.f((Object)dialog, "$noOpDialog");
                sdj.E0.y(dialog, 1, -2);
                sdj.E0.B((DialogInterface)dialog);
                return;
            }
            case 14: {
                final SelectBannerSubtaskViewHost selectBannerSubtaskViewHost = (SelectBannerSubtaskViewHost)this.E0;
                final NavigationHandler navigationHandler = (NavigationHandler)this.F0;
                final String[] v0 = SelectBannerSubtaskViewHost.V0;
                Objects.requireNonNull(selectBannerSubtaskViewHost);
                navigationHandler.d(new pqd(selectBannerSubtaskViewHost.K0.b), (String)null);
                return;
            }
            case 13: {
                final xsi xsi = (xsi)this.E0;
                final o0t o0t = (o0t)this.F0;
                final kqi l2 = xsi.L0;
                Objects.requireNonNull(l2);
                final i8t n = o0t.n;
                final String m = yvl.m(n);
                Label_0700: {
                    if (m != null) {
                        l2.c.r(m);
                    }
                    else {
                        if (n instanceof i7w) {
                            final i7w i7w = (i7w)n;
                            if (i7w.b.equals("/2/notifications/device_follow.json")) {
                                final obi<?> d2 = l2.d;
                                final int a3 = c5j.a;
                                d2.d((ym)new lwi(i7w));
                                break Label_0700;
                            }
                        }
                        ((o8t)l2.a).b(n, vba.g("ntab", "", "", "", ""));
                    }
                }
                l2.a(o0t);
                return;
            }
            case 12: {
                final w3i w3i = (w3i)this.E0;
                final v3i v3i = (v3i)this.F0;
                czd.f((Object)w3i, "this$0");
                czd.f((Object)v3i, "$item");
                w3i.d.onNext((Object)v3i);
                return;
            }
            case 11: {
                final t0i t0i = (t0i)this.E0;
                final s0i s0i = (s0i)this.F0;
                czd.f((Object)t0i, "this$0");
                czd.f((Object)s0i, "$item");
                final nnl d3 = t0i.d;
                final String e3 = s0i.e;
                final NFTCollection d4 = s0i.d;
                String slug = null;
                Label_0821: {
                    if (d4 != null) {
                        final NFTOpenseaCollectionMetadata metadata = d4.getMetadata();
                        if (metadata != null) {
                            slug = metadata.getSlug();
                            break Label_0821;
                        }
                    }
                    slug = null;
                }
                final NFTCollection d5 = s0i.d;
                if (d5 != null) {
                    name = d5.getName();
                }
                d3.onNext((Object)new g1i.c(e3, slug, name));
                return;
            }
            case 10: {
                final AttachmentMediaView attachmentMediaView = (AttachmentMediaView)this.E0;
                final jw9 jw9 = (jw9)this.F0;
                final AttachmentMediaView$c d6 = attachmentMediaView.D1;
                if (d6 != null && jw9 != null) {
                    d6.f(jw9);
                }
                return;
            }
            case 9: {
                final y51 y51 = (y51)this.E0;
                final bo6 bo6 = (bo6)this.F0;
                czd.f((Object)y51, "this$0");
                czd.f((Object)bo6, "$tweet");
                if (y51.j) {
                    y51.d.b(bo6);
                    y51.c.c();
                    final quk g = y51.g;
                    final int b = y51.b;
                    final UserIdentifier i = y51.m;
                    final String k = y51.k;
                    final long d7 = bo6.D();
                    Objects.requireNonNull(g);
                    da8.m(b, "type");
                    czd.f((Object)i, "userIdentifier");
                    czd.f((Object)k, "nudgeId");
                    quk.d(g, i, k, d7, vba.Companion.e(k6e.c(b), "preemptive_nudge", "", "unhide", "click"), (Long)null, (Boolean)null, (Boolean)null, 112, (Object)null);
                }
                else {
                    final quk g2 = y51.g;
                    final int b2 = y51.b;
                    final UserIdentifier j = y51.m;
                    final String k2 = y51.k;
                    final long d8 = bo6.D();
                    Objects.requireNonNull(g2);
                    da8.m(b2, "type");
                    czd.f((Object)j, "userIdentifier");
                    czd.f((Object)k2, "nudgeId");
                    quk.d(g2, j, k2, d8, vba.Companion.e(k6e.c(b2), "preemptive_nudge", "", "hide", "click"), (Long)null, (Boolean)null, (Boolean)null, 112, (Object)null);
                    y51.d.a(bo6, y51.f, false);
                    y51.c.c();
                }
                return;
            }
            case 8: {
                final u6h u6h = (u6h)this.E0;
                final fk1 fk1 = (fk1)this.F0;
                czd.f((Object)u6h, "this$0");
                czd.f((Object)fk1, "$entry");
                final bh7 s = u6h.s;
                final long id = ((qr6)fk1).getId();
                final lj7 lj7 = (lj7)s;
                Objects.requireNonNull(lj7);
                final DMConversationContentViewProvider a4 = lj7.a;
                final kca b3 = DMConversationContentViewProvider.B3;
                final af4 af4 = new af4(((ucv)a4).G0);
                ((u0p)af4).q(new String[] { "messages:thread:rtf_message::report_as_ok" });
                cbw.b((elm)af4);
                final z9j s2 = lj7.a.S2;
                final DMConversationContentViewProvider a5 = lj7.a;
                s2.d((anm)new pjm((Context)((ucv)a5).D0, ((ucv)a5).G0, id, 3, a5.J2));
                return;
            }
            case 7: {
                final dt7 dt7 = (dt7)this.E0;
                final TextView textView = (TextView)this.F0;
                czd.f((Object)dt7, "this$0");
                ((View)dt7.V0).setVisibility(0);
                ((View)textView).setVisibility(8);
                ((View)dt7.V0).requestFocus();
                pcx.w(view.getContext(), (View)dt7.V0, true, (ResultReceiver)null);
                return;
            }
            case 6: {
                final odf odf = (odf)this.E0;
                final UserIdentifier userIdentifier = (UserIdentifier)this.F0;
                final Integer k3 = jnv.k;
                odf.d(userIdentifier.getId());
                return;
            }
            case 5: {
                final mv2 mv2 = (mv2)this.E0;
                final pv2$d pv2$d = (pv2$d)this.F0;
                czd.f((Object)mv2, "this$0");
                czd.f((Object)pv2$d, "$item");
                final zu2 e4 = mv2.e;
                final Weekday c = pv2$d.c;
                final int d9 = pv2$d.d;
                final HourMinute f = pv2$d.f;
                Objects.requireNonNull(e4);
                czd.f((Object)c, "day");
                czd.f((Object)f, "value");
                e4.a.onNext((Object)new yu2$h(c, d9, f, IntervalPosition.END));
                return;
            }
            case 4: {
                final hpp hpp = (hpp)this.E0;
                final oap oap = (oap)this.F0;
                czd.f((Object)hpp, "this$0");
                czd.f((Object)oap, "$item");
                hpp.d.onNext((Object)oap);
                return;
            }
            case 3: {
                ((b.a)this.E0).k((h84)this.F0);
                return;
            }
            case 2: {
                final mcl mcl = (mcl)this.E0;
                final um6 um6 = (um6)this.F0;
                final int m2 = mcl.m1;
                Objects.requireNonNull(mcl);
                final af4 af5 = new af4();
                ((u0p)af5).q(new String[] { "profile", "avatar_detail", null, "edit_button", "click" });
                cbw.b((elm)af5);
                ((u9)mcl).E0.startActivityForResult(um6.a((Context)((u9)mcl).E0, (ContentViewArgs)new EditProfileAvatarContentViewArgs(true)), 2);
                return;
            }
            case 1: {
                final hu7 hu7 = (hu7)this.E0;
                final ex7$b$b ex7$b$b = (ex7$b$b)this.F0;
                czd.f((Object)hu7, "this$0");
                czd.f((Object)ex7$b$b, "$item");
                hu7.d.invoke((Object)ex7$b$b);
                return;
            }
            case 0: {
                final zna zna = (zna)this.E0;
                final RoomEntrypointViewModel roomEntrypointViewModel = (RoomEntrypointViewModel)this.F0;
                zna.a("spaces", "click");
                final cin$a a6 = cin$a.a;
                Objects.requireNonNull(roomEntrypointViewModel);
                ((MviViewModel)roomEntrypointViewModel).O((cdw)a6);
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.stationstab.follow;

import com.twitter.rooms.model.Show;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.args.StationFragmentContentViewArgs;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/stationstab/follow/RoomFollowPodcastWrapperViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lxkn;", "", "Lfkn;", "Companion", "b", "feature.tfa.rooms.ui.stationstab.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomFollowPodcastWrapperViewModel extends MviViewModel<xkn, Object, fkn>
{
    public static final b Companion;
    public final Context O0;
    public final ljn P0;
    public final mun Q0;
    public final sln R0;
    
    static {
        Companion = new b();
    }
    
    public RoomFollowPodcastWrapperViewModel(final Context o0, final StationFragmentContentViewArgs stationFragmentContentViewArgs, final kjn kjn, final ljn p7, final mun q0, final sln r0, final xbm xbm) {
        czd.f((Object)o0, "context");
        czd.f((Object)stationFragmentContentViewArgs, "viewArgs");
        czd.f((Object)kjn, "roomFollowPodcastItemDispatcher");
        czd.f((Object)p7, "roomFollowPodcastRepository");
        czd.f((Object)q0, "podcastFollowingStateMap");
        czd.f((Object)r0, "friendshipRepository");
        czd.f((Object)xbm, "releaseCompletable");
        final b companion = RoomFollowPodcastWrapperViewModel.Companion;
        final Show show = stationFragmentContentViewArgs.getPodcastEpisode().getShow();
        Objects.requireNonNull(companion);
        final nun d0 = nun.D0;
        final String title = show.getTitle();
        String s;
        if (vkr.V((CharSequence)show.getTwitterHandle())) {
            s = o0.getString(2131958482);
        }
        else {
            s = da8.j(o0.getString(2131958482), " · ", show.getTwitterHandle());
        }
        czd.e((Object)s, "if (show.twitterHandle.i\u2026andle}\"\n                }");
        final String value = String.valueOf(t60.a(show.getDescription()));
        final String artUrl = show.getArtUrl();
        final String id = show.getId();
        czd.f((Object)id, "podcastId");
        djb djb;
        if ((djb = q0.a.get(id)) == null) {
            if (show.getFollowing()) {
                djb = djb.F0;
            }
            else {
                djb = djb.D0;
            }
        }
        super((k9e)xbm, (jbx)new xkn(s9i.r(new ajn(d0, title, s, value, artUrl, djb, false, false, show.getId()))));
        this.O0 = o0;
        this.P0 = p7;
        this.Q0 = q0;
        this.R0 = r0;
        String twitterHandle = stationFragmentContentViewArgs.getPodcastEpisode().getShow().getTwitterHandle();
        if (!(vkr.V((CharSequence)twitterHandle) ^ true)) {
            twitterHandle = null;
        }
        if (twitterHandle != null) {
            final eaq<ynj<cgv>> b = p7.b(twitterHandle);
            final en0 en0 = new en0((qsb)tkn.D0, 18);
            Objects.requireNonNull(b);
            MviViewModel.L((MviViewModel)this, (kog)new hpg((ppg)new yog((lcq)b, (ytk)en0), (psb)new oyf((qsb)ukn.D0, 29)), (jrx)null, (String)null, (ftb)new vkn(this, (go6)null), 3, (Object)null);
        }
        final nnl a = ((t9a)kjn).a;
        czd.e((Object)a, "observe()");
        MviViewModel.M((MviViewModel)this, (h5j)a, (String)null, (jrx)null, (ftb)new ftb<kjn.a, go6<? super fzv>, Object>(this, null) {
            public Object D0;
            public final RoomFollowPodcastWrapperViewModel E0;
            
            public final go6<fzv> create(final Object d0, final go6<?> go6) {
                final ftb<kjn.a, go6<? super fzv>, Object> ftb = (ftb<kjn.a, go6<? super fzv>, Object>)new ftb<kjn.a, go6<? super fzv>, Object>(this.E0, go6) {
                    public Object D0;
                    public final RoomFollowPodcastWrapperViewModel E0;
                };
                ftb.D0 = d0;
                return (go6<fzv>)ftb;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                final ftb<kjn.a, go6<? super fzv>, Object> ftb = (ftb<kjn.a, go6<? super fzv>, Object>)this.create(o, (go6<?>)o2);
                final fzv a = fzv.a;
                ftb.invokeSuspend(a);
                return a;
            }
            
            public final Object invokeSuspend(final Object o) {
                b1n.u(o);
                final kjn.a a = (kjn.a)this.D0;
                final int ordinal = ((Enum)a.a).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        final RoomFollowPodcastWrapperViewModel e0 = this.E0;
                        final b companion = RoomFollowPodcastWrapperViewModel.Companion;
                        Objects.requireNonNull(e0);
                        e0.T((qsb)new skn(a, e0, Long.parseLong(a.b)));
                    }
                }
                else {
                    final RoomFollowPodcastWrapperViewModel e2 = this.E0;
                    final b companion2 = RoomFollowPodcastWrapperViewModel.Companion;
                    Objects.requireNonNull(e2);
                    final djb d = a.d;
                    eaq<vhb> eaq;
                    if (c.a[d.ordinal()] == 1) {
                        eaq = e2.P0.c(a.b);
                    }
                    else {
                        eaq = e2.P0.a(a.b);
                    }
                    e2.C((eaq)eaq, (qsb)new okn(e2, d, a));
                }
                return fzv.a;
            }
        }, 3, (Object)null);
    }
    
    public static final void W(final RoomFollowPodcastWrapperViewModel roomFollowPodcastWrapperViewModel, final djb djb) {
        Objects.requireNonNull(roomFollowPodcastWrapperViewModel);
        roomFollowPodcastWrapperViewModel.Q((qsb)new wkn(nun.D0, djb));
    }
    
    public static final void X(final RoomFollowPodcastWrapperViewModel roomFollowPodcastWrapperViewModel, final djb djb) {
        Objects.requireNonNull(roomFollowPodcastWrapperViewModel);
        roomFollowPodcastWrapperViewModel.Q((qsb)new wkn(nun.E0, djb));
    }
    
    public static final class b
    {
    }
    
    public final class c
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[djb.values().length];
            a2[2] = 1;
            a = a2;
        }
    }
}

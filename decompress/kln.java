import androidx.fragment.app.s;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.twitter.rooms.subsystem.api.args.RoomMultiScheduledSpacesArgs;
import com.twitter.rooms.subsystem.api.args.StationsTabControllerContentViewArgs;
import java.util.List;
import com.twitter.rooms.subsystem.api.args.RoomSubscriptionPromptArgs;
import com.twitter.rooms.subsystem.api.args.RoomManageSpeakersFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.TabFilterType;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.rooms.subsystem.api.args.RoomHostReconnectFragmentArgs;
import com.twitter.rooms.subsystem.api.args.RoomConsumptionPreviewFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.DisplayMode;
import com.twitter.rooms.subsystem.api.args.RoomReplayFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomInviteFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceTicketFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomScheduledSpaceDetailsFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomAudioSpaceFragmentContentViewArgs;
import androidx.fragment.app.a;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.rooms.subsystem.api.args.RoomCreationFragmentContentViewArgs;
import com.twitter.rooms.subsystem.api.models.RoomViewType;
import java.util.Objects;
import android.view.View;
import android.widget.FrameLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kln extends ste implements qsb<oln, fzv>
{
    public final iln D0;
    
    public kln(final iln d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final oln oln = (oln)o;
        czd.f((Object)oln, "$this$distinct");
        final Fragment f0 = this.D0.F0;
        if (f0 != null) {
            ffz.t(f0);
        }
        this.D0.N0.onNext((Object)oln.a);
        final iln d0 = this.D0;
        int height;
        if (!oln.a.isDeviceHeight() && !oln.b) {
            height = -2;
        }
        else {
            height = -1;
        }
        final ViewParent parent = d0.D0.getParent();
        czd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final FrameLayout frameLayout = (FrameLayout)((View)parent).findViewById(2131428647);
        if (frameLayout != null) {
            ((View)frameLayout).getLayoutParams().height = height;
        }
        final iln d2 = this.D0;
        final RoomViewType a = oln.a;
        Objects.requireNonNull(d2);
        if (czd.a((Object)a, (Object)RoomViewType.CreationView.INSTANCE)) {
            final RoomCreationFragmentContentViewArgs instance = RoomCreationFragmentContentViewArgs.INSTANCE;
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)instance);
            }
            else if (!d2.G0.T() && d2.G0.H(((ContentViewArgs)instance).getClass().getSimpleName()) == null) {
                final Fragment b = d2.H0.b((ContentViewArgs)instance);
                final a a2 = new a(d2.G0);
                ((s)a2).g(2131429271, b, "RoomCreationFragmentContentViewArgs");
                a2.c();
            }
        }
        else if (czd.a((Object)a, (Object)RoomViewType.SpaceView.INSTANCE)) {
            o = new RoomAudioSpaceFragmentContentViewArgs(d2.M0);
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomAudioSpaceFragmentContentViewArgs") == null) {
                final Fragment b2 = d2.H0.b(o);
                final a a3 = new a(d2.G0);
                ((s)a3).g(2131429271, b2, "RoomAudioSpaceFragmentContentViewArgs");
                a3.c();
            }
        }
        else if (a instanceof RoomViewType.ScheduleSpaceDetailsView) {
            o = new RoomScheduledSpaceDetailsFragmentContentViewArgs(((RoomViewType.ScheduleSpaceDetailsView)a).getRoomMode());
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomScheduledSpaceDetailsFragmentContentViewArgs") == null) {
                final Fragment b3 = d2.H0.b(o);
                final a a4 = new a(d2.G0);
                ((s)a4).g(2131429271, b3, "RoomScheduledSpaceDetailsFragmentContentViewArgs");
                a4.c();
            }
        }
        else if (a instanceof RoomViewType.ScheduleSpaceTicketView) {
            o = new RoomScheduledSpaceTicketFragmentContentViewArgs(((RoomViewType.ScheduleSpaceTicketView)a).getScheduledSpace());
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomScheduledSpaceTicketFragmentContentViewArgs") == null) {
                final Fragment b4 = d2.H0.b(o);
                final a a5 = new a(d2.G0);
                ((s)a5).g(2131429271, b4, "RoomScheduledSpaceTicketFragmentContentViewArgs");
                a5.c();
            }
        }
        else if (a instanceof RoomViewType.InviteView) {
            final RoomViewType.InviteView inviteView = (RoomViewType.InviteView)a;
            o = new RoomInviteFragmentContentViewArgs(inviteView.getInviteType(), inviteView.getMaxInvites());
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomInviteFragmentContentViewArgs") == null) {
                final Fragment b5 = d2.H0.b(o);
                final a a6 = new a(d2.G0);
                ((s)a6).g(2131429271, b5, "RoomInviteFragmentContentViewArgs");
                a6.c();
            }
        }
        else if (a instanceof RoomViewType.ReplayView) {
            final RoomViewType.ReplayView replayView = (RoomViewType.ReplayView)a;
            o = new RoomReplayFragmentContentViewArgs(replayView.getHostTwitterId(), replayView.getHostAvatarUrl(), replayView.getHostDisplayName(), replayView.getRoomId(), replayView.getTitle(), replayView.getSpaceStartTimeMs(), replayView.isSpaceAvailableForClipping(), (long)replayView.getTotalParticipated(), (DisplayMode)null, 256, (rf8)null);
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomReplayFragmentContentViewArgs") == null) {
                final Fragment b6 = d2.H0.b(o);
                final a a7 = new a(d2.G0);
                ((s)a7).g(2131429271, b6, "RoomReplayFragmentContentViewArgs");
                a7.c();
            }
        }
        else if (a instanceof RoomViewType.ScheduleSpaceView) {
            final RoomViewType.ScheduleSpaceView scheduleSpaceView = (RoomViewType.ScheduleSpaceView)a;
            o = new RoomScheduledSpaceFragmentContentViewArgs(scheduleSpaceView.getDescription(), scheduleSpaceView.isSpaceRecording(), scheduleSpaceView.getNarrowCastSpaceType(), scheduleSpaceView.getHasMaxScheduledSpaces());
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomScheduledSpaceFragmentContentViewArgs") == null) {
                final Fragment b7 = d2.H0.b(o);
                final a a8 = new a(d2.G0);
                ((s)a8).g(2131429271, b7, "RoomScheduledSpaceFragmentContentViewArgs");
                a8.c();
            }
        }
        else if (czd.a((Object)a, (Object)RoomViewType.ConsumptionPreviewView.INSTANCE)) {
            final RoomConsumptionPreviewFragmentContentViewArgs instance2 = RoomConsumptionPreviewFragmentContentViewArgs.INSTANCE;
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)instance2);
            }
            else if (!d2.G0.T() && d2.G0.H(((ContentViewArgs)instance2).getClass().getSimpleName()) == null) {
                final Fragment b8 = d2.H0.b((ContentViewArgs)instance2);
                final a a9 = new a(d2.G0);
                ((s)a9).g(2131429271, b8, "RoomConsumptionPreviewFragmentContentViewArgs");
                a9.c();
            }
        }
        else if (a instanceof RoomViewType.HostReconnectView) {
            o = new RoomHostReconnectFragmentArgs(((RoomViewType.HostReconnectView)a).getRoomId());
            if (d2.M0) {
                d2.I0.a((ContentViewArgs)o);
            }
            else if (!d2.G0.T() && d2.G0.H("RoomHostReconnectFragmentArgs") == null) {
                final Fragment b9 = d2.H0.b(o);
                final a a10 = new a(d2.G0);
                ((s)a10).g(2131429271, b9, "RoomHostReconnectFragmentArgs");
                a10.c();
            }
        }
        else {
            final boolean b10 = a instanceof RoomViewType.ManageSpeakersView;
            Object o2 = null;
            if (b10) {
                final n8s tabFilter = ((RoomViewType.ManageSpeakersView)a).getTabFilter();
                if (tabFilter != null) {
                    final int ordinal = ((Enum)tabFilter).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        if (ordinal != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        o2 = TabFilterType.Removed.INSTANCE;
                                    }
                                    else {
                                        o2 = TabFilterType.Listeners.INSTANCE;
                                    }
                                }
                                else {
                                    o2 = TabFilterType.Requests.INSTANCE;
                                }
                            }
                            else {
                                o2 = TabFilterType.Speakers.INSTANCE;
                            }
                        }
                        else {
                            o2 = TabFilterType.Cohosts.INSTANCE;
                        }
                    }
                    else {
                        o2 = TabFilterType.All.INSTANCE;
                    }
                }
                o = new RoomManageSpeakersFragmentContentViewArgs((TabFilterType)o2);
                if (d2.M0) {
                    d2.I0.a((ContentViewArgs)o);
                }
                else if (!d2.G0.T() && d2.G0.H("RoomManageSpeakersFragmentContentViewArgs") == null) {
                    final Fragment b11 = d2.H0.b(o);
                    final a a11 = new a(d2.G0);
                    ((s)a11).g(2131429271, b11, "RoomManageSpeakersFragmentContentViewArgs");
                    a11.c();
                }
            }
            else if (a instanceof RoomViewType.SubscriptionPrompt) {
                final RoomViewType.SubscriptionPrompt subscriptionPrompt = (RoomViewType.SubscriptionPrompt)a;
                o = new RoomSubscriptionPromptArgs(subscriptionPrompt.getTitle(), subscriptionPrompt.getCreatorName(), subscriptionPrompt.getTotalParticipated(), subscriptionPrompt.getProfileImageUrl(), subscriptionPrompt.getCreatorId(), subscriptionPrompt.getUserHandle(), subscriptionPrompt.isFollowing(), (List)subscriptionPrompt.getTaggedTopics(), subscriptionPrompt.isEmployeeOnly());
                if (d2.M0) {
                    d2.I0.a((ContentViewArgs)o);
                }
                else if (!d2.G0.T() && d2.G0.H("RoomSubscriptionPromptArgs") == null) {
                    final Fragment b12 = d2.H0.b(o);
                    final a a12 = new a(d2.G0);
                    ((s)a12).g(2131429271, b12, "RoomSubscriptionPromptArgs");
                    a12.c();
                }
            }
            else if (a instanceof RoomViewType.StationsView) {
                final RoomViewType.StationsView stationsView = (RoomViewType.StationsView)a;
                o = new StationsTabControllerContentViewArgs(stationsView.getCurrentTrack(), stationsView.getStation());
                if (d2.M0) {
                    d2.I0.a((ContentViewArgs)o);
                }
                else if (!d2.G0.T() && d2.G0.H("StationsTabControllerContentViewArgs") == null) {
                    final Fragment b13 = d2.H0.b(o);
                    final a a13 = new a(d2.G0);
                    ((s)a13).g(2131429271, b13, "StationsTabControllerContentViewArgs");
                    a13.c();
                }
            }
            else if (a instanceof RoomViewType.MultiScheduledSpacesView) {
                o = new RoomMultiScheduledSpacesArgs(false, 1, (rf8)null);
                if (d2.M0) {
                    d2.I0.a((ContentViewArgs)o);
                }
                else if (!d2.G0.T() && d2.G0.H("RoomMultiScheduledSpacesArgs") == null) {
                    final Fragment b14 = d2.H0.b(o);
                    final a a14 = new a(d2.G0);
                    ((s)a14).g(2131429271, b14, "RoomMultiScheduledSpacesArgs");
                    a14.c();
                }
            }
        }
        return fzv.a;
    }
}

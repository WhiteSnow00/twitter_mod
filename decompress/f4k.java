import tv.periscope.model.chat.c$e;
import tv.periscope.android.api.PsSettings;
import java.io.File;
import tv.periscope.android.api.ReportUserAccountResponse;
import tv.periscope.android.api.ReportAccountRequestContext;
import tv.periscope.model.chat.c$a;
import tv.periscope.android.event.AppEvent;
import tv.periscope.android.api.SuperfansResponse;
import tv.periscope.android.api.MutedMessagesCountResponse;
import tv.periscope.android.api.GetHeartThemeAssetsResponse;
import tv.periscope.android.api.PsUser;
import java.util.List;
import tv.periscope.android.api.GetIntersectionsResponse;
import tv.periscope.android.api.GetBroadcastForExternalEncoderResponse;
import java.util.Collection;
import tv.periscope.android.api.UserModifySourceType;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import tv.periscope.android.api.ChatStats;
import java.util.HashMap;
import tv.periscope.model.chat.Message;
import java.util.ArrayList;
import tv.periscope.android.api.RestClient;
import tv.periscope.android.api.service.safety.SafetyService;
import tv.periscope.android.api.service.channels.ChannelsService;
import tv.periscope.android.api.PublicApiService;
import tv.periscope.android.api.AuthedApiService;
import tv.periscope.android.api.TwitterDirectApiService;
import tv.periscope.android.api.ApiService;
import tv.periscope.android.api.service.AuthorizationTokenDelegate;
import tv.periscope.android.api.service.BackendServiceInterceptor;
import tv.periscope.android.api.BackendServiceName;
import okhttp3.Interceptor;
import tv.periscope.android.api.Constants;
import tv.periscope.android.api.RestClient$Builder;
import tv.periscope.android.api.error.ErrorDelegate;
import tv.periscope.android.api.error.DefaultErrorDelegate;
import tv.periscope.android.api.error.UnauthorizedErrorInterceptor;
import android.os.Handler;
import okhttp3.logging.HttpLoggingInterceptor$Level;
import java.util.concurrent.Executor;
import android.content.Context;
import tv.periscope.android.api.ApiManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f4k implements ApiManager
{
    public final rnl a;
    public final i51 b;
    public final unp c;
    public final n4k d;
    
    public f4k(final Context context, final unp c, final baw baw, final vf2 vf2, final aba aba, final Executor executor, final HttpLoggingInterceptor$Level httpLoggingInterceptor$Level, final yf1 yf1, final aba aba2, final Handler handler, final bw0 bw0, final n4k d) {
        this.c = c;
        this.d = d;
        d7b.a();
        final UnauthorizedErrorInterceptor unauthorizedErrorInterceptor = new UnauthorizedErrorInterceptor();
        unauthorizedErrorInterceptor.setErrorDelegate((ErrorDelegate)new DefaultErrorDelegate(handler, (ApiManager)this, aba));
        final RestClient build = new RestClient$Builder().context(context).executor(executor).endpoint(d4j.C0(Constants.API_DEV_URL, Constants.API_CANARY_URL, Constants.API_PROD_URL)).logLevel(httpLoggingInterceptor$Level).addNetworkInterceptor((Interceptor)null).addInterceptor((Interceptor)unauthorizedErrorInterceptor).build();
        final RestClient build2 = new RestClient$Builder().context(context).executor(executor).endpoint(d4j.C0(Constants.CHANNELS_DEV_URL, Constants.CHANNELS_CANARY_URL, Constants.CHANNELS_PROD_URL)).logLevel(httpLoggingInterceptor$Level).addNetworkInterceptor((Interceptor)null).build();
        final RestClient build3 = new RestClient$Builder().context(context).executor(executor).endpoint(d4j.C0(Constants.SAFETY_SERVICE_DEV_URL, Constants.SAFETY_SERVICE_CANARY_URL, Constants.SAFETY_SERVICE_PROD_URL)).logLevel(httpLoggingInterceptor$Level).addNetworkInterceptor((Interceptor)null).addInterceptor((Interceptor)new BackendServiceInterceptor(BackendServiceName.SAFETY, (AuthorizationTokenDelegate)yf1)).build();
        final AuthedApiService authedApiService = new AuthedApiService((ApiService)build.getService((Class)ApiService.class), (TwitterDirectApiService)build.getService((Class)TwitterDirectApiService.class));
        this.a = new rnl(context, aba, authedApiService, (PublicApiService)build.getService((Class)PublicApiService.class), vf2, baw, handler, bw0);
        this.b = new i51(context, aba, baw, vf2, c, authedApiService, (PublicApiService)build.getService((Class)PublicApiService.class), (ChannelsService)build2.getService((Class)ChannelsService.class), (SafetyService)build3.getService((Class)SafetyService.class), yf1, aba2, handler, bw0);
    }
    
    public final ApiManager a() {
        Object o;
        if (this.b()) {
            o = this.b;
        }
        else {
            o = this.a;
        }
        return (ApiManager)o;
    }
    
    public final String acceptChannelInvite(final String s, final String s2) {
        return this.a().acceptChannelInvite(s, s2);
    }
    
    public final String acceptJoinAppInviteToken(final String s) {
        return this.a().acceptJoinAppInviteToken(s);
    }
    
    public final String accessScheduledBroadcast(final String s) {
        return this.a().accessScheduledBroadcast(s);
    }
    
    public final String activeJuror(final String s) {
        return this.a().activeJuror(s);
    }
    
    public final String addMembersToChannel(final String s, final ArrayList<String> list) {
        return this.a().addMembersToChannel(s, (ArrayList)list);
    }
    
    public final AuthedApiService authedApiService() {
        return this.a().authedApiService();
    }
    
    public final boolean b() {
        final qdw o = this.d.o;
        boolean b = true;
        if (o == null || !n4k.c(o.A()) || this.c.d() == null) {
            b = false;
        }
        return b;
    }
    
    public final void bind() {
        this.a().bind();
    }
    
    public final String block(final String s, final String s2, final Message message) {
        return this.a().block(s, s2, message);
    }
    
    public final String broadcastMeta(final String s, final HashMap<String, Object> hashMap, final HashMap<String, Object> hashMap2, final ChatStats chatStats) {
        return this.a().broadcastMeta(s, (HashMap)hashMap, (HashMap)hashMap2, chatStats);
    }
    
    public final String broadcastSearch(final String s) {
        return this.a().broadcastSearch(s);
    }
    
    public final boolean cancelRequest(final String s) {
        return this.a().cancelRequest(s);
    }
    
    public final String channelsSearch(final String s) {
        return this.a().channelsSearch(s);
    }
    
    public final String clearHistoryBroadcastFeed(final Long n) {
        return this.a().clearHistoryBroadcastFeed(n);
    }
    
    public final String createBroadcast(final String s, final String s2, final beq beq, final boolean b, final boolean b2, final long n, final String s3, final int n2, final String s4, final Set<String> set, final boolean b3, final boolean b4, final NarrowcastSpaceType narrowcastSpaceType, final String s5) {
        return this.a().createBroadcast(s, s2, beq, b, b2, n, s3, n2, s4, (Set)set, b3, b4, narrowcastSpaceType, s5);
    }
    
    public final String createChannel(final String s, final br3 br3, final boolean b) {
        return this.a().createChannel(s, br3, b);
    }
    
    public final String createExternalEncoder(final boolean b, final String s) {
        return this.a().createExternalEncoder(b, s);
    }
    
    public final void deactivateAccount() {
        this.a().deactivateAccount();
    }
    
    public final String decreaseBroadcastRank(final String s) {
        return this.a().decreaseBroadcastRank(s);
    }
    
    public final String deleteBroadcast(final String s) {
        return this.a().deleteBroadcast(s);
    }
    
    public final String deleteChannel(final String s) {
        return this.a().deleteChannel(s);
    }
    
    public final String deleteChannelMember(final String s, final String s2) {
        return this.a().deleteChannelMember(s, s2);
    }
    
    public final String deleteExternalEncoder(final String s) {
        return this.a().deleteExternalEncoder(s);
    }
    
    public final String disputeCopyrightViolationMatch(final String s, final boolean b) {
        return this.a().disputeCopyrightViolationMatch(s, b);
    }
    
    public final String endBroadcast(final String s) {
        return this.a().endBroadcast(s);
    }
    
    public final String endWatching(final String s, final String s2, final long n, final long n2, final int n3) {
        return this.a().endWatching(s, s2, n, n2, n3);
    }
    
    public final String follow(final String s, final UserModifySourceType userModifySourceType, final String s2) {
        return this.a().follow(s, userModifySourceType, s2);
    }
    
    public final String followAll(final Collection<String> collection, final String s) {
        return this.a().followAll((Collection)collection, s);
    }
    
    public final String followFacebookUsers(final Collection<String> collection, final String s) {
        return this.a().followFacebookUsers((Collection)collection, s);
    }
    
    public final String followGoogleUsers(final Collection<String> collection, final String s) {
        return this.a().followGoogleUsers((Collection)collection, s);
    }
    
    public final String followSuggestedUser(final String s, final pkw pkw) {
        return this.a().followSuggestedUser(s, pkw);
    }
    
    public final String getAccessChat(final String s) {
        return this.a().getAccessChat(s);
    }
    
    public final String getAccessChatNoRetry(final String s) {
        return this.a().getAccessChatNoRetry(s);
    }
    
    public final String getAccessVideo(final String s, final String s2, final boolean b) {
        return this.a().getAccessVideo(s, s2, b);
    }
    
    public final String getAndHydrateChannelActions(final String s) {
        return this.a().getAndHydrateChannelActions(s);
    }
    
    public final String getAndHydrateChannelMembers(final String s) {
        return this.a().getAndHydrateChannelMembers(s);
    }
    
    public final String getAndHydratePendingInvitesForMember(final String s) {
        return this.a().getAndHydratePendingInvitesForMember(s);
    }
    
    public final String getAuthorizeTokenForBackendService(final BackendServiceName backendServiceName) {
        return this.a().getAuthorizeTokenForBackendService(backendServiceName);
    }
    
    public final String getBlocked() {
        return this.a().getBlocked();
    }
    
    public final String getBroadcastForExternalEncoder(final String s) {
        return this.a().getBroadcastForExternalEncoder(s);
    }
    
    public final bbq<GetBroadcastForExternalEncoderResponse> getBroadcastForExternalEncoderSingle(final String s) {
        return (bbq<GetBroadcastForExternalEncoderResponse>)this.a().getBroadcastForExternalEncoderSingle(s);
    }
    
    public final String getBroadcastForTeleport() {
        return this.a().getBroadcastForTeleport();
    }
    
    public final String getBroadcastIdForShareToken(final String s) {
        return this.a().getBroadcastIdForShareToken(s);
    }
    
    public final String getBroadcastMainGlobal() {
        return this.a().getBroadcastMainGlobal();
    }
    
    public final String getBroadcastViewers(final String s, final String s2) {
        return this.a().getBroadcastViewers(s, s2);
    }
    
    public final String getBroadcasts(final ArrayList<String> list) {
        return this.a().getBroadcasts((ArrayList)list);
    }
    
    public final String getBroadcasts(final ArrayList<String> list, final boolean b) {
        return this.a().getBroadcasts((ArrayList)list, b);
    }
    
    public final String getBroadcastsByPolling(final ArrayList<String> list) {
        return this.a().getBroadcastsByPolling((ArrayList)list);
    }
    
    public final String getBroadcastsForChannelId(final String s) {
        return this.a().getBroadcastsForChannelId(s);
    }
    
    public final String getChannelCountForMember(final String s) {
        return this.a().getChannelCountForMember(s);
    }
    
    public final String getChannelInfo(final String s) {
        return this.a().getChannelInfo(s);
    }
    
    public final String getChannelsForMember(final String s) {
        return this.a().getChannelsForMember(s);
    }
    
    public final String getExternalEncoders() {
        return this.a().getExternalEncoders();
    }
    
    public final String getFollowers() {
        return this.a().getFollowers();
    }
    
    public final bbq<GetIntersectionsResponse> getFollowersAndIntersections(final String s) {
        return (bbq<GetIntersectionsResponse>)this.a().getFollowersAndIntersections(s);
    }
    
    public final String getFollowersById(final String s) {
        return this.a().getFollowersById(s);
    }
    
    public final String getFollowing() {
        return this.a().getFollowing();
    }
    
    public final String getFollowingById(final String s) {
        return this.a().getFollowingById(s);
    }
    
    public final String getFollowingIdsOnly() {
        return this.a().getFollowingIdsOnly();
    }
    
    public final bbq<List<PsUser>> getFollowingObservable(final String s) {
        return (bbq<List<PsUser>>)this.a().getFollowingObservable(s);
    }
    
    public final String getGlobalMap(final float n, final float n2, final float n3, final float n4) {
        return this.a().getGlobalMap(n, n2, n3, n4);
    }
    
    public final t5j<GetHeartThemeAssetsResponse> getHeartThemeAssets(final List<String> list) {
        return (t5j<GetHeartThemeAssetsResponse>)this.a().getHeartThemeAssets((List)list);
    }
    
    public final String getJoinAppInviteToken(final String s) {
        return this.a().getJoinAppInviteToken(s);
    }
    
    public final bbq<MutedMessagesCountResponse> getMutedMessagesCount(final String s) {
        return (bbq<MutedMessagesCountResponse>)this.a().getMutedMessagesCount(s);
    }
    
    public final String getMutualFollows() {
        return this.a().getMutualFollows();
    }
    
    public final void getMyUserBroadcasts() {
        this.a().getMyUserBroadcasts();
    }
    
    public final String getRecentBroadcastGlobalFeed() {
        return this.a().getRecentBroadcastGlobalFeed();
    }
    
    public final void getRecentlyWatchedBroadcasts() {
        this.a().getRecentlyWatchedBroadcasts();
    }
    
    public final String getSettings() {
        return this.a().getSettings();
    }
    
    public final String getSuggestedChannels(final boolean b) {
        return this.a().getSuggestedChannels(b);
    }
    
    public final String getSuggestedPeople() {
        return this.a().getSuggestedPeople();
    }
    
    public final String getSuggestedPeopleForOnboarding() {
        return this.a().getSuggestedPeopleForOnboarding();
    }
    
    public final String getSuperfans(final String s) {
        return this.a().getSuperfans(s);
    }
    
    public final bbq<SuperfansResponse> getSuperfansObservable(final String s) {
        return (bbq<SuperfansResponse>)this.a().getSuperfansObservable(s);
    }
    
    public final void getTrendingPlaces() {
        this.a().getTrendingPlaces();
    }
    
    public final String getUser() {
        return this.a().getUser();
    }
    
    public final void getUserBroadcastsByUserId(final String s) {
        this.a().getUserBroadcastsByUserId(s);
    }
    
    public final void getUserBroadcastsByUsername(final String s) {
        this.a().getUserBroadcastsByUsername(s);
    }
    
    public final String getUserById(final String s) {
        return this.a().getUserById(s);
    }
    
    public final String getUserByUsername(final String s) {
        return this.a().getUserById(s);
    }
    
    public final String getUserStats(final String s) {
        return this.a().getUserStats(s);
    }
    
    public final String hello() {
        return this.a().hello();
    }
    
    public final String increaseBroadcastRank(final String s) {
        return this.a().increaseBroadcastRank(s);
    }
    
    public final String limitBroadcastVisibility(final String s, final boolean b) {
        return this.a().limitBroadcastVisibility(s, b);
    }
    
    public final String livePlaybackMeta(final String s, final HashMap<String, Object> hashMap, final ChatStats chatStats) {
        return this.a().livePlaybackMeta(s, (HashMap)hashMap, chatStats);
    }
    
    public final String login(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final tnp$a tnp$a, final String s7, final boolean b) {
        return this.a().login(s, s2, s3, s4, s5, s6, tnp$a, s7, b);
    }
    
    public final String loginFacebook(final String s, final String s2, final String s3, final boolean b, final String s4, final String s5) {
        return this.a().loginFacebook(s, s2, s3, b, s4, s5);
    }
    
    public final String loginGoogle(final String s, final String s2, final String s3, final boolean b, final String s4, final String s5) {
        return this.a().loginGoogle(s, s2, s3, b, s4, s5);
    }
    
    public final String loginPhone(final String s, final String s2, final String s3, final String s4, final boolean b, final String s5, final String s6) {
        return this.a().loginPhone(s, s2, s3, s4, b, s6, s5);
    }
    
    public final void logout(final AppEvent appEvent, final boolean b) {
        this.a().logout(appEvent, b);
    }
    
    public final void markBroadcastPersistent(final String s) {
        this.a().markBroadcastPersistent(s);
    }
    
    public final String megaBroadcastCall() {
        return this.a().megaBroadcastCall();
    }
    
    public final String mute(final String s) {
        return this.a().mute(s);
    }
    
    public final String muteChannelMember(final String s, final String s2, final boolean b) {
        return this.a().muteChannelMember(s, s2, b);
    }
    
    public final String patchChannel(final String s, final String s2, final String s3) {
        return this.a().patchChannel(s, s2, s3);
    }
    
    public final String patchChannel(final String s, final boolean b) {
        return this.a().patchChannel(s, b);
    }
    
    public final String pingWatching(final String s, final String s2, final long n, final long n2) {
        return this.a().pingWatching(s, s2, n, n2);
    }
    
    public final String publishBroadcast(final String s, final String s2, final List<String> list, final List<String> list2, final boolean b, final float n, final float n2, final c44 c44, final int n3, final int n4, final boolean b2, final boolean b3, final long n5, final long n6, final String s3, final long n7, final String s4, final List<String> list3, final boolean b4, final int n8, final Set<String> set) {
        return this.a().publishBroadcast(s, s2, (List)list, (List)list2, b, n, n2, c44, n3, n4, b2, b3, n5, n6, s3, n7, s4, (List)list3, true, n8, (Set)set);
    }
    
    public final String reconnectBroadcast(final String s) {
        return this.a().reconnectBroadcast(s);
    }
    
    public final String replayPlaybackMeta(final String s, final HashMap<String, Object> hashMap, final ChatStats chatStats) {
        return this.a().replayPlaybackMeta(s, (HashMap)hashMap, chatStats);
    }
    
    public final String replayThumbnailPlaylist(final String s) {
        return this.a().replayThumbnailPlaylist(s);
    }
    
    public final String reportBroadcast(final String s, final ze ze, final String s2, final long n) {
        return this.a().reportBroadcast(s, ze, s2, n);
    }
    
    public final String reportComment(final Message message, final String s, final c$a c$a, final String s2) {
        return this.a().reportComment(message, s, c$a, s2);
    }
    
    public final bbq<ReportUserAccountResponse> reportUserAccount(final String s, final ReportAccountRequestContext reportAccountRequestContext, final String s2) {
        return (bbq<ReportUserAccountResponse>)this.a().reportUserAccount(s, reportAccountRequestContext, s2);
    }
    
    public final String retweetBroadcast(final String s, final String s2, final String s3) {
        return this.a().retweetBroadcast(s, s2, s3);
    }
    
    public final String setExternalEncoderName(final String s, final String s2) {
        return this.a().setExternalEncoderName(s, s2);
    }
    
    public final void setProfileImage(final File file, final File file2) {
        this.a().setProfileImage(file, file2);
    }
    
    public final String setSettings(final PsSettings settings) {
        return this.a().setSettings(settings);
    }
    
    public final String setSettings(final PsSettings psSettings, final boolean b) {
        return this.a().setSettings(psSettings, b);
    }
    
    public final String shareBroadcast(final String s, final ArrayList<String> list, final ArrayList<String> list2, final Long n) {
        return this.a().shareBroadcast(s, (ArrayList)list, (ArrayList)list2, n);
    }
    
    public final String startWatching(final String s, final boolean b, final boolean b2, final String s2, final String s3, final String s4, final long n, final String s5) {
        return this.a().startWatching(s, b, b2, s2, s3, s4, n, s5);
    }
    
    public final String supportedLanguages() {
        return this.a().supportedLanguages();
    }
    
    public final String tweetBroadcastPublished(final String s, final String s2, final String s3, final String s4) {
        return this.a().tweetBroadcastPublished(s, s2, s3, s4);
    }
    
    public final void unbind() {
        this.a().unbind();
    }
    
    public final String unblock(final String s) {
        return this.a().unblock(s);
    }
    
    public final String unfollow(final String s) {
        return this.a().unfollow(s);
    }
    
    public final String unmute(final String s) {
        return this.a().unmute(s);
    }
    
    public final String unmuteComment(final Message message, final String s, final String s2) {
        return this.a().unmuteComment(message, s, s2);
    }
    
    public final void updateProfileDescription(final String s) {
        this.a().updateProfileDescription(s);
    }
    
    public final void updateProfileDisplayName(final String s) {
        this.a().updateProfileDisplayName(s);
    }
    
    public final String uploadBroadcasterLogs(final String s, final String s2) {
        return this.a().uploadBroadcasterLogs(s, s2);
    }
    
    public final String userSearch(final String s) {
        return this.a().userSearch(s);
    }
    
    public final String validateUsername(final String s, final String s2, final String s3) {
        return this.a().validateUsername(s, s2, s3);
    }
    
    public final String verifyUsername(final String s, final String s2, final String s3, final String s4, final String s5) {
        return this.a().verifyUsername(s, s2, s3, s4, s5);
    }
    
    public final String vote(final String s, final c$e c$e) {
        return this.a().vote(s, c$e);
    }
}

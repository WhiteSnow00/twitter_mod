// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.model.helpers;

import java.util.Iterator;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier$Companion;
import com.twitter.util.user.UserIdentifier;
import com.twitter.rooms.model.RaisedHand$$serializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import java.util.Objects;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import kotlin.Metadata;

@flp
@Metadata(bv = {}, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0002poB\u00d5\u0001\u0012\u0006\u0010/\u001a\u00020\u0013\u0012\b\b\u0002\u00100\u001a\u00020\u0013\u0012\u0006\u00101\u001a\u00020\u0013\u0012\b\b\u0002\u00102\u001a\u00020\u0004\u0012\u0006\u00103\u001a\u00020\u0013\u0012\u0006\u00104\u001a\u00020\u0019\u0012\b\b\u0002\u00105\u001a\u00020\u0004\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u00107\u001a\u00020\u0004\u0012\u0006\u00108\u001a\u00020\u0013\u0012\u0006\u00109\u001a\u00020\u0013\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010<\u001a\u00020\u0004\u0012\b\b\u0002\u0010=\u001a\u00020$\u0012\b\b\u0002\u0010>\u001a\u00020\u0004\u0012\b\b\u0002\u0010?\u001a\u00020\u0004\u0012\b\b\u0002\u0010@\u001a\u00020\u0004\u0012\b\b\u0002\u0010A\u001a\u00020\u0004\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010-¢\u0006\u0004\bi\u0010jB\u00db\u0001\b\u0017\u0012\u0006\u0010k\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0013\u0012\b\u00100\u001a\u0004\u0018\u00010\u0013\u0012\b\u00101\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u00102\u001a\u00020\u0004\u0012\b\u00103\u001a\u0004\u0018\u00010\u0013\u0012\b\u00104\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u00105\u001a\u00020\u0004\u0012\u0006\u00106\u001a\u00020\u0004\u0012\u0006\u00107\u001a\u00020\u0004\u0012\b\u00108\u001a\u0004\u0018\u00010\u0013\u0012\b\u00109\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010<\u001a\u00020\u0004\u0012\b\u0010=\u001a\u0004\u0018\u00010$\u0012\u0006\u0010>\u001a\u00020\u0004\u0012\u0006\u0010?\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020\u0004\u0012\u0006\u0010A\u001a\u00020\u0004\u0012\b\u0010B\u001a\u0004\u0018\u00010*\u0012\b\u0010C\u001a\u0004\u0018\u00010-\u0012\b\u0010m\u001a\u0004\u0018\u00010l¢\u0006\u0004\bi\u0010nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u00c7\u0001J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0004J\t\u0010\u0014\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0019H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0013H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0013H\u00c6\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\"\u0010!J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010%\u001a\u00020$H\u00c6\u0003J\t\u0010&\u001a\u00020\u0004H\u00c6\u0003J\t\u0010'\u001a\u00020\u0004H\u00c6\u0003J\t\u0010(\u001a\u00020\u0004H\u00c6\u0003J\t\u0010)\u001a\u00020\u0004H\u00c6\u0003J\u0012\u0010+\u001a\u0004\u0018\u00010*H\u00c6\u0003¢\u0006\u0004\b+\u0010,J\u000b\u0010.\u001a\u0004\u0018\u00010-H\u00c6\u0003J\u00ea\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u00020\u00132\b\b\u0002\u00102\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\u00132\b\b\u0002\u00109\u001a\u00020\u00132\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u00042\b\b\u0002\u0010@\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\u00042\n\b\u0002\u0010B\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010-H\u00c6\u0001¢\u0006\u0004\bD\u0010EJ\t\u0010F\u001a\u00020\u0013H\u00d6\u0001J\t\u0010G\u001a\u00020*H\u00d6\u0001J\u0013\u0010I\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010HH\u00d6\u0003R\u0017\u0010/\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b/\u0010J\u001a\u0004\bK\u0010LR\u0017\u00100\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bM\u0010LR\u0017\u00101\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b1\u0010J\u001a\u0004\bN\u0010LR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010O\u001a\u0004\b2\u0010PR\u0017\u00103\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b3\u0010J\u001a\u0004\bQ\u0010LR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010O\u001a\u0004\b5\u0010PR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010O\u001a\u0004\b6\u0010PR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010O\u001a\u0004\b7\u0010PR\u0017\u00108\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b8\u0010J\u001a\u0004\bR\u0010LR\u0017\u00109\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b9\u0010J\u001a\u0004\bS\u0010LR\u0019\u0010:\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010T\u001a\u0004\b:\u0010!R\u0019\u0010;\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010T\u001a\u0004\b;\u0010!R\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010O\u001a\u0004\b<\u0010PR\u0017\u0010=\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b=\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010>\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b>\u0010O\u001a\u0004\b>\u0010PR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010O\u001a\u0004\b?\u0010PR\u0017\u0010@\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\bX\u0010PR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\bA\u0010PR\u0019\u0010B\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\bB\u0010Y\u001a\u0004\bZ\u0010,R\u0019\u0010C\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b\\\u0010]R\u0017\u00104\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b4\u0010^\u001a\u0004\b_\u0010`R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010h\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bf\u0010g¨\u0006q" }, d2 = { "Lcom/twitter/rooms/model/helpers/RoomUserItem;", "Luln;", "Ls21;", "audioSpaceParticipant", "", "isParticipantOfSameUser", "self", "Lxc6;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lfzv;", "write$Self", "", "participants", "updateFromRemote", "other", "isSameUser", "isCohost", "", "component1", "component2", "component3", "component4", "component5", "Lwio;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "Lcom/twitter/rooms/model/RaisedHand;", "component15", "component16", "component17", "component18", "component19", "", "component20", "()Ljava/lang/Integer;", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;", "component21", "twitterUserId", "periscopeUserId", "name", "isTalking", "imageUrl", "userStatus", "isFollowing", "isVerified", "isTwitterBlueVerified", "username", "roomId", "isBlocked", "isLocallyMuted", "isPrimaryAdmin", "raisedHand", "isInvitedToCohost", "isPendingCohost", "userHasNFTAvatar", "isSuperFollowing", "numFollowers", "communityRole", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwio;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLcom/twitter/rooms/model/RaisedHand;ZZZZLjava/lang/Integer;Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;)Lcom/twitter/rooms/model/helpers/RoomUserItem;", "toString", "hashCode", "", "equals", "Ljava/lang/String;", "getTwitterUserId", "()Ljava/lang/String;", "getPeriscopeUserId", "getName", "Z", "()Z", "getImageUrl", "getUsername", "getRoomId", "Ljava/lang/Boolean;", "Lcom/twitter/rooms/model/RaisedHand;", "getRaisedHand", "()Lcom/twitter/rooms/model/RaisedHand;", "getUserHasNFTAvatar", "Ljava/lang/Integer;", "getNumFollowers", "Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;", "getCommunityRole", "()Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;", "Lwio;", "getUserStatus", "()Lwio;", "", "getTwitterUserIdLong", "()J", "twitterUserIdLong", "Lcom/twitter/util/user/UserIdentifier;", "getUserIdentifier", "()Lcom/twitter/util/user/UserIdentifier;", "userIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwio;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLcom/twitter/rooms/model/RaisedHand;ZZZZLjava/lang/Integer;Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;)V", "seen1", "Lhlp;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lwio;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLcom/twitter/rooms/model/RaisedHand;ZZZZLjava/lang/Integer;Lcom/twitter/rooms/model/AudioSpaceCommunityRoleType;Lhlp;)V", "Companion", "$serializer", "subsystem.tfa.rooms.model_release" }, k = 1, mv = { 1, 7, 1 })
public final class RoomUserItem implements uln
{
    public static final RoomUserItem.RoomUserItem$Companion Companion;
    private static final RoomUserItem EMPTY;
    private final AudioSpaceCommunityRoleType communityRole;
    private final String imageUrl;
    private final Boolean isBlocked;
    private final boolean isFollowing;
    private final boolean isInvitedToCohost;
    private final Boolean isLocallyMuted;
    private final boolean isPendingCohost;
    private final boolean isPrimaryAdmin;
    private final boolean isSuperFollowing;
    private final boolean isTalking;
    private final boolean isTwitterBlueVerified;
    private final boolean isVerified;
    private final String name;
    private final Integer numFollowers;
    private final String periscopeUserId;
    private final RaisedHand raisedHand;
    private final String roomId;
    private final String twitterUserId;
    private final boolean userHasNFTAvatar;
    private final wio userStatus;
    private final String username;
    
    static {
        Companion = new RoomUserItem.RoomUserItem$Companion();
        final wio h0 = wio.H0;
        Objects.requireNonNull(RaisedHand.Companion);
        EMPTY = new RoomUserItem("", null, "", false, "", h0, false, false, false, "", "", null, null, false, RaisedHand.access$getDEFAULT$cp(), false, false, false, false, null, null, 1030602, null);
    }
    
    public RoomUserItem(final int n, String s, final String s2, final String name, final boolean isTalking, final String imageUrl, final wio userStatus, final boolean isFollowing, final boolean isVerified, final boolean isTwitterBlueVerified, final String username, final String roomId, final Boolean isBlocked, final Boolean isLocallyMuted, final boolean isPrimaryAdmin, RaisedHand access$getDEFAULT$cp, final boolean isInvitedToCohost, final boolean isPendingCohost, final boolean userHasNFTAvatar, final boolean isSuperFollowing, final Integer numFollowers, final AudioSpaceCommunityRoleType communityRole, final hlp hlp) {
        if (0x635 == (n & 0x635)) {
            this.twitterUserId = s;
            if ((n & 0x2) == 0x0) {
                s = "";
            }
            else {
                s = s2;
            }
            this.periscopeUserId = s;
            this.name = name;
            if ((n & 0x8) == 0x0) {
                this.isTalking = false;
            }
            else {
                this.isTalking = isTalking;
            }
            this.imageUrl = imageUrl;
            this.userStatus = userStatus;
            if ((n & 0x40) == 0x0) {
                this.isFollowing = false;
            }
            else {
                this.isFollowing = isFollowing;
            }
            if ((n & 0x80) == 0x0) {
                this.isVerified = false;
            }
            else {
                this.isVerified = isVerified;
            }
            if ((n & 0x100) == 0x0) {
                this.isTwitterBlueVerified = false;
            }
            else {
                this.isTwitterBlueVerified = isTwitterBlueVerified;
            }
            this.username = username;
            this.roomId = roomId;
            if ((n & 0x800) == 0x0) {
                this.isBlocked = null;
            }
            else {
                this.isBlocked = isBlocked;
            }
            if ((n & 0x1000) == 0x0) {
                this.isLocallyMuted = null;
            }
            else {
                this.isLocallyMuted = isLocallyMuted;
            }
            if ((n & 0x2000) == 0x0) {
                this.isPrimaryAdmin = false;
            }
            else {
                this.isPrimaryAdmin = isPrimaryAdmin;
            }
            if ((n & 0x4000) == 0x0) {
                Objects.requireNonNull(RaisedHand.Companion);
                access$getDEFAULT$cp = RaisedHand.access$getDEFAULT$cp();
            }
            this.raisedHand = access$getDEFAULT$cp;
            if ((0x8000 & n) == 0x0) {
                this.isInvitedToCohost = false;
            }
            else {
                this.isInvitedToCohost = isInvitedToCohost;
            }
            if ((0x10000 & n) == 0x0) {
                this.isPendingCohost = false;
            }
            else {
                this.isPendingCohost = isPendingCohost;
            }
            if ((0x20000 & n) == 0x0) {
                this.userHasNFTAvatar = false;
            }
            else {
                this.userHasNFTAvatar = userHasNFTAvatar;
            }
            if ((0x40000 & n) == 0x0) {
                this.isSuperFollowing = false;
            }
            else {
                this.isSuperFollowing = isSuperFollowing;
            }
            if ((0x80000 & n) == 0x0) {
                this.numFollowers = null;
            }
            else {
                this.numFollowers = numFollowers;
            }
            if ((n & 0x100000) == 0x0) {
                this.communityRole = null;
            }
            else {
                this.communityRole = communityRole;
            }
            return;
        }
        blz.a0(n, 1589, RoomUserItem$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
    
    public RoomUserItem(final String twitterUserId, final String periscopeUserId, final String name, final boolean isTalking, final String imageUrl, final wio userStatus, final boolean isFollowing, final boolean isVerified, final boolean isTwitterBlueVerified, final String username, final String roomId, final Boolean isBlocked, final Boolean isLocallyMuted, final boolean isPrimaryAdmin, final RaisedHand raisedHand, final boolean isInvitedToCohost, final boolean isPendingCohost, final boolean userHasNFTAvatar, final boolean isSuperFollowing, final Integer numFollowers, final AudioSpaceCommunityRoleType communityRole) {
        czd.f((Object)twitterUserId, "twitterUserId");
        czd.f((Object)periscopeUserId, "periscopeUserId");
        czd.f((Object)name, "name");
        czd.f((Object)imageUrl, "imageUrl");
        czd.f((Object)userStatus, "userStatus");
        czd.f((Object)username, "username");
        czd.f((Object)roomId, "roomId");
        czd.f((Object)raisedHand, "raisedHand");
        this.twitterUserId = twitterUserId;
        this.periscopeUserId = periscopeUserId;
        this.name = name;
        this.isTalking = isTalking;
        this.imageUrl = imageUrl;
        this.userStatus = userStatus;
        this.isFollowing = isFollowing;
        this.isVerified = isVerified;
        this.isTwitterBlueVerified = isTwitterBlueVerified;
        this.username = username;
        this.roomId = roomId;
        this.isBlocked = isBlocked;
        this.isLocallyMuted = isLocallyMuted;
        this.isPrimaryAdmin = isPrimaryAdmin;
        this.raisedHand = raisedHand;
        this.isInvitedToCohost = isInvitedToCohost;
        this.isPendingCohost = isPendingCohost;
        this.userHasNFTAvatar = userHasNFTAvatar;
        this.isSuperFollowing = isSuperFollowing;
        this.numFollowers = numFollowers;
        this.communityRole = communityRole;
    }
    
    public RoomUserItem(final String s, String s2, final String s3, boolean b, final String s4, final wio wio, boolean b2, boolean b3, boolean b4, final String s5, final String s6, Boolean b5, Boolean b6, boolean b7, RaisedHand access$getDEFAULT$cp, boolean b8, boolean b9, boolean b10, boolean b11, Integer n, AudioSpaceCommunityRoleType audioSpaceCommunityRoleType, final int n2, final rf8 rf8) {
        if ((n2 & 0x2) != 0x0) {
            s2 = "";
        }
        if ((n2 & 0x8) != 0x0) {
            b = false;
        }
        if ((n2 & 0x40) != 0x0) {
            b2 = false;
        }
        if ((n2 & 0x80) != 0x0) {
            b3 = false;
        }
        if ((n2 & 0x100) != 0x0) {
            b4 = false;
        }
        if ((n2 & 0x800) != 0x0) {
            b5 = null;
        }
        if ((n2 & 0x1000) != 0x0) {
            b6 = null;
        }
        if ((n2 & 0x2000) != 0x0) {
            b7 = false;
        }
        if ((n2 & 0x4000) != 0x0) {
            Objects.requireNonNull(RaisedHand.Companion);
            access$getDEFAULT$cp = RaisedHand.access$getDEFAULT$cp();
        }
        if ((0x8000 & n2) != 0x0) {
            b8 = false;
        }
        if ((0x10000 & n2) != 0x0) {
            b9 = false;
        }
        if ((0x20000 & n2) != 0x0) {
            b10 = false;
        }
        if ((0x40000 & n2) != 0x0) {
            b11 = false;
        }
        if ((0x80000 & n2) != 0x0) {
            n = null;
        }
        if ((n2 & 0x100000) != 0x0) {
            audioSpaceCommunityRoleType = null;
        }
        this(s, s2, s3, b, s4, wio, b2, b3, b4, s5, s6, b5, b6, b7, access$getDEFAULT$cp, b8, b9, b10, b11, n, audioSpaceCommunityRoleType);
    }
    
    public static final RoomUserItem access$getEMPTY$cp() {
        return RoomUserItem.EMPTY;
    }
    
    public static RoomUserItem copy$default(final RoomUserItem roomUserItem, String twitterUserId, String periscopeUserId, String name, boolean isTalking, String imageUrl, wio userStatus, boolean isFollowing, boolean isVerified, boolean isTwitterBlueVerified, String username, String roomId, Boolean isBlocked, Boolean isLocallyMuted, boolean isPrimaryAdmin, RaisedHand raisedHand, boolean isInvitedToCohost, boolean isPendingCohost, boolean userHasNFTAvatar, boolean isSuperFollowing, Integer numFollowers, AudioSpaceCommunityRoleType communityRole, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            twitterUserId = roomUserItem.twitterUserId;
        }
        if ((n & 0x2) != 0x0) {
            periscopeUserId = roomUserItem.periscopeUserId;
        }
        if ((n & 0x4) != 0x0) {
            name = roomUserItem.name;
        }
        if ((n & 0x8) != 0x0) {
            isTalking = roomUserItem.isTalking;
        }
        if ((n & 0x10) != 0x0) {
            imageUrl = roomUserItem.imageUrl;
        }
        if ((n & 0x20) != 0x0) {
            userStatus = roomUserItem.userStatus;
        }
        if ((n & 0x40) != 0x0) {
            isFollowing = roomUserItem.isFollowing;
        }
        if ((n & 0x80) != 0x0) {
            isVerified = roomUserItem.isVerified;
        }
        if ((n & 0x100) != 0x0) {
            isTwitterBlueVerified = roomUserItem.isTwitterBlueVerified;
        }
        if ((n & 0x200) != 0x0) {
            username = roomUserItem.username;
        }
        if ((n & 0x400) != 0x0) {
            roomId = roomUserItem.roomId;
        }
        if ((n & 0x800) != 0x0) {
            isBlocked = roomUserItem.isBlocked;
        }
        if ((n & 0x1000) != 0x0) {
            isLocallyMuted = roomUserItem.isLocallyMuted;
        }
        if ((n & 0x2000) != 0x0) {
            isPrimaryAdmin = roomUserItem.isPrimaryAdmin;
        }
        if ((n & 0x4000) != 0x0) {
            raisedHand = roomUserItem.raisedHand;
        }
        if ((n & 0x8000) != 0x0) {
            isInvitedToCohost = roomUserItem.isInvitedToCohost;
        }
        if ((n & 0x10000) != 0x0) {
            isPendingCohost = roomUserItem.isPendingCohost;
        }
        if ((n & 0x20000) != 0x0) {
            userHasNFTAvatar = roomUserItem.userHasNFTAvatar;
        }
        if ((n & 0x40000) != 0x0) {
            isSuperFollowing = roomUserItem.isSuperFollowing;
        }
        if ((n & 0x80000) != 0x0) {
            numFollowers = roomUserItem.numFollowers;
        }
        if ((n & 0x100000) != 0x0) {
            communityRole = roomUserItem.communityRole;
        }
        return roomUserItem.copy(twitterUserId, periscopeUserId, name, isTalking, imageUrl, userStatus, isFollowing, isVerified, isTwitterBlueVerified, username, roomId, isBlocked, isLocallyMuted, isPrimaryAdmin, raisedHand, isInvitedToCohost, isPendingCohost, userHasNFTAvatar, isSuperFollowing, numFollowers, communityRole);
    }
    
    private final boolean isParticipantOfSameUser(final s21 s21) {
        final boolean a = czd.a((Object)s21.d(), (Object)this.twitterUserId);
        final int length = s21.a.length();
        final boolean b = true;
        final boolean b2 = length > 0 && czd.a((Object)s21.a, (Object)this.periscopeUserId);
        boolean b3 = b;
        if (!a) {
            b3 = (b2 && b);
        }
        return b3;
    }
    
    public static final void write$Self(final RoomUserItem roomUserItem, final xc6 xc6, final SerialDescriptor serialDescriptor) {
        czd.f((Object)roomUserItem, "self");
        czd.f((Object)xc6, "output");
        czd.f((Object)serialDescriptor, "serialDesc");
        final String twitterUserId = roomUserItem.twitterUserId;
        final int n = 0;
        xc6.S(serialDescriptor, 0, twitterUserId);
        boolean b = false;
        Label_0072: {
            if (!xc6.z(serialDescriptor)) {
                if (czd.a((Object)roomUserItem.periscopeUserId, (Object)"")) {
                    b = false;
                    break Label_0072;
                }
            }
            b = true;
        }
        if (b) {
            xc6.S(serialDescriptor, 1, roomUserItem.periscopeUserId);
        }
        xc6.S(serialDescriptor, 2, roomUserItem.name);
        boolean b2 = false;
        Label_0127: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isTalking) {
                    b2 = false;
                    break Label_0127;
                }
            }
            b2 = true;
        }
        if (b2) {
            xc6.R(serialDescriptor, 3, roomUserItem.isTalking);
        }
        xc6.S(serialDescriptor, 4, roomUserItem.imageUrl);
        xc6.T(serialDescriptor, 5, (jlp)new o7a("com.twitter.rooms.model.helpers.RoomUserStatus", (Enum[])wio.values()), (Object)roomUserItem.userStatus);
        boolean b3 = false;
        Label_0207: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isFollowing) {
                    b3 = false;
                    break Label_0207;
                }
            }
            b3 = true;
        }
        if (b3) {
            xc6.R(serialDescriptor, 6, roomUserItem.isFollowing);
        }
        boolean b4 = false;
        Label_0251: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isVerified) {
                    b4 = false;
                    break Label_0251;
                }
            }
            b4 = true;
        }
        if (b4) {
            xc6.R(serialDescriptor, 7, roomUserItem.isVerified);
        }
        boolean b5 = false;
        Label_0295: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isTwitterBlueVerified) {
                    b5 = false;
                    break Label_0295;
                }
            }
            b5 = true;
        }
        if (b5) {
            xc6.R(serialDescriptor, 8, roomUserItem.isTwitterBlueVerified);
        }
        xc6.S(serialDescriptor, 9, roomUserItem.username);
        xc6.S(serialDescriptor, 10, roomUserItem.roomId);
        boolean b6 = false;
        Label_0365: {
            if (!xc6.z(serialDescriptor)) {
                if (roomUserItem.isBlocked == null) {
                    b6 = false;
                    break Label_0365;
                }
            }
            b6 = true;
        }
        if (b6) {
            xc6.y(serialDescriptor, 11, (jlp)d72.a, (Object)roomUserItem.isBlocked);
        }
        boolean b7 = false;
        Label_0412: {
            if (!xc6.z(serialDescriptor)) {
                if (roomUserItem.isLocallyMuted == null) {
                    b7 = false;
                    break Label_0412;
                }
            }
            b7 = true;
        }
        if (b7) {
            xc6.y(serialDescriptor, 12, (jlp)d72.a, (Object)roomUserItem.isLocallyMuted);
        }
        boolean b8 = false;
        Label_0459: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isPrimaryAdmin) {
                    b8 = false;
                    break Label_0459;
                }
            }
            b8 = true;
        }
        if (b8) {
            xc6.R(serialDescriptor, 13, roomUserItem.isPrimaryAdmin);
        }
        boolean b9 = false;
        Label_0520: {
            if (!xc6.z(serialDescriptor)) {
                final RaisedHand raisedHand = roomUserItem.raisedHand;
                Objects.requireNonNull(RaisedHand.Companion);
                if (czd.a((Object)raisedHand, (Object)RaisedHand.access$getDEFAULT$cp())) {
                    b9 = false;
                    break Label_0520;
                }
            }
            b9 = true;
        }
        if (b9) {
            xc6.T(serialDescriptor, 14, (jlp)RaisedHand$$serializer.INSTANCE, (Object)roomUserItem.raisedHand);
        }
        boolean b10 = false;
        Label_0567: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isInvitedToCohost) {
                    b10 = false;
                    break Label_0567;
                }
            }
            b10 = true;
        }
        if (b10) {
            xc6.R(serialDescriptor, 15, roomUserItem.isInvitedToCohost);
        }
        boolean b11 = false;
        Label_0611: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isPendingCohost) {
                    b11 = false;
                    break Label_0611;
                }
            }
            b11 = true;
        }
        if (b11) {
            xc6.R(serialDescriptor, 16, roomUserItem.isPendingCohost);
        }
        boolean b12 = false;
        Label_0655: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.userHasNFTAvatar) {
                    b12 = false;
                    break Label_0655;
                }
            }
            b12 = true;
        }
        if (b12) {
            xc6.R(serialDescriptor, 17, roomUserItem.userHasNFTAvatar);
        }
        boolean b13 = false;
        Label_0699: {
            if (!xc6.z(serialDescriptor)) {
                if (!roomUserItem.isSuperFollowing) {
                    b13 = false;
                    break Label_0699;
                }
            }
            b13 = true;
        }
        if (b13) {
            xc6.R(serialDescriptor, 18, roomUserItem.isSuperFollowing);
        }
        boolean b14 = false;
        Label_0743: {
            if (!xc6.z(serialDescriptor)) {
                if (roomUserItem.numFollowers == null) {
                    b14 = false;
                    break Label_0743;
                }
            }
            b14 = true;
        }
        if (b14) {
            xc6.y(serialDescriptor, 19, (jlp)ktd.a, (Object)roomUserItem.numFollowers);
        }
        int n2 = 0;
        Label_0788: {
            if (!xc6.z(serialDescriptor)) {
                n2 = n;
                if (roomUserItem.communityRole == null) {
                    break Label_0788;
                }
            }
            n2 = 1;
        }
        if (n2 != 0) {
            xc6.y(serialDescriptor, 20, (jlp)AudioSpaceCommunityRoleType.Companion.serializer(), (Object)roomUserItem.communityRole);
        }
    }
    
    public final String component1() {
        return this.twitterUserId;
    }
    
    public final String component10() {
        return this.username;
    }
    
    public final String component11() {
        return this.roomId;
    }
    
    public final Boolean component12() {
        return this.isBlocked;
    }
    
    public final Boolean component13() {
        return this.isLocallyMuted;
    }
    
    public final boolean component14() {
        return this.isPrimaryAdmin;
    }
    
    public final RaisedHand component15() {
        return this.raisedHand;
    }
    
    public final boolean component16() {
        return this.isInvitedToCohost;
    }
    
    public final boolean component17() {
        return this.isPendingCohost;
    }
    
    public final boolean component18() {
        return this.userHasNFTAvatar;
    }
    
    public final boolean component19() {
        return this.isSuperFollowing;
    }
    
    public final String component2() {
        return this.periscopeUserId;
    }
    
    public final Integer component20() {
        return this.numFollowers;
    }
    
    public final AudioSpaceCommunityRoleType component21() {
        return this.communityRole;
    }
    
    public final String component3() {
        return this.name;
    }
    
    public final boolean component4() {
        return this.isTalking;
    }
    
    public final String component5() {
        return this.imageUrl;
    }
    
    public final wio component6() {
        return this.userStatus;
    }
    
    public final boolean component7() {
        return this.isFollowing;
    }
    
    public final boolean component8() {
        return this.isVerified;
    }
    
    public final boolean component9() {
        return this.isTwitterBlueVerified;
    }
    
    public final RoomUserItem copy(final String s, final String s2, final String s3, final boolean b, final String s4, final wio wio, final boolean b2, final boolean b3, final boolean b4, final String s5, final String s6, final Boolean b5, final Boolean b6, final boolean b7, final RaisedHand raisedHand, final boolean b8, final boolean b9, final boolean b10, final boolean b11, final Integer n, final AudioSpaceCommunityRoleType audioSpaceCommunityRoleType) {
        czd.f((Object)s, "twitterUserId");
        czd.f((Object)s2, "periscopeUserId");
        czd.f((Object)s3, "name");
        czd.f((Object)s4, "imageUrl");
        czd.f((Object)wio, "userStatus");
        czd.f((Object)s5, "username");
        czd.f((Object)s6, "roomId");
        czd.f((Object)raisedHand, "raisedHand");
        return new RoomUserItem(s, s2, s3, b, s4, wio, b2, b3, b4, s5, s6, b5, b6, b7, raisedHand, b8, b9, b10, b11, n, audioSpaceCommunityRoleType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoomUserItem)) {
            return false;
        }
        final RoomUserItem roomUserItem = (RoomUserItem)o;
        return czd.a((Object)this.twitterUserId, (Object)roomUserItem.twitterUserId) && czd.a((Object)this.periscopeUserId, (Object)roomUserItem.periscopeUserId) && czd.a((Object)this.name, (Object)roomUserItem.name) && this.isTalking == roomUserItem.isTalking && czd.a((Object)this.imageUrl, (Object)roomUserItem.imageUrl) && this.userStatus == roomUserItem.userStatus && this.isFollowing == roomUserItem.isFollowing && this.isVerified == roomUserItem.isVerified && this.isTwitterBlueVerified == roomUserItem.isTwitterBlueVerified && czd.a((Object)this.username, (Object)roomUserItem.username) && czd.a((Object)this.roomId, (Object)roomUserItem.roomId) && czd.a((Object)this.isBlocked, (Object)roomUserItem.isBlocked) && czd.a((Object)this.isLocallyMuted, (Object)roomUserItem.isLocallyMuted) && this.isPrimaryAdmin == roomUserItem.isPrimaryAdmin && czd.a((Object)this.raisedHand, (Object)roomUserItem.raisedHand) && this.isInvitedToCohost == roomUserItem.isInvitedToCohost && this.isPendingCohost == roomUserItem.isPendingCohost && this.userHasNFTAvatar == roomUserItem.userHasNFTAvatar && this.isSuperFollowing == roomUserItem.isSuperFollowing && czd.a((Object)this.numFollowers, (Object)roomUserItem.numFollowers) && czd.a((Object)this.communityRole, (Object)roomUserItem.communityRole);
    }
    
    public final AudioSpaceCommunityRoleType getCommunityRole() {
        return this.communityRole;
    }
    
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final Integer getNumFollowers() {
        return this.numFollowers;
    }
    
    public final String getPeriscopeUserId() {
        return this.periscopeUserId;
    }
    
    public final RaisedHand getRaisedHand() {
        return this.raisedHand;
    }
    
    public final String getRoomId() {
        return this.roomId;
    }
    
    public final String getTwitterUserId() {
        return this.twitterUserId;
    }
    
    public final long getTwitterUserIdLong() {
        return Long.parseLong(this.twitterUserId);
    }
    
    public final boolean getUserHasNFTAvatar() {
        return this.userHasNFTAvatar;
    }
    
    public final UserIdentifier getUserIdentifier() {
        return UserIdentifier$Companion.f(UserIdentifier.Companion, this.twitterUserId);
    }
    
    public final wio getUserStatus() {
        return this.userStatus;
    }
    
    public final String getUsername() {
        return this.username;
    }
    
    @Override
    public int hashCode() {
        final int f = hmg.f(this.name, hmg.f(this.periscopeUserId, this.twitterUserId.hashCode() * 31, 31), 31);
        final int isTalking = this.isTalking ? 1 : 0;
        int n = 1;
        int n2 = isTalking;
        if (isTalking != 0) {
            n2 = 1;
        }
        final int f2 = hmg.f(this.imageUrl, (f + n2) * 31, 31);
        final int hashCode = this.userStatus.hashCode();
        int isFollowing;
        if ((isFollowing = (this.isFollowing ? 1 : 0)) != 0) {
            isFollowing = 1;
        }
        int isVerified;
        if ((isVerified = (this.isVerified ? 1 : 0)) != 0) {
            isVerified = 1;
        }
        int isTwitterBlueVerified;
        if ((isTwitterBlueVerified = (this.isTwitterBlueVerified ? 1 : 0)) != 0) {
            isTwitterBlueVerified = 1;
        }
        final int f3 = hmg.f(this.roomId, hmg.f(this.username, ((((hashCode + f2) * 31 + isFollowing) * 31 + isVerified) * 31 + isTwitterBlueVerified) * 31, 31), 31);
        final Boolean isBlocked = this.isBlocked;
        int hashCode2 = 0;
        int hashCode3;
        if (isBlocked == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = isBlocked.hashCode();
        }
        final Boolean isLocallyMuted = this.isLocallyMuted;
        int hashCode4;
        if (isLocallyMuted == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = isLocallyMuted.hashCode();
        }
        int isPrimaryAdmin;
        if ((isPrimaryAdmin = (this.isPrimaryAdmin ? 1 : 0)) != 0) {
            isPrimaryAdmin = 1;
        }
        final int hashCode5 = this.raisedHand.hashCode();
        int isInvitedToCohost;
        if ((isInvitedToCohost = (this.isInvitedToCohost ? 1 : 0)) != 0) {
            isInvitedToCohost = 1;
        }
        int isPendingCohost;
        if ((isPendingCohost = (this.isPendingCohost ? 1 : 0)) != 0) {
            isPendingCohost = 1;
        }
        int userHasNFTAvatar;
        if ((userHasNFTAvatar = (this.userHasNFTAvatar ? 1 : 0)) != 0) {
            userHasNFTAvatar = 1;
        }
        final int isSuperFollowing = this.isSuperFollowing ? 1 : 0;
        if (isSuperFollowing == 0) {
            n = isSuperFollowing;
        }
        final Integer numFollowers = this.numFollowers;
        int hashCode6;
        if (numFollowers == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = numFollowers.hashCode();
        }
        final AudioSpaceCommunityRoleType communityRole = this.communityRole;
        if (communityRole != null) {
            hashCode2 = communityRole.hashCode();
        }
        return ((((((hashCode5 + (((f3 + hashCode3) * 31 + hashCode4) * 31 + isPrimaryAdmin) * 31) * 31 + isInvitedToCohost) * 31 + isPendingCohost) * 31 + userHasNFTAvatar) * 31 + n) * 31 + hashCode6) * 31 + hashCode2;
    }
    
    public final Boolean isBlocked() {
        return this.isBlocked;
    }
    
    public final boolean isCohost() {
        return !this.isPrimaryAdmin && this.userStatus == wio.D0;
    }
    
    public final boolean isFollowing() {
        return this.isFollowing;
    }
    
    public final boolean isInvitedToCohost() {
        return this.isInvitedToCohost;
    }
    
    public final Boolean isLocallyMuted() {
        return this.isLocallyMuted;
    }
    
    public final boolean isPendingCohost() {
        return this.isPendingCohost;
    }
    
    public final boolean isPrimaryAdmin() {
        return this.isPrimaryAdmin;
    }
    
    public final boolean isSameUser(final RoomUserItem roomUserItem) {
        czd.f((Object)roomUserItem, "other");
        final boolean a = czd.a((Object)roomUserItem.twitterUserId, (Object)this.twitterUserId);
        final int length = roomUserItem.periscopeUserId.length();
        final boolean b = true;
        final boolean b2 = length > 0 && czd.a((Object)roomUserItem.periscopeUserId, (Object)this.periscopeUserId);
        boolean b3 = b;
        if (!a) {
            b3 = (b2 && b);
        }
        return b3;
    }
    
    public final boolean isSuperFollowing() {
        return this.isSuperFollowing;
    }
    
    public final boolean isTalking() {
        return this.isTalking;
    }
    
    public final boolean isTwitterBlueVerified() {
        return this.isTwitterBlueVerified;
    }
    
    public final boolean isVerified() {
        return this.isVerified;
    }
    
    @Override
    public String toString() {
        final String twitterUserId = this.twitterUserId;
        final String periscopeUserId = this.periscopeUserId;
        final String name = this.name;
        final boolean isTalking = this.isTalking;
        final String imageUrl = this.imageUrl;
        final wio userStatus = this.userStatus;
        final boolean isFollowing = this.isFollowing;
        final boolean isVerified = this.isVerified;
        final boolean isTwitterBlueVerified = this.isTwitterBlueVerified;
        final String username = this.username;
        final String roomId = this.roomId;
        final Boolean isBlocked = this.isBlocked;
        final Boolean isLocallyMuted = this.isLocallyMuted;
        final boolean isPrimaryAdmin = this.isPrimaryAdmin;
        final RaisedHand raisedHand = this.raisedHand;
        final boolean isInvitedToCohost = this.isInvitedToCohost;
        final boolean isPendingCohost = this.isPendingCohost;
        final boolean userHasNFTAvatar = this.userHasNFTAvatar;
        final boolean isSuperFollowing = this.isSuperFollowing;
        final Integer numFollowers = this.numFollowers;
        final AudioSpaceCommunityRoleType communityRole = this.communityRole;
        final StringBuilder q = tqf.q("RoomUserItem(twitterUserId=", twitterUserId, ", periscopeUserId=", periscopeUserId, ", name=");
        bo1.A(q, name, ", isTalking=", isTalking, ", imageUrl=");
        q.append(imageUrl);
        q.append(", userStatus=");
        q.append(userStatus);
        q.append(", isFollowing=");
        jg9.u(q, isFollowing, ", isVerified=", isVerified, ", isTwitterBlueVerified=");
        mw.C(q, isTwitterBlueVerified, ", username=", username, ", roomId=");
        q.append(roomId);
        q.append(", isBlocked=");
        q.append(isBlocked);
        q.append(", isLocallyMuted=");
        q.append(isLocallyMuted);
        q.append(", isPrimaryAdmin=");
        q.append(isPrimaryAdmin);
        q.append(", raisedHand=");
        q.append(raisedHand);
        q.append(", isInvitedToCohost=");
        q.append(isInvitedToCohost);
        q.append(", isPendingCohost=");
        jg9.u(q, isPendingCohost, ", userHasNFTAvatar=", userHasNFTAvatar, ", isSuperFollowing=");
        q.append(isSuperFollowing);
        q.append(", numFollowers=");
        q.append(numFollowers);
        q.append(", communityRole=");
        q.append(communityRole);
        q.append(")");
        return q.toString();
    }
    
    public final RoomUserItem updateFromRemote(final Collection<s21> collection) {
        czd.f((Object)collection, "participants");
        final Iterator<Object> iterator = collection.iterator();
        while (true) {
            s21 next;
            do {
                final boolean hasNext = iterator.hasNext();
                Integer value = null;
                if (hasNext) {
                    next = iterator.next();
                }
                else {
                    next = null;
                    final s21 s21 = next;
                    if (s21 == null) {
                        return this;
                    }
                    final String d = s21.d();
                    final String a = s21.a;
                    final String c = s21.c();
                    final String b = s21.b();
                    final boolean g = s21.g;
                    final boolean h = s21.h();
                    final boolean g2 = s21.g();
                    final RaisedHand h2 = s21.h;
                    final Boolean isLocallyMuted = this.isLocallyMuted;
                    boolean booleanValue;
                    if (isLocallyMuted != null) {
                        booleanValue = isLocallyMuted;
                    }
                    else {
                        booleanValue = (s21.c || s21.b);
                    }
                    final cgv e = s21.e();
                    Boolean b2;
                    if (e == null || (b2 = e.B1) == null) {
                        b2 = Boolean.FALSE;
                    }
                    final cgv e2 = s21.e();
                    Boolean value2;
                    if (e2 != null) {
                        value2 = chw.Y(e2.I1);
                    }
                    else {
                        value2 = null;
                    }
                    final cgv e3 = s21.e();
                    final boolean b3 = e3 != null && chw.p0(e3.I1);
                    final cgv e4 = s21.e();
                    if (e4 != null) {
                        value = e4.L1;
                    }
                    return copy$default(this, d, a, c, false, b, null, g, h, g2, null, null, value2, booleanValue, false, h2, false, false, b2, b3, value, s21.f, 108072, null);
                }
            } while (!this.isParticipantOfSameUser(next));
            continue;
        }
    }
}

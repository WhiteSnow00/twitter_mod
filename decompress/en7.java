// 
// Decompiled by Procyon v0.6.0
// 

public enum en7
{
    public static final a Companion;
    
    E0("MessageCreate"), 
    F0("UNKNOWN__");
    
    public static final en7[] G0;
    public final String D0;
    
    static {
        Companion = new a();
        s9i.s("ConversationAvatarUpdate", "ConversationCreate", "ConversationMetadataUpdate", "ConversationMuted", "ConversationNameUpdate", "ConversationUnmuted", "ConvoMetadataUpdate", "CsFeedbackDismissed", "CsFeedbackSubmitted", "DmSubscriptionCreate", "DmSubscriptionDelete", "JoinConversation", "LastMessageReadUpdate", "LeaveConversation", "MarkAllAsRead", "MentionNotificationsSettingUpdate", "MessageCreate", "MessageDelete", "MessageHide", "MessageMarkAsSpam", "MessageUnmarkAsSpam", "MessagesMarkAsReported", "ParticipantIdentityChange", "ParticipantsJoin", "ParticipantsLeave", "ReactionCreate", "ReactionDelete", "TrustConversation", "TweetInject", "Unknown", "UserConvoMetadataUpdate", "UserMessageUnmarkAsSpam", "WelcomeMessageCreate");
    }
    
    public en7(final String d0) {
        this.D0 = d0;
    }
    
    public static final class a
    {
    }
}

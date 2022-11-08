// 
// Decompiled by Procyon v0.6.0
// 

public enum xn7
{
    public static final a Companion;
    
    D0("MessageCreate"), 
    E0("UNKNOWN__");
    
    public final String C0;
    
    static {
        Companion = new a();
        tdy.v0((Object[])new String[] { "ConversationAvatarUpdate", "ConversationCreate", "ConversationMetadataUpdate", "ConversationMuted", "ConversationNameUpdate", "ConversationUnmuted", "ConvoMetadataUpdate", "CsFeedbackDismissed", "CsFeedbackSubmitted", "DmSubscriptionCreate", "DmSubscriptionDelete", "JoinConversation", "LastMessageReadUpdate", "LeaveConversation", "MarkAllAsRead", "MentionNotificationsSettingUpdate", "MessageCreate", "MessageDelete", "MessageHide", "MessageMarkAsSpam", "MessageUnmarkAsSpam", "MessagesMarkAsReported", "ParticipantIdentityChange", "ParticipantsJoin", "ParticipantsLeave", "ReactionCreate", "ReactionDelete", "TrustConversation", "TweetInject", "Unknown", "UserConvoMetadataUpdate", "UserMessageUnmarkAsSpam", "WelcomeMessageCreate" });
    }
    
    public xn7(final String c0) {
        this.C0 = c0;
    }
    
    public static final class a
    {
    }
}

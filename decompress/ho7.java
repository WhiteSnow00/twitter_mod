// 
// Decompiled by Procyon v0.6.0
// 

public enum ho7
{
    public static final a Companion;
    
    G0("MessageCreate"), 
    H0("UNKNOWN__");
    
    public static final ho7[] I0;
    public final String F0;
    
    static {
        Companion = new a();
        shw.y0((Object[])new String[] { "ConversationAvatarUpdate", "ConversationCreate", "ConversationMetadataUpdate", "ConversationMuted", "ConversationNameUpdate", "ConversationUnmuted", "ConvoMetadataUpdate", "CsFeedbackDismissed", "CsFeedbackSubmitted", "DmSubscriptionCreate", "DmSubscriptionDelete", "JoinConversation", "LastMessageReadUpdate", "LeaveConversation", "MarkAllAsRead", "MentionNotificationsSettingUpdate", "MessageCreate", "MessageDelete", "MessageHide", "MessageMarkAsSpam", "MessageUnmarkAsSpam", "MessagesMarkAsReported", "ParticipantIdentityChange", "ParticipantsJoin", "ParticipantsLeave", "ReactionCreate", "ReactionDelete", "TrustConversation", "TweetInject", "Unknown", "UserConvoMetadataUpdate", "UserMessageUnmarkAsSpam", "WelcomeMessageCreate" });
    }
    
    public ho7(final String f0) {
        this.F0 = f0;
    }
    
    public static final class a
    {
    }
}

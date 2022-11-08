import com.bluelinelabs.logansquare.typeconverters.TypeConverter;
import com.twitter.dm.json.quickreplies.JsonDMQuickReplyOption;
import com.twitter.dm.json.quickreplies.JsonDMQuickReplyConfig;
import com.twitter.dm.json.ctas.JsonDMCtas;
import com.twitter.dm.json.JsonUpdateConversationMetadataEvent;
import com.twitter.dm.json.JsonTrustConversationEvent;
import com.twitter.dm.json.JsonReactionMessageEntry;
import com.twitter.dm.json.JsonDMPermissionsInfo;
import com.twitter.dm.json.JsonParticipant;
import com.twitter.dm.json.JsonConversationMetadataUpdates;
import com.twitter.dm.json.JsonMessageCreateInfo;
import com.twitter.dm.json.JsonInboxTimeline;
import com.twitter.dm.json.JsonEducationFlag;
import com.twitter.dm.json.JsonDeleteConversationEvent;
import com.twitter.dm.json.JsonDMPermission;
import com.twitter.dm.json.JsonDMJapanEducationFlagList;
import com.twitter.dm.json.JsonDMConversationLabelsResponse;
import com.twitter.dm.json.JsonDMConversationLabelResultUnavailable;
import com.twitter.dm.json.JsonDMConversationLabelInfo;
import com.twitter.dm.json.JsonDMConversationLabel;
import com.twitter.dm.json.JsonDMAgentProfile;
import com.twitter.dm.json.JsonDMAddConversationLabelResponse;
import com.twitter.dm.json.JsonConversationCreateEvent;
import com.twitter.dm.json.JsonConversationSocialProof;
import com.twitter.dm.json.JsonConversationInfo;
import com.twitter.dm.json.JsonConversationContext;
import com.twitter.model.json.common.JsonModelRegistry$a;
import com.twitter.model.json.common.JsonModelRegistry;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gr7 implements Registrar
{
    @Override
    public final void a(final b b) {
        final JsonModelRegistry$a jsonModelRegistry$a = (JsonModelRegistry$a)b;
        jsonModelRegistry$a.b((Class)zq6.class, (Class)JsonConversationContext.class, (bra)null);
        jsonModelRegistry$a.b((Class)gt6.class, (Class)JsonConversationInfo.class, (bra)null);
        jsonModelRegistry$a.a((Class)gt6.a.class, (Class)JsonConversationInfo.class);
        jsonModelRegistry$a.b((Class)fu6.class, (Class)JsonConversationSocialProof.class, (bra)null);
        jsonModelRegistry$a.b((Class)r37.class, (Class)JsonConversationCreateEvent.class, (bra)null);
        jsonModelRegistry$a.b((Class)tf7.class, (Class)JsonDMAddConversationLabelResponse.class, (bra)null);
        jsonModelRegistry$a.b((Class)vf7.class, (Class)JsonDMAgentProfile.class, (bra)null);
        jsonModelRegistry$a.a((Class)vf7$a.class, (Class)JsonDMAgentProfile.class);
        jsonModelRegistry$a.b((Class)lk7.class, (Class)JsonDMConversationLabel.class, (bra)null);
        jsonModelRegistry$a.b((Class)lk7.a.class, (Class)JsonDMConversationLabelInfo.class, (bra)null);
        jsonModelRegistry$a.b((Class)dl7.class, (Class)JsonDMConversationLabelResultUnavailable.class, (bra)null);
        jsonModelRegistry$a.b((Class)jl7.class, (Class)JsonDMConversationLabelsResponse.class, (bra)null);
        jsonModelRegistry$a.b((Class)cr7.class, (Class)JsonDMJapanEducationFlagList.class, (bra)null);
        jsonModelRegistry$a.b((Class)ys7.class, (Class)JsonDMPermission.class, (bra)null);
        jsonModelRegistry$a.b((Class)mn8.class, (Class)JsonDeleteConversationEvent.class, (bra)null);
        jsonModelRegistry$a.b((Class)ux9.class, (Class)JsonEducationFlag.class, (bra)null);
        jsonModelRegistry$a.b((Class)akd.class, (Class)JsonInboxTimeline.class, (bra)null);
        jsonModelRegistry$a.a((Class)akd.a.class, (Class)JsonInboxTimeline.class);
        jsonModelRegistry$a.b((Class)n6h.class, (Class)JsonMessageCreateInfo.class, (bra)null);
        jsonModelRegistry$a.b((Class)r9h.class, (Class)JsonConversationMetadataUpdates.class, (bra)null);
        jsonModelRegistry$a.b((Class)zwj.class, (Class)JsonParticipant.class, (bra)null);
        jsonModelRegistry$a.a((Class)zwj$b.class, (Class)JsonParticipant.class);
        jsonModelRegistry$a.b((Class)a7k.class, (Class)JsonDMPermissionsInfo.class, (bra)null);
        jsonModelRegistry$a.b((Class)uxl.class, (Class)JsonReactionMessageEntry.class, (bra)null);
        jsonModelRegistry$a.b((Class)s3u.class, (Class)JsonTrustConversationEvent.class, (bra)null);
        jsonModelRegistry$a.b((Class)a2w.class, (Class)JsonUpdateConversationMetadataEvent.class, (bra)null);
        jsonModelRegistry$a.b((Class)jk1.class, (Class)JsonDMCtas.class, (bra)null);
        jsonModelRegistry$a.b((Class)mk1.class, (Class)JsonDMQuickReplyConfig.class, (bra)null);
        jsonModelRegistry$a.b((Class)ft7.class, (Class)JsonDMQuickReplyOption.class, (bra)null);
        jsonModelRegistry$a.a((Class)ft7.a.class, (Class)JsonDMQuickReplyOption.class);
        jsonModelRegistry$a.c((Class)pr.class, (TypeConverter)new ade());
        jsonModelRegistry$a.c((Class)rs6.class, (TypeConverter)new bee());
        jsonModelRegistry$a.c((Class)us6.class, (TypeConverter)new aee());
        jsonModelRegistry$a.c((Class)x47.class, (TypeConverter)new dee());
        jsonModelRegistry$a.c((Class)bl7.class, (TypeConverter)new jee());
        jsonModelRegistry$a.c((Class)tei.class, (TypeConverter)new rge());
        jsonModelRegistry$a.c((Class)pnx.class, (TypeConverter)new lle());
        jsonModelRegistry$a.c((Class)gk1.class, (TypeConverter)new hde());
        jsonModelRegistry$a.c((Class)xg7.class, (TypeConverter)new iee());
    }
}
